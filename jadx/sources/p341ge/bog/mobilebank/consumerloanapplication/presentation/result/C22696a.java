package p341ge.bog.mobilebank.consumerloanapplication.presentation.result;

import a81.C30772sa;
import android.content.Context;
import k90.C25687b;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.a */
public abstract class C22696a extends C30772sa {

    /* renamed from: F */
    private boolean f59911F = false;

    /* renamed from: ge.bog.mobilebank.consumerloanapplication.presentation.result.a$a */
    class C22697a implements C0001b {
        C22697a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22696a.this.mo37460R0();
        }
    }

    C22696a() {
        m73545O0();
    }

    /* renamed from: O0 */
    private void m73545O0() {
        addOnContextAvailableListener(new C22697a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f59911F) {
            this.f59911F = true;
            ((C25687b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32505r((LimitResultActivity) C18157e.m62250a(this));
        }
    }
}
