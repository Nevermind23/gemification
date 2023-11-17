package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.firebase.messaging.m0 */
abstract class C5343m0 {
    /* renamed from: a */
    private static SharedPreferences m21136a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    /* renamed from: b */
    static boolean m21137b(Context context) {
        return m21136a(context).getBoolean("proxy_notification_initialized", false);
    }

    /* renamed from: c */
    static void m21138c(Context context, boolean z) {
        SharedPreferences.Editor edit = m21136a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
