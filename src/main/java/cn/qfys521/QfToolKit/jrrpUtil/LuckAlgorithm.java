package cn.qfys521.Utils.jrrpUtil;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

/**
 * @author lyrinka
 */
@SuppressWarnings("all")
public class LuckAlgorithm {

    // 获取当前数据

    /**
     * @param identifier identifier
     * @param key        key
     * @return int
     */
    public static int get(long identifier, String key) {
        return get(null, identifier, key);
    }

    /**
     * @param date       date
     * @param identifier identifier
     * @param key        key
     * @return int
     */
    // 获取特定日期的数据
    public static int get(Date date, long identifier, String key) {
        return get(getDay(date), identifier, key);
    }

    /**
     * @param day        day
     * @param identifier identifier
     * @param key        key
     * @return int
     */
    // 获取特定天数的数据(用于测试随机分布)
    public static int get(int day, long identifier, String key) {
        int code = rfc4226(getSeed(day, identifier), key, 2);
        // 返回值是均匀分布的1到100
        return code + 1;
    }

    /**
     * @param date date
     * @return int
     */
    // 获取自公元1年初以来经过的天数
    public static int getDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        if (date != null) calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR) - 1;
        int day = year * 365 + year / 4 - year / 100 + year / 400; // 闰年调整
        day += calendar.get(Calendar.DAY_OF_YEAR);
        return day;
    }

    /**
     * @param day        day
     * @param identifier identifier
     * @return long
     */
    // 二进制拼接日期与QQ号，生成64bit种子，范围约为公元45900年和12位QQ号
    public static long getSeed(int day, long identifier) {
        return (identifier & 0x000000FFFFFFFFFFL) | (((long) day) << 40);
    }

    /**
     * @param seed seed
     * @param key  key
     * @return int
     */
    // 核心算法符合标准HOTP算法(RFC4226)，方便快速迁移到具有该库的其他平台
    // 密钥格式为base64
    // 详见：https://www.rfc-editor.org/rfc/rfc4226
    public static int rfc4226(long seed, String key) {
        return rfc4226(seed, key, 6);
    }

    /**
     * @param seed   seed
     * @param key    key
     * @param digits digits
     * @return int
     */
    public static int rfc4226(long seed, String key, int digits) {
        return rfc4226(seed, Base64.getDecoder().decode(key), digits);
    }

    /**
     * @param seed   seed
     * @param key    key
     * @param digits digits
     * @return int
     */
    public static int rfc4226(long seed, byte[] key, int digits) {
        byte[] seed_bytes = new byte[]{
                (byte) (seed >> 56),
                (byte) (seed >> 48),
                (byte) (seed >> 40),
                (byte) (seed >> 32),
                (byte) (seed >> 24),
                (byte) (seed >> 16),
                (byte) (seed >> 8),
                (byte) (seed),
        };
        try {
            // 随机性由HMAC-SHA1签名产生，基于哈希算法
            // 即使有人获得了算法，不知道密钥也是无法预知人品
            SecretKeySpec keySpec = new SecretKeySpec(key, "HMACSHA1");
            Mac mac = Mac.getInstance("HMACSHA1");
            mac.init(keySpec);
            byte[] hash = mac.doFinal(seed_bytes);
            // 对签名结果(160bit)进行压缩(dynamic truncation)
            int index = hash[19] & 0xF;
            int code = 0;
            for (int i = 0; i < 4; i++) {
                int num = hash[index + i];
                if (num < 0) num += 256;
                if (i == 0) num &= 0x7F;
                code = num | (code << 8);
            }
            // 生成一个N位整数，最多9位
            if (digits > 9) digits = 9;
            if (digits < 1) digits = 1;
            int divider = 10;
            for (int i = 1; i < digits; i++)
                divider *= 10;
            code %= divider;
//			System.out.println(code); 
            return code;
        } catch (IllegalArgumentException ex) {
            // base64解码错误
            ex.printStackTrace();
            return -1;
        } catch (NoSuchAlgorithmException | InvalidKeyException ex) {
            // 哈希算法库错误
            ex.printStackTrace();
            return -1;
        }
    }

}

//class Main {
//
//    private static final String KEY = "Zm5kZm5kZm5mZ25mZGduYmZrLmhnZmdmZmYvZmg3Cl0vOTg3NjU=";
//
//    public static void main(String[] args) {
//        int code = LuckAlgorithm.get(2870471753L, KEY);
//        System.out.println(code);
//    }
//
//}
