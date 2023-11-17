package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30616h;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.n */
abstract class C35445n extends C30772sa {

    /* renamed from: F */
    private boolean f85726F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.n$a */
    class C35446a implements C0001b {
        C35446a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35445n.this.mo37460R0();
        }
    }

    C35445n() {
        m105204O0();
    }

    /* renamed from: O0 */
    private void m105204O0() {
        addOnContextAvailableListener(new C35446a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85726F) {
            this.f85726F = true;
            ((C30616h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32448Y1((CarTemplateGroupActivity) C18157e.m62250a(this));
        }
    }
}
