package com.kubevault.client.examples;

import com.kubevault.client.ApiClient;
import com.kubevault.client.ApiException;
import com.kubevault.client.Configuration;
import com.kubevault.client.apis.CoreKubevaultComV1alpha1Api;
import com.kubevault.client.models.V1alpha1VaultServer;
import com.kubevault.client.models.V1alpha1VaultServerList;
import com.kubevault.client.util.Config;
import java.io.IOException;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java -Dexec.mainClass="Example"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class Example {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    CoreKubevaultComV1alpha1Api api = new CoreKubevaultComV1alpha1Api();
    V1alpha1VaultServerList list =
        api.listVaultServerForAllNamespaces(null, null, null, null, null, null, null, null, null);
    for (V1alpha1VaultServer item : list.getItems()) {
      System.out.println(item.getMetadata().getName());
    }
  }
}
