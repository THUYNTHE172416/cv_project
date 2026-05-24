package model.cv;

import enums.CvStatus;
import java.time.LocalDateTime;

public class Cv {

    private String cvId;
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
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private CvStatus status;

    public Cv() {
    }

    public Cv(String cvId, String candidateId, String fullName, String expectedJobTitle, 
              String avatarUrl, Boolean gender, String phoneNumber, String email, 
              String website, String address, String careerObjective, String hobby, 
              LocalDateTime createdAt, LocalDateTime updatedAt, CvStatus status) {
        this.cvId = cvId;
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
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }

    public String getCvId() {
        return cvId;
    }

    public void setCvId(String cvId) {
        this.cvId = cvId;
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

    public CvStatus getStatus() {
        return status;
    }

    public void setStatus(CvStatus status) {
        this.status = status;
    }
}