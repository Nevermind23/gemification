package ty0;

import ed1.C40749p;
import he1.C41224m;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26186e;
import o70.C26766e;
import sy0.C38606b;
import ue1.C43079p;
import xy0.C39948l;

/* renamed from: ty0.j */
public final class C38870j {

    /* renamed from: a */
    private final C38606b f92948a;

    /* renamed from: ty0.j$a */
    static final class C38871a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C38871a f92949d = new C38871a();

        C38871a() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C39948l lVar, C26766e eVar) {
            C41536l.m120489i(lVar, "accountsAndDetailsModel");
            C41536l.m120489i(eVar, "cardsAndDetailsModel");
            return C41233s.m119492a(lVar, eVar);
        }
    }

    public C38870j(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92948a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C41224m m113686c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40749p mo92570b(boolean z) {
        C40749p d1 = C40749p.m118037d1(C26186e.m81987e(this.f92948a.getCreditCardAccountsAndDetails(z)), C26186e.m81987e(this.f92948a.getCardsAndDetails(z)), new C38867i(C38871a.f92949d));
        C41536l.m120488h(d1, "zip(\n            reposit…to cardsAndDetailsModel }");
        return d1;
    }
}
