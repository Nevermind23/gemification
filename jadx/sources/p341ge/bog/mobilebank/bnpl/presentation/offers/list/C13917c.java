package p341ge.bog.mobilebank.bnpl.presentation.offers.list;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p354am.C10075b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.c */
public abstract class C13917c extends C30772sa {

    /* renamed from: F */
    private boolean f41271F = false;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.offers.list.c$a */
    class C13918a implements C0001b {
        C13918a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C13917c.this.mo37460R0();
        }
    }

    C13917c() {
        m51848O0();
    }

    /* renamed from: O0 */
    private void m51848O0() {
        addOnContextAvailableListener(new C13918a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41271F) {
            this.f41271F = true;
            ((C10075b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo26531A1((BnplOffersActivity) C18157e.m62250a(this));
        }
    }
}
