package p341ge.bog.mobilebank.depositapplication.presentation.applicationresult;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import sa0.C28167b;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.b */
public abstract class C22843b extends C30772sa {

    /* renamed from: F */
    private boolean f60201F = false;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.applicationresult.b$a */
    class C22844a implements C0001b {
        C22844a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C22843b.this.mo37460R0();
        }
    }

    C22843b() {
        m74117O0();
    }

    /* renamed from: O0 */
    private void m74117O0() {
        addOnContextAvailableListener(new C22844a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f60201F) {
            this.f60201F = true;
            ((C28167b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32450Z0((DepositApplicationResultActivity) C18157e.m62250a(this));
        }
    }
}
