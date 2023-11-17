package xt0;

import ed1.C40762x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import yt0.C40061b;
import yt0.C40064e;
import zt0.C40256a;

/* renamed from: xt0.d */
public final class C39896d {

    /* renamed from: a */
    private final C40256a f94653a;

    /* renamed from: xt0.d$a */
    static final class C39897a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39897a f94654d = new C39897a();

        /* renamed from: xt0.d$a$a */
        public static final class C39898a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(Integer.valueOf(((C40061b) obj).mo93961f()), Integer.valueOf(((C40061b) obj2).mo93961f()));
            }
        }

        /* renamed from: xt0.d$a$b */
        public static final class C39899b implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(Integer.valueOf(((C40064e) obj).mo93993c()), Integer.valueOf(((C40064e) obj2).mo93993c()));
            }
        }

        C39897a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "list");
            List<C40061b> t0 = C41358y.m120030t0(list, new C39898a());
            ArrayList arrayList = new ArrayList(C41343r.m119925u(t0, 10));
            for (C40061b a : t0) {
                List a2 = a.mo93955a();
                arrayList.add(a2 != null ? C41358y.m120030t0(a2, new C39899b()) : null);
            }
            return t0;
        }
    }

    public C39896d(C40256a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f94653a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m115684c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo93593b() {
        C40762x A = this.f94653a.mo92114d().mo95062A(new C39895c(C39897a.f94654d));
        C41536l.m120488h(A, "repository.getStarsGuide…}\n            }\n        }");
        return A;
    }
}
