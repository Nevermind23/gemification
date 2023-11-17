package p341ge.bog.mobilebank.cardapplications.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p593rm.C17655f;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.a */
public abstract class C14082a extends C30772sa {

    /* renamed from: F */
    private boolean f41484F = false;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.activity.a$a */
    class C14083a implements C0001b {
        C14083a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C14082a.this.mo37460R0();
        }
    }

    C14082a() {
        m52232O0();
    }

    /* renamed from: O0 */
    private void m52232O0() {
        addOnContextAvailableListener(new C14083a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41484F) {
            this.f41484F = true;
            ((C17655f) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32399I0((CardApplicationTypesActivity) C18157e.m62250a(this));
        }
    }
}
