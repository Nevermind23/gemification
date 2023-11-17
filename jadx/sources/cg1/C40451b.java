package cg1;

import dg1.C40672b;
import java.io.EOFException;
import kotlin.jvm.internal.C41536l;

/* renamed from: cg1.b */
public abstract class C40451b {
    /* renamed from: a */
    public static final boolean m117204a(C40672b bVar) {
        C41536l.m120489i(bVar, "<this>");
        try {
            C40672b bVar2 = new C40672b();
            bVar.mo94747p(bVar2, 0, C43429k.m124589h(bVar.mo94709M0(), 64));
            int i = 0;
            while (i < 16) {
                i++;
                if (bVar2.mo94714Q0()) {
                    return true;
                }
                int H0 = bVar2.mo94703H0();
                if (Character.isISOControl(H0) && !Character.isWhitespace(H0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
