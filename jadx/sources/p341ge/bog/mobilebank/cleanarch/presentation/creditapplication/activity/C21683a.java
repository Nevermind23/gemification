package p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import x10.C29625h;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.a */
public abstract class C21683a extends C30772sa {

    /* renamed from: F */
    private boolean f57830F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.a$a */
    class C21684a implements C0001b {
        C21684a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21683a.this.mo37460R0();
        }
    }

    C21683a() {
        m70122O0();
    }

    /* renamed from: O0 */
    private void m70122O0() {
        addOnContextAvailableListener(new C21684a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f57830F) {
            this.f57830F = true;
            ((C29625h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32467e0((CreditOfferApplicationActivity) C18157e.m62250a(this));
        }
    }
}
