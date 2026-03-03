package co.edu.cesde.pi.models;

public class Students {
    private long student_id;
    private long user_id;
    private String code;
    private String document_number;
    private String first_name;
    private String last_name;
    private String birth_date;

    public Students() {}

    public Students(long student_id, boolean status, String birth_date, String last_name, String first_name, String document_number, long user_id, String code) {
        this.student_id = student_id;
        this.status = status;
        this.birth_date = birth_date;
        this.last_name = last_name;
        this.first_name = first_name;
        this.document_number = document_number;
        this.user_id = user_id;
        this.code = code;
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

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDocument_number() {
        return document_number;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    boolean status;
}
