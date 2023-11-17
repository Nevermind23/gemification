package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x */
public abstract class C4476x {

    /* renamed from: a */
    final List f13791a = new ArrayList();

    protected C4476x() {
    }

    /* renamed from: a */
    public abstract C4358q mo12835a(String str, C4363q4 q4Var, List list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C4358q mo13799b(String str) {
        if (this.f13791a.contains(C4381r5.m16552e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
