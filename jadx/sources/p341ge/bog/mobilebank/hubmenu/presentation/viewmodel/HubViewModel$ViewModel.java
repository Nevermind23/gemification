package p341ge.bog.mobilebank.hubmenu.presentation.viewmodel;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import cl0.C19766a;
import cl0.C19767b;
import cl0.C19768c;
import cl0.C19769d;
import cl0.C19770e;
import cl0.C19771f;
import cl0.C19772g;
import cl0.C19773h;
import cl0.C19774i;
import cl0.C19775j;
import cl0.C19776k;
import cl0.C19777l;
import cl0.C19778m;
import dl0.C20038a;
import dl0.C20039b;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import ee1.C40767b;
import g11.C32041b;
import g31.C32080b;
import g91.C32343x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import hh0.C25022n;
import ih0.C25212e;
import j51.C36738j;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import md0.C26186e;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.model.OptionalActionsData;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p523mm.C16740f;
import p537nm.C17082f;
import p537nm.C17088i;
import p742dy.C20108a;
import p951xz.C29879c;
import pk0.C27551a;
import pk0.C27585b;
import qk0.C27843a;
import tk0.C28446a;
import tk0.C28448c;
import tk0.C28449d;
import tk0.C28450e;
import tk0.C28451f;
import tk0.C28453g;
import tk0.C28454h;
import tk0.C28455i;
import tk0.C28456j;
import tk0.C28459l;
import ue1.C43075l;
import ue1.C43079p;
import wh0.C29418y;

/* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel */
public final class HubViewModel$ViewModel extends C21481a implements C19766a, C19767b {

    /* renamed from: v0 */
    public static final C24446a f63060v0 = new C24446a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private final C1644x f63061A;

    /* renamed from: B */
    private final C1644x f63062B;

    /* renamed from: C */
    private final C1644x f63063C;

    /* renamed from: D */
    private final C1644x f63064D;

    /* renamed from: E */
    private final C1644x f63065E;

    /* renamed from: F */
    private final C1644x f63066F;

    /* renamed from: G */
    private final C1644x f63067G;

    /* renamed from: H */
    private final C1644x f63068H;

    /* renamed from: I */
    private final C1644x f63069I;

    /* renamed from: J */
    private final C1644x f63070J;

    /* renamed from: K */
    private final C1644x f63071K;

    /* renamed from: L */
    private final C1644x f63072L;

    /* renamed from: M */
    private final C1644x f63073M;

    /* renamed from: N */
    private final C1644x f63074N;

    /* renamed from: O */
    private final C1644x f63075O;

    /* renamed from: P */
    private final C1644x f63076P;

    /* renamed from: Q */
    private final C1644x f63077Q;

    /* renamed from: R */
    private final C1644x f63078R;

    /* renamed from: S */
    private final C1644x f63079S;

    /* renamed from: T */
    private final C1644x f63080T;

    /* renamed from: U */
    private final C1644x f63081U;

    /* renamed from: V */
    private final C1644x f63082V;

    /* renamed from: W */
    private final C1644x f63083W;

    /* renamed from: X */
    private final C1644x f63084X;

    /* renamed from: Y */
    private final C1644x f63085Y;

    /* renamed from: Z */
    private final C1644x f63086Z;

    /* renamed from: a0 */
    private final C1644x f63087a0;

    /* renamed from: b0 */
    private final C1644x f63088b0;

    /* renamed from: c0 */
    private final C1644x f63089c0;

    /* renamed from: d */
    private final C29879c f63090d;

    /* renamed from: d0 */
    private final C1644x f63091d0;

    /* renamed from: e */
    private final C28448c f63092e;

    /* renamed from: e0 */
    private final C1644x f63093e0;

    /* renamed from: f */
    private final C32080b f63094f;

    /* renamed from: f0 */
    private final C1644x f63095f0;

    /* renamed from: g */
    private final C28449d f63096g;

    /* renamed from: g0 */
    private final C1644x f63097g0;

    /* renamed from: h */
    private final C28455i f63098h;

    /* renamed from: h0 */
    private final C1644x f63099h0;

    /* renamed from: i */
    private final C28450e f63100i;

    /* renamed from: i0 */
    private final C1644x f63101i0;

    /* renamed from: j */
    private final C28451f f63102j;

    /* renamed from: j0 */
    private final C1644x f63103j0;

    /* renamed from: k */
    private final C28453g f63104k;

    /* renamed from: k0 */
    private final C1644x f63105k0;

    /* renamed from: l */
    private final C28459l f63106l;

