package p341ge.bog.mobilebank.deposits.presentation.prolongation;

import a81.C30772sa;
import android.content.Context;
import ic0.C25162b;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.a */
public abstract class C23245a extends C30772sa {

    /* renamed from: F */
    private boolean f60840F = false;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.prolongation.a$a */
    class C23246a implements C0001b {
        C23246a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23245a.this.mo37460R0();
        }
    }

    C23245a() {
        m75074O0();
    }

    /* renamed from: O0 */
    private void m75074O0() {
        addOnContextAvailableListener(new C23246a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f60840F) {
            this.f60840F = true;
            ((C25162b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32525y((DepositProlongationActivity) C18157e.m62250a(this));
        }
    }
}
