package cn.qfys521.Utils.minecraft.Biomes;

import java.util.HashMap;

/**
 * 未来可能会实现set()，现在已咕咕咕 <br/>
 *
 * @author qfys521 <br/>
 * private String BiomeName; <br/>
 * private String BiomeChineseName; <br/>
 * <br/>
 * 注:未来请新添加get()和set()，此版本的get(Str)请保留作为向下兼容使用。 <br/>
 */
public class Biomes {


    /**
     * getBiomeName()
     *
     * @param BiomeChineseName Biome中文名<br/>
     * @return BiomeName或者null <br/>
     * @author qfys521
     */
    public String getBiomeName(String BiomeChineseName) {

        HashMap<String, String> c2e = new HashMap<String, String>();
        c2e.put("虚空", "the_void");
        c2e.put("平原", "plains");
        c2e.put("向日葵平原", "sunflower_plains");
        c2e.put("积雪的平原", "snowy_plains");
        c2e.put("冰刺平原", "ice_spikes");
        c2e.put("沙漠", "desert");
        c2e.put("沼泽", "swamp");
        c2e.put("红树林沼泽", "mangrove_swamp");
        c2e.put("森林", "forest");
        c2e.put("繁花森林", "flower_forest");
        c2e.put("桦木森林", "birch_forest");
        c2e.put("黑森林", "dark_forest");
        c2e.put("原始桦木森林", "old_growth_birch_forest");
        c2e.put("原始松木针叶林", "old_growth_pine_taiga");
        c2e.put("原始云杉针叶林", "old_growth_spruce_taiga");
        c2e.put("针叶林", "taiga");
        c2e.put("积雪的针叶林", "snowy_taiga");
        c2e.put("热带草原", "savanna");
        c2e.put("热带高原", "savanna_plateau");
        c2e.put("风袭丘陵", "windswept_hills");
        c2e.put("风袭沙砾丘陵", "windswept_gravelly_hills");
        c2e.put("风袭森林", "windswept_forest");
        c2e.put("风袭热带草原", "windswept_savanna");
        c2e.put("丛林", "jungle");
        c2e.put("稀疏的丛林", "sparse_jungle");
        c2e.put("竹林", "bamboo_jungle");
        c2e.put("恶地", "badlands");
        c2e.put("被风蚀的恶地", "eroded_badlands");
        c2e.put("繁茂的恶地", "wooded_badlands");
        c2e.put("草甸", "meadow");
        c2e.put("雪林", "grove");
        c2e.put("积雪的山坡", "snowy_slopes");
        c2e.put("冰封山峰", "frozen_peaks");
        c2e.put("尖峭山峰", "jagged_peaks");
        c2e.put("裸岩山峰", "stony_peaks");
        c2e.put("河流", "river");
        c2e.put("冻河", "frozen_river");
        c2e.put("沙滩", "beach");
        c2e.put("积雪的沙滩", "snowy_beach");
        c2e.put("石岸", "stony_shore");
        c2e.put("暖水海洋", "warm_ocean");
        c2e.put("温水海洋", "lukewarm_ocean");
        c2e.put("温水深海", "deep_lukewarm_ocean");
        c2e.put("海洋", "ocean");
        c2e.put("深海", "deep_ocean");
        c2e.put("冷水海洋", "cold_ocean");
        c2e.put("冷水深海", "deep_cold_ocean");
        c2e.put("冻洋", "frozen_ocean");
        c2e.put("冰冻深海", "deep_frozen_ocean");
        c2e.put("蘑菇岛", "mushroom_fields");
        c2e.put("溶洞", "dripstone_caves");
        c2e.put("繁茂洞穴", "lush_caves");
        c2e.put("深暗之域", "deep_dark");
        c2e.put("下界荒地", "nether_wastes");
        c2e.put("诡异森林", "warped_forest");
        c2e.put("绯红森林", "crimson_forest");
        c2e.put("灵魂沙峡谷", "soul_sand_valley");
        c2e.put("玄武岩三角洲", "basalt_deltas");
        c2e.put("末地", "the_end");
        c2e.put("末地高地", "end_highlands");
        c2e.put("末地内陆", "end_midlands");
        c2e.put("末地小型岛屿", "small_end_islands");
        c2e.put("末地荒地", "end_barrens");


        //return c2e.get(BiomeChineseName);
        return c2e.get(BiomeChineseName);

    }

