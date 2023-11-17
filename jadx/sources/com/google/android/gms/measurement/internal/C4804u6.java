package com.google.android.gms.measurement.internal;

import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.u6 */
public final /* synthetic */ class C4804u6 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C4815v6 f14943d;

    /* renamed from: e */
    public final /* synthetic */ int f14944e;

    /* renamed from: f */
    public final /* synthetic */ Exception f14945f;

    /* renamed from: g */
    public final /* synthetic */ byte[] f14946g;

    /* renamed from: h */
    public final /* synthetic */ Map f14947h;

    public /* synthetic */ C4804u6(C4815v6 v6Var, int i, Exception exc, byte[] bArr, Map map) {
        this.f14943d = v6Var;
        this.f14944e = i;
        this.f14945f = exc;
        this.f14946g = bArr;
        this.f14947h = map;
    }

    public final void run() {
        this.f14943d.mo14938a(this.f14944e, this.f14945f, this.f14946g, this.f14947h);
    }
}
