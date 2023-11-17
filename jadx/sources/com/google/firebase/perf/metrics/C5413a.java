package com.google.firebase.perf.metrics;

import com.google.firebase.perf.session.PerfSession;
import java.util.Arrays;
import java.util.List;
import p225qa.C7983k;
import p225qa.C7990m;

/* renamed from: com.google.firebase.perf.metrics.a */
class C5413a {

    /* renamed from: a */
    private final Trace f17261a;

    C5413a(Trace trace) {
        this.f17261a = trace;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7990m mo17819a() {
        C7990m.C7992b I = C7990m.m30351z0().mo23132J(this.f17261a.mo17793f()).mo23130H(this.f17261a.mo17799h().mo18043f()).mo23131I(this.f17261a.mo17799h().mo18042e(this.f17261a.mo17792e()));
        for (Counter counter : this.f17261a.mo17790d().values()) {
            I.mo23128F(counter.mo17780b(), counter.mo17779a());
        }
        List<Trace> i = this.f17261a.mo17800i();
        if (!i.isEmpty()) {
            for (Trace aVar : i) {
                I.mo23125C(new C5413a(aVar).mo17819a());
            }
        }
        I.mo23127E(this.f17261a.getAttributes());
        C7983k[] b = PerfSession.m21522b(this.f17261a.mo17795g());
        if (b != null) {
            I.mo23133z(Arrays.asList(b));
        }
        return (C7990m) I.mo18768o();
    }
}
