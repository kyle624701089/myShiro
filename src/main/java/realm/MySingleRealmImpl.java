package realm;

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * @ClassName MySingleRealmImpl
 * @Description TODO
 * @author Administrator
 * @date 2018/4/29 12:07
 * @version 1.0
 **/
public class MySingleRealmImpl implements Realm {
    /**
    * @author kyle
    * @description
    * @date 12:15 2018/4/29
    * @param
    * @return java.lang.String
    **/
    public String getName() {
        return "kyle";
    }

    public boolean supports(AuthenticationToken authenticationToken) {
        //仅支持UsernamePasswordToken 类型的token
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
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
