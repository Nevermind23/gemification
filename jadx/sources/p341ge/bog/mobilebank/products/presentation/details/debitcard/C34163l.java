package p341ge.bog.mobilebank.products.presentation.details.debitcard;

import a81.C30772sa;
import android.content.Context;
import nz0.C37529i;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.l */
public abstract class C34163l extends C30772sa {

    /* renamed from: F */
    private boolean f82990F = false;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.l$a */
    class C34164a implements C0001b {
        C34164a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34163l.this.mo37460R0();
        }
    }

    C34163l() {
        m100543O0();
    }

    /* renamed from: O0 */
    private void m100543O0() {
        addOnContextAvailableListener(new C34164a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f82990F) {
            this.f82990F = true;
            ((C37529i) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32529z0((DebitCardDetailsActivity) C18157e.m62250a(this));
        }
    }
}
