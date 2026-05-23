package model.cv;

import java.time.LocalDateTime;

public class Project {

    private String projectId;
    private String cvId;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private String projectName;
    private String position;
    private String description;

    public Project() {
    }

    public Project(String projectId, String cvId, LocalDateTime dateStart, LocalDateTime dateEnd, 
                   String projectName, String position, String description) {
        this.projectId = projectId;
        this.cvId = cvId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.projectName = projectName;
        this.position = position;
        this.description = description;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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