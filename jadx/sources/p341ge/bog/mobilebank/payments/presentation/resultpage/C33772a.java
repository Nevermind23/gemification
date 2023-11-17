package p341ge.bog.mobilebank.payments.presentation.resultpage;

import a81.C30772sa;
import android.content.Context;
import fy0.C32034h;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.a */
public abstract class C33772a extends C30772sa {

    /* renamed from: F */
    private boolean f82254F = false;

    /* renamed from: ge.bog.mobilebank.payments.presentation.resultpage.a$a */
    class C33773a implements C0001b {
        C33773a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33772a.this.mo37460R0();
        }
    }

    C33772a() {
        m99323O0();
    }

    /* renamed from: O0 */
    private void m99323O0() {
        addOnContextAvailableListener(new C33773a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f82254F) {
            this.f82254F = true;
            ((C32034h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32425R((PaymentResultActivity) C18157e.m62250a(this));
        }
    }
}
