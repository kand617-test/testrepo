/*
 * CodeGenAndTransformerAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import io.apimatic.*;
import io.apimatic.models.*;
import io.apimatic.exceptions.*;
import io.apimatic.http.client.HttpClient;
import io.apimatic.http.client.HttpContext;
import io.apimatic.http.request.HttpRequest;
import io.apimatic.http.response.HttpResponse;
import io.apimatic.http.response.HttpStringResponse;
import io.apimatic.http.client.APICallBack;

public class APIDescriptionValidationController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static APIDescriptionValidationController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the APIDescriptionValidationController class 
     */
    public static APIDescriptionValidationController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new APIDescriptionValidationController();
            }
        }
        return instance;
    }

    /**
     * This endpoint can be used to validate an API description document *on the fly* and see detailed error messages along with any warnings or useful information.
     * @param    body    Required parameter: The input file to use for validation
     * @return    Returns the void response from the API call 
     */
    public void usingFileAsync(
                final File body,
                final APICallBack<ValidateAnAPIDescriptionResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/validate");
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4913234496174514796L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4624440867588894655L;
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

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            ValidateAnAPIDescriptionResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ValidateAnAPIDescriptionResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
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
     * This endpoint can be used to validate an API description document *on the fly* from its public Uri, and see detailed error messages along with any warnings or useful information. This endpoint is useful for API descriptions with relative links e.g., includes (RAML) and paths (swagger).
     * @param    descriptionUrl    Required parameter: The absolute public Uri for an API description doucment
     * @return    Returns the void response from the API call 
     */
    public void usingUrlAsync(
                final String descriptionUrl,
                final APICallBack<ValidateAnAPIDescriptionResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/validate");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4708442697899052985L;
            {
                    put( "descriptionUrl", descriptionUrl );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5403076593527185840L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
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

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            ValidateAnAPIDescriptionResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ValidateAnAPIDescriptionResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
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
     * This endpoint can be used to validate a *pre-configured* API description and see detailed error messages along with any warnings or useful information.
     * @param    apikey    Required parameter: The API Key of a pre-configured API description from APIMATIC
     * @return    Returns the void response from the API call 
     */
    public void usingApikeyAsync(
                final String apikey,
                final APICallBack<ValidateAnAPIDescriptionResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/validate");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5046147288470482006L;
            {
                    put( "apikey", apikey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5471882107359591100L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
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

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            ValidateAnAPIDescriptionResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ValidateAnAPIDescriptionResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
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