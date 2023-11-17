package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.provider;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import dm0.C20043b;
import dm0.C20044c;
import dm0.C20045d;
import dm0.C20046e;
import dm0.C20047f;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import em0.C20268a;
import fm0.C20543a;
import g91.C32343x;
import hd0.C24978b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import md0.C26186e;
import nd0.C26453c;
import od0.C26940a;
import od0.C26941b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType;
import pd0.C27503h;
import tl0.C28465e;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d */
public final class C24596d extends C21481a implements C20043b, C26941b {

    /* renamed from: o */
    public static final C24602e f63403o = new C24602e((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TravelInsuranceFilledInfo f63404d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28465e f63405e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20543a f63406f;

    /* renamed from: g */
    private final /* synthetic */ C26940a f63407g = new C26940a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C27503h f63408h = mo62788vw(new C27503h());
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C27503h f63409i = mo62788vw(new C27503h());
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1644x f63410j = new C1644x(C41341q.m119907j());

    /* renamed from: k */
    private final C1644x f63411k = new C1644x();

    /* renamed from: l */
    private final C1644x f63412l = new C1644x();

    /* renamed from: m */
    private final C40765a f63413m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f63414n;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$a */
    static final class C24597a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24597a f63415d = new C24597a();

        C24597a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return 3;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$b */
    static final class C24598b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C24598b f63416d = new C24598b();

        C24598b() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(Integer num, Boolean bool) {
            C41536l.m120489i(num, "rc");
            C41536l.m120489i(bool, "coverage");
            return C41233s.m119492a(num, bool);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$c */
    static final class C24599c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24596d f63417d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$c$a */
        static final class C24600a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24596d f63418d;

            /* renamed from: e */
            final /* synthetic */ Boolean f63419e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24600a(C24596d dVar, Boolean bool) {
                super(1);
                this.f63418d = dVar;
                this.f63419e = bool;
            }

            /* renamed from: a */
            public final List invoke(C31128a aVar) {
                C41536l.m120489i(aVar, "it");
                C24596d dVar = this.f63418d;
                Boolean bool = this.f63419e;
                C41536l.m120488h(bool, "coverage");
                return dVar.m78998Cw(aVar, bool.booleanValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24599c(C24596d dVar) {
            super(1);
            this.f63417d = dVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41224m mVar) {
            C27503h hVar;
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            Integer num = (Integer) mVar.mo95675a();
            Boolean bool = (Boolean) mVar.mo95676b();
            C24596d dVar = this.f63417d;
            C41536l.m120488h(num, "requestCode");
            int intValue = num.intValue();
            C41536l.m120488h(bool, "coverage");
            if (bool.booleanValue()) {
                hVar = this.f63417d.f63409i;
            } else {
                hVar = this.f63417d.f63408h;
            }
            return C31270e.m92880i(dVar.m78997Bw(intValue, hVar, String.valueOf(this.f63417d.f63404d.mo62715A()), String.valueOf(this.f63417d.f63404d.mo62722g()), this.f63417d.f63404d.mo62719e(), bool.booleanValue(), C41341q.m119910m(1, 2).contains(num), this.f63417d.f63404d.mo62725i()), num.intValue()).mo95026k0(new C24609e(new C24600a(this.f63417d, bool)));
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$d */
    static final class C24601d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24596d f63420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24601d(C24596d dVar) {
            super(1);
            this.f63420d = dVar;
        }

        /* renamed from: a */
        public final void mo62796a(List list) {
            C24596d dVar = this.f63420d;
            C41536l.m120488h(list, "result");
            dVar.f63414n = dVar.m79017xw(list);
            this.f63420d.f63410j.mo4826r(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62796a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$e */
    public static final class C24602e {
        private C24602e() {
        }

        public /* synthetic */ C24602e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$f */
    public interface C24603f {
        /* renamed from: a */
        C24596d mo32779a(TravelInsuranceFilledInfo travelInsuranceFilledInfo);
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$g */
    static final class C24604g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24604g f63421d = new C24604g();

        C24604g() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(C20268a aVar) {
            C41536l.m120489i(aVar, "it");
            String i = ((C20268a.C20273e) aVar).mo48749i();
            C41536l.m120486f(i);
            return i;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$h */
    static final class C24605h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C24596d f63422d;

        /* renamed from: e */
        final /* synthetic */ int f63423e;

        /* renamed from: f */
        final /* synthetic */ String f63424f;

        /* renamed from: g */
        final /* synthetic */ String f63425g;

        /* renamed from: h */
        final /* synthetic */ String f63426h;

        /* renamed from: i */
        final /* synthetic */ boolean f63427i;

        /* renamed from: j */
        final /* synthetic */ Long f63428j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24605h(C24596d dVar, int i, String str, String str2, String str3, boolean z, Long l) {
            super(0);
            this.f63422d = dVar;
            this.f63423e = i;
            this.f63424f = str;
            this.f63425g = str2;
            this.f63426h = str3;
            this.f63427i = z;
            this.f63428j = l;
        }

        /* renamed from: b */
        public final C40749p invoke() {
            return this.f63422d.f63405e.mo68091a(C41341q.m119910m(1, 2).contains(Integer.valueOf(this.f63423e)), this.f63424f, this.f63425g, this.f63426h, this.f63427i, this.f63428j);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$i */
    static final class C24606i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f63429d;

        /* renamed from: e */
        final /* synthetic */ C24596d f63430e;

        /* renamed from: f */
        final /* synthetic */ boolean f63431f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24606i(List list, C24596d dVar, boolean z) {
            super(1);
            this.f63429d = list;
            this.f63430e = dVar;
            this.f63431f = z;
        }

        /* renamed from: a */
        public final void mo62799a(List list) {
            C41536l.m120489i(list, "it");
            this.f63429d.addAll(this.f63430e.f63406f.mo49065a(list, this.f63431f));
            this.f63429d.add(new C20268a.C20269a(true));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62799a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$j */
    static final class C24607j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f63432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24607j(List list) {
            super(1);
            this.f63432d = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f63432d.clear();
            this.f63432d.add(C20268a.C20270b.f55175b);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.provider.d$k */
    static final class C24608k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ List f63433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24608k(List list) {
            super(1);
            this.f63433d = list;
        }

        /* renamed from: a */
        public final void mo62801a(List list) {
            this.f63433d.add(C20268a.C20272d.f55177b);
            this.f63433d.add(new C20268a.C20269a(false));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62801a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24596d(TravelInsuranceFilledInfo travelInsuranceFilledInfo, C28465e eVar, C20543a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(travelInsuranceFilledInfo, "filledInfo");
        C41536l.m120489i(eVar, "getTravelInsuranceProviders");
        C41536l.m120489i(aVar, "mapper");
        this.f63404d = travelInsuranceFilledInfo;
        this.f63405e = eVar;
        this.f63406f = aVar;
        C40765a i1 = C40765a.m118199i1(Boolean.FALSE);
        C41536l.m120488h(i1, "createDefault(false)");
        this.f63413m = i1;
        this.f63414n = "";
        mo62789ww();
        C40749p L0 = C40749p.m118049m0(onInit(), onRefresh(), i1.mo95026k0(new C20044c(C24597a.f63415d))).mo95014Y0(i1, new C20045d(C24598b.f63416d)).mo94989L0(new C20046e(new C24599c(this)));
        C41536l.m120488h(L0, "merge(\n                o…      }\n                }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C20047f(new C24601d(this)));
        C41536l.m120488h(F0, "merge(\n                o… result\n                }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public final C40762x m78997Bw(int i, C27503h hVar, String str, String str2, String str3, boolean z, boolean z2, Long l) {
        C40749p m = hVar.mo66812m();
        C27503h hVar2 = hVar;
        hVar.mo66814o(z2, new C24605h(this, i, str, str2, str3, z, l)).mo94979E0();
        return C26186e.m81990h(C26453c.m82747e(m));
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public final List m78998Cw(C31128a aVar, boolean z) {
        List p = C41341q.m119913p(new C20268a.C20271c(z));
        C31132b.m92648j(aVar, (int[]) null, new C24606i(p, this, z), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C24607j(p), 1, (Object) null);
        C31132b.m92646h(aVar, (int[]) null, new C24608k(p), 1, (Object) null);
        return p;
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final Integer m79003hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C41224m m79004iw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final C40754t m79005jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m79006kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public final String m79017xw(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C20268a aVar = (C20268a) next;
            if (!(aVar instanceof C20268a.C20273e) || ((C20268a.C20273e) aVar).mo48749i() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return C41358y.m120017g0(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C24604g.f63421d, 30, (Object) null);
    }

    /* renamed from: Aw */
    public LiveData mo62787Aw() {
        return this.f63410j;
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.f63407g.addStore(hVar);
    }

    /* renamed from: c */
    public void mo48456c() {
        onRefresh(2);
    }

    /* renamed from: cg */
    public void mo48457cg() {
        C40765a aVar = this.f63413m;
        Object j1 = aVar.mo95100j1();
        C41536l.m120486f(j1);
        aVar.onNext(Boolean.valueOf(!((Boolean) j1).booleanValue()));
    }

    /* renamed from: js */
    public void mo48458js(C20268a.C20273e eVar) {
        String str;
        C41536l.m120489i(eVar, "providerItem");
        if (C41536l.m120484d(this.f63413m.mo95100j1(), Boolean.TRUE)) {
            str = "Y";
        } else {
            str = "N";
        }
        this.f63412l.mo4823o(C32343x.m95466m(TravelInsuranceFilledInfo.m78893b(this.f63404d, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, str, eVar.mo48751k(), eVar.mo48749i(), eVar.mo48750j(), String.valueOf(eVar.mo48747g()), eVar.mo48748h(), eVar.mo48743c(), eVar.mo48752l(), (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4177983, (Object) null)));
    }

    /* renamed from: n7 */
    public void mo48459n7() {
        Object j1 = this.f63413m.mo95100j1();
        C41536l.m120486f(j1);
        String format = String.format("serviceId=INSURANCE_GET_RISK_DETAILS_PDF&productId=%s&additionalCoverage=%s", Arrays.copyOf(new Object[]{this.f63414n, C24978b.m79846b((Boolean) j1).mo63391e()}, 2));
        C41536l.m120488h(format, "format(this, *args)");
        C37224b.m109966e(this.f63411k, format);
    }

    /* renamed from: vw */
    public C27503h mo62788vw(C27503h hVar) {
        C41536l.m120489i(hVar, "<this>");
        return this.f63407g.mo66226a(hVar);
    }

    /* renamed from: ww */
    public void mo62789ww() {
        this.f63407g.mo66227b();
    }

    /* renamed from: yw */
    public LiveData mo62790yw() {
        return this.f63411k;
    }

    /* renamed from: zw */
    public LiveData mo62791zw() {
        return this.f63412l;
    }
}
