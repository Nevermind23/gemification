package p773gv;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p792iv.C25260a;
import p802jv.C25508l;

/* renamed from: gv.o */
public final class C24822o {

    /* renamed from: a */
    private final C25260a f63737a;

    /* renamed from: b */
    private final C25508l f63738b;

    public C24822o(C25260a aVar, C25508l lVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(lVar, "refreshMoneyRequests");
        this.f63737a = aVar;
        this.f63738b = lVar;
    }

    /* renamed from: a */
    public final C40734b mo63233a(String str, String str2, long j, double d) {
        C41536l.m120489i(str, "requestDescription");
        C41536l.m120489i(str2, "acctNo");
        C40734b d2 = this.f63737a.mo63786a1(str, str2, j, d).mo94895d(this.f63738b.mo64058a());
        C41536l.m120488h(d2, "repository.createMoneyRe…n(refreshMoneyRequests())");
        return d2;
    }
}
