package p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p607sm.C17876q;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.b */
public abstract class C14182b extends C30772sa {

    /* renamed from: F */
    private boolean f41583F = false;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.b$a */
    class C14183a implements C0001b {
        C14183a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14182b.this.mo37460R0();
        }
    }

    C14182b() {
        m52478O0();
    }

    /* renamed from: O0 */
    private void m52478O0() {
        addOnContextAvailableListener(new C14183a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41583F) {
            this.f41583F = true;
            ((C17876q) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32471f1((InstantCardStatusActivity) C18157e.m62250a(this));
        }
    }
}
