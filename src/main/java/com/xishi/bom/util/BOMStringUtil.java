package com.xishi.bom.util;

/**
 * Created by john on 15/6/1.
 */
public class BOMStringUtil {
    /**
     * 将字符串除前m位，后n位的其余字符用symbol替换，并返回处理后的字符串
     */
    public static String replaceWithSymbol(String src, int m, int n, String symbol){
        if(src.length() <= (m+n)) return src;
        else{
            String prefix = src.substring(0,m);
            String suffix = src.substring(src.length()-n,src.length());
            StringBuilder symbols = new StringBuilder();
            for(int i=0; i<src.length()-(m+n); i++) {
                symbols.append(symbol);
            }
            return prefix + symbols + suffix;
        }
    }
}
