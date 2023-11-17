package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p182n6.C7264i;

/* renamed from: com.google.android.gms.measurement.internal.p4 */
final class C4747p4 extends FutureTask implements Comparable {

    /* renamed from: d */
    private final long f14725d;

    /* renamed from: e */
    final boolean f14726e;

    /* renamed from: f */
    private final String f14727f;

    /* renamed from: g */
    final /* synthetic */ C4769r4 f14728g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4747p4(C4769r4 r4Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f14728g = r4Var;
        C7264i.m27902k(str);
        long andIncrement = C4769r4.f14812l.getAndIncrement();
        this.f14725d = andIncrement;
        this.f14727f = str;
        this.f14726e = z;
        if (andIncrement == Long.MAX_VALUE) {
            r4Var.f14613a.mo14551d().mo14675r().mo14615a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C4747p4 p4Var = (C4747p4) obj;
        boolean z = this.f14726e;
        if (z == p4Var.f14726e) {
            int i = (this.f14725d > p4Var.f14725d ? 1 : (this.f14725d == p4Var.f14725d ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i > 0) {
                return 1;
            }
            this.f14728g.f14613a.mo14551d().mo14677t().mo14616b("Two tasks share the same index. index", Long.valueOf(this.f14725d));
            return 0;
        } else if (!z) {
            return 1;
        } else {
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f14728g.f14613a.mo14551d().mo14675r().mo14616b(this.f14727f, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4747p4(C4769r4 r4Var, Callable callable, boolean z, String str) {
        super(callable);
        this.f14728g = r4Var;
        C7264i.m27902k("Task exception on worker thread");
        long andIncrement = C4769r4.f14812l.getAndIncrement();
        this.f14725d = andIncrement;
        this.f14727f = "Task exception on worker thread";
        this.f14726e = z;
        if (andIncrement == Long.MAX_VALUE) {
            r4Var.f14613a.mo14551d().mo14675r().mo14615a("Tasks index overflow");
        }
    }
}
