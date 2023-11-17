package p341ge.bog.mobilebank.products.presentation.details.creditcard;

import a81.C30772sa;
import android.content.Context;
import mz0.C37318h;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.k */
public abstract class C34005k extends C30772sa {

    /* renamed from: F */
    private boolean f82702F = false;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.creditcard.k$a */
    class C34006a implements C0001b {
        C34006a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34005k.this.mo37460R0();
        }
    }

    C34005k() {
        m100023O0();
    }

    /* renamed from: O0 */
    private void m100023O0() {
        addOnContextAvailableListener(new C34006a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f82702F) {
            this.f82702F = true;
            ((C37318h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32500p0((CreditCardDetailsActivity) C18157e.m62250a(this));
        }
    }
}
