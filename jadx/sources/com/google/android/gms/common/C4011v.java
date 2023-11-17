package com.google.android.gms.common;

import java.util.concurrent.Callable;
import p130j6.C6736l;
import p130j6.C6737m;

/* renamed from: com.google.android.gms.common.v */
final class C4011v extends C4012w {

    /* renamed from: f */
    private final Callable f12805f;

    /* synthetic */ C4011v(Callable callable, C6736l lVar) {
        super(false, 1, 5, (String) null, (Throwable) null, (C6737m) null);
        this.f12805f = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo12387a() {
        try {
            return (String) this.f12805f.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
