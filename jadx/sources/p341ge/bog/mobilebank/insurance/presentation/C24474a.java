package p341ge.bog.mobilebank.insurance.presentation;

import a81.C30772sa;
import android.content.Context;
import nl0.C26546c;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.insurance.presentation.a */
public abstract class C24474a extends C30772sa {

    /* renamed from: F */
    private boolean f63164F = false;

    /* renamed from: ge.bog.mobilebank.insurance.presentation.a$a */
    class C24475a implements C0001b {
        C24475a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C24474a.this.mo37460R0();
        }
    }

    C24474a() {
        m78716O0();
    }

    /* renamed from: O0 */
    private void m78716O0() {
        addOnContextAvailableListener(new C24475a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f63164F) {
            this.f63164F = true;
            ((C26546c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32485k0((InsurancePolicesActivity) C18157e.m62250a(this));
        }
    }
}
