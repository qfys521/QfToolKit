import cn.qfys521.QfToolKit.DataUtil.yamlUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        yamlUtil yaml = new yamlUtil();
            yaml.setPath("/home/qfys521/IdeaProjects/QfToolKit/src/test/resources/map.yml");
            String[] authors = {"qfys521","chuanwise","lyrinka"};
            Map<Object,Object> m = new HashMap<Object, Object>();
            m.put("isAdmin",true);
            m.put("inBlackList",false);
            Map<Object,Object> map = new HashMap<>();
            map.put("name","qfys521");
            map.put("authors",authors);
            map.put("2870471753",m);
        try {
            yaml.write(map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
