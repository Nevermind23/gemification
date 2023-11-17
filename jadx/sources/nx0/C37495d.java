package nx0;

import cx0.C31453a;
import cx0.C31456c;
import ed1.C40749p;
import ex0.C31874d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: nx0.d */
public final class C37495d implements C37497e {

    /* renamed from: a */
    private final C31874d f90103a;

    /* renamed from: nx0.d$a */
    static final class C37496a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f90104d;

        /* renamed from: e */
        final /* synthetic */ boolean f90105e;

        /* renamed from: f */
        final /* synthetic */ String f90106f;

        /* renamed from: g */
        final /* synthetic */ C37495d f90107g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37496a(List list, boolean z, String str, C37495d dVar) {
            super(1);
            this.f90104d = list;
            this.f90105e = z;
            this.f90106f = str;
            this.f90107g = dVar;
        }

        /* renamed from: a */
        public final List invoke(C31456c cVar) {
            C41536l.m120489i(cVar, "it");
            C37495d.m110420f(this.f90105e, this.f90106f, this.f90104d, this.f90107g, cVar);
            return this.f90104d;
        }
    }

    public C37495d(C31874d dVar) {
        C41536l.m120489i(dVar, "getPaymentConfigTree");
        this.f90103a = dVar;
    }

    /* renamed from: d */
    private final boolean m110418d(C31453a aVar, String str) {
        if (C40440x.m117135K(aVar.mo71839u(), str, true) || C40440x.m117135K(aVar.mo71833p(), str, true)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final List m110419e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m110420f(boolean z, String str, List list, C37495d dVar, C31456c cVar) {
        if (z) {
            if (C40439w.m117115s(cVar.mo71852c().mo71836s(), str, true)) {
                list.add(cVar);
            }
        } else if (dVar.m110418d(cVar.mo71852c(), str)) {
            list.add(cVar);
        }
        for (C31456c f : cVar.mo71851b().values()) {
            m110420f(z, str, list, dVar, f);
        }
    }

    /* renamed from: a */
    public C40749p mo90634a(String str, C31456c cVar, boolean z) {
        C40749p pVar;
        C41536l.m120489i(str, "searchString");
        if (cVar != null) {
            pVar = C40749p.m118043h0(cVar);
            C41536l.m120488h(pVar, "{\n            Observable…ust(searchNode)\n        }");
        } else {
            pVar = this.f90103a.invoke();
        }
        C40749p k0 = pVar.mo95026k0(new C37494c(new C37496a(new ArrayList(), z, str, this)));
        C41536l.m120488h(k0, "override fun invoke(\n   …      res\n        }\n    }");
        return k0;
    }
}
