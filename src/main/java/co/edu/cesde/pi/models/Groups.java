package co.edu.cesde.pi.models;

public class Groups {

    private long groupId;
    private long code;
    private String programId;
    private String periodId;
    private String shift;

    public Groups(long groupId, long code, String programId, String periodId, String shift) {
        this.groupId = groupId;
        this.code = code;
        this.programId = programId;
        this.periodId = periodId;
        this.shift = shift;
    }

    public long getGroupId() {
        return groupId;
    }
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }
    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
    }
    public String getProgramId() {
        return programId;
    }
    public void setProgramId(String programId) {
        this.programId = programId;
    }
    public String getPeriodId() {
        return periodId;
    }
    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }
    public String getShift() {
        return shift;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }


    @Override
    public String toString() {
        return "Groups{" +
                ", groupId=" + groupId +
                ", code=" + code +
                ", programId=" + programId +
                ", periodId+" + periodId +
                ", shift=" + shift +
                '}';
    }

}
