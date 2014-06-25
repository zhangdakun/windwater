// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.inzi.fengshuijewel.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CompassView extends ImageView
{

    public CompassView(Context context)
    {
        super(context);
        mDirection = 0.0F;
        compass = null;
    }

    public CompassView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mDirection = 0.0F;
        compass = null;
    }

    public CompassView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mDirection = 0.0F;
        compass = null;
    }

    protected void onDraw(Canvas canvas)
    {
        if(compass == null)
        {
            compass = getDrawable();
            compass.setBounds(0, 0, getWidth(), getHeight());
        }
        canvas.save();
        canvas.rotate(mDirection, getWidth() / 2, getHeight() / 2);
        compass.draw(canvas);
        canvas.restore();
    }

    public void updateDirection(float f)
    {
        mDirection = f;
        invalidate();
    }

    private Drawable compass;
    private float mDirection;
}
