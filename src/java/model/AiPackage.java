package model;

import enums.AiPackageFeature;
import enums.AiPackageStatus;
import java.time.LocalDateTime;

public class AiPackage {

    private String packageId;
    private String name;
    private Float price;
    private Integer durationMonths;
    private AiPackageFeature features;
    private AiPackageStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public AiPackage() {
    }

    public AiPackage(String packageId, String name, Float price, Integer durationMonths, 
                     AiPackageFeature features, AiPackageStatus status, 
                     LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.packageId = packageId;
        this.name = name;
        this.price = price;
        this.durationMonths = durationMonths;
        this.features = features;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(Integer durationMonths) {
        this.durationMonths = durationMonths;
    }

    public AiPackageFeature getFeatures() {
        return features;
    }

    public void setFeatures(AiPackageFeature features) {
        this.features = features;
    }

    public AiPackageStatus getStatus() {
        return status;
    }

    public void setStatus(AiPackageStatus status) {
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