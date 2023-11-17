package p341ge.bog.mobilebank.p975ui.activities.bonuses.plus.invitation;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.b */
abstract class C35359b extends C30772sa {

    /* renamed from: F */
    private boolean f85644F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.bonuses.plus.invitation.b$a */
    class C35360a implements C0001b {
        C35360a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35359b.this.mo37460R0();
        }
    }

    C35359b() {
        m105005O0();
    }

    /* renamed from: O0 */
    private void m105005O0() {
        addOnContextAvailableListener(new C35360a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85644F) {
            this.f85644F = true;
            ((C35365g) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32515u1((PlusProgramInvitationActivity) C18157e.m62250a(this));
        }
    }
}
