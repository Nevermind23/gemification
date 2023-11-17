package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30562d1;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.s */
abstract class C35504s extends C30772sa {

    /* renamed from: F */
    private boolean f85823F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.s$a */
    class C35505a implements C0001b {
        C35505a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35504s.this.mo37460R0();
        }
    }

    C35504s() {
        m105440O0();
    }

    /* renamed from: O0 */
    private void m105440O0() {
        addOnContextAvailableListener(new C35505a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85823F) {
            this.f85823F = true;
            ((C30562d1) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32488l0((HouseTemplateGroupActivity) C18157e.m62250a(this));
        }
    }
}
