package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import p928vy.C29185c;

/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.a */
public abstract class C21133a extends C30772sa {

    /* renamed from: F */
    private boolean f56706F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.a$a */
    class C21134a implements C0001b {
        C21134a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C21133a.this.mo37460R0();
        }
    }

    C21133a() {
        m68377O0();
    }

    /* renamed from: O0 */
    private void m68377O0() {
        addOnContextAvailableListener(new C21134a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f56706F) {
            this.f56706F = true;
            ((C29185c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32464d0((LoyaltyListActivity) C18157e.m62250a(this));
        }
    }
}
