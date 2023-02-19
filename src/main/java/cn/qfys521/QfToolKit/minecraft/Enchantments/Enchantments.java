package cn.qfys521.Utils.minecraft.Enchantments;

import java.util.HashMap;

/**
 * 未来可能会实现set()，现在已咕咕咕 <br/>
 *
 * @author qfys521 <br/>
 * private String EnchantmentName; <br/>
 * private String EnchantmentChineseName; <br/>
 * <br/>
 * 注:未来请新添加get()和set()，此版本的get(Str)请保留作为向下兼容使用。 <br/>
 */
public class Enchantments {


    /**
     * getEnchantmentName()
     *
     * @param EnchantmentChineseName Enchantment中文名<br/>
     * @return EnchantmentName或者null <br/>
     * @author qfys521
     */
    public String getEnchantmentName(String EnchantmentChineseName) {

        HashMap<String, String> c2e = new HashMap<String, String>();
        c2e.put("横扫之刃", "sweeping");
        c2e.put("水下速掘", "aqua_affinity");
        c2e.put("深海探索者", "depth_strider");
        c2e.put("水下呼吸", "respiration");
        c2e.put("饵钓", "lure");
        c2e.put("火焰附加", "fire_aspect");
        c2e.put("抢夺", "looting");
        c2e.put("引雷", "channeling");
        c2e.put("海之眷顾", "luck_of_the_sea");
        c2e.put("亡灵杀手", "smite");
        c2e.put("摔落保护", "feather_falling");
        c2e.put("效率", "efficiency");
        c2e.put("穿刺", "impaling");
        c2e.put("荆棘", "thorns");
        c2e.put("火矢", "flame");
        c2e.put("节肢杀手", "bane_of_arthropods");
        c2e.put("时运", "fortune");
        c2e.put("冲击", "punch");
        c2e.put("快速装填", "quick_charge");
        c2e.put("多重射击", "multishot");
        c2e.put("穿透", "piercing");
        c2e.put("激流", "riptide");
        c2e.put("无限", "infinity");
        c2e.put("忠诚", "loyalty");
        c2e.put("绑定诅咒", "binding_curse");
        c2e.put("消失诅咒", "vanishing_curse");
        c2e.put("保护", "protection");
        c2e.put("爆炸保护", "blast_protection");
        c2e.put("火焰保护", "fire_protection");
        c2e.put("弹射物保护", "projectile_protection");
        c2e.put("力量", "power");
        c2e.put("经验修补", "mending");
        c2e.put("击退", "knockback");
        c2e.put("冰霜行者", "frost_walker");
        c2e.put("耐久", "unbreaking");
        c2e.put("精准采集", "silk_touch");
        c2e.put("锋利", "sharpness");
        c2e.put("灵魂疾行", "soul_speed");


        //return c2e.get(EnchantmentChineseName);
        return c2e.get(EnchantmentChineseName);

    }

    /**
     * getEnchantmentChineseName()
     *
     * @param EnchantmentName EnchantmentName<br/>
     * @return Enchantment中文名或者null <br/>
     * @author qfys521
     */
    public String getEnchantmentChineseName(String EnchantmentName) {

        HashMap<String, String> e2c = new HashMap<String, String>();
        e2c.put("sweeping", "横扫之刃");
        e2c.put("aqua_affinity", "水下速掘");
        e2c.put("depth_strider", "深海探索者");
        e2c.put("respiration", "水下呼吸");
        e2c.put("lure", "饵钓");
        e2c.put("fire_aspect", "火焰附加");
        e2c.put("looting", "抢夺");
        e2c.put("channeling", "引雷");
        e2c.put("luck_of_the_sea", "海之眷顾");
        e2c.put("smite", "亡灵杀手");
        e2c.put("feather_falling", "摔落保护");
        e2c.put("efficiency", "效率");
        e2c.put("impaling", "穿刺");
        e2c.put("thorns", "荆棘");
        e2c.put("flame", "火矢");
        e2c.put("bane_of_arthropods", "节肢杀手");
        e2c.put("fortune", "时运");
        e2c.put("punch", "冲击");
        e2c.put("quick_charge", "快速装填");
        e2c.put("multishot", "多重射击");
        e2c.put("piercing", "穿透");
        e2c.put("riptide", "激流");
        e2c.put("infinity", "无限");
        e2c.put("loyalty", "忠诚");
        e2c.put("binding_curse", "绑定诅咒");
        e2c.put("vanishing_curse", "消失诅咒");
        e2c.put("protection", "保护");
        e2c.put("blast_protection", "爆炸保护");
        e2c.put("fire_protection", "火焰保护");
        e2c.put("projectile_protection", "弹射物保护");
        e2c.put("power", "力量");
        e2c.put("mending", "经验修补");
        e2c.put("knockback", "击退");
        e2c.put("frost_walker", "冰霜行者");
        e2c.put("unbreaking", "耐久");
        e2c.put("silk_touch", "精准采集");
        e2c.put("sharpness", "锋利");
        e2c.put("soul_speed", "灵魂疾行");


        //return e2c.get(EnchantmentName);

        return e2c.get(EnchantmentName);

    }
}
