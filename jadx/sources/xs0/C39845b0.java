package xs0;

import at0.C31065b;
import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43080q;
import ys0.C40059c;
import zs0.C40252e;

/* renamed from: xs0.b0 */
public final class C39845b0 {

    /* renamed from: a */
    private final C39852e0 f94582a;

    /* renamed from: b */
    private final C39848c0 f94583b;

    /* renamed from: c */
    private final C39879r f94584c;

    /* renamed from: xs0.b0$a */
    static final class C39846a extends C41537m implements C43080q {

        /* renamed from: d */
        public static final C39846a f94585d = new C39846a();

        C39846a() {
            super(3);
        }

        /* renamed from: a */
        public final C31065b invoke(C40059c cVar, List list, C40252e eVar) {
            C41536l.m120489i(cVar, "resources");
            C41536l.m120489i(list, "durations");
            C41536l.m120489i(eVar, "casInfo");
            return new C31065b(cVar, list, eVar.mo94232a());
        }
    }

    public C39845b0(C39852e0 e0Var, C39848c0 c0Var, C39879r rVar) {
        C41536l.m120489i(e0Var, "getPiggyBankResources");
        C41536l.m120489i(c0Var, "getPiggyBankPausePeriods");
        C41536l.m120489i(rVar, "getCasServiceInfo");
        this.f94582a = e0Var;
        this.f94583b = c0Var;
        this.f94584c = rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C31065b m115610c(C43080q qVar, Object obj, Object obj2, Object obj3) {
        C41536l.m120489i(qVar, "$tmp0");
        return (C31065b) qVar.invoke(obj, obj2, obj3);
    }

    /* renamed from: b */
    public final C40762x mo93556b() {
        C40762x S = C40762x.m118153S(this.f94582a.mo93561c(), this.f94583b.mo93558a(), C39879r.m115658b(this.f94584c, false, 1, (Object) null).mo94996P(), new C39843a0(C39846a.f94585d));
        C41536l.m120488h(S, "zip(\n            getPigg…clientServices)\n        }");
        return S;
    }
}
