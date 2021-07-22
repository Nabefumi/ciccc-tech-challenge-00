package ca.bcit.winter2021.comp2522.midterm.question6;
public class URL {
    private String protocol;
    private String baseURL;
    private String ResourceAddress;
    private String baseUrl;
    private String address;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public URL(String baseUrl, String address, String protocol) {
        this.baseUrl = baseUrl;
        this.address = address;
        this.protocol = protocol;
    }

    public URL(String baseUrl, String address) {
        this.baseUrl = baseUrl;
        this.address = address;
        this.protocol = "https://";
    }

    public String getBaseUrl() {
        return baseUrl;
    }
    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return protocol + "://www." + baseUrl + "/" + address;
    }
}