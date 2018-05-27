package service;

import entity.Permission;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName PermissionService
 * @Description TODO
 * @date 2018/5/27 22:00
 **/
public interface PermissionService {
    /**
    * @author Administrator
    * @Description 创建权限
    * @date 22:01 2018/5/27
    * @return entity.Permission
    **/
    Permission createPermission(Permission permission);
    /**
    * @author Administrator
    * @Description 删除权限
    * @date 22:01 2018/5/27
    * @return void
    **/
    void deletePermission(Long permissionId);
}
