package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30643ic;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.t0 */
abstract class C35511t0 extends C30772sa {

    /* renamed from: F */
    private boolean f85830F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.t0$a */
    class C35512a implements C0001b {
        C35512a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35511t0.this.mo37460R0();
        }
    }

    C35511t0() {
        m105450O0();
    }

    /* renamed from: O0 */
    private void m105450O0() {
        addOnContextAvailableListener(new C35512a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85830F) {
            this.f85830F = true;
            ((C30643ic) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32423Q0((TransportPointExchangeSuccessActivity) C18157e.m62250a(this));
        }
    }
}
