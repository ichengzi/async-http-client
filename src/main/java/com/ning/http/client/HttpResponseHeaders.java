/*
 * Copyright 2010 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.ning.http.client;

/**
 * A class that represent the HTTP headers.
 */
public class HttpResponseHeaders extends HttpContent {

    private final boolean traillingHeaders;

    public HttpResponseHeaders(Response response) {
        super(response);
        this.traillingHeaders = false;
    }

    public HttpResponseHeaders(Response response, boolean traillingHeaders) {
        super(response);
        this.traillingHeaders = traillingHeaders;
    }

    /**
     * Return the HTTP header
     * @return an {@link Headers}
     */
    public Headers getHeaders(){
        return response.getHeaders();
    }

    /**
     * Return true is headers has been received after the response body.
     * @return true is headers has been received after the response body.
     */
    public boolean isTraillingHeadersReceived(){
        return traillingHeaders;
    }
}
