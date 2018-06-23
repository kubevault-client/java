
# V1alpha1StaticTLS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientSecret** | **String** | ClientSecret is the secret containing the CA certificate that will be used to verify the above server certificate The ca secret should contain one file: vault-client-ca.crt |  [optional]
**serverSecret** | **String** | ServerSecret is the secret containing TLS certs used by each vault node for the communication between the vault server and its clients. The server secret should contain two files: server.crt and server.key The server.crt file should only contain the server certificate. It should not be concatenated with the optional ca certificate as allowed by https://www.vaultproject.io/docs/configuration/listener/tcp.html#tls_cert_file The server certificate must allow the following wildcard domains: localhost *.&lt;namespace&gt;.pod &lt;vault-cluster-name&gt;.&lt;namespace&gt;.svc |  [optional]



