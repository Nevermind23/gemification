package p341ge.bog.mobilebank.products.presentation.cardinsurance.activity;

import a81.C30772sa;
import android.content.Context;
import cz0.C31508h;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.a */
public abstract class C33880a extends C30772sa {

    /* renamed from: F */
    private boolean f82479F = false;

    /* renamed from: ge.bog.mobilebank.products.presentation.cardinsurance.activity.a$a */
    class C33881a implements C0001b {
        C33881a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33880a.this.mo37460R0();
        }
    }

    C33880a() {
        m99633O0();
    }

    /* renamed from: O0 */
    private void m99633O0() {
        addOnContextAvailableListener(new C33881a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f82479F) {
            this.f82479F = true;
            ((C31508h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32477h1((CardInsuranceDetailsActivity) C18157e.m62250a(this));
        }
    }
}
