package model.cv;

import java.time.LocalDateTime;

public class WorkExperience {

    private String experienceId;
    private String cvId;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private String companyName;
    private String position;
    private String description;

    public WorkExperience() {
    }

    public WorkExperience(String experienceId, String cvId, LocalDateTime dateStart, 
                          LocalDateTime dateEnd, String companyName, String position, String description) {
        this.experienceId = experienceId;
        this.cvId = cvId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.companyName = companyName;
        this.position = position;
        this.description = description;
    }

    public String getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(String experienceId) {
        this.experienceId = experienceId;
    }

    public String getCvId() {
        return cvId;
    }

    public void setCvId(String cvId) {
        this.cvId = cvId;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}