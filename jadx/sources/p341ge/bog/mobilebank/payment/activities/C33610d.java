package p341ge.bog.mobilebank.payment.activities;

import a81.C30772sa;
import android.content.Context;
import mw0.C37280m;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.payment.activities.d */
abstract class C33610d extends C30772sa {

    /* renamed from: F */
    private boolean f81940F = false;

    /* renamed from: ge.bog.mobilebank.payment.activities.d$a */
    class C33611a implements C0001b {
        C33611a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33610d.this.mo37460R0();
        }
    }

    C33610d() {
        m98677O0();
    }

    /* renamed from: O0 */
    private void m98677O0() {
        addOnContextAvailableListener(new C33611a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f81940F) {
            this.f81940F = true;
            ((C37280m) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32387E1((DDTransparentLoaderActivity) C18157e.m62250a(this));
        }
    }
}
