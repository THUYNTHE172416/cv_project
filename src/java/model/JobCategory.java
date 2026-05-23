package model;

import enums.JobCategoryStatus;
import java.time.LocalDateTime;

public class JobCategory {

    private String jobCategoryId;
    private String name;
    private String description;
    private String iconUrl;
    private JobCategoryStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public JobCategory() {
    }

    public JobCategory(String jobCategoryId, String name, String description, String iconUrl, 
                       JobCategoryStatus status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.jobCategoryId = jobCategoryId;
        this.name = name;
        this.description = description;
        this.iconUrl = iconUrl;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public JobCategoryStatus getStatus() {
        return status;
    }

    public void setStatus(JobCategoryStatus status) {
        this.status = status;
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