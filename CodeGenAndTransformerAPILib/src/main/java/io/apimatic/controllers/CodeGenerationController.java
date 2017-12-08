/*
 * CodeGenAndTransformerAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import io.apimatic.*;
import io.apimatic.models.*;
import io.apimatic.exceptions.*;
import io.apimatic.http.client.HttpClient;
import io.apimatic.http.client.HttpContext;
import io.apimatic.http.request.HttpRequest;
import io.apimatic.http.response.HttpResponse;
import io.apimatic.http.response.HttpStringResponse;
import io.apimatic.http.client.APICallBack;

public class CodeGenerationController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static CodeGenerationController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the CodeGenerationController class 
     */
    public static CodeGenerationController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new CodeGenerationController();
            }
        }
        return instance;
    }

    /**
     * The code generation endpoint. The response is a path to the generated zip file relative to https://apimatic.io/
     * @param    name    Required parameter: The name of the API being used for code generation
     * @param    format    Required parameter: The format of the API description to use for code generation
     * @param    template    Required parameter: The template to use for code generation
     * @param    body    Required parameter: The input file to use for code generation
     * @param    dl    Optional parameter: Optional
     * @return    Returns the void response from the API call 
     */
    public void usingFileAsStringAsync(
                final String name,
                final Format format,
                final Template template,
                final File body,
                final Integer dl,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/codegen");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5263199673918828548L;
            {
                    put( "name", name );
                    put( "format", (format != null) ? format.value() : null );
                    put( "template", (template != null) ? template.value() : null );
                    put( "dl", (dl != null) ? dl : 0 );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5743716323162011623L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4809386812494569054L;
            {
                    put( "body", body );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 401)
                                throw new APIException("Unauthorized: Access is denied due to invalid credentials.", _context);

                            if (_responseCode == 412)
                                throw new APIException("Precondition Failed", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * The code generation endpoint. The response is a path to the generated zip file relative to https://apimatic.io/
     * @param    template    Required parameter: The template to use for code generation
     * @param    format    Required parameter: The format of the API description to use for code generation
     * @param    name    Required parameter: The name of the API being used for code generation
     * @param    descriptionUrl    Required parameter: The absolute public Uri for an API description doucment
     * @param    dl    Optional parameter: Optional
     * @return    Returns the void response from the API call 
     */
    public void usingUrlAsStringAsync(
                final Template template,
                final Format format,
                final String name,
                final String descriptionUrl,
                final Integer dl,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/codegen");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5542790075758949688L;
            {
                    put( "template", (template != null) ? template.value() : null );
                    put( "format", (format != null) ? format.value() : null );
                    put( "name", name );
                    put( "descriptionUrl", descriptionUrl );
                    put( "dl", (dl != null) ? dl : 0 );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4634495749680626084L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 401)
                                throw new APIException("Unauthorized: Access is denied due to invalid credentials.", _context);

                            if (_responseCode == 412)
                                throw new APIException("Precondition Failed", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * The code generation endpoint! Upload a file and convert it to the given format. The API description format of uploaded file will be detected automatically. The response is generated zip file as per selected template.
     * @param    name    Required parameter: The name of the API being used for code generation
     * @param    format    Required parameter: The format of the API description to use for code generation
     * @param    template    Required parameter: The template to use for code generation
     * @param    body    Required parameter: The input file to use for code generation
     * @param    dl    Optional parameter: Optional
     * @return    Returns the void response from the API call 
     */
    public void usingFileAsBinaryAsync(
                final String name,
                final Format format,
                final Template template,
                final File body,
                final Integer dl,
                final APICallBack<InputStream> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/codegen");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4976290202012601318L;
            {
                    put( "name", name );
                    put( "format", (format != null) ? format.value() : null );
                    put( "template", (template != null) ? template.value() : null );
                    put( "dl", (dl != null) ? dl : 1 );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4696421660797432310L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5661064189695284371L;
            {
                    put( "body", body );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 401)
                                throw new APIException("Unauthorized: Access is denied due to invalid credentials.", _context);

                            if (_responseCode == 412)
                                throw new APIException("Precondition Failed", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            InputStream _result = _response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Download API description from the given URL and convert it to the given format. The API description format of the provided file will be detected automatically. The response is generated zip file as per selected template.
     * @param    template    Required parameter: The template to use for code generation
     * @param    format    Required parameter: The format of the API description to use for code generation
     * @param    name    Required parameter: The name of the API being used for code generation
     * @param    descriptionUrl    Required parameter: The absolute public Uri for an API description doucment
     * @param    dl    Optional parameter: Optional
     * @return    Returns the void response from the API call 
     */
    public void usingUrlAsBinaryAsync(
                final Template template,
                final Format format,
                final String name,
                final String descriptionUrl,
                final Integer dl,
                final APICallBack<InputStream> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/codegen");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5658777809148970132L;
            {
                    put( "template", (template != null) ? template.value() : null );
                    put( "format", (format != null) ? format.value() : null );
                    put( "name", name );
                    put( "descriptionUrl", descriptionUrl );
                    put( "dl", (dl != null) ? dl : 1 );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4967730498455004022L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 401)
                                throw new APIException("Unauthorized: Access is denied due to invalid credentials.", _context);

                            if (_responseCode == 412)
                                throw new APIException("Precondition Failed", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            InputStream _result = _response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Convert an API from the user's account using the API's [API Integration Key](https://docs.apimatic.io/getting-started/manage-apis/#view-api-integration-key). The response is generated zip file as per selected template.
     * > Note: This endpoint does not require Basic Authentication.
     * @param    apikey    Required parameter: The API Key of the pre-configured API
     * @param    template    Required parameter: The template to use for code generation
     * @param    dl    Optional parameter: Optional
     * @return    Returns the void response from the API call 
     */
    public void usingApikeyAsBinaryAsync(
                final String apikey,
                final Template template,
                final Integer dl,
                final APICallBack<InputStream> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/codegen");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4835741871110916231L;
            {
                    put( "apikey", apikey );
                    put( "template", (template != null) ? template.value() : null );
                    put( "dl", (dl != null) ? dl : 1 );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5100170515041431816L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 401)
                                throw new APIException("Unauthorized: Access is denied due to invalid credentials.", _context);

                            if (_responseCode == 412)
                                throw new APIException("Precondition Failed", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            InputStream _result = _response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * The code generation endpoint. The response is a path to the generated zip file relative to https://apimatic.io/
     * > Note: This endpoint does not require Basic Authentication.
     * @param    apikey    Required parameter: The API Key of the pre-configured API
     * @param    template    Required parameter: The template to use for code generation
     * @param    dl    Optional parameter: Optional
     * @return    Returns the void response from the API call 
     */
    public void usingApikeyAsStringAsync(
                final String apikey,
                final Template template,
                final Integer dl,
                final APICallBack<String> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/codegen");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5260130597441105155L;
            {
                    put( "apikey", apikey );
                    put( "template", (template != null) ? template.value() : null );
                    put( "dl", (dl != null) ? dl : 0 );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5502386688384853738L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().get(_queryUrl, _headers, null,
                                        Configuration.basicAuthUserName, Configuration.basicAuthPassword);

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //Error handling using HTTP status codes
                            int _responseCode = _response.getStatusCode();
                            if (_responseCode == 401)
                                throw new APIException("Unauthorized: Access is denied due to invalid credentials.", _context);

                            if (_responseCode == 412)
                                throw new APIException("Precondition Failed", _context);

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}