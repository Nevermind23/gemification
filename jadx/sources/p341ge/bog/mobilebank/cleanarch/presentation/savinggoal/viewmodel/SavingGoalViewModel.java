package p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import de1.C40640a;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import jg1.C41438c;
import jg1.C41452l;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.model.SavingGoalDepositModel;
import p341ge.bog.mobilebank.eventbus.events.DepositBondsEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.deposits.SavingGoal;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10328q;
import p748eu.C20292b;
import p758fu.C20557a;
import p915uw.C28946a;
import p915uw.C28947b;
import p915uw.C28948c;
import p915uw.C28949d;
import p926vw.C29181a;
import r90.C27950a;
import u50.C28587a;
import u50.C28588b;
import u50.C28589c;
import u50.C28590d;
import u50.C28591e;
import u50.C28592f;
import u50.C28593g;
import u50.C28594h;
import u50.C28595i;
import u50.C28596j;
import u50.C28597k;
import u50.C28598l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel */
public final class SavingGoalViewModel extends C21481a {

    /* renamed from: H */
    public static final C22394a f59293H = new C22394a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private String f59294A;

    /* renamed from: B */
    private C43064a f59295B;

    /* renamed from: C */
    private SavingGoalDepositModel f59296C;

    /* renamed from: D */
    private String f59297D;

    /* renamed from: E */
    private String f59298E;

    /* renamed from: F */
    private String f59299F;

    /* renamed from: G */
    private ArrayList f59300G;

    /* renamed from: d */
    private final C41438c f59301d;

    /* renamed from: e */
    private final Client f59302e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C20292b f59303f;

    /* renamed from: g */
    private final C28946a f59304g;

    /* renamed from: h */
    private final C28948c f59305h;

    /* renamed from: i */
    private final C28947b f59306i;

    /* renamed from: j */
    private final C28949d f59307j;

    /* renamed from: k */
    private final C1644x f59308k = new C1644x();

    /* renamed from: l */
    private final C1644x f59309l = new C1644x();

    /* renamed from: m */
    private final C1644x f59310m = new C1644x();

    /* renamed from: n */
    private final C1644x f59311n;

    /* renamed from: o */
    private final C1644x f59312o;

    /* renamed from: p */
    private final C1644x f59313p;

    /* renamed from: q */
    private final C1644x f59314q;

    /* renamed from: r */
    private final C1644x f59315r;

    /* renamed from: s */
    private final C1644x f59316s;

    /* renamed from: t */
    private final C1644x f59317t;

    /* renamed from: u */
    private final C1644x f59318u;

    /* renamed from: v */
    private final C1644x f59319v;

    /* renamed from: w */
    private DepositBondsEvent f59320w;

    /* renamed from: x */
    private Integer f59321x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f59322y;

    /* renamed from: z */
    private BigDecimal f59323z;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$a */
    public static final class C22394a {
        private C22394a() {
        }

        public /* synthetic */ C22394a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$b */
    static final class C22395b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalViewModel f59324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22395b(SavingGoalViewModel savingGoalViewModel) {
            super(1);
            this.f59324d = savingGoalViewModel;
        }

