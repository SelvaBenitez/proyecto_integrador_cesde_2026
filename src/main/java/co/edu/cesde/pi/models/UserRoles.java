package co.edu.cesde.pi.models;

public class UserRoles {
    private long userId;
    private long roleId;

    public UserRoles(){};

    public UserRoles(long userId, long roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRoles{" +
                "userId=" + userId +
                "roleId='" + roleId + '\'' +
                '}';
    }
}
