package p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import po0.C17462g;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.a */
public abstract class C15082a extends C30772sa {

    /* renamed from: F */
    private boolean f43342F = false;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.a$a */
    class C15083a implements C0001b {
        C15083a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C15082a.this.mo37460R0();
        }
    }

    C15082a() {
        m55222O0();
    }

    /* renamed from: O0 */
    private void m55222O0() {
        addOnContextAvailableListener(new C15083a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f43342F) {
            this.f43342F = true;
            ((C17462g) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32430S1((LifestyleOffersProgressActivity) C18157e.m62250a(this));
        }
    }
}
