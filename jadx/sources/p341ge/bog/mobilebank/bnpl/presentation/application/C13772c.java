package p341ge.bog.mobilebank.bnpl.presentation.application;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import p633ul.C18180c;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.application.c */
public abstract class C13772c extends C30772sa {

    /* renamed from: F */
    private boolean f41019F = false;

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.application.c$a */
    class C13773a implements C0001b {
        C13773a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C13772c.this.mo37460R0();
        }
    }

    C13772c() {
        m51430O0();
    }

    /* renamed from: O0 */
    private void m51430O0() {
        addOnContextAvailableListener(new C13773a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f41019F) {
            this.f41019F = true;
            ((C18180c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32481j((BnplApplicationResultActivity) C18157e.m62250a(this));
        }
    }
}
