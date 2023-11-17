package ef1;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import me1.C41752f;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ef1.o1 */
public interface C40845o1 extends C41752f.C41755b {

    /* renamed from: d3 */
    public static final C40847b f96561d3 = C40847b.f96562d;

    /* renamed from: ef1.o1$a */
    public static final class C40846a {
        /* renamed from: a */
        public static /* synthetic */ void m118414a(C40845o1 o1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                o1Var.mo95211a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static Object m118415b(C40845o1 o1Var, Object obj, C43079p pVar) {
            return C41752f.C41755b.C41756a.m121040a(o1Var, obj, pVar);
        }

        /* renamed from: c */
        public static C41752f.C41755b m118416c(C40845o1 o1Var, C41752f.C41757c cVar) {
            return C41752f.C41755b.C41756a.m121041b(o1Var, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ C40870v0 m118417d(C40845o1 o1Var, boolean z, boolean z2, C43075l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return o1Var.mo95213o(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static C41752f m118418e(C40845o1 o1Var, C41752f.C41757c cVar) {
            return C41752f.C41755b.C41756a.m121042c(o1Var, cVar);
        }

        /* renamed from: f */
        public static C41752f m118419f(C40845o1 o1Var, C41752f fVar) {
            return C41752f.C41755b.C41756a.m121043d(o1Var, fVar);
        }
    }

    /* renamed from: ef1.o1$b */
    public static final class C40847b implements C41752f.C41757c {

        /* renamed from: d */
        static final /* synthetic */ C40847b f96562d = new C40847b();

        private C40847b() {
        }
    }

    /* renamed from: a */
    void mo95211a(CancellationException cancellationException);

    /* renamed from: k */
    boolean mo95131k();

    /* renamed from: n */
    CancellationException mo95212n();

    /* renamed from: o */
    C40870v0 mo95213o(boolean z, boolean z2, C43075l lVar);

    /* renamed from: p */
    C40863t mo95214p(C40869v vVar);

    /* renamed from: s */
    C40870v0 mo95215s(C43075l lVar);

    boolean start();

    /* renamed from: v */
    Object mo95217v(Continuation continuation);
}
