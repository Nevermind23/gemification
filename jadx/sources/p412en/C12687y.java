package p412en;

import af1.C40303i;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import b41.C31132b;
import ba1.C10146d0;
import c41.C31270e;
import e41.C31658b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import hd0.C24978b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import m41.C37224b;
import o31.C37614q;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardBenefitUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardTextsUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p355an.C10092j;
import p369bn.C10337a;
import p369bn.C10339c;
import p380ck.C10463g;
import p411em.C12487d;
import p523mm.C16726b;
import p523mm.C16753k;
import p523mm.C16795y;
import p537nm.C17071b;
import p537nm.C17078d0;
import p537nm.C17085g0;
import p537nm.C17097n;
import p537nm.C17103t;
import p537nm.C17105v;
import p579qm.C17537a;
import p674xm.C18784b;
import p674xm.C18797e;
import p674xm.C18799g;
import p674xm.C18812n;
import p674xm.C18836t;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: en.y */
public final class C12687y extends C21481a implements C12610q, C12615r {

    /* renamed from: F */
    static final /* synthetic */ C40303i[] f37544F = {C41520a0.m120439e(new C41539o(C12687y.class, "currentCard", "getCurrentCard()Lge/bog/mobilebank/cardapplications/presentation/model/ordercard/OrderCardListItem;", 0))};

    /* renamed from: A */
    private final C1644x f37545A;

    /* renamed from: B */
    private final C1644x f37546B;

    /* renamed from: C */
    private final C1644x f37547C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final C1644x f37548D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C1639v f37549E;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16795y f37550d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10092j f37551e;

    /* renamed from: f */
    private final C16753k f37552f;

    /* renamed from: g */
    private final C31658b f37553g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C16726b f37554h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final CardApplicationTypeData f37555i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final List f37556j;

    /* renamed from: k */
    private final boolean f37557k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f37558l;

    /* renamed from: m */
    private final C12610q f37559m = this;

    /* renamed from: n */
    private final C12615r f37560n = this;

    /* renamed from: o */
    private final C40767b f37561o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C40767b f37562p;

    /* renamed from: q */
    private final C40767b f37563q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final HashMap f37564r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final ArrayList f37565s;

    /* renamed from: t */
    private final C41555e f37566t;

    /* renamed from: u */
    private final C1644x f37567u;

    /* renamed from: v */
    private final C1644x f37568v;

    /* renamed from: w */
    private final C1644x f37569w;

    /* renamed from: x */
    private final C1644x f37570x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C1644x f37571y;

    /* renamed from: z */
    private final LiveData f37572z;

    /* renamed from: en.y$a */
    public /* synthetic */ class C12688a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37573a;

