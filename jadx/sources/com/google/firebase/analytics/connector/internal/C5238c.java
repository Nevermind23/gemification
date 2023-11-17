package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import p235r7.C8067a;
import p248s7.C8263q;

/* renamed from: com.google.firebase.analytics.connector.internal.c */
final class C5238c implements C8067a.C8068a {

    /* renamed from: a */
    final /* synthetic */ C5239d f16798a;

    public C5238c(C5239d dVar) {
        this.f16798a = dVar;
    }

    /* renamed from: a */
    public final void mo14950a(String str, String str2, Bundle bundle, long j) {
        if (this.f16798a.f16799a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i = C5237b.f16797g;
            String a = C8263q.m31094a(str2);
            if (a != null) {
                str2 = a;
            }
            bundle2.putString("events", str2);
            this.f16798a.f16800b.mo126a(2, bundle2);
        }
    }
}
