package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30677l6;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.v */
abstract class C35518v extends C30772sa {

    /* renamed from: F */
    private boolean f85835F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.v$a */
    class C35519a implements C0001b {
        C35519a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35518v.this.mo37460R0();
        }
    }

    C35518v() {
        m105463O0();
    }

    /* renamed from: O0 */
    private void m105463O0() {
        addOnContextAvailableListener(new C35519a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85835F) {
            this.f85835F = true;
            ((C30677l6) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32455b((ManageAccountsAndCardsActivity) C18157e.m62250a(this));
        }
    }
}
