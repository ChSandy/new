package com.jiale.mininews.mvp.presenter.interfaces;

import com.jiale.mininews.mvp.listener.onLoadTypeListener;


/**
 * presenter基类
 * Created by Administrator on 2016/12/16.
 */
public interface BasePresenter<T> extends onLoadTypeListener<T> {

    void loadData(int requestType ,String id);

}
