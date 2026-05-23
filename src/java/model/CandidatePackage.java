package model;

import java.time.LocalDateTime;

public class CandidatePackage {

    private String candidatePackageId;
    private String candidateId;
    private String packageId;
    private Float price;
    private String name;
    private LocalDateTime buyAt;
    private LocalDateTime expiredAt;

    public CandidatePackage() {
    }

    public CandidatePackage(String candidatePackageId, String candidateId, String packageId, 
                            Float price, String name, LocalDateTime buyAt, LocalDateTime expiredAt) {
        this.candidatePackageId = candidatePackageId;
        this.candidateId = candidateId;
        this.packageId = packageId;
        this.price = price;
        this.name = name;
        this.buyAt = buyAt;
        this.expiredAt = expiredAt;
    }

    public String getCandidatePackageId() {
        return candidatePackageId;
    }

    public void setCandidatePackageId(String candidatePackageId) {
        this.candidatePackageId = candidatePackageId;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
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