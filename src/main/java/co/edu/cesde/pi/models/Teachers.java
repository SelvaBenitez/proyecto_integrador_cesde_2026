package co.edu.cesde.pi.models;

public class Teachers {
    private long teacherId;
    private long userId;
    private String code;
    private String documentNumber;
    private String firstName;
    private String lastName;
    private boolean status;

    public Teachers() {}

    public Teachers(long Teacher_id, boolean status, String last_name, String first_name, String document_number, long user_id, String code) {
        this.teacherId = Teacher_id;
        this.status = status;
        this.lastName = last_name;
        this.firstName = first_name;
        this.documentNumber = document_number;
        this.userId = user_id;
        this.code = code;
    }

    public long getTeacher_id() {
        return teacherId;
    }

    public void setTeacher_id(long teacherId) {
        this.teacherId = teacherId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getLast_name() {
        return lastName;
    }

    public void setLast_name(String last_name) {
        this.lastName = last_name;
    }

    public String getFirst_name() {
        return firstName;
    }

    public void setFirst_name(String first_name) {
        this.firstName = first_name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDocument_number() {
        return firstName;
    }

    public void setDocument_number(String document_number) {
        this.documentNumber = document_number;
    }

    public long getuserId() {
        return userId;
    }

    public void setuserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                ", teacherId=" + teacherId +
                ", userId=" + userId +
                ", code=" + code +
                ", documentNumber+" + documentNumber +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", status=" + status +
                '}';
}
}