package hf1;

import gf1.C41097e;
import kotlinx.coroutines.flow.C41556a;
import me1.C41752f;
import me1.C41758g;

/* renamed from: hf1.i */
public interface C41255i extends C41556a {

    /* renamed from: hf1.i$a */
    public static final class C41256a {
        /* renamed from: a */
        public static /* synthetic */ C41556a m119552a(C41255i iVar, C41752f fVar, int i, C41097e eVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    fVar = C41758g.f98029d;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    eVar = C41097e.SUSPEND;
                }
                return iVar.mo95708d(fVar, i, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    /* renamed from: d */
    C41556a mo95708d(C41752f fVar, int i, C41097e eVar);
}
