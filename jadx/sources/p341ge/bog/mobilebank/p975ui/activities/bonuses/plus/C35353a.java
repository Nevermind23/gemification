package p341ge.bog.mobilebank.p975ui.activities.bonuses.plus;

import a81.C30772sa;
import android.content.Context;
import b81.C31150c;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.a */
abstract class C35353a extends C30772sa {

    /* renamed from: F */
    private boolean f85629F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.a$a */
    class C35354a implements C0001b {
        C35354a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35353a.this.mo37460R0();
        }
    }

    C35353a() {
        m104984O0();
    }

    /* renamed from: O0 */
    private void m104984O0() {
        addOnContextAvailableListener(new C35354a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85629F) {
            this.f85629F = true;
            ((C31150c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32411M0((PlusActivationActivity) C18157e.m62250a(this));
        }
    }
}
