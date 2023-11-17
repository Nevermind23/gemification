package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel;

import af1.C40303i;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import at0.C31064a;
import b41.C31128a;
import b41.C31132b;
import c41.C31270e;
import cf1.C40407d;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import g91.C32359z0;
import hd0.C24978b;
import hd1.C41204a;
import he1.C41238w;
import j51.C36735g;
import j70.C25351j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import ld0.C25950a;
import m41.C37223a;
import m51.C37228a;
import mt0.C37258b;
import mt0.C37259c;
import mt0.C37260d;
import mt0.C37262f;
import mt0.C37263g;
import mt0.C37264h;
import o31.C37591c;
import ot0.C37731a0;
import ot0.C37733b0;
import ot0.C37797w;
import ot0.C37799x;
import ot0.C37801y;
import ot0.C37803z;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.moneybox.MoneyBoxTariffUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResult;
import rs0.C38335b;
import ue1.C43075l;
import xs0.C39852e0;
import xs0.C39858g0;
import xs0.C39863i0;
import xs0.C39877p;
import ys0.C40059c;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel */
public final class CreatePiggyBankViewModel$ViewModel extends C21481a implements C37797w, C37799x {

    /* renamed from: D */
    static final /* synthetic */ C40303i[] f81120D;

    /* renamed from: A */
    private final C41555e f81121A;

    /* renamed from: B */
    private final C40767b f81122B;

    /* renamed from: C */
    private final C40767b f81123C;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39852e0 f81124d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C39877p f81125e;

    /* renamed from: f */
    private final C39858g0 f81126f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C36735g f81127g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C39863i0 f81128h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C25351j f81129i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C37264h f81130j;

    /* renamed from: k */
    private final C37797w f81131k = this;

    /* renamed from: l */
    private final C37799x f81132l = this;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public PiggyBankResourcesUiModel f81133m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C1644x f81134n = new C1644x();

    /* renamed from: o */
    private final C1644x f81135o;

    /* renamed from: p */
    private final C1644x f81136p;

    /* renamed from: q */
    private final C1644x f81137q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C1644x f81138r;

    /* renamed from: s */
    private final C1644x f81139s;

    /* renamed from: t */
    private final C1644x f81140t;

    /* renamed from: u */
    private final LiveData f81141u;

    /* renamed from: v */
    private final C1644x f81142v;

    /* renamed from: w */
    private final LiveData f81143w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1644x f81144x;

    /* renamed from: y */
    private final C41555e f81145y;

