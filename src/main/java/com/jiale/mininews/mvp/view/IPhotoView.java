package com.jiale.mininews.mvp.view;

import com.jiale.mininews.bean.PhotoBean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16.
 */

public interface IPhotoView extends IBaseView {
    void loadPhotoList(int type, List<PhotoBean> list);
    void loadFail(int type, String msg);
}
