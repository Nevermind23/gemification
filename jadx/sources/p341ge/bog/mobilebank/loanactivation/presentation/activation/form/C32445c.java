package p341ge.bog.mobilebank.loanactivation.presentation.activation.form;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import cq0.C31383m;
import cq0.C31385n;
import cq0.C31387p;
import cq0.C31388q;
import cq0.C31389r;
import cq0.C31390s;
import cq0.C31391t;
import cq0.C31392u;
import cq0.C31393v;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd0.C24978b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import m41.C37223a;
import m41.C37224b;
import mq0.C37251a;
import oq0.C37707a;
import oq0.C37708b;
import oq0.C37709c;
import oq0.C37710d;
import oq0.C37711e;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loanactivation.data.entity.loandecision.RefinanceInfoApiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.C32440a;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.recommender.model.RecommenderData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions.ConditionsData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.conditions.ForgivenFund;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.details.ActivationDetailsData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.CheckDecisionUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.checkdecision.RecommenderUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionDetailsUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.getdecision.GetDecisionUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoUiModel;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider.InsuranceProviderData;
import p603si.C17799b;
import pq0.C37941a;
import rq0.C38331b;
import sq0.C38508a;
import ue1.C43075l;
import ue1.C43079p;
import up0.C39054a;
import up0.C39057d;
import up0.C39058e;
import wp0.C39628a;
import wp0.C39632d;
import wq0.C39640a;
import yp0.C40044a;
import yp0.C40045b;
import ze1.C43420e;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c */
public final class C32445c extends C21481a implements C32440a, C31387p {

    /* renamed from: A */
    private final C40767b f79900A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C37707a f79901B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public GetDecisionUiModel f79902C;

    /* renamed from: d */
    private final String f79903d;

    /* renamed from: e */
    private final String f79904e;

    /* renamed from: f */
    private final C37124a f79905f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C31383m f79906g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C38331b f79907h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C39054a f79908i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C39057d f79909j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C39058e f79910k;

    /* renamed from: l */
    private final C32440a f79911l = this;

    /* renamed from: m */
    private final C31387p f79912m = this;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f79913n = new C1644x();

    /* renamed from: o */
    private final C1644x f79914o = new C1644x();

    /* renamed from: p */
    private final C1644x f79915p = new C1644x();

    /* renamed from: q */
    private final C1644x f79916q = new C1644x();

    /* renamed from: r */
    private final C1644x f79917r = new C1644x();

    /* renamed from: s */
    private final C1644x f79918s = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1644x f79919t = new C1644x();

    /* renamed from: u */
    private final C1644x f79920u = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C1644x f79921v = new C1644x();

    /* renamed from: w */
    private final C1644x f79922w = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1644x f79923x = new C1644x();

