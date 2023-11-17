package gf1;

import ue1.C43075l;

/* renamed from: gf1.h */
public abstract class C41101h {
    /* renamed from: a */
    public static final C41098f m119147a(int i, C41097e eVar, C43075l lVar) {
        int i2 = 1;
        if (i == -2) {
            if (eVar == C41097e.SUSPEND) {
                i2 = C41098f.f97021e3.mo95533a();
            }
            return new C41095d(i2, eVar, lVar);
        } else if (i == -1) {
            if (eVar != C41097e.SUSPEND) {
                i2 = 0;
            }
            if (i2 != 0) {
                return new C41109m(lVar);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new C41110n(lVar);
            }
            if (i == 1 && eVar == C41097e.DROP_OLDEST) {
                return new C41109m(lVar);
            }
            return new C41095d(i, eVar, lVar);
        } else if (eVar == C41097e.SUSPEND) {
            return new C41117u(lVar);
        } else {
            return new C41095d(1, eVar, lVar);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C41098f m119148b(int i, C41097e eVar, C43075l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            eVar = C41097e.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return m119147a(i, eVar, lVar);
    }
}
