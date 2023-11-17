package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import p092g7.C6253d;
import p260t6.C8408j;
import p286v6.C8708e;

/* renamed from: com.google.android.gms.common.b */
public class C3941b {

    /* renamed from: a */
    public static final int f12554a = C3943d.f12557a;

    /* renamed from: b */
    private static final C3941b f12555b = new C3941b();

    C3941b() {
    }

    /* renamed from: h */
    public static C3941b m14941h() {
        return f12555b;
    }

    /* renamed from: a */
    public void mo12152a(Context context) {
        C3943d.m14958a(context);
    }

    /* renamed from: b */
    public int mo12153b(Context context) {
        return C3943d.m14960c(context);
    }

    /* renamed from: c */
    public Intent mo12154c(int i) {
        return mo11869d((Context) null, i, (String) null);
    }

    /* renamed from: d */
    public Intent mo11869d(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !C8408j.m31551d(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("gcore_");
                sb.append(f12554a);
                sb.append("-");
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
                sb.append("-");
                if (context != null) {
                    sb.append(context.getPackageName());
                }
                sb.append("-");
                if (context != null) {
                    try {
                        sb.append(C8708e.m32461a(context).mo24091e(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb2 = sb.toString();
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb2)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    /* renamed from: e */
    public PendingIntent mo11870e(Context context, int i, int i2) {
        return mo12155f(context, i, i2, (String) null);
    }

    /* renamed from: f */
    public PendingIntent mo12155f(Context context, int i, int i2, String str) {
        Intent d = mo11869d(context, i, str);
        if (d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, d, C6253d.f19275a | 134217728);
    }

    /* renamed from: g */
    public String mo11871g(int i) {
        return C3943d.m14961d(i);
    }

    /* renamed from: i */
    public int mo11872i(Context context) {
        return mo11873j(context, f12554a);
    }

    /* renamed from: j */
    public int mo11873j(Context context, int i) {
        int h = C3943d.m14965h(context, i);
        if (C3943d.m14966i(context, h)) {
            return 18;
        }
        return h;
    }

    /* renamed from: k */
    public boolean mo12156k(Context context, int i) {
        return C3943d.m14966i(context, i);
    }

    /* renamed from: l */
    public boolean mo12157l(Context context, String str) {
        return C3943d.m14970m(context, str);
    }

    /* renamed from: m */
    public boolean mo11874m(int i) {
        return C3943d.m14968k(i);
    }

    /* renamed from: n */
    public void mo12158n(Context context, int i) {
        C3943d.m14959b(context, i);
    }
}
