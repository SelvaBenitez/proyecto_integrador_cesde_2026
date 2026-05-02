package co.edu.cesde.pi.models;

public class Programs {
    private long program_Id;
    private long code;
    private String name;

    public Programs(){}

    public Programs(long code, String name) {
        this.code = code;
        this.name = name;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "program =" + "Program{" +
                "programId=" + program_Id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
