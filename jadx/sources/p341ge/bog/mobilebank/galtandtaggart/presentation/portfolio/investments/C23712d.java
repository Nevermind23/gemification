package p341ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments;

import a81.C30772sa;
import android.content.Context;
import ig0.C25194b;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.d */
public abstract class C23712d extends C30772sa {

    /* renamed from: F */
    private boolean f61767F = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.portfolio.investments.d$a */
    class C23713a implements C0001b {
        C23713a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23712d.this.mo37460R0();
        }
    }

    C23712d() {
        m76595O0();
    }

    /* renamed from: O0 */
    private void m76595O0() {
        addOnContextAvailableListener(new C23713a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f61767F) {
            this.f61767F = true;
            ((C25194b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32509s0((GTMyInvestmentsActivity) C18157e.m62250a(this));
        }
    }
}
