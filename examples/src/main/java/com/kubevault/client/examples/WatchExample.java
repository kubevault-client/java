package com.kubevault.client.examples;

import com.google.gson.reflect.TypeToken;
import com.kubevault.client.ApiClient;
import com.kubevault.client.ApiException;
import com.kubevault.client.Configuration;
import com.kubevault.client.apis.CoreKubevaultComV1alpha1Api;
import com.kubevault.client.models.V1alpha1VaultServer;
import com.kubevault.client.util.Config;
import com.kubevault.client.util.Watch;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/** A simple example of how to use Watch API to watch changes in VaultServer list. */
public class WatchExample {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    client.getHttpClient().setReadTimeout(60, TimeUnit.SECONDS);
    Configuration.setDefaultApiClient(client);

    CoreKubevaultComV1alpha1Api api = new CoreKubevaultComV1alpha1Api();

    Watch<V1alpha1VaultServer> watch =
        Watch.createWatch(
            client,
            api.listVaultServerForAllNamespacesCall(
                null, null, null, null, null, "false", null, null, Boolean.TRUE, null, null),
            new TypeToken<Watch.Response<V1alpha1VaultServer>>() {}.getType());

    for (Watch.Response<V1alpha1VaultServer> item : watch) {
      System.out.printf("%s : %s%n", item.type, item.object.getMetadata().getName());
    }
  }
}
