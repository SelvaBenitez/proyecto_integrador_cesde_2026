package co.edu.cesde.pi.models;

public class Grades {
    private long grade_id;
    private long group_subject_id;
    private long student_id;
    private double final_score;
    private String observation;

    public Grades(){}

    public Grades(long group_subject_id, long student_id, double final_score, String observation) {
        this.group_subject_id = group_subject_id;
        this.student_id = student_id;
        this.final_score = final_score;
        this.observation = observation;
    }

    public long getGroup_subject_id() {
        return group_subject_id;
    }

    public void setGroup_subject_id(long group_subject_id) {
        this.group_subject_id = group_subject_id;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public double getFinal_score() {
        return final_score;
    }

    public void setFinal_score(double final_score) {
        this.final_score = final_score;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "grade =" + "Grade{" +
                "gradeId=" + grade_id +
                ", groupSubject=" + group_subject_id +
                ", student=" + student_id +
                ", finalScore=" + final_score +
                ", observation='" + observation + '\'' +
                '}';
    }
}
