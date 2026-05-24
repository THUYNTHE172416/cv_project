package enums;

public enum ApplyStatus {
    PENDING("pending"),
    APPROVE("approve"),
    REJECT("reject");

    private final String value;

    ApplyStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}