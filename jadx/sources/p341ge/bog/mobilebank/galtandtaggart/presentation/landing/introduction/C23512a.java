package p341ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import pf0.C27521b;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.a */
public abstract class C23512a extends C30772sa {

    /* renamed from: F */
    private boolean f61413F = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.a$a */
    class C23513a implements C0001b {
        C23513a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23512a.this.mo37460R0();
        }
    }

    C23512a() {
        m76072O0();
    }

    /* renamed from: O0 */
    private void m76072O0() {
        addOnContextAvailableListener(new C23513a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f61413F) {
            this.f61413F = true;
            ((C27521b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32460c0((GTIntroductionActivity) C18157e.m62250a(this));
        }
    }
}
