package p341ge.bog.mobilebank.nbo.presentation.activity;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import w00.C29189a;

/* renamed from: ge.bog.mobilebank.nbo.presentation.activity.a */
public abstract class C33302a extends C29189a {

    /* renamed from: F */
    private boolean f81409F = false;

    /* renamed from: ge.bog.mobilebank.nbo.presentation.activity.a$a */
    class C33303a implements C0001b {
        C33303a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C33302a.this.mo37460R0();
        }
    }

    C33302a() {
        m97946O0();
    }

    /* renamed from: O0 */
    private void m97946O0() {
        addOnContextAvailableListener(new C33303a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f81409F) {
            this.f81409F = true;
            ((C33304b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32376B((NboNavigatorActivity) C18157e.m62250a(this));
        }
    }
}
