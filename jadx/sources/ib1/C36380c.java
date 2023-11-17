package ib1;

import ba1.C10220y;
import gb1.C32388r;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import lb1.C37123e;

/* renamed from: ib1.c */
public final class C36380c extends C32388r {

    /* renamed from: d */
    private final C36437h f87768d;

    /* renamed from: e */
    private boolean f87769e = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36380c(C36437h hVar) {
        super(hVar);
        C41536l.m120489i(hVar, "context");
        this.f87768d = hVar;
    }

    /* renamed from: a */
    public void mo72874a() {
        this.f87768d.mo89257p().mo4823o(Boolean.TRUE);
        this.f87768d.mo89245d().mo4823o(C37123e.m109725c(C10220y.onboarding_register));
    }

    /* renamed from: b */
    public void mo72875b() {
        if (!this.f87769e) {
            mo72877d();
        } else {
            this.f87768d.mo89248g().mo4823o(C41238w.f97225a);
        }
    }

    /* renamed from: k */
    public final void mo89122k(boolean z) {
        this.f87769e = z;
    }
}
