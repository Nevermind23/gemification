package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import dt0.C31599o;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.c */
public abstract class C32901c extends C30772sa {

    /* renamed from: F */
    private boolean f80754F = false;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.c$a */
    class C32902a implements C0001b {
        C32902a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32901c.this.mo37460R0();
        }
    }

    C32901c() {
        m97093O0();
    }

    /* renamed from: O0 */
    private void m97093O0() {
        addOnContextAvailableListener(new C32902a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f80754F) {
            this.f80754F = true;
            ((C31599o) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32421P1((CreatePiggyBankActivity) C18157e.m62250a(this));
        }
    }
}
