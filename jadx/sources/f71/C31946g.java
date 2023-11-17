package f71;

import d71.C31544a;
import d71.C31545b;
import d71.C31546c;
import d71.C31547d;
import d71.C31548e;
import e71.C31683a;
import ed1.C40749p;
import ed1.C40762x;
import j71.C36754g;
import java.util.HashMap;
import java.util.List;
import k71.C36888a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import nd0.C26453c;
import od0.C26940a;
import od0.C26941b;
import p341ge.bog.mobilebank.transportcard.data.model.GetCardsCardsApiResponseModel;
import p341ge.bog.mobilebank.transportcard.data.model.GetPurchasedPassApiResponseModel;
import pd0.C27503h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: f71.g */
public final class C31946g implements C36888a, C26941b {

    /* renamed from: d */
    private final C31683a f78728d;

    /* renamed from: e */
    private final C31548e f78729e;

    /* renamed from: f */
    private final C31544a f78730f;

    /* renamed from: g */
    private final C31546c f78731g;

    /* renamed from: h */
    private final C31547d f78732h;

    /* renamed from: i */
    private final C31545b f78733i;

    /* renamed from: j */
    private final /* synthetic */ C26940a f78734j = new C26940a();

    /* renamed from: k */
    private final C27503h f78735k = mo72429k4(new C27503h());

    /* renamed from: l */
    private final C27503h f78736l = mo72429k4(new C27503h());

    /* renamed from: m */
    private final C27503h f78737m = mo72429k4(new C27503h());

    /* renamed from: n */
    private final C27503h f78738n = mo72429k4(new C27503h());

    /* renamed from: o */
    private final C27503h f78739o = mo72429k4(new C27503h());

