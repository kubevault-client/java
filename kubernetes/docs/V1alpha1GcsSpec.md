
# V1alpha1GcsSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket** | **String** | Specifies the name of the bucket to use for storage. | 
**chunkSize** | **String** | Specifies the maximum size (in kilobytes) to send in a single request. If set to 0, it will attempt to send the whole object at once, but will not retry any failures. |  [optional]
**credentialPath** | **String** | Google application credential path |  [optional]
**haEnabled** | **Boolean** | Specifies if high availability mode is enabled. |  [optional]
**maxParallet** | **Integer** |   Specifies the maximum number of parallel operations to take place. |  [optional]



