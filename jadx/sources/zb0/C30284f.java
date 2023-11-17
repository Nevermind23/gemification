package zb0;

import ed1.C40749p;
import he1.C41224m;
import he1.C41233s;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ky0.C37019f;
import md0.C26186e;
import ny0.C37508i;
import ue1.C43075l;
import ue1.C43079p;
import xs0.C39879r;
import zs0.C40252e;

/* renamed from: zb0.f */
public final class C30284f {

    /* renamed from: a */
    private final C37019f f76201a;

    /* renamed from: b */
    private final C39879r f76202b;

    /* renamed from: zb0.f$a */
    static final class C30285a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30285a f76203d = new C30285a();

        C30285a() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C40252e eVar) {
            C41536l.m120489i(eVar, "it");
            return eVar.mo94232a();
        }
    }

    /* renamed from: zb0.f$b */
    static final class C30286b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30286b f76204d = new C30286b();

        C30286b() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return C41341q.m119907j();
        }
    }

    /* renamed from: zb0.f$c */
    static final class C30287c extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C30287c f76205d = new C30287c();

        C30287c() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C37508i iVar, List list) {
            C41536l.m120489i(iVar, "deposits");
            C41536l.m120489i(list, "cas");
            return C41233s.m119492a(iVar, list);
        }
    }

    public C30284f(C37019f fVar, C39879r rVar) {
        C41536l.m120489i(fVar, "getDepositsAndBonds");
        C41536l.m120489i(rVar, "getCasServiceInfo");
        this.f76201a = fVar;
        this.f76202b = rVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final List m91394e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final List m91395f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final C41224m m91396g(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* renamed from: d */
    public final C40749p mo70621d(boolean z) {
        C40749p m = C40749p.m118048m(C26186e.m81987e(this.f76201a.mo89942a(z)), this.f76202b.mo93581a(z).mo95026k0(new C30281c(C30285a.f76203d)).mo95035t0(new C30282d(C30286b.f76204d)), new C30283e(C30287c.f76205d));
        C41536l.m120488h(m, "combineLatest(\n         …deposits to cas\n        }");
        return m;
    }
}
