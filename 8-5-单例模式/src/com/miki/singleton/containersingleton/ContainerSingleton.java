package com.miki.singleton.containersingleton;

import java.util.HashMap;
import java.util.Map;

/**【5】
 * @ClassName ContainerSingleton
 * @Description 8-9 单例设计模式-容器单例，通过map作为一个单例对象的容器
 * @Author miki
 * @Date 2020/2/16 17:35
 * @Version 1.0
 */
public class ContainerSingleton {

    private ContainerSingleton(){

    }

    //针对多个单例对象管理，一次性全部初始化，放在容器中管理
    //优点：对多个单例对象，方便管理
    //缺点：HashMap非线程安全，多线程下还是会破坏单例，使用线程安全的HashTable会影响性能，推荐使用ConcurrentHashMap线程安全
    private static Map<String,Object> singletonMap = new HashMap<>();

    public static void putInstance(String key,Object instance){
        if(null!=key && instance!=null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
