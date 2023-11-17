package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import j51.C36732d;
import j51.C36734f;
import java.util.Iterator;
import java.util.List;
import k51.C36873a;
import k51.C36874b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import ol0.C27032a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.selectinsuranceperson.InsurancePersonType;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p380ck.C10463g;
import tl0.C28461a;
import tl0.C28462b;
import ue1.C43075l;
import ue1.C43079p;
import ul0.C28875b;
import ul0.C28876c;
import ul0.C28878e;
import yl0.C30092i;
import yl0.C30093j;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel */
public final class FillInsuranceInfoViewModel$ViewModel extends C21481a {

    /* renamed from: k */
    public static final C24554c f63298k = new C24554c((DefaultConstructorMarker) null);

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f63299l = {C41520a0.m120439e(new C41539o(FillInsuranceInfoViewModel$ViewModel.class, "filledInput", "getFilledInput()Lge/bog/mobilebank/insurance/travelinsurance/presentation/fillinfo/TravelInsuranceFilledInfo;", 0))};

    /* renamed from: m */
    private static final InsurancePersonType f63300m = InsurancePersonType.ME;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C28461a f63301d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C28462b f63302e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f63303f = new C1644x();

    /* renamed from: g */
    private final C1644x f63304g = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1644x f63305h = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f63306i = new C1644x();

    /* renamed from: j */
    private final C41555e f63307j;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel$a */
    static final class C24550a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillInsuranceInfoViewModel$ViewModel f63308d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel$a$a */
        static final class C24551a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C24551a f63309d = new C24551a();

            C24551a() {
                super(2);
            }

