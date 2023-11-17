package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30696n;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.o */
public abstract class C35451o extends C30772sa {

    /* renamed from: F */
    private boolean f85731F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.o$a */
    class C35452a implements C0001b {
        C35452a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35451o.this.mo37460R0();
        }
    }

    C35451o() {
        m105214O0();
    }

    /* renamed from: O0 */
    private void m105214O0() {
        addOnContextAvailableListener(new C35452a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85731F) {
            this.f85731F = true;
            ((C30696n) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32431T((CashCoverLoanActivity) C18157e.m62250a(this));
        }
    }
}
