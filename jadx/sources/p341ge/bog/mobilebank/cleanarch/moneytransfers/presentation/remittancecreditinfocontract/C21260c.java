package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import p836mz.C26324j;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.c */
public abstract class C21260c extends C30772sa {

    /* renamed from: F */
    private boolean f57061F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.c$a */
    class C21261a implements C0001b {
        C21261a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21260c.this.mo37460R0();
        }
    }

    C21260c() {
        m68868O0();
    }

    /* renamed from: O0 */
    private void m68868O0() {
        addOnContextAvailableListener(new C21261a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f57061F) {
            this.f57061F = true;
            ((C26324j) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32524x1((RemittanceCreditInfoContractActivity) C18157e.m62250a(this));
        }
    }
}
