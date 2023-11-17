package p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import po0.C17464i;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.b */
public abstract class C15084b extends C30772sa {

    /* renamed from: F */
    private boolean f43344F = false;

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.b$a */
    class C15085a implements C0001b {
        C15085a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C15084b.this.mo37460R0();
        }
    }

    C15084b() {
        m55225O0();
    }

    /* renamed from: O0 */
    private void m55225O0() {
        addOnContextAvailableListener(new C15085a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f43344F) {
            this.f43344F = true;
            ((C17464i) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32447Y0((OffersProgressDetailActivity) C18157e.m62250a(this));
        }
    }
}
