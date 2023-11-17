package p341ge.bog.mobilebank.products.presentation.details.list;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import pz0.C38052b;

/* renamed from: ge.bog.mobilebank.products.presentation.details.list.a */
public abstract class C34212a extends C30772sa {

    /* renamed from: F */
    private boolean f83063F = false;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.a$a */
    class C34213a implements C0001b {
        C34213a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34212a.this.mo37460R0();
        }
    }

    C34212a() {
        m100646O0();
    }

    /* renamed from: O0 */
    private void m100646O0() {
        addOnContextAvailableListener(new C34213a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f83063F) {
            this.f83063F = true;
            ((C38052b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32446Y((LoanListActivity) C18157e.m62250a(this));
        }
    }
}
