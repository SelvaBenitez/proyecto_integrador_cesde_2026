package co.edu.cesde.pi.models;

public class Enrollment {
    long student_id;
    String enrollment_id;
    String group_id;
    String period_id;

    public Enrollment() {}

    public Enrollment(long student_id, boolean status, String period_id, String group_id, String enrollment_id) {
        this.student_id = student_id;
        this.status = status;
        this.period_id = period_id;
        this.group_id = group_id;
        this.enrollment_id = enrollment_id;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPeriod_id() {
        return period_id;
    }

    public void setPeriod_id(String period_id) {
        this.period_id = period_id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(String enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    boolean status;
}
