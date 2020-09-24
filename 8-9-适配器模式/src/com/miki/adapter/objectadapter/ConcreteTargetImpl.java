package com.miki.adapter.objectadapter;

/**
 * @ClassName ConcreteTargetImpl
 * @Description TODO Target接口实现类之一
 * @Author miki
 * @Date 2020/2/23 21:37
 * @Version 1.0
 */
public class ConcreteTargetImpl implements Target {

    @Override
    public void request() {
        System.out.println("conreteTarget目标方法...");
    }
}
