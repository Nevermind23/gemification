package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30585ea;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.i0 */
abstract class C35419i0 extends C35388f2 {

    /* renamed from: F */
    private boolean f85704F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.i0$a */
    class C35420a implements C0001b {
        C35420a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35419i0.this.mo37460R0();
        }
    }

    C35419i0() {
        m105154O0();
    }

    /* renamed from: O0 */
    private void m105154O0() {
        addOnContextAvailableListener(new C35420a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85704F) {
            this.f85704F = true;
            ((C30585ea) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32483j1((RenameAccountActivity) C18157e.m62250a(this));
        }
    }
}
