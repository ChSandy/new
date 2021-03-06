package com.jiale.mininews.mvp.view;


import com.jiale.mininews.bean.NewsBean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */

public interface INewsListView extends IBaseView<List<NewsBean>> {
    /*下载成功*/
    void loadSuccess(int requestType, List<NewsBean> list);

    /*下载失败*/
    void loadError(int requestType, String msg);
}
