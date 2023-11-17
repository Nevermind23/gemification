package p341ge.bog.mobilebank.products.presentation.details.list;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import pz0.C38056f;

/* renamed from: ge.bog.mobilebank.products.presentation.details.list.c */
public abstract class C34215c extends C30772sa {

    /* renamed from: F */
    private boolean f83068F = false;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.list.c$a */
    class C34216a implements C0001b {
        C34216a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34215c.this.mo37460R0();
        }
    }

    C34215c() {
        m100649O0();
    }

    /* renamed from: O0 */
    private void m100649O0() {
        addOnContextAvailableListener(new C34216a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f83068F) {
            this.f83068F = true;
            ((C38056f) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32501p1((ProductListActivity) C18157e.m62250a(this));
        }
    }
}
