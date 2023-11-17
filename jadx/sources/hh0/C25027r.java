package hh0;

import dd0.C19981a;
import ed1.C40734b;
import jh0.C25455a;
import kotlin.jvm.internal.C41536l;

/* renamed from: hh0.r */
public final class C25027r {

    /* renamed from: a */
    private final C19981a f64360a;

    /* renamed from: b */
    private final C25455a f64361b;

    public C25027r(C19981a aVar, C25455a aVar2) {
        C41536l.m120489i(aVar, "isUserSaved");
        C41536l.m120489i(aVar2, "preferencesManager");
        this.f64360a = aVar;
        this.f64361b = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m79945c(C25027r rVar) {
        C41536l.m120489i(rVar, "this$0");
        String f = rVar.f64361b.mo48384f();
        if (rVar.f64360a.invoke()) {
            rVar.f64361b.mo48381c(f);
        }
    }

    /* renamed from: b */
    public final C40734b mo63426b() {
        C40734b t = C40734b.m117924t(new C25026q(this));
        C41536l.m120488h(t, "fromAction {\n        val…Token(currentToken)\n    }");
        return t;
    }
}
