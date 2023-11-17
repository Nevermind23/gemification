package p341ge.bog.mobilebank.cardapplications.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p593rm.C17663n;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.b */
public abstract class C14084b extends C30772sa {

    /* renamed from: F */
    private boolean f41486F = false;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.b$a */
    class C14085a implements C0001b {
        C14085a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14084b.this.mo37460R0();
        }
    }

    C14084b() {
        m52235O0();
    }

    /* renamed from: O0 */
    private void m52235O0() {
        addOnContextAvailableListener(new C14085a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41486F) {
            this.f41486F = true;
            ((C17663n) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32437V((CardOrderListActivity) C18157e.m62250a(this));
        }
    }
}
