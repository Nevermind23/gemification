package p341ge.bog.mobilebank.loyaltyprogress.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import bu0.C31194h;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.a */
public abstract class C33168a extends C30772sa {

    /* renamed from: F */
    private boolean f81239F = false;

    /* renamed from: ge.bog.mobilebank.loyaltyprogress.presentation.activity.a$a */
    class C33169a implements C0001b {
        C33169a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33168a.this.mo37460R0();
        }
    }

    C33168a() {
        m97825O0();
    }

    /* renamed from: O0 */
    private void m97825O0() {
        addOnContextAvailableListener(new C33169a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f81239F) {
            this.f81239F = true;
            ((C31194h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32381C1((LoyaltyProgressActivity) C18157e.m62250a(this));
        }
    }
}
