package enums;

public enum JobCategoryStatus {
    ACTIVE("active"),
    INACTIVE("inactive");

    private final String value;

    JobCategoryStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}