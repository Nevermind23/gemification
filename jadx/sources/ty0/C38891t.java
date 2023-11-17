package ty0;

import ed1.C40749p;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26186e;
import md0.C26191f;
import o70.C26766e;
import sy0.C38606b;
import ue1.C43079p;
import xy0.C39948l;

/* renamed from: ty0.t */
public final class C38891t {

    /* renamed from: a */
    private final C38606b f92969a;

    /* renamed from: ty0.t$a */
    static final class C38892a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C38892a f92970d = new C38892a();

        C38892a() {
            super(2);
        }

        /* renamed from: a */
        public final C26191f invoke(C39948l lVar, C26766e eVar) {
            C41536l.m120489i(lVar, "creditCardsWrapper");
            C41536l.m120489i(eVar, "cardsAndDetailsModel");
            return new C26191f.C26194c(C41233s.m119492a(lVar, eVar));
        }
    }

    public C38891t(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92969a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C26191f m113710c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C26191f) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40749p mo92588b(boolean z) {
        C40749p d1 = C40749p.m118037d1(C26186e.m81987e(this.f92969a.getCreditCardAccountsAndDetails(z)), C26186e.m81987e(this.f92969a.getCardsAndDetails(z)), new C38889s(C38892a.f92970d));
        C41536l.m120488h(d1, "zip(\n            reposit…ndDetailsModel)\n        }");
        return d1;
    }
}
