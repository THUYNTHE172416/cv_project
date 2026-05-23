package enums;

public enum CvStatus {
    PUBLIC("public"),
    PRIVATE("private");

    private final String value;

    CvStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}