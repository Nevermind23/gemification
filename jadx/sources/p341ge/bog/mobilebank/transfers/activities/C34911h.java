package p341ge.bog.mobilebank.transfers.activities;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import x61.C39801d0;

/* renamed from: ge.bog.mobilebank.transfers.activities.h */
abstract class C34911h extends C30772sa {

    /* renamed from: F */
    private boolean f84342F = false;

    /* renamed from: ge.bog.mobilebank.transfers.activities.h$a */
    class C34912a implements C0001b {
        C34912a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34911h.this.mo37460R0();
        }
    }

    C34911h() {
        m102718O0();
    }

    /* renamed from: O0 */
    private void m102718O0() {
        addOnContextAvailableListener(new C34912a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84342F) {
            this.f84342F = true;
            ((C39801d0) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32441W0((TransferLoaderActivity) C18157e.m62250a(this));
        }
    }
}
