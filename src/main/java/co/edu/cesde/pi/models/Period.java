package co.edu.cesde.pi.models;

import java.time.LocalDate;

public class Period {

    private long periodId;
    private long code;
    private LocalDate startDate;
    private LocalDate endDate;

    // Constructor vacío
    public Period() {}

    // Constructor con parámetros
    public Period(long periodId, long code, LocalDate startDate, LocalDate endDate) {
        this.periodId = periodId;
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters y Setters
    public long getPeriodId() {
        return periodId;
    }
    public void setPeriodId(long periodId) {
        this.periodId = periodId;
    }

    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // toString
    @Override
    public String toString() {
        return "Period{" +
                "periodId=" + periodId +
                ", code=" + code +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}