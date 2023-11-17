package nx0;

import cx0.C31456c;
import ed1.C40749p;
import ex0.C31876e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: nx0.b */
public final class C37492b implements C37497e {

    /* renamed from: a */
    private final C31876e f90098a;

    /* renamed from: nx0.b$a */
    static final class C37493a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f90099d;

        /* renamed from: e */
        final /* synthetic */ boolean f90100e;

        /* renamed from: f */
        final /* synthetic */ String f90101f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37493a(List list, boolean z, String str) {
            super(1);
            this.f90099d = list;
            this.f90100e = z;
            this.f90101f = str;
        }

        /* renamed from: a */
        public final List invoke(C31456c cVar) {
            C41536l.m120489i(cVar, "it");
            C37492b.m110413e(this.f90100e, this.f90101f, this.f90099d, cVar);
            return this.f90099d;
        }
    }

    public C37492b(C31876e eVar) {
        C41536l.m120489i(eVar, "getPaymentConfigTree");
        this.f90098a = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final List m110412d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m110413e(boolean z, String str, List list, C31456c cVar) {
        if (z) {
            if (C40439w.m117115s(cVar.mo71852c().mo71836s(), str, true)) {
                list.add(cVar);
            }
        } else if (C40440x.m117135K(cVar.mo71852c().mo71839u(), str, true)) {
            list.add(cVar);
        }
        for (C31456c e : cVar.mo71851b().values()) {
            m110413e(z, str, list, e);
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
            pVar = this.f90098a.invoke();
        }
        C40749p k0 = pVar.mo95026k0(new C37491a(new C37493a(new ArrayList(), z, str)));
        C41536l.m120488h(k0, "searchString: String,\n  …            res\n        }");
        return k0;
    }
}
