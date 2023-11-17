package com.google.android.gms.common;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import p066e7.C6047k;

/* renamed from: com.google.android.gms.common.f */
final class C3949f extends C6047k {

    /* renamed from: a */
    private final Context f12585a;

    /* renamed from: b */
    final /* synthetic */ C3846a f12586b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3949f(com.google.android.gms.common.C3846a r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f12586b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000d
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0011
        L_0x000d:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x0011:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f12585a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C3949f.<init>(com.google.android.gms.common.a, android.content.Context):void");
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = this.f12586b.mo11872i(this.f12585a);
        if (this.f12586b.mo11874m(i2)) {
            this.f12586b.mo11878s(this.f12585a, i2);
        }
    }
}
