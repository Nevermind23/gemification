package ib1;

import ba1.C10220y;
import gb1.C32388r;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import lb1.C37123e;
import sso.type.UserContactType;

/* renamed from: ib1.f */
public final class C36431f extends C32388r {

    /* renamed from: d */
    private final C36437h f87900d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36431f(C36437h hVar) {
        super(hVar);
        C41536l.m120489i(hVar, "context");
        this.f87900d = hVar;
    }

    /* renamed from: a */
    public void mo72874a() {
        this.f87900d.mo89257p().mo4823o(Boolean.TRUE);
        if (this.f87900d.mo89243b().mo4814f() == UserContactType.MAIL) {
            this.f87900d.mo89245d().mo4823o(C37123e.m109725c(C10220y.onboarding_add_new_email));
        } else {
            this.f87900d.mo89245d().mo4823o(C37123e.m109725c(C10220y.onboarding_add_new_phone));
        }
    }

    /* renamed from: b */
    public void mo72875b() {
        this.f87900d.mo89249h().mo4823o(C41238w.f97225a);
    }

    /* renamed from: k */
    public final void mo89242k(UserContactType userContactType) {
        C41536l.m120489i(userContactType, "userContactType");
        this.f87900d.mo89243b().mo4823o(userContactType);
    }
}
