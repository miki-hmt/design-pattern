package com.miki.memento;

import java.util.Stack;

/**
 * @ClassName ArticleMementoManager
 * @Description TODO 文章快照管理类
 * @Author miki
 * @Date 2020/3/31 17:26
 * @Version 1.0
 */
public class ArticleMementoManager {

    public final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }


}
