package ib1;

import androidx.lifecycle.C1644x;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10220y;
import gb1.C32388r;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import lb1.C37123e;

/* renamed from: ib1.i */
public final class C36440i extends C32388r {

    /* renamed from: d */
    private final C36437h f87924d;

    /* renamed from: e */
    private final C10146d0.C10172e f87925e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36440i(C36437h hVar, C10146d0.C10172e eVar) {
        super(hVar);
        C41536l.m120489i(hVar, "context");
        C41536l.m120489i(eVar, "config");
        this.f87924d = hVar;
        this.f87925e = eVar;
    }

    /* renamed from: a */
    public void mo72874a() {
        this.f87924d.mo89251j().mo4823o(C41238w.f97225a);
    }

    /* renamed from: b */
    public void mo72875b() {
        Object obj;
        String a;
        this.f87924d.mo89257p().mo4823o(Boolean.TRUE);
        C1644x d = this.f87924d.mo89245d();
        C10195g0 g = this.f87925e.mo26716g();
        if (g == null || (a = g.mo26763a("text.do.choose.document.page.header", new Object[0])) == null || (obj = C37123e.m109724b(a)) == null) {
            obj = C37123e.m109725c(C10220y.onboarding_document_header);
        }
        d.mo4823o(obj);
    }
}
