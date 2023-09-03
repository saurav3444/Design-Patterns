package org.example.builder;

public class HttpClient {

    private String method;
    private String url;
    private String username;
    private String password;

    public HttpClient(HttpClientBuilder httpClientBuilder){

        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.username = httpClientBuilder.username;
        this.password = httpClientBuilder.password;
    }

    public static class HttpClientBuilder {

        private String method;
        private String url;
        private String username;
        private String password;


        public HttpClientBuilder(){

        }

        public HttpClientBuilder method(String method){
            this.method = method;
            return this;
        }
        public HttpClientBuilder url(String url){
            this.url = url;
            return this;
        }

        public HttpClientBuilder username(String username){
            this.username = username;
            return this;
        }

        public HttpClientBuilder password(String password){
            this.password = password;
            return this;
        }

        public HttpClient build(){
            return new HttpClient(this);
        }


    }
    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
