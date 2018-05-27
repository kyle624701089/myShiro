package entity;

import java.io.Serializable;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName User
 * @Description 用户实体类
 * @date 2018/5/27 21:11
 **/
public class User implements Serializable{
    /**
     * 主键 id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户盐 用于加密 一般与密码结合  password+salt
     */
    private String salt;

    /**
     * 是否锁定 0 锁定 1 未锁定
     */
    private int isLocked = 1;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public String getCredentialsSalt() {
        return username + salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(int isLocked) {
        this.isLocked = isLocked;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", isLocked=" + isLocked +
                '}';
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
