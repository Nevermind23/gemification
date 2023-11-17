package xa0;

import a21.C30479a;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40767b;
import g91.C32319m;
import g91.C32343x;
import hd1.C41205b;
import he1.C41212c;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ja0.C25367d;
import ja0.C25374i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ka0.C25695d;
import ka0.C25698g;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m41.C37223a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.model.DepositTypeDetailsUiModel;
import p341ge.bog.mobilebank.shared2.environment.EnvironmentType;
import p341ge.bog.mobilebank.shared2.environment.TargetEnvironment;
import pa0.C27487a;
import qa0.C27695a;
import qa0.C27697c;
import ue1.C43075l;
import xa0.C29665b;
import ze1.C43420e;

/* renamed from: xa0.k */
public final class C29675k extends C30479a.C30480a implements C29664a {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C25374i f74907e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C25367d f74908f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C27697c f74909g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C27695a f74910h;

    /* renamed from: i */
    private final TargetEnvironment f74911i;

    /* renamed from: j */
    private final C1644x f74912j = new C1644x();

    /* renamed from: k */
    private final C1644x f74913k = new C1644x();

    /* renamed from: l */
    private final C1644x f74914l = new C1644x();

    /* renamed from: m */
    private final C1644x f74915m = new C1644x();

    /* renamed from: n */
    private final C1644x f74916n = new C1644x();

    /* renamed from: o */
    private final C1644x f74917o = new C1644x();

    /* renamed from: p */
    private final LiveData f74918p = m90118v();

    /* renamed from: q */
    public C27487a f74919q;

    /* renamed from: r */
    private C27487a f74920r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C40767b f74921s;

    /* renamed from: t */
    private final C40767b f74922t;

    /* renamed from: u */
    private final C40767b f74923u;

    /* renamed from: xa0.k$a */
    public enum C29676a {
        SELECTED_DEPOSIT,
        INITIAL_AMOUNT,
        CURRENCY,
        END_DATE,
        WITHDRAWAL_TYPE
    }

    /* renamed from: xa0.k$b */
    private static final class C29677b {

        /* renamed from: a */
        private final C25695d f74930a;

        /* renamed from: b */
        private final String f74931b;

        /* renamed from: c */
        private final String f74932c;

        /* renamed from: d */
        private final String f74933d;

        /* renamed from: e */
        private final String f74934e;

        /* renamed from: f */
        private final String f74935f;

        /* renamed from: g */
        private final String f74936g;

        public C29677b(C25695d dVar, String str, String str2, String str3, String str4, String str5, String str6) {
            C41536l.m120489i(dVar, "depositType");
            C41536l.m120489i(str, "prodType");
            C41536l.m120489i(str2, "depositAmount");
            C41536l.m120489i(str3, "currency");
            C41536l.m120489i(str6, "withdrawalType");
            this.f74930a = dVar;
            this.f74931b = str;
            this.f74932c = str2;
            this.f74933d = str3;
            this.f74934e = str4;
            this.f74935f = str5;
            this.f74936g = str6;
        }

        /* renamed from: a */
        public final C25695d mo69669a() {
            return this.f74930a;
        }

        /* renamed from: b */
        public final String mo69670b() {
            return this.f74931b;
        }

        /* renamed from: c */
        public final String mo69671c() {
            return this.f74932c;
        }

        /* renamed from: d */
        public final String mo69672d() {
            return this.f74933d;
        }

