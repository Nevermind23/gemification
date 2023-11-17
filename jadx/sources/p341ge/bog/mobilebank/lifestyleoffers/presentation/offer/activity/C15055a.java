package p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity;

import a81.C30772sa;
import android.content.Context;
import io0.C15717g;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.a */
public abstract class C15055a extends C30772sa {

    /* renamed from: F */
    private boolean f43304F = false;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.a$a */
    class C15056a implements C0001b {
        C15056a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C15055a.this.mo37460R0();
        }
    }

    C15055a() {
        m55169O0();
    }

    /* renamed from: O0 */
    private void m55169O0() {
        addOnContextAvailableListener(new C15056a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f43304F) {
            this.f43304F = true;
            ((C15717g) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32479i0((LifestyleOfferDetailedActivity) C18157e.m62250a(this));
        }
    }
}
