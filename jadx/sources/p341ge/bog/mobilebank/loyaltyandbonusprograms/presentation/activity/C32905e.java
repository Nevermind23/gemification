package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity;

import android.content.Context;
import dt0.C31605u;
import p000a.C0001b;
import p341ge.bog.mobilebank.p975ui.wizard.activities.BasicWizardActivity;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.e */
public abstract class C32905e extends BasicWizardActivity {

    /* renamed from: l0 */
    private boolean f80758l0 = false;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.e$a */
    class C32906a implements C0001b {
        C32906a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C32905e.this.mo37460R0();
        }
    }

    C32905e() {
        m97099O0();
    }

    /* renamed from: O0 */
    private void m97099O0() {
        addOnContextAvailableListener(new C32906a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f80758l0) {
            this.f80758l0 = true;
            ((C31605u) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32459c((PlusPointsTransferWizardActivity) C18157e.m62250a(this));
        }
    }
}
