package cn.qfys521.Utils.minecraft.algorithm;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author qfys521
 */
public class FuzzyMatcher {

    private final String[] list;
    private float threshold;
    private int limit;

    /**
     * @param list list
     */
    public FuzzyMatcher(String[] list) {
        int len = list.length;
        this.list = Arrays.copyOf(list, len);
        this.threshold = Float.NaN;
        this.limit = -1;
    }

    /**
     * @param threshold threshold
     * @return this
     */
    public FuzzyMatcher setThreshold(float threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * @return this
     */
    public FuzzyMatcher clearThreshold() {
        this.threshold = Float.NaN;
        return this;
    }

    /**
     * @param limit limit
     * @return this
     */
    public FuzzyMatcher setLimit(int limit) {
        this.limit = limit;
        return this;
    }

    /**
     * @return this
     */
    public FuzzyMatcher clearLimit() {
        this.limit = -1;
        return this;
    }

    /**
     * @param str str
     * @return matches
     */
    public List<Entry<String, Float>> find(String str) {
        int len = list.length;
        List<Entry<String, Float>> matches = new ArrayList<Entry<String, Float>>(len);
        for (int i = 0; i < len; i++) {
            float distance = new FuzzyEvaluator(str, this.list[i]).getDistance();
            if (Float.isNaN(this.threshold) || distance <= this.threshold)
                matches.add(new AbstractMap.SimpleEntry<String, Float>(this.list[i], distance));
        }
        matches.sort(new Comparator<Entry<String, Float>>() {
            @Override
            public int compare(Entry<String, Float> o1, Entry<String, Float> o2) {
                return Float.compare(o1.getValue(), o2.getValue());
            }
        });
        if (this.limit > 0 && this.limit < matches.size()) matches = matches.subList(0, this.limit);
        return matches;
    }

}
