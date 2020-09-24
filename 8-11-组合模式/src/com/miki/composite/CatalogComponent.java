package com.miki.composite;

/**
 * @ClassName CatalogComponent
 * @Description TODO 新建一个目录实体组件
 * @Author miki
 * @Date 2020/2/24 21:28
 * @Version 1.0
 */
public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作...");
    }

    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持删除操作...");
    }

    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持获取名称操作...");
    }

    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不支持添加操作...");
    }

    public void print(){
        throw new UnsupportedOperationException("不支持打印操作...");
    }
}
