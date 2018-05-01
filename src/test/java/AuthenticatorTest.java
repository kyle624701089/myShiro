import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName AuthenticatorTest
 * @Description TODO
 * @date 2018/5/1 11:02
 **/
public class AuthenticatorTest {

    /**
    * @author Administrator
    * @Description 提取登录方法
    * @date 11:02 2018/5/1
    * @return void
    **/
    public void login(String configFile){
        Factory<SecurityManager> factory =  new IniSecurityManagerFactory();
        SecurityManager manager = factory.getInstance();
        SecurityUtils.setSecurityManager(manager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("zhang", "123");
        subject.login(token);
    }

    @Test
    public void testAllSuccessfulStrategyWithSuccess(){
        login("classpath:shiro-authenticator-all-success.ini");
        Subject subject = SecurityUtils.getSubject();
        //登录后，得到一个登录成功的集合
        PrincipalCollection previousPrincipals = subject.getPrincipals();
        //username为zhang的用户应该有两个，realm1和realm3
        Assert.assertEquals(1,previousPrincipals.asList().size());
    }
}
