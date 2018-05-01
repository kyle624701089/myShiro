import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

public class MyShiroTest {
    @Test
    public void testHelloWorld(){
        //1.通过读取shiro.ini 文件生成 IniSecurityManagerFactory
        Factory<SecurityManager> managerFactory = new IniSecurityManagerFactory("classpath:shiro_myMultiRealm.ini");
        //2.通过工厂获取manager，并绑定给securityUtils
        SecurityManager securityManager = managerFactory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        //3.securityUtils获取subject，并验证用户名和密码是否正确
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("wang", "123");
        //4.验证登录
        try{
            //登录
            subject.login(token);
        }catch (AuthenticationException e){
            //登录失败
            e.printStackTrace();
        }
        //使用断言，验证subject登录成功返回true
        Assert.assertEquals(true,subject.isAuthenticated());
        //5.退出
        subject.logout();
    }
}
