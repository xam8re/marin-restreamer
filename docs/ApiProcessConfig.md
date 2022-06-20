
# ApiProcessConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autostart** | **Boolean** |  |  [optional]
**id** | **String** |  |  [optional]
**input** | [**List&lt;ApiProcessConfigIO&gt;**](ApiProcessConfigIO.md) |  | 
**limits** | [**ApiProcessConfigLimits**](ApiProcessConfigLimits.md) |  |  [optional]
**options** | **List&lt;String&gt;** |  |  [optional]
**output** | [**List&lt;ApiProcessConfigIO&gt;**](ApiProcessConfigIO.md) |  | 
**reconnect** | **Boolean** |  |  [optional]
**reconnectDelaySeconds** | **Integer** |  |  [optional]
**reference** | **String** |  |  [optional]
**staleTimeoutSeconds** | **Integer** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FFMPEG | &quot;ffmpeg&quot;
EMPTY | &quot;&quot;



