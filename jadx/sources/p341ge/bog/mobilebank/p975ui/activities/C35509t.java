package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30646j1;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.t */
abstract class C35509t extends C35388f2 {

    /* renamed from: F */
    private boolean f85828F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.t$a */
    class C35510a implements C0001b {
        C35510a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35509t.this.mo37460R0();
        }
    }

    C35509t() {
        m105447O0();
    }

    /* renamed from: O0 */
    private void m105447O0() {
        addOnContextAvailableListener(new C35510a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85828F) {
            this.f85828F = true;
            ((C30646j1) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32478i((LauncherActivity) C18157e.m62250a(this));
        }
    }
}
