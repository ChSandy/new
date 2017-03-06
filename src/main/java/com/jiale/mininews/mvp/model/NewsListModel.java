package com.jiale.mininews.mvp.model;

/**
 * Created by Administrator on 2016/12/16.
 */

public interface NewsListModel {
    /*从网络获取新闻数据*/
    void loadData(int requestType,String id,int page);
}
