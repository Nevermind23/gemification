package p341ge.bog.mobilebank.transfers.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import x61.C39802e;

/* renamed from: ge.bog.mobilebank.transfers.activities.b */
abstract class C34882b extends OtherTransferDetailsActivity {

    /* renamed from: o1 */
    private boolean f84264o1 = false;

    /* renamed from: ge.bog.mobilebank.transfers.activities.b$a */
    class C34883a implements C0001b {
        C34883a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34882b.this.mo37460R0();
        }
    }

    C34882b() {
        m102631O0();
    }

    /* renamed from: O0 */
    private void m102631O0() {
        addOnContextAvailableListener(new C34883a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84264o1) {
            this.f84264o1 = true;
            ((C39802e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32442W1((OtherTemplateDetailsActivity) C18157e.m62250a(this));
        }
    }
}
