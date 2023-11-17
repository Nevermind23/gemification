package p341ge.bog.mobilebank.p975ui.activities.offers;

import a81.C30772sa;
import android.content.Context;
import c81.C31293f;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.offers.a */
public abstract class C35464a extends C30772sa {

    /* renamed from: F */
    private boolean f85760F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.offers.a$a */
    class C35465a implements C0001b {
        C35465a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35464a.this.mo37460R0();
        }
    }

    C35464a() {
        m105313O0();
    }

    /* renamed from: O0 */
    private void m105313O0() {
        addOnContextAvailableListener(new C35465a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85760F) {
            this.f85760F = true;
            ((C31293f) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32484k((ExpressLoanDetailsActivity) C18157e.m62250a(this));
        }
    }
}
