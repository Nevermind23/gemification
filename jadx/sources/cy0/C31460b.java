package cy0;

import cy0.C31457a;
import dy0.C31618a;
import ey0.C31877a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import lx0.C37177b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import vx0.C39491a;
import vx0.C39492b;
import wx0.C39711c;
import yx0.C40087b;

/* renamed from: cy0.b */
final class C31460b implements C31457a {

    /* renamed from: l */
    private final C31877a f78035l;

    public C31460b(C31877a aVar) {
        C41536l.m120489i(aVar, "baseFormManager");
        this.f78035l = aVar;
    }

    /* renamed from: D */
    private final C39491a m93452D(C33702d.C33703a aVar) {
        return mo71867z(aVar);
    }

    /* renamed from: E */
    private final List m93453E() {
        return C41341q.m119912o(m93452D(C33702d.C33703a.AMOUNT), m93452D(C33702d.C33703a.PACKAGES_SELECT));
    }

    /* renamed from: C */
    public C31877a mo71866t() {
        return this.f78035l;
    }

    /* renamed from: b */
    public void mo71858b(boolean z) {
        for (C39491a t : m93453E()) {
            t.mo93135t(z);
        }
    }

    public String getAmount() {
        String str;
        for (C39491a aVar : m93453E()) {
            if (aVar.mo93124i()) {
                if (aVar instanceof C39711c) {
                    str = aVar.mo93122g();
                } else if (aVar instanceof C40087b) {
                    str = aVar.mo93121f();
                } else {
                    str = "";
                }
                if (str == null) {
                    return "";
                }
                return str;
            }
        }
        return "";
    }

    /* renamed from: h */
    public C31618a mo71860h() {
        boolean z;
        for (C39491a aVar : m93453E()) {
            Object h = aVar.mo93123h();
            if (h instanceof String) {
                if (((CharSequence) h).length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return new C31618a(aVar.mo93120e(), aVar.mo93123h(), aVar.mo93124i());
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public void mo71861i(C39492b bVar) {
        C41536l.m120489i(bVar, "listener");
        for (C39491a o : m93453E()) {
            o.mo93130o(bVar);
        }
    }

    /* renamed from: k */
    public void mo71862k(C37177b bVar) {
        for (C39491a k : m93453E()) {
            k.mo93126k(bVar);
        }
    }

    /* renamed from: n */
    public void mo71863n(C39492b bVar) {
        C41536l.m120489i(bVar, "listener");
        for (C39491a a : m93453E()) {
            a.mo93116a(bVar);
        }
    }

    /* renamed from: z */
    public C39491a mo71867z(C33702d.C33703a aVar) {
        return C31457a.C31459b.m93451a(this, aVar);
    }
}
