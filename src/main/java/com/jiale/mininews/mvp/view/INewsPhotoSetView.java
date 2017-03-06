package com.jiale.mininews.mvp.view;

import com.jiale.mininews.bean.NewsPhotoBean;


/**
 * Created by Administrator on 2016/12/16.
 */

public interface INewsPhotoSetView extends IBaseView {
    void initPhotoSetSuccess(NewsPhotoBean newsPhotoBean);

    void initPhotoSetFail(String msg);
}
