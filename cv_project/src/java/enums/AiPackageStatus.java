package enums;

public enum AiPackageStatus {
    ACTIVE("active"),
    INACTIVE("inactive");

    private final String value;

    AiPackageStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}