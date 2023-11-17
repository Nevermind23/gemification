package xa0;

import b41.C31128a;
import ed1.C40749p;
import java.math.BigDecimal;
import java.util.Date;
import ue1.C43075l;

/* renamed from: xa0.b */
public interface C29665b {

    /* renamed from: xa0.b$a */
    public static final class C29666a {
        /* renamed from: a */
        public static /* synthetic */ void m90078a(C29665b bVar, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    j = -1;
                }
                bVar.mo56871ws(j);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onContinueClick");
        }

        /* renamed from: b */
        public static /* synthetic */ void m90079b(C29665b bVar, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                bVar.mo56842Nr(str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInitialAmountSelected");
        }

        /* renamed from: c */
        public static /* synthetic */ void m90080c(C29665b bVar, C43075l lVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                bVar.mo56858i9(lVar, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateForm");
        }
    }

    /* renamed from: B8 */
    void mo56837B8(C31128a aVar);

    /* renamed from: Jk */
    boolean mo56840Jk();

    /* renamed from: K */
    void mo56841K(int i);

    /* renamed from: Nr */
    void mo56842Nr(String str, boolean z);

    /* renamed from: Oe */
    void mo56843Oe();

    /* renamed from: P8 */
    void mo56844P8();

    /* renamed from: Pn */
    void mo56845Pn();

    /* renamed from: Q6 */
    void mo56846Q6();

    /* renamed from: Up */
    void mo56847Up(C31128a aVar);

    /* renamed from: Yi */
    Date mo56849Yi(int i);

    /* renamed from: Z6 */
    void mo56851Z6(String str);

    /* renamed from: gv */
    void mo56855gv();

    /* renamed from: hk */
    void mo56857hk();

    /* renamed from: i9 */
    void mo56858i9(C43075l lVar, boolean z);

    /* renamed from: in */
    C40749p mo56859in(C40749p pVar);

    /* renamed from: ub */
    boolean mo56868ub(BigDecimal bigDecimal);

    /* renamed from: ws */
    void mo56871ws(long j);
}
