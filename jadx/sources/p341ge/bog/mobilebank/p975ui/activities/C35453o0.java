package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30721ob;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.o0 */
abstract class C35453o0 extends C30772sa {

    /* renamed from: F */
    private boolean f85733F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.o0$a */
    class C35454a implements C0001b {
        C35454a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35453o0.this.mo37460R0();
        }
    }

    C35453o0() {
        m105217O0();
    }

    /* renamed from: O0 */
    private void m105217O0() {
        addOnContextAvailableListener(new C35454a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85733F) {
            this.f85733F = true;
            ((C30721ob) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32490m((StatementActivity) C18157e.m62250a(this));
        }
    }
}
