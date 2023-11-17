package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro;

import android.content.Context;
import bg0.C19380c;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import sf0.C28193b;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.b */
public abstract class C23609b extends C28193b {

    /* renamed from: H */
    private boolean f61593H = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.intro.b$a */
    class C23610a implements C0001b {
        C23610a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23609b.this.mo37460R0();
        }
    }

    C23609b() {
        m76338O0();
    }

    /* renamed from: O0 */
    private void m76338O0() {
        addOnContextAvailableListener(new C23610a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f61593H) {
            this.f61593H = true;
            ((C19380c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32469f((GTOnboardingIntroActivity) C18157e.m62250a(this));
        }
    }
}
