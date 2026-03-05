package co.edu.cesde.pi.models;

public class Subjects {

    private long subjectId;
    private long code;
    private String name;
    private String credits;
    private String programId;


    public Subjects(long subjectId, long code, String name, String credits, String programId) {
        this.subjectId = subjectId;
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.programId = programId;
    }
    public long getSubjectId() {
        return subjectId;
    }
    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }
    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                ", subjectId=" + subjectId +
                ", code=" + code +
                ", name=" + name +
                ", credits+" + credits +
                ", firstName=" + programId +
                '}';
    }
}