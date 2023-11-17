package p341ge.bog.mobilebank.categorypackages.presentation;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p497ko.C16514a;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.a */
public abstract class C14399a extends C30772sa {

    /* renamed from: F */
    private boolean f42164F = false;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.a$a */
    class C14400a implements C0001b {
        C14400a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14399a.this.mo37460R0();
        }
    }

    C14399a() {
        m53340O0();
    }

    /* renamed from: O0 */
    private void m53340O0() {
        addOnContextAvailableListener(new C14400a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f42164F) {
            this.f42164F = true;
            ((C16514a) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32413N((CategoryPackagesActivity) C18157e.m62250a(this));
        }
    }
}
