package p341ge.bog.mobilebank.bnpl.presentation.details;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import p659wl.C18615e;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.j */
public abstract class C13874j extends C30772sa {

    /* renamed from: F */
    private boolean f41189F = false;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.j$a */
    class C13875a implements C0001b {
        C13875a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C13874j.this.mo37460R0();
        }
    }

    C13874j() {
        m51700O0();
    }

    /* renamed from: O0 */
    private void m51700O0() {
        addOnContextAvailableListener(new C13875a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41189F) {
            this.f41189F = true;
            ((C18615e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32438V0((BnplDetailsActivity) C18157e.m62250a(this));
        }
    }
}
