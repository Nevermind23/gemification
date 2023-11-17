package we0;

import ed1.C40762x;
import hf0.C24982a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import xe0.C29743a;

/* renamed from: we0.n */
public final class C29349n {

    /* renamed from: a */
    private final C24982a f74431a;

    /* renamed from: we0.n$a */
    static final class C29350a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29350a f74432d = new C29350a();

        C29350a() {
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

    public C29349n(C24982a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f74431a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C29743a m89426c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C29743a) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo69201b(long j, Long l) {
        C40762x A = this.f74431a.mo59093E3(j, l).mo95062A(new C29347m(C29350a.f74432d));
        C41536l.m120488h(A, "repository\n            .…ile(\"\", \"\")\n            }");
        return A;
    }
}
