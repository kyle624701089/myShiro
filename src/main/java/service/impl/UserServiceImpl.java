package service.impl;

import entity.User;
import service.UserService;

import java.util.Set;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName UserServiceImpl
 * @Description TODO
 * @date 2018/5/27 22:11
 **/
public class UserServiceImpl implements UserService {
    public User createUser(User user) {
        return null;
    }

    public void changePassword(Long userId, String newPassword) {

    }

    public void correlationRoles(Long userId, Long... roleIds) {

    }

    public void uncorrelationRoles(Long userId, Long... roleIds) {

    }

    public User findByUsername(String username) {
        return null;
    }

    public Set<String> findRoles(String username) {
        return null;
    }

    public Set<String> findPermissions(String username) {
        return null;
    }
}
