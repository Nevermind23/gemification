package we0;

import ed1.C40762x;
import hf0.C24982a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import xe0.C29743a;

/* renamed from: we0.l */
public final class C29344l {

    /* renamed from: a */
    private final C24982a f74426a;

    /* renamed from: we0.l$a */
    static final class C29345a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29345a f74427d = new C29345a();

        C29345a() {
            super(1);
        }

        /* renamed from: a */
        public final C29743a invoke(List list) {
            C41536l.m120489i(list, "list");
            C29743a aVar = (C29743a) C41358y.m120009Y(list);
            if (aVar == null) {
                return new C29743a("", "");
            }
            return aVar;
        }
    }

    public C29344l(C24982a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f74426a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C29743a m89421c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29743a) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo69197b(long j, Long l) {
        C40762x A = this.f74426a.mo59109h2(j, l).mo95062A(new C29342k(C29345a.f74427d));
        C41536l.m120488h(A, "repository\n            .…ile(\"\", \"\")\n            }");
        return A;
    }
}
