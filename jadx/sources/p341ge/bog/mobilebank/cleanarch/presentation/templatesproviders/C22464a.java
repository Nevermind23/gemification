package p341ge.bog.mobilebank.cleanarch.presentation.templatesproviders;

import a81.C30772sa;
import android.content.Context;
import d60.C19922m;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.a */
public abstract class C22464a extends C30772sa {

    /* renamed from: F */
    private boolean f59445F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.templatesproviders.a$a */
    class C22465a implements C0001b {
        C22465a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22464a.this.mo37460R0();
        }
    }

    C22464a() {
        m72848O0();
    }

    /* renamed from: O0 */
    private void m72848O0() {
        addOnContextAvailableListener(new C22465a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f59445F) {
            this.f59445F = true;
            ((C19922m) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32408L0((TemplatesAndProvidersActivity) C18157e.m62250a(this));
        }
    }
}
