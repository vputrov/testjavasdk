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

package Aspose.Slides.Cloud.Sdk.Auth;

import java.util.Map;
import java.util.HashMap;

import Aspose.Slides.Cloud.Sdk.ApiClient;
import Aspose.Slides.Cloud.Sdk.ApiException;
import Aspose.Slides.Cloud.Sdk.ApiResponse;
import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Response;

public class OAuth extends Authentication {
    private final String appSid;
    private final String appKey;
    private final ApiClient apiClient;
    private String accessToken;
    private String refreshToken;
    private Map<String, Object> grantCredentialsParams;
    
    private Map<String, Object> getGrantCredentialsParams() {
        if (grantCredentialsParams == null) {
            grantCredentialsParams = new HashMap<String, Object>();
            grantCredentialsParams.put("grant_type", "client_credentials");
            grantCredentialsParams.put("client_id", appSid);
            grantCredentialsParams.put("client_secret", appKey);
        }
        return grantCredentialsParams;
    }
    
    private Map<String, Object> getRefreshTokenParams() {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("grant_type", "refresh_token");
        params.put("refresh_token", refreshToken);
        return params;
    }

    public OAuth(String baseUrl, String appSid, String appKey) {
        this.appSid = appSid;
        this.appKey = appKey;
        apiClient = new ApiClient(baseUrl, new Authentication(), false);
    }

    @Override
    public void updateHeaderParams(Map<String, String> headerParams) throws ApiException {
        if (accessToken == null) {
            doTokenRequest(getGrantCredentialsParams());
        }
        headerParams.put("Authorization", "Bearer " + accessToken);
    }

    @Override
    public void handleBadResponse(Response response) throws ApiException {
        if (response.code() == 401) {
            doTokenRequest(getRefreshTokenParams());
            throw new NeedRepeatRequestException();
        }
    }
    
    private synchronized void doTokenRequest(Map<String, Object> formParams) throws ApiException {
        Call call = apiClient.buildCall("/oauth2/token", "POST", null, null, null, formParams, null, null);
        ApiResponse<OAuthResponse> response = apiClient.execute(call, new TypeToken<OAuthResponse>(){}.getType());
        accessToken = response.getData().getAccessToken();
        refreshToken = response.getData().getRefreshToken();
    }
}
