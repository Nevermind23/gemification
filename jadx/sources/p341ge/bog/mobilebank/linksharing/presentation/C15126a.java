package p341ge.bog.mobilebank.linksharing.presentation;

import a81.C30772sa;
import android.content.Context;
import fp0.C12954a;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.linksharing.presentation.a */
public abstract class C15126a extends C30772sa {

    /* renamed from: F */
    private boolean f43426F = false;

    /* renamed from: ge.bog.mobilebank.linksharing.presentation.a$a */
    class C15127a implements C0001b {
        C15127a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C15126a.this.mo37460R0();
        }
    }

    C15126a() {
        m55327O0();
    }

    /* renamed from: O0 */
    private void m55327O0() {
        addOnContextAvailableListener(new C15127a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f43426F) {
            this.f43426F = true;
            ((C12954a) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32382D((P2PLinkActivity) C18157e.m62250a(this));
        }
    }
}
