package p341ge.bog.mobilebank.cardproducts.presentation.carddetail;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p566pn.C17413k0;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.m */
public abstract class C14378m extends C30772sa {

    /* renamed from: F */
    private boolean f42112F = false;

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.m$a */
    class C14379a implements C0001b {
        C14379a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14378m.this.mo37460R0();
        }
    }

    C14378m() {
        m53262O0();
    }

    /* renamed from: O0 */
    private void m53262O0() {
        addOnContextAvailableListener(new C14379a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f42112F) {
            this.f42112F = true;
            ((C17413k0) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32510s1((CardsDetailActivity) C18157e.m62250a(this));
        }
    }
}
