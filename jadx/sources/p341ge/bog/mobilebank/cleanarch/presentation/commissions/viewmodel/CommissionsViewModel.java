package p341ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel;

import android.content.Intent;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import hd1.C41204a;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41519a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.model.UpcomingCommissionUIModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10328q;
import p811ku.C25771c;
import p811ku.C25774d;
import p811ku.C25776f;
import p811ku.C25777g;
import t00.C28293a;
import u00.C28533a;
import ue1.C43064a;
import ue1.C43075l;
import ze1.C43420e;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel */
public final class CommissionsViewModel extends C21481a {

    /* renamed from: A */
    private final LiveData f57346A;

    /* renamed from: d */
    private final PreferencesApiManager f57347d;

    /* renamed from: e */
    private final C25771c f57348e;

    /* renamed from: f */
    private final C25776f f57349f;

    /* renamed from: g */
    private final C25774d f57350g;

    /* renamed from: h */
    private final C25777g f57351h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C28293a f57352i;

    /* renamed from: j */
    private List f57353j = C41341q.m119907j();

    /* renamed from: k */
    private BigDecimal f57354k = BigDecimal.ZERO;

    /* renamed from: l */
    private int f57355l;

    /* renamed from: m */
    private List f57356m = new ArrayList();

    /* renamed from: n */
    private final C1644x f57357n;

    /* renamed from: o */
    private final LiveData f57358o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f57359p;

    /* renamed from: q */
    private final LiveData f57360q;

    /* renamed from: r */
    private final C1644x f57361r;

    /* renamed from: s */
    private final LiveData f57362s;

    /* renamed from: t */
    private final C1644x f57363t;

    /* renamed from: u */
    private final LiveData f57364u;

    /* renamed from: v */
    private final C1644x f57365v;

    /* renamed from: w */
    private final LiveData f57366w;

    /* renamed from: x */
    private final C1644x f57367x;

