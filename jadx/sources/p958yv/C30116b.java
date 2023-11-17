package p958yv;

import ed1.C40762x;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p711aw.C19279a;
import p969zv.C30411a;
import ue1.C43075l;

/* renamed from: yv.b */
public final class C30116b {

    /* renamed from: a */
    private final C19279a f75957a;

    /* renamed from: yv.b$a */
    static final class C30117a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30117a f75958d = new C30117a();

        /* renamed from: yv.b$a$a */
        public static final class C30118a implements Comparator {
            public final int compare(Object obj, Object obj2) {
                return C41506d.m120406e(((C30411a) obj).mo70755c(), ((C30411a) obj2).mo70755c());
            }
        }

        C30117a() {
            super(1);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "list");
            return C41358y.m120030t0(list, new C30118a());
        }
    }

    public C30116b(C19279a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f75957a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m91109c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo70403b(String str, int i, int i2, boolean z) {
        C41536l.m120489i(str, "monthOfYear");
        C40762x A = this.f75957a.mo47504a(str, i, i2, z).mo95062A(new C30115a(C30117a.f75958d));
        C41536l.m120488h(A, "repository.getCashFlow(m…rtedBy { it.monthDate } }");
        return A;
    }
}
