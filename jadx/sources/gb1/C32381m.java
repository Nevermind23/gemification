package gb1;

import de1.C40640a;
import ed1.C40734b;
import ed1.C40762x;
import gd1.C40992a;
import hd1.C41205b;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: gb1.m */
public abstract class C32381m {
    /* renamed from: g */
    public static final C41205b m95618g(C40734b bVar, C43064a aVar, C43064a aVar2, C43075l lVar) {
        C41536l.m120489i(bVar, "<this>");
        C41205b G = bVar.mo94890I(C40640a.m117458b()).mo94906z(C40992a.m118827a()).mo94904r(new C32378j(aVar)).mo94888G(new C32379k(aVar2), new C32380l(lVar));
        C41536l.m120488h(G, "subscribeOn(Schedulers.i…ror?.invoke(it)\n        }");
        return G;
    }

    /* renamed from: h */
    public static final C41205b m95619h(C40762x xVar, C43064a aVar, C43075l lVar, C43075l lVar2) {
        C41536l.m120489i(xVar, "<this>");
        C41205b I = xVar.mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C32375g(aVar)).mo95070I(new C32376h(lVar), new C32377i(lVar2));
        C41536l.m120488h(I, "subscribeOn(Schedulers.i…ror?.invoke(it)\n        }");
        return I;
    }

    /* renamed from: i */
    public static /* synthetic */ C41205b m95620i(C40734b bVar, C43064a aVar, C43064a aVar2, C43075l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        if ((i & 4) != 0) {
            lVar = null;
        }
        return m95618g(bVar, aVar, aVar2, lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m95621j(C43064a aVar, C41205b bVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m95622k(C43075l lVar, Object obj) {
        if (lVar != null) {
            lVar.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m95623l(C43075l lVar, Throwable th) {
        if (lVar != null) {
            C41536l.m120488h(th, "it");
            lVar.invoke(th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m95624m(C43064a aVar, C41205b bVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m95625n(C43064a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m95626o(C43075l lVar, Throwable th) {
        if (lVar != null) {
            C41536l.m120488h(th, "it");
            lVar.invoke(th);
        }
    }
}
