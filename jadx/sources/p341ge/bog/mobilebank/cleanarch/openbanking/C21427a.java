package p341ge.bog.mobilebank.cleanarch.openbanking;

import a81.C30772sa;
import android.content.Context;
import j00.C25285c;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cleanarch.openbanking.a */
public abstract class C21427a extends C30772sa {

    /* renamed from: F */
    private boolean f57293F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.openbanking.a$a */
    class C21428a implements C0001b {
        C21428a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21427a.this.mo37460R0();
        }
    }

    C21427a() {
        m69254O0();
    }

    /* renamed from: O0 */
    private void m69254O0() {
        addOnContextAvailableListener(new C21428a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f57293F) {
            this.f57293F = true;
            ((C25285c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32511t((OpenBankingAuthActivity) C18157e.m62250a(this));
        }
    }
}
