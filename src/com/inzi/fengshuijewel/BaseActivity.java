// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.inzi.fengshuijewel;

import android.app.Activity;
import android.os.Bundle;
//import com.baidu.mobstat.StatService;

public class BaseActivity extends Activity
{

    public BaseActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onPause()
    {
        super.onPause();
//        StatService.onPause(this);
    }

    protected void onResume()
    {
        super.onResume();
//        StatService.onResume(this);
    }
}
