package p341ge.bog.mobilebank.qrwithdrawal.presentation;

import a81.C30772sa;
import android.content.Context;
import o01.C37574j;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.a */
public abstract class C34397a extends C30772sa {

    /* renamed from: F */
    private boolean f83355F = false;

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.a$a */
    class C34398a implements C0001b {
        C34398a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34397a.this.mo37460R0();
        }
    }

    C34397a() {
        m101114O0();
    }

    /* renamed from: O0 */
    private void m101114O0() {
        addOnContextAvailableListener(new C34398a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f83355F) {
            this.f83355F = true;
            ((C37574j) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32414N0((QrWithdrawalActivity) C18157e.m62250a(this));
        }
    }
}
