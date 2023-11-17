package p341ge.bog.mobilebank.transfers.activities;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;

/* renamed from: ge.bog.mobilebank.transfers.activities.g */
abstract class C34909g extends C30772sa {

    /* renamed from: F */
    private boolean f84340F = false;

    /* renamed from: ge.bog.mobilebank.transfers.activities.g$a */
    class C34910a implements C0001b {
        C34910a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34909g.this.mo37460R0();
        }
    }

    C34909g() {
        m102715O0();
    }

    /* renamed from: O0 */
    private void m102715O0() {
        addOnContextAvailableListener(new C34910a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public abstract void mo37460R0();
}
