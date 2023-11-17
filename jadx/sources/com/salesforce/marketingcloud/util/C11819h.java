package com.salesforce.marketingcloud.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.C0767a;
import com.salesforce.marketingcloud.C11461g;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.util.h */
public final class C11819h {

    /* renamed from: a */
    private static String f34322a;

    /* renamed from: b */
    public static final String[] f34323b = (Build.VERSION.SDK_INT >= 29 ? new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"} : new String[]{"android.permission.ACCESS_FINE_LOCATION"});

    private C11819h() {
    }

    /* renamed from: a */
    public static String m43265a(Context context) {
        if (!TextUtils.isEmpty(f34322a)) {
            return f34322a;
        }
        f34322a = "";
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            f34322a = String.format("%s : %s", new Object[]{packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
        } catch (PackageManager.NameNotFoundException e) {
            C11461g.m41885b(C11824l.f34335c, e, "Failed to get Application Version from the PackageManager.", new Object[0]);
        }
        return f34322a;
    }

    /* renamed from: b */
    public static boolean m43268b(Context context) {
        if (context == null) {
            return false;
        }
        for (String a : f34323b) {
            if (!m43266a(context, a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m43266a(Context context, String str) {
        return C0767a.m2891a(context, str) == 0;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    /* renamed from: b */
    public static boolean m43269b(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentServices(intent, 65536).size() > 0;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    /* renamed from: a */
    public static boolean m43267a(PackageManager packageManager, Intent intent) {
        return packageManager.queryBroadcastReceivers(intent, 0).size() > 0;
    }
}
