package com.jiale.mininews.mvp.listener;

/**
 * Created by Administrator on 2016/12/16.
 */

public interface onLoadListener<T> {
    void loadSuccess(T t);
    void loadFail(String msg);
}
