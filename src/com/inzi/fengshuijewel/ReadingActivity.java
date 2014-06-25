// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.inzi.fengshuijewel;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.adlib.ADbaseActivity;
import com.myapps.fengshuijewel.R;
import java.io.IOException;
import java.io.InputStream;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import org.apache.http.util.EncodingUtils;

// Referenced classes of package com.inzi.fengshuijewel:
//            BaseActivity

public class ReadingActivity extends ADbaseActivity
{

    public ReadingActivity()
    {
    }

    private String codetype(byte abyte0[])
    {
        System.arraycopy(abyte0, 0, new byte[4], 0, 4);
        String s;
        if(abyte0[0] == -1 && abyte0[1] == -2)
            s = "UTF-16";
        else
        if(abyte0[0] == -2 && abyte0[1] == -1)
            s = "Unicode";
        else
        if(abyte0[0] == -17 && abyte0[1] == -69 && abyte0[2] == -65)
            s = "UTF-8";
        else
            s = "gb2312";
        return s;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.activity_content);
        
      LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
      AdView adView = new AdView(this, AdSize.FIT_SCREEN);
      adLayout.addView(adView);
        
        tv = (TextView)findViewById(0x7f080017);
        ibtn_back = (ImageButton)findViewById(0x7f080016);
        path = getIntent().getStringExtra("path");
//        com.baoyi.ad_client.util.Utils.getBanner getbanner;
//        Activity aactivity[];
//        com.baoyi.ad_client.util.Utils.getCP getcp;
//        Activity aactivity1[];
        try
        {
            InputStream inputstream = getResources().getAssets().open(path);
            byte abyte0[] = new byte[inputstream.available()];
            inputstream.read(abyte0);
            String s = EncodingUtils.getString(abyte0, codetype(abyte0));
            inputstream.close();
            tv.setText(s);
        }
        catch(IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        ibtn_back.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                finish();
            }

//            final ReadingActivity this$0;
//
//            
//            {
//                this$0 = ReadingActivity.this;
//                super();
//            }
        }
);
//        getbanner = new com.baoyi.ad_client.util.Utils.getBanner();
//        aactivity = new Activity[1];
//        aactivity[0] = this;
//        getbanner.execute(aactivity);
//        getcp = new com.baoyi.ad_client.util.Utils.getCP();
//        aactivity1 = new Activity[1];
//        aactivity1[0] = this;
//        getcp.execute(aactivity1);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if(i == 4 && keyevent.getRepeatCount() == 0)
            finish();
        return super.onKeyDown(i, keyevent);
    }

    private ImageButton ibtn_back;
    private String path;
    private TextView tv;
}
