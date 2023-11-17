package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.medallia.digital.mobilesdk.j2 */
class C10901j2 {

    /* renamed from: b */
    private static final int f31316b = 90;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Queue<C10826g2> f31317a = new LinkedList();

    /* renamed from: com.medallia.digital.mobilesdk.j2$a */
    class C10902a implements C10796e6<Void> {

        /* renamed from: a */
        final /* synthetic */ C10826g2 f31318a;

        /* renamed from: b */
        final /* synthetic */ C10903b f31319b;

        C10902a(C10826g2 g2Var, C10903b bVar) {
            this.f31318a = g2Var;
            this.f31319b = bVar;
        }

        /* renamed from: a */
        private void m39793a(C10826g2 g2Var) {
            C10901j2.this.f31317a.remove(g2Var);
            if (C10901j2.this.f31317a.isEmpty()) {
                C10901j2.this.mo28520a((C10826g2) null, this.f31319b);
                this.f31319b.onSuccess();
                return;
            }
            C10901j2 j2Var = C10901j2.this;
            j2Var.mo28520a((C10826g2) j2Var.f31317a.poll(), this.f31319b);
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
            C10735b4.m39111c("Stored feedback failed to submit. Feedback UUID: " + this.f31318a.mo28333b());
            m39793a(this.f31318a);
        }

        /* renamed from: a */
        public void mo27797a(Void voidR) {
            C10735b4.m39109b("Stored feedback was submitted successfully. Feedback UUID: " + this.f31318a.mo28333b());
            m39793a(this.f31318a);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j2$b */
    interface C10903b {
        /* renamed from: a */
        void mo28149a();

        void onSuccess();
    }

    C10901j2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28519a() {
        C10916j4.m39856b().mo28545a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28520a(C10826g2 g2Var, C10903b bVar) {
        if (g2Var != null) {
            C10876i1.m39698a().mo28465a((C10785e0) g2Var);
            g2Var.mo28338f();
            C10998m4.m40266h().mo28739a(g2Var, (C10796e6<Void>) new C10902a(g2Var, bVar));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28521a(C10903b bVar) {
        C10876i1 a = C10876i1.m39698a();
        C10785e0.C10786a aVar = C10785e0.C10786a.Feedback;
        ArrayList<? extends C10785e0> c = a.mo28471c(aVar, new Object[0]);
        if (c != null && !c.isEmpty()) {
            AnalyticsBridge.getInstance().reportFeedbackRetryMechanismEvent(c.size());
            this.f31317a.addAll(c);
            mo28520a(this.f31317a.poll(), bVar);
            C10876i1.m39698a().mo28464a(aVar, Long.valueOf(System.currentTimeMillis() - 7776000000L));
        }
    }
}
