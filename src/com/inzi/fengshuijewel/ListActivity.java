// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.inzi.fengshuijewel;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.*;

import java.util.List;

import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

import com.android.adlib.ADbaseActivity;
import com.myapps.fengshuijewel.R;

// Referenced classes of package com.inzi.fengshuijewel:
//            BaseActivity, ReadingActivity

public class ListActivity extends ADbaseActivity
{

    public ListActivity()
    {
        int ai[] = new int[12];
        ai[0] = 0x7f020066;
        ai[1] = 0x7f020061;
        ai[2] = 0x7f02005e;
        ai[3] = 0x7f02005f;
        ai[4] = 0x7f020065;
        ai[5] = 0x7f020064;
        ai[6] = 0x7f02005d;
        ai[7] = 0x7f020067;
        ai[8] = 0x7f020063;
        ai[9] = 0x7f020068;
        ai[10] = 0x7f020060;
        ai[11] = 0x7f020069;
        top = ai;
        int ai1[] = new int[12];
        ai1[0] = 0x7f020072;
        ai1[1] = 0x7f020029;
        ai1[2] = 0x7f020014;
        ai1[3] = 0x7f020010;
        ai1[4] = 0x7f02006e;
        ai1[5] = 0x7f020059;
        ai1[6] = 0x7f02000c;
        ai1[7] = 0x7f020076;
        ai1[8] = 0x7f020054;
        ai1[9] = 0x7f02007a;
        ai1[10] = 0x7f020025;
        ai1[11] = 0x7f02007e;
        tvid = ai1;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.activity_list);
        
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        lv = (ListView)findViewById(0x7f080022);
        iv = (ImageView)findViewById(0x7f08001f);
        tv = (ImageView)findViewById(0x7f080023);
        ibtn_back = (ImageButton)findViewById(0x7f080021);
        tag = getIntent().getIntExtra("name", -1);
        List list = lsr;
        String as[] = new String[1];
        as[0] = "name";
        int ai[] = new int[1];
        ai[0] = 0x7f080039;
        sad = new SimpleAdapter(this, list, 0x7f03000a, as, ai);
        lv.setDivider(null);
        lv.setAdapter(sad);
//        tag;
//        JVM INSTR tableswitch 1 12: default 208
    //                   1 239
    //                   2 280
    //                   3 321
    //                   4 362
    //                   5 403
    //                   6 444
    //                   7 485
    //                   8 526
    //                   9 567
    //                   10 608
    //                   11 649
    //                   12 690;
//           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
//_L1:
        ibtn_back.setOnClickListener(new android.view.View.OnClickListener() {

            public void onClick(View view)
            {
                finish();
            }

//            final ListActivity this$0;
//
//            
//            {
//                this$0 = ListActivity.this;
//                super();
//            }
        }
);
        lv.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
//                tag;
//                JVM INSTR tableswitch 1 12: default 68
//            //                           1 69
//            //                           2 179
//            //                           3 289
//            //                           4 1279
//            //                           5 399
//            //                           6 509
//            //                           7 619
//            //                           8 729
//            //                           9 839
//            //                           10 949
//            //                           11 1059
//            //                           12 1169;
//                   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
//_L1:
//                return;
//_L2:
                   switch(tag) {
                   case 1:
                Intent intent11 = new Intent();
                if(i < 9)
                    intent11.putExtra("path", (new StringBuilder()).append("woshi/woshi0").append(i + 1).append(".txt").toString());
                else
                    intent11.putExtra("path", (new StringBuilder()).append("woshi/woshi").append(i + 1).append(".txt").toString());
                intent11.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent11);
                break;
//_L3:
                   case 2:
                Intent intent10 = new Intent();
                if(i < 9)
                    intent10.putExtra("path", (new StringBuilder()).append("keting/keting0").append(i + 1).append(".txt").toString());
                else
                    intent10.putExtra("path", (new StringBuilder()).append("keting/keting").append(i + 1).append(".txt").toString());
                intent10.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent10);
                break;
//_L4:
                   case 3:
                Intent intent9 = new Intent();
                if(i < 9)
                    intent9.putExtra("path", (new StringBuilder()).append("chufang/chufang0").append(i + 1).append(".txt").toString());
                else
                    intent9.putExtra("path", (new StringBuilder()).append("chufang/chufang").append(i + 1).append(".txt").toString());
                intent9.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent9);
                break;
//_L6:
                   case 4:
                Intent intent8 = new Intent();
                if(i < 9)
                    intent8.putExtra("path", (new StringBuilder()).append("weishengjian/weishengjian0").append(i + 1).append(".txt").toString());
                else
                    intent8.putExtra("path", (new StringBuilder()).append("weishengjian/weishengjian").append(i + 1).append(".txt").toString());
                intent8.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent8);
                break;
