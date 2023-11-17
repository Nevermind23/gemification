package p341ge.bog.mobilebank.statements.presentation.statementsfilter;

import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import v51.C39234z;

/* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.b */
public abstract class C34759b extends C30772sa {

    /* renamed from: F */
    private boolean f84000F = false;

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.b$a */
    class C34760a implements C0001b {
        C34760a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34759b.this.mo37460R0();
        }
    }

    C34759b() {
        m102150O0();
    }

    /* renamed from: O0 */
    private void m102150O0() {
        addOnContextAvailableListener(new C34760a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84000F) {
            this.f84000F = true;
            ((C39234z) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32393G1((StatementsFilterActivity) C18157e.m62250a(this));
        }
    }
}
