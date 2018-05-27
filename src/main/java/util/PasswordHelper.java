package util;

import entity.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @author Administrator
 * @version 1.0
 * @ClassName PasswordHelper
 * @Description 密码
 * @date 2018/5/27 22:06
 **/
public class PasswordHelper {
    /**
     * 创建一个随机数生成器
     */
    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
    /**
     * 指定加密方法 md5
     */
    private String algorithmName = "md5";
    /**
     * 加密次数 2次
     */
    private final int hashIterations = 2;
    /**
    * @author Administrator
    * @Description 传入user后，对其密码进行私有盐加密
    * @date 22:10 2018/5/27
    * @return void
    **/
    public void encryptPassword(User user) {
        user.setSalt(randomNumberGenerator.nextBytes().toHex());
        String newPassword = new SimpleHash(
                algorithmName,
                user.getPassword(),
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                hashIterations).toHex();
        user.setPassword(newPassword);
    }
}
