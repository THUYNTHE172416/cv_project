package model.cvupload;

import enums.ApplyStatus;
import enums.ApplyType;
import java.time.LocalDateTime;

public class CvApply {

    private String cvId;
    private String jobId;
    private String candidateId;
    private String fullName;
    private String expectedJobTitle;
    private String avatarUrl;
    private Boolean gender;
    private String phoneNumber;
    private String email;
    private String website;
    private String address;
    private String careerObjective;
    private String hobby;
    private Float score;
    private Boolean isReading;
    private ApplyType applyType;
    private ApplyStatus status;
    private String attachmentUrl;
    private LocalDateTime applyAt;

    public CvApply() {
    }

    public CvApply(String cvId, String jobId, String candidateId, String fullName, 
                   String expectedJobTitle, String avatarUrl, Boolean gender, 
                   String phoneNumber, String email, String website, String address, 
                   String careerObjective, String hobby, Float score, Boolean isReading, 
                   ApplyType applyType, ApplyStatus status, String attachmentUrl, LocalDateTime applyAt) {
        this.cvId = cvId;
        this.jobId = jobId;
        this.candidateId = candidateId;
        this.fullName = fullName;
        this.expectedJobTitle = expectedJobTitle;
        this.avatarUrl = avatarUrl;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.website = website;
        this.address = address;
        this.careerObjective = careerObjective;
        this.hobby = hobby;
        this.score = score;
        this.isReading = isReading;
        this.applyType = applyType;
        this.status = status;
        this.attachmentUrl = attachmentUrl;
        this.applyAt = applyAt;
    }

    public String getCvId() {
        return cvId;
    }

    public void setCvId(String cvId) {
        this.cvId = cvId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getExpectedJobTitle() {
        return expectedJobTitle;
    }

    public void setExpectedJobTitle(String expectedJobTitle) {
        this.expectedJobTitle = expectedJobTitle;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCareerObjective() {
        return careerObjective;
    }

    public void setCareerObjective(String careerObjective) {
        this.careerObjective = careerObjective;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Boolean getIsReading() {
        return isReading;
    }

    public void setIsReading(Boolean isReading) {
        this.isReading = isReading;
    }

    public ApplyType getApplyType() {
        return applyType;
    }

    public void setApplyType(ApplyType applyType) {
        this.applyType = applyType;
    }

    public ApplyStatus getStatus() {
        return status;
    }

    public void setStatus(ApplyStatus status) {
        this.status = status;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    public LocalDateTime getApplyAt() {
        return applyAt;
    }

    public void setApplyAt(LocalDateTime applyAt) {
        this.applyAt = applyAt;
    }
}