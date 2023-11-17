package p341ge.bog.mobilebank.bnpl.presentation.offers.details;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import p701zl.C19066e;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.e */
public abstract class C13900e extends C30772sa {

    /* renamed from: F */
    private boolean f41241F = false;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.details.e$a */
    class C13901a implements C0001b {
        C13901a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C13900e.this.mo37460R0();
        }
    }

    C13900e() {
        m51795O0();
    }

    /* renamed from: O0 */
    private void m51795O0() {
        addOnContextAvailableListener(new C13901a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41241F) {
            this.f41241F = true;
            ((C19066e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32480i1((BnplOfferDetailsActivity) C18157e.m62250a(this));
        }
    }
}
