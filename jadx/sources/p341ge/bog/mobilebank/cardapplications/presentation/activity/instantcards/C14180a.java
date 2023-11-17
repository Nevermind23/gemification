package p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p607sm.C17873n;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.a */
public abstract class C14180a extends C30772sa {

    /* renamed from: F */
    private boolean f41581F = false;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.a$a */
    class C14181a implements C0001b {
        C14181a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14180a.this.mo37460R0();
        }
    }

    C14180a() {
        m52475O0();
    }

    /* renamed from: O0 */
    private void m52475O0() {
        addOnContextAvailableListener(new C14181a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41581F) {
            this.f41581F = true;
            ((C17873n) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32389F0((ActivateInstantCardActivity) C18157e.m62250a(this));
        }
    }
}
