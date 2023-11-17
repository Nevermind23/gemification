package ty0;

import ed1.C40762x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ky0.C37019f;
import md0.C26186e;
import ny0.C37500b;
import ny0.C37504f;
import ny0.C37508i;
import ue1.C43075l;

/* renamed from: ty0.g0 */
public final class C38862g0 {

    /* renamed from: a */
    private final C37019f f92940a;

    /* renamed from: ty0.g0$a */
    static final class C38863a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f92941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38863a(long j) {
            super(1);
            this.f92941d = j;
        }

        /* renamed from: a */
        public final List invoke(C37508i iVar) {
            boolean z;
            C41536l.m120489i(iVar, "it");
            List d = iVar.mo90723d();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(d, 10));
            int i = 0;
            for (Object next : d) {
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                arrayList.add(new C37504f((C37500b) next, i));
                i = i2;
            }
            long j = this.f92941d;
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : arrayList) {
                if (((C37504f) next2).mo90703a().mo90664E() == j) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next2);
                }
            }
            return arrayList2;
        }
    }

    public C38862g0(C37019f fVar) {
        C41536l.m120489i(fVar, "getDepositsAndBonds");
        this.f92940a = fVar;
    }

    /* renamed from: c */
    public static /* synthetic */ C40762x m113673c(C38862g0 g0Var, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return g0Var.mo92565b(j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m113674d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40762x mo92565b(long j, boolean z) {
        C40762x A = C26186e.m81990h(this.f92940a.mo89942a(z)).mo95062A(new C38860f0(new C38863a(j)));
        C41536l.m120488h(A, "accKey: Long, refresh: B…y\n            }\n        }");
        return A;
    }
}
