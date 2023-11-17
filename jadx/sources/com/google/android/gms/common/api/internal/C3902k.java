package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import p143k6.C6819b;

/* renamed from: com.google.android.gms.common.api.internal.k */
final class C3902k implements C6819b.C6820a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f12472a;

    /* renamed from: b */
    final /* synthetic */ C3908m f12473b;

    C3902k(C3908m mVar, BasePendingResult basePendingResult) {
        this.f12473b = mVar;
        this.f12472a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo12110a(Status status) {
        this.f12473b.f12482a.remove(this.f12472a);
    }
}
