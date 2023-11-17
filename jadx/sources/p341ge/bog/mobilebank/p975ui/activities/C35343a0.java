package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30860z7;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.a0 */
abstract class C35343a0 extends C30772sa {

    /* renamed from: F */
    private boolean f85618F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.a0$a */
    class C35344a implements C0001b {
        C35344a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35343a0.this.mo37460R0();
        }
    }

    C35343a0() {
        m104947O0();
    }

    /* renamed from: O0 */
    private void m104947O0() {
        addOnContextAvailableListener(new C35344a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85618F) {
            this.f85618F = true;
            ((C30860z7) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32434U((OperationDetailsActivity) C18157e.m62250a(this));
        }
    }
}