    /* renamed from: l0 */
    private final C1644x f63107l0;

    /* renamed from: m */
    private final C27843a f63108m;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public final C1644x f63109m0;

    /* renamed from: n */
    private final C28454h f63110n;

    /* renamed from: n0 */
    private final C1644x f63111n0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C28446a f63112o;

    /* renamed from: o0 */
    private final C1644x f63113o0;

    /* renamed from: p */
    private final C20108a f63114p;

    /* renamed from: p0 */
    private final C1644x f63115p0;

    /* renamed from: q */
    private final C36738j f63116q;

    /* renamed from: q0 */
    private final C1644x f63117q0;

    /* renamed from: r */
    private final Client f63118r;

    /* renamed from: r0 */
    private final C40767b f63119r0;

    /* renamed from: s */
    private final C16740f f63120s;

    /* renamed from: s0 */
    private final C40767b f63121s0;

    /* renamed from: t */
    private final C28456j f63122t;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public boolean f63123t0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C25022n f63124u;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public boolean f63125u0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C29418y f63126v;

    /* renamed from: w */
    private final C19767b f63127w = this;

    /* renamed from: x */
    private final C19766a f63128x = this;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final AtomicBoolean f63129y = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C40765a f63130z;

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$a */
    public static final class C24446a {
        private C24446a() {
        }

        public /* synthetic */ C24446a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$b */
    static final class C24447b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24447b f63131d = new C24447b();

        C24447b() {
            super(1);
        }

