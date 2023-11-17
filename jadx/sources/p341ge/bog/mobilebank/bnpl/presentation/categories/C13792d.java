package p341ge.bog.mobilebank.bnpl.presentation.categories;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import p646vl.C18412b;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.d */
public abstract class C13792d extends C30772sa {

    /* renamed from: F */
    private boolean f41051F = false;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.categories.d$a */
    class C13793a implements C0001b {
        C13793a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C13792d.this.mo37460R0();
        }
    }

    C13792d() {
        m51479O0();
    }

    /* renamed from: O0 */
    private void m51479O0() {
        addOnContextAvailableListener(new C13793a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41051F) {
            this.f41051F = true;
            ((C18412b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32499p((BnplCategoriesActivity) C18157e.m62250a(this));
        }
    }
}
