package p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity;

import a81.C30772sa;
import android.content.Context;
import io0.C15730t;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.c */
public abstract class C15059c extends C30772sa {

    /* renamed from: F */
    private boolean f43308F = false;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.c$a */
    class C15060a implements C0001b {
        C15060a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C15059c.this.mo37460R0();
        }
    }

    C15059c() {
        m55175O0();
    }

    /* renamed from: O0 */
    private void m55175O0() {
        addOnContextAvailableListener(new C15060a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f43308F) {
            this.f43308F = true;
            ((C15730t) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32383D0((LifestyleOffersFilterActivity) C18157e.m62250a(this));
        }
    }
}
