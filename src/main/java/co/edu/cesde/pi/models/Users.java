package co.edu.cesde.pi.models;

public class Users {
    private long user_id;
    private String username;
    private String password_hash;
    private boolean status;

    public Users(){}

    public Users(long user_id, boolean status, String password_hash, String username) {
        this.user_id = user_id;
        this.status = status;
        this.password_hash = password_hash;
        this.username = username;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
