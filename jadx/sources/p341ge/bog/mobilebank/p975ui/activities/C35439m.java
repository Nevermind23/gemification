package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30560d;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.m */
abstract class C35439m extends C30772sa {

    /* renamed from: F */
    private boolean f85721F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.m$a */
    class C35440a implements C0001b {
        C35440a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35439m.this.mo37460R0();
        }
    }

    C35439m() {
        m105195O0();
    }

    /* renamed from: O0 */
    private void m105195O0() {
        addOnContextAvailableListener(new C35440a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85721F) {
            this.f85721F = true;
            ((C30560d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32517v0((AllTemplateListActivity) C18157e.m62250a(this));
        }
    }
}
