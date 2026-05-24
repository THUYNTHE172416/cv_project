package model;

import enums.CompanyStatus;

import java.time.LocalDateTime;

public class Company {

    private String companyId;

    private String userCreated;

    private String companyName;

    private String taxCode;

    private String companySize;

    private String address;

    private String email;

    private String phoneNumber;

    private String description;

    private String logoUrl;

    private String websiteUrl;

    private String registrationCertificateUrl;

    private CompanyStatus status;

    private LocalDateTime approveAt;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public Company() {
    }

    public Company(String companyId, String userCreated, String companyName,
                   String taxCode, String companySize, String address,
                   String email, String phoneNumber, String description,
                   String logoUrl, String websiteUrl,
                   String registrationCertificateUrl,
                   CompanyStatus status, LocalDateTime approveAt,
                   LocalDateTime createdAt, LocalDateTime updatedAt) {

        this.companyId = companyId;
        this.userCreated = userCreated;
        this.companyName = companyName;
        this.taxCode = taxCode;
        this.companySize = companySize;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.description = description;
        this.logoUrl = logoUrl;
        this.websiteUrl = websiteUrl;
        this.registrationCertificateUrl = registrationCertificateUrl;
        this.status = status;
        this.approveAt = approveAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getRegistrationCertificateUrl() {
        return registrationCertificateUrl;
    }

    public void setRegistrationCertificateUrl(String registrationCertificateUrl) {
        this.registrationCertificateUrl = registrationCertificateUrl;
    }

    public CompanyStatus getStatus() {
        return status;
    }

    public void setStatus(CompanyStatus status) {
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