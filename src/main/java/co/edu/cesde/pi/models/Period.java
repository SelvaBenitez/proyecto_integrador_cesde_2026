package co.edu.cesde.pi.models;

public class Period {
    private long period_Id;
    private long code;
    private String start_date;
    private String end_date;

    public Period (){}

    public Period(long code, String start_date, String end_date) {
        this.code = code;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    @Override
    public String toString() {
        return "period =" + "Period{" +
                "periodId=" + period_Id +
                ", code='" + code + '\'' +
                ", startDate=" + start_date +
                ", endDate=" + end_date +
                '}';
    }
}
