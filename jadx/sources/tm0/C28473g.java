package tm0;

import ed1.C40734b;
import java.util.HashMap;
import k70.C25677a;
import k70.C25681e;
import kotlin.jvm.internal.C41536l;
import qm0.C27851a;

/* renamed from: tm0.g */
public final class C28473g {

    /* renamed from: a */
    private final C27851a f72280a;

    /* renamed from: b */
    private final C25681e f72281b;

    /* renamed from: c */
    private final C25677a f72282c;

    public C28473g(C27851a aVar, C25681e eVar, C25677a aVar2) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(eVar, "refreshCardsAndDetails");
        C41536l.m120489i(aVar2, "refreshAccountsAndDetails");
        this.f72280a = aVar;
        this.f72281b = eVar;
        this.f72282c = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m87311c(C28473g gVar) {
        C41536l.m120489i(gVar, "this$0");
        gVar.f72282c.invoke();
        gVar.f72281b.invoke();
    }

    /* renamed from: b */
    public final C40734b mo68094b(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40734b o = this.f72280a.mo65830N0(hashMap).mo94902o(new C28472f(this));
        C41536l.m120488h(o, "repository.verifyChildFi…shCardsAndDetails()\n    }");
        return o;
    }
}
