package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p235r7.C8067a;

/* renamed from: com.google.firebase.analytics.connector.internal.e */
final class C5240e implements C8067a.C8068a {

    /* renamed from: a */
    final /* synthetic */ C5241f f16803a;

    public C5240e(C5241f fVar) {
        this.f16803a = fVar;
    }

    /* renamed from: a */
    public final void mo14950a(String str, String str2, Bundle bundle, long j) {
        if (str != null && C5237b.m20699c(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j);
            bundle2.putBundle("params", bundle);
            this.f16803a.f16804a.mo126a(3, bundle2);
        }
    }
}
