package jf1;

import ed1.C40734b;
import ed1.C40736c;
import ef1.C40786c0;
import ef1.C40814h0;
import ef1.C40815h1;
import ef1.C40822j0;
import ef1.C40845o1;
import me1.C41752f;
import me1.C41758g;
import ue1.C43079p;

/* renamed from: jf1.e */
public abstract class C41431e {
    /* renamed from: b */
    public static final C40734b m120220b(C41752f fVar, C43079p pVar) {
        boolean z;
        if (fVar.mo23736c(C40845o1.f96561d3) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m120222d(C40815h1.f96534d, fVar, pVar);
        }
        throw new IllegalArgumentException(("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had " + fVar).toString());
    }

    /* renamed from: c */
    public static /* synthetic */ C40734b m120221c(C41752f fVar, C43079p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C41758g.f98029d;
        }
        return m120220b(fVar, pVar);
    }

    /* renamed from: d */
    private static final C40734b m120222d(C40814h0 h0Var, C41752f fVar, C43079p pVar) {
        return C40734b.m117920k(new C41430d(h0Var, fVar, pVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m120223e(C40814h0 h0Var, C41752f fVar, C43079p pVar, C40736c cVar) {
        C41429c cVar2 = new C41429c(C40786c0.m118261d(h0Var, fVar), cVar);
        cVar.mo94909c(new C41427a(cVar2));
        cVar2.mo95129N0(C40822j0.DEFAULT, cVar2, pVar);
    }
}
