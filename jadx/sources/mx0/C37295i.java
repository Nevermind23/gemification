package mx0;

import cx0.C31456c;
import ed1.C40749p;
import ex0.C31874d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: mx0.i */
public final class C37295i {

    /* renamed from: a */
    private final C31874d f89743a;

    /* renamed from: mx0.i$a */
    static final class C37296a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f89744d;

        /* renamed from: e */
        final /* synthetic */ List f89745e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37296a(List list, List list2) {
            super(1);
            this.f89744d = list;
            this.f89745e = list2;
        }

        /* renamed from: a */
        public final List invoke(C31456c cVar) {
            C41536l.m120489i(cVar, "it");
            C37295i.m110052e(this.f89745e, this.f89744d, cVar);
            return this.f89744d;
        }
    }

    public C37295i(C31874d dVar) {
        C41536l.m120489i(dVar, "getPaymentConfigTree");
        this.f89743a = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m110051d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m110052e(List list, List list2, C31456c cVar) {
        if (list.contains(cVar.mo71852c().mo71836s())) {
            list2.add(cVar);
        }
        for (C31456c e : cVar.mo71851b().values()) {
            m110052e(list, list2, e);
        }
    }

    /* renamed from: c */
    public final C40749p mo90404c(List list) {
        C41536l.m120489i(list, "serviceIds");
        C40749p k0 = this.f89743a.invoke().mo95026k0(new C37294h(new C37296a(new ArrayList(), list)));
        C41536l.m120488h(k0, "serviceIds: List<String>…            res\n        }");
        return k0;
    }
}
