package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30840y0;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.q */
abstract class C35475q extends C35388f2 {

    /* renamed from: F */
    private boolean f85768F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.q$a */
    class C35476a implements C0001b {
        C35476a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35475q.this.mo37460R0();
        }
    }

    C35475q() {
        m105338O0();
    }

    /* renamed from: O0 */
    private void m105338O0() {
        addOnContextAvailableListener(new C35476a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85768F) {
            this.f85768F = true;
            ((C30840y0) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32374A((DebugSettingsActivity) C18157e.m62250a(this));
        }
    }
}
