package co.edu.cesde.pi.models;

public class GroupSubjects {
    private long groupSubjectId;
    private String groupId;
    private String subjectId;
    private String teacherId;

    public GroupSubjects() {}

    public GroupSubjects(long groupSubjectId, String groupId, String teacherId, String subjectId) {
        this.groupSubjectId = groupSubjectId;
        this.groupId = groupId;
        this.teacherId = teacherId;
        this.subjectId = subjectId;
    }

    public long getGroupSubjectId() {
        return groupSubjectId;
    }

    public void setGroupSubjectId(long groupSubjectId) {
        this.groupSubjectId = groupSubjectId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "GroupSubjects{" +
                "groupSubjectId=" + groupSubjectId +
                ", groupId='" + groupId + '\'' +
                ", subjectId='" + subjectId + '\'' +
                "teacherId='" + teacherId + '\'' +
                '}';
    }
}