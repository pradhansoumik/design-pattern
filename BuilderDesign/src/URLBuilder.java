public class URLBuilder {
    public static class Builder{
        private String protocol;
        private String hostname;
        private String port;
        private String pathParam;
        private String queryParam;
        public Builder protocol(String protocol){
            this.protocol = protocol;
            return this;
        }
        public Builder hostname(String hostname){
            this.hostname = hostname;
            return this;
        }
        public Builder port(String port){
            this.port = port;
            return this;
        }
        public Builder pathParam(String pathParam){
            this.pathParam = pathParam;
            return this;
        }
        public Builder queryParam(String queryParam){
            this.queryParam = queryParam;
            return this;
        }
        public URLBuilder build(){
            return new URLBuilder(this);
        }
    }
    public final String protocol;
    public final String hostname;
    public final String port;
    public final String pathParam;
    public final String qparam;

    private URLBuilder(Builder builder){
        this.protocol = builder.protocol;
        this.hostname = builder.hostname;
        this.pathParam = builder.pathParam;
        this.port = builder.port;
        this.qparam = builder.queryParam;
    }
}