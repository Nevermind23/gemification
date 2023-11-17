package p341ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import qg0.C27798e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.b */
public abstract class C23961b extends C30772sa {

    /* renamed from: F */
    private boolean f62221F = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.transactions.detail.b$a */
    class C23962a implements C0001b {
        C23962a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23961b.this.mo37460R0();
        }
    }

    C23961b() {
        m77303O0();
    }

    /* renamed from: O0 */
    private void m77303O0() {
        addOnContextAvailableListener(new C23962a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f62221F) {
            this.f62221F = true;
            ((C27798e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32473g0((GTTransactionDetailActivity) C18157e.m62250a(this));
        }
    }
}
