package com.miki.memento;

/**
 * @ClassName Article
 * @Description TODO
 * @Author miki
 * @Date 2020/3/31 17:17
 * @Version 1.0
 */
public class Article {

    private String name;
    private String content;
    private String imgs;

    public Article(String name, String content, String imgs) {
        this.name = name;
        this.content = content;
        this.imgs = imgs;
    }

    //保存快照
    public ArticleMemento saveToMemento(){
        return new ArticleMemento(this.name,this.content,this.imgs);
    }

    //撤销保存
    public void undoFromMemento(ArticleMemento articleMemento){
        this.name = articleMemento.getName();
        this.content = articleMemento.getContent();
        this.imgs = articleMemento.getImgs();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
