package p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities;

import a81.C30772sa;
import android.content.Context;
import mf0.C26202d;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.a */
public abstract class C23441a extends C30772sa {

    /* renamed from: F */
    private boolean f61290F = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.exchange.activities.a$a */
    class C23442a implements C0001b {
        C23442a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23441a.this.mo37460R0();
        }
    }

    C23441a() {
        m75869O0();
    }

    /* renamed from: O0 */
    private void m75869O0() {
        addOnContextAvailableListener(new C23442a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f61290F) {
            this.f61290F = true;
            ((C26202d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32435U0((GTMoneyExchangeActivity) C18157e.m62250a(this));
        }
    }
}
