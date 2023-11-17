package p843nw;

import ed1.C40749p;
import kotlin.jvm.internal.C41536l;
import p863pw.C27631i;
import p863pw.C27633k;
import p863pw.C27637o;

/* renamed from: nw.j */
public final class C26628j {

    /* renamed from: a */
    private final C26633o f67251a;

    /* renamed from: b */
    private final C26625h f67252b;

    public C26628j(C26633o oVar, C26625h hVar) {
        C41536l.m120489i(oVar, "getCardsAndDetailsUseCase");
        C41536l.m120489i(hVar, "getAccountsAndDetailsUseCase");
        this.f67251a = oVar;
        this.f67252b = hVar;
    }

    /* renamed from: d */
    public static /* synthetic */ C40749p m83095d(C26628j jVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return jVar.mo65882c(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C27633k m83096e(C27637o oVar, C27631i iVar) {
        C41536l.m120489i(oVar, "cards");
        C41536l.m120489i(iVar, "accountDetails");
        return new C27633k(iVar.mo67075a(), iVar.mo67076b(), iVar.mo67077c(), oVar.mo67167a());
    }

    /* renamed from: b */
    public final C40749p mo65881b() {
        return m83095d(this, false, 1, (Object) null);
    }

    /* renamed from: c */
    public final C40749p mo65882c(boolean z) {
        C40749p m = C40749p.m118048m(this.f67251a.mo65886c(z), this.f67252b.mo65879c(z), new C26627i());
        C41536l.m120488h(m, "combineLatest(\n         …)\n            }\n        )");
        return m;
    }
}
