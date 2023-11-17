package com.facetec.sdk;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facetec.sdk.ku */
public final class C3321ku {

    /* renamed from: a */
    List<Proxy> f10921a = Collections.emptyList();

    /* renamed from: b */
    final C3247ji f10922b;

    /* renamed from: c */
    final C3264jt f10923c;

    /* renamed from: d */
    final C3316kp f10924d;

    /* renamed from: e */
    final C3237jd f10925e;

    /* renamed from: f */
    List<InetSocketAddress> f10926f = Collections.emptyList();

    /* renamed from: h */
    final List<C3302kh> f10927h = new ArrayList();

    /* renamed from: i */
    int f10928i;

    /* renamed from: com.facetec.sdk.ku$c */
    public static final class C3322c {

        /* renamed from: b */
        final List<C3302kh> f10929b;

        /* renamed from: e */
        int f10930e = 0;

        C3322c(List<C3302kh> list) {
            this.f10929b = list;
        }

        /* renamed from: e */
        public final boolean mo9670e() {
            return this.f10930e < this.f10929b.size();
        }
    }

    public C3321ku(C3237jd jdVar, C3316kp kpVar, C3247ji jiVar, C3264jt jtVar) {
        List<Proxy> list;
        this.f10925e = jdVar;
        this.f10924d = kpVar;
        this.f10922b = jiVar;
        this.f10923c = jtVar;
        C3274jx d = jdVar.mo9431d();
        Proxy proxy = jdVar.f10544a;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = jdVar.mo9430c().select(d.mo9546d());
            if (select == null || select.isEmpty()) {
                list = C3303ki.m13273e((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = C3303ki.m13264d(select);
            }
        }
        this.f10921a = list;
        this.f10928i = 0;
    }

    /* renamed from: c */
    public final boolean mo9668c() {
        return mo9669d() || !this.f10927h.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo9669d() {
        return this.f10928i < this.f10921a.size();
    }
}
