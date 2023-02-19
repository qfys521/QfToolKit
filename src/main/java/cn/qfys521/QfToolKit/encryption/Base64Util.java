package cn.qfys521.Utils.encryption;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author qfys521
 */
public class Base64Util {

    final static Base64.Encoder encoder = Base64.getEncoder();
    final static Base64.Decoder decoder = Base64.getDecoder();

    Base64Util(String text) {
    }

    /**
     * 给字符串加密
     *
     * @param text t
     * @return encoder.encodeToString(text.getBytes ( StandardCharsets.UTF_8)
     */
    public static String encode(String text) {

        return encoder.encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }

    /**
     * 将加密后的字符串进行解密
     *
     * @param encodedText t
     * @return new String(decoder.decode(encodedText), StandardCharsets.UTF_8)
     */
    public static String decode(String encodedText) {
        return new String(decoder.decode(encodedText), StandardCharsets.UTF_8);
    }
}
