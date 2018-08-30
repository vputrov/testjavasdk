/*
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose">
 *   Copyright (c) 2018 Aspose.Slides for Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package Aspose.Slides.Cloud.Sdk.Api;

import Aspose.Slides.Cloud.Sdk.ApiCallback;
import Aspose.Slides.Cloud.Sdk.ApiClient;
import Aspose.Slides.Cloud.Sdk.ApiException;
import Aspose.Slides.Cloud.Sdk.ApiResponse;
import Aspose.Slides.Cloud.Sdk.Configuration;
import Aspose.Slides.Cloud.Sdk.Pair;
import Aspose.Slides.Cloud.Sdk.ProgressRequestBody;
import Aspose.Slides.Cloud.Sdk.ProgressResponseBody;
import Aspose.Slides.Cloud.Sdk.Auth.NeedRepeatRequestException;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import Aspose.Slides.Cloud.Sdk.Model.ExportOptions;
import java.io.File;
import Aspose.Slides.Cloud.Sdk.Model.Slide;
import Aspose.Slides.Cloud.Sdk.Model.SlideBackground;
import Aspose.Slides.Cloud.Sdk.Model.SlideBackgroundResponse;
import Aspose.Slides.Cloud.Sdk.Model.SlideCommentsResponse;
import Aspose.Slides.Cloud.Sdk.Model.SlideListResponse;
import Aspose.Slides.Cloud.Sdk.Model.SlideResponse;
import Aspose.Slides.Cloud.Sdk.Model.Request.DeleteSlideByIndexRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.DeleteSlidesCleanSlidesListRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.DeleteSlidesSlideBackgroundRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.GetSlideWithFormatRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.GetSlidesSlideRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.GetSlidesSlideBackgroundRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.GetSlidesSlideCommentsRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.GetSlidesSlidesListRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.PostSlideSaveAsRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.PostSlidesReorderPositionRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.PutSlidesSlideRequest;
import Aspose.Slides.Cloud.Sdk.Model.Request.PutSlidesSlideBackgroundRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Aspose.Slides.Cloud.Sdk.Configuration;
import Aspose.Slides.Cloud.Sdk.FileInfo;

public class SlidesApi extends ApiBase {
    public SlidesApi(Configuration configuration) {
        super(configuration);
    }

    public SlidesApi(String appSid, String appKey) {
        super(appSid, appKey);
    }

    /**
     * Build call for deleteSlideByIndex
     * @param request Request for deleteSlideByIndex. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlideByIndexCall(DeleteSlideByIndexRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlideByIndex(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlideByIndex(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Delete presentation slide by its index.
     * 
     * @param request Request for deleteSlideByIndex. (required)
     * @return SlideListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideListResponse deleteSlideByIndex(DeleteSlideByIndexRequest request) throws ApiException {
        try {
            ApiResponse<SlideListResponse> resp = deleteSlideByIndexWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideListResponse> resp = deleteSlideByIndexWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Delete presentation slide by its index.
     * 
     * @param request Request for deleteSlideByIndex. (required)
     * @return ApiResponse&lt;SlideListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideListResponse> deleteSlideByIndexWithHttpInfo(DeleteSlideByIndexRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlideByIndexCall(request, null, null);
        Type returnType = new TypeToken<SlideListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Delete presentation slide by its index. (asynchronously)
     * 
     * @param request Request for deleteSlideByIndex. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlideByIndexAsync(DeleteSlideByIndexRequest request, final ApiCallback<SlideListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlideByIndexCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlidesCleanSlidesList
     * @param request Request for deleteSlidesCleanSlidesList. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesCleanSlidesListCall(DeleteSlidesCleanSlidesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlidesCleanSlidesList(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "slides", request.getSlides());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Delete presentation slides.
     * 
     * @param request Request for deleteSlidesCleanSlidesList. (required)
     * @return SlideListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideListResponse deleteSlidesCleanSlidesList(DeleteSlidesCleanSlidesListRequest request) throws ApiException {
        try {
            ApiResponse<SlideListResponse> resp = deleteSlidesCleanSlidesListWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideListResponse> resp = deleteSlidesCleanSlidesListWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Delete presentation slides.
     * 
     * @param request Request for deleteSlidesCleanSlidesList. (required)
     * @return ApiResponse&lt;SlideListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideListResponse> deleteSlidesCleanSlidesListWithHttpInfo(DeleteSlidesCleanSlidesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlidesCleanSlidesListCall(request, null, null);
        Type returnType = new TypeToken<SlideListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Delete presentation slides. (asynchronously)
     * 
     * @param request Request for deleteSlidesCleanSlidesList. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesCleanSlidesListAsync(DeleteSlidesCleanSlidesListRequest request, final ApiCallback<SlideListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlidesCleanSlidesListCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for deleteSlidesSlideBackground
     * @param request Request for deleteSlidesSlideBackground. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesSlideBackgroundCall(DeleteSlidesSlideBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteSlidesSlideBackground(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling deleteSlidesSlideBackground(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/background"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "DELETE", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Remove presentation slide background color.
     * 
     * @param request Request for deleteSlidesSlideBackground. (required)
     * @return SlideBackgroundResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideBackgroundResponse deleteSlidesSlideBackground(DeleteSlidesSlideBackgroundRequest request) throws ApiException {
        try {
            ApiResponse<SlideBackgroundResponse> resp = deleteSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideBackgroundResponse> resp = deleteSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Remove presentation slide background color.
     * 
     * @param request Request for deleteSlidesSlideBackground. (required)
     * @return ApiResponse&lt;SlideBackgroundResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideBackgroundResponse> deleteSlidesSlideBackgroundWithHttpInfo(DeleteSlidesSlideBackgroundRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteSlidesSlideBackgroundCall(request, null, null);
        Type returnType = new TypeToken<SlideBackgroundResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Remove presentation slide background color. (asynchronously)
     * 
     * @param request Request for deleteSlidesSlideBackground. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSlidesSlideBackgroundAsync(DeleteSlidesSlideBackgroundRequest request, final ApiCallback<SlideBackgroundResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteSlidesSlideBackgroundCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideBackgroundResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlideWithFormat
     * @param request Request for getSlideWithFormat. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlideWithFormatCall(GetSlideWithFormatRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlideWithFormat(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlideWithFormat(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling getSlideWithFormat(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/saveAs/{format}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "format" + "\\}", getApiClient().escapeString(request.getFormat().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "width", request.getWidth());
        getApiClient().addQueryParameter(queryParams, "height", request.getHeight());
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "outPath", request.getOutPath());
        getApiClient().addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Convert slide to some format.
     * 
     * @param request Request for getSlideWithFormat. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File getSlideWithFormat(GetSlideWithFormatRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = getSlideWithFormatWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = getSlideWithFormatWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Convert slide to some format.
     * 
     * @param request Request for getSlideWithFormat. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> getSlideWithFormatWithHttpInfo(GetSlideWithFormatRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlideWithFormatCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Convert slide to some format. (asynchronously)
     * 
     * @param request Request for getSlideWithFormat. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlideWithFormatAsync(GetSlideWithFormatRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlideWithFormatCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlide
     * @param request Request for getSlidesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideCall(GetSlidesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlide(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read slide info.
     * 
     * @param request Request for getSlidesSlide. (required)
     * @return SlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideResponse getSlidesSlide(GetSlidesSlideRequest request) throws ApiException {
        try {
            ApiResponse<SlideResponse> resp = getSlidesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideResponse> resp = getSlidesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read slide info.
     * 
     * @param request Request for getSlidesSlide. (required)
     * @return ApiResponse&lt;SlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideResponse> getSlidesSlideWithHttpInfo(GetSlidesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideCall(request, null, null);
        Type returnType = new TypeToken<SlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read slide info. (asynchronously)
     * 
     * @param request Request for getSlidesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideAsync(GetSlidesSlideRequest request, final ApiCallback<SlideResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlideBackground
     * @param request Request for getSlidesSlideBackground. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideBackgroundCall(GetSlidesSlideBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlideBackground(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlideBackground(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/background"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation slide background color type.
     * 
     * @param request Request for getSlidesSlideBackground. (required)
     * @return SlideBackgroundResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideBackgroundResponse getSlidesSlideBackground(GetSlidesSlideBackgroundRequest request) throws ApiException {
        try {
            ApiResponse<SlideBackgroundResponse> resp = getSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideBackgroundResponse> resp = getSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation slide background color type.
     * 
     * @param request Request for getSlidesSlideBackground. (required)
     * @return ApiResponse&lt;SlideBackgroundResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideBackgroundResponse> getSlidesSlideBackgroundWithHttpInfo(GetSlidesSlideBackgroundRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideBackgroundCall(request, null, null);
        Type returnType = new TypeToken<SlideBackgroundResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation slide background color type. (asynchronously)
     * 
     * @param request Request for getSlidesSlideBackground. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideBackgroundAsync(GetSlidesSlideBackgroundRequest request, final ApiCallback<SlideBackgroundResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlideBackgroundCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideBackgroundResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlideComments
     * @param request Request for getSlidesSlideComments. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideCommentsCall(GetSlidesSlideCommentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlideComments(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling getSlidesSlideComments(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/comments"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation slide comments.
     * 
     * @param request Request for getSlidesSlideComments. (required)
     * @return SlideCommentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideCommentsResponse getSlidesSlideComments(GetSlidesSlideCommentsRequest request) throws ApiException {
        try {
            ApiResponse<SlideCommentsResponse> resp = getSlidesSlideCommentsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideCommentsResponse> resp = getSlidesSlideCommentsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation slide comments.
     * 
     * @param request Request for getSlidesSlideComments. (required)
     * @return ApiResponse&lt;SlideCommentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideCommentsResponse> getSlidesSlideCommentsWithHttpInfo(GetSlidesSlideCommentsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlideCommentsCall(request, null, null);
        Type returnType = new TypeToken<SlideCommentsResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation slide comments. (asynchronously)
     * 
     * @param request Request for getSlidesSlideComments. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlideCommentsAsync(GetSlidesSlideCommentsRequest request, final ApiCallback<SlideCommentsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlideCommentsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideCommentsResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getSlidesSlidesList
     * @param request Request for getSlidesSlidesList. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlidesListCall(GetSlidesSlidesListRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getSlidesSlidesList(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "GET", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Read presentation slides info.
     * 
     * @param request Request for getSlidesSlidesList. (required)
     * @return SlideListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideListResponse getSlidesSlidesList(GetSlidesSlidesListRequest request) throws ApiException {
        try {
            ApiResponse<SlideListResponse> resp = getSlidesSlidesListWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideListResponse> resp = getSlidesSlidesListWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Read presentation slides info.
     * 
     * @param request Request for getSlidesSlidesList. (required)
     * @return ApiResponse&lt;SlideListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideListResponse> getSlidesSlidesListWithHttpInfo(GetSlidesSlidesListRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getSlidesSlidesListCall(request, null, null);
        Type returnType = new TypeToken<SlideListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Read presentation slides info. (asynchronously)
     * 
     * @param request Request for getSlidesSlidesList. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSlidesSlidesListAsync(GetSlidesSlidesListRequest request, final ApiCallback<SlideListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSlidesSlidesListCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlideSaveAs
     * @param request Request for postSlideSaveAs. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlideSaveAsCall(PostSlideSaveAsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlideSaveAs(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling postSlideSaveAs(Async)");
        }
        
        // verify the required parameter 'format' is set
        if (request.getFormat() == null) {
            throw new ApiException("Missing the required parameter 'format' when calling postSlideSaveAs(Async)");
        }
        
        Object postBody = request.getOptions();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/saveAs/{format}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()))
            .replaceAll("\\{" + "format" + "\\}", getApiClient().escapeString(request.getFormat().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "width", request.getWidth());
        getApiClient().addQueryParameter(queryParams, "height", request.getHeight());
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "outPath", request.getOutPath());
        getApiClient().addQueryParameter(queryParams, "fontsFolder", request.getFontsFolder());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "multipart/form-data"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Convert slide to some format.
     * 
     * @param request Request for postSlideSaveAs. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File postSlideSaveAs(PostSlideSaveAsRequest request) throws ApiException {
        try {
            ApiResponse<File> resp = postSlideSaveAsWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<File> resp = postSlideSaveAsWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Convert slide to some format.
     * 
     * @param request Request for postSlideSaveAs. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> postSlideSaveAsWithHttpInfo(PostSlideSaveAsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlideSaveAsCall(request, null, null);
        Type returnType = new TypeToken<File>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Convert slide to some format. (asynchronously)
     * 
     * @param request Request for postSlideSaveAs. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlideSaveAsAsync(PostSlideSaveAsRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlideSaveAsCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postSlidesReorderPosition
     * @param request Request for postSlidesReorderPosition. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postSlidesReorderPositionCall(PostSlidesReorderPositionRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling postSlidesReorderPosition(Async)");
        }
        
        Object postBody = null;

        // create path and map variables
        String path = "/slides/{name}/slides"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "oldPosition", request.getOldPosition());
        getApiClient().addQueryParameter(queryParams, "newPosition", request.getNewPosition());
        getApiClient().addQueryParameter(queryParams, "slideToCopy", request.getSlideToCopy());
        getApiClient().addQueryParameter(queryParams, "position", request.getPosition());
        getApiClient().addQueryParameter(queryParams, "slideToClone", request.getSlideToClone());
        getApiClient().addQueryParameter(queryParams, "source", request.getSource());
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "layoutAlias", request.getLayoutAlias());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "POST", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Reorder presentation slide position
     * 
     * @param request Request for postSlidesReorderPosition. (required)
     * @return SlideListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideListResponse postSlidesReorderPosition(PostSlidesReorderPositionRequest request) throws ApiException {
        try {
            ApiResponse<SlideListResponse> resp = postSlidesReorderPositionWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideListResponse> resp = postSlidesReorderPositionWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Reorder presentation slide position
     * 
     * @param request Request for postSlidesReorderPosition. (required)
     * @return ApiResponse&lt;SlideListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideListResponse> postSlidesReorderPositionWithHttpInfo(PostSlidesReorderPositionRequest request) throws ApiException {
        com.squareup.okhttp.Call call = postSlidesReorderPositionCall(request, null, null);
        Type returnType = new TypeToken<SlideListResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Reorder presentation slide position (asynchronously)
     * 
     * @param request Request for postSlidesReorderPosition. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postSlidesReorderPositionAsync(PostSlidesReorderPositionRequest request, final ApiCallback<SlideListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postSlidesReorderPositionCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideListResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesSlide
     * @param request Request for putSlidesSlide. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideCall(PutSlidesSlideRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSlide(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlidesSlide(Async)");
        }
        
        Object postBody = request.getSlideDto();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Update slide properties.
     * 
     * @param request Request for putSlidesSlide. (required)
     * @return SlideResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideResponse putSlidesSlide(PutSlidesSlideRequest request) throws ApiException {
        try {
            ApiResponse<SlideResponse> resp = putSlidesSlideWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideResponse> resp = putSlidesSlideWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Update slide properties.
     * 
     * @param request Request for putSlidesSlide. (required)
     * @return ApiResponse&lt;SlideResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideResponse> putSlidesSlideWithHttpInfo(PutSlidesSlideRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSlideCall(request, null, null);
        Type returnType = new TypeToken<SlideResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Update slide properties. (asynchronously)
     * 
     * @param request Request for putSlidesSlide. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideAsync(PutSlidesSlideRequest request, final ApiCallback<SlideResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesSlideCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putSlidesSlideBackground
     * @param request Request for putSlidesSlideBackground. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideBackgroundCall(PutSlidesSlideBackgroundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (request.getName() == null) {
            throw new ApiException("Missing the required parameter 'name' when calling putSlidesSlideBackground(Async)");
        }
        
        // verify the required parameter 'slideIndex' is set
        if (request.getSlideIndex() == null) {
            throw new ApiException("Missing the required parameter 'slideIndex' when calling putSlidesSlideBackground(Async)");
        }
        
        Object postBody = request.getBackground();

        // create path and map variables
        String path = "/slides/{name}/slides/{slideIndex}/background"
            .replaceAll("\\{" + "name" + "\\}", getApiClient().escapeString(request.getName().toString()))
            .replaceAll("\\{" + "slideIndex" + "\\}", getApiClient().escapeString(request.getSlideIndex().toString()));

        List<Pair> queryParams = new ArrayList<Pair>();
        getApiClient().addQueryParameter(queryParams, "folder", request.getFolder());
        getApiClient().addQueryParameter(queryParams, "password", request.getPassword());
        getApiClient().addQueryParameter(queryParams, "storage", request.getStorage());
        getApiClient().addQueryParameter(queryParams, "color", request.getColor());

        Map<String, String> headerParams = new HashMap<String, String>();

        Map<String, Object> formParams = new HashMap<String, Object>();

        final String[] accepts = {
            "application/json"
        };
        final String accept = getApiClient().selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "application/json"
        };
        final String contentType = getApiClient().selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if(progressListener != null) {
            getApiClient().getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        return getApiClient().buildCall(path, "PUT", queryParams, postBody, headerParams, formParams, null, progressRequestListener);
    }

    /**
     * Set presentation slide background color.
     * 
     * @param request Request for putSlidesSlideBackground. (required)
     * @return SlideBackgroundResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SlideBackgroundResponse putSlidesSlideBackground(PutSlidesSlideBackgroundRequest request) throws ApiException {
        try {
            ApiResponse<SlideBackgroundResponse> resp = putSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        } catch (NeedRepeatRequestException e) {
            ApiResponse<SlideBackgroundResponse> resp = putSlidesSlideBackgroundWithHttpInfo(request);
            return resp.getData();
        }
    }

    /**
     * Set presentation slide background color.
     * 
     * @param request Request for putSlidesSlideBackground. (required)
     * @return ApiResponse&lt;SlideBackgroundResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SlideBackgroundResponse> putSlidesSlideBackgroundWithHttpInfo(PutSlidesSlideBackgroundRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putSlidesSlideBackgroundCall(request, null, null);
        Type returnType = new TypeToken<SlideBackgroundResponse>(){}.getType();
        return getApiClient().execute(call, returnType);
    }

    /**
     * Set presentation slide background color. (asynchronously)
     * 
     * @param request Request for putSlidesSlideBackground. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call putSlidesSlideBackgroundAsync(PutSlidesSlideBackgroundRequest request, final ApiCallback<SlideBackgroundResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = putSlidesSlideBackgroundCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<SlideBackgroundResponse>(){}.getType();
        getApiClient().executeAsync(call, returnType, callback);
        return call;
    }
}
