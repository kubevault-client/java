
# V1alpha1UnsealerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**insecureTLS** | **Boolean** | To skip tls verification when communicating with vault server |  [optional]
**mode** | [**V1alpha1ModeSpec**](V1alpha1ModeSpec.md) | mode contains unseal mechanism |  [optional]
**overwriteExisting** | **Boolean** | overwrite existing unseal keys and root tokens, possibly dangerous! |  [optional]
**retryPeriodSeconds** | **Long** | How often to attempt to unseal the vault instance |  [optional]
**secretShares** | **Integer** | Total count of secret shares that exist |  [optional]
**secretThreshold** | **Integer** | Minimum required secret shares to unseal |  [optional]
**storeRootToken** | **Boolean** | should the root token be stored in the key store (default true) |  [optional]
**vaultCASecret** | **String** | Secret name containing self signed ca cert of vault |  [optional]



