package fl0;

import ed1.C40762x;
import gl0.C24762a;
import he1.C41238w;
import hl0.C25036a;
import hl0.C25037b;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kl0.C25742a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ml0.C26248b;
import p341ge.bog.mobilebank.insurance.data.model.PoliciesApiModel;
import ue1.C43075l;

/* renamed from: fl0.d */
public final class C20539d implements C25742a {

    /* renamed from: a */
    private final C24762a f55560a;

    /* renamed from: b */
    private final C25037b f55561b;

    /* renamed from: c */
    private final C25036a f55562c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final AtomicReference f55563d = new AtomicReference();

    /* renamed from: fl0.d$a */
    /* synthetic */ class C20540a extends C41535k implements C43075l {
        C20540a(Object obj) {
            super(1, obj, C25036a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C25036a) this.receiver).mo63468a(list);
        }
    }

    /* renamed from: fl0.d$b */
    static final class C20541b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20539d f55564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20541b(C20539d dVar) {
            super(1);
            this.f55564d = dVar;
        }

        /* renamed from: a */
        public final void mo49063a(List list) {
            this.f55564d.f55563d.set(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49063a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: fl0.d$c */
    /* synthetic */ class C20542c extends C41535k implements C43075l {
        C20542c(Object obj) {
            super(1, obj, C25037b.class, "convert", "convert(Lge/bog/mobilebank/insurance/data/model/PoliciesApiModel;)Lge/bog/mobilebank/insurance/domain/model/InsurancePolicies;", 0);
        }

        /* renamed from: b */
        public final C26248b invoke(PoliciesApiModel policiesApiModel) {
            C41536l.m120489i(policiesApiModel, "p0");
            return ((C25037b) this.receiver).mo63469b(policiesApiModel);
        }
    }

    public C20539d(C24762a aVar, C25037b bVar, C25036a aVar2) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(bVar, "policyMapper");
        C41536l.m120489i(aVar2, "productMapper");
        this.f55560a = aVar;
        this.f55561b = bVar;
        this.f55562c = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final List m66782g(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m66783h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C26248b m66784i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C26248b) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo49060a() {
        C40762x E = this.f55560a.mo63156a().mo95062A(new C20536a(new C20542c(this.f55561b))).mo95066E(new C26248b((List) null, (List) null, 3, (DefaultConstructorMarker) null));
        C41536l.m120488h(E, "service.getPolicies().ma…Item(InsurancePolicies())");
        return E;
    }

    /* renamed from: b */
    public C40762x mo49061b() {
        if (this.f55563d.get() == null) {
            C40762x m = this.f55560a.mo63157b().mo95062A(new C20537b(new C20540a(this.f55562c))).mo95084m(new C20538c(new C20541b(this)));
            C41536l.m120488h(m, "override fun getInsuranc…chedProducts.get())\n    }");
            return m;
        }
        C40762x z = C40762x.m118162z(this.f55563d.get());
        C41536l.m120488h(z, "just(cachedProducts.get())");
        return z;
    }
}
