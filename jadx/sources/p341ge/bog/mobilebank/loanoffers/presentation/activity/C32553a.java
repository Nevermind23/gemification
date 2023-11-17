package p341ge.bog.mobilebank.loanoffers.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.a */
public abstract class C32553a extends C30772sa {

    /* renamed from: F */
    private boolean f80180F = false;

    /* renamed from: ge.bog.mobilebank.loanoffers.presentation.activity.a$a */
    class C32554a implements C0001b {
        C32554a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32553a.this.mo37460R0();
        }
    }

    C32553a() {
        m96215O0();
    }

    /* renamed from: O0 */
    private void m96215O0() {
        addOnContextAvailableListener(new C32554a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f80180F) {
            this.f80180F = true;
            ((C32566m) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32375A0((SecuredLoanActivity) C18157e.m62250a(this));
        }
    }
}
