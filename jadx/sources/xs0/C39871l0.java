package xs0;

import bt0.C31186b;
import ed1.C40734b;
import kotlin.jvm.internal.C41536l;
import ky0.C37020g;

/* renamed from: xs0.l0 */
public final class C39871l0 {

    /* renamed from: a */
    private final C31186b f94618a;

    /* renamed from: b */
    private final C37020g f94619b;

    /* renamed from: c */
    private final C39863i0 f94620c;

    public C39871l0(C31186b bVar, C37020g gVar, C39863i0 i0Var) {
        C41536l.m120489i(bVar, "repository");
        C41536l.m120489i(gVar, "refreshDepositsAndBonds");
        C41536l.m120489i(i0Var, "refreshCasServiceInfo");
        this.f94618a = bVar;
        this.f94619b = gVar;
        this.f94620c = i0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m115646c(C39871l0 l0Var) {
        C41536l.m120489i(l0Var, "this$0");
        l0Var.f94619b.mo89943a();
        l0Var.f94620c.mo93569a();
    }

    /* renamed from: b */
    public final C40734b mo93574b(long j, String str, String str2, String str3, Long l) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "amount");
        C41536l.m120489i(str3, "acctKeys");
        C40734b o = this.f94618a.mo71414r(j, str, str2, str3, l).mo94902o(new C39867k0(this));
        C41536l.m120488h(o, "repository.saveMoneyBox(…asServiceInfo()\n        }");
        return o;
    }
}
