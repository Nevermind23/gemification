package p460if;

import dg1.C40681e;
import kotlin.jvm.internal.C41536l;
import of1.C41897h0;

/* renamed from: if.f */
public final class C15627f implements C41897h0 {

    /* renamed from: a */
    private C41897h0 f44432a;

    /* renamed from: a */
    public final void mo42931a(C41897h0 h0Var) {
        C41536l.m120490j(h0Var, "webSocket");
        this.f44432a = h0Var;
    }

    /* renamed from: b */
    public boolean mo42932b(String str) {
        C41536l.m120490j(str, "text");
        C41897h0 h0Var = this.f44432a;
        if (h0Var != null) {
            return h0Var.mo42932b(str);
        }
        return false;
    }

    /* renamed from: c */
    public final void mo42933c() {
        this.f44432a = null;
    }

    public void cancel() {
        C41897h0 h0Var = this.f44432a;
        if (h0Var != null) {
            h0Var.cancel();
        }
    }

    /* renamed from: f */
    public boolean mo42935f(int i, String str) {
        C41897h0 h0Var = this.f44432a;
        if (h0Var != null) {
            return h0Var.mo42935f(i, str);
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo42936g(C40681e eVar) {
        C41536l.m120490j(eVar, "bytes");
        C41897h0 h0Var = this.f44432a;
        if (h0Var != null) {
            return h0Var.mo42936g(eVar);
        }
        return false;
    }
}
