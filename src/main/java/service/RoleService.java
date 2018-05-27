package service;

import entity.Role;

public interface RoleService {
    /**
    * @author Administrator
    * @Description 创建角色
    * @date 22:02 2018/5/27
    * @return entity.Role
    **/        
    Role createRole(Role role);
    /**
    * @author Administrator
    * @Description 删除角色
    * @date 22:11 2018/5/27
    * @return void
    **/        
    void deleteRole(Long roleId);
    /**
    * @author Administrator
    * @Description 添加角色-权限之间关系
    * @date 22:02 2018/5/27
    * @return void
    **/        
    void correlationPermissions(Long roleId, Long... permissionIds);
    /**
    * @author Administrator
    * @Description 移除角色-权限之间关系
    * @date 22:02 2018/5/27
    * @return void
    **/        
    void uncorrelationPermissions(Long roleId, Long... permissionIds);
}
