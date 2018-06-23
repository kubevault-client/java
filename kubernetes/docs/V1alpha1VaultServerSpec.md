
# V1alpha1VaultServerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TLS** | [**V1alpha1TLSPolicy**](V1alpha1TLSPolicy.md) | TLS policy of vault nodes |  [optional]
**backendStorage** | [**V1alpha1BackendStorageSpec**](V1alpha1BackendStorageSpec.md) | backend storage configuration for vault | 
**baseImage** | **String** | Base image to use for a Vault deployment. | 
**configMapName** | **String** | Name of the ConfigMap for Vault&#39;s configuration In this configMap contain extra config for vault |  [optional]
**nodes** | **Integer** | Number of nodes to deploy for a Vault deployment. Default: 1. |  [optional]
**podPolicy** | [**V1alpha1PodPolicy**](V1alpha1PodPolicy.md) | PodPolicy defines the policy for pods owned by vault operator. This field cannot be updated once the CR is created. |  [optional]
**unsealer** | [**V1alpha1UnsealerSpec**](V1alpha1UnsealerSpec.md) | unseal configuration for vault |  [optional]
**version** | **String** | Version of Vault to be deployed. | 



