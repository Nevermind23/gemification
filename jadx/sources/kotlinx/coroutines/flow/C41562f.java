package kotlinx.coroutines.flow;

import gf1.C41097e;
import hf1.C41249g;
import hf1.C41255i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me1.C41752f;

/* renamed from: kotlinx.coroutines.flow.f */
abstract /* synthetic */ class C41562f {
    /* renamed from: a */
    public static final C41556a m120530a(C41556a aVar, int i, C41097e eVar) {
        boolean z;
        C41097e eVar2;
        int i2;
        boolean z2 = true;
        if (i >= 0 || i == -2 || i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == -1 && eVar != C41097e.SUSPEND) {
                z2 = false;
            }
            if (z2) {
                if (i == -1) {
                    eVar2 = C41097e.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    eVar2 = eVar;
                }
                if (aVar instanceof C41255i) {
                    return C41255i.C41256a.m119552a((C41255i) aVar, (C41752f) null, i2, eVar2, 1, (Object) null);
                }
                return new C41249g(aVar, (C41752f) null, i2, eVar2, 2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ C41556a m120531b(C41556a aVar, int i, C41097e eVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            eVar = C41097e.SUSPEND;
        }
        return C41558c.m120516c(aVar, i, eVar);
    }
}
