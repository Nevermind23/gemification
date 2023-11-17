package p773gv;

import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import p792iv.C25260a;
import p802jv.C25508l;

/* renamed from: gv.n */
public final class C24821n {

    /* renamed from: a */
    private final C25260a f63735a;

    /* renamed from: b */
    private final C25508l f63736b;

    public C24821n(C25260a aVar, C25508l lVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(lVar, "refreshMoneyRequests");
        this.f63735a = aVar;
        this.f63736b = lVar;
    }

    /* renamed from: a */
    public final C40734b mo63232a(String str, String str2, long j) {
        C41536l.m120489i(str, "requestDescription");
        C41536l.m120489i(str2, "acctNo");
        C40734b d = this.f63735a.mo63789i1(str, str2, j).mo94895d(this.f63736b.mo64058a());
        C41536l.m120488h(d, "repository.createBillSpl…n(refreshMoneyRequests())");
        return d;
    }
}
