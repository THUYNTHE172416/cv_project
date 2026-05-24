package enums;

public enum Role {
    CANDIDATE ("candidate"),
    RECRUITER ("recruiter"),
    SYSTEM_ADMIN ("system_admin"),
    ;
    private final String value;
    
    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
