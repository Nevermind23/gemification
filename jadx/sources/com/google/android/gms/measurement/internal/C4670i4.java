package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4183fb;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
public final /* synthetic */ class C4670i4 implements Callable {

    /* renamed from: d */
    public final /* synthetic */ C4725n4 f14510d;

    /* renamed from: e */
    public final /* synthetic */ String f14511e;

    public /* synthetic */ C4670i4(C4725n4 n4Var, String str) {
        this.f14510d = n4Var;
        this.f14511e = str;
    }

    public final Object call() {
        return new C4183fb("internal.remoteConfig", new C4714m4(this.f14510d, this.f14511e));
    }
}
