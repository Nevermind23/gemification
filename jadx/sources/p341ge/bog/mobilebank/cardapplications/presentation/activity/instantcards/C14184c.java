package p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p607sm.C17883x;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.c */
public abstract class C14184c extends C30772sa {

    /* renamed from: F */
    private boolean f41585F = false;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.c$a */
    class C14185a implements C0001b {
        C14185a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14184c.this.mo37460R0();
        }
    }

    C14184c() {
        m52481O0();
    }

    /* renamed from: O0 */
    private void m52481O0() {
        addOnContextAvailableListener(new C14185a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41585F) {
            this.f41585F = true;
            ((C17883x) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32440W((InstantDeliveryApplicationActivity) C18157e.m62250a(this));
        }
    }
}
