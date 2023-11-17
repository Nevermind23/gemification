package p341ge.bog.mobilebank.cardapplications.presentation.viewmodel;

import af1.C40303i;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c21.C31260a;
import c41.C31270e;
import cf1.C40407d;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g21.C32053a;
import g91.C32343x;
import g91.C32359z0;
import hd0.C24978b;
import hd1.C41204a;
import he1.C41232r;
import he1.C41233s;
import he1.C41238w;
import j51.C36735g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;
import ld0.C25950a;
import m41.C37223a;
import m41.C37224b;
import m51.C37228a;
import o31.C37591c;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCommissionUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.instantcards.InstantCardActivationResultUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorData;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import p355an.C10086d;
import p411em.C12490g;
import p412en.C12491a;
import p412en.C12497b;
import p412en.C12502c;
import p412en.C12507d;
import p412en.C12512e;
import p412en.C12525f;
import p412en.C12530g;
import p412en.C12535h;
import p412en.C12541i;
import p523mm.C16728b1;
import p523mm.C16731c0;
import p523mm.C16737d1;
import p523mm.C16739e0;
import p523mm.C16796y0;
import p523mm.C16798z;
import p537nm.C17075c0;
import p537nm.C17081e0;
import p537nm.C17085g0;
import p537nm.C17099p;
import p537nm.C17107x;
import p537nm.C17108y;
import p565pm.C17386a;
import p565pm.C17387b;
import p565pm.C17391f;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel */
public final class ActivateInstantCardViewModel$ViewModel extends C21481a implements C12491a, C12502c {

