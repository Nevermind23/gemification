package ty0;

import ed1.C40762x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import md0.C26186e;
import sy0.C38606b;
import ue1.C43075l;
import xy0.C39951o;
import xy0.C39952p;
import xy0.C39953q;
import xy0.C39956t;
import xy0.C39959w;

/* renamed from: ty0.i0 */
public final class C38868i0 {

    /* renamed from: a */
    private final C38606b f92946a;

    /* renamed from: ty0.i0$a */
    static final class C38869a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f92947d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38869a(long j) {
            super(1);
            this.f92947d = j;
        }

        /* renamed from: a */
        public final List invoke(C39959w wVar) {
            C39956t tVar;
            boolean z;
            Long a;
            C41536l.m120489i(wVar, "wrapper");
            List b = wVar.mo93785b();
            long j = this.f92947d;
            ArrayList<C39953q> arrayList = new ArrayList<>();
            Iterator it = b.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C39951o b2 = ((C39953q) next).mo93762b();
                if (b2 == null || (a = b2.mo93750a()) == null || a.longValue() != j) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
            for (C39953q qVar : arrayList) {
                Iterator it2 = wVar.mo93786c().iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C39952p) it2.next()).mo93757d() == qVar.mo93763c()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i++;
                }
                C39952p pVar = (C39952p) C41358y.m120010Z(wVar.mo93786c(), i);
                if (pVar == null) {
                    tVar = null;
                } else {
                    tVar = new C39956t(pVar, i);
                }
                arrayList2.add(tVar);
            }
            return C41358y.m120004T(arrayList2);
        }
    }

    public C38868i0(C38606b bVar) {
        C41536l.m120489i(bVar, "repository");
        this.f92946a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final List m113682c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo92568b(long j) {
        C40762x A = C26186e.m81990h(this.f92946a.getLoansWithDetails(false)).mo95062A(new C38866h0(new C38869a(j)));
        C41536l.m120488h(A, "accKey: Long): Single<Li…filterNotNull()\n        }");
        return A;
    }
}
