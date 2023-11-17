package p341ge.bog.mobilebank.settings.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import t11.C38625f;

/* renamed from: ge.bog.mobilebank.settings.presentation.activity.a */
public abstract class C34609a extends C30772sa {

    /* renamed from: F */
    private boolean f83623F = false;

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.a$a */
    class C34610a implements C0001b {
        C34610a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34609a.this.mo37460R0();
        }
    }

    C34609a() {
        m101579O0();
    }

    /* renamed from: O0 */
    private void m101579O0() {
        addOnContextAvailableListener(new C34610a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f83623F) {
            this.f83623F = true;
            ((C38625f) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32472g((ChangeLanguageActivity) C18157e.m62250a(this));
        }
    }
}