//_L7:
                   case 5:
                Intent intent7 = new Intent();
                if(i < 9)
                    intent7.putExtra("path", (new StringBuilder()).append("shufang/shufang0").append(i + 1).append(".txt").toString());
                else
                    intent7.putExtra("path", (new StringBuilder()).append("shufang/shufang").append(i + 1).append(".txt").toString());
                intent7.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent7);
                break;
//_L8:
                   case 6:
                Intent intent6 = new Intent();
                if(i < 9)
                    intent6.putExtra("path", (new StringBuilder()).append("canting/canting0").append(i + 1).append(".txt").toString());
                else
                    intent6.putExtra("path", (new StringBuilder()).append("canting/canting").append(i + 1).append(".txt").toString());
                intent6.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent6);
                break;
//_L9:
                   case 7:
                Intent intent5 = new Intent();
                if(i < 9)
                    intent5.putExtra("path", (new StringBuilder()).append("yangtai/yangtai0").append(i + 1).append(".txt").toString());
                else
                    intent5.putExtra("path", (new StringBuilder()).append("yangtai/yangtai").append(i + 1).append(".txt").toString());
                intent5.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent5);
                break;
//_L10:
                   case 8:
                Intent intent4 = new Intent();
                if(i < 9)
                    intent4.putExtra("path", (new StringBuilder()).append("shiwu/shiwu0").append(i + 1).append(".txt").toString());
                else
                    intent4.putExtra("path", (new StringBuilder()).append("shiwu/shiwu").append(i + 1).append(".txt").toString());
                intent4.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent4);
                break;
//_L11:
                   case 9:
                Intent intent3 = new Intent();
                if(i < 9)
                    intent3.putExtra("path", (new StringBuilder()).append("yugang/yugang0").append(i + 1).append(".txt").toString());
                else
                    intent3.putExtra("path", (new StringBuilder()).append("yugang/yugang").append(i + 1).append(".txt").toString());
                intent3.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent3);
                break;
//_L12:
                   case 10:
                Intent intent2 = new Intent();
                if(i < 9)
                    intent2.putExtra("path", (new StringBuilder()).append("jingzi/jingzi0").append(i + 1).append(".txt").toString());
                else
                    intent2.putExtra("path", (new StringBuilder()).append("jingzi/jingzi").append(i + 1).append(".txt").toString());
                intent2.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent2);
                break;
//_L13:
                   case 11:
                Intent intent1 = new Intent();
                if(i < 9)
                    intent1.putExtra("path", (new StringBuilder()).append("zhiwu/zhiwu0").append(i + 1).append(".txt").toString());
                else
                    intent1.putExtra("path", (new StringBuilder()).append("zhiwu/zhiwu").append(i + 1).append(".txt").toString());
                intent1.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent1);
                break;
//_L5:
                   case 12:
                Intent intent = new Intent();
                if(i < 9)
                    intent.putExtra("path", (new StringBuilder()).append("chuang/chuang0").append(i + 1).append(".txt").toString());
                else
                    intent.putExtra("path", (new StringBuilder()).append("chuang/chuang").append(i + 1).append(".txt").toString());
                intent.setClass(ListActivity.this, ReadingActivity.class);
                startActivity(intent);
//                if(true) goto _L1; else goto _L14
//_L14:
                   }
            }

//            final ListActivity this$0;
//
//            
//            {
//                this$0 = ListActivity.this;
//                super();
//            }
        }
);
//        return;
        switch(tag) {
//_L2:
        case 1:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L3:
        case 2:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L4:
        case 3:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L5:
        case 4:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L6:
        case 5:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L7:
        case 6:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L8:
        case 7:
        tv.setBackgroundResource(tvid[-1 + tag]);
        iv.setBackgroundResource(top[-1 + tag]);
        break;
//_L9:
        case 8:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L10:
        case 9:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L11:
        case 10:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L12:
        case 11:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
        break;
//_L13:
        case 12:
        iv.setBackgroundResource(top[-1 + tag]);
        tv.setBackgroundResource(tvid[-1 + tag]);
//        if(true) goto _L1; else goto _L14
//_L14:
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if(i == 4 && keyevent.getRepeatCount() == 0)
            finish();
        return super.onKeyDown(i, keyevent);
    }

    public static List lsr;
    private ImageButton ibtn_back;
    private ImageView iv;
    private ListView lv;
    private SimpleAdapter sad;
    private int tag;
    private int top[];
    private ImageView tv;
    private int tvid[];

}
