package com.miki.structural;

/**【1】
 * @ClassName PointsGift
 * @Description TODO 创建一个积分礼物实体类
 * @Author miki
 * @Date 2020/2/22 12:34
 * @Version 1.0
 */
public class PointsGift {

    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
