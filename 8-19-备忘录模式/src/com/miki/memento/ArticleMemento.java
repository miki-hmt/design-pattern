package com.miki.memento;

/**
 * @ClassName ArticleMemento
 * @Description TODO 文章快照实体，不需要setter方法
 * @Author miki
 * @Date 2020/3/31 17:19
 * @Version 1.0
 */
public class ArticleMemento {

    private String name;
    private String content;
    private String imgs;

    public ArticleMemento(String name, String content, String imgs) {
        this.name = name;
        this.content = content;
        this.imgs = imgs;
    }

    //不需要setter方法
    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getImgs() {
        return imgs;
    }

    @Override
    public String toString() {
        return "ArticleMemento{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
