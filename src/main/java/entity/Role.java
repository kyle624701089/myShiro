package entity;

import java.io.Serializable;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName Role
 * @Description 角色实体类
 * @date 2018/5/27 21:15
 **/
public class Role implements Serializable {
    /**
     * 主键 id
     */
    private Long id;
    /**
     * 角色标识符 如admin、manager
     */
    private String role;
    /**
     * 角色描述
     */
    private String description;
    /**
     * 是否可用 0 可用 1 不可用
     */
    private int available = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                ", available=" + available +
                '}';
    }
}
