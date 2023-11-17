package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.o4 */
final class C4736o4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f14690a;

    /* renamed from: b */
    final /* synthetic */ C4769r4 f14691b;

    public C4736o4(C4769r4 r4Var, String str) {
        this.f14691b = r4Var;
        C7264i.m27902k(str);
        this.f14690a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f14691b.f14613a.mo14551d().mo14675r().mo14616b(this.f14690a, th);
    }
}
