import base.BaseTest;
import junit.framework.Assert;
import org.apache.shiro.authz.UnauthorizedException;
import org.junit.Test;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName PermissionTest
 * @Description TODO
 * @date 2018/5/1 16:52
 **/
public class PermissionTest extends BaseTest{
    /**
    * @author Administrator
    * @Description isPermitted: 拥有某个权限 ；isPermittedAll: 拥有列表中的所有权限
    * @date 16:56 2018/5/1
    * @return void
    **/
    @Test
    public void testIsPermitted() {
        login("classpath:shiro-permission.ini", "zhang", "123");
        //判断拥有权限：user:create
        Assert.assertTrue(subject().isPermitted("user:create"));
        //判断拥有参数列表中的所有权限：user:update and user:delete
        Assert.assertTrue(subject().isPermittedAll("user:update", "user:delete"));
        //判断没有权限：user:view
        Assert.assertFalse(subject().isPermitted("user:view"));
    }

    /**
    * @author Administrator
    * @Description 通过expected断言该test方法会抛出UnauthorizedException异常
    * @date 16:57 2018/5/1
    * @return void
    **/
    @Test(expected = UnauthorizedException.class)
    public void testCheckPermission () {
        login("classpath:shiro-permission.ini", "zhang", "123");
        //断言拥有权限：user:create
        subject().checkPermission("user:create");
        //断言拥有权限：user:delete and user:update
        subject().checkPermissions("user:delete", "user:update");
        //断言拥有权限：user:view 失败抛出异常
        subject().checkPermissions("user:view");
    }
}
