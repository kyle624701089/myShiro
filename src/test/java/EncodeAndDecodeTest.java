import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.CodecSupport;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;


/**
 * @author Administrator
 * @version 1.0
 * @ClassName EncodeAndDecodeTest
 * @Description TODO
 * @date 2018/5/27 11:51
 **/
public class EncodeAndDecodeTest {

    /**
    * @author Administrator
    * @Description 基于base64的加密以及解密
    * @date 11:52 2018/5/27
    * @return void
    **/        
    @Test
    public void base64Test(){
        String str = "hello";
        //使用base64加密
        String base64EncodeToString = Base64.encodeToString(str.getBytes());
        System.out.println("加密："+base64EncodeToString);
        //使用base64解密
        String base64DecodeToString = Base64.decodeToString(base64EncodeToString);
        System.out.println("解密："+base64DecodeToString);
    }

    /**
    * @author Administrator
    * @Description md5散列算法
    * @date 11:58 2018/5/27
    * @return void
    **/        
    @Test
    public void md5Test(){
        //使用 散列算法要加一个salt进行加密干扰，一般使用name+id等方式
        String str = "hello";
        String salt = "123";
        String md5HashToString = new Md5Hash(str, salt).toString();
        System.out.println("md5加密1次："+md5HashToString);
        //使用salt散列两次
        String md5HashToStringTwice = new Md5Hash(str, salt, 2).toString();
        System.out.println("md5加密2次："+md5HashToStringTwice);
    }

    // 散列算法还有SHA256 SHA1 SHA512等

}
