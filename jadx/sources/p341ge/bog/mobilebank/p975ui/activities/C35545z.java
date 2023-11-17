package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30554c7;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.z */
abstract class C35545z extends C30772sa {

    /* renamed from: F */
    private boolean f85880F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.z$a */
    class C35546a implements C0001b {
        C35546a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35545z.this.mo37460R0();
        }
    }

    C35545z() {
        m105548O0();
    }

    /* renamed from: O0 */
    private void m105548O0() {
        addOnContextAvailableListener(new C35546a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85880F) {
            this.f85880F = true;
            ((C30554c7) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32513u((NotificationListActivity) C18157e.m62250a(this));
        }
    }
}
