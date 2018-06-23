
# V1alpha1VaultServerStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientPort** | **Integer** | ClientPort is the port for vault client to access. It&#39;s the same on client LB service and vault nodes. |  [optional]
**initialized** | **Boolean** | Initialized indicates if the Vault service is initialized. |  [optional]
**phase** | **String** | Phase indicates the state this Vault cluster jumps in. Phase goes as one way as below:   Initial -&gt; Running |  [optional]
**serviceName** | **String** | ServiceName is the LB service for accessing vault nodes. |  [optional]
**updatedNodes** | **List&lt;String&gt;** | PodNames of updated Vault nodes. Updated means the Vault container image version matches the spec&#39;s version. |  [optional]
**vaultStatus** | [**V1alpha1VaultStatus**](V1alpha1VaultStatus.md) | VaultStatus is the set of Vault node specific statuses: Active, Standby, and Sealed |  [optional]



