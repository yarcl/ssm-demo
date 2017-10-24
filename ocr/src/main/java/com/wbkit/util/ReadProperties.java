package com.wbkit.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Administrator on 2017/10/13.
 */
public class ReadProperties {
    public static String strategyPath;
    private static String size;
    public static int threadSize;
    static {
        InputStream is = ReadProperties.class.getClassLoader().getResourceAsStream("strategy.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
            strategyPath = properties.getProperty("strategyPath");
            threadSize = Integer.parseInt(null!=(size = properties.getProperty("threadSize"))?size:"1");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null!=is){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



}

