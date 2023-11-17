package p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p607sm.C17865f0;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.d */
public abstract class C14186d extends C30772sa {

    /* renamed from: F */
    private boolean f41587F = false;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.d$a */
    class C14187a implements C0001b {
        C14187a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14186d.this.mo37460R0();
        }
    }

    C14186d() {
        m52484O0();
    }

    /* renamed from: O0 */
    private void m52484O0() {
        addOnContextAvailableListener(new C14187a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41587F) {
            this.f41587F = true;
            ((C17865f0) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32470f0((OrderInstantCardActivity) C18157e.m62250a(this));
        }
    }
}
