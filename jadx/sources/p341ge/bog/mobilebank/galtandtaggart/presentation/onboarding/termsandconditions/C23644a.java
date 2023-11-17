package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions;

import android.content.Context;
import fg0.C20477e;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import sf0.C28193b;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.a */
public abstract class C23644a extends C28193b {

    /* renamed from: H */
    private boolean f61664H = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.termsandconditions.a$a */
    class C23645a implements C0001b {
        C23645a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23644a.this.mo37460R0();
        }
    }

    C23644a() {
        m76447O0();
    }

    /* renamed from: O0 */
    private void m76447O0() {
        addOnContextAvailableListener(new C23645a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f61664H) {
            this.f61664H = true;
            ((C20477e) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32487l((TermsAndConditionsActivity) C18157e.m62250a(this));
        }
    }
}
