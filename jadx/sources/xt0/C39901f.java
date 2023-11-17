package xt0;

import ed1.C40762x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import yt0.C40060a;
import yt0.C40062c;
import zt0.C40256a;

/* renamed from: xt0.f */
public final class C39901f {

    /* renamed from: a */
    private final C40256a f94656a;

    /* renamed from: xt0.f$a */
    static final class C39902a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39902a f94657d = new C39902a();

        /* renamed from: xt0.f$a$a */
        public static final class C39903a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(Integer.valueOf(((C40062c) obj).mo93969d()), Integer.valueOf(((C40062c) obj2).mo93969d()));
            }
        }

        /* renamed from: xt0.f$a$b */
        public static final class C39904b implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(Integer.valueOf(Integer.parseInt(((C40060a) obj).mo93952g())), Integer.valueOf(Integer.parseInt(((C40060a) obj2).mo93952g())));
            }
        }

        C39902a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "list");
            List<C40062c> t0 = C41358y.m120030t0(list, new C39903a());
            ArrayList arrayList = new ArrayList(C41343r.m119925u(t0, 10));
            for (C40062c e : t0) {
                arrayList.add(C41358y.m120030t0(e.mo93970e(), new C39904b()));
            }
            return t0;
        }
    }

    public C39901f(C40256a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f94656a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m115687c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo93597b() {
        C40762x A = this.f94656a.mo92113c().mo95062A(new C39900e(C39902a.f94657d));
        C41536l.m120488h(A, "repository.getStatusBene…}\n            }\n        }");
        return A;
    }
}
