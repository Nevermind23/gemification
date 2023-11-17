package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: com.google.firebase.messaging.q0 */
public class C5352q0 {

    /* renamed from: e */
    private static C5352q0 f17083e;

    /* renamed from: a */
    private String f17084a = null;

    /* renamed from: b */
    private Boolean f17085b = null;

    /* renamed from: c */
    private Boolean f17086c = null;

    /* renamed from: d */
    private final Queue f17087d = new ArrayDeque();

    private C5352q0() {
    }

    /* renamed from: a */
    private int m21156a(Context context, Intent intent) {
        ComponentName componentName;
        String f = m21158f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (mo17631e(context)) {
                componentName = C5311b1.m20999h(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e);
            return TextTypeView.SEPARATOR_BEFORE_ICON;
        } catch (IllegalStateException e2) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e2);
            return TextTypeView.NO_SEPARATOR;
        }
    }

    /* renamed from: b */
    static synchronized C5352q0 m21157b() {
        C5352q0 q0Var;
        synchronized (C5352q0.class) {
            if (f17083e == null) {
                f17083e = new C5352q0();
            }
            q0Var = f17083e;
        }
        return q0Var;
    }

    /* renamed from: f */
    private synchronized String m21158f(Context context, Intent intent) {
        String str = this.f17084a;
        if (str != null) {
            return str;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (serviceInfo != null) {
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    String str2 = serviceInfo.name;
                    if (str2 != null) {
                        if (str2.startsWith(".")) {
                            this.f17084a = context.getPackageName() + serviceInfo.name;
                        } else {
                            this.f17084a = serviceInfo.name;
                        }
                        return this.f17084a;
                    }
                }
                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + C11110u2.f31950c + serviceInfo.name);
                return null;
            }
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Intent mo17629c() {
        return (Intent) this.f17087d.poll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo17630d(Context context) {
        boolean z;
        if (this.f17086c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f17086c = Boolean.valueOf(z);
        }
        if (!this.f17085b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f17086c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo17631e(Context context) {
        boolean z;
        if (this.f17085b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f17085b = Boolean.valueOf(z);
        }
        if (!this.f17085b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f17085b.booleanValue();
    }

    /* renamed from: g */
    public int mo17632g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f17087d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m21156a(context, intent2);
    }
}
