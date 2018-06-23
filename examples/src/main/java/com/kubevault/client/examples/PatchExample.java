package com.kubevault.client.examples;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kubevault.client.ApiClient;
import com.kubevault.client.ApiException;
import com.kubevault.client.Configuration;
import com.kubevault.client.apis.CoreKubevaultComV1alpha1Api;
import com.kubevault.client.models.V1alpha1VaultServer;
import com.kubevault.client.util.ClientBuilder;
import java.io.IOException;
import java.util.ArrayList;

/**
 * A simple Example of how to use the Java API.<br>
 * This example demonstrates patching of VaultServer using Json Patch.<br>
 * For generating Json Patches, refer <a href="http://jsonpatch.com/">http://jsonpatch.com</a>.
 *
 * <ul>
 *   <li>Creates VaultServer VaultServer-quickstart with <b>spec.doNotPause</b> value as true.
 *   <li>Patches VaultServer VaultServer-quickstart with <b>spec.doNotPause</b> value as false.
 * </ul>
 *
 * <p>Easiest way to run this: mvn exec:java -Dexec.mainClass="PatchExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class PatchExample {
  static String jsonPatchStr = "{\"op\":\"replace\",\"path\":\"/spec/doNotPause\",\"value\":false}";
  static String jsonDepStr =
      "{\"apiVersion\":\"kubevault.com/v1alpha1\",\"kind\":\"VaultServer\",\"metadata\":{\"name\":\"VaultServer-quickstart\",\"namespace\":\"default\"},\"spec\":{\"version\":\"4\",\"doNotPause\":true,\"storage\":{\"storageClassName\":\"standard\",\"accessModes\":[\"ReadWriteOnce\"],\"resources\":{\"requests\":{\"storage\":\"50Mi\"}}}}}";

  public static void main(String[] args) throws IOException, ApiException {
    PatchExample example = new PatchExample();
    ApiClient client = ClientBuilder.defaultClient();
    Configuration.setDefaultApiClient(client);

    V1alpha1VaultServer body =
        (V1alpha1VaultServer) example.deserialize(jsonDepStr, V1alpha1VaultServer.class);
    V1alpha1VaultServer deploy1 = example.createVaultServer("default", body, "false");
    System.out.println("original VaultServer" + deploy1);

    ArrayList<JsonObject> arr = new ArrayList<>();
    arr.add(((JsonElement) example.deserialize(jsonPatchStr, JsonElement.class)).getAsJsonObject());
    V1alpha1VaultServer deploy2 =
        example.PatchVaultServer("VaultServer-quickstart", "default", arr, "false");
    System.out.println("patched VaultServer" + deploy2);
  }

  public V1alpha1VaultServer createVaultServer(
      String namespace, V1alpha1VaultServer body, String pretty) throws ApiException {
    CoreKubevaultComV1alpha1Api api = new CoreKubevaultComV1alpha1Api();
    V1alpha1VaultServer deploy = api.createNamespacedVaultServer(namespace, body, pretty);
    return deploy;
  }

  public V1alpha1VaultServer PatchVaultServer(
      String deployName, String namespace, Object body, String pretty) throws ApiException {
    CoreKubevaultComV1alpha1Api api = new CoreKubevaultComV1alpha1Api();
    V1alpha1VaultServer deploy =
        api.patchNamespacedVaultServer(deployName, namespace, body, pretty);
    return deploy;
  }

  public Object deserialize(String jsonStr, Class<?> targetClass) {
    Object obj = (new Gson()).fromJson(jsonStr, targetClass);
    return obj;
  }
}
