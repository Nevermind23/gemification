package xt0;

import ed1.C40762x;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import yt0.C40065f;
import zt0.C40256a;

/* renamed from: xt0.b */
public final class C39892b {

    /* renamed from: a */
    private final C40256a f94650a;

    /* renamed from: xt0.b$a */
    static final class C39893a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39893a f94651d = new C39893a();

        /* renamed from: xt0.b$a$a */
        public static final class C39894a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(Integer.valueOf(((C40065f) obj).mo93999b()), Integer.valueOf(((C40065f) obj2).mo93999b()));
            }
        }

        C39893a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "list");
            return C41358y.m120030t0(list, new C39894a());
        }
    }

    public C39892b(C40256a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f94650a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m115681c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo93590b() {
        C40762x A = this.f94650a.mo92111a().mo95062A(new C39891a(C39893a.f94651d));
        C41536l.m120488h(A, "repository.getNewsList()… { it.orderId }\n        }");
        return A;
    }
}
