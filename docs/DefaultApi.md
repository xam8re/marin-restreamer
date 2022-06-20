# DefaultApi

All URIs are relative to *https://restreamer.marin.local*

Method | HTTP request | Description
------------- | ------------- | -------------
[**about**](DefaultApi.md#about) | **GET** /api | API version and build infos
[**config3Get**](DefaultApi.md#config3Get) | **GET** /api/v3/config | Retrieve the currently active Restreamer configuration
[**config3Reload**](DefaultApi.md#config3Reload) | **GET** /api/v3/config/reload | Reload the currently active configuration
[**config3Set**](DefaultApi.md#config3Set) | **PUT** /api/v3/config | Update the current Restreamer configuration
[**diskfs3DeleteFile**](DefaultApi.md#diskfs3DeleteFile) | **DELETE** /api/v3/fs/disk/{path} | Remove a file from the filesystem
[**diskfs3GetFile**](DefaultApi.md#diskfs3GetFile) | **GET** /api/v3/fs/disk/{path} | Fetch a file from the filesystem
[**diskfs3ListFiles**](DefaultApi.md#diskfs3ListFiles) | **GET** /api/v3/fs/disk/ | List all files on the filesystem
[**diskfs3PutFile**](DefaultApi.md#diskfs3PutFile) | **PUT** /api/v3/fs/disk/{path} | Add a file to the filesystem
[**diskfsGetFile**](DefaultApi.md#diskfsGetFile) | **GET** /{path} | Fetch a file from the filesystem
[**graphPlayground**](DefaultApi.md#graphPlayground) | **GET** /api/graph | Load GraphQL playground
[**graphQuery**](DefaultApi.md#graphQuery) | **POST** /api/graph/query | Query the GraphAPI
[**jwtLogin**](DefaultApi.md#jwtLogin) | **POST** /api/login | Retrieve an access and a refresh token
[**jwtRefresh**](DefaultApi.md#jwtRefresh) | **GET** /api/login/refresh | Retrieve a new access token
[**log3**](DefaultApi.md#log3) | **GET** /api/v3/log | Application log
[**memfs3GetFileApi**](DefaultApi.md#memfs3GetFileApi) | **GET** /api/v3/fs/mem/{path} | Fetch a file from the memory filesystem
[**memfs3ListFiles**](DefaultApi.md#memfs3ListFiles) | **GET** /api/v3/fs/mem/ | List all files on the memory filesystem
[**memfs3Patch**](DefaultApi.md#memfs3Patch) | **PATCH** /api/v3/fs/mem/{path} | Create a link to a file in the memory filesystem
[**memfs3PutFileApi**](DefaultApi.md#memfs3PutFileApi) | **PUT** /api/v3/fs/mem/{path} | Add a file to the memory filesystem
[**memfsDeleteFile**](DefaultApi.md#memfsDeleteFile) | **DELETE** /memfs/{path} | Remove a file from the memory filesystem
[**memfsDeleteFileApi**](DefaultApi.md#memfsDeleteFileApi) | **DELETE** /api/v3/fs/mem/{path} | Remove a file from the memory filesystem
[**memfsGetFile**](DefaultApi.md#memfsGetFile) | **GET** /memfs/{path} | Fetch a file from the memory filesystem
[**memfsPutFile**](DefaultApi.md#memfsPutFile) | **PUT** /memfs/{path} | Add a file to the memory filesystem
[**metadata3Get**](DefaultApi.md#metadata3Get) | **GET** /api/v3/metadata/{key} | Retrieve JSON metadata from a key
[**metadata3Set**](DefaultApi.md#metadata3Set) | **PUT** /api/v3/metadata/{key} | Add JSON metadata under the given key
[**metrics**](DefaultApi.md#metrics) | **GET** /metrics | Prometheus metrics
[**metrics3Metrics**](DefaultApi.md#metrics3Metrics) | **POST** /api/v3/metrics | Query the collected metrics
[**ping**](DefaultApi.md#ping) | **GET** /ping | Liveliness check
[**profiling**](DefaultApi.md#profiling) | **GET** /profiling | Retrieve profiling data from the application
[**restream3Add**](DefaultApi.md#restream3Add) | **POST** /api/v3/process | Add a new process
[**restream3Command**](DefaultApi.md#restream3Command) | **PUT** /api/v3/process/{id}/command | Issue a command to a process
[**restream3Delete**](DefaultApi.md#restream3Delete) | **DELETE** /api/v3/process/{id} | Delete a process by its ID
[**restream3Get**](DefaultApi.md#restream3Get) | **GET** /api/v3/process/{id} | List a process by its ID
[**restream3GetAll**](DefaultApi.md#restream3GetAll) | **GET** /api/v3/process | List all known processes
[**restream3GetConfig**](DefaultApi.md#restream3GetConfig) | **GET** /api/v3/process/{id}/config | Get the configuration of a process
[**restream3GetProcessMetadata**](DefaultApi.md#restream3GetProcessMetadata) | **GET** /api/v3/process/{id}/metadata/{key} | Retrieve JSON metadata stored with a process under a key
[**restream3GetReport**](DefaultApi.md#restream3GetReport) | **GET** /api/v3/process/{id}/report | Get the logs of a process
[**restream3GetState**](DefaultApi.md#restream3GetState) | **GET** /api/v3/process/{id}/state | Get the state of a process
[**restream3PlayoutErrorframe**](DefaultApi.md#restream3PlayoutErrorframe) | **POST** /api/v3/process/{id}/playout/{inputid}/errorframe/{name} | Upload an error frame
[**restream3PlayoutErrorframencode**](DefaultApi.md#restream3PlayoutErrorframencode) | **GET** /api/v3/process/{id}/playout/{inputid}/errorframe/encode | Encode the errorframe
[**restream3PlayoutKeyframe**](DefaultApi.md#restream3PlayoutKeyframe) | **GET** /api/v3/process/{id}/playout/{inputid}/keyframe/{name} | Get the last keyframe
[**restream3PlayoutReopenInput**](DefaultApi.md#restream3PlayoutReopenInput) | **GET** /api/v3/process/{id}/playout/{inputid}/reopen | Close the current input stream
[**restream3PlayoutStatus**](DefaultApi.md#restream3PlayoutStatus) | **GET** /api/v3/process/{id}/playout/{inputid}/status | Get the current playout status
[**restream3PlayoutStream**](DefaultApi.md#restream3PlayoutStream) | **PUT** /api/v3/process/{id}/playout/{inputid}/stream | Switch to a new stream
[**restream3Probe**](DefaultApi.md#restream3Probe) | **GET** /api/v3/process/{id}/probe | Probe a process
[**restream3SetProcessMetadata**](DefaultApi.md#restream3SetProcessMetadata) | **PUT** /api/v3/process/{id}/metadata/{key} | Add JSON metadata with a process under the given key
[**restream3Update**](DefaultApi.md#restream3Update) | **PUT** /api/v3/process/{id} | Replace an existing process
[**rtmp3ListChannels**](DefaultApi.md#rtmp3ListChannels) | **GET** /api/v3/rtmp | List all publishing streams
[**session3Current**](DefaultApi.md#session3Current) | **GET** /api/v3/session/active | Get a minimal summary of all active sessions
[**session3Summary**](DefaultApi.md#session3Summary) | **GET** /api/v3/session | Get a summary of all active and past sessions
[**skills3**](DefaultApi.md#skills3) | **GET** /api/v3/skills | FFmpeg capabilities
[**skills3Reload**](DefaultApi.md#skills3Reload) | **GET** /api/v3/skills/reload | Refresh FFmpeg capabilities
[**swagger**](DefaultApi.md#swagger) | **GET** /api/swagger | Swagger UI for this API
[**widget3Get**](DefaultApi.md#widget3Get) | **GET** /api/v3/widget/process/{id} | Fetch minimal statistics about a process


<a name="about"></a>
# **about**
> ApiAbout about()

API version and build infos

API version and build infos in case auth is valid or not required. If auth is required, just the name field is populated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiAbout result = apiInstance.about();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#about");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiAbout**](ApiAbout.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="config3Get"></a>
# **config3Get**
> ApiConfig config3Get()

Retrieve the currently active Restreamer configuration

Retrieve the currently active Restreamer configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiConfig result = apiInstance.config3Get();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#config3Get");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiConfig**](ApiConfig.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="config3Reload"></a>
# **config3Reload**
> String config3Reload()

Reload the currently active configuration

Reload the currently active configuration. This will trigger a restart of the Restreamer.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    String result = apiInstance.config3Reload();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#config3Reload");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="config3Set"></a>
# **config3Set**
> String config3Set(config)

Update the current Restreamer configuration

Update the current Restreamer configuration by providing a complete or partial configuration. Fields that are not provided will not be changed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
ApiSetConfig config = new ApiSetConfig(); // ApiSetConfig | Restreamer configuration
try {
    String result = apiInstance.config3Set(config);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#config3Set");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | [**ApiSetConfig**](ApiSetConfig.md)| Restreamer configuration |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="diskfs3DeleteFile"></a>
# **diskfs3DeleteFile**
> String diskfs3DeleteFile(path)

Remove a file from the filesystem

Remove a file from the filesystem

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
try {
    String result = apiInstance.diskfs3DeleteFile(path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#diskfs3DeleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="diskfs3GetFile"></a>
# **diskfs3GetFile**
> File diskfs3GetFile(path)

Fetch a file from the filesystem

Fetch a file from the filesystem. The contents of that file are returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
try {
    File result = apiInstance.diskfs3GetFile(path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#diskfs3GetFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/data, application/json

<a name="diskfs3ListFiles"></a>
# **diskfs3ListFiles**
> List&lt;ApiFileInfo&gt; diskfs3ListFiles(glob, sort, order)

List all files on the filesystem

List all files on the filesystem. The listing can be ordered by name, size, or date of last modification in ascending or descending order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String glob = "glob_example"; // String | glob pattern for file names
String sort = "sort_example"; // String | none, name, size, lastmod
String order = "order_example"; // String | asc, desc
try {
    List<ApiFileInfo> result = apiInstance.diskfs3ListFiles(glob, sort, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#diskfs3ListFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glob** | **String**| glob pattern for file names | [optional]
 **sort** | **String**| none, name, size, lastmod | [optional]
 **order** | **String**| asc, desc | [optional]

### Return type

[**List&lt;ApiFileInfo&gt;**](ApiFileInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="diskfs3PutFile"></a>
# **diskfs3PutFile**
> String diskfs3PutFile(path, data)

Add a file to the filesystem

Writes or overwrites a file on the filesystem

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
List<Integer> data = Arrays.asList(new List<Integer>()); // List<Integer> | File data
try {
    String result = apiInstance.diskfs3PutFile(path, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#diskfs3PutFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |
 **data** | **List&lt;Integer&gt;**| File data |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/data
 - **Accept**: text/plain, application/json

<a name="diskfsGetFile"></a>
# **diskfsGetFile**
> File diskfsGetFile(path)

Fetch a file from the filesystem

Fetch a file from the filesystem. If the file is a directory, a index.html is returned, if it exists.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
try {
    File result = apiInstance.diskfsGetFile(path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#diskfsGetFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/data, application/json

<a name="graphPlayground"></a>
# **graphPlayground**
> graphPlayground()

Load GraphQL playground

Load GraphQL playground

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    apiInstance.graphPlayground();
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphPlayground");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="graphQuery"></a>
# **graphQuery**
> ApiGraphResponse graphQuery(query)

Query the GraphAPI

Query the GraphAPI

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
ApiGraphQuery query = new ApiGraphQuery(); // ApiGraphQuery | GraphQL Query
try {
    ApiGraphResponse result = apiInstance.graphQuery(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#graphQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**ApiGraphQuery**](ApiGraphQuery.md)| GraphQL Query |

### Return type

[**ApiGraphResponse**](ApiGraphResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="jwtLogin"></a>
# **jwtLogin**
> ApiJWT jwtLogin(data)

Retrieve an access and a refresh token

Retrieve valid JWT access and refresh tokens to use for accessing the API. Login either by username/password or Auth0 token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Auth0KeyAuth
ApiKeyAuth Auth0KeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("Auth0KeyAuth");
Auth0KeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Auth0KeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
ApiLogin data = new ApiLogin(); // ApiLogin | Login data
try {
    ApiJWT result = apiInstance.jwtLogin(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#jwtLogin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ApiLogin**](ApiLogin.md)| Login data |

### Return type

[**ApiJWT**](ApiJWT.md)

### Authorization

[Auth0KeyAuth](../README.md#Auth0KeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="jwtRefresh"></a>
# **jwtRefresh**
> ApiJWTRefresh jwtRefresh()

Retrieve a new access token

Retrieve a new access token by providing the refresh token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiRefreshKeyAuth
ApiKeyAuth ApiRefreshKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiRefreshKeyAuth");
ApiRefreshKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiRefreshKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiJWTRefresh result = apiInstance.jwtRefresh();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#jwtRefresh");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiJWTRefresh**](ApiJWTRefresh.md)

### Authorization

[ApiRefreshKeyAuth](../README.md#ApiRefreshKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="log3"></a>
# **log3**
> List&lt;String&gt; log3(format)

Application log

Get the last log lines of the Restreamer application

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String format = "format_example"; // String | Format of the list of log events (*console, raw)
try {
    List<String> result = apiInstance.log3(format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#log3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**| Format of the list of log events (*console, raw) | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="memfs3GetFileApi"></a>
# **memfs3GetFileApi**
> File memfs3GetFileApi(path)

Fetch a file from the memory filesystem

Fetch a file from the memory filesystem

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
try {
    File result = apiInstance.memfs3GetFileApi(path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#memfs3GetFileApi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/data, application/json

<a name="memfs3ListFiles"></a>
# **memfs3ListFiles**
> List&lt;ApiFileInfo&gt; memfs3ListFiles(glob, sort, order)

List all files on the memory filesystem

List all files on the memory filesystem. The listing can be ordered by name, size, or date of last modification in ascending or descending order.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String glob = "glob_example"; // String | glob pattern for file names
String sort = "sort_example"; // String | none, name, size, lastmod
String order = "order_example"; // String | asc, desc
try {
    List<ApiFileInfo> result = apiInstance.memfs3ListFiles(glob, sort, order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#memfs3ListFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **glob** | **String**| glob pattern for file names | [optional]
 **sort** | **String**| none, name, size, lastmod | [optional]
 **order** | **String**| asc, desc | [optional]

### Return type

[**List&lt;ApiFileInfo&gt;**](ApiFileInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="memfs3Patch"></a>
# **memfs3Patch**
> String memfs3Patch(path, url)

Create a link to a file in the memory filesystem

Create a link to a file in the memory filesystem. The file linked to has to exist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
String url = "url_example"; // String | Path to the file to link to
try {
    String result = apiInstance.memfs3Patch(path, url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#memfs3Patch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |
 **url** | **String**| Path to the file to link to |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/data
 - **Accept**: text/plain, application/json

<a name="memfs3PutFileApi"></a>
# **memfs3PutFileApi**
> String memfs3PutFileApi(path, data)

Add a file to the memory filesystem

Writes or overwrites a file on the memory filesystem

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
List<Integer> data = Arrays.asList(new List<Integer>()); // List<Integer> | File data
try {
    String result = apiInstance.memfs3PutFileApi(path, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#memfs3PutFileApi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |
 **data** | **List&lt;Integer&gt;**| File data |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/data
 - **Accept**: text/plain, application/json

<a name="memfsDeleteFile"></a>
# **memfsDeleteFile**
> String memfsDeleteFile(path)

Remove a file from the memory filesystem

Remove a file from the memory filesystem

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
try {
    String result = apiInstance.memfsDeleteFile(path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#memfsDeleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="memfsDeleteFileApi"></a>
# **memfsDeleteFileApi**
> String memfsDeleteFileApi(path)

Remove a file from the memory filesystem

Remove a file from the memory filesystem

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
try {
    String result = apiInstance.memfsDeleteFileApi(path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#memfsDeleteFileApi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="memfsGetFile"></a>
# **memfsGetFile**
> File memfsGetFile(path)

Fetch a file from the memory filesystem

Fetch a file from the memory filesystem

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
try {
    File result = apiInstance.memfsGetFile(path);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#memfsGetFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/data, application/json

<a name="memfsPutFile"></a>
# **memfsPutFile**
> String memfsPutFile(path, data)

Add a file to the memory filesystem

Writes or overwrites a file on the memory filesystem

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: BasicAuth
HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
BasicAuth.setUsername("YOUR USERNAME");
BasicAuth.setPassword("YOUR PASSWORD");

DefaultApi apiInstance = new DefaultApi();
String path = "path_example"; // String | Path to file
List<Integer> data = Arrays.asList(new List<Integer>()); // List<Integer> | File data
try {
    String result = apiInstance.memfsPutFile(path, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#memfsPutFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path to file |
 **data** | **List&lt;Integer&gt;**| File data |

### Return type

**String**

### Authorization

[BasicAuth](../README.md#BasicAuth)

### HTTP request headers

 - **Content-Type**: application/data
 - **Accept**: text/plain, application/json

<a name="metadata3Get"></a>
# **metadata3Get**
> Object metadata3Get(key)

Retrieve JSON metadata from a key

Retrieve the previously stored JSON metadata under the given key. If the key is empty, all metadata will be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String key = "key_example"; // String | Key for data store
try {
    Object result = apiInstance.metadata3Get(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#metadata3Get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| Key for data store |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="metadata3Set"></a>
# **metadata3Set**
> Object metadata3Set(key, data)

Add JSON metadata under the given key

Add arbitrary JSON metadata under the given key. If the key exists, all already stored metadata with this key will be overwritten. If the key doesn&#39;t exist, it will be created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String key = "key_example"; // String | Key for data store
Object data = null; // Object | Arbitrary JSON data
try {
    Object result = apiInstance.metadata3Set(key, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#metadata3Set");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| Key for data store |
 **data** | **Object**| Arbitrary JSON data |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="metrics"></a>
# **metrics**
> String metrics()

Prometheus metrics

Prometheus metrics

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    String result = apiInstance.metrics();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#metrics");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="metrics3Metrics"></a>
# **metrics3Metrics**
> ApiMetricsResponse metrics3Metrics(config)

Query the collected metrics

Query the collected metrics

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
ApiMetricsQuery config = new ApiMetricsQuery(); // ApiMetricsQuery | Metrics query
try {
    ApiMetricsResponse result = apiInstance.metrics3Metrics(config);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#metrics3Metrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | [**ApiMetricsQuery**](ApiMetricsQuery.md)| Metrics query |

### Return type

[**ApiMetricsResponse**](ApiMetricsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ping"></a>
# **ping**
> String ping()

Liveliness check

Liveliness check

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    String result = apiInstance.ping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ping");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="profiling"></a>
# **profiling**
> String profiling()

Retrieve profiling data from the application

Retrieve profiling data from the application

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    String result = apiInstance.profiling();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#profiling");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="restream3Add"></a>
# **restream3Add**
> ApiProcessConfig restream3Add(config)

Add a new process

Add a new FFmpeg process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
ApiProcessConfig config = new ApiProcessConfig(); // ApiProcessConfig | Process config
try {
    ApiProcessConfig result = apiInstance.restream3Add(config);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3Add");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | [**ApiProcessConfig**](ApiProcessConfig.md)| Process config |

### Return type

[**ApiProcessConfig**](ApiProcessConfig.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restream3Command"></a>
# **restream3Command**
> String restream3Command(id, command)

Issue a command to a process

Issue a command to a process: start, stop, reload, restart

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
ApiCommand command = new ApiCommand(); // ApiCommand | Process command
try {
    String result = apiInstance.restream3Command(id, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3Command");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **command** | [**ApiCommand**](ApiCommand.md)| Process command |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="restream3Delete"></a>
# **restream3Delete**
> String restream3Delete(id)

Delete a process by its ID

Delete a process by its ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
try {
    String result = apiInstance.restream3Delete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3Delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3Get"></a>
# **restream3Get**
> ApiProcess restream3Get(id, filter)

List a process by its ID

List a process by its ID. Use the filter parameter to specifiy the level of detail of the output.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
String filter = "filter_example"; // String | Comma separated list of fields (config, state, report, metadata) to be part of the output. If empty, all fields will be part of the output
try {
    ApiProcess result = apiInstance.restream3Get(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3Get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **filter** | **String**| Comma separated list of fields (config, state, report, metadata) to be part of the output. If empty, all fields will be part of the output | [optional]

### Return type

[**ApiProcess**](ApiProcess.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3GetAll"></a>
# **restream3GetAll**
> List&lt;ApiProcess&gt; restream3GetAll(filter, reference, id)

List all known processes

List all known processes. Use the query parameter to filter the listed processes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String filter = "filter_example"; // String | Comma separated list of fields (config, state, report, metadata) that will be part of the output. If empty, all fields will be part of the output
String reference = "reference_example"; // String | Return only these process that have this reference value. Overrides a list of IDs. If empty, the reference will be ignored
String id = "id_example"; // String | Comma separated list of process ids to list
try {
    List<ApiProcess> result = apiInstance.restream3GetAll(filter, reference, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3GetAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Comma separated list of fields (config, state, report, metadata) that will be part of the output. If empty, all fields will be part of the output | [optional]
 **reference** | **String**| Return only these process that have this reference value. Overrides a list of IDs. If empty, the reference will be ignored | [optional]
 **id** | **String**| Comma separated list of process ids to list | [optional]

### Return type

[**List&lt;ApiProcess&gt;**](ApiProcess.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3GetConfig"></a>
# **restream3GetConfig**
> ApiProcessConfig restream3GetConfig(id)

Get the configuration of a process

Get the configuration of a process. This is the configuration as provided by Add or Update.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
try {
    ApiProcessConfig result = apiInstance.restream3GetConfig(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3GetConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |

### Return type

[**ApiProcessConfig**](ApiProcessConfig.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3GetProcessMetadata"></a>
# **restream3GetProcessMetadata**
> Object restream3GetProcessMetadata(id, key)

Retrieve JSON metadata stored with a process under a key

Retrieve the previously stored JSON metadata under the given key. If the key is empty, all metadata will be returned.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
String key = "key_example"; // String | Key for data store
try {
    Object result = apiInstance.restream3GetProcessMetadata(id, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3GetProcessMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **key** | **String**| Key for data store |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3GetReport"></a>
# **restream3GetReport**
> ApiProcessReport restream3GetReport(id)

Get the logs of a process

Get the logs and the log history of a process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
try {
    ApiProcessReport result = apiInstance.restream3GetReport(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3GetReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |

### Return type

[**ApiProcessReport**](ApiProcessReport.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3GetState"></a>
# **restream3GetState**
> ApiProcessState restream3GetState(id)

Get the state of a process

Get the state and progress data of a process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
try {
    ApiProcessState result = apiInstance.restream3GetState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3GetState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |

### Return type

[**ApiProcessState**](ApiProcessState.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3PlayoutErrorframe"></a>
# **restream3PlayoutErrorframe**
> String restream3PlayoutErrorframe(id, inputid, name, image)

Upload an error frame

Upload an error frame which will be encoded immediately

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
String inputid = "inputid_example"; // String | Process Input ID
String name = "name_example"; // String | Any filename with a suitable extension
List<Integer> image = Arrays.asList(new List<Integer>()); // List<Integer> | Image to be used a error frame
try {
    String result = apiInstance.restream3PlayoutErrorframe(id, inputid, name, image);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3PlayoutErrorframe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **inputid** | **String**| Process Input ID |
 **name** | **String**| Any filename with a suitable extension |
 **image** | **List&lt;Integer&gt;**| Image to be used a error frame |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: text/plain, application/json

<a name="restream3PlayoutErrorframencode"></a>
# **restream3PlayoutErrorframencode**
> String restream3PlayoutErrorframencode(id, inputid)

Encode the errorframe

Immediately encode the errorframe (if available and looping)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
String inputid = "inputid_example"; // String | Process Input ID
try {
    String result = apiInstance.restream3PlayoutErrorframencode(id, inputid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3PlayoutErrorframencode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **inputid** | **String**| Process Input ID |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a name="restream3PlayoutKeyframe"></a>
# **restream3PlayoutKeyframe**
> File restream3PlayoutKeyframe(id, inputid, name)

Get the last keyframe

Get the last keyframe of an input of a process. The extension of the name determines the return type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
String inputid = "inputid_example"; // String | Process Input ID
String name = "name_example"; // String | Any filename with an extension of .jpg or .png
try {
    File result = apiInstance.restream3PlayoutKeyframe(id, inputid, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3PlayoutKeyframe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **inputid** | **String**| Process Input ID |
 **name** | **String**| Any filename with an extension of .jpg or .png |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/jpeg, image/png, application/json

<a name="restream3PlayoutReopenInput"></a>
# **restream3PlayoutReopenInput**
> String restream3PlayoutReopenInput(id, inputid)

Close the current input stream

Close the current input stream such that it will be automatically re-opened

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
String inputid = "inputid_example"; // String | Process Input ID
try {
    String result = apiInstance.restream3PlayoutReopenInput(id, inputid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3PlayoutReopenInput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **inputid** | **String**| Process Input ID |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="restream3PlayoutStatus"></a>
# **restream3PlayoutStatus**
> ApiPlayoutStatus restream3PlayoutStatus(id, inputid)

Get the current playout status

Get the current playout status of an input of a process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
String inputid = "inputid_example"; // String | Process Input ID
try {
    ApiPlayoutStatus result = apiInstance.restream3PlayoutStatus(id, inputid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3PlayoutStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **inputid** | **String**| Process Input ID |

### Return type

[**ApiPlayoutStatus**](ApiPlayoutStatus.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3PlayoutStream"></a>
# **restream3PlayoutStream**
> String restream3PlayoutStream(id, inputid, url)

Switch to a new stream

Replace the current stream with the one from the given URL. The switch will only happen if the stream parameters match.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
String inputid = "inputid_example"; // String | Process Input ID
String url = "url_example"; // String | URL of the new stream
try {
    String result = apiInstance.restream3PlayoutStream(id, inputid, url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3PlayoutStream");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **inputid** | **String**| Process Input ID |
 **url** | **String**| URL of the new stream |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json

<a name="restream3Probe"></a>
# **restream3Probe**
> ApiProbe restream3Probe(id)

Probe a process

Probe an existing process to get a detailed stream information on the inputs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
try {
    ApiProbe result = apiInstance.restream3Probe(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3Probe");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |

### Return type

[**ApiProbe**](ApiProbe.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3SetProcessMetadata"></a>
# **restream3SetProcessMetadata**
> Object restream3SetProcessMetadata(id, key, data)

Add JSON metadata with a process under the given key

Add arbitrary JSON metadata under the given key. If the key exists, all already stored metadata with this key will be overwritten. If the key doesn&#39;t exist, it will be created.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
String key = "key_example"; // String | Key for data store
Object data = null; // Object | Arbitrary JSON data. The null value will remove the key and its contents
try {
    Object result = apiInstance.restream3SetProcessMetadata(id, key, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3SetProcessMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **key** | **String**| Key for data store |
 **data** | **Object**| Arbitrary JSON data. The null value will remove the key and its contents |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="restream3Update"></a>
# **restream3Update**
> ApiProcessConfig restream3Update(id, config)

Replace an existing process

Replace an existing process. This is a shortcut for DELETE+POST.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | Process ID
ApiProcessConfig config = new ApiProcessConfig(); // ApiProcessConfig | Process config
try {
    ApiProcessConfig result = apiInstance.restream3Update(id, config);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#restream3Update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Process ID |
 **config** | [**ApiProcessConfig**](ApiProcessConfig.md)| Process config |

### Return type

[**ApiProcessConfig**](ApiProcessConfig.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rtmp3ListChannels"></a>
# **rtmp3ListChannels**
> List&lt;ApiRTMPChannel&gt; rtmp3ListChannels()

List all publishing streams

List all currently publishing streams

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    List<ApiRTMPChannel> result = apiInstance.rtmp3ListChannels();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rtmp3ListChannels");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ApiRTMPChannel&gt;**](ApiRTMPChannel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="session3Current"></a>
# **session3Current**
> ApiSessionsActive session3Current(collectors)

Get a minimal summary of all active sessions

Get a minimal summary of all active sessions (i.e. number of sessions, bandwidth)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String collectors = "collectors_example"; // String | Comma separated list of collectors
try {
    ApiSessionsActive result = apiInstance.session3Current(collectors);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#session3Current");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectors** | **String**| Comma separated list of collectors | [optional]

### Return type

[**ApiSessionsActive**](ApiSessionsActive.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="session3Summary"></a>
# **session3Summary**
> ApiSessionsSummary session3Summary(collectors)

Get a summary of all active and past sessions

Get a summary of all active and past sessions of the given collector

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String collectors = "collectors_example"; // String | Comma separated list of collectors
try {
    ApiSessionsSummary result = apiInstance.session3Summary(collectors);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#session3Summary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **collectors** | **String**| Comma separated list of collectors | [optional]

### Return type

[**ApiSessionsSummary**](ApiSessionsSummary.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="skills3"></a>
# **skills3**
> ApiSkills skills3()

FFmpeg capabilities

List all detected FFmpeg capabilities

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiSkills result = apiInstance.skills3();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#skills3");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiSkills**](ApiSkills.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="skills3Reload"></a>
# **skills3Reload**
> ApiSkills skills3Reload()

Refresh FFmpeg capabilities

Refresh the available FFmpeg capabilities

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
try {
    ApiSkills result = apiInstance.skills3Reload();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#skills3Reload");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ApiSkills**](ApiSkills.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="swagger"></a>
# **swagger**
> String swagger()

Swagger UI for this API

Swagger UI for this API

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    String result = apiInstance.swagger();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#swagger");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

<a name="widget3Get"></a>
# **widget3Get**
> ApiWidgetProcess widget3Get(id)

Fetch minimal statistics about a process

Fetch minimal statistics about a process, which is not protected by any auth.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | ID of a process
try {
    ApiWidgetProcess result = apiInstance.widget3Get(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#widget3Get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of a process |

### Return type

[**ApiWidgetProcess**](ApiWidgetProcess.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

