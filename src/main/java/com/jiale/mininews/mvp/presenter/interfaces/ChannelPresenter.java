package com.jiale.mininews.mvp.presenter.interfaces;

/**
 * Created by Administrator on 2016/12/16.
 */
public interface ChannelPresenter<T> {
    /*获取频道信息*/
    void getChannel();

    /*保存频道信息*/
    void saveChannel(T t);
}
