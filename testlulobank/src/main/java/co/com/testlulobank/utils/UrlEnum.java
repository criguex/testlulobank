package co.com.testlulobank.utils;

public enum UrlEnum {
    URI_USER_CREATE("/api/v1/create"),
    URI_GET_USERS("/api/v1/employees"),
    URI_DELETE_USERS("/public/api/v1/delete/"),
    URI_GET_USER("/api/v1/employee/");
    private String value;
    UrlEnum(String value){
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
