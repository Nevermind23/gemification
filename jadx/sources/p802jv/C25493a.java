package p802jv;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p822lv.C26093a;

/* renamed from: jv.a */
public final class C25493a {

    /* renamed from: a */
    private final C26093a f65158a;

    /* renamed from: b */
    private final C25508l f65159b;

    public C25493a(C26093a aVar, C25508l lVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(lVar, "refreshMoneyRequests");
        this.f65158a = aVar;
        this.f65159b = lVar;
    }

    /* renamed from: a */
    public final C40734b mo64046a(long j) {
        C40734b d = this.f65158a.mo65008Z2(j, true).mo94895d(this.f65159b.mo64058a());
        C41536l.m120488h(d, "repository.completeReque…n(refreshMoneyRequests())");
        return d;
    }
}
