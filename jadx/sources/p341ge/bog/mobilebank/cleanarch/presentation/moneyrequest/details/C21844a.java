package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import t20.C28301c;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.a */
public abstract class C21844a extends C30772sa {

    /* renamed from: F */
    private boolean f58243F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.details.a$a */
    class C21845a implements C0001b {
        C21845a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21844a.this.mo37460R0();
        }
    }

    C21844a() {
        m70759O0();
    }

    /* renamed from: O0 */
    private void m70759O0() {
        addOnContextAvailableListener(new C21845a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f58243F) {
            this.f58243F = true;
            ((C28301c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32398I((MoneyRequestDetailsActivity) C18157e.m62250a(this));
        }
    }
}
