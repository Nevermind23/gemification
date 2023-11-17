package p802jv;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p822lv.C26093a;

/* renamed from: jv.b */
public final class C25494b {

    /* renamed from: a */
    private final C26093a f65160a;

    /* renamed from: b */
    private final C25508l f65161b;

    public C25494b(C26093a aVar, C25508l lVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(lVar, "refreshMoneyRequests");
        this.f65160a = aVar;
        this.f65161b = lVar;
    }

    /* renamed from: a */
    public final C40734b mo64047a(long j) {
        C40734b d = this.f65160a.mo65008Z2(j, false).mo94895d(this.f65161b.mo64058a());
        C41536l.m120488h(d, "repository.completeReque…n(refreshMoneyRequests())");
        return d;
    }
}
