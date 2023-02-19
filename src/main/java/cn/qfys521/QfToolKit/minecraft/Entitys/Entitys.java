package cn.qfys521.Utils.minecraft.Entitys;

import java.util.HashMap;

/**
 * 未来可能会实现set()，现在已咕咕咕 <br/>
 *
 * @author qfys521 <br/>
 * private String EntityName; <br/>
 * private String EntityChineseName; <br/>
 * <br/>
 * 注:未来请新添加get()和set()，此版本的get(Str)请保留作为向下兼容使用。 <br/>
 */
public class Entitys {


    /**
     * getEntityName()
     *
     * @param EntityChineseName Entity中文名<br/>
     * @return EntityName或者null <br/>
     * @author qfys521
     */
    public String getEntityName(String EntityChineseName) {

        HashMap<String, String> c2e = new HashMap<String, String>();

        c2e.put("悦灵", "allay");
        c2e.put("烈焰人", "blaze");
        c2e.put("骆驼", "camel");
        c2e.put("洞穴蜘蛛", "cave_spider");
        c2e.put("苦力怕", "creeper");
        c2e.put("溺尸", "drowned");
        c2e.put("远古守卫者", "elder_guardian");
        c2e.put("末影龙", "ender_dragon");
        c2e.put("末影人", "enderman");
        c2e.put("末影螨", "endermite");
        c2e.put("唤魔者", "evoker");
        c2e.put("恶魂", "ghast");
        c2e.put("巨人", "giant");
        c2e.put("守卫者", "guardian");
        c2e.put("疣猪兽", "hoglin");
        c2e.put("尸壳", "husk");
        c2e.put("劫掠兽", "ravager");
        c2e.put("幻术师", "illusioner");
        c2e.put("岩浆怪", "magma_cube");
        c2e.put("幻翼", "phantom");
        c2e.put("猪灵", "piglin");
        c2e.put("猪灵蛮兵", "piglin_brute");
        c2e.put("掠夺者", "pillager");
        c2e.put("河豚", "pufferfish");
        c2e.put("劫掠兽", "ravager");
        c2e.put("潜影贝", "shulker");
        c2e.put("蠹虫", "silverfish");
        c2e.put("骷髅", "skeleton");
        c2e.put("史莱姆", "slime");
        c2e.put("蜘蛛", "spider");
        c2e.put("流浪者", "stray");
        c2e.put("恼鬼", "vex");
        c2e.put("卫道士", "vindicator");
        c2e.put("监守者", "warden");
        c2e.put("女巫", "witch");
        c2e.put("凋灵", "wither");
        c2e.put("凋灵骷髅", "wither_skeleton");
        c2e.put("僵尸", "zombie");
        c2e.put("僵尸村民", "zombie_villager");
        c2e.put("僵尸猪灵", "zombified_piglin");
        c2e.put("僵尸疣猪兽", "zoglin");
        c2e.put("美西螈", "axolotl");
        c2e.put("蝙蝠", "bat");
        c2e.put("猫", "cat");
        c2e.put("鸡", "chicken");
        c2e.put("鳕鱼", "cod");
        c2e.put("牛", "cow");
        c2e.put("海豚", "dolphin");
        c2e.put("驴", "donkey");
        c2e.put("青蛙", "frog");
        c2e.put("发光鱿鱼", "glow_squid");
        c2e.put("山羊", "goat");
        c2e.put("马", "horse");
        c2e.put("铁傀儡", "iron_golem");
        c2e.put("羊驼", "llama");
        c2e.put("哞菇", "mooshroom");
        c2e.put("骡", "mule");
        c2e.put("豹猫", "ocelot");
        c2e.put("熊猫", "panda");
        c2e.put("鹦鹉", "parrot");
        c2e.put("猪", "pig");
        c2e.put("北极熊", "polar_bear");
        c2e.put("兔子", "rabbit");
        c2e.put("鲑鱼", "salmon");
        c2e.put("绵羊", "sheep");
        c2e.put("骷髅马", "skeleton_horse");
        c2e.put("雪傀儡", "snow_golem");
        c2e.put("鱿鱼", "squid");
        c2e.put("蝌蚪", "tadpole");
        c2e.put("热带鱼", "tropical_fish");
        c2e.put("海龟", "turtle");
        c2e.put("村民", "villager");
        c2e.put("狼", "wolf");
        c2e.put("僵尸马", "zombie_horse");
        c2e.put("区域效果云", "area_effect_cloud");
        c2e.put("拴绳", "leash_knot");
        c2e.put("画", "painting");
        c2e.put("物品展示框", "item_frame");
        c2e.put("盔甲架", "armor_stand");
        c2e.put("唤魔者尖牙", "evoker_fangs");
        c2e.put("末地水晶", "end_crystal");
        c2e.put("掷出的鸡蛋", "egg");
        c2e.put("射出的箭或药箭", "arrow");
        c2e.put("射出的光灵箭", "spectral_arrow");
        c2e.put("三叉戟", "trident");
        c2e.put("掷出的雪球", "snowball");
        c2e.put("恶魂火球", "fireball");
        c2e.put("烈焰人火球或火焰弹", "small_fireball");
        c2e.put("掷出的末影珍珠", "ender_pearl");
        c2e.put("掷出的末影之眼", "eye_of_ender");
        c2e.put("掷出的药水", "potion");
        c2e.put("掷出的附魔之瓶", "experience_bottle");
        c2e.put("凋灵之首", "wither_skull");
        c2e.put("烟花火箭", "firework_rocket");
        c2e.put("潜影弹", "shulker_bullet");
        c2e.put("末影龙火球", "dragon_fireball");
        c2e.put("羊驼唾沫", "llama_spit");
        c2e.put("船", "boat");
        c2e.put("运输船", "chest_boat");
        c2e.put("矿车", "minecart");
        c2e.put("运输矿车", "chest_minecart");
        c2e.put("动力矿车", "furnace_minecart");
        c2e.put("TNT矿车", "tnt_minecart");
        c2e.put("漏斗矿车", "hopper_minecart");
        c2e.put("命令方块矿车", "command_block_minecart");
        c2e.put("刷怪笼矿车", "spawner_minecart");
        c2e.put("激活的TNT", "tnt");
        c2e.put("掉落中的方块", "falling_block");
        c2e.put("物品", "item");
        c2e.put("经验球", "experience_orb");

        //return c2e.get(EntityChineseName);
        return c2e.get(EntityChineseName);

    }

