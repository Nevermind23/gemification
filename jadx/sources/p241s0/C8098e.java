package p241s0;

import androidx.appcompat.app.C0218d;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import p202p0.C7556l;
import p202p0.C7589q;

/* renamed from: s0.e */
public final class C8098e {

    /* renamed from: a */
    public static final C8098e f23260a = new C8098e();

    private C8098e() {
    }

    /* renamed from: a */
    public static final boolean m30642a(C7589q qVar, Set set) {
        C41536l.m120489i(qVar, "<this>");
        C41536l.m120489i(set, "destinationIds");
        for (C7589q w : C7589q.f22137m.mo22219c(qVar)) {
            if (set.contains(Integer.valueOf(w.mo22214w()))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final void m30643b(C0218d dVar, C7556l lVar, C8095d dVar2) {
        C41536l.m120489i(dVar, "activity");
        C41536l.m120489i(lVar, "navController");
        C41536l.m120489i(dVar2, "configuration");
        lVar.mo22137p(new C8093b(dVar, dVar2));
    }
}
