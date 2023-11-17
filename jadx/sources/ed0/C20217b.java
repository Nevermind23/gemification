package ed0;

import ed1.C40762x;
import fd0.C20463a;
import gd0.C20800a;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: ed0.b */
public final class C20217b {

    /* renamed from: a */
    private final C20800a f54923a;

    /* renamed from: ed0.b$a */
    static final class C20218a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20218a f54924d = new C20218a();

        /* renamed from: ed0.b$a$a */
        public static final class C20219a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(Integer.valueOf(((C20463a) obj).mo49004d()), Integer.valueOf(((C20463a) obj2).mo49004d()));
            }
        }

        C20218a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "lookups");
            return C41358y.m120030t0(list, new C20219a());
        }
    }

    public C20217b(C20800a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f54923a = aVar;
    }

    /* renamed from: c */
    private final C40762x m66202c(C40762x xVar) {
        C40762x A = xVar.mo95062A(new C20216a(C20218a.f54924d));
        C41536l.m120488h(A, "map { lookups ->\n       … { it.orderNumber }\n    }");
        return A;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m66203d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo48650b(String str) {
        C41536l.m120489i(str, "lookupName");
        return m66202c(this.f54923a.mo49413a(str));
    }
}