    /* renamed from: z */
    private final C41555e f81146z;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$a */
    static final class C33119a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81147d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$a$a */
        /* synthetic */ class C33120a extends C41535k implements C43075l {
            C33120a(Object obj) {
                super(1, obj, C37264h.class, "transform", "transform(Lge/bog/mobilebank/loyaltyandbonusprograms/domain/model/PiggyBankResources;)Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/PiggyBankResourcesUiModel;", 0);
            }

            /* renamed from: b */
            public final PiggyBankResourcesUiModel invoke(C40059c cVar) {
                C41536l.m120489i(cVar, "p0");
                return ((C37264h) this.receiver).mo90380b(cVar);
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$a$b */
        static final class C33121b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81148d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33121b(CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel) {
                super(1);
                this.f81148d = createPiggyBankViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo75243a(PiggyBankResourcesUiModel piggyBankResourcesUiModel) {
                CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel = this.f81148d;
                C41536l.m120488h(piggyBankResourcesUiModel, "it");
                createPiggyBankViewModel$ViewModel.f81133m = piggyBankResourcesUiModel;
                PiggyBankResourcesUiModel rw = this.f81148d.f81133m;
                PiggyBankResourcesUiModel piggyBankResourcesUiModel2 = null;
                if (rw == null) {
                    C41536l.m120506z("resources");
                    rw = null;
                }
                if (rw.mo75182a().size() == 1) {
                    CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel2 = this.f81148d;
                    C37262f nw = createPiggyBankViewModel$ViewModel2.m97623Ew();
                    PiggyBankResourcesUiModel rw2 = this.f81148d.f81133m;
                    if (rw2 == null) {
                        C41536l.m120506z("resources");
                    } else {
                        piggyBankResourcesUiModel2 = rw2;
                    }
                    createPiggyBankViewModel$ViewModel2.m97631Mw(C37262f.m110020b(nw, (MoneyBoxTariffUiModel) null, 0, piggyBankResourcesUiModel2.mo75182a(), 3, (Object) null));
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo75243a((PiggyBankResourcesUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33119a(CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel) {
            super(1);
            this.f81147d = createPiggyBankViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final PiggyBankResourcesUiModel m97673d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (PiggyBankResourcesUiModel) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m97674e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40762x m = this.f81147d.f81124d.mo93561c().mo95062A(new C33150a(new C33120a(this.f81147d.f81130j))).mo95084m(new C33151b(new C33121b(this.f81147d)));
            C41536l.m120488h(m, "@HiltViewModel\n    class…deBase64)\n        }\n    }");
            return C31270e.m92880i(m, num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$b */
    static final class C33122b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33122b(CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel) {
            super(1);
            this.f81149d = createPiggyBankViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(C37262f fVar) {
            C41536l.m120489i(fVar, "it");
            return this.f81149d.m97627Iw(this.f81149d.f81127g.mo89562a(), fVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$c */
    public /* synthetic */ class C33123c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81150a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                mt0.b[] r0 = mt0.C37258b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                mt0.b r1 = mt0.C37258b.INFO_CARDS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                mt0.b r1 = mt0.C37258b.OPEN_PIGGY_BANK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                mt0.b r1 = mt0.C37258b.PRE_CONTRACT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f81150a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel.C33123c.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$d */
    static final class C33124d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81151d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33124d(CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel) {
            super(1);
            this.f81151d = createPiggyBankViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f81151d.m97630Lw(C37258b.m110011c(C37258b.FINISH_ACTIVITY, false, 1, (Object) null));
            }
            C41536l.m120488h(aVar, "it");
            return aVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$e */
    static final class C33125e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81152d;

        /* renamed from: e */
        final /* synthetic */ long f81153e;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$e$a */
        static final class C33126a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C33126a f81154d = new C33126a();

            C33126a() {
                super(1);
            }

            /* renamed from: a */
            public final CharSequence invoke(CasAccountUiModel casAccountUiModel) {
                C41536l.m120489i(casAccountUiModel, "it");
                return String.valueOf(casAccountUiModel.mo75002a());
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$e$b */
        static final class C33127b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C33127b f81155d = new C33127b();

            C33127b() {
                super(1);
            }

            /* renamed from: a */
            public final String invoke(C25950a aVar) {
                C41536l.m120489i(aVar, "it");
                return aVar.mo64864a();
            }
        }

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$e$c */
        static final class C33128c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81156d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33128c(CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel) {
                super(1);
                this.f81156d = createPiggyBankViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo75249a(String str) {
                this.f81156d.m97630Lw(C37258b.m110011c(C37258b.PRE_CONTRACT, false, 1, (Object) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo75249a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33125e(CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel, long j) {
            super(1);
            this.f81152d = createPiggyBankViewModel$ViewModel;
            this.f81153e = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final String m97682d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (String) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m97683e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C37262f fVar) {
            Double d;
            C41536l.m120489i(fVar, "it");
            C39877p kw = this.f81152d.f81125e;
            long j = this.f81153e;
            String e = C24978b.YES.mo63391e();
            C41536l.m120488h(e, "YES.value");
            String g0 = C41358y.m120017g0(this.f81152d.m97623Ew().mo90367c(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C33126a.f81154d, 30, (Object) null);
            MoneyBoxTariffUiModel d2 = this.f81152d.m97623Ew().mo90368d();
            if (d2 != null) {
                d = Double.valueOf(d2.mo75113e());
            } else {
                d = null;
            }
            C40749p O = C39877p.m115655b(kw, j, e, g0, d + " GEL", (String) null, (String) null, 48, (Object) null).mo95062A(new C33152c(C33127b.f81155d)).mo95084m(new C33153d(new C33128c(this.f81152d))).mo95075O();
            C41536l.m120488h(O, "private fun observePreCo…ndToLifecycle()\n        }");
            return C31270e.m92879h(C32343x.m95413R0(C32343x.m95453h1(O)), -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$f */
    static final class C33129f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81157d;

        /* renamed from: e */
        final /* synthetic */ C37262f f81158e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33129f(CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel, C37262f fVar) {
            super(1);
            this.f81157d = createPiggyBankViewModel$ViewModel;
            this.f81158e = fVar;
        }

        /* renamed from: a */
        public final PiggyBankResult invoke(C31064a aVar) {
            C41536l.m120489i(aVar, "result");
            this.f81157d.f81128h.mo93569a();
            this.f81157d.f81129i.invoke();
            return new PiggyBankResult(this.f81158e.mo90368d(), this.f81158e.mo90367c(), aVar.mo71260a());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$g */
    static final class C33130g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81159d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$g$a */
        static final class C33131a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81160d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33131a(CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel) {
                super(1);
                this.f81160d = createPiggyBankViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo75252a(String str) {
                C41536l.m120489i(str, "it");
                this.f81160d.f81144x.mo4823o(C32343x.m95466m(str));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo75252a((String) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33130g(CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel) {
            super(1);
            this.f81159d = createPiggyBankViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C41536l.m120488h(aVar, "requestedResult");
            C31132b.m92648j(aVar, (int[]) null, new C33131a(this.f81159d), 1, (Object) null);
            return aVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$h */
    public static final class C33132h extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81161a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33132h(Object obj, CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel) {
            super(obj);
            this.f81161a = createPiggyBankViewModel$ViewModel;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C37260d dVar = (C37260d) obj;
            this.f81161a.f81134n.mo4823o(C32343x.m95466m((C37260d) obj2));
            this.f81161a.m97654zw();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel$i */
    public static final class C33133i extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CreatePiggyBankViewModel$ViewModel f81162a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33133i(Object obj, CreatePiggyBankViewModel$ViewModel createPiggyBankViewModel$ViewModel) {
            super(obj);
            this.f81162a = createPiggyBankViewModel$ViewModel;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C37262f fVar = (C37262f) obj;
            this.f81162a.f81138r.mo4823o((C37262f) obj2);
            this.f81162a.m97654zw();
        }
    }

    static {
        Class<CreatePiggyBankViewModel$ViewModel> cls = CreatePiggyBankViewModel$ViewModel.class;
        f81120D = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "destination", "getDestination()Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/PiggyBankDestination;", 0)), C41520a0.m120439e(new C41539o(cls, "piggyBankInput", "getPiggyBankInput()Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/PiggyBankInput;", 0)), C41520a0.m120439e(new C41539o(cls, "actionButtonState", "getActionButtonState()Lge/bog/mobilebank/loyaltyandbonusprograms/presentation/model/piggybank/PiggyBankActionButtonState;", 0))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreatePiggyBankViewModel$ViewModel(C39852e0 e0Var, C39877p pVar, C39858g0 g0Var, C36735g gVar, C39863i0 i0Var, C25351j jVar, C37264h hVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C39858g0 g0Var2 = g0Var;
        C36735g gVar2 = gVar;
        C39863i0 i0Var2 = i0Var;
        C25351j jVar2 = jVar;
        C37264h hVar2 = hVar;
        C41536l.m120489i(e0Var, "getPiggyBankResources");
        C41536l.m120489i(pVar, "getCasPreContract");
        C41536l.m120489i(g0Var2, "openMoneyBox");
        C41536l.m120489i(gVar2, "getLoginInfo");
        C41536l.m120489i(i0Var2, "refreshCasServiceInfo");
        C41536l.m120489i(jVar2, "reloadProducts");
        C41536l.m120489i(hVar2, "piggyBankMapper");
        this.f81124d = e0Var;
        this.f81125e = pVar;
        this.f81126f = g0Var2;
        this.f81127g = gVar2;
        this.f81128h = i0Var2;
        this.f81129i = jVar2;
        this.f81130j = hVar2;
        C1644x xVar = new C1644x();
        this.f81135o = xVar;
        C1644x xVar2 = new C1644x();
        this.f81136p = xVar2;
        C1644x xVar3 = new C1644x();
        this.f81137q = xVar3;
        this.f81138r = new C1644x();
        this.f81139s = new C1644x();
        C1644x xVar4 = new C1644x();
        this.f81140t = xVar4;
        this.f81141u = C1607m0.m5655c(xVar4, new C33124d(this));
        C1644x xVar5 = new C1644x();
        this.f81142v = xVar5;
        this.f81143w = C1607m0.m5655c(xVar5, new C33130g(this));
        this.f81144x = new C1644x();
        C41551a aVar = C41551a.f97718a;
        C37258b bVar = C37258b.INFO_CARDS;
        this.f81145y = new C33132h(C37258b.m110011c(bVar, false, 1, (Object) null), this);
        this.f81146z = new C33133i(new C37262f((MoneyBoxTariffUiModel) null, 0, (List) null, 7, (DefaultConstructorMarker) null), this);
        this.f81121A = C37591c.m110557b(C37591c.f90334a, new C37259c("", false), xVar, (C43075l) null, 4, (Object) null);
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<PiggyBankInput>()");
        this.f81122B = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<PiggyBankInput>()");
        this.f81123C = h12;
        m97630Lw(bVar.mo90349b(false));
        xVar2.mo4823o(m97624Fw());
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C37801y(new C33119a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(rc)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar3));
        C40749p L02 = h1.mo94989L0(new C37803z(new C33122b(this)));
        C41536l.m120488h(L02, "openPiggyBankSubject.swi…inInfo, it)\n            }");
        bindToLifecycle(C31270e.m92876e(L02, xVar4));
        m97625Gw();
    }

    /* renamed from: Aw */
    private final C37260d m97621Aw() {
        return (C37260d) this.f81145y.getValue(this, f81120D[0]);
    }

    /* renamed from: Bw */
    private final String m97622Bw() {
        String str;
        C37223a aVar = (C37223a) this.f81144x.mo4814f();
        if (aVar != null) {
            str = (String) aVar.mo90299d();
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        if (bytes != null) {
            return C32359z0.m95597y(bytes);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public final C37262f m97623Ew() {
        return (C37262f) this.f81146z.getValue(this, f81120D[1]);
    }

    /* renamed from: Fw */
    private final List m97624Fw() {
        String F = C32343x.m95388F("cas.service.open.message1", new Object[0]);
        int i = C38335b.icons_48_deposit_piggy_bank_fill;
        return C41341q.m119910m(new C37263g(F, i), new C37263g(C32343x.m95388F("cas.service.open.message2", new Object[0]), C38335b.icons_24_general_play_outline), new C37263g(C32343x.m95388F("cas.service.open.message3", new Object[0]), i));
    }

    /* renamed from: Gw */
    private final void m97625Gw() {
        C37228a a = this.f81127g.mo89562a();
        if (a != null) {
            C40749p L0 = this.f81123C.mo94989L0(new C37731a0(new C33125e(this, a.mo90305b())));
            C41536l.m120488h(L0, "private fun observePreCo…ndToLifecycle()\n        }");
            bindToLifecycle(C31270e.m92876e(L0, this.f81142v));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Hw */
    public static final C40754t m97626Hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Iw */
    public final C40749p m97627Iw(C37228a aVar, C37262f fVar) {
        Long l;
        C39858g0 g0Var = this.f81126f;
        if (aVar != null) {
            l = Long.valueOf(aVar.mo90306c());
        } else {
            l = null;
        }
        Long l2 = l;
        MoneyBoxTariffUiModel d = fVar.mo90368d();
        C41536l.m120486f(d);
        String valueOf = String.valueOf(d.mo75113e());
        String a = fVar.mo90368d().mo75109a();
        if (a == null) {
            a = "GEL";
        }
        String str = a;
        List<CasAccountUiModel> c = fVar.mo90367c();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(c, 10));
        for (CasAccountUiModel a2 : c) {
            arrayList.add(Long.valueOf(a2.mo75002a()));
        }
        C40749p k0 = g0Var.mo93564c(l2, valueOf, str, C41358y.m120017g0(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C43075l) null, 62, (Object) null), m97622Bw()).mo95075O().mo95026k0(new C37733b0(new C33129f(this, fVar)));
        C41536l.m120488h(k0, "private fun openPiggyBan…servable(NO_REQUEST_CODE)");
        return C31270e.m92879h(k0, -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public static final PiggyBankResult m97628Jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (PiggyBankResult) lVar.invoke(obj);
    }

    /* renamed from: Kw */
    private final void m97629Kw(C37259c cVar) {
        this.f81121A.setValue(this, f81120D[2], cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public final void m97630Lw(C37260d dVar) {
        this.f81145y.setValue(this, f81120D[0], dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public final void m97631Mw(C37262f fVar) {
        this.f81146z.setValue(this, f81120D[1], fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final C40754t m97636hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final C40754t m97637iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public final void m97654zw() {
        String str;
        C37258b a = m97621Aw().mo90355a();
        C37258b bVar = C37258b.INFO_CARDS;
        if (a == bVar) {
            str = "cas.service.open.button.next";
        } else {
            str = "cas.service.open.button.register";
        }
        boolean z = false;
        String F = C32343x.m95388F(str, new Object[0]);
        if (m97621Aw().mo90355a() == bVar || m97623Ew().mo90371f()) {
            z = true;
        }
        m97629Kw(new C37259c(F, z));
    }

    /* renamed from: Cw */
    public final C37797w mo75225Cw() {
        return this.f81131k;
    }

    /* renamed from: Dw */
    public final C37799x mo75226Dw() {
        return this.f81132l;
    }

    /* renamed from: Gg */
    public void mo75227Gg() {
        C37260d dVar;
        int i = C33123c.f81150a[m97621Aw().mo90355a().ordinal()];
        if (i == 2) {
            dVar = C37258b.m110011c(C37258b.INFO_CARDS, false, 1, (Object) null);
        } else if (i != 3) {
            dVar = C37258b.m110011c(C37258b.FINISH_ACTIVITY, false, 1, (Object) null);
        } else {
            dVar = C37258b.OPEN_PIGGY_BANK.mo90349b(false);
        }
        m97630Lw(dVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: ge.bog.mobilebank.shared.helper.ImageSource$Url} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75228H0() {
        /*
            r13 = this;
            androidx.lifecycle.x r0 = r13.f81139s
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankResourcesUiModel r1 = r13.f81133m
            if (r1 != 0) goto L_0x000c
            java.lang.String r1 = "resources"
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r1 = 0
        L_0x000c:
            java.util.List r1 = r1.mo75182a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = ie1.C41343r.m119925u(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0093
            java.lang.Object r3 = r1.next()
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r3 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel) r3
            java.lang.String r5 = r3.mo75011j()
            if (r5 == 0) goto L_0x003c
            ge.bog.mobilebank.shared.helper.ImageSource$Url r10 = new ge.bog.mobilebank.shared.helper.ImageSource$Url
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0053
        L_0x003c:
            java.lang.Integer r4 = r3.mo75006e()
            if (r4 == 0) goto L_0x004c
            int r4 = r4.intValue()
            ge.bog.mobilebank.shared.helper.ImageSource$Resource r10 = new ge.bog.mobilebank.shared.helper.ImageSource$Resource
            r10.<init>(r4)
            goto L_0x0053
        L_0x004c:
            ge.bog.mobilebank.shared.helper.ImageSource$Resource r10 = new ge.bog.mobilebank.shared.helper.ImageSource$Resource
            int r4 = rs0.C38335b.f91849a
            r10.<init>(r4)
        L_0x0053:
            mt0.f r4 = r13.m97623Ew()
            java.util.List r4 = r4.mo90367c()
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 0
            if (r5 == 0) goto L_0x0067
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0067
            goto L_0x008a
        L_0x0067:
            java.util.Iterator r4 = r4.iterator()
        L_0x006b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008a
            java.lang.Object r5 = r4.next()
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel r5 = (p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.cas.CasAccountUiModel) r5
            long r7 = r5.mo75002a()
            long r11 = r3.mo75002a()
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            r7 = 1
            if (r5 != 0) goto L_0x0086
            r5 = r7
            goto L_0x0087
        L_0x0086:
            r5 = r6
        L_0x0087:
            if (r5 == 0) goto L_0x006b
            r6 = r7
        L_0x008a:
            ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel r4 = new ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.PiggyBankAccountUiModel
            r4.<init>(r3, r10, r6)
            r2.add(r4)
            goto L_0x001f
        L_0x0093:
            m41.a r1 = g91.C32343x.m95466m(r2)
            r0.mo4823o(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.CreatePiggyBankViewModel$ViewModel.mo75228H0():void");
    }

    /* renamed from: Mg */
    public LiveData mo75229Mg() {
        return this.f81138r;
    }

    /* renamed from: Pk */
    public LiveData mo75230Pk() {
        return this.f81141u;
    }

    /* renamed from: S7 */
    public void mo75231S7() {
        int i = C33123c.f81150a[m97621Aw().mo90355a().ordinal()];
        if (i == 1) {
            m97630Lw(C37258b.m110011c(C37258b.OPEN_PIGGY_BANK, false, 1, (Object) null));
        } else if (i == 2) {
            this.f81123C.onNext(m97623Ew());
        } else if (i == 3) {
            this.f81122B.onNext(m97623Ew());
        }
    }

    /* renamed from: Ui */
    public LiveData mo75232Ui() {
        return this.f81135o;
    }

    /* renamed from: V */
    public void mo75233V(int i) {
        PiggyBankResourcesUiModel piggyBankResourcesUiModel = this.f81133m;
        if (piggyBankResourcesUiModel == null) {
            C41536l.m120506z("resources");
            piggyBankResourcesUiModel = null;
        }
        m97631Mw(C37262f.m110020b(m97623Ew(), (MoneyBoxTariffUiModel) C41358y.m120010Z(piggyBankResourcesUiModel.mo75183b(), i), i, (List) null, 4, (Object) null));
    }

    /* renamed from: dp */
    public LiveData mo75234dp() {
        return this.f81134n;
    }

    /* renamed from: iv */
    public void mo75235iv(List list) {
        C41536l.m120489i(list, "selectedAccounts");
        C37262f Ew = m97623Ew();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PiggyBankAccountUiModel) it.next()).mo75157a());
        }
        m97631Mw(C37262f.m110020b(Ew, (MoneyBoxTariffUiModel) null, 0, arrayList, 3, (Object) null));
    }

    /* renamed from: pi */
    public LiveData mo75236pi() {
        return this.f81139s;
    }

    /* renamed from: pv */
    public LiveData mo75237pv() {
        return this.f81143w;
    }

    /* renamed from: v6 */
    public LiveData mo75238v6() {
        return this.f81144x;
    }

    /* renamed from: vs */
    public LiveData mo75239vs() {
        return this.f81137q;
    }

    /* renamed from: yp */
    public LiveData mo75240yp() {
        return this.f81136p;
    }
}
