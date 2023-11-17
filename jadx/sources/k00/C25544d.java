package k00;

import ed1.C40734b;
import ed1.C40762x;
import jd0.C25383a;
import kd0.C25711a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.packages.data.CrossSellPackageApiModel;
import ue1.C43075l;

/* renamed from: k00.d */
public final class C25544d implements C25711a {

    /* renamed from: a */
    private final C25541a f65213a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25542b f65214b;

    /* renamed from: k00.d$a */
    static final class C25545a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25544d f65215d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25545a(C25544d dVar) {
            super(1);
            this.f65215d = dVar;
        }

        /* renamed from: a */
        public final C25383a invoke(CrossSellPackageApiModel crossSellPackageApiModel) {
            C41536l.m120489i(crossSellPackageApiModel, "it");
            return this.f65215d.f65214b.mo64082a(crossSellPackageApiModel);
        }
    }

    public C25544d(C25541a aVar, C25542b bVar) {
        C41536l.m120489i(aVar, "api");
        C41536l.m120489i(bVar, "mapper");
        this.f65213a = aVar;
        this.f65214b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C25383a m80718e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25383a) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo64083a() {
        C40762x A = this.f65213a.mo64080a().mo95062A(new C25543c(new C25545a(this)));
        C41536l.m120488h(A, "override fun getCrossSel…per.transform(it) }\n    }");
        return A;
    }

    /* renamed from: b */
    public C40734b mo64084b() {
        return this.f65213a.mo64081b();
    }
}
