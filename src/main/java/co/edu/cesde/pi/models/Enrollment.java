package co.edu.cesde.pi.models;

public class Enrollment {
    private long student_Id;
    private String enrollment_Id;
    private String group_Id;
    private String period_Id;

    public Enrollment() {}

    public Enrollment(long student_Id, String enrollment_Id, String group_Id, String period_Id) {
        this.student_Id = student_Id;
        this.enrollment_Id = enrollment_Id;
        this.group_Id = group_Id;
        this.period_Id = period_Id;
    }

    public long getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(long student_Id) {
        this.student_Id = student_Id;
    }

    public String getEnrollment_Id() {
        return enrollment_Id;
    }

    public void setEnrollment_Id(String enrollment_Id) {
        this.enrollment_Id = enrollment_Id;
    }

    public String getPeriod_Id() {
        return period_Id;
    }

    public void setPeriod_Id(String period_Id) {
        this.period_Id = period_Id;
    }

    public String getGroup_Id() {
        return group_Id;
    }

    public void setGroup_Id(String group_Id) {
        this.group_Id = group_Id;
    }
}
