package p341ge.bog.mobilebank.payment.activities;

import android.content.Context;
import mw0.C37279l;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.payment.activities.c */
abstract class C33608c extends PaymentFormActivity {

    /* renamed from: T */
    private boolean f81938T = false;

    /* renamed from: ge.bog.mobilebank.payment.activities.c$a */
    class C33609a implements C0001b {
        C33609a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33608c.this.mo37460R0();
        }
    }

    C33608c() {
        m98674O0();
    }

    /* renamed from: O0 */
    private void m98674O0() {
        addOnContextAvailableListener(new C33609a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f81938T) {
            this.f81938T = true;
            ((C37279l) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32504q1((DDFormActivity) C18157e.m62250a(this));
        }
    }
}
