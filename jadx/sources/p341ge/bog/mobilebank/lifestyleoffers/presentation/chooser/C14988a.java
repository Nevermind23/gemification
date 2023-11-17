package p341ge.bog.mobilebank.lifestyleoffers.presentation.chooser;

import a81.C30772sa;
import android.content.Context;
import eo0.C12795k;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.a */
public abstract class C14988a extends C30772sa {

    /* renamed from: F */
    private boolean f43196F = false;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.a$a */
    class C14989a implements C0001b {
        C14989a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14988a.this.mo37460R0();
        }
    }

    C14988a() {
        m54954O0();
    }

    /* renamed from: O0 */
    private void m54954O0() {
        addOnContextAvailableListener(new C14989a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f43196F) {
            this.f43196F = true;
            ((C12795k) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32527y1((LifestyleChooserActivity) C18157e.m62250a(this));
        }
    }
}
