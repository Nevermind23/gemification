package p341ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import xg0.C29779m;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.b */
public abstract class C24009b extends C30772sa {

    /* renamed from: F */
    private boolean f62316F = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.watchlists.details.b$a */
    class C24010a implements C0001b {
        C24010a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C24009b.this.mo37460R0();
        }
    }

    C24009b() {
        m77448O0();
    }

    /* renamed from: O0 */
    private void m77448O0() {
        addOnContextAvailableListener(new C24010a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f62316F) {
            this.f62316F = true;
            ((C29779m) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32424Q1((GTWatchlistDetailsActivity) C18157e.m62250a(this));
        }
    }
}