        static {
            int[] iArr = new int[C17078d0.values().length];
            try {
                iArr[C17078d0.PLASTIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f37573a = iArr;
        }
    }

    /* renamed from: en.y$b */
    static final class C12689b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12687y f37574d;

        /* renamed from: e */
        final /* synthetic */ C17537a f37575e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12689b(C12687y yVar, C17537a aVar) {
            super(1);
            this.f37574d = yVar;
            this.f37575e = aVar;
        }

        /* renamed from: a */
        public final void mo33358a(C17103t tVar) {
            HashMap ow = this.f37574d.f37564r;
            C17537a aVar = this.f37575e;
            C41536l.m120488h(tVar, "it");
            ow.put(aVar, tVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo33358a((C17103t) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: en.y$c */
    static final class C12690c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12690c f37576d = new C12690c();

        C12690c() {
            super(1);
        }

        /* renamed from: a */
        public final C18812n invoke(C31128a aVar) {
            C18812n nVar;
            C31128a.C31131c cVar = aVar instanceof C31128a.C31131c ? (C31128a.C31131c) aVar : null;
            return (cVar == null || (nVar = (C18812n) cVar.mo71340a()) == null) ? new C18812n((String) null, (String) null, false, 7, (DefaultConstructorMarker) null) : nVar;
        }
    }

    /* renamed from: en.y$d */
    static final class C12691d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12687y f37577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12691d(C12687y yVar) {
            super(1);
            this.f37577d = yVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C18812n nVar;
            C31128a aVar = (C31128a) this.f37577d.f37571y.mo4814f();
            if (aVar == null || (nVar = (C18812n) aVar.mo71340a()) == null) {
                nVar = new C18812n((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
            }
            C1639v xw = this.f37577d.f37549E;
            C41536l.m120488h(bool, "it");
            xw.mo4823o(new C18836t(nVar, bool.booleanValue()));
        }
    }

    /* renamed from: en.y$e */
    public static final class C12692e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C12687y f37578a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12692e(Object obj, C12687y yVar) {
            super(obj);
            this.f37578a = yVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C10339c cVar = (C10339c) obj2;
            C10339c cVar2 = (C10339c) obj;
            if (cVar != null) {
                this.f37578a.mo33289Ek().mo4823o(cVar);
                this.f37578a.m48170hx(cVar);
                C40767b vw = this.f37578a.f37562p;
                C12687y yVar = this.f37578a;
                C10339c sw = yVar.m48148Kw();
                C41536l.m120486f(sw);
                C17537a nw = yVar.m48147Gw(sw);
                C24978b b = C24978b.m79846b(Boolean.valueOf(cVar.mo26944f()));
                C41536l.m120488h(b, "fromBoolean(it.isDigital)");
                vw.onNext(C17537a.m61067b(nw, (String) null, (C17085g0) null, b, (C24978b) null, (Long) null, (String) null, 59, (Object) null));
                this.f37578a.mo33291e7().mo4823o(this.f37578a.m48143Cw(cVar));
            }
        }
    }

    /* renamed from: en.y$f */
    static final class C12693f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12687y f37579d;

        /* renamed from: en.y$f$a */
        static final class C12694a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C10339c f37580d;

            /* renamed from: e */
            final /* synthetic */ C12687y f37581e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12694a(C10339c cVar, C12687y yVar) {
                super(1);
                this.f37580d = cVar;
                this.f37581e = yVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Boolean) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Boolean bool) {
                OrderDebitCardData orderDebitCardData = new OrderDebitCardData(this.f37580d.mo26940c().getSubProductCode(), this.f37580d.mo26944f(), this.f37581e.f37558l, this.f37581e.f37555i, C10146d0.C10177h.m37232a(), this.f37580d.mo26940c().getProduct());
                C41536l.m120488h(bool, "canDeliverInstantly");
                C37224b.m109965d(bool.booleanValue() ? this.f37581e.mo33293l8() : this.f37581e.mo33290ai(), orderDebitCardData);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12693f(C12687y yVar) {
            super(1);
            this.f37579d = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final Boolean m48213d(Throwable th) {
            C41536l.m120489i(th, "it");
            return Boolean.FALSE;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m48214e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C10339c cVar) {
            C40762x xVar;
            C41536l.m120489i(cVar, "card");
            if (cVar.mo26944f() || this.f37579d.f37555i.mo39288d() != C17071b.STANDARD) {
                xVar = C40762x.m118162z(Boolean.FALSE);
            } else {
                xVar = this.f37579d.f37554h.mo43856a(cVar.mo26940c().getProduct());
            }
            C40762x m = xVar.mo95065D(new C12710z()).mo95084m(new C12492a0(new C12694a(cVar, this.f37579d)));
            C41536l.m120488h(m, "private fun subscribeToC…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, -1);
        }
    }

    /* renamed from: en.y$g */
    static final class C12695g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12687y f37582d;

        /* renamed from: en.y$g$a */
        static final class C12696a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12687y f37583d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12696a(C12687y yVar) {
                super(1);
                this.f37583d = yVar;
            }

            /* renamed from: a */
            public final C18812n invoke(C17103t tVar) {
                C41536l.m120489i(tVar, "wrapper");
                return this.f37583d.m48168gx(tVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12695g(C12687y yVar) {
            super(1);
            this.f37582d = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C18812n m48217c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C18812n) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(C17537a aVar) {
            C41536l.m120489i(aVar, "it");
            C40762x A = this.f37582d.m48144Dw(aVar).mo95062A(new C12498b0(new C12696a(this.f37582d)));
            C41536l.m120488h(A, "private fun subscribeToI…\n            }\n\n        }");
            return C31270e.m92880i(A, -1);
        }
    }

    /* renamed from: en.y$h */
    static final class C12697h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12687y f37584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12697h(C12687y yVar) {
            super(1);
            this.f37584d = yVar;
        }

        /* renamed from: a */
        public final void mo33365a(C31128a aVar) {
            C18812n nVar;
            Boolean bool = (Boolean) this.f37584d.f37548D.mo4814f();
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            C1639v xw = this.f37584d.f37549E;
            C31128a aVar2 = (C31128a) this.f37584d.f37571y.mo4814f();
            if (aVar2 == null || (nVar = (C18812n) aVar2.mo71340a()) == null) {
                nVar = new C18812n((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
            }
            xw.mo4823o(new C18836t(nVar, booleanValue));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo33365a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: en.y$i */
    static final class C12698i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12687y f37585d;

        /* renamed from: en.y$i$a */
        static final class C12699a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12687y f37586d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12699a(C12687y yVar) {
                super(1);
                this.f37586d = yVar;
            }

            /* renamed from: a */
            public final C18797e invoke(List list) {
                CardApplicationTypeData.StandardCardData standardCardData;
                C41536l.m120489i(list, "it");
                C12687y yVar = this.f37586d;
                Iterator it = list.iterator();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    String J = ((C17097n) it.next()).mo44417J();
                    CardApplicationTypeData mw = yVar.f37555i;
                    String str = null;
                    if (mw instanceof CardApplicationTypeData.StandardCardData) {
                        standardCardData = (CardApplicationTypeData.StandardCardData) mw;
                    } else {
                        standardCardData = null;
                    }
                    if (standardCardData != null) {
                        str = standardCardData.mo39330i();
                    }
                    if (C41536l.m120484d(J, str)) {
                        break;
                    }
                    i2++;
                }
                C12687y yVar2 = this.f37586d;
                C10092j tw = yVar2.f37551e;
                ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(tw.mo26559e((C17097n) it2.next()));
                }
                List lw = yVar2.m48146Fw(arrayList);
                if (i2 != -1) {
                    i = i2;
                }
                return new C18797e(lw, i);
            }
        }

        /* renamed from: en.y$i$b */
        static final class C12700b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12687y f37587d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12700b(C12687y yVar) {
                super(1);
                this.f37587d = yVar;
            }

            /* renamed from: a */
            public final void mo33368a(C18797e eVar) {
                boolean z;
                Object obj;
                String subProductCode = ((DebitCardUiModel) eVar.mo46619a().get(eVar.mo46620b())).getSubProductCode();
                ArrayList arrayList = new ArrayList();
                List qw = this.f37587d.f37556j;
                if (qw == null || qw.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.addAll(eVar.mo46619a());
                } else {
                    for (String str : this.f37587d.f37556j) {
                        Iterator it = eVar.mo46619a().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (C41536l.m120484d(((DebitCardUiModel) obj).getSubProductCode(), str)) {
                                break;
                            }
                        }
                        C37614q.m110615a(arrayList, obj);
                    }
                }
                C32343x.m95475p(this.f37587d.f37565s, arrayList);
                C1644x Mw = this.f37587d.mo33292ig();
                Iterator it2 = arrayList.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (C41536l.m120484d(((DebitCardUiModel) it2.next()).getSubProductCode(), subProductCode)) {
                        break;
                    } else {
                        i++;
                    }
                }
                Mw.mo4823o(new C31128a.C31131c(new C18797e(arrayList, i), 0, 2, (DefaultConstructorMarker) null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33368a((C18797e) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12698i(C12687y yVar) {
            super(1);
            this.f37585d = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final C18797e m48223d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C18797e) lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m48224e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            CardApplicationTypeData.StudentCardOrderData studentCardOrderData;
            ArrayList arrayList;
            boolean z;
            CardApplicationTypeData.PayRollCardOrderData payRollCardOrderData;
            Long l;
            Long l2;
            Boolean bool;
            RecoverCardUiModel i;
            RecoverCardUiModel i2;
            RecoverCardUiModel i3;
            List<RegionUiModel> i4;
            C41536l.m120489i(num, "rc");
            C16795y uw = this.f37585d.f37550d;
            CardApplicationTypeData mw = this.f37585d.f37555i;
            Boolean bool2 = null;
            if (mw instanceof CardApplicationTypeData.StudentCardOrderData) {
                studentCardOrderData = (CardApplicationTypeData.StudentCardOrderData) mw;
            } else {
                studentCardOrderData = null;
            }
            if (studentCardOrderData == null || (i4 = studentCardOrderData.mo39340i()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C41343r.m119925u(i4, 10));
                for (RegionUiModel b : i4) {
                    arrayList.add(b.mo39835b());
                }
            }
            if (this.f37585d.f37555i.mo39288d() == C17071b.PAYROLL) {
                z = true;
            } else {
                z = false;
            }
            CardApplicationTypeData mw2 = this.f37585d.f37555i;
            if (mw2 instanceof CardApplicationTypeData.PayRollCardOrderData) {
                payRollCardOrderData = (CardApplicationTypeData.PayRollCardOrderData) mw2;
            } else {
                payRollCardOrderData = null;
            }
            if (payRollCardOrderData != null) {
                l = Long.valueOf(payRollCardOrderData.mo39297j());
            } else {
                l = null;
            }
            CardApplicationTypeData.RecoverCardOrderData a = this.f37585d.f37555i.mo39286a();
            if (a == null || (i3 = a.mo39308i()) == null) {
                l2 = null;
            } else {
                l2 = Long.valueOf(i3.mo39815e());
            }
            CardApplicationTypeData.RecoverCardOrderData a2 = this.f37585d.f37555i.mo39286a();
            if (a2 == null || (i2 = a2.mo39308i()) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(i2.mo39819h());
            }
            CardApplicationTypeData.RecoverCardOrderData a3 = this.f37585d.f37555i.mo39286a();
            if (!(a3 == null || (i = a3.mo39308i()) == null)) {
                bool2 = Boolean.valueOf(i.mo39825m());
            }
            C40762x m = uw.mo43915a(arrayList, z, l, l2, bool, bool2, this.f37585d.f37555i instanceof CardApplicationTypeData.WishCardData).mo95062A(new C12503c0(new C12699a(this.f37585d))).mo95084m(new C12508d0(new C12700b(this.f37585d)));
            C41536l.m120488h(m, "private fun subscribeToI…ndToLifecycle()\n        }");
            return C31270e.m92880i(m, num.intValue());
        }
    }

    /* renamed from: en.y$j */
    static final class C12701j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12687y f37588d;

        /* renamed from: en.y$j$a */
        static final class C12702a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12687y f37589d;

            /* renamed from: e */
            final /* synthetic */ C31128a f37590e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12702a(C12687y yVar, C31128a aVar) {
                super(1);
                this.f37589d = yVar;
                this.f37590e = aVar;
            }

            /* renamed from: a */
            public final void mo33370a(C18797e eVar) {
                this.f37589d.mo33292ig().mo4823o(this.f37590e);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33370a((C18797e) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: en.y$j$b */
        static final class C12703b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C12687y f37591d;

            /* renamed from: e */
            final /* synthetic */ C31128a f37592e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12703b(C12687y yVar, C31128a aVar) {
                super(2);
                this.f37591d = yVar;
                this.f37592e = aVar;
            }

            /* renamed from: a */
            public final void mo33371a(Throwable th, C18797e eVar) {
                C41536l.m120489i(th, "<anonymous parameter 0>");
                this.f37591d.mo33292ig().mo4823o(this.f37592e);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo33371a((Throwable) obj, (C18797e) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12701j(C12687y yVar) {
            super(1);
            this.f37588d = yVar;
        }

        /* renamed from: a */
        public final void mo33369a(C31128a aVar) {
            C41536l.m120488h(aVar, "data");
            C31132b.m92646h(aVar, (int[]) null, new C12702a(this.f37588d, aVar), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C12703b(this.f37588d, aVar), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo33369a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: en.y$k */
    static final class C12704k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12687y f37593d;

        /* renamed from: en.y$k$a */
        static final class C12705a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C17537a f37594d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12705a(C17537a aVar) {
                super(2);
                this.f37594d = aVar;
            }

            /* renamed from: a */
            public final C17105v invoke(C17103t tVar, C17103t tVar2) {
                C41536l.m120489i(tVar, "plasticFee");
                C41536l.m120489i(tVar2, "digitalFee");
                return new C17105v(tVar, tVar2, this.f37594d.mo45055c());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12704k(C12687y yVar) {
            super(1);
            this.f37593d = yVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C17105v m48232c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C17105v) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(C17537a aVar) {
            C41536l.m120489i(aVar, "params");
            C40762x T = C40762x.m118154T(this.f37593d.m48144Dw(C17537a.m61067b(aVar, (String) null, (C17085g0) null, C24978b.NO, (C24978b) null, (Long) null, (String) null, 59, (Object) null)), this.f37593d.m48144Dw(C17537a.m61067b(aVar, (String) null, (C17085g0) null, C24978b.YES, (C24978b) null, (Long) null, (String) null, 59, (Object) null)), new C12513e0(new C12705a(aVar)));
            C41536l.m120488h(T, "params ->\n              ….orgId)\n                }");
            return C31270e.m92880i(T, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12687y(C16795y yVar, C10092j jVar, C16753k kVar, C31658b bVar, C16726b bVar2, CardApplicationTypeData cardApplicationTypeData, List list, boolean z, boolean z2) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(yVar, "getDebitCards");
        C41536l.m120489i(jVar, "debitCardMapper");
        C41536l.m120489i(kVar, "getCardFee");
        C41536l.m120489i(bVar, "startTMXProfilingUseCase");
        C41536l.m120489i(bVar2, "checkInstantCardDelivery");
        C41536l.m120489i(cardApplicationTypeData, "appTypeData");
        this.f37550d = yVar;
        this.f37551e = jVar;
        this.f37552f = kVar;
        this.f37553g = bVar;
        this.f37554h = bVar2;
        this.f37555i = cardApplicationTypeData;
        this.f37556j = list;
        this.f37557k = z;
        this.f37558l = z2;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<CardFeeParams>()");
        this.f37561o = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<CardFeeParams>()");
        this.f37562p = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<OrderCardListItem>()");
        this.f37563q = h13;
        this.f37564r = new HashMap();
        this.f37565s = new ArrayList();
        C41551a aVar = C41551a.f97718a;
        this.f37566t = new C12692e((Object) null, this);
        this.f37567u = new C1644x();
        this.f37568v = new C1644x();
        this.f37569w = new C1644x();
        this.f37570x = new C1644x();
        C1644x xVar = new C1644x();
        this.f37571y = xVar;
        this.f37572z = C1607m0.m5655c(xVar, C12690c.f37576d);
        this.f37545A = new C1644x();
        this.f37546B = new C1644x();
        this.f37547C = new C1644x();
        this.f37548D = new C1644x();
        this.f37549E = new C1639v();
        m48158ax();
        m48162dx();
        m48156Yw();
        m48154Ww();
        m48153Vw();
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public final List m48143Cw(C10339c cVar) {
        DebitCardTextsUiModel debitCardTextsUiModel;
        StringSource.Dictionary dictionary;
        int i;
        String b;
        List c = C41339p.m119898c();
        DebitCardUiModel c2 = cVar.mo26940c();
        if (cVar.mo26944f()) {
            debitCardTextsUiModel = c2.getTexts().mo39614a();
        } else {
            debitCardTextsUiModel = c2.getTexts().mo39615b();
        }
        if (!(debitCardTextsUiModel == null || (b = debitCardTextsUiModel.mo39626b()) == null)) {
            c.add(new C18799g.C18802c(C34646b.m101748b("text.card.applications.card.expiration.term", new Object[0]), C34646b.m101749c(b), C12487d.f37164l));
        }
        String detailsUrl = c2.getDetailsUrl();
        if (detailsUrl != null) {
            c.add(new C18799g.C18800a(C34646b.m101748b("text.card.applications.card.other.terms", new Object[0]), C34646b.m101749c(detailsUrl), C12487d.f37170s));
        }
        List<String> cardAdditionalParams = c2.getCardAdditionalParams();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(cardAdditionalParams, 10));
        for (String b2 : cardAdditionalParams) {
            arrayList.add(new C18799g.C18801b(C34646b.m101748b(b2, new Object[0]), 0, 2, (DefaultConstructorMarker) null));
        }
        c.addAll(arrayList);
        for (CardBenefitUiModel cardBenefitUiModel : c2.getCardBenefits()) {
            String a = cardBenefitUiModel.mo39378a();
            if (C41536l.m120484d(a, "TRAVEL_ADVANTAGES")) {
                dictionary = C34646b.m101748b("cards.applications.travel.advantages", new Object[0]);
            } else if (C41536l.m120484d(a, "SHOPPING_ADVANTAGES")) {
                dictionary = C34646b.m101748b("cards.applications.shopping.advantages", new Object[0]);
            } else {
                throw new IllegalArgumentException("Illegal type");
            }
            StringSource.Raw c3 = C34646b.m101749c(cardBenefitUiModel.mo39379b());
            String a2 = cardBenefitUiModel.mo39378a();
            if (C41536l.m120484d(a2, "TRAVEL_ADVANTAGES")) {
                i = C12487d.f37167p;
            } else if (C41536l.m120484d(a2, "SHOPPING_ADVANTAGES")) {
                i = C12487d.f37166o;
            } else {
                i = C12487d.f37170s;
            }
            c.add(new C18799g.C18800a(dictionary, c3, i));
        }
        return C41339p.m119896a(c);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final C40762x m48144Dw(C17537a aVar) {
        C40762x xVar;
        C17103t tVar = (C17103t) this.f37564r.get(aVar);
        if (tVar == null || (xVar = C40762x.m118162z(tVar)) == null) {
            xVar = this.f37552f.mo43877c(aVar);
        }
        C40762x m = xVar.mo95084m(new C12654s(new C12689b(this, aVar)));
        C41536l.m120488h(m, "private fun fetchCardFee…dFeesCache[params] = it }");
        return m;
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public static final void m48145Ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        if (r2 != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if (r2.isStudentCard() == false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0009 A[SYNTHETIC] */
    /* renamed from: Fw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List m48146Fw(java.util.Collection r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0009:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x008c
            java.lang.Object r1 = r10.next()
            r2 = r1
            ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel r2 = (p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel) r2
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r3 = r9.f37555i
            boolean r4 = r3 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.StandardCardData
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x002b
            boolean r3 = r2.getPlcSchoolFlag()
            if (r3 != 0) goto L_0x0085
            boolean r2 = r2.isStudentCard()
            if (r2 != 0) goto L_0x0085
            goto L_0x002f
        L_0x002b:
            boolean r4 = r3 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.PayRollCardOrderData
            if (r4 == 0) goto L_0x0031
        L_0x002f:
            r5 = r6
            goto L_0x0085
        L_0x0031:
            boolean r4 = r3 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.StudentCardOrderData
            if (r4 == 0) goto L_0x003a
            boolean r5 = r2.isStudentCard()
            goto L_0x0085
        L_0x003a:
            boolean r4 = r3 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.SchoolCardOrderData
            if (r4 == 0) goto L_0x007d
            boolean r3 = r2.getPlcSchoolFlag()
            if (r3 == 0) goto L_0x0085
            java.util.List r2 = r2.getClientChildren()
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0054
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0054
        L_0x0052:
            r2 = r5
            goto L_0x007a
        L_0x0054:
            java.util.Iterator r2 = r2.iterator()
        L_0x0058:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0052
            java.lang.Object r3 = r2.next()
            ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel r3 = (p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel) r3
            long r3 = r3.mo39856a()
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r7 = r9.f37555i
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$SchoolCardOrderData r7 = (p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.SchoolCardOrderData) r7
            long r7 = r7.mo39318i()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0076
            r3 = r6
            goto L_0x0077
        L_0x0076:
            r3 = r5
        L_0x0077:
            if (r3 == 0) goto L_0x0058
            r2 = r6
        L_0x007a:
            if (r2 == 0) goto L_0x0085
            goto L_0x002f
        L_0x007d:
            boolean r3 = r3 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.VisaConciergeCardOrderData
            if (r3 == 0) goto L_0x002f
            boolean r5 = r2.getHasConciergeFlag()
        L_0x0085:
            if (r5 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12687y.m48146Fw(java.util.Collection):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: Gw */
    public final C17537a m48147Gw(C10339c cVar) {
        CardApplicationTypeData.PayRollCardOrderData payRollCardOrderData;
        RecoverCardUiModel i;
        String product = cVar.mo26940c().getProduct();
        C17085g0 Rw = m48149Rw();
        C24978b b = C24978b.m79846b(Boolean.valueOf(cVar.mo26944f()));
        C41536l.m120488h(b, "fromBoolean(item.isDigital)");
        CardApplicationTypeData.RecoverCardOrderData a = this.f37555i.mo39286a();
        boolean z = false;
        if (!(a == null || (i = a.mo39308i()) == null || !i.mo39825m())) {
            z = true;
        }
        C24978b b2 = C24978b.m79846b(Boolean.valueOf(z));
        C41536l.m120488h(b2, "fromBoolean(appTypeData.…ard?.recoverFlag == true)");
        CardApplicationTypeData cardApplicationTypeData = this.f37555i;
        Long l = null;
        if (cardApplicationTypeData instanceof CardApplicationTypeData.PayRollCardOrderData) {
            payRollCardOrderData = (CardApplicationTypeData.PayRollCardOrderData) cardApplicationTypeData;
        } else {
            payRollCardOrderData = null;
        }
        if (payRollCardOrderData != null) {
            l = Long.valueOf(payRollCardOrderData.mo39297j());
        }
        return new C17537a(product, Rw, b, b2, l, (String) null, 32, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Kw */
    public final C10339c m48148Kw() {
        return (C10339c) this.f37566t.getValue(this, f37544F[0]);
    }

    /* renamed from: Rw */
    private final C17085g0 m48149Rw() {
        CardApplicationTypeData.PayRollCardOrderData payRollCardOrderData;
        if (this.f37555i.mo39290f()) {
            return C17085g0.EXISTING_ACCOUNT;
        }
        CardApplicationTypeData cardApplicationTypeData = this.f37555i;
        Long l = null;
        if (cardApplicationTypeData instanceof CardApplicationTypeData.PayRollCardOrderData) {
            payRollCardOrderData = (CardApplicationTypeData.PayRollCardOrderData) cardApplicationTypeData;
        } else {
            payRollCardOrderData = null;
        }
        if (payRollCardOrderData != null) {
            l = payRollCardOrderData.mo39296i();
        }
        if (l != null) {
            return C17085g0.EXISTING_ACCOUNT;
        }
        return C17085g0.NEW_ACCOUNT;
    }

    /* renamed from: Sw */
    private final void m48150Sw(C18784b bVar) {
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        bVar.mo46587c(F);
    }

    /* renamed from: Tw */
    private final void m48151Tw(C10339c cVar) {
        this.f37566t.setValue(this, f37544F[0], cVar);
    }

    /* renamed from: Uw */
    private final boolean m48152Uw(DebitCardUiModel debitCardUiModel) {
        if (this.f37557k) {
            return debitCardUiModel.hasDigitalCardFlag();
        }
        if (C12688a.f37573a[debitCardUiModel.getDefaultCard().ordinal()] != 1) {
            return debitCardUiModel.hasDigitalCardFlag();
        }
        if (!debitCardUiModel.hasCardLimitCheck()) {
            return true;
        }
        return false;
    }

    /* renamed from: Vw */
    private final void m48153Vw() {
        CardApplicationTypeData.StudentCardOrderData studentCardOrderData;
        List i;
        RegionUiModel regionUiModel;
        if (this.f37555i.mo39292h()) {
            CardApplicationTypeData cardApplicationTypeData = this.f37555i;
            if (cardApplicationTypeData instanceof CardApplicationTypeData.StudentCardOrderData) {
                studentCardOrderData = (CardApplicationTypeData.StudentCardOrderData) cardApplicationTypeData;
            } else {
                studentCardOrderData = null;
            }
            boolean z = false;
            if (!(studentCardOrderData == null || (i = studentCardOrderData.mo39340i()) == null || (regionUiModel = (RegionUiModel) C41358y.m120007W(i)) == null || !regionUiModel.mo39834a())) {
                z = true;
            }
            if (z) {
                this.f37548D.mo4823o(Boolean.TRUE);
            } else {
                this.f37548D.mo4823o(Boolean.FALSE);
            }
        }
        this.f37549E.mo4956s(this.f37548D, new C12526f0(new C12691d(this)));
    }

    /* renamed from: Ww */
    private final void m48154Ww() {
        C40749p L0 = this.f37563q.mo94989L0(new C12659t(new C12693f(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95462k1(L0), mo33294lo()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Xw */
    public static final C40754t m48155Xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Yw */
    private final void m48156Yw() {
        C40749p L0 = this.f37562p.mo94989L0(new C12682x(new C12695g(this)));
        C41536l.m120488h(L0, "private fun subscribeToI…\n            }\n\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f37571y));
        this.f37549E.mo4956s(this.f37571y, new C12526f0(new C12697h(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public static final C40754t m48157Zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: ax */
    private final void m48158ax() {
        C41205b F0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C12664u(new C12698i(this))).mo94981F0(new C12669v(new C12701j(this)));
        C41536l.m120488h(F0, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m48159bx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: cx */
    public static final C40754t m48160cx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: dx */
    private final void m48162dx() {
        C40749p L0 = this.f37561o.mo94989L0(new C12674w(new C12704k(this)));
        C41536l.m120488h(L0, "private fun subscribeToU…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo33288D5()));
    }

    /* access modifiers changed from: private */
    /* renamed from: ex */
    public static final C40754t m48164ex(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: fx */
    private final C10339c m48166fx(DebitCardUiModel debitCardUiModel, int i) {
        RecoverCardUiModel recoverCardUiModel;
        boolean z;
        CardApplicationTypeData.RecoverCardOrderData a = this.f37555i.mo39286a();
        RecoverCardUiModel recoverCardUiModel2 = null;
        if (a != null) {
            recoverCardUiModel = a.mo39308i();
        } else {
            recoverCardUiModel = null;
        }
        if (recoverCardUiModel != null) {
            z = recoverCardUiModel.mo39827q();
        } else {
            z = m48152Uw(debitCardUiModel);
        }
        if (recoverCardUiModel != null && C41536l.m120484d(recoverCardUiModel.mo39826p(), debitCardUiModel.getSubProductCode())) {
            recoverCardUiModel2 = recoverCardUiModel;
        }
        return new C10339c(debitCardUiModel, i, z, recoverCardUiModel2);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData] */
    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: gx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p674xm.C18812n m48168gx(p537nm.C17103t r8) {
        /*
            r7 = this;
            nm.s r0 = r8.mo44487a()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.mo44483e()
            if (r0 != r1) goto L_0x0010
            r0 = r1
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            if (r0 == 0) goto L_0x0057
            xm.n r0 = new xm.n
            java.lang.String r3 = "text.applications.debitcard.virtual.card.fee.label"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            nm.s r5 = r8.mo44487a()
            kotlin.jvm.internal.C41536l.m120486f(r5)
            double r5 = r5.mo44481c()
            java.lang.String r5 = g91.C32303f.m95204o(r5)
            java.lang.String r6 = "getFormattedNumber(fee.fee!!.packFeeAmount)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            r4[r2] = r5
            nm.s r8 = r8.mo44487a()
            kotlin.jvm.internal.C41536l.m120486f(r8)
            java.lang.String r8 = r8.mo44482d()
            java.lang.String r8 = g91.C32303f.m95197h(r8)
            java.lang.String r2 = "getCcyLogo(fee.fee!!.packFeeCcy)"
            kotlin.jvm.internal.C41536l.m120488h(r8, r2)
            r4[r1] = r8
            java.lang.String r8 = "text.applications.debitcard.package.registration.notification"
            java.lang.String r8 = g91.C32343x.m95388F(r8, r4)
            r0.<init>(r3, r8, r1)
            goto L_0x00d0
        L_0x0057:
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r8 = r7.f37555i
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData r8 = r8.mo39286a()
            if (r8 == 0) goto L_0x006d
            ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel r8 = r8.mo39308i()
            if (r8 == 0) goto L_0x006d
            boolean r8 = r8.mo39825m()
            if (r8 != r1) goto L_0x006d
            r8 = r1
            goto L_0x006e
        L_0x006d:
            r8 = r2
        L_0x006e:
            r0 = 0
            if (r8 == 0) goto L_0x00a1
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r8 = r7.f37555i
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$RecoverCardOrderData r8 = r8.mo39286a()
            if (r8 == 0) goto L_0x0083
            ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel r8 = r8.mo39308i()
            if (r8 == 0) goto L_0x0083
            java.lang.String r0 = r8.mo39822j()
        L_0x0083:
            java.lang.String r8 = java.lang.String.valueOf(r0)
            xm.n r0 = new xm.n
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r2] = r8
            java.lang.String r4 = "text.card.applications.recovery.info.title"
            java.lang.String r3 = g91.C32343x.m95388F(r4, r3)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r8
            java.lang.String r8 = "text.card.applications.recovery.info.message"
            java.lang.String r8 = g91.C32343x.m95388F(r8, r4)
            r0.<init>(r3, r8, r1)
            goto L_0x00d0
        L_0x00a1:
            xm.n r8 = new xm.n
            java.lang.String r3 = "text.card.applications.regional.infobox.title"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r4)
            java.lang.String r4 = "text.card.applications.regional.infobox.message"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r4 = g91.C32343x.m95388F(r4, r5)
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData r5 = r7.f37555i
            boolean r6 = r5 instanceof p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.SchoolCardOrderData
            if (r6 == 0) goto L_0x00bc
            r0 = r5
            ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData$SchoolCardOrderData r0 = (p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData.SchoolCardOrderData) r0
        L_0x00bc:
            if (r0 == 0) goto L_0x00cb
            ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardInfoUiModel r0 = r0.mo39320k()
            if (r0 == 0) goto L_0x00cb
            boolean r0 = r0.mo39846a()
            if (r0 != r1) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r1 = r2
        L_0x00cc:
            r8.<init>(r3, r4, r1)
            r0 = r8
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12687y.m48168gx(nm.t):xm.n");
    }

    /* access modifiers changed from: private */
    /* renamed from: hx */
    public final void m48170hx(C10339c cVar) {
        this.f37561o.onNext(m48147Gw(cVar));
    }

    /* renamed from: Bv */
    public C1639v mo33287Bv() {
        return this.f37549E;
    }

    /* renamed from: Fs */
    public void mo33284Fs() {
        bindToLifecycle(this.f37553g.mo72084b(TMXFlags.TMX_FLAG_CARD_APPLICATION_KEY));
        C10339c Kw = m48148Kw();
        if (Kw != null) {
            this.f37563q.onNext(Kw);
            m48150Sw(new C18784b.C18787c(Kw.mo26940c().getSubProductCode(), Kw.mo26944f()));
        }
    }

    /* renamed from: Hw */
    public C1644x mo33291e7() {
        return this.f37545A;
    }

    /* renamed from: Iw */
    public C1644x mo33294lo() {
        return this.f37546B;
    }

    /* renamed from: Jw */
    public C1644x mo33288D5() {
        return this.f37569w;
    }

    /* renamed from: Lw */
    public C1644x mo33289Ek() {
        return this.f37568v;
    }

    /* renamed from: Mw */
    public C1644x mo33292ig() {
        return this.f37567u;
    }

    /* renamed from: Nw */
    public final C12610q mo33354Nw() {
        return this.f37559m;
    }

    /* renamed from: Ow */
    public C1644x mo33293l8() {
        return this.f37547C;
    }

    /* renamed from: Pw */
    public C1644x mo33290ai() {
        return this.f37570x;
    }

    /* renamed from: Qw */
    public final C12615r mo33357Qw() {
        return this.f37560n;
    }

    /* renamed from: wu */
    public void mo33285wu(C10337a aVar) {
        boolean z;
        C41536l.m120489i(aVar, "cardBodyType");
        C10339c Kw = m48148Kw();
        if (Kw != null) {
            if (aVar == C10337a.DIGITAL) {
                z = true;
            } else {
                z = false;
            }
            m48151Tw(C10339c.m37619b(Kw, (DebitCardUiModel) null, 0, z, (RecoverCardUiModel) null, 11, (Object) null));
        }
    }

    /* renamed from: ym */
    public void mo33286ym(int i) {
        DebitCardUiModel debitCardUiModel = (DebitCardUiModel) C41358y.m120010Z(this.f37565s, i);
        if (debitCardUiModel != null) {
            m48151Tw(m48166fx(debitCardUiModel, i));
            m48150Sw(new C18784b.C18788d(debitCardUiModel.getSubProductCode()));
        }
    }
}
