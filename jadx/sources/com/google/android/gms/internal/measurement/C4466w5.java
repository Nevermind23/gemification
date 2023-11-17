package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.w5 */
final class C4466w5 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C4482x5 f13779a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4466w5(C4482x5 x5Var, Handler handler) {
        super((Handler) null);
        this.f13779a = x5Var;
    }

    public final void onChange(boolean z) {
        this.f13779a.mo13810f();
    }
}