    /* renamed from: L */
    static final /* synthetic */ C40303i[] f41844L = {C41520a0.m120439e(new C41539o(ActivateInstantCardViewModel$ViewModel.class, "activationInput", "getActivationInput()Lge/bog/mobilebank/cardapplications/presentation/viewmodel/ActivateInstantCardViewModel$InstantCardActivationInput;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C1644x f41845A;

    /* renamed from: B */
    private final C41555e f41846B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C17386a f41847C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C17391f f41848D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public List f41849E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final HashMap f41850F;

    /* renamed from: G */
    private final C40767b f41851G;

    /* renamed from: H */
    private final C40767b f41852H;

    /* renamed from: I */
    private final C40767b f41853I;

    /* renamed from: J */
    private final C40767b f41854J;

    /* renamed from: K */
    private final C40767b f41855K;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16737d1 f41856d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C16796y0 f41857e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C16731c0 f41858f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C16728b1 f41859g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C36735g f41860h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C16798z f41861i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C16739e0 f41862j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C10086d f41863k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C32053a f41864l;

    /* renamed from: m */
    private final C12491a f41865m = this;

    /* renamed from: n */
    private final C12502c f41866n = this;

    /* renamed from: o */
    private final C1644x f41867o = new C1644x();

    /* renamed from: p */
    private final C1644x f41868p;

    /* renamed from: q */
    private final LiveData f41869q;

    /* renamed from: r */
    private final C1644x f41870r;

    /* renamed from: s */
    private final C1644x f41871s;

    /* renamed from: t */
    private final C1644x f41872t;

    /* renamed from: u */
    private final C1644x f41873u;

    /* renamed from: v */
    private final C1644x f41874v;

    /* renamed from: w */
    private final C1644x f41875w;

    /* renamed from: x */
    private final C1644x f41876x;

    /* renamed from: y */
    private final C1644x f41877y;

    /* renamed from: z */
    private final LiveData f41878z;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$a */
    static final class C14242a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41879d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$a$a */
        static final class C14243a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41880d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14243a(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
                super(1);
                this.f41880d = activateInstantCardViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo39972a(C17386a aVar) {
                ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel = this.f41880d;
                C41536l.m120488h(aVar, "it");
                activateInstantCardViewModel$ViewModel.f41847C = aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39972a((C17386a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14242a(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
            super(1);
            this.f41879d = activateInstantCardViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m52818c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C40762x m = this.f41879d.f41858f.mo43860c().mo95084m(new C14267a(new C14243a(this.f41879d)));
            C41536l.m120488h(m, "@HiltViewModel\n    class…ionInput)\n        }\n    }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$b */
    static final class C14244b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14244b f41881d = new C14244b();

        C14244b() {
            super(1);
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            try {
                if (aVar instanceof C31128a.C31131c) {
                    C25950a aVar2 = (C25950a) ((C31128a.C31131c) aVar).mo71340a();
                    return new C31128a.C31131c(C41238w.f97225a, aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    Throwable c = ((C31128a.C31129a) aVar).mo71342c();
                    int b = aVar.mo71341b();
                    C25950a aVar3 = (C25950a) aVar.mo71340a();
                    return new C31128a.C31129a(c, b, C41238w.f97225a);
                } else if (aVar instanceof C31128a.C31130b) {
                    int b2 = aVar.mo71341b();
                    C25950a aVar4 = (C25950a) aVar.mo71340a();
                    return new C31128a.C31130b(b2, C41238w.f97225a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                return new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$c */
    static final class C14245c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C14245c f41882d = new C14245c();

        C14245c() {
            super(1);
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            try {
                if (aVar instanceof C31128a.C31131c) {
                    C17386a aVar2 = (C17386a) ((C31128a.C31131c) aVar).mo71340a();
                    return new C31128a.C31131c(C41238w.f97225a, aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    Throwable c = ((C31128a.C31129a) aVar).mo71342c();
                    int b = aVar.mo71341b();
                    C17386a aVar3 = (C17386a) aVar.mo71340a();
                    return new C31128a.C31129a(c, b, C41238w.f97225a);
                } else if (aVar instanceof C31128a.C31130b) {
                    int b2 = aVar.mo71341b();
                    C17386a aVar4 = (C17386a) aVar.mo71340a();
                    return new C31128a.C31130b(b2, C41238w.f97225a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                return new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$d */
    static final class C14246d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41883d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$d$a */
        /* synthetic */ class C14247a extends C41535k implements C43075l {
            C14247a(Object obj) {
                super(1, obj, C10086d.class, "transform", "transform(Lge/bog/mobilebank/cardapplications/domain/model/DebitCardCommission;)Lge/bog/mobilebank/cardapplications/presentation/model/DebitCardCommissionUiModel;", 0);
            }

            /* renamed from: b */
            public final DebitCardCommissionUiModel invoke(C17099p pVar) {
                C41536l.m120489i(pVar, "p0");
                return ((C10086d) this.receiver).mo26545a(pVar);
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$d$b */
        static final class C14248b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41884d;

            /* renamed from: e */
            final /* synthetic */ C17085g0 f41885e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14248b(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel, C17085g0 g0Var) {
                super(1);
                this.f41884d = activateInstantCardViewModel$ViewModel;
                this.f41885e = g0Var;
            }

            /* renamed from: a */
            public final void mo39977a(DebitCardCommissionUiModel debitCardCommissionUiModel) {
                HashMap mw = this.f41884d.f41850F;
                C17085g0 g0Var = this.f41885e;
                C41536l.m120488h(g0Var, "regType");
                C41536l.m120488h(debitCardCommissionUiModel, "it");
                mw.put(g0Var, debitCardCommissionUiModel);
                ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel = this.f41884d;
                activateInstantCardViewModel$ViewModel.m52760Mw(C12497b.m47532b(activateInstantCardViewModel$ViewModel.m52756Fw(), (String) null, (String) null, (String) null, (C17108y) null, false, (C17107x) null, (String) null, (CardAccountSelectorUiModel) null, debitCardCommissionUiModel, C11051p3.f31759c, (Object) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39977a((DebitCardCommissionUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14246d(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
            super(1);
            this.f41883d = activateInstantCardViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final DebitCardCommissionUiModel m52825d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (DebitCardCommissionUiModel) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m52826e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C17085g0 g0Var) {
            C40762x xVar;
            C41536l.m120489i(g0Var, "regType");
            DebitCardCommissionUiModel debitCardCommissionUiModel = (DebitCardCommissionUiModel) this.f41883d.f41850F.get(g0Var);
            if (debitCardCommissionUiModel == null || (xVar = C40762x.m118162z(debitCardCommissionUiModel)) == null) {
                C16798z pw = this.f41883d.f41861i;
                C17075c0 c0Var = C17075c0.PLASTIC;
                C17391f xw = this.f41883d.f41848D;
                C41536l.m120486f(xw);
                xVar = pw.mo43918a(c0Var, xw.mo44918d(), g0Var.mo44353b()).mo95062A(new C14268b(new C14247a(this.f41883d.f41863k))).mo95084m(new C14269c(new C14248b(this.f41883d, g0Var)));
            }
            C41536l.m120488h(xVar, "private fun subscribeToC…ndToLifecycle()\n        }");
            return C31270e.m92880i(xVar, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$e */
    static final class C14249e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41886d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$e$a */
        static final class C14250a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41887d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14250a(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
                super(1);
                this.f41887d = activateInstantCardViewModel$ViewModel;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                ArrayList<C31260a> arrayList = new ArrayList<>();
                for (Object next : list) {
                    if (C41536l.m120484d(((C31260a) next).mo71511f(), "GEL")) {
                        arrayList.add(next);
                    }
                }
                C32053a uw = this.f41887d.f41864l;
                ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
                for (C31260a a : arrayList) {
                    arrayList2.add(uw.mo72551a(a));
                }
                return arrayList2;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$e$b */
        static final class C14251b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41888d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14251b(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
                super(1);
                this.f41888d = activateInstantCardViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo39980a(List list) {
                ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel = this.f41888d;
                C41536l.m120488h(list, "accounts");
                activateInstantCardViewModel$ViewModel.f41849E = list;
                if (this.f41888d.f41849E.isEmpty()) {
                    this.f41888d.mo39969Lw(C17085g0.NEW_ACCOUNT);
                    return;
                }
                ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel2 = this.f41888d;
                activateInstantCardViewModel$ViewModel2.m52760Mw(C12497b.m47532b(activateInstantCardViewModel$ViewModel2.m52756Fw(), (String) null, (String) null, (String) null, (C17108y) null, true, (C17107x) null, (String) null, (CardAccountSelectorUiModel) null, (DebitCardCommissionUiModel) null, 495, (Object) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39980a((List) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14249e(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
            super(1);
            this.f41886d = activateInstantCardViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m52832d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C17391f fVar) {
            C41536l.m120489i(fVar, "card");
            C40762x m = this.f41886d.f41857e.mo43916b(fVar.mo44916b(), fVar.mo44915a()).mo95062A(new C14270d(new C14250a(this.f41886d))).mo95084m(new C14271e(new C14251b(this.f41886d)));
            C41536l.m120488h(m, "private fun subscribeToG…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$f */
    static final class C14252f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41889d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$f$a */
        static final class C14253a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41890d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14253a(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
                super(1);
                this.f41890d = activateInstantCardViewModel$ViewModel;
            }

            /* renamed from: a */
            public final void mo39982a(C25950a aVar) {
                C37224b.m109965d(this.f41890d.f41845A, aVar.mo64864a());
                this.f41890d.m52759Kw();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39982a((C25950a) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$f$b */
        static final class C14254b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41891d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14254b(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
                super(1);
                this.f41891d = activateInstantCardViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f41891d.m52759Kw();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14252f(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
            super(1);
            this.f41889d = activateInstantCardViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m52837d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m52838e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C41238w wVar) {
            Long l;
            String str;
            Boolean bool;
            String str2;
            String str3;
            C17085g0 b;
            C41536l.m120489i(wVar, "it");
            C16739e0 rw = this.f41889d.f41862j;
            C37228a a = this.f41889d.f41860h.mo89562a();
            String str4 = null;
            if (a != null) {
                l = Long.valueOf(a.mo90305b());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            C17108y i = this.f41889d.m52756Fw().mo33112i();
            if (i == null || (b = i.mo44517b()) == null) {
                str = null;
            } else {
                str = b.mo44353b();
            }
            String valueOf2 = String.valueOf(str);
            DebitCardCommissionUiModel d = this.f41889d.m52756Fw().mo33105d();
            if (d != null) {
                bool = Boolean.valueOf(d.getNewAccPackage());
            } else {
                bool = null;
            }
            String e = C24978b.m79846b(bool).mo63391e();
            C41536l.m120488h(e, "fromBoolean(activationIn…fee?.newAccPackage).value");
            C17391f xw = this.f41889d.f41848D;
            if (xw != null) {
                str2 = xw.mo44915a();
            } else {
                str2 = null;
            }
            String valueOf3 = String.valueOf(str2);
            C17391f xw2 = this.f41889d.f41848D;
            if (xw2 != null) {
                str3 = xw2.mo44916b();
            } else {
                str3 = null;
            }
            String valueOf4 = String.valueOf(str3);
            CardAccountSelectorUiModel f = this.f41889d.m52756Fw().mo33108f();
            if (f != null) {
                str4 = f.mo84205d();
            }
            C40762x k = rw.mo43868a(valueOf, valueOf2, e, valueOf3, valueOf4, str4, this.f41889d.m52756Fw().mo33109g()).mo95084m(new C14272f(new C14253a(this.f41889d))).mo95082k(new C14273g(new C14254b(this.f41889d)));
            C41536l.m120488h(k, "private fun subscribeToG…ndToLifecycle()\n        }");
            return C31270e.m92880i(k, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$g */
    static final class C14255g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41892d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$g$a */
        static final class C14256a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41893d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14256a(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
                super(1);
                this.f41893d = activateInstantCardViewModel$ViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                this.f41893d.m52759Kw();
            }
        }

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$g$b */
        static final class C14257b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41894d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14257b(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
                super(1);
                this.f41894d = activateInstantCardViewModel$ViewModel;
            }

            /* renamed from: a */
            public final InstantCardActivationResultUiModel invoke(C17387b bVar) {
                C41536l.m120489i(bVar, "it");
                return this.f41894d.m52771Xw(bVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14255g(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
            super(1);
            this.f41892d = activateInstantCardViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m52843d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final InstantCardActivationResultUiModel m52844e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (InstantCardActivationResultUiModel) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C41238w wVar) {
            Long l;
            Long l2;
            C41536l.m120489i(wVar, "it");
            C41232r c = this.f41892d.m52756Fw().mo33104c();
            String str = (String) c.mo95688a();
            String str2 = (String) c.mo95689b();
            String str3 = (String) c.mo95690c();
            C16728b1 vw = this.f41892d.f41859g;
            C37228a a = this.f41892d.f41860h.mo89562a();
            if (a != null) {
                l = Long.valueOf(a.mo90305b());
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            CardAccountSelectorUiModel f = this.f41892d.m52756Fw().mo33108f();
            if (f != null) {
                l2 = Long.valueOf(f.mo84203a());
            } else {
                l2 = null;
            }
            C40762x A = vw.mo43857d(valueOf, str, str2, str3, l2, this.f41892d.m52756Fw().mo33109g(), this.f41892d.m52757Gw()).mo95082k(new C14274h(new C14256a(this.f41892d))).mo95062A(new C14275i(new C14257b(this.f41892d)));
            C41536l.m120488h(A, "private fun subscribeToR…ndToLifecycle()\n        }");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$h */
    static final class C14258h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ActivateInstantCardViewModel$ViewModel f41895d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel$h$a */
        /* synthetic */ class C14259a extends C41535k implements C43075l {
            C14259a(Object obj) {
                super(1, obj, ActivateInstantCardViewModel$ViewModel.class, "onValidatedCardResult", "onValidatedCardResult(Lge/bog/mobilebank/cardapplications/domain/model/intantcards/ValidatedInstantCard;)V", 0);
            }

            /* renamed from: b */
            public final void mo39988b(C17391f fVar) {
                C41536l.m120489i(fVar, "p0");
                ((ActivateInstantCardViewModel$ViewModel) this.receiver).m52758Jw(fVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo39988b((C17391f) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14258h(ActivateInstantCardViewModel$ViewModel activateInstantCardViewModel$ViewModel) {
            super(1);
            this.f41895d = activateInstantCardViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m52848c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C41232r c = this.f41895d.m52756Fw().mo33104c();
            C40762x m = this.f41895d.f41856d.mo43866a((String) c.mo95688a(), (String) c.mo95689b(), (String) c.mo95690c()).mo95084m(new C14276j(new C14259a(this.f41895d)));
            C41536l.m120488h(m, "validateInstantCard(pan,…(::onValidatedCardResult)");
            return C31270e.m92880i(m, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivateInstantCardViewModel$ViewModel(C16737d1 d1Var, C16796y0 y0Var, C16731c0 c0Var, C16728b1 b1Var, C36735g gVar, C16798z zVar, C16739e0 e0Var, C10086d dVar, C32053a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C16737d1 d1Var2 = d1Var;
        C16796y0 y0Var2 = y0Var;
        C16731c0 c0Var2 = c0Var;
        C16728b1 b1Var2 = b1Var;
        C36735g gVar2 = gVar;
        C16798z zVar2 = zVar;
        C16739e0 e0Var2 = e0Var;
        C10086d dVar2 = dVar;
        C32053a aVar2 = aVar;
        C41536l.m120489i(d1Var2, "validateInstantCard");
        C41536l.m120489i(y0Var2, "getSelectorCardAccounts");
        C41536l.m120489i(c0Var2, "getInstantCardActivationResources");
        C41536l.m120489i(b1Var2, "registerInstantCard");
        C41536l.m120489i(gVar2, "getLoginInfo");
        C41536l.m120489i(zVar2, "getCommissionFees");
        C41536l.m120489i(e0Var2, "getInstantCardPreContract");
        C41536l.m120489i(dVar2, "commissionMapper");
        C41536l.m120489i(aVar2, "mapper");
        this.f41856d = d1Var2;
        this.f41857e = y0Var2;
        this.f41858f = c0Var2;
        this.f41859g = b1Var2;
        this.f41860h = gVar2;
        this.f41861i = zVar2;
        this.f41862j = e0Var2;
        this.f41863k = dVar2;
        this.f41864l = aVar2;
        C1644x xVar = new C1644x();
        this.f41868p = xVar;
        this.f41869q = C1607m0.m5655c(xVar, C14245c.f41882d);
        this.f41870r = new C1644x();
        this.f41871s = new C1644x();
        this.f41872t = new C1644x();
        this.f41873u = new C1644x();
        C1644x xVar2 = new C1644x();
        this.f41874v = xVar2;
        this.f41875w = new C1644x();
        this.f41876x = new C1644x();
        C1644x xVar3 = new C1644x();
        this.f41877y = xVar3;
        this.f41878z = C1607m0.m5655c(xVar3, C14244b.f41881d);
        this.f41845A = new C1644x();
        this.f41846B = C37591c.m110557b(C37591c.f90334a, new C12497b((String) null, (String) null, (String) null, (C17108y) null, false, (C17107x) null, (String) null, (CardAccountSelectorUiModel) null, (DebitCardCommissionUiModel) null, 511, (DefaultConstructorMarker) null), xVar2, (C43075l) null, 4, (Object) null);
        this.f41849E = C41341q.m119907j();
        this.f41850F = new HashMap();
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f41851G = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<ValidatedInstantCard>()");
        this.f41852H = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Unit>()");
        this.f41853I = h13;
        C40767b h14 = C40767b.m118210h1();
        C41536l.m120488h(h14, "create<RegType>()");
        this.f41854J = h14;
        C40767b h15 = C40767b.m118210h1();
        C41536l.m120488h(h15, "create<Unit>()");
        this.f41855K = h15;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C12507d(new C14242a(this)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
        m52769Vw();
        m52763Pw();
        m52767Tw();
        m52761Nw();
        m52765Rw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Fw */
    public final C12497b m52756Fw() {
        return (C12497b) this.f41846B.getValue(this, f41844L[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public final String m52757Gw() {
        String str;
        C37223a aVar = (C37223a) this.f41845A.mo4814f();
        byte[] bArr = null;
        if (aVar != null) {
            str = (String) aVar.mo90299d();
        } else {
            str = null;
        }
        if (str != null) {
            bArr = str.getBytes(C40407d.f95989b);
            C41536l.m120488h(bArr, "this as java.lang.String).getBytes(charset)");
        }
        return C32359z0.m95597y(bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: Jw */
    public final void m52758Jw(C17391f fVar) {
        this.f41848D = fVar;
        m52760Mw(C12497b.m47532b(m52756Fw(), (String) null, (String) null, (String) null, (C17108y) null, false, fVar.mo44917c(), (String) null, (CardAccountSelectorUiModel) null, (DebitCardCommissionUiModel) null, 479, (Object) null));
        if (fVar.mo44917c().mo44509a() == C17081e0.SMS) {
            C12497b Fw = m52756Fw();
            C17386a aVar = this.f41847C;
            if (aVar == null) {
                C41536l.m120506z("resources");
                aVar = null;
            }
            m52760Mw(C12497b.m47532b(Fw, (String) null, (String) null, (String) null, (C17108y) null, false, (C17107x) null, (String) C41358y.m120009Y(aVar.mo44894a()), (CardAccountSelectorUiModel) null, (DebitCardCommissionUiModel) null, 447, (Object) null));
        }
        this.f41852H.onNext(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public final void m52759Kw() {
        this.f41874v.mo4823o(m52756Fw());
    }

    /* access modifiers changed from: private */
    /* renamed from: Mw */
    public final void m52760Mw(C12497b bVar) {
        this.f41846B.setValue(this, f41844L[0], bVar);
    }

    /* renamed from: Nw */
    private final void m52761Nw() {
        C40749p L0 = this.f41854J.mo94989L0(new C12541i(new C14246d(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f41876x));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ow */
    public static final C40754t m52762Ow(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Pw */
    private final void m52763Pw() {
        C40749p L0 = this.f41852H.mo94989L0(new C12525f(new C14249e(this)));
        C41536l.m120488h(L0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f41870r));
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final C40754t m52764Qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Rw */
    private final void m52765Rw() {
        C40749p L0 = this.f41855K.mo94989L0(new C12512e(new C14252f(this)));
        C41536l.m120488h(L0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f41877y));
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final C40754t m52766Sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Tw */
    private final void m52767Tw() {
        C40749p L0 = this.f41853I.mo94989L0(new C12535h(new C14255g(this)));
        C41536l.m120488h(L0, "private fun subscribeToR…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f41875w));
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final C40754t m52768Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Vw */
    private final void m52769Vw() {
        C40749p L0 = this.f41851G.mo94989L0(new C12530g(new C14258h(this)));
        C41536l.m120488h(L0, "private fun subscribeToV…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f41867o));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final C40754t m52770Ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public final InstantCardActivationResultUiModel m52771Xw(C17387b bVar) {
        String str;
        C17085g0 g0Var;
        long a = bVar.mo44899a();
        ArrayList arrayList = new ArrayList();
        C17391f fVar = this.f41848D;
        if (fVar != null) {
            arrayList.add(C41233s.m119492a(C32343x.m95388F("text.accounts.card", new Object[0]), C32343x.m95388F("text.cards." + fVar.mo44916b(), new Object[0])));
            String F = C32343x.m95388F("text.activate.iic.card.account.type", new Object[0]);
            C17108y i = m52756Fw().mo33112i();
            C17081e0 e0Var = null;
            if (i != null) {
                str = i.mo44516a();
            } else {
                str = null;
            }
            arrayList.add(C41233s.m119492a(F, C32343x.m95388F(str, new Object[0])));
            CardAccountSelectorUiModel f = m52756Fw().mo33108f();
            if (f != null) {
                C17108y i2 = m52756Fw().mo33112i();
                if (i2 != null) {
                    g0Var = i2.mo44517b();
                } else {
                    g0Var = null;
                }
                if (g0Var == C17085g0.EXISTING_ACCOUNT) {
                    arrayList.add(C41233s.m119492a(C32343x.m95452h0(C12490g.f37226a, new Object[0]), f.mo84204b()));
                }
            }
            C17107x h = m52756Fw().mo33110h();
            if (h != null) {
                e0Var = h.mo44509a();
            }
            if (e0Var == C17081e0.SMS) {
                String h0 = C32343x.m95452h0(C12490g.phone_number_for_pin_acceptance, new Object[0]);
                String g = m52756Fw().mo33109g();
                if (g == null) {
                    g = "";
                }
                arrayList.add(C41233s.m119492a(h0, g));
            }
        }
        C41238w wVar = C41238w.f97225a;
        return new InstantCardActivationResultUiModel(a, arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final C40754t m52778jw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Bk */
    public void mo39966Bk(CardAccountSelectorUiModel cardAccountSelectorUiModel) {
        C41536l.m120489i(cardAccountSelectorUiModel, "account");
        m52760Mw(C12497b.m47532b(m52756Fw(), (String) null, (String) null, (String) null, (C17108y) null, false, (C17107x) null, (String) null, cardAccountSelectorUiModel, (DebitCardCommissionUiModel) null, 383, (Object) null));
    }

    /* renamed from: E1 */
    public void mo33097E1() {
        long j;
        C1644x xVar = this.f41873u;
        List list = this.f41849E;
        CardAccountSelectorUiModel f = m52756Fw().mo33108f();
        if (f != null) {
            j = f.mo84203a();
        } else {
            j = -1;
        }
        C37224b.m109965d(xVar, new CardAccountSelectorData(list, Long.valueOf(j)));
    }

    /* renamed from: Hw */
    public final C12491a mo39967Hw() {
        return this.f41865m;
    }

    /* renamed from: Iw */
    public final C12502c mo39968Iw() {
        return this.f41866n;
    }

    /* renamed from: K4 */
    public void mo33098K4() {
        C1644x xVar = this.f41871s;
        C17386a aVar = this.f41847C;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        C37224b.m109965d(xVar, aVar.mo44894a());
    }

    /* renamed from: Kn */
    public LiveData mo33115Kn() {
        return this.f41878z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: nm.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: nm.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: nm.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: nm.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Lw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39969Lw(p537nm.C17085g0 r22) {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            java.lang.String r1 = "regType"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            en.b r9 = r21.m52756Fw()
            r10 = 0
            r11 = 0
            r12 = 0
            pm.a r1 = r8.f41847C
            r2 = 0
            if (r1 != 0) goto L_0x001b
            java.lang.String r1 = "resources"
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r1 = r2
        L_0x001b:
            java.util.List r1 = r1.mo44895b()
            java.util.Iterator r1 = r1.iterator()
        L_0x0023:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x003d
            java.lang.Object r3 = r1.next()
            r5 = r3
            nm.y r5 = (p537nm.C17108y) r5
            nm.g0 r5 = r5.mo44517b()
            if (r5 != r0) goto L_0x0039
            r5 = r4
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            if (r5 == 0) goto L_0x0023
            r2 = r3
        L_0x003d:
            r13 = r2
            nm.y r13 = (p537nm.C17108y) r13
            java.util.List r1 = r8.f41849E
            boolean r1 = r1.isEmpty()
            r14 = r1 ^ 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 487(0x1e7, float:6.82E-43)
            r20 = 0
            en.b r1 = p412en.C12497b.m47532b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r8.m52760Mw(r1)
            pm.f r1 = r8.f41848D
            if (r1 == 0) goto L_0x0063
            ee1.b r1 = r8.f41854J
            r1.onNext(r0)
        L_0x0063:
            nm.g0 r1 = p537nm.C17085g0.NEW_ACCOUNT
            java.lang.String r2 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r0 != r1) goto L_0x008e
            java.lang.String r1 = "Instant_Delivery"
            ck.h$c r0 = p380ck.C10464h.C10467c.NEW
            java.lang.String r0 = r0.name()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r0.toLowerCase(r3)
            kotlin.jvm.internal.C41536l.m120488h(r3, r2)
            java.lang.String r4 = "choose_account_type"
            ck.h$a r5 = p380ck.C10464h.C10465a.FIREBASE
            r6 = 0
            r7 = 16
            r9 = 0
            r0 = r21
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            g91.C32343x.m95397J0(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00b2
        L_0x008e:
            java.lang.String r1 = "Instant_Delivery"
            ck.h$c r0 = p380ck.C10464h.C10467c.EXISTING
            java.lang.String r0 = r0.name()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r0.toLowerCase(r3)
            kotlin.jvm.internal.C41536l.m120488h(r3, r2)
            java.lang.String r4 = "choose_account_type"
            ck.h$a r5 = p380ck.C10464h.C10465a.FIREBASE
            r6 = 0
            r7 = 16
            r9 = 0
            r0 = r21
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            g91.C32343x.m95397J0(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cardapplications.presentation.viewmodel.ActivateInstantCardViewModel$ViewModel.mo39969Lw(nm.g0):void");
    }

    /* renamed from: Mn */
    public void mo33099Mn() {
        this.f41855K.onNext(C41238w.f97225a);
    }

    /* renamed from: N4 */
    public LiveData mo33116N4() {
        return this.f41875w;
    }

    /* renamed from: Re */
    public LiveData mo33117Re() {
        return this.f41876x;
    }

    /* renamed from: Ro */
    public LiveData mo33118Ro() {
        return this.f41872t;
    }

    /* renamed from: Sb */
    public void mo33100Sb() {
        C1644x xVar = this.f41872t;
        C17386a aVar = this.f41847C;
        if (aVar == null) {
            C41536l.m120506z("resources");
            aVar = null;
        }
        C37224b.m109965d(xVar, aVar.mo44895b());
    }

    /* renamed from: Sp */
    public LiveData mo33119Sp() {
        return this.f41867o;
    }

    /* renamed from: V3 */
    public void mo33101V3() {
        if (m52756Fw().mo33113j()) {
            this.f41853I.onNext(C41238w.f97225a);
        }
    }

    /* renamed from: Yw */
    public void mo39970Yw(String str) {
        C41536l.m120489i(str, "number");
        m52760Mw(C12497b.m47532b(m52756Fw(), (String) null, (String) null, (String) null, (C17108y) null, false, (C17107x) null, str, (CardAccountSelectorUiModel) null, (DebitCardCommissionUiModel) null, 447, (Object) null));
    }

    /* renamed from: a5 */
    public LiveData mo33120a5() {
        return this.f41869q;
    }

    /* renamed from: f */
    public LiveData mo33121f() {
        return this.f41874v;
    }

    /* renamed from: g */
    public LiveData mo33122g() {
        return this.f41870r;
    }

    /* renamed from: k */
    public LiveData mo33123k() {
        return this.f41845A;
    }

    /* renamed from: mh */
    public void mo33102mh(String str, String str2, String str3) {
        C41536l.m120489i(str, "pan");
        String str4 = str2;
        C41536l.m120489i(str4, "cvv");
        String str5 = str3;
        C41536l.m120489i(str5, "expDate");
        m52760Mw(C12497b.m47532b(m52756Fw(), str, str4, str5, (C17108y) null, false, (C17107x) null, (String) null, (CardAccountSelectorUiModel) null, (DebitCardCommissionUiModel) null, 504, (Object) null));
        this.f41851G.onNext(C41238w.f97225a);
    }

    /* renamed from: nm */
    public LiveData mo33124nm() {
        return this.f41871s;
    }

    /* renamed from: q2 */
    public LiveData mo33125q2() {
        return this.f41873u;
    }
}
