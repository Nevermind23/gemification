package p341ge.bog.mobilebank.p975ui.activities.qrpay;

import android.content.Context;
import e81.C31689f;
import p000a.C0001b;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.qrpay.b */
abstract class C35489b extends C35388f2 {

    /* renamed from: F */
    private boolean f85813F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.b$a */
    class C35490a implements C0001b {
        C35490a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35489b.this.mo37460R0();
        }
    }

    C35489b() {
        m105414O0();
    }

    /* renamed from: O0 */
    private void m105414O0() {
        addOnContextAvailableListener(new C35490a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85813F) {
            this.f85813F = true;
            ((C31689f) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32457b1((QrPayCardSelectActivity) C18157e.m62250a(this));
        }
    }
}
