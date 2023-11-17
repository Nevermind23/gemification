package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.t0 */
class C11095t0 {
    C11095t0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ApplicationInfo mo28990a() {
        return C10884i4.m39721c().mo28483b().getApplicationInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Calendar mo28991b() {
        return Calendar.getInstance();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ConnectivityManager mo28992c() {
        return (ConnectivityManager) C10884i4.m39721c().mo28483b().getSystemService("connectivity");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public StatFs mo28993d() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Point mo28994e() {
        Display defaultDisplay;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) C10884i4.m39721c().mo28483b().getSystemService("window");
        if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
            defaultDisplay.getSize(point);
        }
        return point;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Locale mo28995f() {
        return Locale.getDefault();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ActivityManager.MemoryInfo mo28996g() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) C10884i4.m39721c().mo28483b().getSystemService("activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        return memoryInfo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public PackageManager mo28997h() {
        return C10884i4.m39721c().mo28483b().getPackageManager();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C11089s6 mo28998i() {
        return C11089s6.m40668b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public TelephonyManager mo28999j() {
        return (TelephonyManager) C10884i4.m39721c().mo28483b().getSystemService("phone");
    }
}
