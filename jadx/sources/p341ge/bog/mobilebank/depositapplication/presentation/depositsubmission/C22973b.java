package p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission;

import a81.C30772sa;
import android.content.Context;
import eb0.C20204k;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.b */
public abstract class C22973b extends C30772sa {

    /* renamed from: F */
    private boolean f60409F = false;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.b$a */
    class C22974a implements C0001b {
        C22974a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22973b.this.mo37460R0();
        }
    }

    C22973b() {
        m74473O0();
    }

    /* renamed from: O0 */
    private void m74473O0() {
        addOnContextAvailableListener(new C22974a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f60409F) {
            this.f60409F = true;
            ((C20204k) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32462c2((DepositApplicationSubmissionActivity) C18157e.m62250a(this));
        }
    }
}
