package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import dt0.C31604t;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.d */
public abstract class C32903d extends C30772sa {

    /* renamed from: F */
    private boolean f80756F = false;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.d$a */
    class C32904a implements C0001b {
        C32904a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32903d.this.mo37460R0();
        }
    }

    C32903d() {
        m97096O0();
    }

    /* renamed from: O0 */
    private void m97096O0() {
        addOnContextAvailableListener(new C32904a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f80756F) {
            this.f80756F = true;
            ((C31604t) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32516v((PlusPointsTransferActivity) C18157e.m62250a(this));
        }
    }
}
