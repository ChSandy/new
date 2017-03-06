package com.jiale.mininews.mvp.model;

import android.content.Context;

import com.jiale.mininews.mvp.listener.onLoadChannelListener;

/**
 * Created by Administrator on 2016/12/16.
 */

public interface ChannelModel<T> {
    /*获取频道列表*/
    void getChannelList(Context context, onLoadChannelListener<T> listener);

    /*保存频道设置*/
    void saveChannel(Context context,T t);
}
