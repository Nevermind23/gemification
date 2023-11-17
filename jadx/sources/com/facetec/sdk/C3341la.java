package com.facetec.sdk;

import com.facetec.sdk.C3272jw;
import java.util.List;

/* renamed from: com.facetec.sdk.la */
public final class C3341la implements C3272jw.C3273a {

    /* renamed from: a */
    private final List<C3272jw> f10967a;

    /* renamed from: b */
    private final C3325kw f10968b;

    /* renamed from: c */
    final C3319ks f10969c;

    /* renamed from: d */
    final C3344lc f10970d;

    /* renamed from: e */
    private final int f10971e;

    /* renamed from: f */
    private final int f10972f;

    /* renamed from: g */
    private final C3293kb f10973g;

    /* renamed from: h */
    private final C3264jt f10974h;

    /* renamed from: i */
    private final C3247ji f10975i;

    /* renamed from: j */
    private final int f10976j;

    /* renamed from: k */
    private final int f10977k;

    /* renamed from: n */
    private int f10978n;

    public C3341la(List<C3272jw> list, C3325kw kwVar, C3344lc lcVar, C3319ks ksVar, int i, C3293kb kbVar, C3247ji jiVar, C3264jt jtVar, int i2, int i3, int i4) {
        this.f10967a = list;
        this.f10969c = ksVar;
        this.f10968b = kwVar;
        this.f10970d = lcVar;
        this.f10971e = i;
        this.f10973g = kbVar;
        this.f10975i = jiVar;
        this.f10974h = jtVar;
        this.f10972f = i2;
        this.f10976j = i3;
        this.f10977k = i4;
    }

    /* renamed from: a */
    public final C3293kb mo9537a() {
        return this.f10973g;
    }

    /* renamed from: b */
    public final int mo9538b() {
        return this.f10977k;
    }

    /* renamed from: c */
    public final C3325kw mo9691c() {
        return this.f10968b;
    }

    /* renamed from: d */
    public final int mo9539d() {
        return this.f10972f;
    }

    /* renamed from: e */
    public final int mo9540e() {
        return this.f10976j;
    }

    /* renamed from: f */
    public final C3247ji mo9692f() {
        return this.f10975i;
    }

    /* renamed from: i */
    public final C3264jt mo9693i() {
        return this.f10974h;
    }

    /* renamed from: b */
    public final C3295kc mo9690b(C3293kb kbVar, C3325kw kwVar, C3344lc lcVar, C3319ks ksVar) {
        if (this.f10971e < this.f10967a.size()) {
            this.f10978n++;
            if (this.f10970d != null && !this.f10969c.mo9666e(kbVar.mo9588a())) {
                StringBuilder sb = new StringBuilder("network interceptor ");
                sb.append(this.f10967a.get(this.f10971e - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString());
            } else if (this.f10970d == null || this.f10978n <= 1) {
                C3341la laVar = new C3341la(this.f10967a, kwVar, lcVar, ksVar, this.f10971e + 1, kbVar, this.f10975i, this.f10974h, this.f10972f, this.f10976j, this.f10977k);
                C3272jw jwVar = this.f10967a.get(this.f10971e);
                C3295kc e = jwVar.mo9536e(laVar);
                if (lcVar != null && this.f10971e + 1 < this.f10967a.size() && laVar.f10978n != 1) {
                    StringBuilder sb2 = new StringBuilder("network interceptor ");
                    sb2.append(jwVar);
                    sb2.append(" must call proceed() exactly once");
                    throw new IllegalStateException(sb2.toString());
                } else if (e == null) {
                    StringBuilder sb3 = new StringBuilder("interceptor ");
                    sb3.append(jwVar);
                    sb3.append(" returned null");
                    throw new NullPointerException(sb3.toString());
                } else if (e.mo9607c() != null) {
                    return e;
                } else {
                    StringBuilder sb4 = new StringBuilder("interceptor ");
                    sb4.append(jwVar);
                    sb4.append(" returned a response with no body");
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder("network interceptor ");
                sb5.append(this.f10967a.get(this.f10971e - 1));
                sb5.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb5.toString());
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: e */
    public final C3295kc mo9541e(C3293kb kbVar) {
        return mo9690b(kbVar, this.f10968b, this.f10970d, this.f10969c);
    }
}
