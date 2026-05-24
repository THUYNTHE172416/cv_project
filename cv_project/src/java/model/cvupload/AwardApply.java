package model.cvupload;

import java.time.LocalDateTime;

public class AwardApply {

    private String awardId;
    private String cvId;
    private LocalDateTime issueDate;
    private String name;

    public AwardApply() {
    }

    public AwardApply(String awardId, String cvId, LocalDateTime issueDate, String name) {
        this.awardId = awardId;
        this.cvId = cvId;
        this.issueDate = issueDate;
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

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}