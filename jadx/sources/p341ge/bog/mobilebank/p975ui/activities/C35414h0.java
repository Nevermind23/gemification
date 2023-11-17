package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30529aa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.h0 */
abstract class C35414h0 extends C35388f2 {

    /* renamed from: F */
    private boolean f85700F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.h0$a */
    class C35415a implements C0001b {
        C35415a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35414h0.this.mo37460R0();
        }
    }

    C35414h0() {
        m105146O0();
    }

    /* renamed from: O0 */
    private void m105146O0() {
        addOnContextAvailableListener(new C35415a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85700F) {
            this.f85700F = true;
            ((C30529aa) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32520w0((RateChartLandscapeActivity) C18157e.m62250a(this));
        }
    }
}
