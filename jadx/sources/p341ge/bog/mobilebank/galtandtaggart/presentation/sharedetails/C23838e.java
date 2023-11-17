package p341ge.bog.mobilebank.galtandtaggart.presentation.sharedetails;

import a81.C30772sa;
import android.content.Context;
import lg0.C26005v;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.e */
public abstract class C23838e extends C30772sa {

    /* renamed from: F */
    private boolean f61992F = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.sharedetails.e$a */
    class C23839a implements C0001b {
        C23839a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23838e.this.mo37460R0();
        }
    }

    C23838e() {
        m76983O0();
    }

    /* renamed from: O0 */
    private void m76983O0() {
        addOnContextAvailableListener(new C23839a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f61992F) {
            this.f61992F = true;
            ((C26005v) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32492m1((GTShareDetailsActivity) C18157e.m62250a(this));
        }
    }
}
