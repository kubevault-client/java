
# V1alpha1EtcdSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | Specifies the addresses of the etcd instances |  [optional]
**credentialSecretName** | **String** | Specifies the secret name that contain username and password to use when authenticating with the etcd server |  [optional]
**discoverySrv** | **String** | Specifies the domain name to query for SRV records describing cluster endpoints |  [optional]
**etcdApi** | **String** | Specifies the version of the API to communicate with etcd |  [optional]
**haEnable** | **Boolean** | Specifies if high availability should be enabled |  [optional]
**path** | **String** | Specifies the path in etcd where vault data will be stored |  [optional]
**sync** | **Boolean** | Specifies whether to sync list of available etcd services on startup |  [optional]
**tlsSecretName** | **String** | Specifies the secret name that contains tls_ca_file, tls_cert_file and tls_key_file for etcd communication |  [optional]



