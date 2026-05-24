package enums;

public enum AiPackageFeature {
    CANDIDATE("candidate"),
    RECRUITER("recruiter");

    private final String value;

    AiPackageFeature(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}