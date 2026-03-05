package co.edu.cesde.pi.models;

public class Users {
    private long user_Id;
    private String username;
    private String password_Hash;
    private boolean status;

    public Users(){}

    public Users(long user_Id, String username, String password_Hash, boolean status) {
        this.user_Id = user_Id;
        this.username = username;
        this.password_Hash = password_Hash;
        this.status = status;
    }

    public long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(long user_Id) {
        this.user_Id = user_Id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword_Hash() {
        return password_Hash;
    }

    public void setPassword_Hash(String password_Hash) {
        this.password_Hash = password_Hash;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
