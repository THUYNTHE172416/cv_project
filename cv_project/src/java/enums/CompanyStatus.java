package enums;

public enum CompanyStatus {

    ACTIVE("actice"),
    INACTIVE("inactive"),
    PENDING("pending"),
    LOCKED("locked");

    private final String value;

    CompanyStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
