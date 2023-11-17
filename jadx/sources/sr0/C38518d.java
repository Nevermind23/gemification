package sr0;

import ed1.C40762x;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import rr0.C38333a;
import tr0.C38783d;
import tr0.C38784e;
import ue1.C43075l;

/* renamed from: sr0.d */
public final class C38518d {

    /* renamed from: a */
    private final C38333a f92338a;

    /* renamed from: sr0.d$a */
    static final class C38519a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38518d f92339d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38519a(C38518d dVar) {
            super(1);
            this.f92339d = dVar;
        }

        /* renamed from: a */
        public final C38783d invoke(C38783d dVar) {
            C41536l.m120489i(dVar, "loanPayment");
            return C38783d.m113519b(dVar, (BigDecimal) null, (String) null, this.f92339d.m113064c(dVar.mo92427e()), (List) null, 11, (Object) null);
        }
    }

    public C38518d(C38333a aVar) {
        C41536l.m120489i(aVar, "loansRepository");
        this.f92338a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final List m113064c(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C38784e eVar = (C38784e) next;
            if (!eVar.mo92434c() || new BigDecimal(String.valueOf(eVar.mo92433b())).compareTo(BigDecimal.ZERO) <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C38783d m113065e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C38783d) lVar.invoke(obj);
    }

    /* renamed from: d */
    public final C40762x mo92086d(long j, String str, String str2, String str3) {
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "prodType");
        C40762x A = this.f92338a.mo90959f(j, str, str2, str3).mo95062A(new C38517c(new C38519a(this)));
        C41536l.m120488h(A, "operator fun invoke(\n   …ist))\n            }\n    }");
        return A;
    }
}
