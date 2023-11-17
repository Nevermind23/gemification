package p802jv;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p822lv.C26093a;

/* renamed from: jv.e */
public final class C25498e {

    /* renamed from: a */
    private final C26093a f65166a;

    /* renamed from: b */
    private final C25508l f65167b;

    public C25498e(C26093a aVar, C25508l lVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(lVar, "refreshMoneyRequests");
        this.f65166a = aVar;
        this.f65167b = lVar;
    }

    /* renamed from: a */
    public final C40734b mo64050a(long j) {
        C40734b d = this.f65166a.mo65010v1(j).mo94895d(this.f65167b.mo64058a());
        C41536l.m120488h(d, "repository.declineReques…n(refreshMoneyRequests())");
        return d;
    }
}
