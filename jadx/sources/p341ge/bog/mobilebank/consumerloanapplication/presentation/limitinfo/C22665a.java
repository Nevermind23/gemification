package p341ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo;

import a81.C30772sa;
import android.content.Context;
import d90.C19930c;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.a */
public abstract class C22665a extends C30772sa {

    /* renamed from: F */
    private boolean f59809F = false;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.a$a */
    class C22666a implements C0001b {
        C22666a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22665a.this.mo37460R0();
        }
    }

    C22665a() {
        m73422O0();
    }

    /* renamed from: O0 */
    private void m73422O0() {
        addOnContextAvailableListener(new C22666a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f59809F) {
            this.f59809F = true;
            ((C19930c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32444X0((ClientLimitInfoActivity) C18157e.m62250a(this));
        }
    }
}
