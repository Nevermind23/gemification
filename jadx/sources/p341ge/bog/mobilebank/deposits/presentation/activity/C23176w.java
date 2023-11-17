package p341ge.bog.mobilebank.deposits.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.deposits.presentation.activity.w */
public abstract class C23176w extends C30772sa {

    /* renamed from: F */
    private boolean f60695F = false;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.w$a */
    class C23177a implements C0001b {
        C23177a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23176w.this.mo37460R0();
        }
    }

    C23176w() {
        m74948O0();
    }

    /* renamed from: O0 */
    private void m74948O0() {
        addOnContextAvailableListener(new C23177a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f60695F) {
            this.f60695F = true;
            ((C23162i) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32518v1((BreakDepositActivity) C18157e.m62250a(this));
        }
    }
}
