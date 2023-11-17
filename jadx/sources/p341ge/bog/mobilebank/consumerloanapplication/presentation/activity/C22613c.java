package p341ge.bog.mobilebank.consumerloanapplication.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import z80.C30258s;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.c */
public abstract class C22613c extends C30772sa {

    /* renamed from: F */
    private boolean f59721F = false;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.c$a */
    class C22614a implements C0001b {
        C22614a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22613c.this.mo37460R0();
        }
    }

    C22613c() {
        m73283O0();
    }

    /* renamed from: O0 */
    private void m73283O0() {
        addOnContextAvailableListener(new C22614a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f59721F) {
            this.f59721F = true;
            ((C30258s) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32415N1((ClaFirstStageActivity) C18157e.m62250a(this));
        }
    }
}
