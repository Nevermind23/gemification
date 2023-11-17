package kotlinx.coroutines.flow;

import gf1.C41097e;
import hf1.C41249g;
import kotlinx.coroutines.internal.C41584a0;
import me1.C41752f;

/* renamed from: kotlinx.coroutines.flow.p */
public abstract class C41576p {

    /* renamed from: a */
    public static final C41584a0 f97755a = new C41584a0("NO_VALUE");

    /* renamed from: a */
    public static final C41567j m120589a(int i, int i2, C41097e eVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i <= 0 && i2 <= 0 && eVar != C41097e.SUSPEND) {
                    z3 = false;
                }
                if (z3) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new C41572o(i, i3, eVar);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + eVar).toString());
            }
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ C41567j m120590b(int i, int i2, C41097e eVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            eVar = C41097e.SUSPEND;
        }
        return m120589a(i, i2, eVar);
    }

    /* renamed from: e */
    public static final C41556a m120593e(C41571n nVar, C41752f fVar, int i, C41097e eVar) {
        if ((i == 0 || i == -3) && eVar == C41097e.SUSPEND) {
            return nVar;
        }
        return new C41249g(nVar, fVar, i, eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final Object m120594f(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m120595g(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
