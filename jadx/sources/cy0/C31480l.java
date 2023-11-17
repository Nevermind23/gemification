package cy0;

import androidx.activity.result.C0173b;
import cy0.C31477k;
import ey0.C31877a;
import g91.C32289b0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import s31.C38421a;
import vx0.C39491a;
import wx0.C39737p;

/* renamed from: cy0.l */
final class C31480l implements C31477k {

    /* renamed from: l */
    private final C31877a f78051l;

    public C31480l(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78051l = aVar;
    }

    /* renamed from: D */
    private final C39491a m93522D() {
        return mo71900z(C33702d.C33703a.INPUT_MOBILE);
    }

    /* renamed from: C */
    public C31877a mo71866t() {
        return this.f78051l;
    }

    /* renamed from: e */
    public void mo71894e(boolean z) {
        C39491a D = m93522D();
        if (D instanceof C39737p) {
            ((C39737p) D).mo93477b0(z);
        }
    }

    /* renamed from: f */
    public void mo71895f(C0173b bVar, C38421a aVar) {
        String str;
        C41536l.m120489i(bVar, "requestPermissionLauncher");
        C41536l.m120489i(aVar, "config");
        C39491a D = m93522D();
        if (D instanceof C39737p) {
            C39737p pVar = (C39737p) D;
            pVar.mo93479d0(bVar);
            pVar.mo93475R(false);
            String b = aVar.mo91948b();
            if (b != null) {
                str = C32289b0.m95091c(b);
            } else {
                str = null;
            }
            pVar.mo93478c0(str);
        }
    }

    /* renamed from: g */
    public void mo71896g() {
        C39491a D = m93522D();
        if (D instanceof C39737p) {
            ((C39737p) D).mo93480e0();
        }
    }

    /* renamed from: v */
    public void mo71897v() {
        C39491a D = m93522D();
        if (D instanceof C39737p) {
            ((C39737p) D).mo93481h0();
        }
    }

    /* renamed from: z */
    public C39491a mo71900z(C33702d.C33703a aVar) {
        return C31477k.C31479b.m93521a(this, aVar);
    }
}
