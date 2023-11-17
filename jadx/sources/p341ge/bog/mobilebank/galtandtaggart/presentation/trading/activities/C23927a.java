package p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities;

import a81.C30772sa;
import android.content.Context;
import ng0.C26491j;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.a */
public abstract class C23927a extends C30772sa {

    /* renamed from: F */
    private boolean f62162F = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.a$a */
    class C23928a implements C0001b {
        C23928a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23927a.this.mo37460R0();
        }
    }

    C23927a() {
        m77216O0();
    }

    /* renamed from: O0 */
    private void m77216O0() {
        addOnContextAvailableListener(new C23928a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f62162F) {
            this.f62162F = true;
            ((C26491j) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32433T1((GTShareTradeDetailsActivity) C18157e.m62250a(this));
        }
    }
}
