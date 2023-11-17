package ol0;

import ed1.C40749p;
import ed1.C40762x;
import hd0.C24978b;
import iu0.C36546y;
import j51.C36735g;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m51.C37228a;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.PolicyUrlApiModel;
import p341ge.bog.mobilebank.insurance.travelinsurance.data.model.RegisterPolicyResultApiModel;
import pl0.C27599a;
import ql0.C27846b;
import ql0.C27849c;
import ql0.C27850d;
import sl0.C28248a;
import ue1.C43075l;
import ul0.C28876c;
import ul0.C28877d;
import ul0.C28879f;

/* renamed from: ol0.g */
public final class C27043g implements C28248a {

    /* renamed from: f */
    public static final C27044a f67912f = new C27044a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C27599a f67913a;

    /* renamed from: b */
    private final C27850d f67914b;

    /* renamed from: c */
    private final C27846b f67915c;

    /* renamed from: d */
    private final C27849c f67916d;

    /* renamed from: e */
    private final C36735g f67917e;

    /* renamed from: ol0.g$a */
    public static final class C27044a {
        private C27044a() {
        }

        public /* synthetic */ C27044a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ol0.g$b */
    /* synthetic */ class C27045b extends C41535k implements C43075l {
        C27045b(Object obj) {
            super(1, obj, C27846b.class, "convert", "convert(Ljava/util/List;)Lge/bog/mobilebank/insurance/travelinsurance/domain/model/LimitType;", 0);
        }

        /* renamed from: b */
        public final C28876c invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C27846b) this.receiver).mo67364a(list);
        }
    }

    /* renamed from: ol0.g$c */
    /* synthetic */ class C27046c extends C41535k implements C43075l {
        C27046c(Object obj) {
            super(1, obj, C27850d.class, "map", "map(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C27850d) this.receiver).mo67367a(list);
        }
    }

    /* renamed from: ol0.g$d */
    /* synthetic */ class C27047d extends C41535k implements C43075l {
        C27047d(Object obj) {
            super(1, obj, C27850d.class, "map", "map(Lge/bog/mobilebank/insurance/travelinsurance/data/model/PolicyUrlApiModel;)Lge/bog/mobilebank/insurance/travelinsurance/domain/model/PolicyUrl;", 0);
        }

        /* renamed from: b */
        public final C28877d invoke(PolicyUrlApiModel policyUrlApiModel) {
            C41536l.m120489i(policyUrlApiModel, "p0");
            return ((C27850d) this.receiver).mo67368b(policyUrlApiModel);
        }
    }

    /* renamed from: ol0.g$e */
    /* synthetic */ class C27048e extends C41535k implements C43075l {
        C27048e(Object obj) {
            super(1, obj, C27849c.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C27849c) this.receiver).mo67366a(list);
        }
    }

    /* renamed from: ol0.g$f */
    static final class C27049f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C27049f f67918d = new C27049f();

        C27049f() {
            super(1);
        }

        /* renamed from: a */
        public final C28879f invoke(RegisterPolicyResultApiModel registerPolicyResultApiModel) {
            C41536l.m120489i(registerPolicyResultApiModel, "it");
            return new C28879f(registerPolicyResultApiModel.getDocKey(), registerPolicyResultApiModel.getErrorCode());
        }
    }

    public C27043g(C27599a aVar, C27850d dVar, C27846b bVar, C27849c cVar, C36735g gVar) {
        C41536l.m120489i(aVar, "travelInsuranceService");
        C41536l.m120489i(dVar, "mapper");
        C41536l.m120489i(bVar, "limitTypeMapper");
        C41536l.m120489i(cVar, "insuredPersonMapper");
        C41536l.m120489i(gVar, "getLoginInfo");
        this.f67913a = aVar;
        this.f67914b = dVar;
        this.f67915c = bVar;
        this.f67916d = cVar;
        this.f67917e = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C28876c m83857k(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28876c) lVar.invoke(obj);
    }

    /* renamed from: l */
    private final C40749p m83858l(String str, String str2, String str3, String str4, Long l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (l != null) {
            String str5 = (String) linkedHashMap.put("birthDate", String.valueOf(l.longValue()));
        }
        C40749p O = this.f67913a.mo66970d(str, str2, str3, str4, linkedHashMap).mo95062A(new C27041e(new C27046c(this.f67914b))).mo95075O();
        C41536l.m120488h(O, "travelInsuranceService.g…pper::map).toObservable()");
        return O;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final List m83859m(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final C28877d m83860n(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28877d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final List m83861o(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final C28879f m83862p(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28879f) lVar.invoke(obj);
    }

    /* renamed from: a */
    public C40762x mo66269a(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.put("processReference", C36546y.m108285N().mo89317P().getExtCustomerId());
        C40762x A = this.f67913a.mo66967a(hashMap2).mo95062A(new C27040d(C27049f.f67918d));
        C41536l.m120488h(A, "travelInsuranceService.r…t.docKey, it.errorCode) }");
        return A;
    }

    /* renamed from: b */
    public C40762x mo66270b() {
        Long l;
        C27599a aVar = this.f67913a;
        C37228a a = this.f67917e.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        C40762x A = aVar.mo66971e(String.valueOf(l)).mo95062A(new C27042f(new C27048e(this.f67916d)));
        C41536l.m120488h(A, "travelInsuranceService.g…redPersonMapper::convert)");
        return A;
    }

    /* renamed from: c */
    public C40762x mo66271c(int i) {
        C40762x A = this.f67913a.mo66969c(i).mo95062A(new C27038b(new C27047d(this.f67914b)));
        C41536l.m120488h(A, "travelInsuranceService.g…(docKey).map(mapper::map)");
        return A;
    }

    /* renamed from: d */
    public C40762x mo66272d(String str) {
        C41536l.m120489i(str, "prodType");
        C40762x A = this.f67913a.mo66968b(str).mo95062A(new C27039c(new C27045b(this.f67915c)));
        C41536l.m120488h(A, "travelInsuranceService.g…limitTypeMapper::convert)");
        return A;
    }

    /* renamed from: e */
    public C40749p mo66273e(boolean z, String str, String str2, String str3, boolean z2, Long l) {
        C41536l.m120489i(str, "startDate");
        C41536l.m120489i(str2, "endDate");
        C41536l.m120489i(str3, "ccy");
        String e = C24978b.m79846b(Boolean.valueOf(z2)).mo63391e();
        C41536l.m120488h(e, "fromBoolean(addCoverage).value");
        return m83858l(str, str2, str3, e, l);
    }
}
