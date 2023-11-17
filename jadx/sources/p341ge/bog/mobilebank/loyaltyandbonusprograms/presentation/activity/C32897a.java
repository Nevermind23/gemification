package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import dt0.C31587c;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.a */
public abstract class C32897a extends C30772sa {

    /* renamed from: F */
    private boolean f80750F = false;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.a$a */
    class C32898a implements C0001b {
        C32898a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32897a.this.mo37460R0();
        }
    }

    C32897a() {
        m97087O0();
    }

    /* renamed from: O0 */
    private void m97087O0() {
        addOnContextAvailableListener(new C32898a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f80750F) {
            this.f80750F = true;
            ((C31587c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32407L((CasDetailsActivity) C18157e.m62250a(this));
        }
    }
}
