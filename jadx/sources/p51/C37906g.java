package p51;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m70.C26156i;
import md0.C26186e;
import sy0.C38606b;
import u51.C39032a;
import ue1.C43075l;
import xy0.C39948l;

/* renamed from: p51.g */
public final class C37906g {

    /* renamed from: a */
    private final C38606b f90981a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C39032a f90982b;

    /* renamed from: p51.g$a */
    static final class C37907a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37906g f90983d;

        /* renamed from: e */
        final /* synthetic */ long f90984e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37907a(C37906g gVar, long j) {
            super(1);
            this.f90983d = gVar;
            this.f90984e = j;
        }

        /* renamed from: a */
        public final List invoke(C39948l lVar) {
            C41536l.m120489i(lVar, "it");
            C39032a c = this.f90983d.f90982b;
            List a = lVar.mo93735b().mo93700a();
            if (a == null) {
                a = C41341q.m119907j();
            }
            return c.mo92696d(a, Long.valueOf(this.f90984e));
        }
    }

    /* renamed from: p51.g$b */
    static final class C37908b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37906g f90985d;

        /* renamed from: e */
        final /* synthetic */ long f90986e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37908b(C37906g gVar, long j) {
            super(1);
            this.f90985d = gVar;
            this.f90986e = j;
        }

        /* renamed from: a */
        public final List invoke(C26156i iVar) {
            C41536l.m120489i(iVar, "it");
            return this.f90985d.f90982b.mo92695c(iVar.mo65188a().mo65182a(), Long.valueOf(this.f90986e));
        }
    }

    public C37906g(C38606b bVar, C39032a aVar) {
        C41536l.m120489i(bVar, "repository");
        C41536l.m120489i(aVar, "accountsMapper");
        this.f90981a = bVar;
        this.f90982b = aVar;
    }

    /* renamed from: e */
    public static /* synthetic */ C40762x m111393e(C37906g gVar, boolean z, long j, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = -1;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return gVar.mo91247d(z, j, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final List m111394f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final List m111395g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: d */
    public final C40762x mo91247d(boolean z, long j, boolean z2) {
        if (z) {
            C40762x A = C26186e.m81990h(this.f90981a.getCreditCardAccountsAndDetails(z2)).mo95062A(new C37904e(new C37907a(this, j)));
            C41536l.m120488h(A, "operator fun invoke(\n   …        }\n        }\n    }");
            return A;
        }
        C40762x A2 = C26186e.m81990h(this.f90981a.getAccountsAndDetails(z2)).mo95062A(new C37905f(new C37908b(this, j)));
        C41536l.m120488h(A2, "operator fun invoke(\n   …        }\n        }\n    }");
        return A2;
    }
}
