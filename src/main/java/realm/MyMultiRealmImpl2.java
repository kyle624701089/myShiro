package realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName MyMultiRealmImpl2
 * @Description TODO
 * @date 2018/4/29 14:39
 **/
public class MyMultiRealmImpl2 implements Realm {
    public String getName() {
        return "realm2";
    }

    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取用户名
        String username = (String) authenticationToken.getPrincipal();
        //获取密码
        String password = new String((char[])authenticationToken.getCredentials());
        if (!"wang".equals(username)){
            throw new UnknownAccountException();
        }
        if(!"123".equals(password)) {
            //如果密码错误
            throw new IncorrectCredentialsException();
        }
        //如果成功，返回AuthenticationInfo的实现
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
