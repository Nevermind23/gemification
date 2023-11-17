package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import sf0.C28193b;
import zf0.C30292b;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.a */
public abstract class C23578a extends C28193b {

    /* renamed from: H */
    private boolean f61539H = false;

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.identomat.result.a$a */
    class C23579a implements C0001b {
        C23579a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C23578a.this.mo37460R0();
        }
    }

    C23578a() {
        m76268O0();
    }

    /* renamed from: O0 */
    private void m76268O0() {
        addOnContextAvailableListener(new C23579a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f61539H) {
            this.f61539H = true;
            ((C30292b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32522x((IdentomatResultActivity) C18157e.m62250a(this));
        }
    }
}
