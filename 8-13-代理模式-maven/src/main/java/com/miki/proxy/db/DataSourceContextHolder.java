package com.miki.proxy.db;

/**
 * @ClassName DataSourceContextHolder
 * @Description TODO 数据源上下文
 * @Author miki
 * @Date 2020/2/27 14:47
 * @Version 1.0
 */
public class DataSourceContextHolder {

    //使用threadlocal单例
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    //获取数据类型
    public static String getDBType(){
        return CONTEXT_HOLDER.get();
    }

    //清除db类型
    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }
}
