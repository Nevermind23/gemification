package p578ql;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p564pl.C17385a;
import p606sl.C17845k;
import ue1.C43075l;

/* renamed from: ql.b */
public final class C17527b {

    /* renamed from: a */
    private final C17385a f49055a;

    /* renamed from: ql.b$a */
    static final class C17528a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C17528a f49056d = new C17528a();

        C17528a() {
            super(1);
        }

        /* renamed from: a */
        public final C17845k invoke(List list) {
            C41536l.m120489i(list, "it");
            return (C17845k) C41358y.m120009Y(list);
        }
    }

    public C17527b(C17385a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f49055a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C17845k m61054c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17845k) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo45045b(long j, String str) {
        C41536l.m120489i(str, "brandName");
        C40762x A = this.f49055a.mo43630g(j, str).mo95062A(new C17526a(C17528a.f49056d));
        C41536l.m120488h(A, "repository.getMerchantDe…t.firstOrNull()\n        }");
        return A;
    }
}
