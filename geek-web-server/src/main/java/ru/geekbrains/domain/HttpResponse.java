package ru.geekbrains.domain;

import java.util.HashMap;
import java.util.Map;

public class HttpResponse {

    private int statusCode;

    private String statusCodeName;

    private Map<String, String> headers = new HashMap<>();

    private String body;

    public HttpResponse() {
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getStatusCodeName() {
        return statusCodeName;
    }

    public void setStatusCodeName(String statusCodeName) {
        this.statusCodeName = statusCodeName;
    }

    public static HttpResponse.Builder createBuilder() {
        return new HttpResponse.Builder();
    }

    public static class Builder {

        private final HttpResponse httpResponse;

        public Builder() {
            this.httpResponse = new HttpResponse();
        }

        public HttpResponse.Builder withStatusCode(int statusCode) {
            httpResponse.statusCode = statusCode;
            return this;
        }

        public HttpResponse.Builder withStatusCodeName(String statusCodeName) {
            httpResponse.statusCodeName = statusCodeName;
            return this;
        }

        public HttpResponse.Builder withHeaders(Map<String, String> headers) {
            httpResponse.headers = headers;
            return this;
        }

        public HttpResponse.Builder withBody(String body) {
            httpResponse.body = body;
            return this;
        }

        public HttpResponse build() {
            return httpResponse;
        }
    }
}
