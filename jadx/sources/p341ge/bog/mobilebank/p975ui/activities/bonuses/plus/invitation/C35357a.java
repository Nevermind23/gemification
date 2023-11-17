package p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.a */
abstract class C35357a extends C30772sa {

    /* renamed from: F */
    private boolean f85642F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.a$a */
    class C35358a implements C0001b {
        C35358a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35357a.this.mo37460R0();
        }
    }

    C35357a() {
        m105002O0();
    }

    /* renamed from: O0 */
    private void m105002O0() {
        addOnContextAvailableListener(new C35358a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85642F) {
            this.f85642F = true;
            ((C35361c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32432T0((PlusInvitationResultActivity) C18157e.m62250a(this));
        }
    }
}