    /**
     * getEntityChineseName()
     *
     * @param EntityName EntityName<br/>
     * @return Entity中文名或者null <br/>
     * @author qfys521
     */
    public String getEntityChineseName(String EntityName) {

        HashMap<String, String> e2c = new HashMap<String, String>();
        e2c.put("allay", "悦灵");
        e2c.put("blaze", "烈焰人");
        e2c.put("camel", "骆驼");
        e2c.put("cave_spider", "洞穴蜘蛛");
        e2c.put("creeper", "苦力怕");
        e2c.put("drowned", "溺尸");
        e2c.put("elder_guardian", "远古守卫者");
        e2c.put("ender_dragon", "末影龙");
        e2c.put("enderman", "末影人");
        e2c.put("endermite", "末影螨");
        e2c.put("evoker", "唤魔者");
        e2c.put("ghast", "恶魂");
        e2c.put("giant", "巨人");
        e2c.put("guardian", "守卫者");
        e2c.put("hoglin", "疣猪兽");
        e2c.put("husk", "尸壳");
        e2c.put("ravager", "劫掠兽");
        e2c.put("illusioner", "幻术师");
        e2c.put("magma_cube", "岩浆怪");
        e2c.put("phantom", "幻翼");
        e2c.put("piglin", "猪灵");
        e2c.put("piglin_brute", "猪灵蛮兵");
        e2c.put("pillager", "掠夺者");
        e2c.put("pufferfish", "河豚");
        e2c.put("ravager", "劫掠兽");
        e2c.put("shulker", "潜影贝");
        e2c.put("silverfish", "蠹虫");
        e2c.put("skeleton", "骷髅");
        e2c.put("slime", "史莱姆");
        e2c.put("spider", "蜘蛛");
        e2c.put("stray", "流浪者");
        e2c.put("vex", "恼鬼");
        e2c.put("vindicator", "卫道士");
        e2c.put("warden", "监守者");
        e2c.put("witch", "女巫");
        e2c.put("wither", "凋灵");
        e2c.put("wither_skeleton", "凋灵骷髅");
        e2c.put("zombie", "僵尸");
        e2c.put("zombie_villager", "僵尸村民");
        e2c.put("zombified_piglin", "僵尸猪灵");
        e2c.put("zoglin", "僵尸疣猪兽");
        e2c.put("axolotl", "美西螈");
        e2c.put("bat", "蝙蝠");
        e2c.put("cat", "猫");
        e2c.put("chicken", "鸡");
        e2c.put("cod", "鳕鱼");
        e2c.put("cow", "牛");
        e2c.put("dolphin", "海豚");
        e2c.put("donkey", "驴");
        e2c.put("frog", "青蛙");
        e2c.put("glow_squid", "发光鱿鱼");
        e2c.put("goat", "山羊");
        e2c.put("horse", "马");
        e2c.put("iron_golem", "铁傀儡");
        e2c.put("llama", "羊驼");
        e2c.put("mooshroom", "哞菇");
        e2c.put("mule", "骡");
        e2c.put("ocelot", "豹猫");
        e2c.put("panda", "熊猫");
        e2c.put("parrot", "鹦鹉");
        e2c.put("pig", "猪");
        e2c.put("polar_bear", "北极熊");
        e2c.put("rabbit", "兔子");
        e2c.put("salmon", "鲑鱼");
        e2c.put("sheep", "绵羊");
        e2c.put("skeleton_horse", "骷髅马");
        e2c.put("snow_golem", "雪傀儡");
        e2c.put("squid", "鱿鱼");
        e2c.put("tadpole", "蝌蚪");
        e2c.put("tropical_fish", "热带鱼");
        e2c.put("turtle", "海龟");
        e2c.put("villager", "村民");
        e2c.put("wolf", "狼");
        e2c.put("zombie_horse", "僵尸马");
        e2c.put("area_effect_cloud", "区域效果云");
        e2c.put("leash_knot", "拴绳");
        e2c.put("painting", "画");
        e2c.put("item_frame", "物品展示框");
        e2c.put("armor_stand", "盔甲架");
        e2c.put("evoker_fangs", "唤魔者尖牙");
        e2c.put("end_crystal", "末地水晶");
        e2c.put("egg", "掷出的鸡蛋");
        e2c.put("arrow", "射出的箭或药箭");
        e2c.put("spectral_arrow", "射出的光灵箭");
        e2c.put("trident", "三叉戟");
        e2c.put("snowball", "掷出的雪球");
        e2c.put("fireball", "恶魂火球");
        e2c.put("small_fireball", "烈焰人火球或火焰弹");
        e2c.put("ender_pearl", "掷出的末影珍珠");
        e2c.put("eye_of_ender", "掷出的末影之眼");
        e2c.put("potion", "掷出的药水");
        e2c.put("experience_bottle", "掷出的附魔之瓶");
        e2c.put("wither_skull", "凋灵之首");
        e2c.put("firework_rocket", "烟花火箭");
        e2c.put("shulker_bullet", "潜影弹");
        e2c.put("dragon_fireball", "末影龙火球");
        e2c.put("llama_spit", "羊驼唾沫");
        e2c.put("boat", "船");
        e2c.put("chest_boat", "运输船");
        e2c.put("minecart", "矿车");
        e2c.put("chest_minecart", "运输矿车");
        e2c.put("furnace_minecart", "动力矿车");
        e2c.put("tnt_minecart", "TNT矿车");
        e2c.put("hopper_minecart", "漏斗矿车");
        e2c.put("command_block_minecart", "命令方块矿车");
        e2c.put("spawner_minecart", "刷怪笼矿车");
        e2c.put("tnt", "激活的TNT");
        e2c.put("falling_block", "掉落中的方块");
        e2c.put("item", "物品");
        e2c.put("experience_orb", "经验球");

        //return e2c.get(EntityName);

        return e2c.get(EntityName);

    }
}