    /* renamed from: y */
    private final LiveData f57368y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C1644x f57369z;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$a */
    public enum C21467a {
        EXCESS,
        INCOMPLETE,
        FULL
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$b */
    /* synthetic */ class C21468b extends C41519a implements C43064a {
        C21468b(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo53574b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo53574b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$c */
    /* synthetic */ class C21469c extends C41535k implements C43075l {
        C21469c(Object obj) {
            super(1, obj, CommissionsViewModel.class, "setAccounts", "setAccounts(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo53575b(List list) {
            C41536l.m120489i(list, "p0");
            ((CommissionsViewModel) this.receiver).m69367zw(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53575b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$d */
    static final class C21470d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsViewModel f57374d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21470d(CommissionsViewModel commissionsViewModel) {
            super(1);
            this.f57374d = commissionsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C21484c.m69415g(this.f57374d.f57359p, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$e */
    static final class C21471e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsViewModel f57375d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21471e(CommissionsViewModel commissionsViewModel) {
            super(1);
            this.f57375d = commissionsViewModel;
        }

        /* renamed from: a */
        public final void mo53577a(String str) {
            C43420e eVar;
            List list;
            C41536l.m120489i(str, "it");
            C21503d dVar = (C21503d) this.f57375d.mo53562lw().mo4814f();
            if (dVar == null || (list = (List) dVar.mo53701a()) == null || (eVar = C41341q.m119908k(list)) == null) {
                eVar = C41341q.m119908k(C41341q.m119907j());
            }
            int j = eVar.mo102109j();
            int l = eVar.mo102110l();
            Integer j2 = C40438v.m117098j(str);
            if (j2 != null) {
                int intValue = j2.intValue();
                boolean z = false;
                if (j <= intValue && intValue <= l) {
                    z = true;
                }
                if (z) {
                    this.f57375d.m69355Cw(Integer.parseInt(str));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53577a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$f */
    static final class C21472f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsViewModel f57376d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21472f(CommissionsViewModel commissionsViewModel) {
            super(1);
            this.f57376d = commissionsViewModel;
        }

        /* renamed from: a */
        public final void mo53578a(String str) {
            C41536l.m120489i(str, "it");
            CommissionsViewModel commissionsViewModel = this.f57376d;
            BigDecimal g = C40437u.m117095g(str);
            if (g != null) {
                commissionsViewModel.m69353Aw(g);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53578a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$g */
    /* synthetic */ class C21473g extends C41519a implements C43064a {
        C21473g(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo53579b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo53579b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$h */
    /* synthetic */ class C21474h extends C41535k implements C43064a {
        C21474h(Object obj) {
            super(0, obj, CommissionsViewModel.class, "notifyPaymentSuccess", "notifyPaymentSuccess()V", 0);
        }

        /* renamed from: b */
        public final void mo53580b() {
            ((CommissionsViewModel) this.receiver).m69366vw();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo53580b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$i */
    /* synthetic */ class C21475i extends C41519a implements C43075l {
        C21475i(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo53581b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53581b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$j */
    /* synthetic */ class C21476j extends C41519a implements C43064a {
        C21476j(Object obj) {
            super(0, obj, C21484c.class, "setLoading", "setLoading(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo53582b() {
            C21484c.m69417i((C1644x) this.f97690d, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo53582b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$k */
    static final class C21477k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CommissionsViewModel f57377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21477k(CommissionsViewModel commissionsViewModel) {
            super(1);
            this.f57377d = commissionsViewModel;
        }

        /* renamed from: a */
        public final void mo53583a(List list) {
            C41536l.m120489i(list, "it");
            List b = this.f57377d.f57352i.mo67922b(list);
            this.f57377d.m69354Bw(b);
            C21484c.m69418j(this.f57377d.f57369z, b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53583a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.commissions.viewmodel.CommissionsViewModel$l */
    /* synthetic */ class C21478l extends C41519a implements C43075l {
        C21478l(Object obj) {
            super(1, obj, C21484c.class, "setError", "setError(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Throwable;Ljava/lang/Object;)V", 1);
        }

        /* renamed from: b */
        public final void mo53584b(Throwable th) {
            C21484c.m69415g((C1644x) this.f97690d, th, (Object) null, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53584b((Throwable) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommissionsViewModel(PreferencesApiManager preferencesApiManager, C25771c cVar, C25776f fVar, C25774d dVar, C25777g gVar, C28293a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        C41536l.m120489i(cVar, "getCommissionAccounts");
        C41536l.m120489i(fVar, "payCommissions");
        C41536l.m120489i(dVar, "getCommissions");
        C41536l.m120489i(gVar, "refreshCommissionDataUseCase");
        C41536l.m120489i(aVar, "commissionsUiMapper");
        this.f57347d = preferencesApiManager;
        this.f57348e = cVar;
        this.f57349f = fVar;
        this.f57350g = dVar;
        this.f57351h = gVar;
        this.f57352i = aVar;
        C1644x xVar = new C1644x();
        this.f57357n = xVar;
        this.f57358o = xVar;
        C1644x xVar2 = new C1644x();
        this.f57359p = xVar2;
        this.f57360q = xVar2;
        C1644x xVar3 = new C1644x();
        this.f57361r = xVar3;
        this.f57362s = xVar3;
        C1644x xVar4 = new C1644x();
        this.f57363t = xVar4;
        this.f57364u = xVar4;
        C1644x xVar5 = new C1644x();
        this.f57365v = xVar5;
        this.f57366w = xVar5;
        C1644x xVar6 = new C1644x();
        this.f57367x = xVar6;
        this.f57368y = xVar6;
        C1644x xVar7 = new C1644x();
        this.f57369z = xVar7;
        this.f57346A = xVar7;
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public final void m69353Aw(BigDecimal bigDecimal) {
        C21467a aVar;
        this.f57354k = bigDecimal;
        this.f57357n.mo4826r(new C37223a(bigDecimal));
        List list = this.f57356m;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        for (Object next : list) {
            C41536l.m120488h(bigDecimal2, "sum");
            bigDecimal2 = bigDecimal2.add(((UpcomingCommissionUIModel) next).mo53543a());
            C41536l.m120488h(bigDecimal2, "this.add(other)");
        }
        C41536l.m120488h(bigDecimal2, "sum");
        C1644x xVar = this.f57367x;
        int a = C43193c.m123891a(bigDecimal.compareTo(bigDecimal2));
        if (a == -1) {
            aVar = C21467a.INCOMPLETE;
        } else if (a != 1) {
            aVar = C21467a.FULL;
        } else {
            aVar = C21467a.EXCESS;
        }
        xVar.mo4826r(new C37223a(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public final void m69354Bw(List list) {
        this.f57356m = new ArrayList(list);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (Object next : list) {
            C41536l.m120488h(bigDecimal, "sum");
            bigDecimal = bigDecimal.add(((UpcomingCommissionUIModel) next).mo53543a());
            C41536l.m120488h(bigDecimal, "this.add(other)");
        }
        C41536l.m120488h(bigDecimal, "sum");
        this.f57354k = bigDecimal;
        this.f57357n.mo4826r(new C37223a(bigDecimal));
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public final void m69355Cw(int i) {
        String str;
        List list;
        AccountLov accountLov;
        this.f57355l = i;
        this.f57363t.mo4826r(new C37223a(Integer.valueOf(i)));
        C1644x xVar = this.f57361r;
        C21503d dVar = (C21503d) this.f57360q.mo4814f();
        if (dVar == null || (list = (List) dVar.mo53701a()) == null || (accountLov = (AccountLov) C41358y.m120010Z(list, i)) == null) {
            str = null;
        } else {
            str = accountLov.getAcctNo();
        }
        if (str != null) {
            xVar.mo4826r(new C37223a(str));
        }
    }

    /* renamed from: sw */
    private final String m69364sw() {
        return this.f57347d.getLanguage().mo90433b();
    }

    /* renamed from: uw */
    private final void m69365uw(Intent intent) {
        if (intent != null) {
            C32343x.m95461k0(intent, "CommissionsActivity.WIZARD_FIELD_ACCOUNT", new C21471e(this));
        }
        if (intent != null) {
            C32343x.m95461k0(intent, "CommissionsActivity.WIZARD_FIELD_AMOUNT", new C21472f(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public final void m69366vw() {
        this.f57351h.mo64370a();
        C21484c.m69418j(this.f57365v, new Object());
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public final void m69367zw(List list) {
        String str;
        this.f57353j = list;
        C21484c.m69418j(this.f57359p, list);
        C1644x xVar = this.f57361r;
        AccountLov accountLov = (AccountLov) C41358y.m120009Y(list);
        if (accountLov != null) {
            str = accountLov.getAcctNo();
        } else {
            str = null;
        }
        if (str != null) {
            xVar.mo4826r(new C37223a(str));
        }
    }

    /* renamed from: lw */
    public final LiveData mo53562lw() {
        return this.f57360q;
    }

    /* renamed from: mw */
    public final LiveData mo53563mw() {
        return this.f57358o;
    }

    /* renamed from: nw */
    public final void mo53564nw(String str) {
        C41536l.m120489i(str, "ccy");
        addDisposables(C32343x.m95484s(this.f57348e.mo64364d(m69364sw(), str), new C21468b(this.f57359p), new C21469c(this), new C21470d(this)));
    }

    /* renamed from: ow */
    public final LiveData mo53565ow() {
        return this.f57346A;
    }

    /* renamed from: pw */
    public final LiveData mo53566pw() {
        return this.f57366w;
    }

    /* renamed from: qi */
    public final LiveData mo53567qi() {
        return this.f57362s;
    }

    /* renamed from: qw */
    public final LiveData mo53568qw() {
        return this.f57368y;
    }

    /* renamed from: rw */
    public final LiveData mo53569rw() {
        return this.f57364u;
    }

    /* renamed from: tw */
    public final ArrayList mo53570tw(String str) {
        C41536l.m120489i(str, "ccy");
        WizardObject[] wizardObjectArr = new WizardObject[2];
        WizardObject wizardObject = new WizardObject();
        int i = 0;
        wizardObject.setInputTitle(C32343x.m95452h0(C10328q.common_text_amount, new Object[0]));
        wizardObject.setId("CommissionsActivity.WIZARD_FIELD_AMOUNT");
        wizardObject.setInputStyle(1);
        wizardObject.setInputType(BogInputLayout.INPUT_TYPE_NUM_REAL);
        BigDecimal bigDecimal = this.f57354k;
        C41536l.m120488h(bigDecimal, "amount");
        wizardObject.setValue(C32343x.m95412R(bigDecimal, "%.2f"));
        wizardObject.setNonSelectableString(str);
        wizardObject.setMinAmount(BigDecimal.ZERO);
        wizardObject.setMaxAmount(this.f57354k);
        C41238w wVar = C41238w.f97225a;
        wizardObjectArr[0] = wizardObject;
        WizardObject wizardObject2 = new WizardObject();
        wizardObject2.setId("CommissionsActivity.WIZARD_FIELD_ACCOUNT");
        wizardObject2.setInputStyle(4);
        wizardObject2.setInputTitle(C32343x.m95452h0(C10328q.account_number, new Object[0]));
        if (!(!this.f57353j.isEmpty())) {
            i = -1;
        }
        wizardObject2.setValue(String.valueOf(i));
        wizardObjectArr[1] = wizardObject2;
        return C41341q.m119903f(wizardObjectArr);
    }

    /* renamed from: ww */
    public final void mo53571ww(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 10001) {
            m69365uw(intent);
        }
    }

    /* renamed from: xw */
    public final void mo53572xw() {
        C25776f fVar = this.f57349f;
        BigDecimal bigDecimal = this.f57354k;
        C41536l.m120488h(bigDecimal, "amount");
        AccountLov accountLov = (AccountLov) C41358y.m120010Z(this.f57353j, this.f57355l);
        if (accountLov != null) {
            bindToLifecycle(C32343x.m95478q(fVar.mo64369a(new C28533a(bigDecimal, accountLov.getMainAcctKey())), new C21473g(this.f57365v), new C21474h(this), new C21475i(this.f57365v)));
        }
    }

    /* renamed from: yw */
    public final void mo53573yw(String str) {
        C41536l.m120489i(str, "ccy");
        addDisposable(C32343x.m95484s(this.f57350g.mo64367a(str), new C21476j(this.f57369z), new C21477k(this), new C21478l(this.f57369z)));
    }
}
