package p341ge.bog.mobilebank.loanactivation.presentation.activation;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import zp0.C40242c;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.a */
public abstract class C32400a extends C30772sa {

    /* renamed from: F */
    private boolean f79856F = false;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.a$a */
    class C32401a implements C0001b {
        C32401a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32400a.this.mo37460R0();
        }
    }

    C32400a() {
        m95683O0();
    }

    /* renamed from: O0 */
    private void m95683O0() {
        addOnContextAvailableListener(new C32401a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f79856F) {
            this.f79856F = true;
            ((C40242c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32439V1((LoanActivationActivity) C18157e.m62250a(this));
        }
    }
}
