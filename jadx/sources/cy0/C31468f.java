package cy0;

import cy0.C31465e;
import ey0.C31877a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;
import wx0.C39722h;

/* renamed from: cy0.f */
final class C31468f implements C31465e {

    /* renamed from: l */
    private final C31877a f78041l;

    public C31468f(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78041l = aVar;
    }

    /* renamed from: D */
    private final C39491a m93479D() {
        return mo71878z(C33702d.C33703a.INPUT_MOBILE);
    }

    /* renamed from: E */
    private final C39491a m93480E() {
        return mo71878z(C33702d.C33703a.CONTACTS);
    }

    /* renamed from: C */
    public C31877a mo71866t() {
        return this.f78041l;
    }

    /* renamed from: p */
    public void mo71875p(boolean z) {
        String str;
        C39491a E = m93480E();
        if (E instanceof C39722h) {
            if (z) {
                C39722h hVar = (C39722h) E;
                C39491a D = m93479D();
                if (D == null || (str = D.mo93122g()) == null) {
                    str = "";
                }
                hVar.mo93453H(str);
            }
            ((C39722h) E).mo93137v(z);
        }
    }

    /* renamed from: z */
    public C39491a mo71878z(C33702d.C33703a aVar) {
        return C31465e.C31467b.m93478a(this, aVar);
    }
}
