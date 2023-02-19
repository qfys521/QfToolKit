package cn.qfys521.Utils.minecraft.Effects;


import java.util.HashMap;

/**
 * 未来可能会实现set()，现在已咕咕咕 <br/>
 *
 * @author qfys521 <br/>
 * private String EffectName; <br/>
 * private String EffectChineseName; <br/>
 * <br/>
 * 注:未来请新添加get()和set()，此版本的get(Str)请保留作为向下兼容使用。 <br/>
 */
public class Effects {


    /**
     * getEffectName()
     *
     * @param EffectChineseName Effect中文名<br/>
     * @return EffectName或者null <br/>
     * @author qfys521
     */
    public String getEffectName(String EffectChineseName) {

        HashMap<String, String> c2e = new HashMap<String, String>();
        c2e.put("速度", "speed");
        c2e.put("缓慢", "slowness");
        c2e.put("急迫", "haste");
        c2e.put("挖掘疲劳", "mining_fatigue");
        c2e.put("力量", "strength");
        c2e.put("瞬间治疗", "instant_health");
        c2e.put("瞬间伤害", "instant_damage");
        c2e.put("跳跃提升", "jump_boost");
        c2e.put("反胃", "nausea");
        c2e.put("生命恢复", "regeneration");
        c2e.put("抗性提升", "resistance");
        c2e.put("防火", "fire_resistance");
        c2e.put("水下呼吸", "water_breathing");
        c2e.put("隐身", "invisibility");
        c2e.put("失明", "blindness");
        c2e.put("夜视", "night_vision");
        c2e.put("饥饿", "hunger");
        c2e.put("虚弱", "weakness");
        c2e.put("中毒", "poison");
        c2e.put("凋零", "wither");
        c2e.put("生命提升", "health_boost");
        c2e.put("伤害吸收", "absorption");
        c2e.put("饱和", "saturation");
        c2e.put("发光", "glowing");
        c2e.put("飘浮", "levitation");
        c2e.put("幸运", "luck");
        c2e.put("霉运", "unluck");
        c2e.put("缓降", "slow_falling");
        c2e.put("潮涌能量", "conduit_power");
        c2e.put("海豚的恩惠", "dolphins_grace");
        c2e.put("不祥之兆", "bad_omen");
        c2e.put("村庄英雄", "hero_of_the_village");
        c2e.put("黑暗", "darkness");


        //return c2e.get(EffectChineseName);
        return c2e.get(EffectChineseName);

    }

    /**
     * getEffectChineseName()
     *
     * @param EffectName EffectName<br/>
     * @return Effect中文名或者null <br/>
     * @author qfys521
     */
    public String getEffectChineseName(String EffectName) {

        HashMap<String, String> e2c = new HashMap<String, String>();

        e2c.put("speed", "速度");
        e2c.put("slowness", "缓慢");
        e2c.put("haste", "急迫");
        e2c.put("mining_fatigue", "挖掘疲劳");
        e2c.put("strength", "力量");
        e2c.put("instant_health", "瞬间治疗");
        e2c.put("instant_damage", "瞬间伤害");
        e2c.put("jump_boost", "跳跃提升");
        e2c.put("nausea", "反胃");
        e2c.put("regeneration", "生命恢复");
        e2c.put("resistance", "抗性提升");
        e2c.put("fire_resistance", "防火");
        e2c.put("water_breathing", "水下呼吸");
        e2c.put("invisibility", "隐身");
        e2c.put("blindness", "失明");
        e2c.put("night_vision", "夜视");
        e2c.put("hunger", "饥饿");
        e2c.put("weakness", "虚弱");
        e2c.put("poison", "中毒");
        e2c.put("wither", "凋零");
        e2c.put("health_boost", "生命提升");
        e2c.put("absorption", "伤害吸收");
        e2c.put("saturation", "饱和");
        e2c.put("glowing", "发光");
        e2c.put("levitation", "飘浮");
        e2c.put("luck", "幸运");
        e2c.put("unluck", "霉运");
        e2c.put("slow_falling", "缓降");
        e2c.put("conduit_power", "潮涌能量");
        e2c.put("dolphins_grace", "海豚的恩惠");
        e2c.put("bad_omen", "不祥之兆");
        e2c.put("hero_of_the_village", "村庄英雄");
        e2c.put("darkness", "黑暗");

        //return e2c.get(EffectName);

        return e2c.get(EffectName);

    }
}


