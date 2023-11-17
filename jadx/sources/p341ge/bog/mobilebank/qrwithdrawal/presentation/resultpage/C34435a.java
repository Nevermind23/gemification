package p341ge.bog.mobilebank.qrwithdrawal.presentation.resultpage;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import t01.C38619b;

/* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.a */
public abstract class C34435a extends C30772sa {

    /* renamed from: F */
    private boolean f83453F = false;

    /* renamed from: ge.bog.mobilebank.qrwithdrawal.presentation.resultpage.a$a */
    class C34436a implements C0001b {
        C34436a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34435a.this.mo37460R0();
        }
    }

    C34435a() {
        m101274O0();
    }

    /* renamed from: O0 */
    private void m101274O0() {
        addOnContextAvailableListener(new C34436a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f83453F) {
            this.f83453F = true;
            ((C38619b) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32496o((QrResultPageActivity) C18157e.m62250a(this));
        }
    }
}
