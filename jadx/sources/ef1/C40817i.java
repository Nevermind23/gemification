package ef1;

import me1.C41748d;
import me1.C41752f;
import me1.C41758g;
import ue1.C43079p;

/* renamed from: ef1.i */
abstract /* synthetic */ class C40817i {
    /* renamed from: a */
    public static final Object m118307a(C41752f fVar, C43079p pVar) {
        C41752f fVar2;
        C40882y0 y0Var;
        C40882y0 y0Var2;
        Thread currentThread = Thread.currentThread();
        C41748d dVar = (C41748d) fVar.mo23736c(C41748d.f98026f3);
        if (dVar == null) {
            y0Var = C40834l2.f96545a.mo95178b();
            fVar2 = C40786c0.m118261d(C40815h1.f96534d, fVar.mo23741u(y0Var));
        } else {
            C40882y0 y0Var3 = null;
            if (dVar instanceof C40882y0) {
                y0Var2 = (C40882y0) dVar;
            } else {
                y0Var2 = null;
            }
            if (y0Var2 != null) {
                if (y0Var2.mo95268F0()) {
                    y0Var3 = y0Var2;
                }
                if (y0Var3 != null) {
                    y0Var = y0Var3;
                    fVar2 = C40786c0.m118261d(C40815h1.f96534d, fVar);
                }
            }
            y0Var = C40834l2.f96545a.mo95177a();
            fVar2 = C40786c0.m118261d(C40815h1.f96534d, fVar);
        }
        C40805f fVar3 = new C40805f(fVar2, currentThread, y0Var);
        fVar3.mo95129N0(C40822j0.DEFAULT, fVar3, pVar);
        return fVar3.mo95158O0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m118308b(C41752f fVar, C43079p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = C41758g.f98029d;
        }
        return C40813h.m118301c(fVar, pVar);
    }
}
