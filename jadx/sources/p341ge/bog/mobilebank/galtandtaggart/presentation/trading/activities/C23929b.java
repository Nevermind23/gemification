package p341ge.bog.mobilebank.galtandtaggart.presentation.trading.activities;

import a81.C30772sa;
import android.content.Context;
import ng0.C26493l;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.b */
public abstract class C23929b extends C30772sa {

    /* renamed from: F */
    private boolean f62164F = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.trading.activities.b$a */
    class C23930a implements C0001b {
        C23930a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23929b.this.mo37460R0();
        }
    }

    C23929b() {
        m77219O0();
    }

    /* renamed from: O0 */
    private void m77219O0() {
        addOnContextAvailableListener(new C23930a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f62164F) {
            this.f62164F = true;
            ((C26493l) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32445X1((GTShareTradeReviewActivity) C18157e.m62250a(this));
        }
    }
}