    /**
     * getBiomeChineseName()
     *
     * @param BiomeName BiomeName<br/>
     * @return Biome中文名或者null <br/>
     * @author qfys521
     */
    public String getBiomeChineseName(String BiomeName) {

        HashMap<String, String> e2c = new HashMap<String, String>();
        e2c.put("the_void", "虚空");
        e2c.put("plains", "平原");
        e2c.put("sunflower_plains", "向日葵平原");
        e2c.put("snowy_plains", "积雪的平原");
        e2c.put("ice_spikes", "冰刺平原");
        e2c.put("desert", "沙漠");
        e2c.put("swamp", "沼泽");
        e2c.put("mangrove_swamp", "红树林沼泽");
        e2c.put("forest", "森林");
        e2c.put("flower_forest", "繁花森林");
        e2c.put("birch_forest", "桦木森林");
        e2c.put("dark_forest", "黑森林");
        e2c.put("old_growth_birch_forest", "原始桦木森林");
        e2c.put("old_growth_pine_taiga", "原始松木针叶林");
        e2c.put("old_growth_spruce_taiga", "原始云杉针叶林");
        e2c.put("taiga", "针叶林");
        e2c.put("snowy_taiga", "积雪的针叶林");
        e2c.put("savanna", "热带草原");
        e2c.put("savanna_plateau", "热带高原");
        e2c.put("windswept_hills", "风袭丘陵");
        e2c.put("windswept_gravelly_hills", "风袭沙砾丘陵");
        e2c.put("windswept_forest", "风袭森林");
        e2c.put("windswept_savanna", "风袭热带草原");
        e2c.put("jungle", "丛林");
        e2c.put("sparse_jungle", "稀疏的丛林");
        e2c.put("bamboo_jungle", "竹林");
        e2c.put("badlands", "恶地");
        e2c.put("eroded_badlands", "被风蚀的恶地");
        e2c.put("wooded_badlands", "繁茂的恶地");
        e2c.put("meadow", "草甸");
        e2c.put("grove", "雪林");
        e2c.put("snowy_slopes", "积雪的山坡");
        e2c.put("frozen_peaks", "冰封山峰");
        e2c.put("jagged_peaks", "尖峭山峰");
        e2c.put("stony_peaks", "裸岩山峰");
        e2c.put("river", "河流");
        e2c.put("frozen_river", "冻河");
        e2c.put("beach", "沙滩");
        e2c.put("snowy_beach", "积雪的沙滩");
        e2c.put("stony_shore", "石岸");
        e2c.put("warm_ocean", "暖水海洋");
        e2c.put("lukewarm_ocean", "温水海洋");
        e2c.put("deep_lukewarm_ocean", "温水深海");
        e2c.put("ocean", "海洋");
        e2c.put("deep_ocean", "深海");
        e2c.put("cold_ocean", "冷水海洋");
        e2c.put("deep_cold_ocean", "冷水深海");
        e2c.put("frozen_ocean", "冻洋");
        e2c.put("deep_frozen_ocean", "冰冻深海");
        e2c.put("mushroom_fields", "蘑菇岛");
        e2c.put("dripstone_caves", "溶洞");
        e2c.put("lush_caves", "繁茂洞穴");
        e2c.put("deep_dark", "深暗之域");
        e2c.put("nether_wastes", "下界荒地");
        e2c.put("warped_forest", "诡异森林");
        e2c.put("crimson_forest", "绯红森林");
        e2c.put("soul_sand_valley", "灵魂沙峡谷");
        e2c.put("basalt_deltas", "玄武岩三角洲");
        e2c.put("the_end", "末地");
        e2c.put("end_highlands", "末地高地");
        e2c.put("end_midlands", "末地内陆");
        e2c.put("small_end_islands", "末地小型岛屿");
        e2c.put("end_barrens", "末地荒地");


        //return e2c.get(BiomeName);

        return e2c.get(BiomeName);

    }
}
