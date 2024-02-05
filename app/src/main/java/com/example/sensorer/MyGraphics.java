package com.example.sensorer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.view.View;

import androidx.annotation.NonNull;

public class MyGraphics extends View {

    int viewWidth, viewHeight, textSize;
    int xPos, yPos, radius;
    Paint paint = new Paint();
    public MyGraphics(Activity activity) {
        super(activity);

        Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        viewWidth = size.x;
        viewHeight = size.y;
        textSize = viewHeight/20;

        xPos = size.x/2;
        yPos = size.y/2;
        radius = size.x/4;
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(0xFFFF0000);
        canvas.drawCircle(xPos,yPos,radius,paint);
    }
}
