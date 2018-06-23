/*
 * KubeVault
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.1.0
 * Contact: kubevault@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kubevault.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComGithubKubevaultOperatorApisCoreV1alpha1StaticTLS
 */

public class ComGithubKubevaultOperatorApisCoreV1alpha1StaticTLS {
  @SerializedName("clientSecret")
  private String clientSecret = null;

  @SerializedName("serverSecret")
  private String serverSecret = null;

  public ComGithubKubevaultOperatorApisCoreV1alpha1StaticTLS clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * ClientSecret is the secret containing the CA certificate that will be used to verify the above server certificate The ca secret should contain one file: vault-client-ca.crt
   * @return clientSecret
  **/
  @ApiModelProperty(value = "ClientSecret is the secret containing the CA certificate that will be used to verify the above server certificate The ca secret should contain one file: vault-client-ca.crt")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public ComGithubKubevaultOperatorApisCoreV1alpha1StaticTLS serverSecret(String serverSecret) {
    this.serverSecret = serverSecret;
    return this;
  }

   /**
   * ServerSecret is the secret containing TLS certs used by each vault node for the communication between the vault server and its clients. The server secret should contain two files: server.crt and server.key The server.crt file should only contain the server certificate. It should not be concatenated with the optional ca certificate as allowed by https://www.vaultproject.io/docs/configuration/listener/tcp.html#tls_cert_file The server certificate must allow the following wildcard domains: localhost *.&lt;namespace&gt;.pod &lt;vault-cluster-name&gt;.&lt;namespace&gt;.svc
   * @return serverSecret
  **/
  @ApiModelProperty(value = "ServerSecret is the secret containing TLS certs used by each vault node for the communication between the vault server and its clients. The server secret should contain two files: server.crt and server.key The server.crt file should only contain the server certificate. It should not be concatenated with the optional ca certificate as allowed by https://www.vaultproject.io/docs/configuration/listener/tcp.html#tls_cert_file The server certificate must allow the following wildcard domains: localhost *.<namespace>.pod <vault-cluster-name>.<namespace>.svc")
  public String getServerSecret() {
    return serverSecret;
  }

  public void setServerSecret(String serverSecret) {
    this.serverSecret = serverSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubKubevaultOperatorApisCoreV1alpha1StaticTLS comGithubKubevaultOperatorApisCoreV1alpha1StaticTLS = (ComGithubKubevaultOperatorApisCoreV1alpha1StaticTLS) o;
    return Objects.equals(this.clientSecret, comGithubKubevaultOperatorApisCoreV1alpha1StaticTLS.clientSecret) &&
        Objects.equals(this.serverSecret, comGithubKubevaultOperatorApisCoreV1alpha1StaticTLS.serverSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSecret, serverSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComGithubKubevaultOperatorApisCoreV1alpha1StaticTLS {\n");
    
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    serverSecret: ").append(toIndentedString(serverSecret)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

