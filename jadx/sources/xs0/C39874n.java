package xs0;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43079p;
import zs0.C40249b;
import zs0.C40253f;

/* renamed from: xs0.n */
public final class C39874n {

    /* renamed from: a */
    private final C39880s f94623a;

    /* renamed from: b */
    private final C39876o f94624b;

    /* renamed from: xs0.n$a */
    static final class C39875a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C39875a f94625d = new C39875a();

        C39875a() {
            super(2);
        }

        /* renamed from: a */
        public final C40249b invoke(C40253f fVar, List list) {
            C41536l.m120489i(fVar, "cas");
            C41536l.m120489i(list, "history");
            return new C40249b(fVar, list, (String) null, 4, (DefaultConstructorMarker) null);
        }
    }

    public C39874n(C39880s sVar, C39876o oVar) {
        C41536l.m120489i(sVar, "getCasService");
        C41536l.m120489i(oVar, "getCasHistory");
        this.f94623a = sVar;
        this.f94624b = oVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C40762x m115650c(C39874n nVar, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return nVar.mo93576b(j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40249b m115651d(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C40249b) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40762x mo93576b(long j, boolean z) {
        C40762x T = C40762x.m118154T(this.f94623a.mo93582a(j, z), this.f94624b.mo93578a(j), new C39872m(C39875a.f94625d));
        C41536l.m120488h(T, "zip(\n            getCasS…s(cas, history)\n        }");
        return T;
    }
}
