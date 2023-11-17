package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11164w3;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.o0 */
class C11026o0 implements C10769c8, C11164w3.C11172h {

    /* renamed from: a */
    private final HashMap<C11027a, C10845h0> f31686a;

    /* renamed from: com.medallia.digital.mobilesdk.o0$a */
    protected enum C11027a {
        Form,
        Intercept,
        UserJourneyAction,
        Feedback,
        Localization,
        CustomIntercept,
        TreEvents
    }

    C11026o0() {
        HashMap<C11027a, C10845h0> hashMap = new HashMap<>();
        this.f31686a = hashMap;
        hashMap.put(C11027a.Form, new C10791e4());
        hashMap.put(C11027a.Feedback, new C10775d4());
        hashMap.put(C11027a.Intercept, new C10806f4());
        hashMap.put(C11027a.UserJourneyAction, new C10834g4());
        hashMap.put(C11027a.Localization, new C10719a4());
        hashMap.put(C11027a.CustomIntercept, new C10759c4());
        hashMap.put(C11027a.TreEvents, new C11104t7());
    }

    /* renamed from: b */
    private void m40406b(C11027a aVar) {
        C10845h0 h0Var;
        HashMap<C11027a, C10845h0> hashMap = this.f31686a;
        if (hashMap != null && (h0Var = hashMap.get(aVar)) != null) {
            h0Var.mo28388e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28848a() {
        C11164w3.m40939b().mo29113a((C11164w3.C11172h) this);
        m40405a(C11027a.Form);
        m40405a(C11027a.Feedback);
        m40405a(C11027a.Intercept);
        m40405a(C11027a.UserJourneyAction);
        m40405a(C11027a.Localization);
        m40405a(C11027a.CustomIntercept);
        m40405a(C11027a.TreEvents);
    }

    public void clearAndDisconnect() {
        m40406b(C11027a.Form);
        m40406b(C11027a.Feedback);
        m40406b(C11027a.Intercept);
        m40406b(C11027a.UserJourneyAction);
        m40406b(C11027a.Localization);
        m40406b(C11027a.CustomIntercept);
        m40406b(C11027a.TreEvents);
    }

    public void onBackground() {
        clearAndDisconnect();
    }

    public void onForeground() {
        mo28848a();
    }

    /* renamed from: a */
    private void m40405a(C11027a aVar) {
        C10845h0 h0Var;
        HashMap<C11027a, C10845h0> hashMap = this.f31686a;
        if (hashMap != null && (h0Var = hashMap.get(aVar)) != null) {
            h0Var.mo28387d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28849a(C11027a aVar, Object obj) {
        C10845h0 h0Var;
        HashMap<C11027a, C10845h0> hashMap = this.f31686a;
        if (hashMap != null && (h0Var = hashMap.get(aVar)) != null) {
            h0Var.mo28075a(obj);
        }
    }
}
