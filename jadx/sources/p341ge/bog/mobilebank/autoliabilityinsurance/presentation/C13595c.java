package p341ge.bog.mobilebank.autoliabilityinsurance.presentation;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p577qk.C17520c;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.c */
public abstract class C13595c extends C30772sa {

    /* renamed from: F */
    private boolean f40679F = false;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.c$a */
    class C13596a implements C0001b {
        C13596a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C13595c.this.mo37460R0();
        }
    }

    C13595c() {
        m50982O0();
    }

    /* renamed from: O0 */
    private void m50982O0() {
        addOnContextAvailableListener(new C13596a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f40679F) {
            this.f40679F = true;
            ((C17520c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32461c1((AutoLiabilityInsuranceActivity) C18157e.m62250a(this));
        }
    }
}
