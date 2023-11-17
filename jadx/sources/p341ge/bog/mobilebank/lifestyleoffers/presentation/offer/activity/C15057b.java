package p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity;

import a81.C30772sa;
import android.content.Context;
import io0.C15723m;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.b */
public abstract class C15057b extends C30772sa {

    /* renamed from: F */
    private boolean f43306F = false;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.b$a */
    class C15058a implements C0001b {
        C15058a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C15057b.this.mo37460R0();
        }
    }

    C15057b() {
        m55172O0();
    }

    /* renamed from: O0 */
    private void m55172O0() {
        addOnContextAvailableListener(new C15058a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f43306F) {
            this.f43306F = true;
            ((C15723m) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32422Q((LifestyleOffersByCategoryActivity) C18157e.m62250a(this));
        }
    }
}
