package ux0;

import androidx.lifecycle.C1644x;
import ed1.C40749p;
import ey0.C31880b;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicReference;
import ue1.C43075l;

/* renamed from: ux0.q */
public interface C39166q {

    /* renamed from: ux0.q$a */
    public static final class C39167a {
        /* renamed from: a */
        public static /* synthetic */ C41205b m114286a(C39166q qVar, C40749p pVar, C1644x xVar, C43075l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    xVar = null;
                }
                if ((i & 4) != 0) {
                    lVar = null;
                }
                return qVar.mo56543we(pVar, xVar, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeToObservable");
        }
    }

    /* renamed from: Kf */
    void mo56494Kf(C31880b bVar);

    /* renamed from: Pp */
    C40749p mo56500Pp();

    /* renamed from: Rb */
    C40749p mo56502Rb();

    /* renamed from: Xb */
    void mo56509Xb(boolean z);

    /* renamed from: ku */
    AtomicReference mo56526ku();

    /* renamed from: we */
    C41205b mo56543we(C40749p pVar, C1644x xVar, C43075l lVar);
}
