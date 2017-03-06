package com.jiale.mininews.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

/**
 * Created by Administrator on 2016/12/16.
 */

public class NewsDetailDrawable extends BitmapDrawable {
    public Bitmap bitmap;

    @Override
    public void draw(Canvas canvas) {
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0, 0, getPaint());
        }
    }
}
