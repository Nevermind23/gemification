package p341ge.bog.mobilebank.p975ui.activities.qrpay;

import a81.C30772sa;
import android.content.Context;
import e81.C31686c;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.qrpay.a */
abstract class C35487a extends C30772sa {

    /* renamed from: F */
    private boolean f85811F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.a$a */
    class C35488a implements C0001b {
        C35488a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35487a.this.mo37460R0();
        }
    }

    C35487a() {
        m105411O0();
    }

    /* renamed from: O0 */
    private void m105411O0() {
        addOnContextAvailableListener(new C35488a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85811F) {
            this.f85811F = true;
            ((C31686c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32378B1((QrPayActivity) C18157e.m62250a(this));
        }
    }
}
