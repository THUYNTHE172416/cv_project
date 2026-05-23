package enums;

public enum JobStatus {
    ACTIVE("active"),
    INACTIVE("inactive"),
    LOCKED("locked");

    private final String value;

    JobStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}