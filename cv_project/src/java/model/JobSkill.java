package model;

public class JobSkill {

    private String candidateSkillId;
    private String skillId;
    private String jobId;
    private String level;

    public JobSkill() {
    }

    public JobSkill(String candidateSkillId, String skillId, String jobId, String level) {
        this.candidateSkillId = candidateSkillId;
        this.skillId = skillId;
        this.jobId = jobId;
        this.level = level;
    }

    public String getCandidateSkillId() {
        return candidateSkillId;
    }

    public void setCandidateSkillId(String candidateSkillId) {
        this.candidateSkillId = candidateSkillId;
    }

    public String getSkillId() {
        return skillId;
    }

    public void setSkillId(String skillId) {
        this.skillId = skillId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}