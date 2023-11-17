package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.r5 */
public final class C4770r5 {

    /* renamed from: a */
    final Context f14822a;

    /* renamed from: b */
    String f14823b;

    /* renamed from: c */
    String f14824c;

    /* renamed from: d */
    String f14825d;

    /* renamed from: e */
    Boolean f14826e;

    /* renamed from: f */
    long f14827f;

    /* renamed from: g */
    zzcl f14828g;

    /* renamed from: h */
    boolean f14829h = true;

    /* renamed from: i */
    final Long f14830i;

    /* renamed from: j */
    String f14831j;

    public C4770r5(Context context, zzcl zzcl, Long l) {
        C7264i.m27902k(context);
        Context applicationContext = context.getApplicationContext();
        C7264i.m27902k(applicationContext);
        this.f14822a = applicationContext;
        this.f14830i = l;
        if (zzcl != null) {
            this.f14828g = zzcl;
            this.f14823b = zzcl.f13868i;
            this.f14824c = zzcl.f13867h;
            this.f14825d = zzcl.f13866g;
            this.f14829h = zzcl.f13865f;
            this.f14827f = zzcl.f13864e;
            this.f14831j = zzcl.f13870k;
            Bundle bundle = zzcl.f13869j;
            if (bundle != null) {
                this.f14826e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
