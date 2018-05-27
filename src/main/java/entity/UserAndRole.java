package entity;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName UserAndRole
 * @Description 用户和角色的关系实体类
 * @date 2018/5/27 21:30
 **/
public class UserAndRole {
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 角色id
     */
    private String roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserAndRole{" +
                "userId='" + userId + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
