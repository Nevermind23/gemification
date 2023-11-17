package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity;

import a81.C30772sa;
import android.content.Context;
import o20.C26702o;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.b */
public abstract class C21812b extends C30772sa {

    /* renamed from: F */
    private boolean f58191F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.b$a */
    class C21813a implements C0001b {
        C21813a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21812b.this.mo37460R0();
        }
    }

    C21812b() {
        m70679O0();
    }

    /* renamed from: O0 */
    private void m70679O0() {
        addOnContextAvailableListener(new C21813a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f58191F) {
            this.f58191F = true;
            ((C26702o) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32380C0((SelectBillSplitMoneyRequestActivity) C18157e.m62250a(this));
        }
    }
}
