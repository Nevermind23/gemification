package ya0;

import a21.C30479a;
import android.os.Bundle;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import cf1.C40407d;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32306g0;
import g91.C32343x;
import g91.C32359z0;
import hd0.C24978b;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import ja0.C25369e;
import ja0.C25370f;
import ja0.C25375j;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ka0.C25692a;
import ka0.C25695d;
import ka0.C25699h;
import ka0.C25700i;
import kb0.C25702a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import m41.C37223a;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.utm.data.entity.UtmParamsEntity;
import p341ge.bog.mobilebank.depositapplication.data.DepositRepositoryImpl;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p380ck.C10464h;
import p615tg.C17959a;
import p729cv.C19803e;
import p729cv.C19804f;
import p748eu.C20292b;
import p758fu.C20557a;
import pc0.C27494a;
import qa0.C27696b;
import t70.C28323a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ya0.k */
public final class C29967k extends C30479a.C30480a implements C29957a {

    /* renamed from: B */
    public static final C29968a f75757B = new C29968a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private AccumulateOnSpecificDateModel f75758A;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25369e f75759e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C25375j f75760f;

    /* renamed from: g */
    private final C20292b f75761g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C19804f f75762h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C19803e f75763i;

    /* renamed from: j */
    private final PreferencesApiManager f75764j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Client f75765k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C25370f f75766l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C27696b f75767m;

    /* renamed from: n */
    private final C27494a f75768n;

    /* renamed from: o */
    private final C1644x f75769o = new C1644x();

    /* renamed from: p */
    private final C1644x f75770p = new C1644x();

    /* renamed from: q */
    private final C1644x f75771q = new C1644x();

    /* renamed from: r */
    private final C1644x f75772r = new C1644x();

    /* renamed from: s */
    private final C1644x f75773s = new C1644x();

    /* renamed from: t */
    private final C1644x f75774t = new C1644x();

    /* renamed from: u */
    private final C1644x f75775u = new C1644x();

    /* renamed from: v */
    private final LiveData f75776v = C1607m0.m5655c(mo64744Yv(), C29970c.f75784d);

    /* renamed from: w */
    private final C40767b f75777w;

    /* renamed from: x */
    private final C40767b f75778x;

    /* renamed from: y */
    private final C40767b f75779y;

    /* renamed from: z */
    private AccumulateOnPaymentModel f75780z;

    /* renamed from: ya0.k$a */
    public static final class C29968a {
        private C29968a() {
        }

        public /* synthetic */ C29968a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ya0.k$b */
    public static final class C29969b {

        /* renamed from: a */
        private final String f75781a;

        /* renamed from: b */
        private final String f75782b;

        /* renamed from: c */
        private final String f75783c;

        public C29969b(String str, String str2, String str3) {
            C41536l.m120489i(str, "amount");
            C41536l.m120489i(str2, "interest");
            C41536l.m120489i(str3, "term");
            this.f75781a = str;
            this.f75782b = str2;
            this.f75783c = str3;
        }

        /* renamed from: a */
        public final String mo70269a() {
            return this.f75781a;
        }

        /* renamed from: b */
        public final String mo70270b() {
            return this.f75782b;
        }

        /* renamed from: c */
        public final String mo70271c() {
            return this.f75783c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29969b)) {
                return false;
            }
            C29969b bVar = (C29969b) obj;
            return C41536l.m120484d(this.f75781a, bVar.f75781a) && C41536l.m120484d(this.f75782b, bVar.f75782b) && C41536l.m120484d(this.f75783c, bVar.f75783c);
        }

        public int hashCode() {
            return (((this.f75781a.hashCode() * 31) + this.f75782b.hashCode()) * 31) + this.f75783c.hashCode();
        }

