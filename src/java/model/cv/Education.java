package model.cv;

import java.time.LocalDateTime;

public class Education {

    private String educationId;
    private String cvId;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private String schoolName;
    private String major;
    private String description;

    public Education() {
    }

    public Education(String educationId, String cvId, LocalDateTime dateStart, LocalDateTime dateEnd, 
                     String schoolName, String major, String description) {
        this.educationId = educationId;
        this.cvId = cvId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.schoolName = schoolName;
        this.major = major;
        this.description = description;
    }

    public String getEducationId() {
        return educationId;
    }

    public void setEducationId(String educationId) {
        this.educationId = educationId;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}