package p578ql;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p564pl.C17385a;
import ue1.C43075l;

/* renamed from: ql.e */
public final class C17531e {

    /* renamed from: a */
    private final C17385a f49059a;

    /* renamed from: ql.e$a */
    static final class C17532a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C17532a f49060d = new C17532a();

        C17532a() {
            super(1);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
            r2 = r2.mo45432e();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List invoke(java.util.List r2) {
            /*
                r1 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                java.lang.Object r2 = ie1.C41358y.m120009Y(r2)
                sl.b r2 = (p606sl.C17835b) r2
                if (r2 == 0) goto L_0x0013
                java.util.List r2 = r2.mo45432e()
                if (r2 != 0) goto L_0x0017
            L_0x0013:
                java.util.List r2 = ie1.C41341q.m119907j()
            L_0x0017:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p578ql.C17531e.C17532a.invoke(java.util.List):java.util.List");
        }
    }

    public C17531e(C17385a aVar) {
        C41536l.m120489i(aVar, "repo");
        this.f49059a = aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C40762x m61059c(C17531e eVar, long j, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return eVar.mo45048b(j, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m61060d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo45048b(long j, String str) {
        C40762x A = this.f49059a.mo43632h(Boolean.TRUE, str, Long.valueOf(j)).mo95062A(new C17530d(C17532a.f49060d));
        C41536l.m120488h(A, "repo.getBnplCategoriesWi… ?: emptyList()\n        }");
        return A;
    }
}
