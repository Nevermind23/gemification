package p341ge.bog.mobilebank.products.presentation.details.pension;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import uz0.C39185g;

/* renamed from: ge.bog.mobilebank.products.presentation.details.pension.a */
public abstract class C34261a extends C30772sa {

    /* renamed from: F */
    private boolean f83143F = false;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.pension.a$a */
    class C34262a implements C0001b {
        C34262a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34261a.this.mo37460R0();
        }
    }

    C34261a() {
        m100766O0();
    }

    /* renamed from: O0 */
    private void m100766O0() {
        addOnContextAvailableListener(new C34262a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f83143F) {
            this.f83143F = true;
            ((C39185g) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32452a0((PensionDetailsActivity) C18157e.m62250a(this));
        }
    }
}
