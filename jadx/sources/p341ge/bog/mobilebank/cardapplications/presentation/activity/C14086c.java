package p341ge.bog.mobilebank.cardapplications.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p593rm.C17669t;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.c */
public abstract class C14086c extends C30772sa {

    /* renamed from: F */
    private boolean f41488F = false;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.c$a */
    class C14087a implements C0001b {
        C14087a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14086c.this.mo37460R0();
        }
    }

    C14086c() {
        m52238O0();
    }

    /* renamed from: O0 */
    private void m52238O0() {
        addOnContextAvailableListener(new C14087a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41488F) {
            this.f41488F = true;
            ((C17669t) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32405K0((OrderCardResultActivity) C18157e.m62250a(this));
        }
    }
}
