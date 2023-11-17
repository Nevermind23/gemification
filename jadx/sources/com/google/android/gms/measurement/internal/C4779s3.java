package com.google.android.gms.measurement.internal;

import java.util.Map;
import p182n6.C7264i;
import p248s7.C8254h;

/* renamed from: com.google.android.gms.measurement.internal.s3 */
final class C4779s3 implements Runnable {

    /* renamed from: d */
    private final C4768r3 f14843d;

    /* renamed from: e */
    private final int f14844e;

    /* renamed from: f */
    private final Throwable f14845f;

    /* renamed from: g */
    private final byte[] f14846g;

    /* renamed from: h */
    private final String f14847h;

    /* renamed from: i */
    private final Map f14848i;

    /* synthetic */ C4779s3(String str, C4768r3 r3Var, int i, Throwable th, byte[] bArr, Map map, C8254h hVar) {
        C7264i.m27902k(r3Var);
        this.f14843d = r3Var;
        this.f14844e = i;
        this.f14845f = th;
        this.f14846g = bArr;
        this.f14847h = str;
        this.f14848i = map;
    }

    public final void run() {
        this.f14843d.mo14357a(this.f14847h, this.f14844e, this.f14845f, this.f14846g, this.f14848i);
    }
}
