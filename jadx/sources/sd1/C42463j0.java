package sd1;

import ae1.C40293a;
import ed1.C40753s;
import ed1.C40754t;
import ed1.C40756v;
import id1.C41300a;
import ld1.C41692b;

/* renamed from: sd1.j0 */
public final class C42463j0 extends C42399a {

    /* renamed from: e */
    final C40753s f99888e;

    public C42463j0(C40754t tVar, C40753s sVar) {
        super(tVar);
        this.f99888e = sVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        try {
            C40756v a = this.f99888e.mo88919a(vVar);
            this.f99678d.mo95016c((C40756v) C41692b.m120934e(a, "Operator " + this.f99888e + " returned a null Observer"));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C41300a.m119661b(th);
            C40293a.m116722s(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
