package p341ge.bog.mobilebank.bnpl.presentation.welcome;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p382cm.C10506b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.a */
public abstract class C13926a extends C30772sa {

    /* renamed from: F */
    private boolean f41290F = false;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.welcome.a$a */
    class C13927a implements C0001b {
        C13927a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C13926a.this.mo37460R0();
        }
    }

    C13926a() {
        m51870O0();
    }

    /* renamed from: O0 */
    private void m51870O0() {
        addOnContextAvailableListener(new C13927a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41290F) {
            this.f41290F = true;
            ((C10506b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo27227z1((BnplWelcomeActivity) C18157e.m62250a(this));
        }
    }
}
