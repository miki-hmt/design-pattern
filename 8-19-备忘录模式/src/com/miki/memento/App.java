package com.miki.memento;

/**
 * @ClassName App
 * @Description TODO 备忘录模式应用层代码模拟
 * @Author miki
 * @Date 2020/3/31 17:36
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        ArticleMementoManager mementoManager = new ArticleMementoManager();

        //##### 第一次保存
        Article article = new Article("如影随形的设计模式A", "手记内容A", "手记图片A");
        ArticleMemento articleMemento = article.saveToMemento();

        mementoManager.addMemento(articleMemento);
        System.out.println("标题："+article.getName()+" 内容："+article.getContent()+" 图片："+article.getImgs());
        System.out.println("完整手记信息："+article);

        //##### 第一次修改
        System.out.println("修改手记信息：start");
        article.setName("如影随形的设计模式2");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");
        System.out.println("修改手记完成：end");
        System.out.println("手记完整信息："+article);
        articleMemento = article.saveToMemento();

        mementoManager.addMemento(articleMemento);

        //##### 第二次修改
        article.setName("如影随形的设计模式3");
        article.setContent("手记内容C");
        article.setImgs("手记图片C");
        System.out.println("暂停回退：start");
        System.out.println("回退出栈一次");
        articleMemento = mementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("手记完整信息："+article);

        System.out.println("回退出栈两次");
        articleMemento = mementoManager.getMemento();
        article.undoFromMemento(articleMemento);
        System.out.println("暂停回退：end");
        System.out.println("手记完整信息："+article);

    }
}
