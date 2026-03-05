package co.edu.cesde.pi.models;

public class Students {
    private long student_Id;
    private long user_Id;
    private String code;
    private String document_Number;
    private String first_Name;
    private String last_Name;
    private String birth_Date;

    public Students() {}

    public Students(long student_Id, long user_Id, String code, String document_Number, String first_Name, String last_Name, String birth_Date) {
        this.student_Id = student_Id;
        this.user_Id = user_Id;
        this.code = code;
        this.document_Number = document_Number;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.birth_Date = birth_Date;
    }

    public long getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(long student_Id) {
        this.student_Id = student_Id;
    }

    public long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(long user_Id) {
        this.user_Id = user_Id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDocument_Number() {
        return document_Number;
    }

    public void setDocument_Number(String document_Number) {
        this.document_Number = document_Number;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getBirth_Date() {
        return birth_Date;
    }

    public void setBirth_Date(String birth_Date) {
        this.birth_Date = birth_Date;
    }
}
