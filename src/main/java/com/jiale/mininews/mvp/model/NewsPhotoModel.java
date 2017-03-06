package com.jiale.mininews.mvp.model;

import com.jiale.mininews.mvp.listener.onLoadListener;

/**
 * Created by Administrator on 2016/12/16.
 */

public interface NewsPhotoModel<T> {
    void getPhotoSet(String skipId_1, String skipId_2, onLoadListener<T> listener);
}
