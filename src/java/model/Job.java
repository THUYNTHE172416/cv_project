package model;

import enums.JobStatus;
import java.time.LocalDateTime;
import java.util.List;

public class Job {

    private String jobId;
    private String companyId;
    private String userCreated;
    private String salary;
    private String location;
    private String experience;
    private List<String> level;
    private int quantity;
    private LocalDateTime expiredAt;
    private String description;
    private String requirements;
    private String benefits;
    private JobStatus status;
    private LocalDateTime approveAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Job() {
    }

    public Job(String jobId, String companyId, String userCreated, String salary, String location, 
               String experience, List<String> level, int quantity, LocalDateTime expiredAt, 
               String description, String requirements, String benefits, JobStatus status, 
               LocalDateTime approveAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.jobId = jobId;
        this.companyId = companyId;
        this.userCreated = userCreated;
        this.salary = salary;
        this.location = location;
        this.experience = experience;
        this.level = level;
        this.quantity = quantity;
        this.expiredAt = expiredAt;
        this.description = description;
        this.requirements = requirements;
        this.benefits = benefits;
        this.status = status;
        this.approveAt = approveAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public List<String> getLevel() {
        return level;
    }

    public void setLevel(List<String> level) {
        this.level = level;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDateTime getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public LocalDateTime getApproveAt() {
        return approveAt;
    }

    public void setApproveAt(LocalDateTime approveAt) {
        this.approveAt = approveAt;
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