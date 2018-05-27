package service;

import entity.User;

import java.util.Set;

public interface UserService {
    /**
    * @author Administrator
    * @Description 创建账户
    * @date 22:03 2018/5/27
    * @return entity.User
    **/
    User createUser(User user);
    /**
    * @author Administrator
    * @Description 修改密码
    * @date 22:03 2018/5/27
    * @return void
    **/
    void changePassword(Long userId, String newPassword);
    /**
    * @author Administrator
    * @Description 添加用户-角色关系
    * @date 22:04 2018/5/27
    * @return void
    **/
    void correlationRoles(Long userId, Long... roleIds);
    /**
    * @author Administrator
    * @Description 移除用户-角色关系
    * @date 22:04 2018/5/27
    * @return void
    **/
    void uncorrelationRoles(Long userId, Long... roleIds);
    /**
    * @author Administrator
    * @Description 根据用户名查找用户
    * @date 22:05 2018/5/27
    * @return entity.User
    **/
   User findByUsername(String username);
   /**
   * @author Administrator
   * @Description 根据用户名查找其角色
   * @date 22:05 2018/5/27
   * @return java.util.Set<java.lang.String>
   **/
   Set<String> findRoles(String username);
   /**
   * @author Administrator
   * @Description 根据用户名查找其权限
   * @date 22:05 2018/5/27
   * @return java.util.Set<java.lang.String>
   **/
   Set<String> findPermissions(String username);
}