        /* renamed from: a */
        public final void mo55367a(C41205b bVar) {
            C21484c.m69417i(this.f59324d.mo55342Kw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55367a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$c */
    /* synthetic */ class C22396c extends C41535k implements C43064a {
        C22396c(Object obj) {
            super(0, obj, SavingGoalViewModel.class, "createCompletedSuccessfully", "createCompletedSuccessfully()V", 0);
        }

        /* renamed from: b */
        public final void mo55368b() {
            ((SavingGoalViewModel) this.receiver).m72618vw();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo55368b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$d */
    static final class C22397d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalViewModel f59325d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22397d(SavingGoalViewModel savingGoalViewModel) {
            super(1);
            this.f59325d = savingGoalViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59325d.mo55342Kw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$e */
    static final class C22398e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalViewModel f59326d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22398e(SavingGoalViewModel savingGoalViewModel) {
            super(1);
            this.f59326d = savingGoalViewModel;
        }

        /* renamed from: a */
        public final void mo55370a(C41205b bVar) {
            C21484c.m69417i(this.f59326d.mo55344Pw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55370a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$f */
    /* synthetic */ class C22399f extends C41535k implements C43064a {
        C22399f(Object obj) {
            super(0, obj, SavingGoalViewModel.class, "deleteCompletedSuccessfully", "deleteCompletedSuccessfully()V", 0);
        }

        /* renamed from: b */
        public final void mo55371b() {
            ((SavingGoalViewModel) this.receiver).m72587Aw();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo55371b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$g */
    static final class C22400g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalViewModel f59327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22400g(SavingGoalViewModel savingGoalViewModel) {
            super(1);
            this.f59327d = savingGoalViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59327d.mo55344Pw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$h */
    static final class C22401h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalViewModel f59328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22401h(SavingGoalViewModel savingGoalViewModel) {
            super(1);
            this.f59328d = savingGoalViewModel;
        }

        /* renamed from: a */
        public final void mo55373a(C41205b bVar) {
            C21484c.m69417i(this.f59328d.mo55345Qw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55373a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$i */
    /* synthetic */ class C22402i extends C41535k implements C43064a {
        C22402i(Object obj) {
            super(0, obj, SavingGoalViewModel.class, "editCompletedSuccessfully", "editCompletedSuccessfully()V", 0);
        }

        /* renamed from: b */
        public final void mo55374b() {
            ((SavingGoalViewModel) this.receiver).m72591Fw();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo55374b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$j */
    static final class C22403j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalViewModel f59329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22403j(SavingGoalViewModel savingGoalViewModel) {
            super(1);
            this.f59329d = savingGoalViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59329d.mo55345Qw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$k */
    static final class C22404k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalViewModel f59330d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22404k(SavingGoalViewModel savingGoalViewModel) {
            super(1);
            this.f59330d = savingGoalViewModel;
        }

        /* renamed from: a */
        public final void mo55376a(C41205b bVar) {
            C21484c.m69417i(this.f59330d.mo55347Sw(), (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55376a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$l */
    static final class C22405l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalViewModel f59331d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22405l(SavingGoalViewModel savingGoalViewModel) {
            super(1);
            this.f59331d = savingGoalViewModel;
        }

        /* renamed from: a */
        public final void mo55377a(List list) {
            Long l;
            boolean z;
            Double c;
            SavingGoalDepositModel Yw = this.f59331d.mo55353Yw();
            if (Yw != null) {
                l = Yw.mo55309h();
            } else {
                l = null;
            }
            if (l == null) {
                C20557a b = this.f59331d.f59303f.mo48775b("CDS_DEFAULT_PURPOSE_SAVING_GOAL");
                if (b == null || (c = b.mo49086c()) == null) {
                    l = 0L;
                } else {
                    l = Long.valueOf((long) c.doubleValue());
                }
            }
            SavingGoalViewModel savingGoalViewModel = this.f59331d;
            C41536l.m120488h(list, "it");
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C29181a) it.next()).mo69021c() == l.longValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            savingGoalViewModel.f59322y = i;
            C21484c.m69418j(this.f59331d.mo55347Sw(), list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo55377a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel$m */
    static final class C22406m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ SavingGoalViewModel f59332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22406m(SavingGoalViewModel savingGoalViewModel) {
            super(1);
            this.f59332d = savingGoalViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f59332d.mo55347Sw(), th, (Object) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavingGoalViewModel(C41438c cVar, Client client, C20292b bVar, C28946a aVar, C28948c cVar2, C28947b bVar2, C28949d dVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "eventBus");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(aVar, "createSavingGoalUseCase");
        C41536l.m120489i(cVar2, "editSavingGoalUseCase");
        C41536l.m120489i(bVar2, "deleteSavingGoalUseCase");
        C41536l.m120489i(dVar, "getDepositPurposesUseCase");
        this.f59301d = cVar;
        this.f59302e = client;
        this.f59303f = bVar;
        this.f59304g = aVar;
        this.f59305h = cVar2;
        this.f59306i = bVar2;
        this.f59307j = dVar;
        C1644x xVar = new C1644x();
        this.f59311n = xVar;
        this.f59312o = new C1644x();
        this.f59313p = new C1644x();
        C1644x xVar2 = new C1644x();
        this.f59314q = xVar2;
        C1644x xVar3 = new C1644x();
        this.f59315r = xVar3;
        this.f59316s = new C1644x();
        this.f59317t = new C1644x();
        this.f59318u = new C1644x();
        this.f59319v = new C1644x();
        this.f59322y = -1;
        this.f59297D = "";
        this.f59298E = "";
        this.f59299F = "";
        WizardObject selectorOptionValues = new WizardObject().setInputStyle(0).setSelectorOptionPreviews(C41341q.m119903f("")).setSelectorOptionValues(C41341q.m119903f(""));
        C41536l.m120488h(selectorOptionValues, "WizardObject()\n         …onValues(arrayListOf(\"\"))");
        WizardObject amountObject = new WizardObject().setInputStyle(1).setInputType(BogInputLayout.INPUT_TYPE_NUM_REAL).setAmountObject(true);
        C41536l.m120488h(amountObject, "WizardObject()\n         …   .setAmountObject(true)");
        this.f59300G = C41341q.m119903f(selectorOptionValues, amountObject);
        cVar.mo96185q(this);
        Boolean bool = Boolean.FALSE;
        xVar.mo4826r(bool);
        xVar2.mo4826r(bool);
        xVar3.mo4826r(new C41224m(bool, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public final void m72587Aw() {
        C21484c.m69418j(this.f59319v, C41238w.f97225a);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public static final void m72588Cw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public static final void m72589Dw(SavingGoalViewModel savingGoalViewModel) {
        C41536l.m120489i(savingGoalViewModel, "this$0");
        savingGoalViewModel.m72600dx(new C22399f(savingGoalViewModel));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m72590Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public final void m72591Fw() {
        C21484c.m69418j(this.f59318u, C41238w.f97225a);
    }

    /* renamed from: Gw */
    private final void m72592Gw() {
        SavingGoal i;
        Long l;
        List list;
        C29181a aVar;
        SavingGoalDepositModel savingGoalDepositModel = this.f59296C;
        if (savingGoalDepositModel != null && (i = savingGoalDepositModel.mo55311i()) != null) {
            C28948c cVar = this.f59305h;
            Long valueOf = Long.valueOf(i.getId());
            String f = savingGoalDepositModel.mo55307f();
            BigDecimal bigDecimal = this.f59323z;
            String o = C32319m.m95308o(C32319m.m95305l());
            String str = this.f59294A;
            C21503d dVar = (C21503d) this.f59316s.mo4814f();
            if (dVar == null || (list = (List) dVar.mo53701a()) == null || (aVar = (C29181a) list.get(this.f59322y)) == null) {
                l = null;
            } else {
                l = Long.valueOf(aVar.mo69021c());
            }
            C41205b G = cVar.mo68801a(valueOf, f, bigDecimal, o, str, l, Long.valueOf(savingGoalDepositModel.mo55301a()), savingGoalDepositModel.mo55302b()).mo94904r(new C28592f(new C22401h(this))).mo94888G(new C28593g(this), new C28594h(new C22403j(this)));
            C41536l.m120488h(G, "private fun editSavingGo…       }\n\n        }\n    }");
            addDisposable(G);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final void m72593Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public static final void m72594Iw(SavingGoalViewModel savingGoalViewModel) {
        C41536l.m120489i(savingGoalViewModel, "this$0");
        savingGoalViewModel.m72600dx(new C22402i(savingGoalViewModel));
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final void m72595Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public static final void m72596Mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nw */
    public static final void m72597Nw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final void m72598Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: dx */
    private final void m72600dx(C43064a aVar) {
        this.f59302e.refreshAvailableProductsEvent();
        this.f59295B = aVar;
        this.f59302e.requestDepositBonds(true);
    }

    /* renamed from: ix */
    private final void m72606ix() {
        String str;
        String str2;
        String str3;
        String str4;
        SavingGoalDepositModel savingGoalDepositModel;
        C21503d dVar;
        List list;
        C29181a aVar;
        C1644x xVar = this.f59308k;
        boolean z = false;
        String str5 = null;
        if (this.f59322y == -1 || (dVar = (C21503d) this.f59316s.mo4814f()) == null || (list = (List) dVar.mo53701a()) == null || (aVar = (C29181a) list.get(this.f59322y)) == null) {
            str = null;
        } else {
            str = C27950a.m86287d(aVar.mo69019a(), false, 2, (Object) null);
        }
        xVar.mo4826r(str);
        C1644x xVar2 = this.f59309l;
        BigDecimal bigDecimal = this.f59323z;
        if (bigDecimal != null) {
            C41536l.m120486f(bigDecimal);
            SavingGoalDepositModel savingGoalDepositModel2 = this.f59296C;
            C41536l.m120486f(savingGoalDepositModel2);
            str2 = C32343x.m95408P(bigDecimal, savingGoalDepositModel2.mo55303d());
        } else {
            str2 = null;
        }
        xVar2.mo4826r(str2);
        C1644x xVar3 = this.f59310m;
        String str6 = this.f59294A;
        if (str6 != null) {
            str3 = C32319m.m95314u(C32319m.m95283C(str6).longValue());
        } else {
            str3 = null;
        }
        xVar3.mo4826r(str3);
        C1644x xVar4 = this.f59312o;
        BigDecimal bigDecimal2 = this.f59323z;
        if (!(bigDecimal2 == null || (str4 = this.f59294A) == null || (savingGoalDepositModel = this.f59296C) == null)) {
            BigDecimal subtract = bigDecimal2.subtract(savingGoalDepositModel.mo55312j());
            C41536l.m120488h(subtract, "this.subtract(other)");
            Long C = C32319m.m95283C(str4);
            C41536l.m120488h(C, "getTimestampFromDashedDa…                        )");
            BigDecimal add = new BigDecimal(C32319m.m95317x(C.longValue(), C32319m.m95305l())).add(new BigDecimal(1));
            C41536l.m120488h(add, "this.add(other)");
            BigDecimal max = subtract.divide(add, RoundingMode.HALF_UP).max(new BigDecimal(0));
            C41536l.m120488h(max, "goalAmount.minus(savingG…      .max(BigDecimal(0))");
            str5 = C32343x.m95408P(max, savingGoalDepositModel.mo55303d());
        }
        xVar4.mo4826r(str5);
        C1644x xVar5 = this.f59311n;
        if (!(this.f59308k.mo4814f() == null || this.f59309l.mo4814f() == null || this.f59310m.mo4814f() == null)) {
            z = true;
        }
        xVar5.mo4823o(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public final void m72618vw() {
        C21484c.m69418j(this.f59317t, C41238w.f97225a);
    }

    /* renamed from: ww */
    private final void m72619ww() {
        Long l;
        List list;
        C29181a aVar;
        SavingGoalDepositModel savingGoalDepositModel = this.f59296C;
        if (savingGoalDepositModel != null) {
            C28946a aVar2 = this.f59304g;
            String f = savingGoalDepositModel.mo55307f();
            BigDecimal bigDecimal = this.f59323z;
            BigDecimal j = savingGoalDepositModel.mo55312j();
            String o = C32319m.m95308o(C32319m.m95305l());
            String str = this.f59294A;
            C21503d dVar = (C21503d) this.f59316s.mo4814f();
            if (dVar == null || (list = (List) dVar.mo53701a()) == null || (aVar = (C29181a) list.get(this.f59322y)) == null) {
                l = null;
            } else {
                l = Long.valueOf(aVar.mo69021c());
            }
            C41205b G = aVar2.mo68799a(f, bigDecimal, j, o, str, l, Long.valueOf(savingGoalDepositModel.mo55301a()), savingGoalDepositModel.mo55302b()).mo94904r(new C28587a(new C22395b(this))).mo94888G(new C28590d(this), new C28591e(new C22397d(this)));
            C41536l.m120488h(G, "private fun createSaving…        )\n        }\n    }");
            addDisposable(G);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final void m72620xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final void m72621yw(SavingGoalViewModel savingGoalViewModel) {
        C41536l.m120489i(savingGoalViewModel, "this$0");
        savingGoalViewModel.m72600dx(new C22396c(savingGoalViewModel));
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m72622zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Bw */
    public final void mo55341Bw() {
        SavingGoal i;
        SavingGoalDepositModel savingGoalDepositModel = this.f59296C;
        if (savingGoalDepositModel != null && (i = savingGoalDepositModel.mo55311i()) != null) {
            C41205b G = this.f59306i.mo68800a(i.getId()).mo94904r(new C28595i(new C22398e(this))).mo94888G(new C28596j(this), new C28597k(new C22400g(this)));
            C41536l.m120488h(G, "fun deleteSavingGoal() {…       }\n        }\n\n    }");
            addDisposable(G);
        }
    }

    /* renamed from: Kw */
    public final C1644x mo55342Kw() {
        return this.f59317t;
    }

    /* renamed from: Lw */
    public final void mo55343Lw() {
        this.f59302e.requestDepositBonds(false);
        C28949d dVar = this.f59307j;
        SavingGoalDepositModel savingGoalDepositModel = this.f59296C;
        C41536l.m120486f(savingGoalDepositModel);
        C41205b I = dVar.mo68802a(savingGoalDepositModel.mo55308g()).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C28598l(new C22404k(this))).mo95070I(new C28588b(new C22405l(this)), new C28589c(new C22406m(this)));
        C41536l.m120488h(I, "fun getData() {\n        …       })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: Pw */
    public final C1644x mo55344Pw() {
        return this.f59319v;
    }

    /* renamed from: Qw */
    public final C1644x mo55345Qw() {
        return this.f59318u;
    }

    /* renamed from: Rw */
    public final LiveData mo55346Rw() {
        return this.f59311n;
    }

    /* renamed from: Sw */
    public final C1644x mo55347Sw() {
        return this.f59316s;
    }

    /* renamed from: Tw */
    public final LiveData mo55348Tw() {
        return this.f59309l;
    }

    /* renamed from: Uw */
    public final LiveData mo55349Uw() {
        return this.f59310m;
    }

    /* renamed from: Vw */
    public final LiveData mo55350Vw() {
        return this.f59308k;
    }

    /* renamed from: Ww */
    public final LiveData mo55351Ww() {
        return this.f59312o;
    }

    /* renamed from: Xw */
    public final Integer mo55352Xw() {
        return this.f59321x;
    }

    /* renamed from: Yw */
    public final SavingGoalDepositModel mo55353Yw() {
        return this.f59296C;
    }

    /* renamed from: Zw */
    public final LiveData mo55354Zw() {
        return this.f59313p;
    }

    /* renamed from: ax */
    public final ArrayList mo55355ax() {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        String str2;
        List<C29181a> list;
        List<C29181a> list2;
        ((WizardObject) this.f59300G.get(0)).setValue(String.valueOf(this.f59322y));
        ((WizardObject) this.f59300G.get(0)).setInputTitle(this.f59297D);
        WizardObject wizardObject = (WizardObject) this.f59300G.get(0);
        C21503d dVar = (C21503d) this.f59316s.mo4814f();
        String str3 = null;
        if (dVar == null || (list2 = (List) dVar.mo53701a()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C41343r.m119925u(list2, 10));
            for (C29181a a : list2) {
                arrayList.add(C27950a.m86287d(a.mo69019a(), false, 2, (Object) null));
            }
        }
        wizardObject.setSelectorOptionPreviews(arrayList);
        WizardObject wizardObject2 = (WizardObject) this.f59300G.get(0);
        C21503d dVar2 = (C21503d) this.f59316s.mo4814f();
        if (dVar2 == null || (list = (List) dVar2.mo53701a()) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(C41343r.m119925u(list, 10));
            for (C29181a b : list) {
                arrayList2.add(b.mo69020b());
            }
        }
        wizardObject2.setSelectorOptionValues(arrayList2);
        ((WizardObject) this.f59300G.get(1)).setInputTitle(this.f59298E);
        WizardObject wizardObject3 = (WizardObject) this.f59300G.get(1);
        BigDecimal bigDecimal = this.f59323z;
        if (bigDecimal == null || (str = bigDecimal.toString()) == null) {
            str = "";
        }
        wizardObject3.setValue(str);
        WizardObject wizardObject4 = (WizardObject) this.f59300G.get(1);
        SavingGoalDepositModel savingGoalDepositModel = this.f59296C;
        if (savingGoalDepositModel != null) {
            str2 = savingGoalDepositModel.mo55303d();
        } else {
            str2 = null;
        }
        wizardObject4.setNonSelectableString(C32303f.m95198i(str2, true));
        if (this.f59300G.size() > 2) {
            ((WizardObject) this.f59300G.get(2)).setInputTitle(this.f59299F);
            WizardObject wizardObject5 = (WizardObject) this.f59300G.get(2);
            Long C = C32319m.m95283C(this.f59294A);
            if (C != null) {
                str3 = String.valueOf(C);
            }
            wizardObject5.setValue(str3);
        }
        return this.f59300G;
    }

    /* renamed from: bx */
    public final boolean mo55356bx(int i) {
        if (i != 2) {
            return false;
        }
        SavingGoalDepositModel savingGoalDepositModel = this.f59296C;
        return (savingGoalDepositModel != null ? savingGoalDepositModel.mo55305e() : null) == null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* renamed from: cx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo55357cx(android.content.Intent r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000a
            java.lang.String r1 = "WIZARD_DATA"
            java.util.ArrayList r5 = r5.getStringArrayListExtra(r1)
            goto L_0x000b
        L_0x000a:
            r5 = r0
        L_0x000b:
            if (r5 == 0) goto L_0x006b
            r1 = 0
            java.lang.Object r2 = r5.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0025
            java.lang.String r3 = "get(WIZARD_PURPOSE_INDEX)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.lang.Integer r2 = cf1.C40438v.m117098j(r2)
            if (r2 == 0) goto L_0x0025
            int r1 = r2.intValue()
        L_0x0025:
            r4.f59322y = r1
            r1 = 1
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 2
            if (r1 == 0) goto L_0x0041
            java.lang.String r3 = "get(WIZARD_AMOUNT_INDEX)"
            kotlin.jvm.internal.C41536l.m120488h(r1, r3)
            java.math.BigDecimal r1 = cf1.C40437u.m117095g(r1)
            if (r1 == 0) goto L_0x0041
            java.math.BigDecimal r1 = g91.C32343x.m95427Y0(r1, r2)
            goto L_0x0042
        L_0x0041:
            r1 = r0
        L_0x0042:
            r4.f59323z = r1
            boolean r1 = r4.mo55356bx(r2)
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r5.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0069
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r0 = "get(WIZARD_DATE_INDEX)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            long r0 = java.lang.Long.parseLong(r5)
            java.lang.String r0 = g91.C32319m.m95308o(r0)
        L_0x0069:
            r4.f59294A = r0
        L_0x006b:
            r4.m72606ix()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.savinggoal.viewmodel.SavingGoalViewModel.mo55357cx(android.content.Intent):void");
    }

    /* renamed from: e */
    public final LiveData mo55358e() {
        return this.f59314q;
    }

    /* renamed from: ex */
    public final void mo55359ex() {
        SavingGoal savingGoal;
        SavingGoalDepositModel savingGoalDepositModel = this.f59296C;
        if (savingGoalDepositModel != null) {
            savingGoal = savingGoalDepositModel.mo55311i();
        } else {
            savingGoal = null;
        }
        if (savingGoal != null) {
            m72592Gw();
        } else {
            m72619ww();
        }
    }

    /* renamed from: fx */
    public final void mo55360fx(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f59298E = str;
    }

    /* renamed from: gx */
    public final void mo55361gx(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f59299F = str;
    }

    /* renamed from: hx */
    public final void mo55362hx(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f59297D = str;
    }

    /* renamed from: jx */
    public final void mo55363jx(SavingGoalDepositModel savingGoalDepositModel) {
        Integer num;
        BigDecimal bigDecimal;
        String str;
        if (savingGoalDepositModel != null) {
            this.f59296C = savingGoalDepositModel;
            if (savingGoalDepositModel.mo55311i() != null) {
                num = Integer.valueOf(C10328q.saving_goal_goal_title);
            } else {
                num = Integer.valueOf(C10328q.saving_goal_header_add);
            }
            this.f59321x = num;
            this.f59313p.mo4826r(savingGoalDepositModel);
            SavingGoal i = savingGoalDepositModel.mo55311i();
            if (i != null) {
                bigDecimal = i.getAmount();
            } else {
                bigDecimal = null;
            }
            this.f59323z = bigDecimal;
            SavingGoal i2 = savingGoalDepositModel.mo55311i();
            if (i2 == null || (str = i2.getEndDate()) == null) {
                str = savingGoalDepositModel.mo55305e();
            }
            this.f59294A = str;
            if (mo55356bx(2)) {
                mo55355ax().add(2, new WizardObject().setInputStyle(2).setMinDate(C32319m.m95290J(Calendar.getInstance().getTime(), 1).getTime()));
            }
            m72606ix();
        }
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f59301d.mo96186s(this);
    }

    @C41452l
    public final void onDepositBondsEvent(DepositBondsEvent depositBondsEvent) {
        C41536l.m120489i(depositBondsEvent, "depositsEvent");
        this.f59320w = depositBondsEvent;
        mo55365uw();
    }

    /* renamed from: uw */
    public final void mo55365uw() {
        boolean z;
        DepositBondsEvent depositBondsEvent = this.f59320w;
        String str = null;
        if (depositBondsEvent != null) {
            if (depositBondsEvent == null) {
                C41536l.m120506z("depositsEvent");
                depositBondsEvent = null;
            }
            if (depositBondsEvent.getState() != 10) {
                C21503d dVar = (C21503d) this.f59316s.mo4814f();
                boolean z2 = true;
                if (dVar == null || dVar.mo53703c()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C43064a aVar = this.f59295B;
                    if (aVar != null) {
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        this.f59295B = null;
                        return;
                    }
                    DepositBondsEvent depositBondsEvent2 = this.f59320w;
                    if (depositBondsEvent2 == null) {
                        C41536l.m120506z("depositsEvent");
                        depositBondsEvent2 = null;
                    }
                    if (depositBondsEvent2.getState() != 30) {
                        DepositBondsEvent depositBondsEvent3 = this.f59320w;
                        if (depositBondsEvent3 == null) {
                            C41536l.m120506z("depositsEvent");
                            depositBondsEvent3 = null;
                        }
                        if (depositBondsEvent3.getState() != 40) {
                            C21503d dVar2 = (C21503d) this.f59316s.mo4814f();
                            if (dVar2 == null || !dVar2.mo53702b()) {
                                z2 = false;
                            }
                            if (z2) {
                                this.f59314q.mo4823o(Boolean.FALSE);
                                C1644x xVar = this.f59315r;
                                Boolean bool = Boolean.TRUE;
                                Object f = this.f59316s.mo4814f();
                                C41536l.m120487g(f, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.common.Resource.Error<kotlin.collections.List<ge.bog.mobilebank.cleanarch.domain.savinggoal.model.DepositPurpose>>");
                                if (((C21503d.C21504a) f).mo53705e() != null) {
                                    Object f2 = this.f59316s.mo4814f();
                                    C41536l.m120487g(f2, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.common.Resource.Error<kotlin.collections.List<ge.bog.mobilebank.cleanarch.domain.savinggoal.model.DepositPurpose>>");
                                    str = C27950a.m86287d(((C21503d.C21504a) f2).mo53705e(), false, 2, (Object) null);
                                }
                                xVar.mo4823o(new C41224m(bool, str));
                                return;
                            }
                            C1644x xVar2 = this.f59314q;
                            Boolean bool2 = Boolean.FALSE;
                            xVar2.mo4823o(bool2);
                            this.f59315r.mo4823o(new C41224m(bool2, (Object) null));
                            m72606ix();
                            return;
                        }
                    }
                    this.f59314q.mo4823o(Boolean.FALSE);
                    C1644x xVar3 = this.f59315r;
                    Boolean bool3 = Boolean.TRUE;
                    DepositBondsEvent depositBondsEvent4 = this.f59320w;
                    if (depositBondsEvent4 == null) {
                        C41536l.m120506z("depositsEvent");
                        depositBondsEvent4 = null;
                    }
                    if (depositBondsEvent4.getState() == 40) {
                        DepositBondsEvent depositBondsEvent5 = this.f59320w;
                        if (depositBondsEvent5 == null) {
                            C41536l.m120506z("depositsEvent");
                            depositBondsEvent5 = null;
                        }
                        str = C27950a.m86287d(depositBondsEvent5.getErrorKey(), false, 2, (Object) null);
                    }
                    xVar3.mo4823o(new C41224m(bool3, str));
                    return;
                }
            }
            this.f59314q.mo4823o(Boolean.TRUE);
            this.f59315r.mo4823o(new C41224m(Boolean.FALSE, (Object) null));
            return;
        }
        this.f59314q.mo4823o(Boolean.TRUE);
        this.f59315r.mo4823o(new C41224m(Boolean.FALSE, (Object) null));
    }

    /* renamed from: x0 */
    public final LiveData mo55366x0() {
        return this.f59315r;
    }
}