            /* renamed from: a */
            public final C41224m invoke(C31128a aVar, C31128a aVar2) {
                C41536l.m120489i(aVar, "limitType");
                C41536l.m120489i(aVar2, "insuredPerson");
                return C41233s.m119492a(aVar, aVar2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24550a(FillInsuranceInfoViewModel$ViewModel fillInsuranceInfoViewModel$ViewModel) {
            super(1);
            this.f63308d = fillInsuranceInfoViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C41224m m78888c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C41224m) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C40749p.m118037d1(C31270e.m92880i(this.f63308d.f63301d.mo68087a("TRI"), num.intValue()), C31270e.m92880i(this.f63308d.f63302e.mo68088a(), num.intValue()), new C24557a(C24551a.f63309d));
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel$b */
    static final class C24552b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ FillInsuranceInfoViewModel$ViewModel f63310d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel$b$a */
        static final class C24553a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ FillInsuranceInfoViewModel$ViewModel f63311d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24553a(FillInsuranceInfoViewModel$ViewModel fillInsuranceInfoViewModel$ViewModel) {
                super(1);
                this.f63311d = fillInsuranceInfoViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo62714a(C28876c cVar) {
                C41536l.m120489i(cVar, "it");
                FillInsuranceInfoViewModel$ViewModel fillInsuranceInfoViewModel$ViewModel = this.f63311d;
                fillInsuranceInfoViewModel$ViewModel.m78860Cw(TravelInsuranceFilledInfo.m78893b(fillInsuranceInfoViewModel$ViewModel.m78872qw(), (String) null, cVar.mo68612b(), (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4194301, (Object) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo62714a((C28876c) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24552b(FillInsuranceInfoViewModel$ViewModel fillInsuranceInfoViewModel$ViewModel) {
            super(1);
            this.f63310d = fillInsuranceInfoViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo62713a(C41224m mVar) {
            C31128a aVar = (C31128a) mVar.mo95675a();
            C31128a aVar2 = (C31128a) mVar.mo95676b();
            this.f63310d.f63303f.mo4823o(aVar);
            C41536l.m120488h(aVar, "limitType");
            C31132b.m92648j(aVar, (int[]) null, new C24553a(this.f63310d), 1, (Object) null);
            C1644x lw = this.f63310d.f63306i;
            C41536l.m120488h(aVar2, "insuredPerson");
            lw.mo4826r(C31132b.m92649k(aVar2, C41341q.m119907j()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62713a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel$c */
    public static final class C24554c {
        private C24554c() {
        }

        public /* synthetic */ C24554c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel$d */
    public static final class C24555d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ FillInsuranceInfoViewModel$ViewModel f63312a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24555d(Object obj, FillInsuranceInfoViewModel$ViewModel fillInsuranceInfoViewModel$ViewModel) {
            super(obj);
            this.f63312a = fillInsuranceInfoViewModel$ViewModel;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            TravelInsuranceFilledInfo travelInsuranceFilledInfo = (TravelInsuranceFilledInfo) obj;
            this.f63312a.f63305h.mo4823o((TravelInsuranceFilledInfo) obj2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FillInsuranceInfoViewModel$ViewModel(C28461a aVar, C36732d dVar, C36734f fVar, C28462b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        Object obj;
        String str;
        Object obj2;
        C28461a aVar2 = aVar;
        C28462b bVar2 = bVar;
        C41536l.m120489i(aVar2, "getLimitType");
        C41536l.m120489i(dVar, "getMails");
        C41536l.m120489i(fVar, "getPhones");
        C41536l.m120489i(bVar2, "getPreviouslyInsuredPersonUseCase");
        String str2 = null;
        this.f63301d = aVar2;
        this.f63302e = bVar2;
        C41551a aVar3 = C41551a.f97718a;
        InsurancePersonType insurancePersonType = f63300m;
        this.f63307j = new C24555d(new TravelInsuranceFilledInfo("EUR", (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, insurancePersonType, C32343x.m95388F(insurancePersonType.mo62749e(), new Object[0]), (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4145150, (DefaultConstructorMarker) null), this);
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C30092i(new C24550a(this)));
        C41536l.m120488h(L0, "merge(\n                o…          }\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C30093j(new C24552b(this)));
        C41536l.m120488h(F0, "merge(\n                o…List())\n                }");
        bindToLifecycle(F0);
        TravelInsuranceFilledInfo qw = m78872qw();
        Iterator it = fVar.mo89561a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C36874b) obj).mo89807b()) {
                break;
            }
        }
        C36874b bVar3 = (C36874b) obj;
        if (bVar3 != null) {
            str = bVar3.mo89806a();
        } else {
            str = null;
        }
        Iterator it2 = dVar.mo89559a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((C36873a) obj2).mo89801c()) {
                break;
            }
        }
        C36873a aVar4 = (C36873a) obj2;
        m78860Cw(TravelInsuranceFilledInfo.m78893b(qw, (String) null, (String) null, (Long) null, (Long) null, str, aVar4 != null ? aVar4.mo89800b() : str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4194255, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public final void m78860Cw(TravelInsuranceFilledInfo travelInsuranceFilledInfo) {
        this.f63307j.setValue(this, f63299l[0], travelInsuranceFilledInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m78863fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m78864gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public final TravelInsuranceFilledInfo m78872qw() {
        return (TravelInsuranceFilledInfo) this.f63307j.getValue(this, f63299l[0]);
    }

    /* renamed from: vw */
    private final void m78873vw(InsurancePersonType insurancePersonType, String str) {
        C10463g F = C36546y.m108282F();
        C27032a.C27036d dVar = new C27032a.C27036d(insurancePersonType.mo62747b());
        C41536l.m120488h(F, "analytics");
        dVar.mo66262a(F);
        if (str != null) {
            new C27032a.C27037e(str).mo66262a(F);
        }
    }

    /* renamed from: Aw */
    public void mo62698Aw(String str) {
        C41536l.m120489i(str, PaymentServiceConfig.TYPE_MOBILE);
        m78860Cw(TravelInsuranceFilledInfo.m78893b(m78872qw(), (String) null, (String) null, (Long) null, (Long) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4194287, (Object) null));
    }

    /* renamed from: Bw */
    public void mo62699Bw(long j) {
        m78860Cw(TravelInsuranceFilledInfo.m78893b(m78872qw(), (String) null, (String) null, Long.valueOf(j), (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4194299, (Object) null));
    }

    /* renamed from: ow */
    public boolean mo62700ow() {
        boolean z;
        TravelInsuranceFilledInfo qw = m78872qw();
        if (qw.mo62715A() == null || qw.mo62722g() == null || qw.mo62715A().longValue() >= qw.mo62722g().longValue()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            m78860Cw(TravelInsuranceFilledInfo.m78893b(m78872qw(), (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4194295, (Object) null));
        }
        return z;
    }

    /* renamed from: pw */
    public LiveData mo62701pw() {
        return this.f63305h;
    }

    /* renamed from: rw */
    public LiveData mo62702rw() {
        return this.f63304g;
    }

    /* renamed from: sw */
    public LiveData mo62703sw() {
        return this.f63306i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r0 = r0.mo62719e();
     */
    /* renamed from: tw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo62704tw() {
        /*
            r1 = this;
            androidx.lifecycle.LiveData r0 = r1.mo62701pw()
            java.lang.Object r0 = r0.mo4814f()
            ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo r0 = (p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo) r0
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.mo62719e()
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            java.lang.String r0 = ""
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.FillInsuranceInfoViewModel$ViewModel.mo62704tw():java.lang.String");
    }

    /* renamed from: uh */
    public void mo62705uh(int i) {
        C28876c cVar;
        List a;
        C28875b bVar;
        String a2;
        C31128a aVar = (C31128a) mo62706uw().mo4814f();
        if (aVar == null || (cVar = (C28876c) C31132b.m92640b(aVar)) == null || (a = cVar.mo68611a()) == null || (bVar = (C28875b) a.get(i)) == null || (a2 = bVar.mo68606a()) == null) {
            return;
        }
        m78860Cw(TravelInsuranceFilledInfo.m78893b(m78872qw(), a2, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4194302, (Object) null));
    }

    /* renamed from: uw */
    public LiveData mo62706uw() {
        return this.f63303f;
    }

    /* renamed from: ww */
    public void mo62707ww(String str) {
        C41536l.m120489i(str, "email");
        m78860Cw(TravelInsuranceFilledInfo.m78893b(m78872qw(), (String) null, (String) null, (Long) null, (Long) null, (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4194271, (Object) null));
    }

    /* renamed from: xw */
    public void mo62708xw(long j) {
        m78860Cw(TravelInsuranceFilledInfo.m78893b(m78872qw(), (String) null, (String) null, (Long) null, Long.valueOf(j), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (InsurancePersonType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, 4194295, (Object) null));
    }

    /* renamed from: yw */
    public void mo62709yw() {
        TravelInsuranceFilledInfo travelInsuranceFilledInfo = (TravelInsuranceFilledInfo) this.f63305h.mo4814f();
        if (travelInsuranceFilledInfo != null) {
            this.f63304g.mo4823o(C32343x.m95466m(travelInsuranceFilledInfo));
        }
    }

    /* renamed from: zw */
    public void mo62710zw(InsurancePersonType insurancePersonType, String str, C28878e eVar) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Long l;
        C41536l.m120489i(insurancePersonType, "personType");
        TravelInsuranceFilledInfo qw = m78872qw();
        if (str == null) {
            str2 = C32343x.m95388F(insurancePersonType.mo62749e(), new Object[0]);
        } else {
            str2 = str;
        }
        String str8 = null;
        if (eVar != null) {
            str3 = eVar.mo68622c();
        } else {
            str3 = null;
        }
        if (eVar != null) {
            str4 = eVar.mo68624e();
        } else {
            str4 = null;
        }
        if (eVar != null) {
            str5 = eVar.mo68621b();
        } else {
            str5 = null;
        }
        if (eVar != null) {
            str6 = eVar.mo68623d();
        } else {
            str6 = null;
        }
        if (eVar != null) {
            str7 = eVar.mo68626f();
        } else {
            str7 = null;
        }
        if (eVar != null) {
            l = eVar.mo68620a();
        } else {
            l = null;
        }
        m78860Cw(TravelInsuranceFilledInfo.m78893b(qw, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, insurancePersonType, str2, str3, str4, str5, str6, str7, l, 16383, (Object) null));
        if (eVar != null) {
            str8 = eVar.mo68626f();
        }
        m78873vw(insurancePersonType, str8);
    }
}
