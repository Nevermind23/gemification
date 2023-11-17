package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.j */
public abstract class C4239j implements C4358q, C4290m {

    /* renamed from: d */
    protected final String f13359d;

    /* renamed from: e */
    protected final Map f13360e = new HashMap();

    public C4239j(String str) {
        this.f13359d = str;
    }

    /* renamed from: a */
    public abstract C4358q mo13126a(C4363q4 q4Var, List list);

    /* renamed from: b */
    public C4358q mo13077b() {
        return this;
    }

    /* renamed from: c */
    public final String mo13078c() {
        return this.f13359d;
    }

    /* renamed from: d */
    public final String mo13271d() {
        return this.f13359d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4239j)) {
            return false;
        }
        C4239j jVar = (C4239j) obj;
        String str = this.f13359d;
        if (str != null) {
            return str.equals(jVar.f13359d);
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo13080g(String str) {
        return this.f13360e.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f13359d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public final void mo13082i(String str, C4358q qVar) {
        if (qVar == null) {
            this.f13360e.remove(str);
        } else {
            this.f13360e.put(str, qVar);
        }
    }

    /* renamed from: j */
    public final C4358q mo13084j(String str) {
        if (this.f13360e.containsKey(str)) {
            return (C4358q) this.f13360e.get(str);
        }
        return C4358q.f13593U2;
    }

    /* renamed from: u */
    public final Double mo13091u() {
        return Double.valueOf(Double.NaN);
    }

    /* renamed from: v */
    public final Boolean mo13092v() {
        return Boolean.TRUE;
    }

    /* renamed from: w */
    public final Iterator mo13093w() {
        return C4256k.m16189b(this.f13360e);
    }

    /* renamed from: x */
    public final C4358q mo13094x(String str, C4363q4 q4Var, List list) {
        if ("toString".equals(str)) {
            return new C4426u(this.f13359d);
        }
        return C4256k.m16188a(this, new C4426u(str), q4Var, list);
    }
}
