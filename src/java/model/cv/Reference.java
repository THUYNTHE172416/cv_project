package model.cv;

public class Reference {

    private String awardId;
    private String cvId;
    private String name;

    public Reference() {
    }

    public Reference(String awardId, String cvId, String name) {
        this.awardId = awardId;
        this.cvId = cvId;
        this.name = name;
    }

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId;
    }

    public String getCvId() {
        return cvId;
    }

    public void setCvId(String cvId) {
        this.cvId = cvId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}