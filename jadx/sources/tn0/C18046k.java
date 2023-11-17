package tn0;

import ao0.C10119a;
import ao0.C10121b;
import ao0.C10122c;
import ao0.C10123d;
import ao0.C10125f;
import bo0.C10344a;
import ed1.C40734b;
import ed1.C40762x;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleBnplApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleChooserIsAllowedApiEntity;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferCategoryApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferCategoryDescriptionApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOfferSimpleApiModel;
import p341ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleOffersApiModel;
import ue1.C43075l;
import un0.C18263a;
import vn0.C18459a;
import wn0.C18644a;
import wn0.C18645b;

/* renamed from: tn0.k */
public final class C18046k implements C10344a {

    /* renamed from: i */
    public static final C18047a f51274i = new C18047a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C18263a f51275d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C18459a f51276e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C18645b f51277f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C18644a f51278g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicReference f51279h = new AtomicReference();

    /* renamed from: tn0.k$a */
    public static final class C18047a {
        private C18047a() {
        }

        public /* synthetic */ C18047a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: tn0.k$b */
    static final class C18048b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C18048b f51280d = new C18048b();

        C18048b() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C10125f fVar) {
            C41536l.m120489i(fVar, "offers");
            return fVar.mo26627a();
        }
    }

    /* renamed from: tn0.k$c */
    static final class C18049c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18046k f51281d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18049c(C18046k kVar) {
            super(1);
            this.f51281d = kVar;
        }

        /* renamed from: a */
        public final C10121b invoke(LifestyleBnplApiModel lifestyleBnplApiModel) {
            C41536l.m120489i(lifestyleBnplApiModel, "data");
            return this.f51281d.f51278g.mo46475b(lifestyleBnplApiModel);
        }
    }

    /* renamed from: tn0.k$d */
    static final class C18050d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18046k f51282d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18050d(C18046k kVar) {
            super(1);
            this.f51282d = kVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "data");
            return this.f51282d.f51277f.mo46481f(list);
        }
    }

    /* renamed from: tn0.k$e */
    static final class C18051e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18046k f51283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18051e(C18046k kVar) {
            super(1);
            this.f51283d = kVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "data");
            return this.f51283d.f51277f.mo46479d(list);
        }
    }

    /* renamed from: tn0.k$f */
    static final class C18052f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C18052f f51284d = new C18052f();

        C18052f() {
            super(1);
        }

        /* renamed from: a */
        public final List invoke(C10125f fVar) {
            C41536l.m120489i(fVar, "offers");
            return fVar.mo26628b();
        }
    }

    /* renamed from: tn0.k$g */
    static final class C18053g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f51285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18053g(long j) {
            super(1);
            this.f51285d = j;
        }

        /* renamed from: a */
        public final C10122c invoke(C10125f fVar) {
            Object obj;
            boolean z;
            C41536l.m120489i(fVar, "offers");
            List<C10123d> a = fVar.mo26627a();
            ArrayList arrayList = new ArrayList();
            for (C10123d f : a) {
                boolean unused = C41352v.m119965z(arrayList, f.mo26619f());
            }
            long j = this.f51285d;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C10122c) obj).mo26605o() == j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C10122c cVar = (C10122c) obj;
            if (cVar == null) {
                return new C10122c(-1, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (C10119a) null, (String) null, (String) null, (Long) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2097150, (DefaultConstructorMarker) null);
            }
            return cVar;
        }
    }

    /* renamed from: tn0.k$h */
    static final class C18054h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18046k f51286d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18054h(C18046k kVar) {
            super(1);
            this.f51286d = kVar;
        }

        /* renamed from: a */
        public final C10125f invoke(LifestyleOffersApiModel lifestyleOffersApiModel) {
            C41536l.m120489i(lifestyleOffersApiModel, "data");
            return this.f51286d.f51276e.mo46239c(lifestyleOffersApiModel.getAllOffersCategories(), this.f51286d.m62044D4(lifestyleOffersApiModel.getTopOffers(), lifestyleOffersApiModel.getAllOffersCategories()), this.f51286d.m62042B4(lifestyleOffersApiModel.getRecommendedOffers(), lifestyleOffersApiModel.getAllOffersCategories()), this.f51286d.m62042B4(lifestyleOffersApiModel.getLastMinuteOffers(), lifestyleOffersApiModel.getAllOffersCategories()), this.f51286d.m62043C4(lifestyleOffersApiModel));
        }
    }

    /* renamed from: tn0.k$i */
    static final class C18055i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18046k f51287d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18055i(C18046k kVar) {
            super(1);
            this.f51287d = kVar;
        }

        /* renamed from: a */
        public final void mo45748a(C10125f fVar) {
            this.f51287d.f51279h.set(fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45748a((C10125f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tn0.k$j */
    /* synthetic */ class C18056j extends C41535k implements C43075l {
        C18056j(Object obj) {
            super(1, obj, C18459a.class, "transform", "transformOfferProgressApiModelList(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C18459a) this.receiver).mo46244h(list);
        }
    }

    /* renamed from: tn0.k$k */
    static final class C18057k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18046k f51288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18057k(C18046k kVar) {
            super(1);
            this.f51288d = kVar;
        }

        /* renamed from: a */
        public final Boolean invoke(LifestyleChooserIsAllowedApiEntity lifestyleChooserIsAllowedApiEntity) {
            C41536l.m120489i(lifestyleChooserIsAllowedApiEntity, "isAllowed");
            return Boolean.valueOf(this.f51288d.f51276e.mo46242f(lifestyleChooserIsAllowedApiEntity));
        }
    }

    public C18046k(C18263a aVar, C18459a aVar2, C18645b bVar, C18644a aVar3) {
        C41536l.m120489i(aVar, "service");
        C41536l.m120489i(aVar2, "mapper");
        C41536l.m120489i(bVar, "chooserMapper");
        C41536l.m120489i(aVar3, "bnplMapper");
        this.f51275d = aVar;
        this.f51276e = aVar2;
        this.f51277f = bVar;
        this.f51278g = aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: A4 */
    public static final Boolean m62041A4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: B4 */
    public final List m62042B4(List list, List list2) {
        ArrayList arrayList;
        LifestyleOfferApiModel lifestyleOfferApiModel;
        Object obj;
        if (list2 != null) {
            arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                List<LifestyleOfferApiModel> offers = ((LifestyleOfferCategoryApiModel) it.next()).getOffers();
                if (offers == null) {
                    offers = C41341q.m119907j();
                }
                boolean unused = C41352v.m119965z(arrayList, offers);
            }
        } else {
            arrayList = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LifestyleOfferSimpleApiModel lifestyleOfferSimpleApiModel = (LifestyleOfferSimpleApiModel) it2.next();
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (C41536l.m120484d(((LifestyleOfferApiModel) obj).getOfrId(), lifestyleOfferSimpleApiModel.getOfrId())) {
                        break;
                    }
                }
                lifestyleOfferApiModel = (LifestyleOfferApiModel) obj;
            } else {
                lifestyleOfferApiModel = null;
            }
            arrayList2.add(lifestyleOfferApiModel);
        }
        return C41358y.m120004T(arrayList2);
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public final List m62043C4(LifestyleOffersApiModel lifestyleOffersApiModel) {
        List<LifestyleOfferCategoryApiModel> allOffersCategories = lifestyleOffersApiModel.getAllOffersCategories();
        if (allOffersCategories == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : allOffersCategories) {
            LifestyleOfferCategoryApiModel lifestyleOfferCategoryApiModel = (LifestyleOfferCategoryApiModel) next;
            List<LifestyleOfferCategoryDescriptionApiModel> topCategories = lifestyleOffersApiModel.getTopCategories();
            boolean z = false;
            if (topCategories != null && !topCategories.isEmpty()) {
                Iterator<T> it = topCategories.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C41536l.m120484d(((LifestyleOfferCategoryDescriptionApiModel) it.next()).getCategoryId(), lifestyleOfferCategoryApiModel.getCategoryId())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: D4 */
    public final List m62044D4(List list, List list2) {
        boolean z;
        List B4 = m62042B4(list, list2);
        if (B4 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : B4) {
            String bannerImageUrl = ((LifestyleOfferApiModel) next).getBannerImageUrl();
            if (bannerImageUrl == null || bannerImageUrl.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final List m62062r4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final C10121b m62063s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C10121b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public static final List m62064t4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final List m62065u4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public static final List m62066v4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static final C10122c m62067w4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C10122c) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: x4 */
    public static final C10125f m62068x4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C10125f) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: y4 */
    public static final void m62069y4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: z4 */
    public static final List m62070z4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: G2 */
    public C40762x mo26966G2(long j) {
        C40762x A = C10344a.C10345a.m37654a(this, false, false, 3, (Object) null).mo95062A(new C18036a(new C18053g(j)));
        C41536l.m120488h(A, "offerId: Long): Single<L…estyleOffer(-1)\n        }");
        return A;
    }

    /* renamed from: H1 */
    public C40734b mo26967H1(List list) {
        C41536l.m120489i(list, "interestIds");
        return this.f51275d.mo45910a(C41358y.m120017g0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null));
    }

    /* renamed from: M3 */
    public C40762x mo26968M3() {
        C40762x A = this.f51275d.mo45913d().mo95062A(new C18044i(new C18050d(this)));
        C41536l.m120488h(A, "override fun getChooserI…r.transform(data) }\n    }");
        return A;
    }

    /* renamed from: P */
    public C40762x mo26969P() {
        C40762x A = this.f51275d.mo45908P().mo95062A(new C18045j(new C18049c(this)));
        C41536l.m120488h(A, "override fun getBnplMerc…r.transform(data) }\n    }");
        return A;
    }

    /* renamed from: W3 */
    public C40762x mo26970W3(boolean z, boolean z2) {
        String str;
        if (z || this.f51279h.get() == null) {
            C18263a aVar = this.f51275d;
            if (z2) {
                str = "BNPL";
            } else {
                str = null;
            }
            C40762x m = aVar.mo45911b(str).mo95062A(new C18040e(new C18054h(this))).mo95084m(new C18041f(new C18055i(this)));
            C41536l.m120488h(m, "override fun getOffers(r…rs.get())\n        }\n    }");
            return m;
        }
        C40762x z3 = C40762x.m118162z(this.f51279h.get());
        C41536l.m120488h(z3, "{\n            Single.jus…edOffers.get())\n        }");
        return z3;
    }

    /* renamed from: Z */
    public C40762x mo26971Z() {
        C40762x A = this.f51275d.mo45909Z().mo95062A(new C18039d(new C18056j(this.f51276e)));
        C41536l.m120488h(A, "service.getOffersProgress().map(mapper::transform)");
        return A;
    }

    /* renamed from: c1 */
    public C40762x mo26972c1() {
        C40762x A = this.f51275d.mo45912c().mo95062A(new C18042g(new C18051e(this)));
        C41536l.m120488h(A, "override fun getClientIn…data)\n            }\n    }");
        return A;
    }

    public void clean() {
        this.f51279h.set((Object) null);
    }

    /* renamed from: e */
    public C40762x mo26973e() {
        C40762x A = this.f51275d.mo45914e().mo95062A(new C18043h(new C18057k(this)));
        C41536l.m120488h(A, "override fun isLifestyle…nsform(isAllowed) }\n    }");
        return A;
    }

    /* renamed from: k2 */
    public C40762x mo26974k2() {
        C40762x A = C10344a.C10345a.m37654a(this, false, false, 3, (Object) null).mo95062A(new C18038c(C18048b.f51280d));
        C41536l.m120488h(A, "getOffers().map { offers…ers.allOffersCategories }");
        return A;
    }

    /* renamed from: m0 */
    public C40734b mo26975m0(String str, List list) {
        C41536l.m120489i(str, "interestType");
        C41536l.m120489i(list, "interestSubTypes");
        return this.f51275d.mo45915f(str, C41358y.m120017g0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null));
    }

    /* renamed from: v2 */
    public C40762x mo26976v2() {
        C40762x A = C10344a.C10345a.m37654a(this, false, false, 3, (Object) null).mo95062A(new C18037b(C18052f.f51284d));
        C41536l.m120488h(A, "getOffers().map { offers…offers.lastMinuteOffers }");
        return A;
    }
}
