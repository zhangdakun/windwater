// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.inzi.fengshuijewel.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.widget.Toast;

public class Utils
{

    public Utils()
    {
    }

    public static boolean CheckNetworkStateToast(Context context)
    {
        boolean flag = false;
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        if(connectivitymanager.getActiveNetworkInfo() != null)
            flag = connectivitymanager.getActiveNetworkInfo().isAvailable();
        if(!flag)
            Toast.makeText(context, "\u5F53\u524D\u7F51\u7EDC\u72B6\u6001\u4E0D\u53EF\u7528,\u8BF7\u68C0\u67E5\u7F51\u7EDC\u8FDE\u63A5\u6216\u7A0D\u540E\u518D\u8BD5", 1).show();
        return flag;
    }

    public static void Exit(Context context)
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle("\u63D0\u793A");
        builder.setIcon(0x7f02001d);
        builder.setMessage("\u662F\u5426\u8981\u9000\u51FA\u300A\u98CE\u6C34\u5927\u5E08\u300B\uFF1F");
        builder.setPositiveButton("\u786E\u5B9A", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                Process.killProcess(Process.myPid());
            }

        }
);
        builder.setNegativeButton("\u53D6\u6D88", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

        }
);
        builder.show();
    }
}
