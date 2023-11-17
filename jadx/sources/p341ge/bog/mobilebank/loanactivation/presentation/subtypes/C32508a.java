package p341ge.bog.mobilebank.loanactivation.presentation.subtypes;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import uq0.C39061b;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.a */
public abstract class C32508a extends C30772sa {

    /* renamed from: F */
    private boolean f80130F = false;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.subtypes.a$a */
    class C32509a implements C0001b {
        C32509a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32508a.this.mo37460R0();
        }
    }

    C32508a() {
        m96103O0();
    }

    /* renamed from: O0 */
    private void m96103O0() {
        addOnContextAvailableListener(new C32509a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f80130F) {
            this.f80130F = true;
            ((C39061b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32475h((LoanSubtypesActivity) C18157e.m62250a(this));
        }
    }
}
