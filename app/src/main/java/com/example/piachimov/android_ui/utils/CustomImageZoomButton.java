package com.example.piachimov.android_ui.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;

import com.example.piachimov.android_ui.R;
import com.vatsal.imagezoomer.ImageZoomButton;


public class CustomImageZoomButton extends ImageZoomButton {
    Paint paint = new Paint();
    public CustomImageZoomButton(Context context) {
        super(context);
    }

    public CustomImageZoomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomImageZoomButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        float width = (float)getWidth();
        float height = (float)getHeight();
        paint.setStrokeWidth(width/20 + height/20);
        float cornerRadius = width/20 + height/20;
        float right = width + width/60;
        float bottom = height + height/60;
        float left = -(width/50);
        float top = -(height/50);
        canvas.drawRoundRect(new RectF(left, top, right, bottom), cornerRadius, cornerRadius, paint);
        paint.setColor(ContextCompat.getColor(getContext(), R.color.photoBorderColor));
        paint.setStrokeWidth(width/100 + height/100);
        cornerRadius = width/20 + height/20;
        right = width - width/40;
        bottom = height - height/40;
        left = width/50;
        top = height/50;
        canvas.drawRoundRect(new RectF(left, top, right, bottom), cornerRadius, cornerRadius, paint);
    }
}
