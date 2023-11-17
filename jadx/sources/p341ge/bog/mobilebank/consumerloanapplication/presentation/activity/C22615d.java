package p341ge.bog.mobilebank.consumerloanapplication.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import z80.C30240b0;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.d */
public abstract class C22615d extends C30772sa {

    /* renamed from: F */
    private boolean f59723F = false;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.activity.d$a */
    class C22616a implements C0001b {
        C22616a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22615d.this.mo37460R0();
        }
    }

    C22615d() {
        m73286O0();
    }

    /* renamed from: O0 */
    private void m73286O0() {
        addOnContextAvailableListener(new C22616a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f59723F) {
            this.f59723F = true;
            ((C30240b0) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32454a2((ClientIncomesActivity) C18157e.m62250a(this));
        }
    }
}
