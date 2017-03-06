package com.jiale.mininews.mvp.model;

import android.support.annotation.NonNull;

import com.jiale.mininews.mvp.listener.onLoadTypeListener;

/**
 * Created by Administrator on 2016/12/16.
 */

public interface PhotoModel<T> {

   void loadPhotoList(int type ,int count ,int page,@NonNull onLoadTypeListener<T> listener);
}
