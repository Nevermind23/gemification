package p465ik;

import ed1.C40749p;
import ed1.C40762x;
import ee1.C40765a;
import he1.C41238w;
import iu0.C36546y;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.GetInsuranceCardsApiResponseModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.PolicyUrlApiModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.data.model.RegisterPolicyResultApiModel;
import p341ge.bog.mobilebank.autoliabilityinsurance.domain.model.PolicyDetailsModel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p465ik.C15687m;
import p479jk.C16205a;
import p479jk.C16206b;
import p479jk.C16207c;
import p479jk.C16209d;
import p521mk.C16718a;
import p563pk.C17378h;
import p563pk.C17382l;
import p563pk.C17383m;
import ue1.C43075l;

/* renamed from: ik.l */
public final class C15674l implements C16718a {

    /* renamed from: i */
    public static final C15675a f44492i = new C15675a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C15687m f44493a;

    /* renamed from: b */
    private final C16207c f44494b;

    /* renamed from: c */
    private final C16205a f44495c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16209d f44496d;

    /* renamed from: e */
    private final C16206b f44497e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C40765a f44498f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C40765a f44499g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C40765a f44500h;

    /* renamed from: ik.l$a */
    public static final class C15675a {
        private C15675a() {
        }

        public /* synthetic */ C15675a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ik.l$b */
    /* synthetic */ class C15676b extends C41535k implements C43075l {
        C15676b(Object obj) {
            super(1, obj, C16206b.class, "convert", "convert(Lge/bog/mobilebank/autoliabilityinsurance/data/model/GetInsuranceCardsApiResponseModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(GetInsuranceCardsApiResponseModel getInsuranceCardsApiResponseModel) {
            C41536l.m120489i(getInsuranceCardsApiResponseModel, "p0");
            return ((C16206b) this.receiver).mo43221a(getInsuranceCardsApiResponseModel);
        }
    }

    /* renamed from: ik.l$c */
    static final class C15677c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15674l f44501d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15677c(C15674l lVar) {
            super(1);
            this.f44501d = lVar;
        }

        /* renamed from: a */
        public final void mo42978a(List list) {
            this.f44501d.f44499g.onNext(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42978a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ik.l$d */
    static final class C15678d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15674l f44502d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15678d(C15674l lVar) {
            super(1);
            this.f44502d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f44502d.f44499g.onNext(C41341q.m119907j());
        }
    }

    /* renamed from: ik.l$e */
    static final class C15679e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C15679e f44503d = new C15679e();

        C15679e() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(List list) {
            C41536l.m120489i(list, "it");
            return Boolean.valueOf(!list.isEmpty());
        }
    }

    /* renamed from: ik.l$f */
    /* synthetic */ class C15680f extends C41535k implements C43075l {
        C15680f(Object obj) {
            super(1, obj, C16207c.class, "convert", "convert(Ljava/util/List;)Lge/bog/mobilebank/autoliabilityinsurance/domain/model/LimitType;", 0);
        }

        /* renamed from: b */
        public final C17378h invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C16207c) this.receiver).mo43223a(list);
        }
    }

    /* renamed from: ik.l$g */
    static final class C15681g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C15681g f44504d = new C15681g();

        C15681g() {
            super(1);
        }

        /* renamed from: a */
        public final C17382l invoke(PolicyUrlApiModel policyUrlApiModel) {
            C41536l.m120489i(policyUrlApiModel, "it");
            return new C17382l(policyUrlApiModel.getPolicyUrl());
        }
    }

    /* renamed from: ik.l$h */
    /* synthetic */ class C15682h extends C41535k implements C43075l {
        C15682h(Object obj) {
            super(1, obj, C16205a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C16205a) this.receiver).mo43220a(list);
        }
    }

    /* renamed from: ik.l$i */
    static final class C15683i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15674l f44505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15683i(C15674l lVar) {
            super(1);
            this.f44505d = lVar;
        }

        /* renamed from: a */
        public final void mo42984a(List list) {
            this.f44505d.f44498f.onNext(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42984a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ik.l$j */
    static final class C15684j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15674l f44506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15684j(C15674l lVar) {
            super(1);
            this.f44506d = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f44506d.f44498f.onNext(C41341q.m119907j());
        }
    }

    /* renamed from: ik.l$k */
    static final class C15685k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15674l f44507d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15685k(C15674l lVar) {
            super(1);
            this.f44507d = lVar;
        }

        /* renamed from: a */
        public final C17383m invoke(BankApiResponse bankApiResponse) {
            C41536l.m120489i(bankApiResponse, "it");
            Object result = bankApiResponse.getResult();
            if (result != null) {
                RegisterPolicyResultApiModel registerPolicyResultApiModel = (RegisterPolicyResultApiModel) result;
                return new C17383m(Boolean.valueOf(registerPolicyResultApiModel.getPaymentSucceeded()), this.f44507d.f44496d.mo43224a(registerPolicyResultApiModel.getPolicy()));
            }
            throw new IllegalArgumentException("registerInsurancePolicy result shouldn't be null".toString());
        }
    }

    /* renamed from: ik.l$l */
    static final class C15686l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C15674l f44508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15686l(C15674l lVar) {
            super(1);
            this.f44508d = lVar;
        }

        /* renamed from: a */
        public final void mo42987a(C17383m mVar) {
            this.f44508d.f44500h.onNext(mVar.mo44888b());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo42987a((C17383m) obj);
            return C41238w.f97225a;
        }
    }

    public C15674l(C15687m mVar, C16207c cVar, C16205a aVar, C16209d dVar, C16206b bVar) {
        C41536l.m120489i(mVar, "service");
        C41536l.m120489i(cVar, "limitTypeMapper");
        C41536l.m120489i(aVar, "providersMapper");
        C41536l.m120489i(dVar, "policyMapper");
        C41536l.m120489i(bVar, "cardsMapper");
        this.f44493a = mVar;
        this.f44494b = cVar;
        this.f44495c = aVar;
        this.f44496d = dVar;
        this.f44497e = bVar;
        C40765a i1 = C40765a.m118199i1(C41341q.m119907j());
        C41536l.m120488h(i1, "createDefault<List<AutoL…    emptyList()\n        )");
        this.f44498f = i1;
        C40765a i12 = C40765a.m118199i1(C41341q.m119907j());
        C41536l.m120488h(i12, "createDefault<List<Insur…    emptyList()\n        )");
        this.f44499g = i12;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<PolicyDetailsModel>()");
        this.f44500h = h1;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final boolean m56474A(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final C17378h m56475B(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17378h) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final C17382l m56476C(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17382l) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final List m56477D(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static final void m56478E(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final void m56479F(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final C17383m m56480G(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17383m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final void m56481H(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final List m56497x(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m56498y(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m56499z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: L1 */
    public C40762x mo42968L1() {
        C40762x A = C15687m.C15688a.m56523b(this.f44493a, (String) null, 1, (Object) null).mo95062A(new C15668f(new C15680f(this.f44494b)));
        C41536l.m120488h(A, "service.getLimits().map(limitTypeMapper::convert)");
        return A;
    }

    /* renamed from: a */
    public C40762x mo42969a(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.put("processReference", C36546y.m108285N().mo89317P().getExtCustomerId());
        C40762x m = this.f44493a.mo42988a(hashMap2).mo95062A(new C15670h(new C15685k(this))).mo95084m(new C15671i(new C15686l(this)));
        C41536l.m120488h(m, "override fun registerIns…licy)\n            }\n    }");
        return m;
    }

    /* renamed from: b */
    public C40762x mo42970b() {
        C40762x k = C15687m.C15688a.m56522a(this.f44493a, (String) null, 1, (Object) null).mo95062A(new C15672j(new C15676b(this.f44497e))).mo95084m(new C15673k(new C15677c(this))).mo95082k(new C15664b(new C15678d(this)));
        C41536l.m120488h(k, "override fun getInsuranc…tyList())\n        }\n    }");
        return k;
    }

    /* renamed from: c */
    public C40762x mo42971c(String str) {
        C41536l.m120489i(str, "ccy");
        C40762x k = this.f44493a.mo42990c(str).mo95062A(new C15665c(new C15682h(this.f44495c))).mo95084m(new C15666d(new C15683i(this))).mo95082k(new C15667e(new C15684j(this)));
        C41536l.m120488h(k, "override fun getProvider…tyList())\n        }\n    }");
        return k;
    }

    /* renamed from: d */
    public C40762x mo42972d(long j) {
        C40762x A = this.f44493a.mo42991d(j).mo95062A(new C15669g(C15681g.f44504d));
        C41536l.m120488h(A, "service.getPolicyPdf(doc…PolicyUrl(it.policyUrl) }");
        return A;
    }

    /* renamed from: e */
    public C40749p mo42973e() {
        C40749p M = this.f44498f.mo94990M(new C15663a(C15679e.f44503d));
        C41536l.m120488h(M, "loadedProviders.filter { it.isNotEmpty() }");
        return M;
    }

    /* renamed from: f */
    public C40749p mo42974f() {
        return this.f44499g;
    }

    /* renamed from: g */
    public void mo42975g(PolicyDetailsModel policyDetailsModel) {
        C41536l.m120489i(policyDetailsModel, "policy");
        this.f44500h.onNext(policyDetailsModel);
    }

    /* renamed from: h */
    public C40762x mo42976h() {
        C40762x P = this.f44500h.mo94996P();
        C41536l.m120488h(P, "selectedPolicy.firstOrError()");
        return P;
    }
}
