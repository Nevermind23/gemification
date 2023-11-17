package gf1;

import ef1.C40786c0;
import ef1.C40814h0;
import ef1.C40822j0;
import me1.C41752f;
import me1.C41758g;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: gf1.o */
public abstract class C41111o {
    /* renamed from: a */
    public static final C41115s m119189a(C40814h0 h0Var, C41752f fVar, int i, C41097e eVar, C40822j0 j0Var, C43075l lVar, C43079p pVar) {
        C41112p pVar2 = new C41112p(C40786c0.m118261d(h0Var, fVar), C41101h.m119148b(i, eVar, (C43075l) null, 4, (Object) null));
        if (lVar != null) {
            pVar2.mo95215s(lVar);
        }
        pVar2.mo95129N0(j0Var, pVar2, pVar);
        return pVar2;
    }

    /* renamed from: b */
    public static /* synthetic */ C41115s m119190b(C40814h0 h0Var, C41752f fVar, int i, C41097e eVar, C40822j0 j0Var, C43075l lVar, C43079p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fVar = C41758g.f98029d;
        }
        C41752f fVar2 = fVar;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            eVar = C41097e.SUSPEND;
        }
        C41097e eVar2 = eVar;
        if ((i2 & 8) != 0) {
            j0Var = C40822j0.DEFAULT;
        }
        C40822j0 j0Var2 = j0Var;
        if ((i2 & 16) != 0) {
            lVar = null;
        }
        return m119189a(h0Var, fVar2, i3, eVar2, j0Var2, lVar, pVar);
    }
}
