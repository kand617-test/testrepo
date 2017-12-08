# Getting started

# APIMATIC CodeGen as a Service

[APIMATIC](https://apimatic.io) is an automatic code generator for RESTful APIs. This API exposes the access to its underlying code
generation engine. We currently support the following format for API descriptions, `API Blueprint`, `RAML`,
`Google API Discovery`, `IODocs`, `WADL`, and  `Swagger`. Although most API descriptions can be used, not all API
decsriptions are written well-enough for automatic code generation and may fail the code generation process.
For this purpose, we have provided a verbose validation API, which can be used to improve your API description.

> **Looking for a way to convert between API description formats like Swagger and API Blueprint?** Try [APIMATIC's Transformer API](http://docs.apimatictransformerapi.apiary.io/#) or it's web version at [Transformer](https://apimatic.io/transformer).

[APIMATIC](https://apimatic.io) works in two modes i.e., perform operations on **pre-configured** API descriptions, and perform 
operations on API descriptions sent **on the fly** with requests. The later mode of operations has its
limitations with respect to the customization of the generated code through our *codegen settings*.

See [this article](https://docs.apimatic.io/api-editor/codegen-settings/)
for more information about customization of the output code.

## Working with pre-configured API descriptions

This mode of operation is useful where APIs are stable and therefore can be pre-configured in [APIMATIC](https://apimatic.io).
You can always update an API description in [APIMATIC](https://apimatic.io) using the API Editor by clicking on the *Edit* button.
When working with stored API descriptions, pre-configured *codegen settings* are used that allow customization
of the generated output. In order to uniquely identify the API to perform operations on, an *API Key* is used,
which can be retrieved using the API context menu. This *API Key* is a secret value and therefore operations
on pre-configured API descriptions do not require authentication.

See [this article](https://docs.apimatic.io/getting-started/manage-apis/#view-api-integration-key)
on how to get your API Key from [APIMATIC](https://apimatic.io).

## Working with API descriptions documents

This mode of operation is useful in cases where API descriptions are automatically generated from a process
or external source and cannot be pre-configured in [APIMATIC](https://apimatic.io). In this case code generation uses the default
*codegen settings*. However, if custom *codegen settings* are desired you may use the [APIMATIC](https://apimatic.io) format for
generating your API descriptions, which contains nested *codegen settings*. For getting the full benefit
of our advanced features in our code generator, you must either pre-configure your API, or use [APIMATIC](https://apimatic.io)
format for API description.

# APIMATIC API Transformer

[APIMATIC](https://www.apimatic.io) Transformer allows its users to convert between different API description formats e.g. `Swagger`, `RAML`, etc. This enables the user to benefit from a wide range of tools available associated with any format, not just one. 
The complete list of supported formats of [Transformer](https://apimatic.io/transformer) are: 

Inputs  			| Outputs
------------------  | -------------------
API Blueprint		| API Blueprint
Swagger v.1.2		| Swagger 1.2
Swagger 2.0 (JSON and YAML)	| Swagger 2.0 (JSON, YAML)
Open API v.3.0 	| Open API 3.0
WADL 2009 (W3C)	| WADL 2009 (W3C)
WSDL (W3C)		| WSDL (W3C)
Google Discovery    | RAML 0.8 - 1.0	
RAML 0.8 - 1.0	    | Postman Collection 1.0 - 2.0
I/O Docs - Mashery	| APIMATIC Format	
HAR 1.2		|
Postman Collection 1.0 - 2.0	|
APIMATIC Format		|
Mashape		|

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

* Browse to locate the folder containing the source code. Select the location of the CodeGenAndTransformerAPI gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

## How to Use

The following section explains how to use the CodeGenAndTransformerAPI library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

In the following step naigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line ```compile project(path: ':CodeGenAndTransformerAPI')``` to the dependencies section as shown in the illustration below.

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=CodeGen%20and%20Transformer%20API&workspaceName=CodeGenAndTransformerAPI&projectName=CodeGenAndTransformerAPILib&rootNamespace=io.apimatic)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > CodeGenAndTransformerAPILib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

io.apimatic.Configuration.initialize(appContext);
CodeGenAndTransformerAPIClient client = new CodeGenAndTransformerAPIClient(basicAuthUserName, basicAuthPassword);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [CodeGenerationController](#code_generation_controller)
* [APIDescriptionValidationController](#api_description_validation_controller)
* [APITransformerController](#api_transformer_controller)

## <a name="code_generation_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.apimatic.controllers.CodeGenerationController") CodeGenerationController

### Get singleton instance

The singleton instance of the ``` CodeGenerationController ``` class can be accessed from the API Client.

```java
CodeGenerationController codeGeneration = client.getCodeGeneration();
```

### <a name="using_file_as_string_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.CodeGenerationController.usingFileAsStringAsync") usingFileAsStringAsync

> The code generation endpoint. The response is a path to the generated zip file relative to https://apimatic.io/


```java
void usingFileAsStringAsync(
        final String name,
        final Format format,
        final Template template,
        final File body,
        final Integer dl,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | The name of the API being used for code generation |
| format |  ``` Required ```  | The format of the API description to use for code generation |
| template |  ``` Required ```  | The template to use for code generation |
| body |  ``` Required ```  | The input file to use for code generation |
| dl |  ``` Optional ```  ``` DefaultValue ```  | Optional |


#### Example Usage

```java
String name = "name";
Format format = Format.fromString("Enum_API Blueprint");
Template template = Template.fromString("cs_portable_net_lib");
File body = new File("PathToFile");
Integer dl = 0;
// Invoking the API call with sample inputs
codeGeneration.usingFileAsStringAsync(name, format, template, body, dl, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized: Access is denied due to invalid credentials. |
| 412 | Precondition Failed |



### <a name="using_url_as_string_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.CodeGenerationController.usingUrlAsStringAsync") usingUrlAsStringAsync

> The code generation endpoint. The response is a path to the generated zip file relative to https://apimatic.io/


```java
void usingUrlAsStringAsync(
        final Template template,
        final Format format,
        final String name,
        final String descriptionUrl,
        final Integer dl,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| template |  ``` Required ```  | The template to use for code generation |
| format |  ``` Required ```  | The format of the API description to use for code generation |
| name |  ``` Required ```  | The name of the API being used for code generation |
| descriptionUrl |  ``` Required ```  | The absolute public Uri for an API description doucment |
| dl |  ``` Optional ```  ``` DefaultValue ```  | Optional |


#### Example Usage

```java
Template template = Template.fromString("cs_portable_net_lib");
Format format = Format.fromString("Enum_API Blueprint");
String name = "name";
String descriptionUrl = "descriptionUrl";
Integer dl = 0;
// Invoking the API call with sample inputs
codeGeneration.usingUrlAsStringAsync(template, format, name, descriptionUrl, dl, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized: Access is denied due to invalid credentials. |
| 412 | Precondition Failed |



### <a name="using_file_as_binary_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.CodeGenerationController.usingFileAsBinaryAsync") usingFileAsBinaryAsync

> The code generation endpoint! Upload a file and convert it to the given format. The API description format of uploaded file will be detected automatically. The response is generated zip file as per selected template.


```java
void usingFileAsBinaryAsync(
        final String name,
        final Format format,
        final Template template,
        final File body,
        final Integer dl,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | The name of the API being used for code generation |
| format |  ``` Required ```  | The format of the API description to use for code generation |
| template |  ``` Required ```  | The template to use for code generation |
| body |  ``` Required ```  | The input file to use for code generation |
| dl |  ``` Optional ```  ``` DefaultValue ```  | Optional |


#### Example Usage

```java
String name = "name";
Format format = Format.fromString("Enum_API Blueprint");
Template template = Template.fromString("cs_portable_net_lib");
File body = new File("PathToFile");
Integer dl = 1;
// Invoking the API call with sample inputs
codeGeneration.usingFileAsBinaryAsync(name, format, template, body, dl, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized: Access is denied due to invalid credentials. |
| 412 | Precondition Failed |



### <a name="using_url_as_binary_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.CodeGenerationController.usingUrlAsBinaryAsync") usingUrlAsBinaryAsync

> Download API description from the given URL and convert it to the given format. The API description format of the provided file will be detected automatically. The response is generated zip file as per selected template.


```java
void usingUrlAsBinaryAsync(
        final Template template,
        final Format format,
        final String name,
        final String descriptionUrl,
        final Integer dl,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| template |  ``` Required ```  | The template to use for code generation |
| format |  ``` Required ```  | The format of the API description to use for code generation |
| name |  ``` Required ```  | The name of the API being used for code generation |
| descriptionUrl |  ``` Required ```  | The absolute public Uri for an API description doucment |
| dl |  ``` Optional ```  ``` DefaultValue ```  | Optional |


#### Example Usage

```java
Template template = Template.fromString("cs_portable_net_lib");
Format format = Format.fromString("Enum_API Blueprint");
String name = "name";
String descriptionUrl = "descriptionUrl";
Integer dl = 1;
// Invoking the API call with sample inputs
codeGeneration.usingUrlAsBinaryAsync(template, format, name, descriptionUrl, dl, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized: Access is denied due to invalid credentials. |
| 412 | Precondition Failed |



### <a name="using_apikey_as_binary_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.CodeGenerationController.usingApikeyAsBinaryAsync") usingApikeyAsBinaryAsync

> Convert an API from the user's account using the API's [API Integration Key](https://docs.apimatic.io/getting-started/manage-apis/#view-api-integration-key). The response is generated zip file as per selected template.
> > Note: This endpoint does not require Basic Authentication.


```java
void usingApikeyAsBinaryAsync(
        final String apikey,
        final Template template,
        final Integer dl,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| apikey |  ``` Required ```  | The API Key of the pre-configured API |
| template |  ``` Required ```  | The template to use for code generation |
| dl |  ``` Optional ```  ``` DefaultValue ```  | Optional |


#### Example Usage

```java
String apikey = "apikey";
Template template = Template.fromString("cs_portable_net_lib");
Integer dl = 1;
// Invoking the API call with sample inputs
codeGeneration.usingApikeyAsBinaryAsync(apikey, template, dl, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized: Access is denied due to invalid credentials. |
| 412 | Precondition Failed |



### <a name="using_apikey_as_string_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.CodeGenerationController.usingApikeyAsStringAsync") usingApikeyAsStringAsync

> The code generation endpoint. The response is a path to the generated zip file relative to https://apimatic.io/
> > Note: This endpoint does not require Basic Authentication.


```java
void usingApikeyAsStringAsync(
        final String apikey,
        final Template template,
        final Integer dl,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| apikey |  ``` Required ```  | The API Key of the pre-configured API |
| template |  ``` Required ```  | The template to use for code generation |
| dl |  ``` Optional ```  ``` DefaultValue ```  | Optional |


#### Example Usage

```java
String apikey = "apikey";
Template template = Template.fromString("cs_portable_net_lib");
Integer dl = 0;
// Invoking the API call with sample inputs
codeGeneration.usingApikeyAsStringAsync(apikey, template, dl, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 401 | Unauthorized: Access is denied due to invalid credentials. |
| 412 | Precondition Failed |



[Back to List of Controllers](#list_of_controllers)

## <a name="api_description_validation_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.apimatic.controllers.APIDescriptionValidationController") APIDescriptionValidationController

### Get singleton instance

The singleton instance of the ``` APIDescriptionValidationController ``` class can be accessed from the API Client.

```java
APIDescriptionValidationController aPIDescriptionValidation = client.getAPIDescriptionValidation();
```

### <a name="using_file_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.APIDescriptionValidationController.usingFileAsync") usingFileAsync

> This endpoint can be used to validate an API description document *on the fly* and see detailed error messages along with any warnings or useful information.


```java
void usingFileAsync(
        final File body,
        final APICallBack<ValidateAnAPIDescriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| body |  ``` Required ```  | The input file to use for validation |


#### Example Usage

```java
File body = new File("PathToFile");
// Invoking the API call with sample inputs
aPIDescriptionValidation.usingFileAsync(body, new APICallBack<ValidateAnAPIDescriptionResponse>() {
    public void onSuccess(HttpContext context, ValidateAnAPIDescriptionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="using_url_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.APIDescriptionValidationController.usingUrlAsync") usingUrlAsync

> This endpoint can be used to validate an API description document *on the fly* from its public Uri, and see detailed error messages along with any warnings or useful information. This endpoint is useful for API descriptions with relative links e.g., includes (RAML) and paths (swagger).


```java
void usingUrlAsync(
        final String descriptionUrl,
        final APICallBack<ValidateAnAPIDescriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| descriptionUrl |  ``` Required ```  | The absolute public Uri for an API description doucment |


#### Example Usage

```java
String descriptionUrl = "descriptionUrl";
// Invoking the API call with sample inputs
aPIDescriptionValidation.usingUrlAsync(descriptionUrl, new APICallBack<ValidateAnAPIDescriptionResponse>() {
    public void onSuccess(HttpContext context, ValidateAnAPIDescriptionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="using_apikey_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.APIDescriptionValidationController.usingApikeyAsync") usingApikeyAsync

> This endpoint can be used to validate a *pre-configured* API description and see detailed error messages along with any warnings or useful information.


```java
void usingApikeyAsync(
        final String apikey,
        final APICallBack<ValidateAnAPIDescriptionResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| apikey |  ``` Required ```  | The API Key of a pre-configured API description from APIMATIC |


#### Example Usage

```java
String apikey = "apikey";
// Invoking the API call with sample inputs
aPIDescriptionValidation.usingApikeyAsync(apikey, new APICallBack<ValidateAnAPIDescriptionResponse>() {
    public void onSuccess(HttpContext context, ValidateAnAPIDescriptionResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="api_transformer_controller"></a>![Class: ](https://apidocs.io/img/class.png "io.apimatic.controllers.APITransformerController") APITransformerController

### Get singleton instance

The singleton instance of the ``` APITransformerController ``` class can be accessed from the API Client.

```java
APITransformerController aPITransformer = client.getAPITransformer();
```

### <a name="using_apikey_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.APITransformerController.usingApikeyAsync") usingApikeyAsync

> Convert an API from the user's account using the API's [Api Integration Key](https://docs.apimatic.io/getting-started/manage-apis/#view-api-integration-key). The converted file is returned as the response.
> > Note: This endpoint does not require Basic Authentication.


```java
void usingApikeyAsync(
        final FormatTransformer format,
        final String apikey,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| format |  ``` Required ```  | The API format to convert to |
| apikey |  ``` Required ```  | Apikey of an already uploaded API Description on APIMATIC |


#### Example Usage

```java
FormatTransformer format = FormatTransformer.fromString("apimatic");
String apikey = "apikey";
// Invoking the API call with sample inputs
aPITransformer.usingApikeyAsync(format, apikey, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad Request |



### <a name="using_url_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.APITransformerController.usingUrlAsync") usingUrlAsync

> Download API description from the given URL and convert it to the given format. The API description format of the provided file will be detected automatically. The converted file is returned as the response.


```java
void usingUrlAsync(
        final FormatTransformer format,
        final String descriptionUrl,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| format |  ``` Required ```  | The API format to convert to |
| descriptionUrl |  ``` Required ```  | The URL where the API description will be downloaded from |


#### Example Usage

```java
FormatTransformer format = FormatTransformer.fromString("apimatic");
String descriptionUrl = "descriptionUrl";
// Invoking the API call with sample inputs
aPITransformer.usingUrlAsync(format, descriptionUrl, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad Request |



### <a name="using_file_async"></a>![Method: ](https://apidocs.io/img/method.png "io.apimatic.controllers.APITransformerController.usingFileAsync") usingFileAsync

> Upload a file and convert it to the given format. The API description format of the uploaded file will be detected automatically. The converted file is returned as the response.


```java
void usingFileAsync(
        final FormatTransformer format,
        final File file,
        final APICallBack<InputStream> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| format |  ``` Required ```  | The API format to convert to |
| file |  ``` Required ```  | The input file to convert |


#### Example Usage

```java
FormatTransformer format = FormatTransformer.fromString("apimatic");
File file = new File("PathToFile");
// Invoking the API call with sample inputs
aPITransformer.usingFileAsync(format, file, new APICallBack<InputStream>() {
    public void onSuccess(HttpContext context, InputStream response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```

#### Errors

| Error Code | Error Description |
|------------|-------------------|
| 400 | Bad Request |



[Back to List of Controllers](#list_of_controllers)



