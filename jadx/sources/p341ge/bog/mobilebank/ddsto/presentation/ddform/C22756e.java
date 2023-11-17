package p341ge.bog.mobilebank.ddsto.presentation.ddform;

import android.content.Context;
import ba0.C19358a;
import p000a.C0001b;
import p341ge.bog.mobilebank.payments.presentation.form.FormActivity;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.e */
public abstract class C22756e extends FormActivity {

    /* renamed from: U */
    private boolean f60043U = false;

    /* renamed from: ge.bog.mobilebank.ddsto.presentation.ddform.e$a */
    class C22757a implements C0001b {
        C22757a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22756e.this.mo37460R0();
        }
    }

    C22756e() {
        m73834O0();
    }

    /* renamed from: O0 */
    private void m73834O0() {
        addOnContextAvailableListener(new C22757a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f60043U) {
            this.f60043U = true;
            ((C19358a) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32506r0((DDFormActivity) C18157e.m62250a(this));
        }
    }
}
