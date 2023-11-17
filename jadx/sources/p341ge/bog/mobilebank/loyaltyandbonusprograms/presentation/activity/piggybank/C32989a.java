package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank;

import a81.C30772sa;
import android.content.Context;
import ft0.C32007c;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.a */
public abstract class C32989a extends C30772sa {

    /* renamed from: F */
    private boolean f80864F = false;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.a$a */
    class C32990a implements C0001b {
        C32990a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32989a.this.mo37460R0();
        }
    }

    C32989a() {
        m97296O0();
    }

    /* renamed from: O0 */
    private void m97296O0() {
        addOnContextAvailableListener(new C32990a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f80864F) {
            this.f80864F = true;
            ((C32007c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32493n((PiggyBankDetailsActivity) C18157e.m62250a(this));
        }
    }
}
