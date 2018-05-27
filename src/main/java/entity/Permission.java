package entity;

import java.io.Serializable;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName Permission
 * @Description 权限实体类
 * @date 2018/5/27 21:18
 **/
public class Permission implements Serializable {
    /**
     * 主键 id
     */
    private Long id;
    /**
     * 权限标识符
     */
    private String permission;
    /**
     * 权限描述
     */
    private String description;
    /**
     * 是否可用 0 可用 1 不可用
     */
    private int available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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
        return "Permission{" +
                "id='" + id + '\'' +
                ", permission='" + permission + '\'' +
                ", description='" + description + '\'' +
                ", available=" + available +
                '}';
    }
}
