package za1;

import dd1.C40603t0;
import ed1.C40762x;
import ga1.C12960a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import sso.queery.GetClientInfoQuery;
import xa1.C39832a;

/* renamed from: za1.c */
public final class C40220c {

    /* renamed from: a */
    private final C40221d f95597a;

    /* renamed from: b */
    private final C12960a f95598b;

    /* renamed from: c */
    private final C40603t0 f95599c;

    public C40220c(C40221d dVar, C12960a aVar, C40603t0 t0Var) {
        C41536l.m120489i(dVar, "getUserInfo");
        C41536l.m120489i(aVar, "getUsernameRules");
        C41536l.m120489i(t0Var, "getCountryCodes");
        this.f95597a = dVar;
        this.f95598b = aVar;
        this.f95599c = t0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C39832a m116522c(GetClientInfoQuery.GetClientInfo getClientInfo, List list, List list2) {
        C41536l.m120489i(getClientInfo, "userinfo");
        C41536l.m120489i(list, "rules");
        C41536l.m120489i(list2, "codes");
        return new C39832a(getClientInfo, list, list2);
    }

    /* renamed from: b */
    public final C40762x mo94173b() {
        C40762x S = C40762x.m118153S(this.f95597a.mo94174a(), this.f95598b.mo33721a(), this.f95599c.mo94614a(), new C40219b());
        C41536l.m120488h(S, "zip(getUserInfo(), getUs…, rules, codes)\n        }");
        return S;
    }
}
