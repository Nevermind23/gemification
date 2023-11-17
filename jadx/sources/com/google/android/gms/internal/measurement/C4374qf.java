package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.qf */
public final class C4374qf extends C4239j {

    /* renamed from: f */
    private final Callable f13621f;

    public C4374qf(String str, Callable callable) {
        super("internal.appMetadata");
        this.f13621f = callable;
    }

    /* renamed from: a */
    public final C4358q mo13126a(C4363q4 q4Var, List list) {
        try {
            return C4382r6.m16561b(this.f13621f.call());
        } catch (Exception unused) {
            return C4358q.f13593U2;
        }
    }
}
