package p341ge.bog.mobilebank.deposits.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.deposits.presentation.activity.x */
public abstract class C23178x extends C30772sa {

    /* renamed from: F */
    private boolean f60697F = false;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.x$a */
    class C23179a implements C0001b {
        C23179a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23178x.this.mo37460R0();
        }
    }

    C23178x() {
        m74951O0();
    }

    /* renamed from: O0 */
    private void m74951O0() {
        addOnContextAvailableListener(new C23179a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f60697F) {
            this.f60697F = true;
            ((C23174u) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32397H1((DepositDetailsActivity) C18157e.m62250a(this));
        }
    }
}