        public final Boolean invoke(C17082f fVar) {
            C41536l.m120489i(fVar, "it");
            return Boolean.valueOf(fVar.mo44310a() == C17088i.CAN_ACTIVATE);
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$c */
    static final class C24448c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24448c f63132d = new C24448c();

        C24448c() {
            super(1);
        }

        public final Boolean invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$d */
    static final class C24449d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HubViewModel$ViewModel f63133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24449d(HubViewModel$ViewModel hubViewModel$ViewModel) {
            super(1);
            this.f63133d = hubViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo62261a(C41238w wVar) {
            String str = (String) this.f63133d.f63130z.mo95100j1();
            if (str != null) {
                HubViewModel$ViewModel hubViewModel$ViewModel = this.f63133d;
                hubViewModel$ViewModel.f63129y.set(true);
                if (hubViewModel$ViewModel.f63130z.mo95101k1()) {
                    hubViewModel$ViewModel.f63130z.onNext(str);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62261a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$e */
    static final class C24450e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HubViewModel$ViewModel f63134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24450e(HubViewModel$ViewModel hubViewModel$ViewModel) {
            super(1);
            this.f63134d = hubViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            this.f63134d.getHasKycLiveData().mo4823o(bool);
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$f */
    static final class C24451f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HubViewModel$ViewModel f63135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24451f(HubViewModel$ViewModel hubViewModel$ViewModel) {
            super(1);
            this.f63135d = hubViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo62263a(String str) {
            HubViewModel$ViewModel hubViewModel$ViewModel = this.f63135d;
            C41536l.m120488h(str, "debouncedText");
            hubViewModel$ViewModel.m78566ry(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62263a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$g */
    static final class C24452g extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C24452g f63136d = new C24452g();

        C24452g() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(C41238w wVar, Boolean bool) {
            C41536l.m120489i(wVar, "<anonymous parameter 0>");
            C41536l.m120489i(bool, "hasCard");
            return bool;
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$h */
    static final class C24453h extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C24453h f63137d = new C24453h();

        C24453h() {
            super(1);
        }

        public final OptionalActionsData invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return new OptionalActionsData(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$i */
    static final class C24454i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HubViewModel$ViewModel f63138d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24454i(HubViewModel$ViewModel hubViewModel$ViewModel) {
            super(1);
            this.f63138d = hubViewModel$ViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OptionalActionsData) obj);
            return C41238w.f97225a;
        }

        public final void invoke(OptionalActionsData optionalActionsData) {
            C1644x sw = this.f63138d.f63109m0;
            C28446a ow = this.f63138d.f63112o;
            C41536l.m120488h(optionalActionsData, "optionalActionsData");
            sw.mo4823o(ow.mo68074a(optionalActionsData));
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$j */
    static final class C24455j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HubViewModel$ViewModel f63139d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24455j(HubViewModel$ViewModel hubViewModel$ViewModel) {
            super(1);
            this.f63139d = hubViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo62267a(String str) {
            this.f63139d.f63130z.onNext(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo62267a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$k */
    static final class C24456k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HubViewModel$ViewModel f63140d;

        /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$k$a */
        static final class C24457a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ HubViewModel$ViewModel f63141d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24457a(HubViewModel$ViewModel hubViewModel$ViewModel) {
                super(1);
                this.f63141d = hubViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo62269a(C25212e eVar) {
                this.f63141d.f63123t0 = eVar.mo63731b();
                this.f63141d.mo48015bd();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo62269a((C25212e) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24456k(HubViewModel$ViewModel hubViewModel$ViewModel) {
            super(1);
            this.f63140d = hubViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m78682c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return this.f63140d.f63124u.invoke().mo95084m(new C24460a(new C24457a(this.f63140d))).mo95075O();
        }
    }

    /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$l */
    static final class C24458l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ HubViewModel$ViewModel f63142d;

        /* renamed from: ge.bog.mobilebank.hubmenu.presentation.viewmodel.HubViewModel$ViewModel$l$a */
        static final class C24459a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ HubViewModel$ViewModel f63143d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24459a(HubViewModel$ViewModel hubViewModel$ViewModel) {
                super(1);
                this.f63143d = hubViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Boolean bool) {
                HubViewModel$ViewModel hubViewModel$ViewModel = this.f63143d;
                C41536l.m120488h(bool, "result");
                hubViewModel$ViewModel.f63125u0 = bool.booleanValue();
                this.f63143d.mo48015bd();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C24458l(HubViewModel$ViewModel hubViewModel$ViewModel) {
            super(1);
            this.f63142d = hubViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m78686c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return this.f63142d.f63126v.invoke().mo95084m(new C24461b(new C24459a(this.f63142d))).mo95075O();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HubViewModel$ViewModel(C29879c cVar, C28448c cVar2, C32080b bVar, C28449d dVar, C28455i iVar, C28450e eVar, C28451f fVar, C28453g gVar, C28459l lVar, C27843a aVar, C28454h hVar, C28446a aVar2, C20108a aVar3, C36738j jVar, Client client, C16740f fVar2, C28456j jVar2, C25022n nVar, C29418y yVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C29879c cVar3 = cVar;
        C28448c cVar4 = cVar2;
        C32080b bVar2 = bVar;
        C28449d dVar2 = dVar;
        C28455i iVar2 = iVar;
        C28450e eVar2 = eVar;
        C28451f fVar3 = fVar;
        C28453g gVar2 = gVar;
        C28459l lVar2 = lVar;
        C27843a aVar4 = aVar;
        C28454h hVar2 = hVar;
        C28446a aVar5 = aVar2;
        C20108a aVar6 = aVar3;
        C16740f fVar4 = fVar2;
        C41536l.m120489i(cVar3, "isCreditLoanAllowed");
        C41536l.m120489i(cVar4, "forceSolo");
        C41536l.m120489i(bVar2, "isAuthorized");
        C41536l.m120489i(dVar2, "getGroupingProductHubs");
        C41536l.m120489i(iVar2, "getTransactionsHubs");
        C41536l.m120489i(eVar2, "getNonBankingHubs");
        C41536l.m120489i(fVar3, "getOtherProductHubs");
        C41536l.m120489i(gVar2, "getOurAppsHubs");
        C41536l.m120489i(lVar2, "searchHubsAndSettings");
        C41536l.m120489i(aVar4, "accumulateHubsAndSettingsLocator");
        C41536l.m120489i(hVar2, "getProfileWrapper");
        C41536l.m120489i(aVar5, "convertHubOptionalActionsData");
        C41536l.m120489i(aVar6, "checkKycStatusUseCase");
        C41536l.m120489i(jVar, "getUserInfoObservableUseCase");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(fVar2, "getClientCountryInfo");
        C41536l.m120489i(jVar2, "hideBankingGroupUseCase");
        C41536l.m120489i(nVar, "shouldShowGamificationShortcuts");
        C41536l.m120489i(yVar, "shouldShowGiftCardsUseCase");
        this.f63090d = cVar3;
        this.f63092e = cVar4;
        this.f63094f = bVar2;
        this.f63096g = dVar2;
        this.f63098h = iVar2;
        this.f63100i = eVar2;
        this.f63102j = fVar3;
        this.f63104k = gVar2;
        this.f63106l = lVar2;
        this.f63108m = aVar4;
        this.f63110n = hVar2;
        this.f63112o = aVar5;
        this.f63114p = aVar6;
        this.f63116q = jVar;
        this.f63118r = client;
        this.f63120s = fVar2;
        this.f63122t = jVar2;
        this.f63124u = nVar;
        this.f63126v = yVar;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create()");
        this.f63130z = h1;
        this.f63061A = new C1644x();
        this.f63062B = new C1644x();
        this.f63063C = new C1644x();
        this.f63064D = new C1644x();
        this.f63065E = new C1644x();
        this.f63066F = new C1644x();
        this.f63067G = new C1644x();
        this.f63068H = new C1644x();
        this.f63069I = new C1644x();
        this.f63070J = new C1644x();
        this.f63071K = new C1644x();
        this.f63072L = new C1644x();
        this.f63073M = new C1644x();
        this.f63074N = new C1644x();
        this.f63075O = new C1644x();
        this.f63076P = new C1644x();
        this.f63077Q = new C1644x();
        this.f63078R = new C1644x();
        this.f63079S = new C1644x();
        this.f63080T = new C1644x();
        this.f63081U = new C1644x();
        this.f63082V = new C1644x();
        this.f63083W = new C1644x();
        this.f63084X = new C1644x();
        this.f63085Y = new C1644x();
        this.f63086Z = new C1644x();
        this.f63087a0 = new C1644x();
        this.f63088b0 = new C1644x();
        this.f63089c0 = new C1644x();
        this.f63091d0 = new C1644x();
        this.f63093e0 = new C1644x();
        this.f63095f0 = new C1644x();
        this.f63097g0 = new C1644x();
        this.f63099h0 = new C1644x();
        this.f63101i0 = new C1644x();
        this.f63103j0 = new C1644x();
        this.f63105k0 = new C1644x();
        this.f63107l0 = new C1644x(Boolean.FALSE);
        this.f63109m0 = new C1644x(new C27585b(false, false, (String) null, 7, (DefaultConstructorMarker) null));
        this.f63111n0 = new C1644x();
        this.f63113o0 = new C1644x();
        this.f63115p0 = new C1644x();
        this.f63117q0 = new C1644x();
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<Unit>()");
        this.f63119r0 = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Unit>()");
        this.f63121s0 = h13;
        addDisposables(m78570tx(), m78584zw(), m78576vx(), m78508Dw());
        m78568sy();
        m78574uy();
    }

    /* access modifiers changed from: private */
    /* renamed from: Aw */
    public static final void m78503Aw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ax */
    private final void m78504Ax() {
        bindToLifecycle(C31270e.m92876e(C31270e.m92880i(this.f63090d.mo70151a(), -1), this.f63072L));
    }

    /* renamed from: Bw */
    private final C20038a m78505Bw() {
        return new C20038a(this.f63094f.mo72555a(), new C20039b.C20040a(this.f63122t.mo68083a(), this.f63096g.mo68077b(), this.f63100i.mo68078a(this.f63123t0, this.f63125u0), this.f63098h.mo68082a(), this.f63102j.mo68079a(), this.f63104k.mo68080a()));
    }

    /* renamed from: Bx */
    private final void m78506Bx(C27551a.C27564c cVar) {
        if (cVar instanceof C27551a.C27564c.C27567c) {
            m78529Vx();
        } else if (cVar instanceof C27551a.C27564c.C27568d) {
            m78532Yx();
        } else if (cVar instanceof C27551a.C27564c.C27569e) {
            m78564qy();
        } else if (cVar instanceof C27551a.C27564c.C27565a) {
            m78527Tx();
        } else if (cVar instanceof C27551a.C27564c.C27566b) {
            m78528Ux();
        }
    }

    /* renamed from: Cx */
    private final void m78507Cx(C27551a.C27570d dVar) {
        if (dVar instanceof C27551a.C27570d.C27571a) {
            m78515Hx();
        } else if (dVar instanceof C27551a.C27570d.C27572b) {
            m78525Rx();
        }
    }

    /* renamed from: Dw */
    private final C41205b m78508Dw() {
        C41205b F0 = this.f63114p.mo48539a().mo94981F0(new C19772g(new C24450e(this)));
        C41536l.m120488h(F0, "private fun getCheckKycS…lue(status)\n            }");
        return F0;
    }

    /* renamed from: Dx */
    private final void m78509Dx(C27551a.C27573e eVar) {
        if (eVar instanceof C27551a.C27573e.C27574a) {
            m78518Kx(eVar.mo66936i());
        } else if (eVar instanceof C27551a.C27573e.C27576c) {
            m78520Mx(eVar.mo66936i());
        } else if (eVar instanceof C27551a.C27573e.C27575b) {
            m78519Lx(eVar.mo66936i());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m78510Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ex */
    private final void m78511Ex(C27551a.C27578f fVar, String str) {
        if (fVar instanceof C27551a.C27578f.C27582d) {
            m78541fy(str);
        } else if (fVar instanceof C27551a.C27578f.C27584f) {
            m78562py();
        } else if (fVar instanceof C27551a.C27578f.C27581c) {
            m78554m0();
        } else if (fVar instanceof C27551a.C27578f.C27579a) {
            m78516Ix();
        } else if (fVar instanceof C27551a.C27578f.C27583e) {
            m78547iy();
        } else if (fVar instanceof C27551a.C27578f.C27580b) {
            m78537dy();
        }
    }

    /* renamed from: Fw */
    private final C20039b m78512Fw(String str) {
        List a = this.f63106l.mo68085a(str, this.f63123t0, this.f63125u0);
        if (a != null) {
            return new C20039b.C20041b(a);
        }
        return new C20039b.C20040a(this.f63122t.mo68083a(), this.f63096g.mo68077b(), this.f63100i.mo68078a(this.f63123t0, this.f63125u0), this.f63098h.mo68082a(), this.f63102j.mo68079a(), this.f63104k.mo68080a());
    }

    /* access modifiers changed from: private */
    /* renamed from: Fx */
    public static final void m78513Fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Gx */
    private final void m78514Gx() {
        C37224b.m109962a(this.f63093e0);
    }

    /* renamed from: Hx */
    private final void m78515Hx() {
        C37224b.m109962a(this.f63083W);
    }

    /* renamed from: Ix */
    private final void m78516Ix() {
        C37224b.m109962a(this.f63077Q);
    }

    /* renamed from: Jx */
    private final void m78517Jx() {
        C37224b.m109962a(this.f63066F);
    }

    /* renamed from: Kx */
    private final void m78518Kx(String str) {
        C37224b.m109966e(this.f63085Y, str);
    }

    /* renamed from: Lx */
    private final void m78519Lx(String str) {
        C37224b.m109966e(this.f63087a0, str);
    }

    /* renamed from: Mx */
    private final void m78520Mx(String str) {
        C37224b.m109966e(this.f63086Z, str);
    }

    /* renamed from: Nx */
    private final void m78521Nx() {
        C37224b.m109962a(this.f63065E);
    }

    /* renamed from: Ox */
    private final void m78522Ox() {
        C37224b.m109962a(this.f63089c0);
    }

    /* renamed from: Px */
    private final void m78523Px() {
        C37224b.m109962a(this.f63061A);
    }

    /* renamed from: Qx */
    private final void m78524Qx() {
        C37224b.m109962a(this.f63063C);
    }

    /* renamed from: Rx */
    private final void m78525Rx() {
        C37224b.m109962a(this.f63084X);
    }

    /* renamed from: Sx */
    private final void m78526Sx() {
        C37224b.m109962a(this.f63081U);
    }

    /* renamed from: Tx */
    private final void m78527Tx() {
        C37224b.m109962a(this.f63115p0);
    }

    /* renamed from: Ux */
    private final void m78528Ux() {
        C37224b.m109962a(this.f63117q0);
    }

    /* renamed from: Vx */
    private final void m78529Vx() {
        C37224b.m109962a(this.f63069I);
    }

    /* renamed from: Wx */
    private final void m78530Wx() {
        C37224b.m109962a(this.f63113o0);
    }

    /* renamed from: Xx */
    private final void m78531Xx() {
        C37224b.m109962a(this.f63095f0);
    }

    /* renamed from: Yx */
    private final void m78532Yx() {
        C37224b.m109962a(this.f63070J);
    }

    /* renamed from: Zx */
    private final void m78533Zx() {
        m78504Ax();
    }

    /* renamed from: ay */
    private final void m78534ay() {
        C37224b.m109962a(this.f63068H);
    }

    private final C40749p canActivateCard() {
        C40749p k0 = C26186e.m81987e(this.f63120s.mo43869a()).mo95026k0(new C19769d(C24447b.f63131d));
        C41536l.m120488h(k0, "getClientCountryInfo().u…us.CAN_ACTIVATE\n        }");
        return k0;
    }

    private final C40749p checkCard() {
        if (this.f63118r.isAuthorized()) {
            C40749p t0 = canActivateCard().mo95035t0(new C19778m(C24448c.f63132d));
            C41536l.m120488h(t0, "canActivateCard().onErrorReturn { false }");
            return t0;
        }
        C40749p h0 = C40749p.m118043h0(Boolean.FALSE);
        C41536l.m120488h(h0, "just(false)");
        return h0;
    }

    /* renamed from: cy */
    private final void m78535cy(C32041b.C32042a aVar) {
        if (aVar instanceof C32041b.C32042a.C32045c) {
            m78522Ox();
        } else if (aVar instanceof C32041b.C32042a.C32049g) {
            m78558ny();
        } else if (aVar instanceof C32041b.C32042a.C32043a) {
            m78514Gx();
        } else if (aVar instanceof C32041b.C32042a.C32046d) {
            m78530Wx();
        } else if (aVar instanceof C32041b.C32042a.C32047e) {
            m78531Xx();
        } else if (aVar instanceof C32041b.C32042a.C32048f) {
            m78553ly();
        } else if (aVar instanceof C32041b.C32042a.C32044b) {
            m78549jy();
        }
    }

    /* renamed from: dy */
    private final void m78537dy() {
        C37224b.m109962a(this.f63079S);
    }

    /* renamed from: ey */
    private final void m78539ey() {
        C37224b.m109962a(this.f63082V);
    }

    /* renamed from: fy */
    private final void m78541fy(String str) {
        C37224b.m109965d(this.f63074N, str);
    }

    /* renamed from: gy */
    private final void m78543gy() {
        C37224b.m109962a(this.f63064D);
    }

    /* renamed from: hy */
    private final void m78545hy() {
        C37224b.m109962a(this.f63103j0);
    }

    /* renamed from: iy */
    private final void m78547iy() {
        C37224b.m109962a(this.f63078R);
    }

    /* renamed from: jy */
    private final void m78549jy() {
        C37224b.m109962a(this.f63099h0);
    }

    /* renamed from: ky */
    private final void m78551ky(C32041b.C32050b bVar) {
        if (bVar instanceof C32041b.C32050b.C32052b) {
            m78556my();
        } else if (bVar instanceof C32041b.C32050b.C32051a) {
            m78545hy();
        } else {
            throw new IllegalStateException("Only SecuritySettings.SignInAndAuth and SecuritySettings.PrivacyPolicy support clicks handlers");
        }
    }

    /* renamed from: ly */
    private final void m78553ly() {
        C37224b.m109962a(this.f63097g0);
    }

    /* renamed from: m0 */
    private final void m78554m0() {
        C37224b.m109962a(this.f63076P);
    }

    /* renamed from: my */
    private final void m78556my() {
        C37224b.m109962a(this.f63101i0);
    }

    /* renamed from: ny */
    private final void m78558ny() {
        C37224b.m109962a(this.f63091d0);
    }

    /* renamed from: oy */
    private final void m78560oy() {
        C37224b.m109965d(this.f63067G, Boolean.valueOf(this.f63092e.mo68076a()));
    }

    /* renamed from: py */
    private final void m78562py() {
        C37224b.m109962a(this.f63075O);
    }

    /* renamed from: qy */
    private final void m78564qy() {
        C37224b.m109962a(this.f63071K);
    }

    /* access modifiers changed from: private */
    /* renamed from: ry */
    public final void m78566ry(String str) {
        if (this.f63129y.get()) {
            this.f63073M.mo4823o(new C20038a(this.f63094f.mo72555a(), m78512Fw(str)));
        }
    }

    /* renamed from: sy */
    private final void m78568sy() {
        C41205b E0 = this.f63119r0.mo94989L0(new C19771f(new C24456k(this))).mo94979E0();
        C41536l.m120488h(E0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(E0);
    }

    /* renamed from: tx */
    private final C41205b m78570tx() {
        C41205b F0 = this.f63130z.mo95032s(300, TimeUnit.MILLISECONDS).mo95027o0(C40992a.m118827a()).mo94981F0(new C19768c(new C24451f(this)));
        C41536l.m120488h(F0, "private fun getSearchInp…edText)\n                }");
        return F0;
    }

    /* access modifiers changed from: private */
    /* renamed from: ty */
    public static final C40754t m78571ty(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ux */
    public static final void m78573ux(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: uy */
    private final void m78574uy() {
        C41205b E0 = this.f63121s0.mo94989L0(new C19770e(new C24458l(this))).mo94979E0();
        C41536l.m120488h(E0, "private fun subscribeToG…cribe().bindToLifecycle()");
        bindToLifecycle(E0);
    }

    /* renamed from: vx */
    private final C41205b m78576vx() {
        C41205b F0 = C40749p.m118048m(this.f63116q.mo89564a().mo94977D0(C41238w.f97225a), checkCard(), new C19774i(C24452g.f63136d)).mo95026k0(new C19775j(C24453h.f63137d)).mo94981F0(new C19776k(new C24454i(this)));
        C41536l.m120488h(F0, "private fun getUserInfoD…          )\n            }");
        return F0;
    }

    /* access modifiers changed from: private */
    /* renamed from: vy */
    public static final C40754t m78577vy(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: wx */
    public static final Boolean m78579wx(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (Boolean) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final Boolean m78580xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: xx */
    public static final OptionalActionsData m78581xx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (OptionalActionsData) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public static final Boolean m78582yw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: yx */
    public static final void m78583yx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: zw */
    private final C41205b m78584zw() {
        C41205b F0 = this.f63108m.mo67360b().mo94981F0(new C19777l(new C24449d(this)));
        C41536l.m120488h(F0, "private fun getAccumulat…          }\n            }");
        return F0;
    }

    /* renamed from: zx */
    private final void m78585zx(C27551a.C27552a aVar) {
        if (aVar instanceof C27551a.C27552a.C27555c) {
            m78523Px();
        } else if (aVar instanceof C27551a.C27552a.C27556d) {
            m78524Qx();
        } else if (aVar instanceof C27551a.C27552a.C27561i) {
            m78543gy();
        } else if (aVar instanceof C27551a.C27552a.C27558f) {
            m78533Zx();
        } else if (aVar instanceof C27551a.C27552a.C27554b) {
            m78521Nx();
        } else if (aVar instanceof C27551a.C27552a.C27553a) {
            m78517Jx();
        } else if (aVar instanceof C27551a.C27552a.C27562j) {
            m78560oy();
        } else if (aVar instanceof C27551a.C27552a.C27559g) {
            m78534ay();
        } else if (aVar instanceof C27551a.C27552a.C27560h) {
            m78539ey();
        } else if (aVar instanceof C27551a.C27552a.C27557e) {
            m78526Sx();
        }
    }

    /* renamed from: Cw */
    public C1644x mo48027Kh() {
        return this.f63073M;
    }

    /* renamed from: Gw */
    public final C19766a mo62220Gw() {
        return this.f63128x;
    }

    /* renamed from: Hw */
    public C1644x mo48023Bt() {
        return this.f63088b0;
    }

    /* renamed from: Iw */
    public C1644x mo48062v() {
        return this.f63072L;
    }

    /* renamed from: Jl */
    public void mo48012Jl() {
        C37224b.m109965d(this.f63105k0, this.f63110n.mo68081a());
    }

    /* renamed from: Jw */
    public C1644x mo48050i1() {
        return this.f63093e0;
    }

    /* renamed from: Kw */
    public C1644x mo48022Be() {
        return this.f63083W;
    }

    /* renamed from: Ln */
    public LiveData mo48028Ln() {
        return this.f63117q0;
    }

    /* renamed from: Lw */
    public C1644x mo48031Qf() {
        return this.f63077Q;
    }

    /* renamed from: Mw */
    public C1644x mo48059ru() {
        return this.f63066F;
    }

    /* renamed from: Nw */
    public C1644x mo48053lt() {
        return this.f63080T;
    }

    /* renamed from: Ow */
    public C1644x mo48032Qt() {
        return this.f63085Y;
    }

    /* renamed from: Pw */
    public C1644x mo48038Vu() {
        return this.f63087a0;
    }

    /* renamed from: Qw */
    public C1644x mo48026Ht() {
        return this.f63086Z;
    }

    /* renamed from: Rw */
    public C1644x mo48029Lp() {
        return this.f63065E;
    }

    /* renamed from: Sw */
    public C1644x mo48054mp() {
        return this.f63062B;
    }

    /* renamed from: Tw */
    public C1644x mo48056p0() {
        return this.f63089c0;
    }

    /* renamed from: Uw */
    public C1644x mo48047fo() {
        return this.f63061A;
    }

    /* renamed from: Vw */
    public C1644x mo48063vm() {
        return this.f63063C;
    }

    /* renamed from: W8 */
    public void mo48013W8() {
        C32343x.m95472o(this.f63119r0);
    }

    /* renamed from: Ww */
    public C1644x mo48064vt() {
        return this.f63084X;
    }

    /* renamed from: Xw */
    public C1644x mo48024Cv() {
        return this.f63081U;
    }

    /* renamed from: Ym */
    public void mo48014Ym() {
        C37224b.m109962a(this.f63111n0);
    }

    /* renamed from: Yw */
    public C1644x mo48055nr() {
        return this.f63069I;
    }

    /* renamed from: Zw */
    public C1644x mo48033S2() {
        return this.f63113o0;
    }

    /* renamed from: ax */
    public C1644x mo48039Z0() {
        return this.f63095f0;
    }

    /* renamed from: bd */
    public void mo48015bd() {
        if (this.f63129y.get()) {
            C41205b F0 = this.f63130z.mo95024i0("").mo95075O().mo94981F0(new C19773h(new C24455j(this)));
            C41536l.m120488h(F0, "override fun initUiDarkM…)\n            }\n        }");
            bindToLifecycle(F0);
            return;
        }
        this.f63073M.mo4823o(m78505Bw());
    }

    /* renamed from: bx */
    public C1644x mo48034T5() {
        return this.f63070J;
    }

    /* renamed from: cx */
    public C1644x mo48042b6() {
        return this.f63068H;
    }

    /* renamed from: dg */
    public LiveData mo48045dg() {
        return this.f63115p0;
    }

    /* renamed from: dx */
    public C1644x mo48052ka() {
        return this.f63079S;
    }

    /* renamed from: eb */
    public LiveData mo48046eb() {
        return this.f63105k0;
    }

    /* renamed from: ex */
    public C1644x mo48041av() {
        return this.f63082V;
    }

    /* renamed from: fx */
    public C1644x mo48043ct() {
        return this.f63076P;
    }

    /* renamed from: gx */
    public C1644x mo48058qr() {
        return this.f63074N;
    }

    /* renamed from: hx */
    public C1644x mo48025Fq() {
        return this.f63064D;
    }

    /* renamed from: ix */
    public C1644x mo48040Z1() {
        return this.f63103j0;
    }

    /* renamed from: jx */
    public C1644x mo48044df() {
        return this.f63078R;
    }

    /* renamed from: kx */
    public C1644x mo48036V1() {
        return this.f63099h0;
    }

    /* renamed from: lx */
    public C1644x mo48061ug() {
        return this.f63111n0;
    }

    /* renamed from: mx */
    public C1644x mo48035U2() {
        return this.f63097g0;
    }

    /* renamed from: nx */
    public C1644x mo48051k1() {
        return this.f63101i0;
    }

    /* renamed from: or */
    public void mo48016or() {
        C32343x.m95472o(this.f63121s0);
    }

    /* renamed from: ox */
    public C1644x mo48030N1() {
        return this.f63091d0;
    }

    /* renamed from: px */
    public C1644x mo48057pb() {
        return this.f63067G;
    }

    /* renamed from: q4 */
    public void mo48017q4() {
        C37224b.m109962a(this.f63088b0);
    }

    /* renamed from: qx */
    public C1644x mo48060su() {
        return this.f63075O;
    }

    /* renamed from: rx */
    public C1644x mo48037V6() {
        return this.f63071K;
    }

    /* renamed from: sx */
    public final C19767b mo62258sx() {
        return this.f63127w;
    }

    /* renamed from: tk */
    public void mo48018tk(String str) {
        C41536l.m120489i(str, "searchWord");
        this.f63129y.set(true);
        this.f63130z.onNext(str);
    }

    /* renamed from: x3 */
    public void mo48019x3(C27551a aVar, String str) {
        C41536l.m120489i(aVar, "hubItem");
        C41536l.m120489i(str, "label2");
        if (aVar instanceof C27551a.C27552a) {
            m78585zx((C27551a.C27552a) aVar);
        } else if (aVar instanceof C27551a.C27564c) {
            m78506Bx((C27551a.C27564c) aVar);
        } else if (aVar instanceof C27551a.C27578f) {
            m78511Ex((C27551a.C27578f) aVar, str);
        } else if (aVar instanceof C27551a.C27570d) {
            m78507Cx((C27551a.C27570d) aVar);
        } else if (aVar instanceof C27551a.C27573e) {
            m78509Dx((C27551a.C27573e) aVar);
        }
    }

    /* renamed from: z2 */
    public void mo48020z2(C32041b bVar) {
        C41536l.m120489i(bVar, "settingsItem");
        if (bVar instanceof C32041b.C32042a) {
            m78535cy((C32041b.C32042a) bVar);
        } else if (bVar instanceof C32041b.C32050b) {
            m78551ky((C32041b.C32050b) bVar);
        }
    }

    /* renamed from: zb */
    public void mo48021zb() {
        this.f63129y.set(false);
        this.f63073M.mo4823o(m78505Bw());
    }

    public C1644x getHasKycLiveData() {
        return this.f63107l0;
    }

    public C1644x getUserInfoChangedLiveData() {
        return this.f63109m0;
    }
}