        /* renamed from: e */
        public final String mo69673e() {
            return this.f74934e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29677b)) {
                return false;
            }
            C29677b bVar = (C29677b) obj;
            return this.f74930a == bVar.f74930a && C41536l.m120484d(this.f74931b, bVar.f74931b) && C41536l.m120484d(this.f74932c, bVar.f74932c) && C41536l.m120484d(this.f74933d, bVar.f74933d) && C41536l.m120484d(this.f74934e, bVar.f74934e) && C41536l.m120484d(this.f74935f, bVar.f74935f) && C41536l.m120484d(this.f74936g, bVar.f74936g);
        }

        /* renamed from: f */
        public final String mo69675f() {
            return this.f74935f;
        }

        /* renamed from: g */
        public final String mo69676g() {
            return this.f74936g;
        }

        public int hashCode() {
            int hashCode = ((((((this.f74930a.hashCode() * 31) + this.f74931b.hashCode()) * 31) + this.f74932c.hashCode()) * 31) + this.f74933d.hashCode()) * 31;
            String str = this.f74934e;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f74935f;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.f74936g.hashCode();
        }

        public String toString() {
            C25695d dVar = this.f74930a;
            String str = this.f74931b;
            String str2 = this.f74932c;
            String str3 = this.f74933d;
            String str4 = this.f74934e;
            String str5 = this.f74935f;
            String str6 = this.f74936g;
            return "InterestRatePayload(depositType=" + dVar + ", prodType=" + str + ", depositAmount=" + str2 + ", currency=" + str3 + ", term=" + str4 + ", endDate=" + str5 + ", withdrawalType=" + str6 + ")";
        }
    }

    /* renamed from: xa0.k$c */
    private static final class C29678c {

        /* renamed from: a */
        private final String f74937a;

        /* renamed from: b */
        private final String f74938b;

        /* renamed from: c */
        private final String f74939c;

        /* renamed from: d */
        private final String f74940d;

        public C29678c(String str, String str2, String str3, String str4) {
            C41536l.m120489i(str, "prodType");
            C41536l.m120489i(str2, "depositAmount");
            C41536l.m120489i(str3, "currency");
            this.f74937a = str;
            this.f74938b = str2;
            this.f74939c = str3;
            this.f74940d = str4;
        }

        /* renamed from: a */
        public final String mo69679a() {
            return this.f74937a;
        }

        /* renamed from: b */
        public final String mo69680b() {
            return this.f74938b;
        }

        /* renamed from: c */
        public final String mo69681c() {
            return this.f74939c;
        }

        /* renamed from: d */
        public final String mo69682d() {
            return this.f74940d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C29678c)) {
                return false;
            }
            C29678c cVar = (C29678c) obj;
            return C41536l.m120484d(this.f74937a, cVar.f74937a) && C41536l.m120484d(this.f74938b, cVar.f74938b) && C41536l.m120484d(this.f74939c, cVar.f74939c) && C41536l.m120484d(this.f74940d, cVar.f74940d);
        }

        public int hashCode() {
            int hashCode = ((((this.f74937a.hashCode() * 31) + this.f74938b.hashCode()) * 31) + this.f74939c.hashCode()) * 31;
            String str = this.f74940d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f74937a;
            String str2 = this.f74938b;
            String str3 = this.f74939c;
            String str4 = this.f74940d;
            return "WithdrawalTypePayload(prodType=" + str + ", depositAmount=" + str2 + ", currency=" + str3 + ", term=" + str4 + ")";
        }
    }

    /* renamed from: xa0.k$d */
    static final class C29679d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1639v f74941d;

        /* renamed from: e */
        final /* synthetic */ C29675k f74942e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29679d(C1639v vVar, C29675k kVar) {
            super(1);
            this.f74941d = vVar;
            this.f74942e = kVar;
        }

        /* renamed from: a */
        public final void mo69686a(C37223a aVar) {
            this.f74941d.mo4823o(Boolean.valueOf(this.f74942e.m90117u()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69686a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xa0.k$e */
    static final class C29680e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1639v f74943d;

        /* renamed from: e */
        final /* synthetic */ C29675k f74944e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29680e(C1639v vVar, C29675k kVar) {
            super(1);
            this.f74943d = vVar;
            this.f74944e = kVar;
        }

        /* renamed from: a */
        public final void mo69687a(C27487a aVar) {
            this.f74943d.mo4823o(Boolean.valueOf(this.f74944e.m90117u()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69687a((C27487a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xa0.k$f */
    static final class C29681f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C1639v f74945d;

        /* renamed from: e */
        final /* synthetic */ C29675k f74946e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29681f(C1639v vVar, C29675k kVar) {
            super(1);
            this.f74945d = vVar;
            this.f74946e = kVar;
        }

        /* renamed from: a */
        public final void mo69688a(C31128a aVar) {
            this.f74945d.mo4823o(Boolean.valueOf(this.f74946e.m90117u()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69688a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xa0.k$g */
    static final class C29682g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ long f74947d;

        /* renamed from: e */
        final /* synthetic */ TimeUnit f74948e;

        /* renamed from: f */
        final /* synthetic */ C43075l f74949f;

        /* renamed from: xa0.k$g$a */
        static final class C29683a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C43075l f74950d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C29683a(C43075l lVar) {
                super(1);
                this.f74950d = lVar;
            }

            /* renamed from: a */
            public final Boolean invoke(Object obj) {
                C41536l.m120489i(obj, "it");
                return (Boolean) this.f74950d.invoke(obj);
            }
        }

        /* renamed from: xa0.k$g$b */
        static final class C29684b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C43075l f74951d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C29684b(C43075l lVar) {
                super(1);
                this.f74951d = lVar;
            }

            /* renamed from: a */
            public final Boolean invoke(Object obj) {
                C41536l.m120489i(obj, "it");
                return Boolean.valueOf(!((Boolean) this.f74951d.invoke(obj)).booleanValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29682g(long j, TimeUnit timeUnit, C43075l lVar) {
            super(1);
            this.f74947d = j;
            this.f74948e = timeUnit;
            this.f74949f = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final boolean m90172d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return ((Boolean) lVar.invoke(obj)).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final boolean m90173e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return ((Boolean) lVar.invoke(obj)).booleanValue();
        }

        /* renamed from: c */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "sharedSrc");
            return C40749p.m118047l0(pVar.mo95032s(this.f74947d, this.f74948e).mo94990M(new C29702l(new C29683a(this.f74949f))), pVar.mo94990M(new C29703m(new C29684b(this.f74949f))));
        }
    }

    /* renamed from: xa0.k$h */
    static final class C29685h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29675k f74952d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29685h(C29675k kVar) {
            super(1);
            this.f74952d = kVar;
        }

        /* renamed from: a */
        public final void mo69692a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f74952d.f74921s.onNext(Boolean.TRUE);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f74952d.f74921s.onNext(Boolean.FALSE);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f74952d.f74921s.onNext(Boolean.FALSE);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69692a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xa0.k$i */
    static final class C29686i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29675k f74953d;

        /* renamed from: xa0.k$i$a */
        /* synthetic */ class C29687a extends C41535k implements C43075l {
            C29687a(Object obj) {
                super(1, obj, C27695a.class, "transform", "transform(Lge/bog/mobilebank/depositapplication/domain/model/InterestRate;)Lge/bog/mobilebank/depositapplication/presentation/application/model/InterestRateUiModel;", 0);
            }

            /* renamed from: b */
            public final InterestRateUiModel invoke(C25698g gVar) {
                C41536l.m120489i(gVar, "p0");
                return ((C27695a) this.receiver).mo67232a(gVar);
            }
        }

        /* renamed from: xa0.k$i$b */
        static final class C29688b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C29675k f74954d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C29688b(C29675k kVar) {
                super(1);
                this.f74954d = kVar;
            }

            /* renamed from: a */
            public final C41224m invoke(InterestRateUiModel interestRateUiModel) {
                C41536l.m120489i(interestRateUiModel, "interestRate");
                String h = this.f74954d.mo56869ur().mo66794h();
                C41536l.m120486f(h);
                return C41233s.m119492a(interestRateUiModel, h);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29686i(C29675k kVar) {
            super(1);
            this.f74953d = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final InterestRateUiModel m90180d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (InterestRateUiModel) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C41224m m90181e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C41224m) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C29677b bVar) {
            C41536l.m120489i(bVar, "payload");
            C25695d a = bVar.mo69669a();
            String b = bVar.mo69670b();
            String c = bVar.mo69671c();
            String d = bVar.mo69672d();
            String e = bVar.mo69673e();
            String f = bVar.mo69675f();
            C40749p k0 = this.f74953d.f74908f.mo63956a(a, b, c, d, bVar.mo69676g(), e, f).mo95075O().mo95026k0(new C29704n(new C29687a(this.f74953d.f74910h))).mo95026k0(new C29705o(new C29688b(this.f74953d)));
            C41536l.m120488h(k0, "override fun observeInte… .bindToLifecycle()\n    }");
            return C31270e.m92879h(k0, -1);
        }
    }

    /* renamed from: xa0.k$j */
    static final class C29689j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29675k f74955d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29689j(C29675k kVar) {
            super(1);
            this.f74955d = kVar;
        }

        /* renamed from: a */
        public final void mo69696a(C31128a aVar) {
            this.f74955d.mo56839Hc().mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69696a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xa0.k$k */
    static final class C29690k extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29690k f74956d = new C29690k();

        C29690k() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            return Boolean.valueOf(C41536l.m120484d(bool, Boolean.FALSE));
        }
    }

    /* renamed from: xa0.k$l */
    static final class C29691l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29675k f74957d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29691l(C29675k kVar) {
            super(1);
            this.f74957d = kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f74957d.mo56852e().mo4823o(C32343x.m95466m(bool));
        }
    }

    /* renamed from: xa0.k$m */
    static final class C29692m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29675k f74958d;

        /* renamed from: xa0.k$m$a */
        /* synthetic */ class C29693a extends C41535k implements C43075l {
            C29693a(Object obj) {
                super(1, obj, C27697c.class, "transform", "transform(Ljava/util/List;)Ljava/util/List;", 0);
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "p0");
                return ((C27697c) this.receiver).mo67236b(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29692m(C29675k kVar) {
            super(1);
            this.f74958d = kVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C29678c cVar) {
            C41536l.m120489i(cVar, "<name for destructuring parameter 0>");
            C40749p k0 = this.f74958d.f74907e.mo63961a(cVar.mo69679a(), cVar.mo69680b(), cVar.mo69681c(), cVar.mo69682d()).mo95075O().mo95026k0(new C29706p(new C29693a(this.f74958d.f74909g)));
            C41536l.m120488h(k0, "getWithdrawalTypes(prodT…alTypesMapper::transform)");
            return C31270e.m92879h(k0, -1);
        }
    }

    /* renamed from: xa0.k$n */
    static final class C29694n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29675k f74959d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29694n(C29675k kVar) {
            super(1);
            this.f74959d = kVar;
        }

        /* renamed from: a */
        public final void mo69701a(C31128a aVar) {
            this.f74959d.mo56874z1().mo4826r(aVar);
            C29675k kVar = this.f74959d;
            C41536l.m120488h(aVar, "result");
            kVar.m90098L(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69701a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xa0.k$o */
    static final class C29695o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ BigDecimal f74960d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29695o(BigDecimal bigDecimal) {
            super(1);
            this.f74960d = bigDecimal;
        }

        /* renamed from: a */
        public final C27487a invoke(C27487a aVar) {
            C41536l.m120489i(aVar, "$this$updateForm");
            return C27487a.m85254c(aVar, (DepositTypeDetailsUiModel) null, (C43075l) null, this.f74960d, (String) null, (Date) null, (WithdrawalTypeUiModel) null, 59, (Object) null);
        }
    }

    /* renamed from: xa0.k$p */
    static final class C29696p extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C29696p f74961d = new C29696p();

        C29696p() {
            super(1);
        }

        /* renamed from: a */
        public final C27487a invoke(C27487a aVar) {
            C41536l.m120489i(aVar, "$this$updateForm");
            return C27487a.m85254c(aVar, (DepositTypeDetailsUiModel) null, (C43075l) null, (BigDecimal) null, (String) null, (Date) null, (WithdrawalTypeUiModel) null, 59, (Object) null);
        }
    }

    /* renamed from: xa0.k$q */
    static final class C29697q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Date f74962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29697q(Date date) {
            super(1);
            this.f74962d = date;
        }

        /* renamed from: a */
        public final C27487a invoke(C27487a aVar) {
            C41536l.m120489i(aVar, "$this$updateForm");
            return C27487a.m85254c(aVar, (DepositTypeDetailsUiModel) null, (C43075l) null, (BigDecimal) null, (String) null, this.f74962d, (WithdrawalTypeUiModel) null, 47, (Object) null);
        }
    }

    /* renamed from: xa0.k$r */
    static final class C29698r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ WithdrawalTypeUiModel f74963d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29698r(WithdrawalTypeUiModel withdrawalTypeUiModel) {
            super(1);
            this.f74963d = withdrawalTypeUiModel;
        }

        /* renamed from: a */
        public final C27487a invoke(C27487a aVar) {
            C41536l.m120489i(aVar, "$this$updateForm");
            return C27487a.m85254c(aVar, (DepositTypeDetailsUiModel) null, (C43075l) null, (BigDecimal) null, (String) null, (Date) null, this.f74963d, 31, (Object) null);
        }
    }

    /* renamed from: xa0.k$s */
    static final class C29699s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29675k f74964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29699s(C29675k kVar) {
            super(1);
            this.f74964d = kVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo69706a(java.util.List r9) {
            /*
                r8 = this;
                java.lang.String r0 = "types"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                xa0.k r0 = r8.f74964d
                pa0.a r0 = r0.mo56869ur()
                ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel r0 = r0.mo66798k()
                xa0.k r1 = r8.f74964d
                pa0.a r1 = r1.mo56848Vt()
                r2 = 0
                if (r1 == 0) goto L_0x001d
                ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel r1 = r1.mo66798k()
                goto L_0x001e
            L_0x001d:
                r1 = r2
            L_0x001e:
                boolean r3 = r9 instanceof java.util.Collection
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L_0x002c
                boolean r3 = r9.isEmpty()
                if (r3 == 0) goto L_0x002c
            L_0x002a:
                r3 = r5
                goto L_0x004f
            L_0x002c:
                java.util.Iterator r3 = r9.iterator()
            L_0x0030:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x002a
                java.lang.Object r6 = r3.next()
                ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel r6 = (p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel) r6
                java.lang.String r6 = r6.mo56827b()
                if (r0 == 0) goto L_0x0047
                java.lang.String r7 = r0.mo56827b()
                goto L_0x0048
            L_0x0047:
                r7 = r2
            L_0x0048:
                boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
                if (r6 == 0) goto L_0x0030
                r3 = r4
            L_0x004f:
                if (r3 == 0) goto L_0x0058
                if (r0 == 0) goto L_0x009b
                java.lang.String r2 = r0.mo56827b()
                goto L_0x009b
            L_0x0058:
                int r0 = r9.size()
                if (r0 != r4) goto L_0x0069
                java.lang.Object r9 = ie1.C41358y.m120007W(r9)
                ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel r9 = (p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel) r9
                java.lang.String r2 = r9.mo56827b()
                goto L_0x009b
            L_0x0069:
                boolean r0 = r9.isEmpty()
                if (r0 == 0) goto L_0x0071
            L_0x006f:
                r4 = r5
                goto L_0x0093
            L_0x0071:
                java.util.Iterator r9 = r9.iterator()
            L_0x0075:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L_0x006f
                java.lang.Object r0 = r9.next()
                ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel r0 = (p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel) r0
                java.lang.String r0 = r0.mo56827b()
                if (r1 == 0) goto L_0x008c
                java.lang.String r3 = r1.mo56827b()
                goto L_0x008d
            L_0x008c:
                r3 = r2
            L_0x008d:
                boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r3)
                if (r0 == 0) goto L_0x0075
            L_0x0093:
                if (r4 == 0) goto L_0x009b
                if (r1 == 0) goto L_0x009b
                java.lang.String r2 = r1.mo56827b()
            L_0x009b:
                xa0.k r9 = r8.f74964d
                r9.mo56851Z6(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xa0.C29675k.C29699s.mo69706a(java.util.List):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo69706a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xa0.k$t */
    static final class C29700t extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29675k f74965d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29700t(C29675k kVar) {
            super(1);
            this.f74965d = kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f74965d.mo56851Z6((String) null);
        }
    }

    /* renamed from: xa0.k$u */
    static final class C29701u implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f74966a;

        C29701u(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f74966a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f74966a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f74966a.invoke(obj);
        }
    }

    public C29675k(C25374i iVar, C25367d dVar, C27697c cVar, C27695a aVar, TargetEnvironment targetEnvironment) {
        C41536l.m120489i(iVar, "getWithdrawalTypes");
        C41536l.m120489i(dVar, "getDepositInterestRate");
        C41536l.m120489i(cVar, "withdrawalTypesMapper");
        C41536l.m120489i(aVar, "interestRateMapper");
        C41536l.m120489i(targetEnvironment, "environment");
        this.f74907e = iVar;
        this.f74908f = dVar;
        this.f74909g = cVar;
        this.f74910h = aVar;
        this.f74911i = targetEnvironment;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Boolean>()");
        this.f74921s = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<WithdrawalTypePayload>()");
        this.f74922t = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<InterestRatePayload>()");
        this.f74923u = h13;
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public static final void m90092E(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final C40754t m90093F(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m90094G(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final void m90095H(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final C40754t m90096I(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final void m90097J(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m90098L(C31128a aVar) {
        C31132b.m92648j(aVar, (int[]) null, new C29699s(this), 1, (Object) null);
        C31132b.m92643e(aVar, (int[]) null, new C29700t(this), 1, (Object) null);
    }

    /* renamed from: M */
    private final void m90099M() {
        mo56850Z3().mo4823o(mo56869ur());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m90100N(pa0.C27487a r7, pa0.C27487a r8) {
        /*
            r6 = this;
            java.util.List r7 = r6.m90116t(r7, r8)
            boolean r8 = r7 instanceof java.util.Collection
            r0 = 2
            r1 = 0
            if (r8 == 0) goto L_0x0012
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0012
        L_0x0010:
            r4 = r1
            goto L_0x0041
        L_0x0012:
            java.util.Iterator r7 = r7.iterator()
        L_0x0016:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0010
            java.lang.Object r8 = r7.next()
            xa0.k$a r8 = (xa0.C29675k.C29676a) r8
            r2 = 4
            xa0.k$a[] r2 = new xa0.C29675k.C29676a[r2]
            xa0.k$a r3 = xa0.C29675k.C29676a.SELECTED_DEPOSIT
            r2[r1] = r3
            xa0.k$a r3 = xa0.C29675k.C29676a.INITIAL_AMOUNT
            r4 = 1
            r2[r4] = r3
            xa0.k$a r3 = xa0.C29675k.C29676a.CURRENCY
            r2[r0] = r3
            r3 = 3
            xa0.k$a r5 = xa0.C29675k.C29676a.END_DATE
            r2[r3] = r5
            java.util.List r2 = ie1.C41341q.m119910m(r2)
            boolean r8 = r2.contains(r8)
            if (r8 == 0) goto L_0x0016
        L_0x0041:
            if (r4 == 0) goto L_0x005d
            androidx.lifecycle.x r7 = r6.mo56839Hc()
            b41.a$c r8 = new b41.a$c
            ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel$a r2 = p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel.f60141i
            ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel r2 = r2.mo56821a()
            r3 = 0
            he1.m r2 = he1.C41233s.m119492a(r2, r3)
            r8.<init>(r2, r1, r0, r3)
            r7.mo4823o(r8)
            r6.mo56855gv()
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xa0.C29675k.m90100N(pa0.a, pa0.a):void");
    }

    /* renamed from: s */
    private final C43420e m90115s() {
        boolean z;
        DepositTypeDetailsUiModel i = mo56869ur().mo66796i();
        long a = C27487a.f70365g.mo66801a();
        if (a > i.mo57216d() || a > i.mo57215b() || i.mo57216d() > i.mo57215b()) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f74911i.getType() != EnvironmentType.TEST) {
            return new C43420e(0, 0);
        }
        int y = (int) C32319m.m95318y(new Date(a), new Date(i.mo57216d()));
        int y2 = (int) C32319m.m95318y(new Date(a), new Date(i.mo57215b()));
        if (C32319m.m95291K(new Date(a), y).getTime() < i.mo57216d()) {
            y++;
        }
        return new C43420e(y, y2);
    }

    /* renamed from: t */
    private final List m90116t(C27487a aVar, C27487a aVar2) {
        ArrayList arrayList = new ArrayList();
        if (!C41536l.m120484d(aVar.mo66796i(), aVar2.mo66796i())) {
            arrayList.add(C29676a.SELECTED_DEPOSIT);
        }
        if (!C41536l.m120484d(aVar.mo66792f(), aVar2.mo66792f())) {
            arrayList.add(C29676a.INITIAL_AMOUNT);
        }
        if (!C41536l.m120484d(aVar.mo66794h(), aVar2.mo66794h())) {
            arrayList.add(C29676a.CURRENCY);
        }
        if (!C41536l.m120484d(aVar.mo66797j(), aVar2.mo66797j())) {
            arrayList.add(C29676a.END_DATE);
        }
        if (!C41536l.m120484d(aVar.mo66798k(), aVar2.mo66798k())) {
            arrayList.add(C29676a.WITHDRAWAL_TYPE);
        }
        return C41358y.m120036z0(arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m90117u() {
        /*
            r5 = this;
            boolean r0 = r5.mo56840Jk()
            r1 = 0
            if (r0 == 0) goto L_0x006a
            pa0.a r0 = r5.mo56869ur()
            boolean r0 = r0.mo66799l()
            if (r0 == 0) goto L_0x006a
            androidx.lifecycle.x r0 = r5.mo56852e()
            java.lang.Object r0 = r0.mo4814f()
            m41.a r0 = (m41.C37223a) r0
            r2 = 1
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r0.mo90299d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x002c
            r0 = r2
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            if (r0 == 0) goto L_0x006a
            androidx.lifecycle.x r0 = r5.mo56839Hc()
            java.lang.Object r0 = r0.mo4814f()
            boolean r0 = r0 instanceof b41.C31128a.C31131c
            if (r0 == 0) goto L_0x006a
            androidx.lifecycle.x r0 = r5.mo56839Hc()
            java.lang.Object r0 = r0.mo4814f()
            boolean r3 = r0 instanceof b41.C31128a.C31131c
            r4 = 0
            if (r3 == 0) goto L_0x004b
            b41.a$c r0 = (b41.C31128a.C31131c) r0
            goto L_0x004c
        L_0x004b:
            r0 = r4
        L_0x004c:
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r0.mo71340a()
            he1.m r0 = (he1.C41224m) r0
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r0.mo95678e()
            r4 = r0
            ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel r4 = (p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel) r4
        L_0x005d:
            ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel$a r0 = p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel.f60141i
            ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel r0 = r0.mo56821a()
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r4, r0)
            if (r0 != 0) goto L_0x006a
            r1 = r2
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xa0.C29675k.m90117u():boolean");
    }

    /* renamed from: v */
    private final C1639v m90118v() {
        C1639v vVar = new C1639v();
        vVar.mo4956s(mo56852e(), new C29701u(new C29679d(vVar, this)));
        vVar.mo4956s(mo56850Z3(), new C29701u(new C29680e(vVar, this)));
        vVar.mo4956s(mo56839Hc(), new C29701u(new C29681f(vVar, this)));
        return vVar;
    }

    /* renamed from: w */
    private final C40749p m90119w(C40749p pVar, C43075l lVar, long j, TimeUnit timeUnit) {
        C40749p v0 = pVar.mo95038v0(new C29674j(new C29682g(j, timeUnit, lVar)));
        C41536l.m120488h(v0, "predicate: (T) -> Boolea…}\n            )\n        }");
        return v0;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final C40754t m90120x(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: A */
    public C1644x mo56852e() {
        return this.f74912j;
    }

    /* renamed from: B */
    public C1644x mo56853f5() {
        return this.f74914l;
    }

    /* renamed from: B8 */
    public void mo56837B8(C31128a aVar) {
        C41536l.m120489i(aVar, "newValue");
        mo56839Hc().mo4823o(aVar);
    }

    /* renamed from: C */
    public C1644x mo56870vi() {
        return this.f74917o;
    }

    /* renamed from: D */
    public C1644x mo56874z1() {
        return this.f74916n;
    }

    /* renamed from: Jk */
    public boolean mo56840Jk() {
        return this.f74919q != null;
    }

    /* renamed from: K */
    public void mo56841K(int i) {
        Date date;
        if (mo56869ur().mo66793g()) {
            date = mo56849Yi(i);
        } else {
            date = null;
        }
        C29665b.C29666a.m90080c(this, new C29697q(date), false, 2, (Object) null);
    }

    /* renamed from: Nr */
    public void mo56842Nr(String str, boolean z) {
        BigDecimal bigDecimal;
        if (str != null) {
            try {
                bigDecimal = new BigDecimal(str);
            } catch (Exception unused) {
                C29665b.C29666a.m90080c(this, C29696p.f74961d, false, 2, (Object) null);
                return;
            }
        } else {
            bigDecimal = null;
        }
        C29665b.C29666a.m90080c(this, new C29695o(bigDecimal), false, 2, (Object) null);
    }

    /* renamed from: Oe */
    public void mo56843Oe() {
        C40749p L0 = this.f74922t.mo95032s(500, TimeUnit.MILLISECONDS).mo94989L0(new C29671g(new C29692m(this)));
        C41536l.m120488h(L0, "override fun observeWith…}.bindToLifecycle()\n    }");
        C41205b F0 = mo56859in(C32343x.m95413R0(L0)).mo94981F0(new C29672h(new C29694n(this)));
        C41536l.m120488h(F0, "override fun observeWith…}.bindToLifecycle()\n    }");
        mo70813a(F0);
    }

    /* renamed from: P8 */
    public void mo56844P8() {
        C41205b F0 = m90119w(this.f74921s, C29690k.f74956d, 600, TimeUnit.MILLISECONDS).mo94981F0(new C29668d(new C29691l(this)));
        C41536l.m120488h(F0, "override fun observeLoad… .bindToLifecycle()\n    }");
        mo70813a(F0);
    }

    /* renamed from: Pn */
    public void mo56845Pn() {
        String str;
        String str2;
        C25695d e = mo56869ur().mo66796i().mo57218e();
        String p = mo56869ur().mo66796i().mo57229p();
        BigDecimal f = mo56869ur().mo66792f();
        String h = mo56869ur().mo66794h();
        Long e2 = mo56869ur().mo66790e();
        if (e2 != null) {
            str = e2.toString();
        } else {
            str = null;
        }
        Date j = mo56869ur().mo66797j();
        WithdrawalTypeUiModel k = mo56869ur().mo66798k();
        if (f != null && h != null && k != null) {
            if ((e != C25695d.ENLARG && e != C25695d.TERM) || j != null) {
                C40767b bVar = this.f74923u;
                String bigDecimal = f.toString();
                C41536l.m120488h(bigDecimal, "initialAmount.toString()");
                if (j != null) {
                    str2 = Long.valueOf(j.getTime()).toString();
                } else {
                    str2 = null;
                }
                bVar.onNext(new C29677b(e, p, bigDecimal, h, str, str2, k.mo56827b()));
            }
        }
    }

    /* renamed from: Q6 */
    public void mo56846Q6() {
        Integer num;
        int i;
        C43420e s = m90115s();
        C27487a Vt = mo56848Vt();
        if (Vt != null) {
            num = Vt.mo66789d();
        } else {
            num = null;
        }
        if (num == null || !s.mo102116v(num.intValue())) {
            i = s.mo102109j();
        } else {
            i = num.intValue();
        }
        mo56870vi().mo4823o(C41233s.m119492a(s, Integer.valueOf(i)));
        mo56841K(i);
    }

    /* renamed from: Up */
    public void mo56847Up(C31128a aVar) {
        C41536l.m120489i(aVar, "newValue");
        mo56874z1().mo4823o(aVar);
    }

    /* renamed from: Vt */
    public C27487a mo56848Vt() {
        return this.f74920r;
    }

    /* renamed from: Yi */
    public Date mo56849Yi(int i) {
        Date K = C32319m.m95291K(new Date(C27487a.f70365g.mo66801a()), i);
        C41536l.m120488h(K, "plusMonth(Date(DepositAp…epositStartDate), months)");
        return K;
    }

    /* renamed from: Z6 */
    public void mo56851Z6(String str) {
        C31128a.C31131c cVar;
        WithdrawalTypeUiModel withdrawalTypeUiModel;
        List list;
        Object obj;
        Object f = mo56874z1().mo4814f();
        if (f instanceof C31128a.C31131c) {
            cVar = (C31128a.C31131c) f;
        } else {
            cVar = null;
        }
        if (cVar == null || (list = (List) cVar.mo71340a()) == null) {
            withdrawalTypeUiModel = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((WithdrawalTypeUiModel) obj).mo56827b(), str)) {
                    break;
                }
            }
            withdrawalTypeUiModel = (WithdrawalTypeUiModel) obj;
        }
        C29665b.C29666a.m90080c(this, new C29698r(withdrawalTypeUiModel), false, 2, (Object) null);
        mo56845Pn();
    }

    /* renamed from: gv */
    public void mo56855gv() {
        String str;
        String p = mo56869ur().mo66796i().mo57229p();
        BigDecimal f = mo56869ur().mo66792f();
        String h = mo56869ur().mo66794h();
        Long e = mo56869ur().mo66790e();
        if (e != null) {
            str = e.toString();
        } else {
            str = null;
        }
        boolean ub = mo56868ub(f);
        if (f != null && h != null && ub) {
            C40767b bVar = this.f74922t;
            String bigDecimal = f.toString();
            C41536l.m120488h(bigDecimal, "initialAmount.toString()");
            bVar.onNext(new C29678c(p, bigDecimal, h, str));
        }
    }

    /* renamed from: hk */
    public void mo56857hk() {
        C40749p L0 = this.f74923u.mo94989L0(new C29669e(new C29686i(this)));
        C41536l.m120488h(L0, "override fun observeInte… .bindToLifecycle()\n    }");
        C41205b F0 = mo56859in(C32343x.m95413R0(L0)).mo94981F0(new C29670f(new C29689j(this)));
        C41536l.m120488h(F0, "override fun observeInte… .bindToLifecycle()\n    }");
        mo70813a(F0);
    }

    /* renamed from: i9 */
    public void mo56858i9(C43075l lVar, boolean z) {
        C41536l.m120489i(lVar, "update");
        C27487a c = C27487a.m85254c(mo56869ur(), (DepositTypeDetailsUiModel) null, (C43075l) null, (BigDecimal) null, (String) null, (Date) null, (WithdrawalTypeUiModel) null, 63, (Object) null);
        C27487a aVar = (C27487a) lVar.invoke(mo56869ur());
        mo56865mk(aVar);
        if (z) {
            m90099M();
        }
        m90100N(c, aVar);
    }

    /* renamed from: in */
    public C40749p mo56859in(C40749p pVar) {
        C41536l.m120489i(pVar, "<this>");
        C40749p E = pVar.mo94978E(new C29673i(new C29685h(this)));
        C41536l.m120488h(E, "override fun <T : Reques…        }\n        }\n    }");
        return E;
    }

    /* renamed from: m */
    public LiveData mo56864m() {
        return this.f74918p;
    }

    /* renamed from: mk */
    public void mo56865mk(C27487a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f74919q = aVar;
    }

    /* renamed from: nf */
    public void mo56867nf(C27487a aVar) {
        this.f74920r = aVar;
    }

    /* renamed from: ub */
    public boolean mo56868ub(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return false;
        }
        try {
            if (bigDecimal.compareTo(new BigDecimal(C32343x.m95388F(mo56869ur().mo66796i().mo57226k(), new Object[0]))) >= 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ur */
    public C27487a mo56869ur() {
        C27487a aVar = this.f74919q;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("applicationFormData");
        return null;
    }

    /* renamed from: ws */
    public void mo56871ws(long j) {
        C31128a.C31131c cVar;
        C41224m mVar;
        InterestRateUiModel interestRateUiModel;
        if (mo56869ur().mo66799l()) {
            DepositTypeDetailsUiModel i = mo56869ur().mo66796i();
            Object f = mo56839Hc().mo4814f();
            Long l = null;
            if (f instanceof C31128a.C31131c) {
                cVar = (C31128a.C31131c) f;
            } else {
                cVar = null;
            }
            if (cVar != null && (mVar = (C41224m) cVar.mo71340a()) != null && (interestRateUiModel = (InterestRateUiModel) mVar.mo95678e()) != null) {
                C1644x B = mo56853f5();
                String p = i.mo57229p();
                C25695d e = i.mo57218e();
                BigDecimal f2 = mo56869ur().mo66792f();
                C41536l.m120486f(f2);
                String h = mo56869ur().mo66794h();
                C41536l.m120486f(h);
                WithdrawalTypeUiModel k = mo56869ur().mo66798k();
                C41536l.m120486f(k);
                long a = C27487a.f70365g.mo66801a();
                Date j2 = mo56869ur().mo66797j();
                if (j2 != null) {
                    l = Long.valueOf(j2.getTime());
                }
                B.mo4823o(C32343x.m95466m(new DepositSubmissionNavData(p, e, f2, h, k, a, l, interestRateUiModel, i.mo57228m(), i.mo57227l(), i.mo57226k(), Long.valueOf(j))));
            }
        }
    }

    /* renamed from: y */
    public C1644x mo56850Z3() {
        return this.f74913k;
    }

    /* renamed from: z */
    public C1644x mo56839Hc() {
        return this.f74915m;
    }
}
