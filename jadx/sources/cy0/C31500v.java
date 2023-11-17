package cy0;

import b41.C31128a;
import cy0.C31497u;
import ey0.C31877a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;
import zx0.C40265a;

/* renamed from: cy0.v */
final class C31500v implements C31497u {

    /* renamed from: l */
    private final C31877a f78066l;

    public C31500v(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78066l = aVar;
    }

    /* renamed from: D */
    private final C39491a m93572D() {
        return mo71922z(C33702d.C33703a.TEMPLATE_LIST);
    }

    /* renamed from: C */
    public C31877a mo71866t() {
        return this.f78066l;
    }

    /* renamed from: a */
    public void mo71918a() {
        C39491a D = m93572D();
        if (D instanceof C40265a) {
            ((C40265a) D).mo93131p();
        }
    }

    /* renamed from: d */
    public void mo71919d(C31128a aVar) {
        C39491a D = m93572D();
        if (D instanceof C40265a) {
            ((C40265a) D).mo94287E(aVar);
        }
    }

    /* renamed from: z */
    public C39491a mo71922z(C33702d.C33703a aVar) {
        return C31497u.C31499b.m93571a(this, aVar);
    }
}
