package p341ge.bog.mobilebank.payments.presentation.formpage;

import android.content.Context;
import ey0.C31883d;
import p000a.C0001b;
import p341ge.bog.mobilebank.payments.presentation.form.FormActivity;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.payments.presentation.formpage.a */
public abstract class C33722a extends FormActivity {

    /* renamed from: U */
    private boolean f82150U = false;

    /* renamed from: ge.bog.mobilebank.payments.presentation.formpage.a$a */
    class C33723a implements C0001b {
        C33723a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33722a.this.mo37460R0();
        }
    }

    C33722a() {
        m99115O0();
    }

    /* renamed from: O0 */
    private void m99115O0() {
        addOnContextAvailableListener(new C33723a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f82150U) {
            this.f82150U = true;
            ((C31883d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32419P((PaymentFormActivity) C18157e.m62250a(this));
        }
    }
}
