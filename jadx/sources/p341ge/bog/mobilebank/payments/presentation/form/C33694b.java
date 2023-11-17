package p341ge.bog.mobilebank.payments.presentation.form;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import ux0.C39158k;

/* renamed from: ge.bog.mobilebank.payments.presentation.form.b */
public abstract class C33694b extends C30772sa {

    /* renamed from: F */
    private boolean f82095F = false;

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.b$a */
    class C33695a implements C0001b {
        C33695a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33694b.this.mo37460R0();
        }
    }

    C33694b() {
        m99010O0();
    }

    /* renamed from: O0 */
    private void m99010O0() {
        addOnContextAvailableListener(new C33695a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f82095F) {
            this.f82095F = true;
            ((C39158k) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32429S0((FormActivity) C18157e.m62250a(this));
        }
    }
}
