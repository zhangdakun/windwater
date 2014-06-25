// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.inzi.fengshuijewel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.android.adlib.ADbaseActivity;
import com.myapps.fengshuijewel.R;
import java.util.*;

import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;

// Referenced classes of package com.inzi.fengshuijewel:
//            BaseActivity, ListActivity

public class ClassifyActivity extends ADbaseActivity
    implements android.view.View.OnClickListener
{

    public ClassifyActivity()
    {
    }

    public void onClick(View view)
    {
    	switch (view.getId()) {
		case 2131230725:
	        ListActivity.lsr = woshi;
	        Intent intent11 = new Intent();
	        intent11.putExtra("name", 1);
	        intent11.setClass(this,  ListActivity.class);
	        startActivity(intent11);
			break;
		case 2131230726:
	        ListActivity.lsr = keting;
	        Intent intent10 = new Intent();
	        intent10.putExtra("name", 2);
	        intent10.setClass(this, ListActivity.class);
	        startActivity(intent10);
			break;
		case 2131230727:
	        ListActivity.lsr = chufang;
	        Intent intent9 = new Intent();
	        intent9.putExtra("name", 3);
	        intent9.setClass(this, ListActivity.class);
	        startActivity(intent9);
			break;
		case 2131230728:
	        ListActivity.lsr = chuang;
	        Intent intent = new Intent();
	        intent.putExtra("name", 4);
	        intent.setClass(this, ListActivity.class);
	        startActivity(intent);
			break;
		case 2131230729:
	        ListActivity.lsr = weishengjian;
	        Intent intent8 = new Intent();
	        intent8.putExtra("name", 5);
	        intent8.setClass(this, ListActivity.class);
	        startActivity(intent8);
			break;
		case 2131230730:
	        ListActivity.lsr = shufang;
	        Intent intent7 = new Intent();
	        intent7.putExtra("name", 6);
	        intent7.setClass(this, ListActivity.class);
	        startActivity(intent7);
			break;
		case 2131230731:
	        ListActivity.lsr = canting;
	        Intent intent6 = new Intent();
	        intent6.putExtra("name", 7);
	        intent6.setClass(this, ListActivity.class);
	        startActivity(intent6);
			break;
		case 2131230732:
	        ListActivity.lsr = yangtai;
	        Intent intent5 = new Intent();
	        intent5.putExtra("name", 8);
	        intent5.setClass(this, ListActivity.class);
	        startActivity(intent5);
			break;
		case 2131230733:
	        ListActivity.lsr = shiwu;
	        Intent intent4 = new Intent();
	        intent4.putExtra("name", 9);
	        intent4.setClass(this, ListActivity.class);
	        startActivity(intent4);
			break;
		case 2131230734: {
	        ListActivity.lsr = yugang;
	        Intent intent3 = new Intent();
	        intent3.putExtra("name", 10);
	        intent3.setClass(this, ListActivity.class);
	        startActivity(intent3);
		}
			break;
		case 2131230735:
	        ListActivity.lsr = jingzi;
	        Intent intent2 = new Intent();
	        intent2.putExtra("name", 11);
	        intent2.setClass(this, ListActivity.class);
	        startActivity(intent2);
			break;
		case 2131230736:
	        ListActivity.lsr = zhiwu;
	        Intent intent1 = new Intent();
	        intent1.putExtra("name", 12);
	        intent1.setClass(this, ListActivity.class);
	        startActivity(intent1);
			break;
		default:
			break;
		}
//        view.getId();
//        JVM INSTR tableswitch 2131230725 2131230736: default 68
//    //                   2131230725 69
//    //                   2131230726 112
//    //                   2131230727 155
//    //                   2131230728 549
//    //                   2131230729 198
//    //                   2131230730 241
//    //                   2131230731 285
//    //                   2131230732 329
//    //                   2131230733 373
//    //                   2131230734 417
//    //                   2131230735 461
//    //                   2131230736 505;
//           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
//_L1:
//        return;
//_L2:
//        ListActivity.lsr = woshi;
//        Intent intent11 = new Intent();
//        intent11.putExtra("name", 1);
//        intent11.setClass(this,  ListActivity.class);
//        startActivity(intent11);
//        continue; /* Loop/switch isn't completed */
//_L3:
//        ListActivity.lsr = keting;
//        Intent intent10 = new Intent();
//        intent10.putExtra("name", 2);
//        intent10.setClass(this, ListActivity.class);
//        startActivity(intent10);
//        continue; /* Loop/switch isn't completed */
//_L4:
//
//        continue; /* Loop/switch isn't completed */
//_L6:
//
//        continue; /* Loop/switch isn't completed */
//_L7:
//
//        continue; /* Loop/switch isn't completed */
//_L8:
//
//        continue; /* Loop/switch isn't completed */
//_L9:
//
//        continue; /* Loop/switch isn't completed */
//_L10:
//
//        continue; /* Loop/switch isn't completed */
//_L11:
//
//        continue; /* Loop/switch isn't completed */
//_L12:
//
//        continue; /* Loop/switch isn't completed */
//_L13:
//
//        continue; /* Loop/switch isn't completed */
//_L5:
//        ListActivity.lsr = chuang;
//        Intent intent = new Intent();
//        intent.putExtra("name", 4);
//        intent.setClass(this, com/inzi/fengshuijewel/ListActivity);
//        startActivity(intent);
//        if(true) goto _L1; else goto _L14
//_L14:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        
        AdManager.getInstance(this).init("f8afa9674b82e80a",
        	    "c0e43a42318a3f9f", false);
        
        setContentView(R.layout.activity_classify);
        
        LinearLayout adLayout = (LinearLayout) findViewById(R.id.adLayout);
        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
        adLayout.addView(adView);
        
        ibtn_woshi = (ImageButton)findViewById(0x7f080005);
        ibtn_keting = (ImageButton)findViewById(0x7f080006);
        ibtn_chufang = (ImageButton)findViewById(0x7f080007);
        ibtn_weishengjian = (ImageButton)findViewById(0x7f080009);
        ibtn_shufang = (ImageButton)findViewById(0x7f08000a);
        ibtn_canting = (ImageButton)findViewById(0x7f08000b);
        ibtn_yangtai = (ImageButton)findViewById(0x7f08000c);
        ibtn_shiwu = (ImageButton)findViewById(0x7f08000d);
        ibtn_yugang = (ImageButton)findViewById(0x7f08000e);
        ibtn_jingzi = (ImageButton)findViewById(0x7f08000f);
        ibtn_zhiwu = (ImageButton)findViewById(0x7f080010);
        ibtn_chuang = (ImageButton)findViewById(0x7f080008);
        ibtn_woshi.setOnClickListener(this);
        ibtn_keting.setOnClickListener(this);
        ibtn_chufang.setOnClickListener(this);
        ibtn_weishengjian.setOnClickListener(this);
        ibtn_shufang.setOnClickListener(this);
        ibtn_canting.setOnClickListener(this);
        ibtn_yangtai.setOnClickListener(this);
        ibtn_yugang.setOnClickListener(this);
        ibtn_jingzi.setOnClickListener(this);
        ibtn_zhiwu.setOnClickListener(this);
        ibtn_chuang.setOnClickListener(this);
        ibtn_shiwu.setOnClickListener(this);
        woshi = new ArrayList();
        HashMap hashmap = new HashMap();
        hashmap.put("name", "\u5367\u5BA4\u597D\u98CE\u6C34 \u5982\u4F55\u63D0\u9AD8\u7761\u7720\u8D28\u91CF");
        woshi.add(hashmap);
        HashMap hashmap1 = new HashMap();
        hashmap1.put("name", "\u5E38\u88AB\u5FFD\u89C6\u7684\u5367\u5BA4\u5E8A\u5934\u67DC\u98CE\u6C34");
        woshi.add(hashmap1);
        HashMap hashmap2 = new HashMap();
        hashmap2.put("name", "\u5367\u5BA4\u5E8A\u7684\u6446\u8BBE\u8981\u6CE8\u610F\u54EA\u51E0\u70B9");
        woshi.add(hashmap2);
        HashMap hashmap3 = new HashMap();
        hashmap3.put("name", "\u8BA9\u4F60\u6709\u597D\u8FD0\u7684\u5367\u5BA4\u98CE\u6C34");
        woshi.add(hashmap3);
        HashMap hashmap4 = new HashMap();
        hashmap4.put("name", "\u5367\u5BA4\u98CE\u6C34\u6CE8\u610F\u4E8B\u9879");
        woshi.add(hashmap4);
        HashMap hashmap5 = new HashMap();
        hashmap5.put("name", "\u513F\u7AE5\u5367\u5BA4\u91CC\u98CE\u6C34\u5982\u4F55\u5E03\u5C40");
        woshi.add(hashmap5);
        HashMap hashmap6 = new HashMap();
        hashmap6.put("name", "\u5927\u5E08\u89E3\u6790\uFF1A\u600E\u6837\u7684\u5367\u5BA4\u98CE\u6C34\u53EF\u5F97\u5B50");
        woshi.add(hashmap6);
        HashMap hashmap7 = new HashMap();
        hashmap7.put("name", "\u89E3\u6790\u4E3B\u5367\u5BA4\u5F00\u8FD0\u98CE\u6C34");
        woshi.add(hashmap7);
        HashMap hashmap8 = new HashMap();
        hashmap8.put("name", "\u65B0\u5BB6\u5367\u5BA4\u5E8A\u4F4D\u7684\u98CE\u6C34\u5E03\u5C40");
        woshi.add(hashmap8);
        HashMap hashmap9 = new HashMap();
        hashmap9.put("name", "\u7236\u6BCD\u5FC5\u770B\u7684\u5367\u5BA4\u98CE\u6C34");
        woshi.add(hashmap9);
        keting = new ArrayList();
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u98CE\u6C34\u7981\u5FCC");
        keting.add(map);
        map = new HashMap();
        map.put("name", "\u4E5D\u79CD\u5BB9\u6613\u7834\u8D22\u7684\u5BA2\u5385\u5927\u95E8");
        keting.add(map);
        map = new HashMap();
        map.put("name", "\u5584\u7528\u5BA2\u5385\u8272\u5F69\u63D0\u5347\u5BB6\u5C45\u8D22\u8FD0");
        keting.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u95E8\u7A97\u5BF9\u8D22\u4F4D\u98CE\u6C34\u7684\u5F71\u54CD");
        keting.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u88C5\u4FEE\u5999\u62DB\u5E2E\u4F60\u5DE7\u5316\u201C\u5C16\u89D2\u201D");
        keting.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u98CE\u6C34\u4E4B\u6C99\u53D1\u6446\u653E");
        keting.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u8336\u51E0\u7684\u98CE\u6C34");
        keting.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u80CC\u666F\u5899\u7684\u98CE\u6C34\u7981\u5FCC");
        keting.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u7684\u6881\u67F1\u98CE\u6C34");
        keting.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u98CE\u6C34\u4E4B\u978B\u67DC\u6446\u653E\u98CE\u6C34");
        keting.add(map);
        chufang = new ArrayList();
        map = new HashMap();
        map.put("name", "\u53A8\u623F\u98CE\u6C34\u7981\u5FCC");
        chufang.add(map);
        map = new HashMap();
        map.put("name", "\u53A8\u623F\u98CE\u6C34\u5927\u76D8\u70B9");
        chufang.add(map);
        map = new HashMap();
        map.put("name", "\u53A8\u623F\u98CE\u6C34\u7684\u4E94\u884C\u5E73\u8861");
        chufang.add(map);
        map = new HashMap();
        map.put("name", "\u7B80\u5355\u6539\u9020\u4E0D\u826F\u53A8\u623F\u98CE\u6C34");
        chufang.add(map);
        map = new HashMap();
        map.put("name", "\u5982\u4F55\u5E03\u7F6E\u98CE\u6C34\u987A\u7545\u7684\u53A8\u623F");
        chufang.add(map);
        map = new HashMap();
        map.put("name", "\u53A8\u623F\u62BD\u98CE\u6247\u6700\u5B9C\u5B89\u88C5\u4F4D\u7F6E");
        chufang.add(map);
        map = new HashMap();
        map.put("name", "\u53A8\u623F\u6700\u597D\u7684\u98CE\u6C34\u65B9\u4F4D");
        chufang.add(map);
        map = new HashMap();
        map.put("name", "\u600E\u6837\u624D\u7B97\u4E00\u4E2A\u5409\u7684\u53A8\u623F");
        chufang.add(map);
        map = new HashMap();
        map.put("name", "\u53A8\u623F\u4E0D\u53EF\u5FFD\u89C6\u7684\u65B9\u4F4D");
        chufang.add(map);
        map = new HashMap();
        map.put("name", "\u5DE7\u7528\u7089\u7076\u50AC\u8D22\u50AC\u4E01");
        chufang.add(map);
        weishengjian = new ArrayList();
        map = new HashMap();
        map.put("name", "\u536B\u751F\u95F4\u5E03\u5C40\u7684\u4E03\u5927\u7981\u5FCC");
        weishengjian.add(map);
        map = new HashMap();
        map.put("name", "\u56DB\u62DB\u63D0\u5347\u536B\u751F\u95F4\u98CE\u6C34");
        weishengjian.add(map);
        map = new HashMap();
        map.put("name", "\u536B\u751F\u95F4\u95E8\u5BF9\u5367\u5BA4\u95E8\u597D\u4E0D\u597D\uFF1F");
        weishengjian.add(map);
        map = new HashMap();
        map.put("name", "\u5316\u89E3\u536B\u751F\u95F4\u95E8\u5BF9\u5367\u5BA4\u95E8\u7684\u65B9\u6CD5");
        weishengjian.add(map);
        map = new HashMap();
        map.put("name", "\u536B\u751F\u95F4\u7684\u88C5\u4FEE\u98CE\u6C34\u6CE8\u610F\u4E8B\u9879");
        weishengjian.add(map);
        map = new HashMap();
        map.put("name", "\u536B\u751F\u95F4\u4E0D\u5B9C\u8BBE\u7ACB\u7684\u65B9\u4F4D\u6709\u54EA\u4E9B\uFF1F");
        weishengjian.add(map);
        map = new HashMap();
        map.put("name", "\u6559\u4F60\u89E3\u8BFB\u536B\u751F\u95F4\u98CE\u6C34");
        weishengjian.add(map);
        map = new HashMap();
        map.put("name", "\u536B\u751F\u95F4\u98CE\u6C34\u9700\u8981\u6CE8\u610F\u54EA\u4E9B\u7981\u5FCC\uFF1F");
        weishengjian.add(map);
        map = new HashMap();
        map.put("name", "\u536B\u751F\u95F4\u989C\u8272\u98CE\u6C34\u89E3\u8BFB");
        weishengjian.add(map);
        map = new HashMap();
        map.put("name", "\u536B\u751F\u95F4\u88C5\u4FEE\u4E5D\u5927\u7981\u5FCC");
        weishengjian.add(map);
        shufang = new ArrayList();
        map = new HashMap();
        map.put("name", "\u4E66\u623F\u98CE\u6C34\u52A9\u5B66\u4E1A");
        shufang.add(map);
        map = new HashMap();
        map.put("name", "\u4E66\u623F\u7684\u98CE\u6C34");
        shufang.add(map);
        map = new HashMap();
        map.put("name", "\u4E66\u623F\u98CE\u6C34\u6CE8\u610F\u51E0\u70B9");
        shufang.add(map);
        map = new HashMap();
        map.put("name", "\u4E66\u623F\u6446\u653E\u98CE\u6C34");
        shufang.add(map);
        map = new HashMap();
        map.put("name", "\u4E66\u684C\u6446\u653E\u201C\u4E94\u5B9C\u201D");
        shufang.add(map);
        map = new HashMap();
        map.put("name", "\u4E66\u623F\u98CE\u6C34\u2014\u2014\u4E66\u623F\u6302\u753B\u6446\u653E");
        shufang.add(map);
        map = new HashMap();
        map.put("name", "\u4E66\u623F\u7684\u98CE\u6C34\u2014\u2014\u6587\u660C\u5854\u7684\u6446\u653E");
        shufang.add(map);
        map = new HashMap();
        map.put("name", "\u4E66\u623F\u98CE\u6C34\u4E8C\u4E09\u4E8B");
        shufang.add(map);
        map = new HashMap();
        map.put("name", "\u4E66\u623F\u98CE\u6C348\u539F\u5219\u2014\u2014\u8BA9\u4E66\u9999\u6EE1\u5C4B");
        shufang.add(map);
        map = new HashMap();
        map.put("name", "\u4E66\u623F\u98CE\u6C34\u989C\u8272");
        shufang.add(map);
        canting = new ArrayList();
        map = new HashMap();
        map.put("name", "\u9910\u684C\u5B9C\u9009\u5706\u578B\u6216\u8005\u65B9\u5F62");
        canting.add(map);
        map = new HashMap();
        map.put("name", "\u9910\u5385\u5E03\u5C40\u8BEF\u533A\u7BC7");
        canting.add(map);
        map = new HashMap();
        map.put("name", "\u9910\u5385\u5E03\u5C40\u6B63\u786E\u7BC7");
        canting.add(map);
        map = new HashMap();
        map.put("name", "4\u62DB\u63D0\u5347\u9910\u5385\u98CE\u6C34");
        canting.add(map);
        map = new HashMap();
        map.put("name", "\u6B63\u786E\u8BA4\u8BC6\u9910\u5385\u98CE\u6C34");
        canting.add(map);
        map = new HashMap();
        map.put("name", "\u9152\u67DC\u6446\u653E\u7981\u5FCC");
        canting.add(map);
        map = new HashMap();
        map.put("name", "\u5DE7\u5999\u7834\u89E3\u9910\u5385\u5BF9\u5395\u6240\u95E8");
        canting.add(map);
        map = new HashMap();
        map.put("name", "\u641E\u597D\u9910\u5385\u98CE\u6C34 \u63D0\u5347\u5BB6\u4EBA\u8FD0\u6C14");
        canting.add(map);
        map = new HashMap();
        map.put("name", "\u9910\u5385\u98CE\u6C34\u6559\u4F60\u5982\u4F55\u907F\u715E");
        canting.add(map);
        map = new HashMap();
        map.put("name", "\u9910\u684C\u5E03\u5C40\u6700\u6613\u7834\u8D22\u62DB\u707E");
        canting.add(map);
        yangtai = new ArrayList();
        map = new HashMap();
        map.put("name", "\u9633\u53F0\u98CE\u6C34\u7981\u5FCC\u987B\u77E5");
        yangtai.add(map);
        map = new HashMap();
        map.put("name", "\u6CE8\u610F\u9633\u53F0\u98CE\u6C34\u7981\u5FCC");
        yangtai.add(map);
        map = new HashMap();
        map.put("name", "\u6253\u9020\u597D\u98CE\u6C34\u9633\u53F0 \u671D\u5411\u4F4D\u7F6E\u6709\u8BB2\u7A76");
        yangtai.add(map);
        map = new HashMap();
        map.put("name", "\u9633\u53F0\u98CE\u6C34\u7CFB\u5BB6\u8FD0 \u5C0F\u5FC3\u9633\u53F0\u574F\u98CE\u6C34");
        yangtai.add(map);
        map = new HashMap();
        map.put("name", "\u5BB6\u5C45\u4E0E\u73AF\u5883\u76F8\u5173 \u9633\u53F0\u98CE\u6C34\u770B\u73AF\u5883");
        yangtai.add(map);
        map = new HashMap();
        map.put("name", "\u9633\u53F0\u98CE\u6C34\u4F60\u5FFD\u7565\u4E86\u5417 \u8B66\u60D5\u516D\u5927\u4E0D\u7965\u98CE\u6C34");
        yangtai.add(map);
        map = new HashMap();
        map.put("name", "\u9633\u53F0\u671D\u5411\u5F71\u54CD\u5BB6\u8FD0");
        yangtai.add(map);
        map = new HashMap();
        map.put("name", "\u6CE8\u610F6\u5927\u9633\u53F0\u70C2\u98CE\u6C34");
        yangtai.add(map);
        map = new HashMap();
        map.put("name", "\u4E94\u62DB\u63D0\u5347\u9633\u53F0\u98CE\u6C34");
        yangtai.add(map);
        map = new HashMap();
        map.put("name", "\u9633\u53F0\u98CE\u6C34\u7684\u4E09\u5B9C");
        yangtai.add(map);
        shiwu = new ArrayList();
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u88C5\u9970\u753B\u98CE\u6C34\u5B9C\u5FCC");
        shiwu.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u88C5\u9970\u753B\u4F7F\u7528\u6CE8\u610F\u4E8B\u9879");
        shiwu.add(map);
        map = new HashMap();
        map.put("name", "\u65F6\u949F\u98CE\u6C34\u5F71\u54CD\u8EAB\u4F53\u5065\u5EB7");
        shiwu.add(map);
        map = new HashMap();
        map.put("name", "\u98CE\u6C34\u9053\u5177\u4F7F\u7528\u8981\u5C0F\u5FC3");
        shiwu.add(map);
        map = new HashMap();
        map.put("name", "\u88C5\u9970\u753B\u98CE\u6C34\u77E5\u8BC6");
        shiwu.add(map);
        map = new HashMap();
        map.put("name", "\u6446\u653E\u751F\u8096\u9970\u7269\u7684\u539F\u5219");
        shiwu.add(map);
        map = new HashMap();
        map.put("name", "\u7F8E\u5BB6\u88C5\u9970\u54C1\u6446\u653E\u4E5F\u6697\u85CF\u7384\u673A");
        shiwu.add(map);
        map = new HashMap();
        map.put("name", "\u88C5\u9970\u753B\u4E2D\u7684\u98CE\u6C34\u7384\u673A");
        shiwu.add(map);
        map = new HashMap();
        map.put("name", "\u5409\u7965\u7684\u88C5\u9970\u753B\u53EF\u52A9\u8FD0\u65FA\u8FD0");
        shiwu.add(map);
        map = new HashMap();
        map.put("name", "\u9910\u5385\u88C5\u9970\u54C1\u6446\u653E\u98CE\u6C34");
        shiwu.add(map);
        yugang = new ArrayList();
        map = new HashMap();
        map.put("name", "\u9C7C\u7F38\u7684\u98CE\u6C34\u539F\u5219");
        yugang.add(map);
        map = new HashMap();
        map.put("name", "\u9C7C\u7F38\u4E0E\u5BB6\u5C45\u8FD0\u52BF\u7684\u5173\u7CFB");
        yugang.add(map);
        map = new HashMap();
        map.put("name", "\u9C7C\u7F38\u7684\u6446\u653E\u65B9\u4F4D");
        yugang.add(map);
        map = new HashMap();
        map.put("name", "\u5BB6\u5C45\u9C7C\u7F38\u98CE\u6C34\u6446\u653E\u9700\u8981\u6CE8\u610F\u51E0\u70B9");
        yugang.add(map);
        map = new HashMap();
        map.put("name", "\u9C7C\u7F38\u98CE\u6C34");
        yugang.add(map);
        map = new HashMap();
        map.put("name", "\u9C7C\u7F38\u5F62\u72B6\u4E0E\u4E94\u884C\u7684\u5173\u7CFB ");
        yugang.add(map);
        map = new HashMap();
        map.put("name", "\u9C7C\u7684\u989C\u8272 ");
        yugang.add(map);
        map = new HashMap();
        map.put("name", "\u9C7C\u7F38\u5728\u98CE\u6C34\u4E0A\u7684\u4F5C\u7528");
        yugang.add(map);
        map = new HashMap();
        map.put("name", "\u517B\u9C7C\u7684\u65B9\u4F4D");
        yugang.add(map);
        map = new HashMap();
        map.put("name", "\u9C7C\u7F38\u6446\u653E\u6709\u8BB2\u7A76");
        yugang.add(map);
        jingzi = new ArrayList();
        map = new HashMap();
        map.put("name", "\u955C\u5B50\u7684\u98CE\u6C34\u539F\u5219");
        jingzi.add(map);
        map = new HashMap();
        map.put("name", "\u955C\u5B50\u7684\u6446\u653E\u7981\u5FCC");
        jingzi.add(map);
        map = new HashMap();
        map.put("name", "\u536B\u751F\u95F4\u955C\u5B50\u6446\u653E\u8BB2\u7A76");
        jingzi.add(map);
        map = new HashMap();
        map.put("name", "\u536B\u751F\u95F4\u7684\u955C\u5B50\u591A\u5927\u624D\u5408\u9002");
        jingzi.add(map);
        map = new HashMap();
        map.put("name", "\u955C\u5B50\u6446\u653E\u5341\u5927\u7981\u5FCC");
        jingzi.add(map);
        map = new HashMap();
        map.put("name", "\u5982\u4F55\u6446\u653E\u955C\u5B50\u98CE\u6C34\u4E3A\u597D ");
        jingzi.add(map);
        map = new HashMap();
        map.put("name", "\u955C\u5B50\u6446\u653E\u7684\u98CE\u6C34\u77E5\u8BC6 ");
        jingzi.add(map);
        map = new HashMap();
        map.put("name", "\u955C\u5B50\u5BF9\u7740\u95E8\u597D\u5417");
        jingzi.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u955C\u5B50\u7684\u6446\u653E\u98CE\u6C34");
        jingzi.add(map);
        map = new HashMap();
        map.put("name", "\u955C\u5B50\u98CE\u6C34\u6CE8\u610F\u4E8B\u9879");
        jingzi.add(map);
        zhiwu = new ArrayList();
        map = new HashMap();
        map.put("name", "\u5367\u5BA4\u690D\u7269\u4E94\u884C\u4E4B\u9009");
        zhiwu.add(map);
        map = new HashMap();
        map.put("name", "\u5367\u5BA4\u690D\u7269\u751F\u8096\u4E4B\u9009");
        zhiwu.add(map);
        map = new HashMap();
        map.put("name", "\u5367\u5BA4\u98CE\u6C34\u5FCC\u8BB3\u7684\u82B1\u5349");
        zhiwu.add(map);
        map = new HashMap();
        map.put("name", "\u529E\u516C\u5BA4\u82B1\u5349\u690D\u7269\u6446\u653E\u98CE\u6C34\u4E4B\uFF1A\u65B9\u4F4D");
        zhiwu.add(map);
        map = new HashMap();
        map.put("name", "\u529E\u516C\u5BA4\u82B1\u5349\u690D\u7269\u6446\u653E\u98CE\u6C34\u4E4B\uFF1A\u989C\u8272");
        zhiwu.add(map);
        map = new HashMap();
        map.put("name", "\u529E\u516C\u5BA4\u82B1\u5349\u690D\u7269\u6446\u653E\u98CE\u6C34\uFF1A\u5FCC\u8BB3 ");
        zhiwu.add(map);
        map = new HashMap();
        map.put("name", "\u5BA2\u5385\u690D\u7269\u6446\u653E\u98CE\u6C34 ");
        zhiwu.add(map);
        map = new HashMap();
        map.put("name", "\u4F60\u6240\u4E0D\u77E5\u7684\u690D\u7269\u98CE\u6C34");
        zhiwu.add(map);
        map = new HashMap();
        map.put("name", "\u690D\u7269\u98CE\u6C34\u77E5\u8BC6\uFF1A\u5BB6\u5C45\u98CE\u6C34\u690D\u7269\u6709\u54EA\u4E9B\uFF1F");
        zhiwu.add(map);
        map = new HashMap();
        map.put("name", "\u690D\u7269\u6446\u653E\u4F4D\u7F6E\u548C\u5BB6\u5C45\u98CE\u6C34\u7684\u79D8\u5BC6\u8054\u7CFB");
        zhiwu.add(map);
        chuang = new ArrayList();
        map = new HashMap();
        map.put("name", "\u7761\u5E8A\u7684\u6446\u653E\u65B9\u5411");
        chuang.add(map);
        map = new HashMap();
        map.put("name", "\u7761\u5E8A\u600E\u6837\u6446\u653E\u6709\u5229\u4E8E\u5065\u5EB7");
        chuang.add(map);
        map = new HashMap();
        map.put("name", "\u88C5\u4FEE\u98CE\u6C34\u4E4B\u5E8A\u7F69\u989C\u8272\u7BC7");
        chuang.add(map);
        map = new HashMap();
        map.put("name", "\u5E8A\u5934\u7684\u671D\u5411\u4E0E\u751F\u8096");
        chuang.add(map);
        map = new HashMap();
        map.put("name", "\u5E8A\u5934\u7684\u671D\u5411\u4E0E\u4E94\u884C");
        chuang.add(map);
        map = new HashMap();
        map.put("name", "\u5E8A\u7684\u6750\u8D28\u4E0E\u989C\u8272\u751F\u8096\u7BC7 ");
        chuang.add(map);
        map = new HashMap();
        map.put("name", "\u5E8A\u7684\u6750\u8D28\u4E0E\u989C\u8272\u4E94\u884C\u7BC7 ");
        chuang.add(map);
        map = new HashMap();
        map.put("name", "\u5E8A\u7684\u6446\u653E\u98CE\u6C34\u4E4B\u4F4D\u7F6E\u7BC7");
        chuang.add(map);
        map = new HashMap();
        map.put("name", "\u5367\u5BA4\u5E8A\u7684\u6446\u653E\u98CE\u6C34");
        chuang.add(map);
        map = new HashMap();
        map.put("name", "\u98CE\u6C34\u5B66-\u5367\u5BA4\u5E8A\u7684\u6446\u8BBE");
        chuang.add(map);
    }

    private ArrayAdapter ad;
    private List canting;
    private List chuang;
    private List chufang;
    private ImageButton ibtn_canting;
    private ImageButton ibtn_chuang;
    private ImageButton ibtn_chufang;
    private ImageButton ibtn_jingzi;
    private ImageButton ibtn_keting;
    private ImageButton ibtn_shiwu;
    private ImageButton ibtn_shufang;
    private ImageButton ibtn_weishengjian;
    private ImageButton ibtn_woshi;
    private ImageButton ibtn_yangtai;
    private ImageButton ibtn_yugang;
    private ImageButton ibtn_zhiwu;
    private List jingzi;
    private List keting;
    private Map map;
    private List shiwu;
    private List shufang;
    private List weishengjian;
    private List woshi;
    private List yangtai;
    private List yugang;
    private List zhiwu;
}
