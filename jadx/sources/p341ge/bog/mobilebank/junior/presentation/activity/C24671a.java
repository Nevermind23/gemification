package p341ge.bog.mobilebank.junior.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import vm0.C29128b;

/* renamed from: ge.bog.mobilebank.junior.presentation.activity.a */
public abstract class C24671a extends C30772sa {

    /* renamed from: F */
    private boolean f63531F = false;

    /* renamed from: ge.bog.mobilebank.junior.presentation.activity.a$a */
    class C24672a implements C0001b {
        C24672a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C24671a.this.mo37460R0();
        }
    }

    C24671a() {
        m79166O0();
    }

    /* renamed from: O0 */
    private void m79166O0() {
        addOnContextAvailableListener(new C24672a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f63531F) {
            this.f63531F = true;
            ((C29128b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32523x0((JuniorActivity) C18157e.m62250a(this));
        }
    }
}
