package p341ge.bog.mobilebank.galtandtaggart.presentation.landing;

import a81.C30772sa;
import android.content.Context;
import of0.C26962h;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.e */
public abstract class C23496e extends C30772sa {

    /* renamed from: F */
    private boolean f61384F = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.e$a */
    class C23497a implements C0001b {
        C23497a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23496e.this.mo37460R0();
        }
    }

    C23496e() {
        m76028O0();
    }

    /* renamed from: O0 */
    private void m76028O0() {
        addOnContextAvailableListener(new C23497a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f61384F) {
            this.f61384F = true;
            ((C26962h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32514u0((GTActivity) C18157e.m62250a(this));
        }
    }
}
