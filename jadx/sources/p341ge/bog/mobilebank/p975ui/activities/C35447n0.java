package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30600fb;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.n0 */
abstract class C35447n0 extends C30772sa {

    /* renamed from: F */
    private boolean f85728F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.n0$a */
    class C35448a implements C0001b {
        C35448a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35447n0.this.mo37460R0();
        }
    }

    C35447n0() {
        m105207O0();
    }

    /* renamed from: O0 */
    private void m105207O0() {
        addOnContextAvailableListener(new C35448a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85728F) {
            this.f85728F = true;
            ((C30600fb) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32396H0((SmsNotifManagerActivity) C18157e.m62250a(this));
        }
    }
}
