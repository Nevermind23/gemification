package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import p846nz.C26654m;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.a */
public abstract class C21286a extends C30772sa {

    /* renamed from: F */
    private boolean f57109F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.a$a */
    class C21287a implements C0001b {
        C21287a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21286a.this.mo37460R0();
        }
    }

    C21286a() {
        m68952O0();
    }

    /* renamed from: O0 */
    private void m68952O0() {
        addOnContextAvailableListener(new C21287a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f57109F) {
            this.f57109F = true;
            ((C26654m) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32401J((MoneyTransferProviderListActivity) C18157e.m62250a(this));
        }
    }
}
