package ib1;

import ba1.C10220y;
import gb1.C32388r;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import lb1.C37123e;

/* renamed from: ib1.b */
public final class C36377b extends C32388r {

    /* renamed from: d */
    private final C36437h f87764d;

    /* renamed from: e */
    private boolean f87765e = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36377b(C36437h hVar) {
        super(hVar);
        C41536l.m120489i(hVar, "context");
        this.f87764d = hVar;
    }

    /* renamed from: a */
    public void mo72874a() {
        this.f87764d.mo89257p().mo4823o(Boolean.TRUE);
        this.f87764d.mo89245d().mo4823o(C37123e.m109725c(C10220y.onboarding_register));
    }

    /* renamed from: b */
    public void mo72875b() {
        if (!this.f87765e) {
            mo72877d();
        } else {
            this.f87764d.mo89247f().mo4823o(C41238w.f97225a);
        }
    }

    /* renamed from: k */
    public final void mo89121k(boolean z) {
        this.f87765e = z;
    }
}
