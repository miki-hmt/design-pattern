package com.miki.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseCatalog
 * @Description TODO 课程目录实体
 * @Author miki
 * @Date 2020/2/24 21:37
 * @Version 1.0
 */
public class CourseCatalog extends CatalogComponent{

    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    //目录等级，不能用int，会有默认值
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    //重写下面相关方法,不需要重写getPrice()没人会买课程目录
    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent component : items){
            if(null!=level){
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
            }
            component.print();
        }
    }
}
