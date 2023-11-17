package p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.b */
public abstract class C21393b extends C30772sa {

    /* renamed from: F */
    private boolean f57233F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.b$a */
    class C21394a implements C0001b {
        C21394a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21393b.this.mo37460R0();
        }
    }

    C21393b() {
        m69154O0();
    }

    /* renamed from: O0 */
    private void m69154O0() {
        addOnContextAvailableListener(new C21394a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f57233F) {
            this.f57233F = true;
            ((C21404l) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32395H((OffersAndApplicationsActivity) C18157e.m62250a(this));
        }
    }
}
