package cy0;

import cy0.C31461c;
import ey0.C31877a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;
import xx0.C39921b;

/* renamed from: cy0.d */
final class C31464d implements C31461c {

    /* renamed from: l */
    private final C31877a f78038l;

    public C31464d(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78038l = aVar;
    }

    /* renamed from: D */
    private final C39491a m93468D() {
        return mo71874z(C33702d.C33703a.CARD_CHOOSER);
    }

    /* renamed from: C */
    public C31877a mo71866t() {
        return this.f78038l;
    }

    /* renamed from: b */
    public void mo71868b(boolean z) {
        C39491a D = m93468D();
        if (D != null) {
            D.mo93135t(z);
        }
    }

    /* renamed from: r */
    public void mo71869r(boolean z) {
        C39491a D = m93468D();
        if (D instanceof C39921b) {
            ((C39921b) D).mo93649F(z);
        }
    }

    /* renamed from: s */
    public void mo71870s(List list) {
        C41536l.m120489i(list, "paymentCards");
        C39491a D = m93468D();
        if (D instanceof C39921b) {
            ((C39921b) D).mo93650G(list);
        }
    }

    /* renamed from: w */
    public void mo71871w(long j) {
        C39491a D = m93468D();
        if (D instanceof C39921b) {
            ((C39921b) D).mo93136u(String.valueOf(j));
        }
    }

    /* renamed from: z */
    public C39491a mo71874z(C33702d.C33703a aVar) {
        return C31461c.C31463b.m93467a(this, aVar);
    }
}
