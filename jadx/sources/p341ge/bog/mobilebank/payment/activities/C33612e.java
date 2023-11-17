package p341ge.bog.mobilebank.payment.activities;

import a81.C30772sa;
import android.content.Context;
import mw0.C37285r;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.payment.activities.e */
abstract class C33612e extends C30772sa {

    /* renamed from: F */
    private boolean f81942F = false;

    /* renamed from: ge.bog.mobilebank.payment.activities.e$a */
    class C33613a implements C0001b {
        C33613a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33612e.this.mo37460R0();
        }
    }

    C33612e() {
        m98680O0();
    }

    /* renamed from: O0 */
    private void m98680O0() {
        addOnContextAvailableListener(new C33613a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f81942F) {
            this.f81942F = true;
            ((C37285r) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32508s((PaymentFormActivity) C18157e.m62250a(this));
        }
    }
}
