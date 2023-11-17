package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30773sb;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.p0 */
abstract class C35471p0 extends C30772sa {

    /* renamed from: F */
    private boolean f85766F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.p0$a */
    class C35472a implements C0001b {
        C35472a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35471p0.this.mo37460R0();
        }
    }

    C35471p0() {
        m105323O0();
    }

    /* renamed from: O0 */
    private void m105323O0() {
        addOnContextAvailableListener(new C35472a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85766F) {
            this.f85766F = true;
            ((C30773sb) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32458b2((ThreeDSecurityActivity) C18157e.m62250a(this));
        }
    }
}
