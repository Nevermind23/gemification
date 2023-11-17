package p494kl;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import hd1.C41205b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import nd0.C26453c;
import od0.C26940a;
import od0.C26941b;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplMerchantStoreApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplObjectApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BnplScheduleHistoryItemApiEntity;
import p341ge.bog.mobilebank.bnpl.data.entity.BplCategopriesWithMerchantsApiEntity;
import p508ll.C16585a;
import p522ml.C16720a;
import p522ml.C16721b;
import p522ml.C16722c;
import p564pl.C17385a;
import p606sl.C17847m;
import p606sl.C17850p;
import pd0.C27503h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: kl.f */
public final class C16473f implements C17385a, C26941b {

    /* renamed from: d */
    private final C16585a f46621d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C16720a f46622e;

    /* renamed from: f */
    private final C16721b f46623f;

    /* renamed from: g */
    private final C16722c f46624g;

    /* renamed from: h */
    private final /* synthetic */ C26940a f46625h = new C26940a();

    /* renamed from: i */
    private final C27503h f46626i = mo43631g4(new C27503h());

    /* renamed from: kl.f$a */
    /* synthetic */ class C16474a extends C41535k implements C43075l {
        C16474a(Object obj) {
            super(1, obj, C16720a.class, "convertCategories", "convertCategories(Lge/bog/mobilebank/bnpl/data/entity/BplCategopriesWithMerchantsApiEntity;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(BplCategopriesWithMerchantsApiEntity bplCategopriesWithMerchantsApiEntity) {
            C41536l.m120489i(bplCategopriesWithMerchantsApiEntity, "p0");
            return ((C16720a) this.receiver).mo43849l(bplCategopriesWithMerchantsApiEntity);
        }
    }

    /* renamed from: kl.f$b */
    /* synthetic */ class C16475b extends C41535k implements C43075l {
        C16475b(Object obj) {
            super(1, obj, C16720a.class, "convert", "convert(Lge/bog/mobilebank/bnpl/data/entity/BnplObjectApiEntity;)Lge/bog/mobilebank/bnpl/domain/model/BnplObject;", 0);
        }

        /* renamed from: b */
        public final C17847m invoke(BnplObjectApiEntity bnplObjectApiEntity) {
            C41536l.m120489i(bnplObjectApiEntity, "p0");
            return ((C16720a) this.receiver).mo43846i(bnplObjectApiEntity);
        }
    }

    /* renamed from: kl.f$c */
    /* synthetic */ class C16476c extends C41535k implements C43075l {
        C16476c(Object obj) {
            super(1, obj, C16722c.class, "convert", "convert(Lge/bog/mobilebank/bnpl/data/entity/BnplScheduleHistoryItemApiEntity;)Lge/bog/mobilebank/bnpl/domain/model/BnplScheduleHistory;", 0);
        }

        /* renamed from: b */
        public final C17850p invoke(BnplScheduleHistoryItemApiEntity bnplScheduleHistoryItemApiEntity) {
            C41536l.m120489i(bnplScheduleHistoryItemApiEntity, "p0");
            return ((C16722c) this.receiver).mo43853c(bnplScheduleHistoryItemApiEntity);
        }
    }

    /* renamed from: kl.f$d */
    /* synthetic */ class C16477d extends C41535k implements C43075l {
        C16477d(Object obj) {
            super(1, obj, C16721b.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C16721b) this.receiver).mo43850a(list);
        }
    }

    /* renamed from: kl.f$e */
    static final class C16478e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16473f f46627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16478e(C16473f fVar) {
            super(1);
            this.f46627d = fVar;
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "it");
            C16720a e4 = this.f46627d.f46622e;
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(e4.mo43845h((BnplMerchantStoreApiEntity) it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: kl.f$f */
    /* synthetic */ class C16479f extends C41535k implements C43064a {
        C16479f(Object obj) {
            super(0, obj, C16473f.class, "getBnplObservable", "getBnplObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C16473f) this.receiver).m58685j4();
        }
    }

    public C16473f(C16585a aVar, C16720a aVar2, C16721b bVar, C16722c cVar) {
        C41536l.m120489i(aVar, "bnplServiceApi");
        C41536l.m120489i(aVar2, "bnplMapper");
        C41536l.m120489i(bVar, "bnplOffersMapper");
        C41536l.m120489i(cVar, "bnplScheduleAndHistoryMapper");
        this.f46621d = aVar;
        this.f46622e = aVar2;
        this.f46623f = bVar;
        this.f46624g = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i4 */
    public static final List m58684i4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public final C40749p m58685j4() {
        return this.f46621d.mo43739v().mo95026k0(new C16469b(new C16475b(this.f46622e)));
    }

    /* access modifiers changed from: private */
    /* renamed from: k4 */
    public static final C17847m m58686k4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17847m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final C17850p m58687l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17850p) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final List m58688m4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final List m58689n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: p4 */
    private final C41205b m58690p4(boolean z) {
        return this.f46626i.mo66814o(z, new C16479f(this)).mo94979E0();
    }

    /* renamed from: T3 */
    public C40749p mo43627T3(boolean z) {
        C40749p e = C26453c.m82747e(this.f46626i.mo66812m());
        m58690p4(z);
        return e;
    }

    /* renamed from: Y0 */
    public C40762x mo43628Y0(long j) {
        C40762x A = this.f46621d.mo43738u(j).mo95062A(new C16470c(new C16476c(this.f46624g)));
        C41536l.m120488h(A, "bnplServiceApi.getBnplSc…ndHistoryMapper::convert)");
        return A;
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.f46625h.addStore(hVar);
    }

    public void clean() {
        mo43633h4();
    }

    /* renamed from: d */
    public C40734b mo43629d(long j, String str) {
        C41536l.m120489i(str, "name");
        return this.f46621d.mo43734d(j, str);
    }

    /* renamed from: g */
    public C40762x mo43630g(long j, String str) {
        C41536l.m120489i(str, "brandName");
        C40762x A = this.f46621d.mo43735g(j, str).mo95062A(new C16471d(new C16477d(this.f46623f)));
        C41536l.m120488h(A, "bnplServiceApi.getMercha…nplOffersMapper::convert)");
        return A;
    }

    /* renamed from: g4 */
    public C27503h mo43631g4(C27503h hVar) {
        C41536l.m120489i(hVar, "<this>");
        return this.f46625h.mo66226a(hVar);
    }

    /* renamed from: h */
    public C40762x mo43632h(Boolean bool, String str, Long l) {
        C40762x A = this.f46621d.mo43736h(bool, str, l).mo95062A(new C16472e(new C16474a(this.f46622e)));
        C41536l.m120488h(A, "bnplServiceApi.getBnplCa…apper::convertCategories)");
        return A;
    }

    /* renamed from: h4 */
    public void mo43633h4() {
        this.f46625h.mo66227b();
    }

    /* renamed from: t */
    public C40762x mo43634t(long j, String str) {
        C41536l.m120489i(str, "brandName");
        C40762x A = this.f46621d.mo43737t(j, str).mo95062A(new C16468a(new C16478e(this)));
        C41536l.m120488h(A, "override fun getMerchant…r::convert)\n            }");
        return A;
    }
}
