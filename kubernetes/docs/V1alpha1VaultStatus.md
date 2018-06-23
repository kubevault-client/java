
# V1alpha1VaultStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **String** | PodName of the active Vault node. Active node is unsealed. Only active node can serve requests. Vault service only points to the active node. |  [optional]
**sealed** | **List&lt;String&gt;** | PodNames of Sealed Vault nodes. Sealed nodes MUST be unsealed to become standby or leader. |  [optional]
**standby** | **List&lt;String&gt;** | PodNames of the standby Vault nodes. Standby nodes are unsealed. Standby nodes do not process requests, and instead redirect to the active Vault. |  [optional]
**unsealed** | **List&lt;String&gt;** | PodNames of Unsealed Vault nodes. |  [optional]



