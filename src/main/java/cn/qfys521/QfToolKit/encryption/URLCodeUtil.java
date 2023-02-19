package cn.qfys521.Utils.encryption;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author qfys521
 */
@SuppressWarnings("all")
public class URLCodeUtil {
    /**
     * @param obj obj
     * @return URLEncode
     */
    public String URLCodeEncode(Object obj) {
        String URLEncode = URLEncoder.encode(obj.toString(), StandardCharsets.UTF_8);
        return URLEncode;
    }

    /**
     * @param obj obj
     * @return URLDecode
     */
    public String URLCodeDecode(Object obj) {
        String URLDecode = URLDecoder.decode(obj.toString(), StandardCharsets.UTF_8);
        return URLDecode;
    }
}
