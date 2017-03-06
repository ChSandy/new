package com.jiale.mininews;

import android.app.Application;

import com.jiale.mininews.apis.ApiConstans;

import cn.sharesdk.framework.ShareSDK;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Administrator on 2016/12/16.
 */

public class App extends Application {
    private static App instance;
    private static Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        ShareSDK.initSDK(this);
        instance = this;
    }

    public static App getInstance() {
        return instance;
    }

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            synchronized (App.class) {
                if (retrofit == null) {
                    retrofit = new Retrofit.Builder()
                            .baseUrl(ApiConstans.HOST_NETEASE)
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .build();
                    return retrofit;
                }
            }
        }
        return retrofit;
    }
}
