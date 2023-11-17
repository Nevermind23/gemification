package p341ge.bog.mobilebank.p975ui.activities.qrpay;

import android.content.Context;
import e81.C31695l;
import p000a.C0001b;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.qrpay.d */
abstract class C35493d extends C35388f2 {

    /* renamed from: F */
    private boolean f85817F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.d$a */
    class C35494a implements C0001b {
        C35494a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35493d.this.mo37460R0();
        }
    }

    C35493d() {
        m105420O0();
    }

    /* renamed from: O0 */
    private void m105420O0() {
        addOnContextAvailableListener(new C35494a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85817F) {
            this.f85817F = true;
            ((C31695l) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32384D1((QrPayReversalActivity) C18157e.m62250a(this));
        }
    }
}
