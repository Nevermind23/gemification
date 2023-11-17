package ty0;

import ed1.C40749p;
import j70.C25337a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import l70.C25846a;
import m70.C26156i;
import md0.C26186e;
import o70.C26766e;
import sy0.C38606b;
import ue1.C43079p;

/* renamed from: ty0.h */
public final class C38864h implements C25337a {

    /* renamed from: a */
    private final C38606b f92942a;

    /* renamed from: ty0.h$a */
    static final class C38865a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C38865a f92943d = new C38865a();

        C38865a() {
            super(2);
        }

        /* renamed from: a */
        public final C25846a invoke(C26156i iVar, C26766e eVar) {
            C41536l.m120489i(iVar, "accountsAndDetailsModel");
            C41536l.m120489i(eVar, "cardsAndDetailsModel");
            return new C25846a(iVar, eVar);
        }
    }

    public C38864h(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92942a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C25846a m113678c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C25846a) pVar.invoke(obj, obj2);
    }

    /* renamed from: a */
    public C40749p mo63907a(boolean z) {
        C40749p d1 = C40749p.m118037d1(C26186e.m81987e(this.f92942a.getAccountsAndDetails(z)), C26186e.m81987e(this.f92942a.getCardsAndDetails(z)), new C38861g(C38865a.f92943d));
        C41536l.m120488h(d1, "zip(\n            reposit…l\n            )\n        }");
        return C26186e.m81991i(d1);
    }
}
