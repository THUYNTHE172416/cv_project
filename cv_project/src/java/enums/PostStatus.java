package enums;

public enum PostStatus {
    PENDING("pending"),
    APPROVE("approve"),
    REJECT("reject");

    private final String value;

    PostStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
