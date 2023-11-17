package p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import p848or.C27060b;

/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.c */
public abstract class C20934c extends C30772sa {

    /* renamed from: F */
    private boolean f56262F = false;

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.c$a */
    class C20935a implements C0001b {
        C20935a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C20934c.this.mo37460R0();
        }
    }

    C20934c() {
        m67746O0();
    }

    /* renamed from: O0 */
    private void m67746O0() {
        addOnContextAvailableListener(new C20935a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f56262F) {
            this.f56262F = true;
            ((C27060b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32476h0((ConsumerLoanActivationResultActivity) C18157e.m62250a(this));
        }
    }
}