    /* renamed from: f71.g$a */
    /* synthetic */ class C31947a extends C41535k implements C43075l {
        C31947a(Object obj) {
            super(1, obj, C31544a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C31544a) this.receiver).mo71945a(list);
        }
    }

    /* renamed from: f71.g$b */
    /* synthetic */ class C31948b extends C41535k implements C43075l {
        C31948b(Object obj) {
            super(1, obj, C31545b.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C31545b) this.receiver).mo71946c(list);
        }
    }

    /* renamed from: f71.g$c */
    /* synthetic */ class C31949c extends C41535k implements C43075l {
        C31949c(Object obj) {
            super(1, obj, C31544a.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C31544a) this.receiver).mo71945a(list);
        }
    }

    /* renamed from: f71.g$d */
    /* synthetic */ class C31950d extends C41535k implements C43075l {
        C31950d(Object obj) {
            super(1, obj, C31548e.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C31548e) this.receiver).mo71951a(list);
        }
    }

    /* renamed from: f71.g$e */
    /* synthetic */ class C31951e extends C41535k implements C43075l {
        C31951e(Object obj) {
            super(1, obj, C31546c.class, "convert", "convert(Lge/bog/mobilebank/transportcard/data/model/GetCardsCardsApiResponseModel;)Ljava/util/List;", 0);
        }

        /* renamed from: b */
        public final List invoke(GetCardsCardsApiResponseModel getCardsCardsApiResponseModel) {
            C41536l.m120489i(getCardsCardsApiResponseModel, "p0");
            return ((C31546c) this.receiver).mo71948c(getCardsCardsApiResponseModel);
        }
    }

    /* renamed from: f71.g$f */
    /* synthetic */ class C31952f extends C41535k implements C43064a {
        C31952f(Object obj) {
            super(0, obj, C31946g.class, "getActiveCardsObservable", "getActiveCardsObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C31946g) this.receiver).m94330m4();
        }
    }

    /* renamed from: f71.g$g */
    /* synthetic */ class C31953g extends C41535k implements C43064a {
        C31953g(Object obj) {
            super(0, obj, C31946g.class, "getActivePassesObservable", "getActivePassesObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C31946g) this.receiver).m94332p4();
        }
    }

    /* renamed from: f71.g$h */
    /* synthetic */ class C31954h extends C41535k implements C43064a {
        C31954h(Object obj) {
            super(0, obj, C31946g.class, "getMigratedPassDevicesObservable", "getMigratedPassDevicesObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C31946g) this.receiver).m94334r4();
        }
    }

    /* renamed from: f71.g$i */
    /* synthetic */ class C31955i extends C41535k implements C43064a {
        C31955i(Object obj) {
            super(0, obj, C31946g.class, "getPassTypesObservable", "getPassTypesObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C31946g) this.receiver).m94336t4();
        }
    }

    /* renamed from: f71.g$j */
    /* synthetic */ class C31956j extends C41535k implements C43064a {
        C31956j(Object obj) {
            super(0, obj, C31946g.class, "getPaymentCardsObservable", "getPaymentCardsObservable()Lio/reactivex/Observable;", 0);
        }

        public final C40749p invoke() {
            return ((C31946g) this.receiver).m94338v4();
        }
    }

    /* renamed from: f71.g$k */
    /* synthetic */ class C31957k extends C41535k implements C43075l {
        C31957k(Object obj) {
            super(1, obj, C31547d.class, "convert", "convert(Lge/bog/mobilebank/transportcard/data/model/GetPurchasedPassApiResponseModel;)Lge/bog/mobilebank/transportcard/domain/model/PurchasedPass;", 0);
        }

        /* renamed from: b */
        public final C36754g invoke(GetPurchasedPassApiResponseModel getPurchasedPassApiResponseModel) {
            C41536l.m120489i(getPurchasedPassApiResponseModel, "p0");
            return ((C31547d) this.receiver).mo71949a(getPurchasedPassApiResponseModel);
        }
    }

    public C31946g(C31683a aVar, C31548e eVar, C31544a aVar2, C31546c cVar, C31547d dVar, C31545b bVar) {
        C41536l.m120489i(aVar, "transportCardService");
        C41536l.m120489i(eVar, "transportCardPassTypeMapper");
        C41536l.m120489i(aVar2, "activeCardMapper");
        C41536l.m120489i(cVar, "cardMapper");
        C41536l.m120489i(dVar, "purchasedPassMapper");
        C41536l.m120489i(bVar, "activePassesMapper");
        this.f78728d = aVar;
        this.f78729e = eVar;
        this.f78730f = aVar2;
        this.f78731g = cVar;
        this.f78732h = dVar;
        this.f78733i = bVar;
    }

    /* renamed from: A4 */
    private final void m94316A4(boolean z) {
        this.f78735k.mo66814o(z, new C31955i(this)).mo94979E0();
    }

    /* renamed from: B4 */
    private final void m94317B4(boolean z) {
        this.f78737m.mo66814o(z, new C31956j(this)).mo94979E0();
    }

    /* access modifiers changed from: private */
    /* renamed from: C4 */
    public static final C36754g m94318C4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C36754g) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public final C40749p m94330m4() {
        return this.f78728d.mo72108k3().mo95026k0(new C31944e(new C31947a(this.f78730f)));
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final List m94331n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public final C40749p m94332p4() {
        return this.f78728d.mo72109l3().mo95026k0(new C31945f(new C31948b(this.f78733i)));
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final List m94333q4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public final C40749p m94334r4() {
        return this.f78728d.mo72107j3().mo95026k0(new C31941b(new C31949c(this.f78730f)));
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final List m94335s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: t4 */
    public final C40749p m94336t4() {
        return this.f78728d.mo72105h3().mo95026k0(new C31940a(new C31950d(this.f78729e)));
    }

    /* access modifiers changed from: private */
    /* renamed from: u4 */
    public static final List m94337u4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: v4 */
    public final C40749p m94338v4() {
        return this.f78728d.mo72104g3().mo95026k0(new C31943d(new C31951e(this.f78731g)));
    }

    /* access modifiers changed from: private */
    /* renamed from: w4 */
    public static final List m94339w4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: x4 */
    private final void m94340x4(boolean z) {
        this.f78736l.mo66814o(z, new C31952f(this)).mo94979E0();
    }

    /* renamed from: y4 */
    private final void m94341y4(boolean z) {
        this.f78738n.mo66814o(z, new C31953g(this)).mo94979E0();
    }

    /* renamed from: z4 */
    private final void m94342z4(boolean z) {
        this.f78739o.mo66814o(z, new C31954h(this)).mo94979E0();
    }

    /* renamed from: K7 */
    public C40749p mo72424K7(boolean z) {
        C40749p e = C26453c.m82747e(this.f78735k.mo66812m());
        m94316A4(z);
        return e;
    }

    /* renamed from: Un */
    public C40749p mo72425Un(boolean z) {
        C40749p e = C26453c.m82747e(this.f78738n.mo66812m());
        m94341y4(z);
        return e;
    }

    /* renamed from: V5 */
    public C40762x mo72426V5(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = this.f78728d.mo72106i3(hashMap).mo95062A(new C31942c(new C31957k(this.f78732h)));
        C41536l.m120488h(A, "transportCardService\n   …hasedPassMapper::convert)");
        return A;
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.f78734j.addStore(hVar);
    }

    public void clean() {
        mo72430l4();
    }

    /* renamed from: f0 */
    public C40762x mo72427f0(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "oldDeviceId");
        C41536l.m120489i(str2, "oldDeviceType");
        C41536l.m120489i(str3, "newDeviceId");
        C41536l.m120489i(str4, "newDeviceType");
        return this.f78728d.mo72103f0(str, str2, str3, str4);
    }

    /* renamed from: fv */
    public C40749p mo72428fv(boolean z) {
        C40749p e = C26453c.m82747e(this.f78736l.mo66812m());
        m94340x4(z);
        return e;
    }

    /* renamed from: k4 */
    public C27503h mo72429k4(C27503h hVar) {
        C41536l.m120489i(hVar, "<this>");
        return this.f78734j.mo66226a(hVar);
    }

    /* renamed from: l4 */
    public void mo72430l4() {
        this.f78734j.mo66227b();
    }

    /* renamed from: xo */
    public C40749p mo72431xo(boolean z) {
        C40749p e = C26453c.m82747e(this.f78737m.mo66812m());
        m94317B4(z);
        return e;
    }

    /* renamed from: zh */
    public C40749p mo72432zh(boolean z) {
        C40749p e = C26453c.m82747e(this.f78739o.mo66812m());
        m94342z4(z);
        return e;
    }
}
