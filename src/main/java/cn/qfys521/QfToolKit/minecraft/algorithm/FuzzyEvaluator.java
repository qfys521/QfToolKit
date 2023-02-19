package cn.qfys521.Utils.minecraft.algorithm;

/**
 * @author qfys521
 */
public final class FuzzyEvaluator extends AbstractFuzzyEvaluator {
    /**
     * @param str1 str1
     * @param str2 str2
     */
    public FuzzyEvaluator(String str1, String str2) {
        super(str1, str2);
    }

    // 测试是否为空白
    private boolean isWhiteSpace(char ch) {
        return Character.isWhitespace(ch);
    }

    // 测试是否为中文全角字符对
    private boolean isFwCharPair(char ch1, char ch2) {
        final char[][] fwchars = {
                {'。', '.'},
                {'，', ','},
                {'：', ':'},
                {'；', ';'},
                {'“', '"'},
                {'”', '"'},
                {'‘', '\''},
                {'’', '\''},
                {'《', '<'},
                {'》', '>'},
        };
        for (int i = 0; i < fwchars.length; i++) {
            if (ch1 == fwchars[i][0] && ch2 == fwchars[i][1] ||
                    ch1 == fwchars[i][1] && ch2 == fwchars[i][0])
                return true;
        }
        return false;
    }

    // 测试是否为常见非空白ASCII字符(方块ID中频繁出现的种类)
    private boolean isCommonASCII(char ch) {
        if (ch >= 'a' && ch <= 'z') return true;
        if (ch >= 'A' && ch <= 'Z') return true;
        if (ch >= '0' && ch <= '9') return true;
        if (ch == '-' || ch == '_') return true;
        return false;
    }

    // 测试是否为ASCII字符
    private boolean isASCII(char ch) {
        if (ch > ' ' && ch <= '~') return true;
        return false;
    }
	
	/* 测试是否为中文字符等
	private boolean isCJKV(char ch) {
		return Character.isIdeographic(String.valueOf(ch).codePointAt(0)); 
	}*/


    @Override
    protected boolean isCharEqual(char src, char dest) {
        // 严格判断相等
        return src == dest;
        // 忽略大小写
//		return Character.toLowerCase(src) == Character.toLowerCase(dest); 
    }

    @Override
    protected float getInsertionDistance(char ch) {
        if (this.isWhiteSpace(ch) || ch == '_') {
            // 插入删除空格与ID分隔符 权值为5
            return 5.0f;
        }
        // 插入常规字符 权值为10
        return 10.0f;
    }

    @Override
    protected float getDeletionDistance(char ch) {
        if (this.isWhiteSpace(ch)) {
            // 插入删除空格 权值为5
            return 5.0f;
        }
        // 删除常规字符 权值为10
        return 10.0f;
    }

    @Override
    protected float getReplacementDistance(char src, char dest) {
        if (Character.toLowerCase(src) == Character.toLowerCase(dest)) {
            // 大小写转换 权值为5
            return 5.0f;
        }
        if (this.isFwCharPair(src, dest)) {
            // 等价全角与半角字符转换 权值为5
            return 5.0f;
        }
        boolean srcIsCommonAscii = this.isCommonASCII(src);
        boolean destIsCommonAscii = this.isCommonASCII(dest);
        if (srcIsCommonAscii && destIsCommonAscii) {
            // 方块ID中常见的字符转换 权值为40
            return 40.0f;
        }
        boolean srcIsAscii = srcIsCommonAscii || this.isASCII(src);
        boolean destIsAscii = destIsCommonAscii || this.isASCII(dest);
        if ((srcIsAscii && destIsAscii) || (!srcIsAscii && !srcIsAscii)) {
            // 同种字符转换 权值为50
            return 50.0f;
        }
        // 中英文互转 权值为70
        return 70.0f;
    }

    @Override
    protected float getTranspositionDistance(char head, char tail) {
        if (this.isASCII(head) && this.isASCII(tail)) {
            // 英文字母容易键入时发生扭转 权值为5
            return 5.0f;
        }
        // 其他扭转 权值为20
        return 20.0f;
    }

}
