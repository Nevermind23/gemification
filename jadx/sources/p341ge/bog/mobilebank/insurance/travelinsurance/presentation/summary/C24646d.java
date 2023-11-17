package p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import hm0.C25042e;
import hm0.C25044f;
import hm0.C25045g;
import hm0.C25046h;
import hm0.C25047i;
import hm0.C25048j;
import j51.C36735g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m51.C37228a;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.fillinfo.TravelInsuranceFilledInfo;
import p775gx.C24836a;
import pc0.C27494a;
import ql0.C27845a;
import tl0.C28464d;
import ue1.C43075l;
import ul0.C28879f;
import z11.C40140b;

/* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d */
public final class C24646d extends C21481a {

    /* renamed from: s */
    public static final C24651c f63486s = new C24651c((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final TravelInsuranceFilledInfo f63487d;

    /* renamed from: e */
    private final C36735g f63488e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C28464d f63489f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C24836a f63490g;

    /* renamed from: h */
    private final C25042e f63491h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C27845a f63492i;

    /* renamed from: j */
    private final C27494a f63493j;

    /* renamed from: k */
    private final C1644x f63494k;

    /* renamed from: l */
    private final C1644x f63495l = new C1644x();

    /* renamed from: m */
    private final C1644x f63496m = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f63497n = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C1644x f63498o = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f63499p = new C1644x();

    /* renamed from: q */
    private final C40767b f63500q;

    /* renamed from: r */
    private SCARegisterPolicyParams f63501r;

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d$a */
    static final class C24647a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24646d f63502d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d$a$a */
        static final class C24648a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24646d f63503d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24648a(C24646d dVar) {
                super(1);
                this.f63503d = dVar;
            }

            /* renamed from: a */
            public final List invoke(TransferAccounts transferAccounts) {
                C41536l.m120489i(transferAccounts, "transferAccounts");
                return this.f63503d.f63492i.mo67363a(transferAccounts, "GEL");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24647a(C24646d dVar) {
            super(1);
            this.f63502d = dVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40749p k0 = this.f63502d.f63490g.mo63245a().mo95075O().mo95026k0(new C24645c(new C24648a(this.f63502d)));
            C41536l.m120488h(k0, "class ViewModel @Assiste…L_POLICY\"\n        }\n    }");
            return C31270e.m92879h(k0, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d$b */
    static final class C24649b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24646d f63504d;

        /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d$b$a */
        static final class C24650a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24646d f63505d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24650a(C24646d dVar) {
                super(1);
                this.f63505d = dVar;
            }

            /* renamed from: a */
            public final void mo62891a(List list) {
                Object obj;
                if (list.size() == 1) {
                    C24646d dVar = this.f63505d;
                    C41536l.m120488h(list, "accounts");
                    dVar.mo62886vw((C40140b) C41358y.m120007W(list));
                    return;
                }
                C41536l.m120488h(list, "accounts");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C40140b) obj).mo94069a().mo34690g()) {
                        break;
                    }
                }
                C40140b bVar = (C40140b) obj;
                if (bVar != null) {
                    this.f63505d.mo62886vw(bVar);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo62891a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24649b(C24646d dVar) {
            super(1);
            this.f63504d = dVar;
        }

        /* renamed from: a */
        public final void mo62890a(C31128a aVar) {
            this.f63504d.f63499p.mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C24650a(this.f63504d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62890a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d$c */
    public static final class C24651c {
        private C24651c() {
        }

        public /* synthetic */ C24651c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d$d */
    public interface C24652d {
        /* renamed from: a */
        C24646d mo32785a(TravelInsuranceFilledInfo travelInsuranceFilledInfo);
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d$e */
    public static final class C24653e {

        /* renamed from: a */
        private final String f63506a;

        /* renamed from: b */
        private final HashMap f63507b;

        public C24653e(String str, HashMap hashMap) {
            C41536l.m120489i(str, "service");
            C41536l.m120489i(hashMap, "parameters");
            this.f63506a = str;
            this.f63507b = hashMap;
        }

        /* renamed from: a */
        public final HashMap mo62892a() {
            return this.f63507b;
        }

        /* renamed from: b */
        public final String mo62893b() {
            return this.f63506a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24653e)) {
                return false;
            }
            C24653e eVar = (C24653e) obj;
            return C41536l.m120484d(this.f63506a, eVar.f63506a) && C41536l.m120484d(this.f63507b, eVar.f63507b);
        }

        public int hashCode() {
            return (this.f63506a.hashCode() * 31) + this.f63507b.hashCode();
        }

        public String toString() {
            String str = this.f63506a;
            HashMap hashMap = this.f63507b;
            return "ScaParamPair(service=" + str + ", parameters=" + hashMap + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d$f */
    static final class C24654f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24646d f63508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24654f(C24646d dVar) {
            super(1);
            this.f63508d = dVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C24653e eVar) {
            C41536l.m120489i(eVar, "params");
            C40749p O = this.f63508d.f63489f.mo68090a(eVar.mo62892a()).mo95075O();
            C41536l.m120488h(O, "registerInsurancePolicy(…arameters).toObservable()");
            return C31270e.m92879h(O, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.d$g */
    static final class C24655g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C24646d f63509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24655g(C24646d dVar) {
            super(1);
            this.f63509d = dVar;
        }

        /* renamed from: a */
        public final void mo62898a(C31128a aVar) {
            int i;
            Integer a;
            if (aVar instanceof C31128a.C31130b) {
                this.f63509d.f63498o.mo4823o(aVar);
            } else if (aVar instanceof C31128a.C31131c) {
                C28879f fVar = (C28879f) aVar.mo71340a();
                boolean z = false;
                if (fVar != null && fVar.mo68630b() == 0) {
                    z = true;
                }
                if (z) {
                    this.f63509d.f63498o.mo4823o(aVar);
                    C1644x ow = this.f63509d.f63497n;
                    C28879f fVar2 = (C28879f) aVar.mo71340a();
                    if (fVar2 == null || (a = fVar2.mo68629a()) == null) {
                        i = -1;
                    } else {
                        i = a.intValue();
                    }
                    ow.mo4823o(C32343x.m95466m(Integer.valueOf(i)));
                    return;
                }
                this.f63509d.f63498o.mo4823o(new C31128a.C31129a(new Throwable(), 0, (Object) null, 6, (DefaultConstructorMarker) null));
            } else if (aVar instanceof C31128a.C31129a) {
                this.f63509d.f63498o.mo4823o(aVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62898a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24646d(TravelInsuranceFilledInfo travelInsuranceFilledInfo, C36735g gVar, C28464d dVar, C24836a aVar, C25042e eVar, C27845a aVar2, C27494a aVar3) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(travelInsuranceFilledInfo, "filledInfo");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(dVar, "registerInsurancePolicy");
        C41536l.m120489i(aVar, "getAccountsUseCase");
        C41536l.m120489i(eVar, "mapper");
        C41536l.m120489i(aVar2, "accountsMapper");
        C41536l.m120489i(aVar3, "otpParamsMapBuilder");
        this.f63487d = travelInsuranceFilledInfo;
        this.f63488e = gVar;
        this.f63489f = dVar;
        this.f63490g = aVar;
        this.f63491h = eVar;
        this.f63492i = aVar2;
        this.f63493j = aVar3;
        this.f63494k = new C1644x(eVar.mo63472a(travelInsuranceFilledInfo));
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ScaParamPair>()");
        this.f63500q = h1;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C25045g(new C24647a(this)));
        C41536l.m120488h(L0, "merge(\n                o…QUEST_CODE)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C25046h(new C24649b(this)));
        C41536l.m120488h(F0, "merge(\n                o…          }\n            }");
        bindToLifecycle(F0);
        m79117xw();
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m79108hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final void m79109iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: tw */
    private final C24653e m79116tw(String str, String str2, String str3) {
        SCARegisterPolicyParams sCARegisterPolicyParams = this.f63501r;
        if (sCARegisterPolicyParams == null) {
            return null;
        }
        return new C24653e("INSURANCE_REGISTER_TRAVEL_POLICY", this.f63493j.mo66809a(SCARegisterPolicyParams.copy$default(sCARegisterPolicyParams, (String) null, (Long) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (String) null, str, str2, str3, 16777215, (Object) null)));
    }

    /* renamed from: xw */
    private final void m79117xw() {
        C40749p Q = this.f63500q.mo94998Q(new C25047i(new C24654f(this)));
        C41536l.m120488h(Q, "private fun subscribeToR…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(Q).mo94981F0(new C25048j(new C24655g(this)));
        C41536l.m120488h(F0, "private fun subscribeToR…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final C40754t m79118yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m79119zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.getAcctKey();
     */
    /* renamed from: Og */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62878Og() {
        /*
            r4 = this;
            androidx.lifecycle.x r0 = r4.f63496m
            m41.a r1 = new m41.a
            ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.SCARegisterPolicyParams r2 = r4.f63501r
            if (r2 == 0) goto L_0x0013
            java.lang.Long r2 = r2.getAcctKey()
            if (r2 == 0) goto L_0x0013
            long r2 = r2.longValue()
            goto L_0x0015
        L_0x0013:
            r2 = -1
        L_0x0015:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.<init>(r2)
            r0.mo4823o(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.insurance.travelinsurance.presentation.summary.C24646d.mo62878Og():void");
    }

    /* renamed from: a */
    public LiveData mo62879a() {
        return this.f63494k;
    }

    /* renamed from: h5 */
    public void mo62880h5(String str, String str2, String str3) {
        C24653e tw = m79116tw(str, str2, str3);
        if (tw != null) {
            this.f63500q.onNext(tw);
        }
    }

    /* renamed from: pw */
    public LiveData mo62881pw() {
        return this.f63499p;
    }

    /* renamed from: qw */
    public LiveData mo62882qw() {
        return this.f63495l;
    }

    /* renamed from: rw */
    public LiveData mo62883rw() {
        return this.f63498o;
    }

    /* renamed from: sw */
    public LiveData mo62884sw() {
        return this.f63497n;
    }

    /* renamed from: uw */
    public LiveData mo62885uw() {
        return this.f63496m;
    }

    /* renamed from: vw */
    public void mo62886vw(C40140b bVar) {
        C25044f fVar;
        Long l;
        C41536l.m120489i(bVar, "account");
        C1644x xVar = this.f63494k;
        C25044f fVar2 = (C25044f) mo62879a().mo4814f();
        String str = null;
        if (fVar2 != null) {
            fVar = C25044f.m79986b(fVar2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, bVar, 1023, (Object) null);
        } else {
            fVar = null;
        }
        xVar.mo4826r(fVar);
        C25042e eVar = this.f63491h;
        TravelInsuranceFilledInfo travelInsuranceFilledInfo = this.f63487d;
        long b = bVar.mo94070b();
        C37228a a = this.f63488e.mo89562a();
        if (a != null) {
            l = Long.valueOf(a.mo90305b());
        } else {
            l = null;
        }
        C37228a a2 = this.f63488e.mo89562a();
        if (a2 != null) {
            str = a2.mo90304a();
        }
        this.f63501r = eVar.mo63473c(travelInsuranceFilledInfo, b, l, str, "INSURANCE_REGISTER_TRAVEL_POLICY");
    }

    /* renamed from: ww */
    public void mo62887ww() {
        Long l;
        SCARegisterPolicyParams sCARegisterPolicyParams = this.f63501r;
        C37223a aVar = null;
        if (sCARegisterPolicyParams != null) {
            l = sCARegisterPolicyParams.getAcctKey();
        } else {
            l = null;
        }
        if (l != null) {
            C24653e tw = m79116tw((String) null, (String) null, (String) null);
            if (tw != null) {
                aVar = C32343x.m95466m(tw);
            }
            this.f63495l.mo4823o(aVar);
            return;
        }
        mo62878Og();
    }
}
