package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4244j4;
import com.google.android.gms.internal.measurement.C4431u4;
import java.util.ArrayList;
import java.util.List;
import p182n6.C7264i;
import p248s7.C8272z;

/* renamed from: com.google.android.gms.measurement.internal.k9 */
final class C4697k9 {

    /* renamed from: a */
    C4431u4 f14579a;

    /* renamed from: b */
    List f14580b;

    /* renamed from: c */
    List f14581c;

    /* renamed from: d */
    long f14582d;

    /* renamed from: e */
    final /* synthetic */ C4719m9 f14583e;

    /* synthetic */ C4697k9(C4719m9 m9Var, C8272z zVar) {
        this.f14583e = m9Var;
    }

    /* renamed from: b */
    private static final long m17864b(C4244j4 j4Var) {
        return ((j4Var.mo13280D() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo14535a(long j, C4244j4 j4Var) {
        C7264i.m27902k(j4Var);
        if (this.f14581c == null) {
            this.f14581c = new ArrayList();
        }
        if (this.f14580b == null) {
            this.f14580b = new ArrayList();
        }
        if (!this.f14581c.isEmpty() && m17864b((C4244j4) this.f14581c.get(0)) != m17864b(j4Var)) {
            return false;
        }
        long a = this.f14582d + ((long) j4Var.mo13465a());
        this.f14583e.mo14575U();
        if (a >= ((long) Math.max(0, ((Integer) C4636f3.f14380k.mo14346a((Object) null)).intValue()))) {
            return false;
        }
        this.f14582d = a;
        this.f14581c.add(j4Var);
        this.f14580b.add(Long.valueOf(j));
        int size = this.f14581c.size();
        this.f14583e.mo14575U();
        if (size >= Math.max(1, ((Integer) C4636f3.f14382l.mo14346a((Object) null)).intValue())) {
            return false;
        }
        return true;
    }
}
