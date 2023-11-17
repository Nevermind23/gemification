package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.k4 */
final class C4692k4 extends LruCache {

    /* renamed from: b */
    final /* synthetic */ C4725n4 f14564b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4692k4(C4725n4 n4Var, int i) {
        super(20);
        this.f14564b = n4Var;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        C7264i.m27898g(str);
        return C4725n4.m18006s(this.f14564b, str);
    }
}
