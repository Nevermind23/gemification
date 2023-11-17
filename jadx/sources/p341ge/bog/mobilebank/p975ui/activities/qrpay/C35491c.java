package p341ge.bog.mobilebank.p975ui.activities.qrpay;

import a81.C30772sa;
import android.content.Context;
import e81.C31692i;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.qrpay.c */
abstract class C35491c extends C30772sa {

    /* renamed from: F */
    private boolean f85815F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.qrpay.c$a */
    class C35492a implements C0001b {
        C35492a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35491c.this.mo37460R0();
        }
    }

    C35491c() {
        m105417O0();
    }

    /* renamed from: O0 */
    private void m105417O0() {
        addOnContextAvailableListener(new C35492a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85815F) {
            this.f85815F = true;
            ((C31692i) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32402J0((QrPayResultActivity) C18157e.m62250a(this));
        }
    }
}
