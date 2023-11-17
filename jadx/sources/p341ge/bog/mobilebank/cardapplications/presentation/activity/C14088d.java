package p341ge.bog.mobilebank.cardapplications.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p593rm.C17652d0;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.d */
public abstract class C14088d extends C30772sa {

    /* renamed from: F */
    private boolean f41490F = false;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.d$a */
    class C14089a implements C0001b {
        C14089a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14088d.this.mo37460R0();
        }
    }

    C14088d() {
        m52241O0();
    }

    /* renamed from: O0 */
    private void m52241O0() {
        addOnContextAvailableListener(new C14089a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41490F) {
            this.f41490F = true;
            ((C17652d0) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32512t1((OrderDebitCardActivity) C18157e.m62250a(this));
        }
    }
}
