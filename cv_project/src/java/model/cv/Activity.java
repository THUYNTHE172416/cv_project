package model.cv;

import java.time.LocalDateTime;

public class Activity {

    private String activityId;
    private String cvId;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private String organizationName;
    private String position;
    private String description;

    public Activity() {
    }

    public Activity(String activityId, String cvId, LocalDateTime dateStart, LocalDateTime dateEnd, 
                    String organizationName, String position, String description) {
        this.activityId = activityId;
        this.cvId = cvId;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.organizationName = organizationName;
        this.position = position;
        this.description = description;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
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

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
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