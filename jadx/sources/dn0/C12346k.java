package dn0;

import bn0.C10340a;
import bn0.C10341b;
import bn0.C10342c;
import cn0.C10519a;
import ed1.C40734b;
import ed1.C40739f;
import ed1.C40762x;
import g91.C32343x;
import he1.C41238w;
import hn0.C15539d;
import hn0.C15540e;
import hn0.C15541f;
import hn0.C15542g;
import hn0.C15543h;
import hn0.C15544i;
import hn0.C15545j;
import hn0.C15546k;
import in0.C15707a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.kyc.data.network.model.KycDataApiModel;
import p341ge.bog.mobilebank.kyc.data.network.model.QuestActivities;
import p341ge.bog.mobilebank.kyc.data.network.model.QuestPositions;
import p341ge.bog.mobilebank.kyc.data.network.model.QuestSourceAmount;
import p341ge.bog.mobilebank.kyc.data.network.model.QuestSourceProperty;
import ue1.C43075l;

/* renamed from: dn0.k */
public final class C12346k implements C15707a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10519a f36994a;

    /* renamed from: b */
    private final C10342c f36995b;

    /* renamed from: c */
    private final C10341b f36996c;

    /* renamed from: d */
    private final C10340a f36997d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AtomicReference f36998e = new AtomicReference();

    /* renamed from: dn0.k$a */
    /* synthetic */ class C12347a extends C41535k implements C43075l {
        C12347a(Object obj) {
            super(1, obj, C10340a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C10340a) this.receiver).mo26947a(list);
        }
    }

    /* renamed from: dn0.k$b */
    /* synthetic */ class C12348b extends C41535k implements C43075l {
        C12348b(Object obj) {
            super(1, obj, C10341b.class, "convert", "convert(Lge/bog/mobilebank/kyc/data/network/model/KycDataApiModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(KycDataApiModel kycDataApiModel) {
            C41536l.m120489i(kycDataApiModel, "p0");
            return ((C10341b) this.receiver).mo26948a(kycDataApiModel);
        }
    }

    /* renamed from: dn0.k$c */
    /* synthetic */ class C12349c extends C41535k implements C43075l {
        C12349c(Object obj) {
            super(1, obj, C10342c.class, "convert", "convert(Lge/bog/mobilebank/kyc/data/network/model/KycDataApiModel;)Lge/bog/mobilebank/kyc/domain/model/UserIdentityData;", 0);
        }

        /* renamed from: b */
        public final C15546k invoke(KycDataApiModel kycDataApiModel) {
            C41536l.m120489i(kycDataApiModel, "p0");
            return ((C10342c) this.receiver).mo26949a(kycDataApiModel);
        }
    }

    /* renamed from: dn0.k$d */
    static final class C12350d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12350d f36999d = new C12350d();

        C12350d() {
            super(1);
        }

        /* renamed from: a */
        public final C15540e invoke(KycDataApiModel kycDataApiModel) {
            String str;
            T t;
            C41536l.m120489i(kycDataApiModel, "it");
            List<QuestSourceAmount> sourceAmount = kycDataApiModel.getClient().getSourceAmount();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(sourceAmount, 10));
            for (QuestSourceAmount id : sourceAmount) {
                arrayList.add(Integer.valueOf(id.getId()));
            }
            Set D0 = C41358y.m119993D0(arrayList);
            Iterator<T> it = kycDataApiModel.getClient().getSourceAmount().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C41536l.m120484d(((QuestSourceAmount) t).getNoteMandatory(), "Y")) {
                    break;
                }
            }
            QuestSourceAmount questSourceAmount = (QuestSourceAmount) t;
            if (questSourceAmount != null) {
                str = questSourceAmount.getNote();
            }
            if (str == null) {
                str = "";
            }
            List<QuestSourceAmount> questSourceAmount2 = kycDataApiModel.getQuestSourceAmount();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(questSourceAmount2, 10));
            for (QuestSourceAmount questSourceAmount3 : questSourceAmount2) {
                arrayList2.add(new C15539d(questSourceAmount3.getId(), questSourceAmount3.getSourceAmountDesc(), C41536l.m120484d(questSourceAmount3.getNoteMandatory(), "Y")));
            }
            return new C15540e(D0, str, arrayList2);
        }
    }

    /* renamed from: dn0.k$e */
    static final class C12351e extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12351e f37000d = new C12351e();

        C12351e() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(KycDataApiModel kycDataApiModel) {
            C41536l.m120489i(kycDataApiModel, "it");
            List<QuestPositions> questPositions = kycDataApiModel.getQuestPositions();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(questPositions, 10));
            for (QuestPositions questPositions2 : questPositions) {
                arrayList.add(new C15541f(questPositions2.getId(), questPositions2.getPositionName()));
            }
            return arrayList;
        }
    }

    /* renamed from: dn0.k$f */
    static final class C12352f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12346k f37001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12352f(C12346k kVar) {
            super(1);
            this.f37001d = kVar;
        }

        /* renamed from: a */
        public final void mo32951a(KycDataApiModel kycDataApiModel) {
            this.f37001d.f36998e.set(kycDataApiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo32951a((KycDataApiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: dn0.k$g */
    static final class C12353g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12353g f37002d = new C12353g();

        C12353g() {
            super(1);
        }

        /* renamed from: a */
        public final C15543h invoke(KycDataApiModel kycDataApiModel) {
            C15541f fVar;
            T t;
            C41536l.m120489i(kycDataApiModel, "it");
            Integer activityTypeId = kycDataApiModel.getClient().getActivityTypeId();
            String nameOfOrganization = kycDataApiModel.getClient().getNameOfOrganization();
            Iterator<T> it = kycDataApiModel.getQuestPositions().iterator();
            while (true) {
                fVar = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C41536l.m120484d(String.valueOf(((QuestPositions) t).getId()), kycDataApiModel.getClient().getEmployeePosition())) {
                    break;
                }
            }
            QuestPositions questPositions = (QuestPositions) t;
            if (questPositions != null) {
                fVar = new C15541f(questPositions.getId(), questPositions.getPositionName());
            }
            List<QuestActivities> questActivities = kycDataApiModel.getQuestActivities();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(questActivities, 10));
            for (QuestActivities questActivities2 : questActivities) {
                arrayList.add(new C15542g(questActivities2.getId(), questActivities2.getActivityDesc(), questActivities2.getCode()));
            }
            return new C15543h(activityTypeId, nameOfOrganization, fVar, arrayList);
        }
    }

    /* renamed from: dn0.k$h */
    static final class C12354h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12354h f37003d = new C12354h();

        C12354h() {
            super(1);
        }

        /* renamed from: a */
        public final C15545j invoke(KycDataApiModel kycDataApiModel) {
            String str;
            T t;
            C41536l.m120489i(kycDataApiModel, "it");
            List<QuestSourceProperty> sourceProperty = kycDataApiModel.getClient().getSourceProperty();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(sourceProperty, 10));
            for (QuestSourceProperty id : sourceProperty) {
                arrayList.add(Integer.valueOf(id.getId()));
            }
            Set D0 = C41358y.m119993D0(arrayList);
            Iterator<T> it = kycDataApiModel.getClient().getSourceProperty().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C41536l.m120484d(((QuestSourceProperty) t).getNoteMandatory(), "Y")) {
                    break;
                }
            }
            QuestSourceProperty questSourceProperty = (QuestSourceProperty) t;
            if (questSourceProperty != null) {
                str = questSourceProperty.getNote();
            }
            if (str == null) {
                str = "";
            }
            List<QuestSourceProperty> questSourceProperty2 = kycDataApiModel.getQuestSourceProperty();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(questSourceProperty2, 10));
            for (QuestSourceProperty questSourceProperty3 : questSourceProperty2) {
                arrayList2.add(new C15544i(questSourceProperty3.getId(), questSourceProperty3.getSourcePropertyDesc(), C41536l.m120484d(questSourceProperty3.getNoteMandatory(), "Y")));
            }
            return new C15545j(D0, str, arrayList2);
        }
    }

    /* renamed from: dn0.k$i */
    static final class C12355i extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12355i f37004d = new C12355i();

        C12355i() {
            super(1);
        }

        /* renamed from: a */
        public final Long invoke(KycDataApiModel kycDataApiModel) {
            C41536l.m120489i(kycDataApiModel, "it");
            return Long.valueOf(kycDataApiModel.getClient().getQuestId());
        }
    }

    /* renamed from: dn0.k$j */
    static final class C12356j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12346k f37005d;

        /* renamed from: e */
        final /* synthetic */ String f37006e;

        /* renamed from: f */
        final /* synthetic */ String f37007f;

        /* renamed from: g */
        final /* synthetic */ String f37008g;

        /* renamed from: h */
        final /* synthetic */ String f37009h;

        /* renamed from: i */
        final /* synthetic */ String f37010i;

        /* renamed from: j */
        final /* synthetic */ String f37011j;

        /* renamed from: k */
        final /* synthetic */ String f37012k;

        /* renamed from: l */
        final /* synthetic */ String f37013l;

        /* renamed from: m */
        final /* synthetic */ int f37014m;

        /* renamed from: n */
        final /* synthetic */ String f37015n;

        /* renamed from: o */
        final /* synthetic */ Integer f37016o;

        /* renamed from: p */
        final /* synthetic */ boolean f37017p;

        /* renamed from: q */
        final /* synthetic */ int[] f37018q;

        /* renamed from: r */
        final /* synthetic */ String f37019r;

        /* renamed from: s */
        final /* synthetic */ int[] f37020s;

        /* renamed from: t */
        final /* synthetic */ String f37021t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12356j(C12346k kVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, Integer num, boolean z, int[] iArr, String str10, int[] iArr2, String str11) {
            super(1);
            this.f37005d = kVar;
            this.f37006e = str;
            this.f37007f = str2;
            this.f37008g = str3;
            this.f37009h = str4;
            this.f37010i = str5;
            this.f37011j = str6;
            this.f37012k = str7;
            this.f37013l = str8;
            this.f37014m = i;
            this.f37015n = str9;
            this.f37016o = num;
            this.f37017p = z;
            this.f37018q = iArr;
            this.f37019r = str10;
            this.f37020s = iArr2;
            this.f37021t = str11;
        }

        /* renamed from: a */
        public final C40739f invoke(Long l) {
            C41536l.m120489i(l, "it");
            return this.f37005d.f36994a.mo27247c(l.longValue(), this.f37006e, this.f37007f, this.f37008g, this.f37009h, this.f37010i, this.f37011j, this.f37012k, this.f37013l, this.f37014m, this.f37015n, this.f37016o, C32343x.m95468m1(this.f37017p), C41333m.m119781H(this.f37018q, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null), this.f37019r, C41333m.m119781H(this.f37020s, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null), this.f37021t);
        }
    }

    public C12346k(C10519a aVar, C10342c cVar, C10341b bVar, C10340a aVar2) {
        C41536l.m120489i(aVar, "kycService");
        C41536l.m120489i(cVar, "userIdentityDataMapper");
        C41536l.m120489i(bVar, "countryListMapper");
        C41536l.m120489i(aVar2, "cityListMapper");
        this.f36994a = aVar;
        this.f36995b = cVar;
        this.f36996c = bVar;
        this.f36997d = aVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final List m47296o(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final List m47297p(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final C15546k m47298q(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15546k) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final C15540e m47299r(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15540e) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final List m47300s(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: t */
    private final C40762x m47301t() {
        KycDataApiModel kycDataApiModel = (KycDataApiModel) this.f36998e.get();
        if (kycDataApiModel != null) {
            C40762x z = C40762x.m118162z(kycDataApiModel);
            C41536l.m120488h(z, "{\n            Single.just(kycData)\n        }");
            return z;
        }
        C40762x m = this.f36994a.getData().mo95084m(new C12343h(new C12352f(this)));
        C41536l.m120488h(m, "private fun getKycData()…        }\n        }\n    }");
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m47302u(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final C15543h m47303v(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15543h) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final C15545j m47304w(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C15545j) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final Long m47305x(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Long) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final C40739f m47306y(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40739f) lVar.invoke(obj);
    }

    /* renamed from: D */
    public C40762x mo32938D() {
        C40762x A = m47301t().mo95062A(new C12338c(C12351e.f37000d));
        C41536l.m120488h(A, "getKycData().map {\n     …)\n            }\n        }");
        return A;
    }

    /* renamed from: E */
    public C40762x mo32939E() {
        C40762x A = m47301t().mo95062A(new C12342g(C12354h.f37003d));
        C41536l.m120488h(A, "getKycData().map {\n     …}\n            )\n        }");
        return A;
    }

    /* renamed from: F */
    public C40734b mo32940F(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, Integer num, boolean z, int[] iArr, String str10, int[] iArr2, String str11) {
        C41536l.m120489i(str, "homeAddressCountry");
        C41536l.m120489i(str2, "homeAddressRegion");
        C41536l.m120489i(str3, "homeAddressLine");
        C41536l.m120489i(str4, "facAddressCountry");
        C41536l.m120489i(str5, "facAddressRegion");
        C41536l.m120489i(str6, "facAddressLine");
        C41536l.m120489i(str7, "srcCountry");
        C41536l.m120489i(str8, "srcCountry2");
        C41536l.m120489i(str9, "nameOfOrganization");
        C41536l.m120489i(iArr, "propertySource");
        C41536l.m120489i(str10, "propertyOtherNote");
        C41536l.m120489i(iArr2, "amountSource");
        C41536l.m120489i(str11, "amountOtherNote");
        C40762x A = m47301t().mo95062A(new C12344i(C12355i.f37004d));
        C12356j jVar = r0;
        C12356j jVar2 = new C12356j(this, str, str2, str3, str4, str5, str6, str7, str8, i, str9, num, z, iArr, str10, iArr2, str11);
        C40734b s = A.mo95088s(new C12345j(jVar));
        C41536l.m120488h(s, "override fun submitData(…        )\n        }\n    }");
        return s;
    }

    /* renamed from: G */
    public C40762x mo32941G() {
        C40762x A = m47301t().mo95062A(new C12340e(C12353g.f37002d));
        C41536l.m120488h(A, "getKycData().map {\n     …}\n            )\n        }");
        return A;
    }

    /* renamed from: H */
    public C40762x mo32942H() {
        C40762x A = m47301t().mo95062A(new C12337b(new C12349c(this.f36995b)));
        C41536l.m120488h(A, "getKycData().map(userIdentityDataMapper::convert)");
        return A;
    }

    /* renamed from: I */
    public C40762x mo32943I() {
        C40762x A = m47301t().mo95062A(new C12341f(C12350d.f36999d));
        C41536l.m120488h(A, "getKycData().map {\n     …}\n            )\n        }");
        return A;
    }

    /* renamed from: a */
    public C40762x mo32944a() {
        C40762x A = m47301t().mo95062A(new C12336a(new C12348b(this.f36996c)));
        C41536l.m120488h(A, "getKycData().map(countryListMapper::convert)");
        return A;
    }

    /* renamed from: b */
    public C40762x mo32945b(String str) {
        C41536l.m120489i(str, "countryCode");
        C40762x A = this.f36994a.mo27246b(str).mo95062A(new C12339d(new C12347a(this.f36997d)));
        C41536l.m120488h(A, "kycService.getCities(cou…(cityListMapper::convert)");
        return A;
    }
}
