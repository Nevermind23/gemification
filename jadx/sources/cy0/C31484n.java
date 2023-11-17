package cy0;

import android.content.Context;
import cy0.C31481m;
import ey0.C31877a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ox0.C37833c;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import vx0.C39491a;
import wx0.C39718e;
import yx0.C40087b;

/* renamed from: cy0.n */
final class C31484n implements C31481m {

    /* renamed from: l */
    private final C31877a f78054l;

    public C31484n(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78054l = aVar;
    }

    /* renamed from: D */
    private final C39491a m93533D() {
        return mo71904z(C33702d.C33703a.CHIPS);
    }

    /* renamed from: E */
    private final C39491a m93534E() {
        return mo71904z(C33702d.C33703a.PACKAGES_SELECT);
    }

    /* renamed from: C */
    public C31877a mo71866t() {
        return this.f78054l;
    }

    /* renamed from: u */
    public void mo71901u(List list) {
        C41536l.m120489i(list, "packages");
        C39491a E = m93534E();
        if (E != null && (E instanceof C40087b)) {
            ((C40087b) E).mo94024C(C37833c.f90838a.mo91117C(), list);
        }
        C39491a D = m93533D();
        if (D != null && (D instanceof C39718e)) {
            C39718e eVar = (C39718e) D;
            C37833c cVar = C37833c.f90838a;
            eVar.mo93447A(C34646b.m101752f(cVar.mo91157s(), (Context) null, 1, (Object) null));
            eVar.mo93448B(C34646b.m101752f(cVar.mo91158t(), (Context) null, 1, (Object) null));
        }
    }

    /* renamed from: z */
    public C39491a mo71904z(C33702d.C33703a aVar) {
        return C31481m.C31483b.m93532a(this, aVar);
    }
}
