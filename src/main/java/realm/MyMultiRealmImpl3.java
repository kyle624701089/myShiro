package realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName MyMultiRealmImpl3
 * @Description TODO
 * @date 2018/5/1 10:59
 **/
public class MyMultiRealmImpl3 implements Realm {
    public String getName() {
        return "realm3";
    }

    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken instanceof UsernamePasswordToken;
    }

    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取用户名
        String username = (String) authenticationToken.getPrincipal();
        //获取密码
        String password = new String((char[])authenticationToken.getCredentials());
        if (!"zhang".equals(username)){
            throw new UnknownAccountException();
        }
        if(!"123".equals(password)) {
            //如果密码错误
            throw new IncorrectCredentialsException();
        }
        //如果成功，返回AuthenticationInfo的实现
        return new SimpleAuthenticationInfo(username+"@163.com",password,getName());
    }
}
