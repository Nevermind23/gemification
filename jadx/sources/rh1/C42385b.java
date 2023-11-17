package rh1;

import kotlin.jvm.internal.C41536l;
import lh1.C41702a;
import ue1.C43075l;

/* renamed from: rh1.b */
public abstract class C42385b {
    /* renamed from: a */
    public static final C41702a m122931a(boolean z, boolean z2, C43075l lVar) {
        C41536l.m120489i(lVar, "moduleDeclaration");
        C41702a aVar = new C41702a(z, z2);
        lVar.invoke(aVar);
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C41702a m122932b(boolean z, boolean z2, C43075l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return m122931a(z, z2, lVar);
    }
}