    /* renamed from: y */
    private final C1644x f79924y = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C40767b f79925z;

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$a */
    static final class C32446a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32445c f79926d;

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$a$a */
        /* synthetic */ class C32447a extends C41535k implements C43075l {
            C32447a(Object obj) {
                super(1, obj, C38331b.class, "convertGetDecision", "convertGetDecision(Lge/bog/mobilebank/loanactivation/domain/model/loandecision/LimitLoanDecision;)Lge/bog/mobilebank/loanactivation/presentation/activation/model/form/getdecision/GetDecisionUiModel;", 0);
            }

            /* renamed from: b */
            public final GetDecisionUiModel invoke(C39632d dVar) {
                C41536l.m120489i(dVar, "p0");
                return ((C38331b) this.receiver).mo91878i(dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32446a(C32445c cVar) {
            super(1);
            this.f79926d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final GetDecisionUiModel m95885c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (GetDecisionUiModel) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x A = this.f79926d.f79909j.mo92748a(this.f79926d.mo73248Hw(), this.f79926d.mo73249Iw()).mo95062A(new C32444b(new C32447a(this.f79926d.f79907h)));
            C41536l.m120488h(A, "getLoanDecision(limitId,…pper::convertGetDecision)");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$b */
    static final class C32448b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32445c f79927d;

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$b$a */
        static final class C32449a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32445c f79928d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32449a(C32445c cVar) {
                super(1);
                this.f79928d = cVar;
            }

            /* renamed from: a */
            public final void mo73254a(GetDecisionUiModel getDecisionUiModel) {
                C32445c cVar = this.f79928d;
                C41536l.m120488h(getDecisionUiModel, "decision");
                cVar.f79902C = getDecisionUiModel;
                C37707a a = this.f79928d.f79906g.mo71755a(getDecisionUiModel, this.f79928d.mo73247Gw());
                C32445c cVar2 = this.f79928d;
                cVar2.f79901B = a;
                cVar2.f79919t.mo4826r(a);
                this.f79928d.m95816Cw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo73254a((GetDecisionUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$b$b */
        static final class C32450b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C32445c f79929d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32450b(C32445c cVar) {
                super(2);
                this.f79929d = cVar;
            }

            /* renamed from: a */
            public final void mo73255a(Throwable th, GetDecisionUiModel getDecisionUiModel) {
                C41536l.m120489i(th, "<anonymous parameter 0>");
                C32440a.C32441a.m95802a(this.f79929d, C40044a.LOAN_ACTIVATION_PAGE_ERROR, (String) null, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo73255a((Throwable) obj, (GetDecisionUiModel) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32448b(C32445c cVar) {
            super(1);
            this.f79927d = cVar;
        }

        /* renamed from: a */
        public final void mo73253a(C31128a aVar) {
            this.f79927d.f79913n.mo4826r(aVar);
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C32449a(this.f79927d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C32450b(this.f79927d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73253a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$c */
    static final class C32451c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LoanAccountListItem f79930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32451c(LoanAccountListItem loanAccountListItem) {
            super(1);
            this.f79930d = loanAccountListItem;
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            C37707a aVar2 = aVar;
            C41536l.m120489i(aVar2, "$this$updateForm");
            return C37707a.m110824b(aVar2, (String) null, (C37710d) null, (C37710d) null, (C37710d) null, (C37709c) null, (C37711e) null, (C37711e) null, (C37710d) null, C37710d.m110846b(aVar.mo90908c(), (C17799b) null, (String) null, false, false, this.f79930d, false, 47, (Object) null), (C37708b) null, false, false, (C37223a) null, 7935, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$d */
    static final class C32452d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f79931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32452d(String str) {
            super(1);
            this.f79931d = str;
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            C37707a aVar2 = aVar;
            C41536l.m120489i(aVar2, "$this$updateForm");
            return C37707a.m110824b(aVar2, (String) null, C37710d.m110846b(aVar.mo90909d(), (C17799b) null, (String) null, aVar.mo90909d().mo90939e().mo45386g(this.f79931d), false, this.f79931d, false, 43, (Object) null), (C37710d) null, (C37710d) null, (C37709c) null, (C37711e) null, (C37711e) null, (C37710d) null, (C37710d) null, (C37708b) null, false, false, (C37223a) null, 8189, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$e */
    static final class C32453e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32445c f79932d;

        /* renamed from: e */
        final /* synthetic */ InsuranceProviderData f79933e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32453e(C32445c cVar, InsuranceProviderData insuranceProviderData) {
            super(1);
            this.f79932d = cVar;
            this.f79933e = insuranceProviderData;
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            C41536l.m120489i(aVar, "$this$updateForm");
            C37710d h = aVar.mo90914h();
            C31383m tw = this.f79932d.f79906g;
            GetDecisionUiModel sw = this.f79932d.f79902C;
            if (sw == null) {
                C41536l.m120506z("loanDecision");
                sw = null;
            }
            return C37707a.m110824b(aVar, (String) null, (C37710d) null, (C37710d) null, (C37710d) null, (C37709c) null, (C37711e) null, (C37711e) null, C37710d.m110846b(h, (C17799b) null, (String) null, aVar.mo90914h().mo90939e().mo45386g(this.f79933e.mo73529a()), false, tw.mo71757c(sw, this.f79933e.mo73529a()), false, 43, (Object) null), (C37710d) null, new C37708b(aVar.mo90916i().mo90948c().booleanValue(), aVar.mo90919l().mo90948c().booleanValue()), false, false, (C37223a) null, 7551, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$f */
    static final class C32454f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ boolean f79934d;

        /* renamed from: e */
        final /* synthetic */ boolean f79935e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32454f(boolean z, boolean z2) {
            super(1);
            this.f79934d = z;
            this.f79935e = z2;
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            ProviderInfoUiModel providerInfoUiModel;
            boolean z;
            C41536l.m120489i(aVar, "$this$updateForm");
            C37710d h = aVar.mo90914h();
            if (this.f79934d) {
                providerInfoUiModel = null;
            } else {
                providerInfoUiModel = (ProviderInfoUiModel) aVar.mo90914h().mo90941f();
            }
            C37710d b = C37710d.m110846b(h, (C17799b) null, (String) null, true, false, providerInfoUiModel, false, 43, (Object) null);
            C37711e b2 = C37711e.m110855b(aVar.mo90916i(), false, false, this.f79935e, 3, (Object) null);
            boolean z2 = true;
            if (aVar.mo90914h().mo90941f() == null || !this.f79935e) {
                z = false;
            } else {
                z = true;
            }
            if (aVar.mo90914h().mo90941f() == null || !aVar.mo90919l().mo90948c().booleanValue()) {
                z2 = false;
            }
            return C37707a.m110824b(aVar, (String) null, (C37710d) null, (C37710d) null, (C37710d) null, (C37709c) null, b2, (C37711e) null, b, (C37710d) null, new C37708b(z, z2), false, false, (C37223a) null, 7519, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$g */
    static final class C32455g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f79936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32455g(int i) {
            super(1);
            this.f79936d = i;
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            C37707a aVar2 = aVar;
            C41536l.m120489i(aVar2, "$this$updateForm");
            return C37707a.m110824b(aVar2, (String) null, (C37710d) null, (C37710d) null, C37710d.m110846b(aVar.mo90922o(), (C17799b) null, (String) null, aVar.mo90922o().mo90939e().mo45386g(String.valueOf(this.f79936d)), false, Integer.valueOf(this.f79936d), false, 43, (Object) null), (C37709c) null, (C37711e) null, (C37711e) null, (C37710d) null, (C37710d) null, (C37708b) null, false, false, (C37223a) null, 8183, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$h */
    static final class C32456h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ int f79937d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32456h(int i) {
            super(1);
            this.f79937d = i;
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            C37707a aVar2 = aVar;
            C41536l.m120489i(aVar2, "$this$updateForm");
            return C37707a.m110824b(aVar2, (String) null, (C37710d) null, C37710d.m110846b(aVar.mo90918k(), (C17799b) null, (String) null, aVar.mo90918k().mo90939e().mo45386g(String.valueOf(this.f79937d)), false, Integer.valueOf(this.f79937d), false, 43, (Object) null), (C37710d) null, (C37709c) null, (C37711e) null, (C37711e) null, (C37710d) null, (C37710d) null, (C37708b) null, false, false, (C37223a) null, 8187, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$i */
    static final class C32457i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ProviderInfoUiModel f79938d;

        /* renamed from: e */
        final /* synthetic */ boolean f79939e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32457i(ProviderInfoUiModel providerInfoUiModel, boolean z) {
            super(1);
            this.f79938d = providerInfoUiModel;
            this.f79939e = z;
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "$this$updateForm");
            C37710d b = C37710d.m110846b(aVar.mo90914h(), (C17799b) null, (String) null, true, false, this.f79938d, false, 43, (Object) null);
            C37711e b2 = C37711e.m110855b(aVar.mo90919l(), false, false, this.f79939e, 3, (Object) null);
            C37708b e = aVar.mo90910e();
            boolean z2 = true;
            if (this.f79938d == null || !aVar.mo90916i().mo90948c().booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f79938d == null || !this.f79939e) {
                z2 = false;
            }
            return C37707a.m110824b(aVar, (String) null, (C37710d) null, (C37710d) null, (C37710d) null, (C37709c) null, (C37711e) null, b2, b, (C37710d) null, e.mo90924a(z, z2), false, false, (C37223a) null, 7487, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$j */
    static final class C32458j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38508a.C38511c f79940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32458j(C38508a.C38511c cVar) {
            super(1);
            this.f79940d = cVar;
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            ArrayList arrayList;
            C41536l.m120489i(aVar, "$this$updateForm");
            C37709c m = aVar.mo90920m();
            List<Object> list = (List) aVar.mo90920m().mo90931c();
            if (list != null) {
                C38508a.C38511c cVar = this.f79940d;
                ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
                for (Object obj : list) {
                    if (C41536l.m120484d(obj, cVar)) {
                        C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.loanactivation.presentation.activation.model.form.refinanceinfo.RefinanceInfoListItem.RefinanceItem");
                        C38508a.C38511c cVar2 = (C38508a.C38511c) obj;
                        obj = C38508a.C38511c.m113051b(cVar2, (RefinanceInfoUiModel) null, !cVar2.mo92078e(), false, 5, (Object) null);
                    }
                    arrayList2.add(obj);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return C37707a.m110824b(aVar, (String) null, (C37710d) null, (C37710d) null, (C37710d) null, C37709c.m110842b(m, arrayList, false, false, 6, (Object) null), (C37711e) null, (C37711e) null, (C37710d) null, (C37710d) null, (C37708b) null, false, false, (C37223a) null, 8175, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$k */
    static final class C32459k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Throwable f79941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32459k(Throwable th) {
            super(1);
            this.f79941d = th;
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            C37223a aVar2;
            C41536l.m120489i(aVar, "$this$updateForm");
            Throwable th = this.f79941d;
            if (th == null || (aVar2 = C32343x.m95466m(th)) == null) {
                aVar2 = aVar.mo90913g();
            }
            return C37707a.m110824b(aVar, (String) null, (C37710d) null, (C37710d) null, (C37710d) null, (C37709c) null, (C37711e) null, (C37711e) null, (C37710d) null, (C37710d) null, (C37708b) null, false, false, aVar2, C11051p3.f31758b, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$l */
    static final class C32460l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32445c f79942d;

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$l$a */
        /* synthetic */ class C32461a extends C41535k implements C43075l {
            C32461a(Object obj) {
                super(1, obj, C38331b.class, "convertCheckDecision", "convertCheckDecision(Lge/bog/mobilebank/loanactivation/domain/model/loandecision/LimitLoanDecision;)Lge/bog/mobilebank/loanactivation/presentation/activation/model/form/checkdecision/CheckDecisionResultType;", 0);
            }

            /* renamed from: b */
            public final C37941a invoke(C39632d dVar) {
                C41536l.m120489i(dVar, "p0");
                return ((C38331b) this.receiver).mo91877g(dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32460l(C32445c cVar) {
            super(1);
            this.f79942d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C37941a m95901c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C37941a) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            String str;
            String str2;
            String str3;
            Double d;
            Long l;
            LoanAccountListItem loanAccountListItem;
            LoanAccountListItem loanAccountListItem2;
            C41536l.m120489i(wVar, "it");
            C39054a nw = this.f79942d.f79908i;
            GetDecisionUiModel sw = this.f79942d.f79902C;
            if (sw == null) {
                C41536l.m120506z("loanDecision");
                sw = null;
            }
            Long b = sw.mo73432a().mo73409b();
            GetDecisionUiModel sw2 = this.f79942d.f79902C;
            if (sw2 == null) {
                C41536l.m120506z("loanDecision");
                sw2 = null;
            }
            String d2 = sw2.mo73432a().mo73410d();
            GetDecisionUiModel sw3 = this.f79942d.f79902C;
            if (sw3 == null) {
                C41536l.m120506z("loanDecision");
                sw3 = null;
            }
            String b2 = sw3.mo73432a().mo73423p().mo66359b();
            if (this.f79942d.mo73247Gw() != C37124a.CL || (loanAccountListItem2 = (LoanAccountListItem) this.f79942d.m95818Ew().mo90908c().mo90941f()) == null) {
                str = null;
            } else {
                str = loanAccountListItem2.mo73344g();
            }
            GetDecisionUiModel sw4 = this.f79942d.f79902C;
            if (sw4 == null) {
                C41536l.m120506z("loanDecision");
                sw4 = null;
            }
            String k = sw4.mo73432a().mo73420k();
            Integer num = (Integer) this.f79942d.m95818Ew().mo90922o().mo90941f();
            Integer num2 = (Integer) this.f79942d.m95818Ew().mo90918k().mo90941f();
            List list = (List) this.f79942d.m95818Ew().mo90920m().mo90931c();
            if (list != null) {
                str2 = this.f79942d.m95827Sw(list);
            } else {
                str2 = null;
            }
            String e = C24978b.m79846b(this.f79942d.m95818Ew().mo90919l().mo90948c()).mo63391e();
            ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) this.f79942d.m95818Ew().mo90914h().mo90941f();
            if (providerInfoUiModel != null) {
                str3 = providerInfoUiModel.mo73484d();
            } else {
                str3 = null;
            }
            String str4 = (String) this.f79942d.m95818Ew().mo90909d().mo90941f();
            if (str4 != null) {
                d = Double.valueOf(Double.parseDouble(str4));
            } else {
                d = null;
            }
            if (this.f79942d.mo73247Gw() != C37124a.RL || (loanAccountListItem = (LoanAccountListItem) this.f79942d.m95818Ew().mo90908c().mo90941f()) == null) {
                l = null;
            } else {
                l = loanAccountListItem.mo73337a();
            }
            C40762x A = nw.mo92745a(b, d2, b2, str, k, num, num2, str2, e, str3, d, l).mo95062A(new C32472d(new C32461a(this.f79942d.f79907h)));
            C41536l.m120488h(A, "checkLoanDecision(\n     …er::convertCheckDecision)");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$m */
    static final class C32462m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32445c f79943d;

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$m$a */
        static final class C32463a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32445c f79944d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32463a(C32445c cVar) {
                super(1);
                this.f79944d = cVar;
            }

            /* renamed from: a */
            public final void mo73268a(C37941a aVar) {
                C32445c.m95820Lw(this.f79944d, true, (Throwable) null, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo73268a((C37941a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$m$b */
        static final class C32464b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32445c f79945d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32464b(C32445c cVar) {
                super(1);
                this.f79945d = cVar;
            }

            /* renamed from: a */
            public final void mo73269a(C37941a aVar) {
                String str;
                String str2;
                Long l;
                String str3;
                LoanAccountListItem loanAccountListItem;
                LoanAccountListItem loanAccountListItem2;
                boolean z;
                C37941a aVar2 = aVar;
                String str4 = null;
                C32445c.m95820Lw(this.f79945d, false, (Throwable) null, 2, (Object) null);
                if (aVar2 instanceof RecommenderUiModel) {
                    RecommenderUiModel recommenderUiModel = (RecommenderUiModel) aVar2;
                    boolean z2 = true;
                    if (recommenderUiModel.mo73398d() == Utils.DOUBLE_EPSILON) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (recommenderUiModel.mo73397b() != Utils.DOUBLE_EPSILON) {
                            z2 = false;
                        }
                        if (!z2) {
                            C32440a.C32441a.m95802a(this.f79945d, C40044a.LOAN_RECOMMENDER_OPENED, (String) null, 2, (Object) null);
                            C37224b.m109965d(this.f79945d.f79923x, new RecommenderData(recommenderUiModel.mo73398d(), recommenderUiModel.mo73397b(), recommenderUiModel.mo73396a()));
                            return;
                        }
                    }
                    this.f79945d.m95819Kw(false, new Throwable());
                } else if (aVar2 instanceof CheckDecisionUiModel) {
                    C1644x uw = this.f79945d.f79921v;
                    GetDecisionUiModel sw = this.f79945d.f79902C;
                    if (sw == null) {
                        C41536l.m120506z("loanDecision");
                        sw = null;
                    }
                    Long b = sw.mo73432a().mo73409b();
                    GetDecisionUiModel sw2 = this.f79945d.f79902C;
                    if (sw2 == null) {
                        C41536l.m120506z("loanDecision");
                        sw2 = null;
                    }
                    String d = sw2.mo73432a().mo73410d();
                    ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) this.f79945d.m95818Ew().mo90914h().mo90941f();
                    if (providerInfoUiModel != null) {
                        str = providerInfoUiModel.mo73484d();
                    } else {
                        str = null;
                    }
                    String Hw = this.f79945d.mo73248Hw();
                    boolean booleanValue = this.f79945d.m95818Ew().mo90916i().mo90948c().booleanValue();
                    boolean booleanValue2 = this.f79945d.m95818Ew().mo90919l().mo90948c().booleanValue();
                    LoanAccountListItem loanAccountListItem3 = (LoanAccountListItem) this.f79945d.m95818Ew().mo90908c().mo90941f();
                    if (loanAccountListItem3 != null) {
                        str2 = loanAccountListItem3.mo73338b();
                    } else {
                        str2 = null;
                    }
                    if (this.f79945d.mo73247Gw() != C37124a.RL || (loanAccountListItem2 = (LoanAccountListItem) this.f79945d.m95818Ew().mo90908c().mo90941f()) == null) {
                        l = null;
                    } else {
                        l = loanAccountListItem2.mo73337a();
                    }
                    if (this.f79945d.mo73247Gw() == C37124a.CL && (loanAccountListItem = (LoanAccountListItem) this.f79945d.m95818Ew().mo90908c().mo90941f()) != null) {
                        str4 = loanAccountListItem.mo73344g();
                    }
                    String str5 = str4;
                    C37124a Gw = this.f79945d.mo73247Gw();
                    List list = (List) this.f79945d.m95818Ew().mo90920m().mo90931c();
                    if (list == null || (str3 = this.f79945d.m95827Sw(list)) == null) {
                        str3 = "";
                    }
                    CheckDecisionUiModel checkDecisionUiModel = (CheckDecisionUiModel) aVar2;
                    C39628a a = checkDecisionUiModel.mo73384a().mo73355a();
                    C41536l.m120488h(aVar2, "decision");
                    uw.mo4826r(C32343x.m95466m(new ActivationDetailsData(d, str, l, str2, str5, b, Hw, booleanValue, booleanValue2, checkDecisionUiModel, Gw, str3, a)));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo73269a((C37941a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$m$c */
        static final class C32465c extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C32445c f79946d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32465c(C32445c cVar) {
                super(2);
                this.f79946d = cVar;
            }

            /* renamed from: a */
            public final void mo73270a(Throwable th, C37941a aVar) {
                C41536l.m120489i(th, "error");
                this.f79946d.m95819Kw(false, th);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo73270a((Throwable) obj, (C37941a) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32462m(C32445c cVar) {
            super(1);
            this.f79943d = cVar;
        }

        /* renamed from: a */
        public final void mo73267a(C31128a aVar) {
            C41536l.m120488h(aVar, "response");
            C31132b.m92646h(aVar, (int[]) null, new C32463a(this.f79943d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C32464b(this.f79943d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C32465c(this.f79943d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73267a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$n */
    static final class C32466n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32445c f79947d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32466n(C32445c cVar) {
            super(1);
            this.f79947d = cVar;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return C31270e.m92878g(this.f79947d.f79910k.mo92749a(), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$o */
    static final class C32467o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C32445c f79948d;

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$o$a */
        static final class C32468a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32445c f79949d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32468a(C32445c cVar) {
                super(1);
                this.f79949d = cVar;
            }

            /* renamed from: a */
            public final void mo73273a(C41238w wVar) {
                C32445c.m95820Lw(this.f79949d, true, (Throwable) null, 2, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo73273a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$o$b */
        static final class C32469b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32445c f79950d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32469b(C32445c cVar) {
                super(1);
                this.f79950d = cVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "error");
                this.f79950d.m95819Kw(false, th);
            }
        }

        /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$o$c */
        static final class C32470c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C32445c f79951d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32470c(C32445c cVar) {
                super(1);
                this.f79951d = cVar;
            }

            /* renamed from: a */
            public final void mo73275a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f79951d.f79925z.onNext(C41238w.f97225a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo73275a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32467o(C32445c cVar) {
            super(1);
            this.f79948d = cVar;
        }

        /* renamed from: a */
        public final void mo73272a(C31128a aVar) {
            C41536l.m120488h(aVar, "response");
            C31132b.m92646h(aVar, (int[]) null, new C32468a(this.f79948d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C32469b(this.f79948d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C32470c(this.f79948d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo73272a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.c$p */
    static final class C32471p extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C32471p f79952d = new C32471p();

        C32471p() {
            super(1);
        }

        /* renamed from: a */
        public final C37707a invoke(C37707a aVar) {
            C37707a aVar2 = aVar;
            C41536l.m120489i(aVar2, "$this$updateForm");
            return C37707a.m110824b(aVar2, (String) null, C37710d.m110846b(aVar.mo90909d(), (C17799b) null, (String) null, aVar.mo90909d().mo90945i(), false, (Object) null, false, 59, (Object) null), C37710d.m110846b(aVar.mo90918k(), (C17799b) null, (String) null, aVar.mo90918k().mo90945i(), false, (Object) null, false, 59, (Object) null), C37710d.m110846b(aVar.mo90922o(), (C17799b) null, (String) null, aVar.mo90922o().mo90945i(), false, (Object) null, false, 59, (Object) null), (C37709c) null, (C37711e) null, (C37711e) null, C37710d.m110846b(aVar.mo90914h(), (C17799b) null, (String) null, aVar.mo90914h().mo90945i(), false, (Object) null, false, 59, (Object) null), (C37710d) null, (C37708b) null, false, false, (C37223a) null, 8049, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32445c(String str, String str2, C37124a aVar, C31383m mVar, C38331b bVar, C39054a aVar2, C39057d dVar, C39058e eVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "limitId");
        C41536l.m120489i(str2, "operationType");
        C41536l.m120489i(aVar, C11769i.C11770a.f34151n);
        C41536l.m120489i(mVar, "uiStateHelper");
        C41536l.m120489i(bVar, "decisionMapper");
        C41536l.m120489i(aVar2, "checkLoanDecision");
        C41536l.m120489i(dVar, "getLoanDecision");
        C41536l.m120489i(eVar, "identifyCreditor");
        this.f79903d = str;
        this.f79904e = str2;
        this.f79905f = aVar;
        this.f79906g = mVar;
        this.f79907h = bVar;
        this.f79908i = aVar2;
        this.f79909j = dVar;
        this.f79910k = eVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f79925z = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f79900A = h12;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C31388q(new C32446a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…QUEST_CODE)\n            }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C31389r(new C32448b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…      }\n                }");
        bindToLifecycle(F0);
        m95821Mw();
        m95824Pw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public final void m95816Cw() {
        double d;
        double d2;
        double d3;
        GetDecisionUiModel getDecisionUiModel = this.f79902C;
        if (getDecisionUiModel == null) {
            C41536l.m120506z("loanDecision");
            getDecisionUiModel = null;
        }
        GetDecisionDetailsUiModel a = getDecisionUiModel.mo73432a();
        ArrayList arrayList = new ArrayList();
        if (C39640a.m115205a(a.mo73415g())) {
            Double g = a.mo73415g();
            C41536l.m120486f(g);
            arrayList.add(new ForgivenFund(g.doubleValue(), C37251a.ODI));
        }
        if (C39640a.m115205a(a.mo73412e())) {
            Double e = a.mo73412e();
            C41536l.m120486f(e);
            arrayList.add(new ForgivenFund(e.doubleValue(), C37251a.FEE));
        }
        if (C39640a.m115205a(a.mo73414f())) {
            Double f = a.mo73414f();
            C41536l.m120486f(f);
            arrayList.add(new ForgivenFund(f.doubleValue(), C37251a.INT));
        }
        Double g2 = a.mo73415g();
        double d4 = Utils.DOUBLE_EPSILON;
        if (g2 != null) {
            d = g2.doubleValue();
        } else {
            d = 0.0d;
        }
        Double e2 = a.mo73412e();
        if (e2 != null) {
            d2 = e2.doubleValue();
        } else {
            d2 = 0.0d;
        }
        double d5 = d + d2;
        Double f2 = a.mo73414f();
        if (f2 != null) {
            d3 = f2.doubleValue();
        } else {
            d3 = 0.0d;
        }
        double d6 = d5 + d3;
        if (C39640a.m115205a(Double.valueOf(d6)) || C39640a.m115205a(a.mo73425r())) {
            C1644x xVar = this.f79920u;
            Double r = a.mo73425r();
            if (r != null) {
                d4 = r.doubleValue();
            }
            xVar.mo4826r(C32343x.m95466m(new ConditionsData(arrayList, d6, d4, a.mo73420k())));
        }
    }

    /* renamed from: Dw */
    private final boolean m95817Dw() {
        boolean z;
        List<C38508a> list = (List) m95818Ew().mo90920m().mo90931c();
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (C38508a aVar : list) {
            if (!(aVar instanceof C38508a.C38511c) || ((C38508a.C38511c) aVar).mo92077c().mo73523v()) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public final C37707a m95818Ew() {
        Object f = this.f79919t.mo4814f();
        C41536l.m120486f(f);
        return (C37707a) f;
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public final void m95819Kw(boolean z, Throwable th) {
        this.f79924y.mo4826r(Boolean.valueOf(z));
        m95828Tw(new C32459k(th));
    }

    /* renamed from: Lw */
    static /* synthetic */ void m95820Lw(C32445c cVar, boolean z, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        cVar.m95819Kw(z, th);
    }

    /* renamed from: Mw */
    private final void m95821Mw() {
        C40749p L0 = this.f79925z.mo94989L0(new C31392u(new C32460l(this)));
        C41536l.m120488h(L0, "private fun subscribeChe…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C31393v(new C32462m(this)));
        C41536l.m120488h(F0, "private fun subscribeChe…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final C40754t m95822Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final void m95823Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Pw */
    private final void m95824Pw() {
        C40749p L0 = this.f79900A.mo94989L0(new C31390s(new C32466n(this)));
        C41536l.m120488h(L0, "private fun subscribeIde…ndToLifecycle()\n        }");
        C41205b F0 = C32343x.m95413R0(L0).mo94981F0(new C31391t(new C32467o(this)));
        C41536l.m120488h(F0, "private fun subscribeIde…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final C40754t m95825Qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rw */
    public static final void m95826Rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public final String m95827Sw(List list) {
        Iterator it;
        RefinanceInfoApiModel refinanceInfoApiModel;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C38508a aVar = (C38508a) it2.next();
            if (aVar instanceof C38508a.C38511c) {
                C38508a.C38511c cVar = (C38508a.C38511c) aVar;
                RefinanceInfoUiModel c = cVar.mo92077c();
                String s = c.mo73519s();
                String a = c.mo73501a();
                String f = c.mo73507f();
                String i = c.mo73511i();
                String l = c.mo73514l();
                String j = c.mo73512j();
                String h = c.mo73509h();
                String m = c.mo73515m();
                String e = C24978b.m79846b(Boolean.valueOf(c.mo73523v())).mo63391e();
                String k = c.mo73513k();
                Double valueOf = Double.valueOf(c.mo73503d());
                String e2 = C24978b.m79846b(Boolean.valueOf(cVar.mo92078e())).mo63391e();
                it = it2;
                C41536l.m120488h(e2, "fromBoolean(it.isChecked).value");
                refinanceInfoApiModel = new RefinanceInfoApiModel(s, a, f, i, l, j, h, m, e, k, valueOf, e2, c.mo73508g(), c.mo73517q(), c.mo73518r(), c.mo73505e(), c.mo73520t(), c.mo73522u(), c.mo73516p());
            } else {
                it = it2;
                refinanceInfoApiModel = null;
            }
            RefinanceInfoApiModel refinanceInfoApiModel2 = refinanceInfoApiModel;
            if (refinanceInfoApiModel2 != null) {
                arrayList.add(refinanceInfoApiModel2);
            }
            it2 = it;
        }
        return C32343x.m95471n1(arrayList);
    }

    /* renamed from: Tw */
    private final void m95828Tw(C43075l lVar) {
        this.f79919t.mo4826r(lVar.invoke(m95818Ew()));
    }

    /* renamed from: Uw */
    private final boolean m95829Uw() {
        C37707a aVar = (C37707a) this.f79919t.mo4814f();
        if (aVar == null || aVar.mo90908c().mo90941f() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: Vw */
    private final boolean m95830Vw() {
        m95828Tw(C32471p.f79952d);
        List<C37710d> m = C41341q.m119910m(m95818Ew().mo90909d(), m95818Ew().mo90922o(), m95818Ew().mo90918k(), m95818Ew().mo90914h());
        if (!(m instanceof Collection) || !m.isEmpty()) {
            for (C37710d d : m) {
                if (!d.mo90938d()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final C40754t m95837jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final void m95838kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: B1 */
    public LiveData mo71758B1() {
        return this.f79913n;
    }

    /* renamed from: E8 */
    public LiveData mo71759E8() {
        return this.f79915p;
    }

    /* renamed from: Eq */
    public LiveData mo71760Eq() {
        return this.f79920u;
    }

    /* renamed from: Eu */
    public LiveData mo71761Eu() {
        return this.f79921v;
    }

    /* renamed from: Fw */
    public final C32440a mo73246Fw() {
        return this.f79911l;
    }

    /* renamed from: G2 */
    public void mo73207G2(C38508a.C38511c cVar) {
        C41536l.m120489i(cVar, "item");
        C32440a.C32441a.m95802a(this, C40044a.LOAN_ACTIVATION_REPAYMENT_TOGGLED, (String) null, 2, (Object) null);
        m95828Tw(new C32458j(cVar));
    }

    /* renamed from: Gw */
    public final C37124a mo73247Gw() {
        return this.f79905f;
    }

    /* renamed from: Hw */
    public final String mo73248Hw() {
        return this.f79903d;
    }

    /* renamed from: Iw */
    public final String mo73249Iw() {
        return this.f79904e;
    }

    /* renamed from: Jw */
    public final C31387p mo73250Jw() {
        return this.f79912m;
    }

    /* renamed from: Kd */
    public void mo73208Kd(InsuranceProviderData insuranceProviderData) {
        C41536l.m120489i(insuranceProviderData, "provider");
        mo73219o5(C40044a.INSURANCE_ACTION_SHEET_CLICK_SAVE, insuranceProviderData.mo73529a());
        m95828Tw(new C32453e(this, insuranceProviderData));
    }

    /* renamed from: Ko */
    public LiveData mo71762Ko() {
        return this.f79923x;
    }

    /* renamed from: N2 */
    public void mo73209N2() {
        this.f79914o.mo4826r(C32343x.m95466m(C41358y.m120036z0(C31385n.f77935b)));
    }

    /* renamed from: Nm */
    public void mo73210Nm() {
        C1644x xVar = this.f79919t;
        C37707a aVar = this.f79901B;
        if (aVar == null) {
            C41536l.m120506z("initialUiState");
            aVar = null;
        }
        xVar.mo4826r(aVar);
    }

    /* renamed from: O0 */
    public void mo73211O0(boolean z) {
        boolean z2;
        InsuranceInfoUiModel insuranceInfoUiModel;
        if (m95818Ew().mo90919l().mo90948c().booleanValue()) {
            ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) m95818Ew().mo90914h().mo90941f();
            if (providerInfoUiModel != null) {
                insuranceInfoUiModel = providerInfoUiModel.mo73482a();
            } else {
                insuranceInfoUiModel = null;
            }
            if (insuranceInfoUiModel == null) {
                z2 = true;
                m95828Tw(new C32454f(z2, z));
            }
        }
        z2 = false;
        m95828Tw(new C32454f(z2, z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Q2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73212Q2(boolean r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0005
            yp0.a r0 = yp0.C40044a.SWITCH_INS_INC_TOGGLE_ON
            goto L_0x0007
        L_0x0005:
            yp0.a r0 = yp0.C40044a.SWITCH_INS_INC_TOGGLE_OFF
        L_0x0007:
            r1 = 2
            r2 = 0
            p341ge.bog.mobilebank.loanactivation.presentation.activation.form.C32440a.C32441a.m95802a(r3, r0, r2, r1, r2)
            oq0.a r0 = r3.m95818Ew()
            oq0.e r0 = r0.mo90916i()
            java.lang.Boolean r0 = r0.mo90948c()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0037
            oq0.a r0 = r3.m95818Ew()
            oq0.d r0 = r0.mo90914h()
            java.lang.Object r0 = r0.mo90941f()
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel r0 = (p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel) r0
            if (r0 == 0) goto L_0x0033
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.InsuranceInfoUiModel r0 = r0.mo73483b()
            goto L_0x0034
        L_0x0033:
            r0 = r2
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            goto L_0x0046
        L_0x0037:
            oq0.a r0 = r3.m95818Ew()
            oq0.d r0 = r0.mo90914h()
            java.lang.Object r0 = r0.mo90941f()
            r2 = r0
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel r2 = (p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.provider.ProviderInfoUiModel) r2
        L_0x0046:
            ge.bog.mobilebank.loanactivation.presentation.activation.form.c$i r0 = new ge.bog.mobilebank.loanactivation.presentation.activation.form.c$i
            r0.<init>(r2, r4)
            r3.m95828Tw(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loanactivation.presentation.activation.form.C32445c.mo73212Q2(boolean):void");
    }

    /* renamed from: T */
    public void mo73213T() {
        C1644x xVar = this.f79915p;
        GetDecisionUiModel getDecisionUiModel = this.f79902C;
        GetDecisionUiModel getDecisionUiModel2 = null;
        if (getDecisionUiModel == null) {
            C41536l.m120506z("loanDecision");
            getDecisionUiModel = null;
        }
        int m = getDecisionUiModel.mo73432a().mo73422m();
        GetDecisionUiModel getDecisionUiModel3 = this.f79902C;
        if (getDecisionUiModel3 == null) {
            C41536l.m120506z("loanDecision");
        } else {
            getDecisionUiModel2 = getDecisionUiModel3;
        }
        xVar.mo4826r(C32343x.m95466m(C41358y.m120036z0(new C43420e(m, getDecisionUiModel2.mo73432a().mo73421l()))));
    }

    /* renamed from: Th */
    public LiveData mo71763Th() {
        return this.f79914o;
    }

    /* renamed from: Zs */
    public void mo73214Zs(String str, boolean z) {
        C41536l.m120489i(str, "amount");
        m95828Tw(new C32452d(str));
        if (z) {
            mo73217g0();
        }
    }

    /* renamed from: a */
    public LiveData mo71764a() {
        return this.f79919t;
    }

    /* renamed from: a7 */
    public void mo73215a7(int i) {
        C32440a.C32441a.m95802a(this, C40044a.SELECT_TERM, (String) null, 2, (Object) null);
        m95828Tw(new C32455g(i));
    }

    /* renamed from: e3 */
    public void mo73216e3() {
        C1644x xVar = this.f79916q;
        C31383m mVar = this.f79906g;
        GetDecisionUiModel getDecisionUiModel = this.f79902C;
        String str = null;
        if (getDecisionUiModel == null) {
            C41536l.m120506z("loanDecision");
            getDecisionUiModel = null;
        }
        ProviderInfoUiModel providerInfoUiModel = (ProviderInfoUiModel) m95818Ew().mo90914h().mo90941f();
        if (providerInfoUiModel != null) {
            str = providerInfoUiModel.mo73484d();
        }
        xVar.mo4826r(C32343x.m95466m(mVar.mo71756b(getDecisionUiModel, str, m95818Ew().mo90916i().mo90948c().booleanValue(), m95818Ew().mo90919l().mo90948c().booleanValue())));
    }

    /* renamed from: f7 */
    public LiveData mo71765f7() {
        return this.f79922w;
    }

    /* renamed from: g0 */
    public void mo73217g0() {
        if (!m95830Vw()) {
            C32440a.C32441a.m95802a(this, C40044a.CLICK_NEXT_BUTTON_INCOMPLETE_FIELDS, (String) null, 2, (Object) null);
        } else if (!m95829Uw()) {
            C32440a.C32441a.m95802a(this, C40044a.CLICK_NEXT_BUTTON_INCOMPLETE_FIELDS, (String) null, 2, (Object) null);
            mo73220rl();
        } else if (m95817Dw()) {
            C32440a.C32441a.m95802a(this, C40044a.CLICK_NEXT_BUTTON, (String) null, 2, (Object) null);
            this.f79900A.onNext(C41238w.f97225a);
        } else {
            C32440a.C32441a.m95802a(this, C40044a.CLICK_NEXT_BUTTON, (String) null, 2, (Object) null);
            this.f79925z.onNext(C41238w.f97225a);
        }
    }

    /* renamed from: k2 */
    public void mo73218k2(LoanAccountListItem loanAccountListItem) {
        C41536l.m120489i(loanAccountListItem, "selectedAccount");
        C32440a.C32441a.m95802a(this, C40044a.LOAN_ACTIVATION_ACCOUNT_SELECTED, (String) null, 2, (Object) null);
        m95828Tw(new C32451c(loanAccountListItem));
    }

    /* renamed from: o5 */
    public void mo73219o5(C40044a aVar, String str) {
        C41536l.m120489i(aVar, "log");
        C41536l.m120489i(str, "extraData");
        String[] strArr = new String[4];
        GetDecisionUiModel getDecisionUiModel = this.f79902C;
        String str2 = null;
        if (getDecisionUiModel == null) {
            C41536l.m120506z("loanDecision");
            getDecisionUiModel = null;
        }
        String d = getDecisionUiModel.mo73432a().mo73410d();
        if (d == null) {
            d = "";
        }
        strArr[0] = d;
        strArr[1] = this.f79903d;
        if (this.f79905f == C37124a.CL) {
            str2 = this.f79904e;
        }
        strArr[2] = str2;
        strArr[3] = str;
        C40045b.m116033a(this, aVar, C41341q.m119912o(strArr));
    }

    /* renamed from: rl */
    public void mo73220rl() {
        C1644x xVar = this.f79922w;
        GetDecisionUiModel getDecisionUiModel = this.f79902C;
        Long l = null;
        if (getDecisionUiModel == null) {
            C41536l.m120506z("loanDecision");
            getDecisionUiModel = null;
        }
        String k = getDecisionUiModel.mo73432a().mo73420k();
        LoanAccountListItem loanAccountListItem = (LoanAccountListItem) m95818Ew().mo90908c().mo90941f();
        if (loanAccountListItem != null) {
            l = loanAccountListItem.mo73337a();
        }
        C37224b.m109965d(xVar, new LoanAccountSelectorData(k, this.f79905f, l));
    }

    /* renamed from: w6 */
    public LiveData mo71766w6() {
        return this.f79916q;
    }

    /* renamed from: wq */
    public void mo73221wq(int i) {
        C32440a.C32441a.m95802a(this, C40044a.SELECT_PAYMENT_DAY, (String) null, 2, (Object) null);
        m95828Tw(new C32456h(i));
    }

    /* renamed from: x1 */
    public LiveData mo71767x1() {
        return this.f79924y;
    }
}
