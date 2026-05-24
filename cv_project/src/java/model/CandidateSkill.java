package model;

public class CandidateSkill {

    private String candidateSkillId;
    private String skillId;
    private String candidateId;
    private String level;

    public CandidateSkill() {
    }

    public CandidateSkill(String candidateSkillId, String skillId, String candidateId, String level) {
        this.candidateSkillId = candidateSkillId;
        this.skillId = skillId;
        this.candidateId = candidateId;
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

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}