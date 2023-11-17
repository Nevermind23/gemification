package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30692m8;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.b0 */
abstract class C35348b0 extends C30772sa {

    /* renamed from: F */
    private boolean f85622F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.b0$a */
    class C35349a implements C0001b {
        C35349a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35348b0.this.mo37460R0();
        }
    }

    C35348b0() {
        m104956O0();
    }

    /* renamed from: O0 */
    private void m104956O0() {
        addOnContextAvailableListener(new C35349a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85622F) {
            this.f85622F = true;
            ((C30692m8) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32427R1((ParametersActivity) C18157e.m62250a(this));
        }
    }
}
