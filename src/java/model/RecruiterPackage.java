package model;

import java.time.LocalDateTime;

public class RecruiterPackage {

    private String recruiterPackageId;
    private String recruiterId;
    private String packageId;
    private Float price;
    private String name;
    private LocalDateTime buyAt;
    private LocalDateTime expiredAt;

    public RecruiterPackage() {
    }

    public RecruiterPackage(String recruiterPackageId, String recruiterId, String packageId, 
                            Float price, String name, LocalDateTime buyAt, LocalDateTime expiredAt) {
        this.recruiterPackageId = recruiterPackageId;
        this.recruiterId = recruiterId;
        this.packageId = packageId;
        this.price = price;
        this.name = name;
        this.buyAt = buyAt;
        this.expiredAt = expiredAt;
    }

    public String getRecruiterPackageId() {
        return recruiterPackageId;
    }

    public void setRecruiterPackageId(String recruiterPackageId) {
        this.recruiterPackageId = recruiterPackageId;
    }

    public String getRecruiterId() {
        return recruiterId;
    }

    public void setRecruiterId(String recruiterId) {
        this.recruiterId = recruiterId;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBuyAt() {
        return buyAt;
    }

    public void setBuyAt(LocalDateTime buyAt) {
        this.buyAt = buyAt;
    }

    public LocalDateTime getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }
}