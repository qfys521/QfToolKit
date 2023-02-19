package cn.qfys521.Utils.encryption;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author qfys521
 */
public class MD5Util {
    /**
     * @param obj obj
     * @return new BigInteger(1, digest).toString(16)
     */
    public String toMD5(Object obj) {
        byte[] digest = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            digest = md5.digest(obj.toString().getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        //16是表示转换为16进制数
        assert digest != null;
        return new BigInteger(1, digest).toString(16);
    }

}
