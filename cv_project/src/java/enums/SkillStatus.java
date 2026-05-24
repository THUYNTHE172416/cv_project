package enums;

public enum SkillStatus {
    ACTIVE("active"),
    INACTIVE("inactive");

    private final String value;

    SkillStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}