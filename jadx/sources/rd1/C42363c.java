package rd1;

import ed1.C40737d;
import ed1.C40739f;
import id1.C41300a;
import java.util.concurrent.Callable;
import jd1.C41405l;
import kd1.C41499d;
import ld1.C41692b;

/* renamed from: rd1.c */
abstract class C42363c {
    /* renamed from: a */
    static boolean m122875a(Object obj, C41405l lVar, C40737d dVar) {
        C40739f fVar;
        if (!(obj instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                fVar = (C40739f) C41692b.m120934e(lVar.apply(call), "The mapper returned a null CompletableSource");
            } else {
                fVar = null;
            }
            if (fVar == null) {
                C41499d.m120379a(dVar);
            } else {
                fVar.mo94894a(dVar);
            }
            return true;
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C41499d.m120382h(th, dVar);
            return true;
        }
    }
}
