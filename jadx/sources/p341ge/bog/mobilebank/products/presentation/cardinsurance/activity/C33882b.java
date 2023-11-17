package p341ge.bog.mobilebank.products.presentation.cardinsurance.activity;

import a81.C30772sa;
import android.content.Context;
import cz0.C31512l;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.b */
public abstract class C33882b extends C30772sa {

    /* renamed from: F */
    private boolean f82481F = false;

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.b$a */
    class C33883a implements C0001b {
        C33883a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33882b.this.mo37460R0();
        }
    }

    C33882b() {
        m99636O0();
    }

    /* renamed from: O0 */
    private void m99636O0() {
        addOnContextAvailableListener(new C33883a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f82481F) {
            this.f82481F = true;
            ((C31512l) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32416O((CardInsuranceStatusesActivity) C18157e.m62250a(this));
        }
    }
}
