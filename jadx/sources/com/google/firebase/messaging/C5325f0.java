package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.firebase.C5270e;
import java.util.List;
import p260t6.C8413o;

/* renamed from: com.google.firebase.messaging.f0 */
class C5325f0 {

    /* renamed from: a */
    private final Context f17042a;

    /* renamed from: b */
    private String f17043b;

    /* renamed from: c */
    private String f17044c;

    /* renamed from: d */
    private int f17045d;

    /* renamed from: e */
    private int f17046e = 0;

    C5325f0(Context context) {
        this.f17042a = context;
    }

    /* renamed from: c */
    static String m21063c(C5270e eVar) {
        String d = eVar.mo17483n().mo17518d();
        if (d != null) {
            return d;
        }
        String c = eVar.mo17483n().mo17517c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m21064f(String str) {
        try {
            return this.f17042a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m21065h() {
        PackageInfo f = m21064f(this.f17042a.getPackageName());
        if (f != null) {
            this.f17043b = Integer.toString(f.versionCode);
            this.f17044c = f.versionName;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo17575a() {
        if (this.f17043b == null) {
            m21065h();
        }
        return this.f17043b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String mo17576b() {
        if (this.f17044c == null) {
            m21065h();
        }
        return this.f17044c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int mo17577d() {
        PackageInfo f;
        if (this.f17045d == 0 && (f = m21064f("com.google.android.gms")) != null) {
            this.f17045d = f.versionCode;
        }
        return this.f17045d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized int mo17578e() {
        int i = this.f17046e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f17042a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C8413o.m31570h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f17046e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (C8413o.m31570h()) {
                this.f17046e = 2;
            } else {
                this.f17046e = 1;
            }
            return this.f17046e;
        }
        this.f17046e = 2;
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo17579g() {
        return mo17578e() != 0;
    }
}
