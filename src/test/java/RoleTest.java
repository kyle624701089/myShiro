import base.BaseTest;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName RoleTest
 * @Description TODO
 * @date 2018/5/1 16:44
 **/
public class RoleTest extends BaseTest{
    @Test
    public void testHasRole() {
        login("classpath:shiro_role.ini", "zhang", "123");
        //判断拥有角色：role1
        Assert.assertTrue(subject().hasRole("role1"));
        //判断拥有角色：role1 and role2
        Assert.assertTrue(subject().hasAllRoles(Arrays.asList("role1", "role2")));
        //判断拥有角色：role1 and role2 and !role3
        boolean[] result = subject().hasRoles(Arrays.asList("role1", "role2", "role3"));
        Assert.assertEquals(true, result[0]);
        Assert.assertEquals(true, result[1]);
        Assert.assertEquals(false, result[2]);
    }
}
