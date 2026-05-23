package model.cv;

import java.time.LocalDateTime;

public class CvAttachment {

    private String cvAttachmentsId;
    private String candidateId;
    private String url;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CvAttachment() {
    }

    public CvAttachment(String cvAttachmentsId, String candidateId, String url, 
                        LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.cvAttachmentsId = cvAttachmentsId;
        this.candidateId = candidateId;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getCvAttachmentsId() {
        return cvAttachmentsId;
    }

    public void setCvAttachmentsId(String cvAttachmentsId) {
        this.cvAttachmentsId = cvAttachmentsId;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}