        public String toString() {
            String str = this.f75781a;
            String str2 = this.f75782b;
            String str3 = this.f75783c;
            return "OpenDepositResultModel(amount=" + str + ", interest=" + str2 + ", term=" + str3 + ")";
        }
    }

    /* renamed from: ya0.k$c */
    static final class C29970c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29970c f75784d = new C29970c();

        C29970c() {
            super(1);
        }

        /* renamed from: a */
        public final C37223a invoke(C25702a aVar) {
            return C32343x.m95466m(Boolean.valueOf(aVar.mo64273i()));
        }
    }

    /* renamed from: ya0.k$d */
    static final class C29971d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ TransferAccountItem f75785d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29971d(TransferAccountItem transferAccountItem) {
            super(1);
            this.f75785d = transferAccountItem;
        }

        /* renamed from: a */
        public final C25702a invoke(C25702a aVar) {
            C41536l.m120489i(aVar, "$this$updateSubmissionData");
            return C25702a.m80911b(aVar, (DepositSubmissionNavData) null, (DepositPurposeUiModel) null, (String) null, this.f75785d, 7, (Object) null);
        }
    }

    /* renamed from: ya0.k$e */
    static final class C29972e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f75786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29972e(String str) {
            super(1);
            this.f75786d = str;
        }

        /* renamed from: a */
        public final C25702a invoke(C25702a aVar) {
            C41536l.m120489i(aVar, "$this$updateSubmissionData");
            return C25702a.m80911b(aVar, (DepositSubmissionNavData) null, (DepositPurposeUiModel) null, this.f75786d, (TransferAccountItem) null, 11, (Object) null);
        }
    }

    /* renamed from: ya0.k$f */
    static final class C29973f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositPurposeUiModel f75787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29973f(DepositPurposeUiModel depositPurposeUiModel) {
            super(1);
            this.f75787d = depositPurposeUiModel;
        }

        /* renamed from: a */
        public final C25702a invoke(C25702a aVar) {
            String str;
            DepositPurposeUiModel depositPurposeUiModel;
            String a;
            C41536l.m120489i(aVar, "$this$updateSubmissionData");
            DepositPurposeUiModel depositPurposeUiModel2 = this.f75787d;
            if (aVar.mo64274j(depositPurposeUiModel2) || (depositPurposeUiModel = this.f75787d) == null || (a = depositPurposeUiModel.mo56799a()) == null) {
                str = null;
            } else {
                str = C32343x.m95388F(a, new Object[0]);
            }
            return C25702a.m80911b(aVar, (DepositSubmissionNavData) null, depositPurposeUiModel2, str, (TransferAccountItem) null, 9, (Object) null);
        }
    }

    /* renamed from: ya0.k$g */
    static final class C29974g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29967k f75788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29974g(C29967k kVar) {
            super(1);
            this.f75788d = kVar;
        }

        /* renamed from: a */
        public final Boolean invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C25702a aVar = (C25702a) this.f75788d.mo64744Yv().mo4814f();
            boolean z = false;
            if (aVar != null && aVar.mo64273i()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ya0.k$h */
    static final class C29975h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29967k f75789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29975h(C29967k kVar) {
            super(1);
            this.f75789d = kVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            String str;
            String str2;
            String a;
            C41536l.m120489i(num, "requestCode");
            Object f = this.f75789d.mo64744Yv().mo4814f();
            C41536l.m120486f(f);
            C25702a aVar = (C25702a) f;
            C25369e l = this.f75789d.f75759e;
            String d = aVar.mo64266d();
            if (d == null) {
                d = C32343x.m95388F("text.cds.agree.purpose.other", new Object[0]);
            }
            DepositPurposeUiModel h = aVar.mo64271h();
            if (h == null || (a = h.mo56799a()) == null || (str = C32343x.m95388F(a, new Object[0])) == null) {
                str = C32343x.m95388F("text.cds.agree.purpose.other", new Object[0]);
            }
            String bigDecimal = aVar.mo64270g().mo57167d().toString();
            C41536l.m120488h(bigDecimal, "submissionData.navData.d…tInitialAmount.toString()");
            String a2 = aVar.mo64270g().mo57165a();
            Long f2 = aVar.mo64269f();
            if (f2 != null) {
                str2 = f2.toString();
            } else {
                str2 = null;
            }
            String str3 = str2;
            long f3 = aVar.mo64270g().mo57171f();
            Long b = aVar.mo64270g().mo57166b();
            String b2 = aVar.mo64270g().mo57179m().mo56827b();
            String F = C32343x.m95388F(aVar.mo64270g().mo57179m().mo56826a(), new Object[0]);
            TransferAccountItem c = aVar.mo64265c();
            C41536l.m120486f(c);
            String d2 = c.mo52134d();
            String str4 = d2;
            C41536l.m120486f(d2);
            String bigDecimal2 = aVar.mo64265c().mo52139g().toString();
            String str5 = bigDecimal2;
            C41536l.m120488h(bigDecimal2, "submissionData.account.availableAmount.toString()");
            Double d3 = aVar.mo64270g().mo57173h().mo56813d();
            C41536l.m120486f(d3);
            double doubleValue = d3.doubleValue();
            Double e = aVar.mo64270g().mo57173h().mo56815e();
            Double b3 = aVar.mo64270g().mo57173h().mo56812b();
            C41536l.m120486f(b3);
            C40749p O = l.mo63957a(d, str, bigDecimal, a2, str3, f3, b, b2, F, str4, str5, doubleValue, e, b3.doubleValue(), aVar.mo64270g().mo57172g().name(), aVar.mo64270g().mo57177k()).mo95075O();
            C41536l.m120488h(O, "getDepositPreContract(\n …         ).toObservable()");
            return C31270e.m92879h(O, num.intValue());
        }
    }

    /* renamed from: ya0.k$i */
    static final class C29976i extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C29976i f75790d = new C29976i();

        C29976i() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(Integer num, C41224m mVar) {
            C41536l.m120489i(num, "requestCode");
            C41536l.m120489i(mVar, "<name for destructuring parameter 1>");
            return C41233s.m119492a(num, (String) mVar.mo95676b());
        }
    }

    /* renamed from: ya0.k$j */
    static final class C29977j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29967k f75791d;

        /* renamed from: ya0.k$j$a */
        /* synthetic */ class C29978a extends C41535k implements C43075l {
            C29978a(Object obj) {
                super(1, obj, C27696b.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C27696b) this.receiver).mo67234b(list);
            }
        }

        /* renamed from: ya0.k$j$b */
        /* synthetic */ class C29979b extends C41535k implements C43075l {
            C29979b(Object obj) {
                super(1, obj, C29967k.class, "partitionDepositPurposes", "partitionDepositPurposes(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C29967k) this.receiver).m90873I(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29977j(C29967k kVar) {
            super(1);
            this.f75791d = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final List m90944d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C41224m mVar) {
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            int intValue = ((Number) mVar.mo95675a()).intValue();
            C40749p k0 = this.f75791d.f75766l.mo63958a((String) mVar.mo95676b()).mo95075O().mo95026k0(new C29985l(new C29978a(this.f75791d.f75767m))).mo95026k0(new C29986m(new C29979b(this.f75791d)));
            C41536l.m120488h(k0, "getDepositPurposes(prodT…partitionDepositPurposes)");
            return C31270e.m92879h(k0, intValue);
        }
    }

    /* renamed from: ya0.k$k */
    static final class C29980k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29967k f75792d;

        /* renamed from: ya0.k$k$a */
        static final class C29981a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C29967k f75793d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C29981a(C29967k kVar) {
                super(1);
                this.f75793d = kVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
                r0 = r0.mo64270g();
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo70286a(java.util.List r2) {
                /*
                    r1 = this;
                    ya0.k r2 = r1.f75793d
                    androidx.lifecycle.x r0 = r2.mo64744Yv()
                    java.lang.Object r0 = r0.mo4814f()
                    kb0.a r0 = (kb0.C25702a) r0
                    if (r0 == 0) goto L_0x0019
                    ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData r0 = r0.mo64270g()
                    if (r0 == 0) goto L_0x0019
                    java.lang.Long r0 = r0.mo57178l()
                    goto L_0x001a
                L_0x0019:
                    r0 = 0
                L_0x001a:
                    r2.mo64743Ve(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ya0.C29967k.C29980k.C29981a.mo70286a(java.util.List):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo70286a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29980k(C29967k kVar) {
            super(1);
            this.f75792d = kVar;
        }

        /* renamed from: a */
        public final void mo70285a(C31128a aVar) {
            this.f75792d.mo64741Uo().mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C29981a(this.f75792d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70285a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ya0.k$l */
    static final class C29982l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29967k f75794d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29982l(C29967k kVar) {
            super(1);
            this.f75794d = kVar;
        }

        /* renamed from: a */
        public final C40754t invoke(HashMap hashMap) {
            C41536l.m120489i(hashMap, "params");
            C40749p O = this.f75794d.f75760f.mo63962a(hashMap).mo95075O();
            C41536l.m120488h(O, "openDeposit(params)\n    …          .toObservable()");
            return C31270e.m92879h(O, -1);
        }
    }

    /* renamed from: ya0.k$m */
    static final class C29983m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29967k f75795d;

        /* renamed from: ya0.k$m$a */
        static final class C29984a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C29967k f75796d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C29984a(C29967k kVar) {
                super(1);
                this.f75796d = kVar;
            }

            /* renamed from: a */
            public final void mo70289a(C25699h hVar) {
                C29967k kVar = this.f75796d;
                C41536l.m120488h(hVar, "resultData");
                kVar.m90872H(hVar);
                this.f75796d.f75762h.mo48092a();
                this.f75796d.f75763i.mo48091a();
                this.f75796d.f75765k.requestDepositBonds(true);
                C25702a aVar = (C25702a) this.f75796d.mo64744Yv().mo4814f();
                if (aVar != null) {
                    C37224b.m109965d(this.f75796d.mo64752j3(), new C29969b(C17959a.m61877a(C17959a.m61881e(aVar.mo64270g().mo57167d(), aVar.mo64270g().mo57165a())), aVar.mo64270g().mo57173h().mo56813d() + " %", aVar.mo64267e() + " " + C32343x.m95388F("applications.deposits.term.label.month", new Object[0])));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo70289a((C25699h) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29983m(C29967k kVar) {
            super(1);
            this.f75795d = kVar;
        }

        /* renamed from: a */
        public final void mo70288a(C31128a aVar) {
            this.f75795d.mo64733F0().mo4823o(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C29984a(this.f75795d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70288a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    public C29967k(C25369e eVar, C25375j jVar, C20292b bVar, C19804f fVar, C19803e eVar2, PreferencesApiManager preferencesApiManager, Client client, C25370f fVar2, C27696b bVar2, C27494a aVar) {
        C25369e eVar3 = eVar;
        C25375j jVar2 = jVar;
        C20292b bVar3 = bVar;
        C19804f fVar3 = fVar;
        C19803e eVar4 = eVar2;
        PreferencesApiManager preferencesApiManager2 = preferencesApiManager;
        Client client2 = client;
        C25370f fVar4 = fVar2;
        C27696b bVar4 = bVar2;
        C27494a aVar2 = aVar;
        C41536l.m120489i(eVar3, "getDepositPreContract");
        C41536l.m120489i(jVar2, "openDeposit");
        C41536l.m120489i(bVar3, "getAppSettingByNameUseCase");
        C41536l.m120489i(fVar3, "refreshProductTypeList");
        C41536l.m120489i(eVar4, "refreshAssetListLiabilityList");
        C41536l.m120489i(preferencesApiManager2, "preferencesApiManager");
        C41536l.m120489i(client2, "client");
        C41536l.m120489i(fVar4, "getDepositPurposes");
        C41536l.m120489i(bVar4, "purposeMapper");
        C41536l.m120489i(aVar2, "otpParamsMapBuilder");
        this.f75759e = eVar3;
        this.f75760f = jVar2;
        this.f75761g = bVar3;
        this.f75762h = fVar3;
        this.f75763i = eVar4;
        this.f75764j = preferencesApiManager2;
        this.f75765k = client2;
        this.f75766l = fVar4;
        this.f75767m = bVar4;
        this.f75768n = aVar2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Int>()");
        this.f75777w = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<HashMap<String, Any>>()");
        this.f75778x = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Pair<Int, String>>()");
        this.f75779y = h13;
        this.f75780z = new AccumulateOnPaymentModel((String) null, (BigDecimal) null, (Long) null, (Integer) null, (String) null, false, 63, (DefaultConstructorMarker) null);
        this.f75758A = new AccumulateOnSpecificDateModel((BigDecimal) null, (String) null, (String) null, (Long) null, (String) null, false, (String) null, (Long) null, (String) null, (String) null, (Integer) null, 2047, (DefaultConstructorMarker) null);
    }

    /* renamed from: A */
    private final DepositRepositoryImpl.DepositApplicationParamsObject m90868A(String str, String str2, String str3) {
        Long l;
        String str4;
        String str5;
        String str6;
        Double c;
        C25702a aVar = (C25702a) mo64744Yv().mo4814f();
        String str7 = null;
        if (aVar == null) {
            return null;
        }
        UtmParamsEntity utmParams = this.f75764j.getUtmParams();
        C20557a b = this.f75761g.mo48775b("UTM_PARAMETER_EXPIRATION_IN_HOURS");
        if (b == null || (c = b.mo49086c()) == null) {
            l = null;
        } else {
            l = Long.valueOf((long) c.doubleValue());
        }
        if (!C28323a.m86959a(utmParams, l)) {
            utmParams = null;
        }
        C24978b b2 = C24978b.m79846b(Boolean.valueOf(mo64757kp().mo57127j()));
        C24978b b3 = C24978b.m79846b(Boolean.valueOf(mo64742Uu().mo57149q()));
        if (!aVar.mo64273i()) {
            return null;
        }
        String k = aVar.mo64270g().mo57177k();
        String F = C32343x.m95388F(aVar.mo64270g().mo57169e(), new Object[0]);
        String d = aVar.mo64266d();
        if (d == null) {
            d = C32343x.m95388F("text.cds.agree.purpose.other", new Object[0]);
        }
        String str8 = d;
        DepositPurposeUiModel h = aVar.mo64271h();
        if (h == null || (str4 = h.mo56803e()) == null) {
            str4 = "Other";
        }
        String str9 = str4;
        String bigDecimal = aVar.mo64270g().mo57167d().toString();
        C41536l.m120488h(bigDecimal, "submissionData.navData.d…tInitialAmount.toString()");
        String a = aVar.mo64270g().mo57165a();
        Long b4 = aVar.mo64270g().mo57166b();
        String b5 = aVar.mo64270g().mo57179m().mo56827b();
        TransferAccountItem c2 = aVar.mo64265c();
        C41536l.m120486f(c2);
        long m = c2.mo52146m();
        if (utmParams != null) {
            str5 = utmParams.getMedium();
        } else {
            str5 = null;
        }
        if (utmParams != null) {
            str6 = utmParams.getSource();
        } else {
            str6 = null;
        }
        if (utmParams != null) {
            str7 = utmParams.getCampaign();
        }
        String str10 = str7;
        String z = m90899z();
        String e = b2.mo63391e();
        C41536l.m120488h(e, "openCAS.value");
        Long d2 = mo64757kp().mo57118d();
        BigDecimal e2 = mo64757kp().mo57120e();
        String g = mo64757kp().mo57123g();
        String e3 = b3.mo63391e();
        C41536l.m120488h(e3, "openSTO.value");
        String j = mo64742Uu().mo57144j();
        Long i = mo64742Uu().mo57143i();
        BigDecimal d3 = mo64742Uu().mo57135d();
        String e4 = mo64742Uu().mo57137e();
        Long p = mo64742Uu().mo57148p();
        String g2 = mo64742Uu().mo57140g();
        if (g2 == null) {
            g2 = "1M";
        }
        return new DepositRepositoryImpl.DepositApplicationParamsObject(k, F, str8, str9, bigDecimal, a, b4, b5, m, str5, str6, str10, z, e, d2, e2, g, e3, "PAYMENT_OWN_ACCOUNTS", j, i, d3, e4, p, g2, mo64742Uu().mo57141h(), (String) null, (String) null, (String) null, "COLLECTOR_OPEN_NEW_DEPOSIT_WITH_CAS_STO", str, str2, str3, 469762048, 0, (DefaultConstructorMarker) null);
    }

    /* renamed from: B */
    static /* synthetic */ DepositRepositoryImpl.DepositApplicationParamsObject m90869B(C29967k kVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return kVar.m90868A(str, str2, str3);
    }

    /* renamed from: F */
    private final void m90870F(String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle) {
        C36546y.m108282F().mo27137H(str, str3, str2, bundle, aVar);
    }

    /* renamed from: G */
    static /* synthetic */ void m90871G(C29967k kVar, String str, String str2, String str3, C10464h.C10465a aVar, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            bundle = null;
        }
        kVar.m90870F(str, str4, str3, aVar, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public final void m90872H(C25699h hVar) {
        String str;
        String str2;
        boolean z;
        C24978b a;
        C24978b a2;
        DepositSubmissionNavData g;
        C25695d g2;
        DepositSubmissionNavData g3;
        C25702a aVar = (C25702a) mo64744Yv().mo4814f();
        if (aVar == null || (g3 = aVar.mo64270g()) == null) {
            str = null;
        } else {
            str = g3.mo57177k();
        }
        C32306g0.m95221b("deposit_opened", str);
        C10464h.C10465a aVar2 = C10464h.C10465a.FACEBOOKANDFIREBASE;
        C25702a aVar3 = (C25702a) mo64744Yv().mo4814f();
        if (aVar3 == null || (g = aVar3.mo64270g()) == null || (g2 = g.mo57172g()) == null || (str2 = g2.name()) == null) {
            str2 = "";
        }
        m90871G(this, "deposit_application", str2, "conversion_create_deposit", aVar2, (Bundle) null, 16, (Object) null);
        C25692a a3 = hVar.mo64248a();
        boolean z2 = true;
        if (a3 == null || (a2 = a3.mo64194a()) == null || !a2.mo63390c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m90871G(this, "deposit_application", (String) null, "conversion_piggy_bank_registration", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
        }
        C25700i b = hVar.mo64249b();
        if (b == null || (a = b.mo64253a()) == null || !a.mo63390c()) {
            z2 = false;
        }
        if (z2) {
            m90871G(this, "deposit_application", (String) null, "conversion_sto_registration", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final List m90873I(List list) {
        ArrayList arrayList = new ArrayList();
        int size = (list.size() - 1) / 4;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i * 4;
                int i3 = i2 + 4;
                if (i3 > list.size()) {
                    i3 = list.size();
                }
                arrayList.add(list.subList(i2, i3));
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        return C41358y.m120036z0(arrayList);
    }

    /* renamed from: J */
    private final boolean m90874J() {
        DepositSubmissionNavData g;
        C25702a aVar = (C25702a) mo64744Yv().mo4814f();
        if (aVar == null || (g = aVar.mo64270g()) == null) {
            return false;
        }
        BigDecimal j = g.mo57176j();
        BigDecimal i = g.mo57175i();
        BigDecimal d = g.mo57167d();
        if (d.compareTo(j) < 0 || d.compareTo(i) > 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static final boolean m90875L(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static final C40754t m90876M(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static final C41224m m90877N(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public static final C40754t m90878Q(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static final void m90879R(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static final C40754t m90880S(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public static final void m90881T(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: x */
    private final List m90898x() {
        C31128a aVar = (C31128a) mo64741Uo().mo4814f();
        if (aVar != null) {
            return (List) C31132b.m92649k(aVar, (Object) null);
        }
        return null;
    }

    /* renamed from: z */
    private final String m90899z() {
        C25950a aVar;
        String a;
        C31128a aVar2 = (C31128a) mo64739P2().mo4814f();
        if (aVar2 != null) {
            aVar = (C25950a) aVar2.mo71340a();
        } else {
            aVar = null;
        }
        if (aVar == null || (a = aVar.mo64864a()) == null) {
            return null;
        }
        byte[] bytes = a.getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        if (bytes != null) {
            return C32359z0.m95597y(bytes);
        }
        return null;
    }

    /* renamed from: C */
    public C1644x mo64752j3() {
        return this.f75774t;
    }

    /* renamed from: D */
    public C1644x mo64739P2() {
        return this.f75771q;
    }

    /* renamed from: E */
    public C1644x mo64750i3() {
        return this.f75772r;
    }

    /* renamed from: Ja */
    public void mo64734Ja() {
        C40749p L0 = this.f75778x.mo94989L0(new C29965i(new C29982l(this)));
        C41536l.m120488h(L0, "override fun subscribeOp…}.bindToLifecycle()\n    }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C29966j(new C29983m(this)));
        C41536l.m120488h(F0, "override fun subscribeOp…}.bindToLifecycle()\n    }");
        mo70813a(F0);
    }

    /* renamed from: Ma */
    public void mo64736Ma() {
        long j;
        C25702a aVar = (C25702a) mo64744Yv().mo4814f();
        if (aVar != null) {
            C1644x u = mo64756ki();
            TransferAccountItem c = aVar.mo64265c();
            if (c != null) {
                j = c.mo52146m();
            } else {
                j = -1;
            }
            u.mo4823o(C32343x.m95466m(C41233s.m119492a(Long.valueOf(j), aVar.mo64270g().mo57165a())));
        }
    }

    /* renamed from: O */
    public void mo64737O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        DepositRepositoryImpl.DepositApplicationParamsObject A = m90868A(str, str2, str3);
        if (A != null) {
            this.f75778x.onNext(this.f75768n.mo66809a(A));
        }
    }

    /* renamed from: P */
    public void mo64738P(TransferAccountItem transferAccountItem) {
        C41536l.m120489i(transferAccountItem, "account");
        mo70264U(new C29971d(transferAccountItem));
    }

    /* renamed from: Rd */
    public void mo64740Rd() {
        C40749p L0 = this.f75777w.mo94990M(new C29960d(new C29974g(this))).mo94989L0(new C29961e(new C29975h(this)));
        C41536l.m120488h(L0, "override fun subscribeDe… .bindToLifecycle()\n    }");
        mo70813a(C31270e.m92876e(C32343x.m95413R0(L0), mo64739P2()));
    }

    /* renamed from: U */
    public void mo70264U(C43075l lVar) {
        C25702a aVar;
        C41536l.m120489i(lVar, "block");
        C1644x y = mo64744Yv();
        C25702a aVar2 = (C25702a) mo64744Yv().mo4814f();
        if (aVar2 != null) {
            aVar = (C25702a) lVar.invoke(aVar2);
        } else {
            aVar = null;
        }
        y.mo4823o(aVar);
    }

    /* renamed from: Uu */
    public AccumulateOnSpecificDateModel mo64742Uu() {
        return this.f75758A;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Ve */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo64743Ve(java.lang.Long r8) {
        /*
            r7 = this;
            java.util.List r0 = r7.m90898x()
            r1 = 0
            if (r0 == 0) goto L_0x0035
            java.util.List r0 = ie1.C41343r.m119927w(r0)
            if (r0 == 0) goto L_0x0035
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r0.next()
            r3 = r2
            ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel r3 = (p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel) r3
            long r3 = r3.mo56801d()
            if (r8 != 0) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            long r5 = r8.longValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x002f
            r3 = 1
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x0011
            r1 = r2
        L_0x0033:
            ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel r1 = (p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel) r1
        L_0x0035:
            ya0.k$f r8 = new ya0.k$f
            r8.<init>(r1)
            r7.mo70264U(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ya0.C29967k.mo64743Ve(java.lang.Long):void");
    }

    /* renamed from: Z */
    public void mo64745Z() {
        String str;
        DepositSubmissionNavData g;
        C25695d g2;
        C25702a aVar = (C25702a) mo64744Yv().mo4814f();
        if (aVar == null || (g = aVar.mo64270g()) == null || (g2 = g.mo57172g()) == null || (str = g2.name()) == null) {
            str = "";
        }
        m90871G(this, "deposit_application", str, "approve_precontract", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
        DepositRepositoryImpl.DepositApplicationParamsObject B = m90869B(this, (String) null, (String) null, (String) null, 7, (Object) null);
        if (B != null) {
            mo64750i3().mo4823o(C32343x.m95466m(new C41224m("COLLECTOR_OPEN_NEW_DEPOSIT_WITH_CAS_STO", this.f75768n.mo66809a(B))));
        }
    }

    /* renamed from: bu */
    public void mo64746bu(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
        C41536l.m120489i(accumulateOnSpecificDateModel, "<set-?>");
        this.f75758A = accumulateOnSpecificDateModel;
    }

    /* renamed from: gs */
    public int mo64747gs() {
        List x = m90898x();
        if (x != null) {
            return x.size();
        }
        return 0;
    }

    /* renamed from: k0 */
    public void mo64755k0() {
        C25702a aVar = (C25702a) mo64744Yv().mo4814f();
        boolean z = false;
        if (aVar != null && aVar.mo64273i()) {
            z = true;
        }
        if (z) {
            if (m90874J()) {
                this.f75777w.onNext(-1);
                return;
            }
            DepositRepositoryImpl.DepositApplicationParamsObject B = m90869B(this, (String) null, (String) null, (String) null, 7, (Object) null);
            if (B != null) {
                mo64750i3().mo4823o(C32343x.m95466m(C41233s.m119492a("COLLECTOR_OPEN_NEW_DEPOSIT_WITH_CAS_STO", this.f75768n.mo66809a(B))));
            }
        }
    }

    /* renamed from: kp */
    public AccumulateOnPaymentModel mo64757kp() {
        return this.f75780z;
    }

    /* renamed from: lr */
    public void mo64759lr(C40749p pVar) {
        C41536l.m120489i(pVar, "onRefresh");
        C40767b bVar = this.f75779y;
        C40749p L0 = C40749p.m118047l0(bVar, pVar.mo95014Y0(bVar, new C29962f(C29976i.f75790d))).mo94989L0(new C29963g(new C29977j(this)));
        C41536l.m120488h(L0, "override fun subscribeDe…}.bindToLifecycle()\n    }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C29964h(new C29980k(this)));
        C41536l.m120488h(F0, "override fun subscribeDe…}.bindToLifecycle()\n    }");
        mo70813a(F0);
    }

    /* renamed from: m */
    public LiveData mo64761m() {
        return this.f75776v;
    }

    /* renamed from: mj */
    public void mo64762mj(AccumulateOnPaymentModel accumulateOnPaymentModel) {
        C41536l.m120489i(accumulateOnPaymentModel, "<set-?>");
        this.f75780z = accumulateOnPaymentModel;
    }

    /* renamed from: ov */
    public void mo64764ov(C25702a aVar) {
        C41536l.m120489i(aVar, "depositData");
        mo64744Yv().mo4826r(aVar);
        this.f75779y.onNext(C41233s.m119492a(1, aVar.mo64270g().mo57177k()));
    }

    /* renamed from: rq */
    public void mo64765rq(String str) {
        mo70264U(new C29972e(str));
    }

    /* renamed from: u */
    public C1644x mo64756ki() {
        return this.f75770p;
    }

    /* renamed from: v */
    public C1644x mo64733F0() {
        return this.f75773s;
    }

    /* renamed from: w */
    public C1644x mo64741Uo() {
        return this.f75775u;
    }

    /* renamed from: y */
    public C1644x mo64744Yv() {
        return this.f75769o;
    }
}
