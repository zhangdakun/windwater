// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.inzi.fengshuijewel;

import android.content.Intent;
import android.os.Bundle;

// Referenced classes of package com.inzi.fengshuijewel:
//            BaseActivity, MainActivity

public class LoadingActivity extends BaseActivity
{

    public LoadingActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030006);
        (new Thread() {

            public void run()
            {
                try
                {
                    sleep(3000L);
                }
                catch(InterruptedException interruptedexception)
                {
                    interruptedexception.printStackTrace();
                }
                startActivity(new Intent(LoadingActivity.this, ClassifyActivity.class));
                finish();
            }

//            final LoadingActivity this$0;
//
//            
//            {
//                this$0 = LoadingActivity.this;
//                super();
//            }
        }
).start();
    }
}
