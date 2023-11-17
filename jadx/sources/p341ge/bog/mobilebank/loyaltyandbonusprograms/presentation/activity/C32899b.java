package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import dt0.C31596l;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.b */
public abstract class C32899b extends C30772sa {

    /* renamed from: F */
    private boolean f80752F = false;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.b$a */
    class C32900a implements C0001b {
        C32900a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32899b.this.mo37460R0();
        }
    }

    C32899b() {
        m97090O0();
    }

    /* renamed from: O0 */
    private void m97090O0() {
        addOnContextAvailableListener(new C32900a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f80752F) {
            this.f80752F = true;
            ((C31596l) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32410M((CreateCasActivity) C18157e.m62250a(this));
        }
    }
}
