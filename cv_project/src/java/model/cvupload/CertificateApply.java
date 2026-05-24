package model.cvupload;

import java.time.LocalDateTime;

public class CertificateApply {

    private String certificateId;
    private String cvId;
    private LocalDateTime issueDate;
    private String name;

    public CertificateApply() {
    }

    public CertificateApply(String certificateId, String cvId, LocalDateTime issueDate, String name) {
        this.certificateId = certificateId;
        this.cvId = cvId;
        this.issueDate = issueDate;
        this.name = name;
    }

    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
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