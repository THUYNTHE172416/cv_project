package enums;

public enum ApplyType {
    SYSTEM_CV("system_cv"),
    ATTACHED_CV("attached_cv");

    private final String value;

    ApplyType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}