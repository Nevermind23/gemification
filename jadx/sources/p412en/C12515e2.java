package p412en;

import af1.C40303i;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import cf1.C40407d;
import com.github.mikephil.charting.utils.Utils;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import g91.C32359z0;
import hd1.C41204a;
import he1.C41238w;
import j51.C36734f;
import java.util.ArrayList;
import java.util.List;
import k51.C36874b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41555e;
import ld0.C25950a;
import m41.C37224b;
import o31.C37591c;
import p341ge.bog.mobilebank.cardapplications.data.model.OrderCardPreContractParams;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardFeeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.FeedbackItem;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderCardResult;
import p341ge.bog.mobilebank.cardapplications.presentation.model.OrderDebitCardData;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RecoverCardUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.UserInfo;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p355an.C10092j;
import p355an.C10104u;
import p398dn.C12327b;
import p398dn.C12329c;
import p398dn.C12330d;
import p523mm.C16724a0;
import p523mm.C16730c;
import p523mm.C16736d0;
import p523mm.C16747i0;
import p537nm.C17102s;
import p537nm.C17103t;
import p551om.C17267c;
import p565pm.C17388c;
import p565pm.C17389d;
import p603si.C17799b;
import p702zm.C19072a;
import p702zm.C19073b;
import p702zm.C19074c;
import p702zm.C19079d;
import pc0.C27494a;
import ue1.C43075l;

/* renamed from: en.e2 */
public final class C12515e2 extends C21481a implements C12707y1, C12712z1 {

    /* renamed from: E */
    static final /* synthetic */ C40303i[] f37258E = {C41520a0.m120439e(new C41539o(C12515e2.class, "deliveryInput", "getDeliveryInput()Lge/bog/mobilebank/cardapplications/presentation/model/instantdelivery/InstantDeliveryInput;", 0))};

    /* renamed from: A */
    private final C1644x f37259A;

    /* renamed from: B */
    private final C1644x f37260B;

    /* renamed from: C */
    private final C41555e f37261C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Double f37262D;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C16747i0 f37263d;

    /* renamed from: e */
    private final C36734f f37264e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C16736d0 f37265f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C16730c f37266g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C16724a0 f37267h;

    /* renamed from: i */
    private final C10104u f37268i;

    /* renamed from: j */
    private final C10092j f37269j;

    /* renamed from: k */
    private final Client f37270k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C27494a f37271l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final OrderDebitCardData f37272m;

    /* renamed from: n */
    private final C12707y1 f37273n = this;

    /* renamed from: o */
    private final C12712z1 f37274o = this;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C19073b f37275p;

    /* renamed from: q */
    private final C40767b f37276q;

    /* renamed from: r */
    private final C40767b f37277r;

    /* renamed from: s */
    private final C40767b f37278s;

    /* renamed from: t */
    private final C1644x f37279t;

    /* renamed from: u */
    private final C1644x f37280u;

    /* renamed from: v */
    private final C1644x f37281v;

    /* renamed from: w */
    private final C1644x f37282w;

    /* renamed from: x */
    private final C1644x f37283x;

    /* renamed from: y */
    private final C1644x f37284y;

    /* renamed from: z */
    private final C1644x f37285z;

    /* renamed from: en.e2$a */
    /* synthetic */ class C12516a extends C41535k implements C43075l {
        C12516a(Object obj) {
            super(1, obj, C12515e2.class, "adjustNextButtonState", "adjustNextButtonState(Lge/bog/mobilebank/cardapplications/presentation/model/instantdelivery/InstantDeliveryInput;)V", 0);
        }

        /* renamed from: b */
        public final void mo33155b(C19079d dVar) {
            C41536l.m120489i(dVar, "p0");
            ((C12515e2) this.receiver).m47585ww(dVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo33155b((C19079d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: en.e2$b */
    static final class C12517b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12515e2 f37286d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12517b(C12515e2 e2Var) {
            super(1);
            this.f37286d = e2Var;
        }

        /* renamed from: a */
        public final C40754t invoke(C41238w wVar) {
            String str;
            C17389d b;
            C41536l.m120489i(wVar, "it");
            C16730c jw = this.f37286d.f37266g;
            String valueOf = String.valueOf(this.f37286d.m47553Bw().mo47284d().mo47275a());
            C19072a b2 = this.f37286d.m47553Bw().mo47283c().mo47271b();
            C19073b bVar = null;
            if (b2 == null || (b = b2.mo47257b()) == null) {
                str = null;
            } else {
                str = b.mo44910d();
            }
            String valueOf2 = String.valueOf(str);
            C19073b tw = this.f37286d.f37275p;
            if (tw == null) {
                C41536l.m120506z("resources");
            } else {
                bVar = tw;
            }
            C40762x g = C16730c.m59153b(jw, (String) null, valueOf, valueOf2, (String) null, bVar.mo47258a().getProduct(), this.f37286d.m47555Dw(), 1, (Object) null).mo94898g(C40762x.m118162z(this.f37286d.m47556Lw()));
            C41536l.m120488h(g, "createCardOrderAgreement…st(getOrderCardResult()))");
            return C31270e.m92880i(g, -1);
        }
    }

    /* renamed from: en.e2$c */
    static final class C12518c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12515e2 f37287d;

        /* renamed from: en.e2$c$a */
        static final class C12519a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12515e2 f37288d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12519a(C12515e2 e2Var) {
                super(1);
                this.f37288d = e2Var;
            }

            /* renamed from: a */
            public final void mo33158a(Double d) {
                this.f37288d.f37262D = d;
                C1644x Aw = this.f37288d.mo33153y0();
                C12515e2 e2Var = this.f37288d;
                C41536l.m120488h(d, "fee");
                Aw.mo4823o(e2Var.m47554Cw(d.doubleValue()));
                C12515e2 e2Var2 = this.f37288d;
                e2Var2.m47585ww(e2Var2.m47553Bw());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33158a((Double) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12518c(C12515e2 e2Var) {
            super(1);
            this.f37287d = e2Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m47619c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "pointValue");
            C40734b y = this.f37287d.f37265f.mo43865a(str).mo95084m(new C12528f2(new C12519a(this.f37287d))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToC…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, -1);
        }
    }

    /* renamed from: en.e2$d */
    static final class C12520d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12515e2 f37289d;

        /* renamed from: en.e2$d$a */
        static final class C12521a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C12515e2 f37290d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12521a(C12515e2 e2Var) {
                super(1);
                this.f37290d = e2Var;
            }

            /* renamed from: a */
            public final void mo33160a(C17388c cVar) {
                double d;
                C12515e2 e2Var = this.f37290d;
                C41536l.m120488h(cVar, "it");
                e2Var.f37275p = e2Var.m47587yw(cVar);
                C1644x Aw = this.f37290d.mo33153y0();
                String F = C32343x.m95388F("text.card.applications.card.fee", new Object[0]);
                C19073b tw = this.f37290d.f37275p;
                if (tw == null) {
                    C41536l.m120506z("resources");
                    tw = null;
                }
                C17102s a = tw.mo47262e().mo44487a();
                if (a != null) {
                    d = a.mo44479a();
                } else {
                    d = Utils.DOUBLE_EPSILON;
                }
                Aw.mo4823o(C41339p.m119900e(new CardFeeUiModel(F, d, "GEL")));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33160a((C17388c) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12520d(C12515e2 e2Var) {
            super(1);
            this.f37289d = e2Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m47623c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            CardApplicationTypeData.PayRollCardOrderData payRollCardOrderData;
            RecoverCardUiModel i;
            C41536l.m120489i(num, "rc");
            C16747i0 qw = this.f37289d.f37263d;
            String b = this.f37289d.f37272m.mo39781b();
            boolean i2 = this.f37289d.f37272m.mo39790i();
            CardApplicationTypeData a = this.f37289d.f37272m.mo39780a();
            Long l = null;
            if (a instanceof CardApplicationTypeData.PayRollCardOrderData) {
                payRollCardOrderData = (CardApplicationTypeData.PayRollCardOrderData) a;
            } else {
                payRollCardOrderData = null;
            }
            if (payRollCardOrderData != null) {
                l = Long.valueOf(payRollCardOrderData.mo39297j());
            }
            CardApplicationTypeData.RecoverCardOrderData a2 = this.f37289d.f37272m.mo39780a().mo39286a();
            boolean z = false;
            if (!(a2 == null || (i = a2.mo39308i()) == null || !i.mo39825m())) {
                z = true;
            }
            C40734b y = qw.mo43872d(b, i2, l, z).mo95084m(new C12533g2(new C12521a(this.f37289d))).mo95092y();
            C41536l.m120488h(y, "private fun subscribeToI…ndToLifecycle()\n        }");
            return C31270e.m92878g(y, num.intValue());
        }
    }

    /* renamed from: en.e2$e */
    static final class C12522e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C12515e2 f37291d;

        /* renamed from: en.e2$e$a */
        /* synthetic */ class C12523a extends C41535k implements C43075l {
            C12523a(Object obj) {
                super(1, obj, C37224b.class, "postEvent", "postEvent(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", 1);
            }

            /* renamed from: b */
            public final void mo33162b(C25950a aVar) {
                C41536l.m120489i(aVar, "p0");
                C37224b.m109965d((C1644x) this.receiver, aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo33162b((C25950a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12522e(C12515e2 e2Var) {
            super(1);
            this.f37291d = e2Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m47627c(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(OrderCardPreContractParams orderCardPreContractParams) {
            C41536l.m120489i(orderCardPreContractParams, "it");
            C40762x m = this.f37291d.f37267h.mo43855a(this.f37291d.f37271l.mo66809a(orderCardPreContractParams)).mo95084m(new C12539h2(new C12523a(this.f37291d.mo33151w2())));
            C41536l.m120488h(m, "getCardPreContract(otpPa…ContractEvent::postEvent)");
            return C31270e.m92880i(m, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12515e2(C16747i0 i0Var, C36734f fVar, C16736d0 d0Var, C16730c cVar, C16724a0 a0Var, C10104u uVar, C10092j jVar, Client client, C27494a aVar, OrderDebitCardData orderDebitCardData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(i0Var, "getInstantCardResources");
        C41536l.m120489i(fVar, "getClientPhones");
        C41536l.m120489i(d0Var, "getInstantCardCsFee");
        C41536l.m120489i(cVar, "createCardOrderAgreement");
        C41536l.m120489i(a0Var, "getCardPreContract");
        C41536l.m120489i(uVar, "mapper");
        C41536l.m120489i(jVar, "debitCardMapper");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(aVar, "otpParamsMapBuilder");
        C41536l.m120489i(orderDebitCardData, "data");
        this.f37263d = i0Var;
        this.f37264e = fVar;
        this.f37265f = d0Var;
        this.f37266g = cVar;
        this.f37267h = a0Var;
        this.f37268i = uVar;
        this.f37269j = jVar;
        this.f37270k = client;
        this.f37271l = aVar;
        this.f37272m = orderDebitCardData;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<String>()");
        this.f37276q = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<OrderCardPreContractParams>()");
        this.f37277r = h12;
        C40767b h13 = C40767b.m118210h1();
        C41536l.m120488h(h13, "create<Unit>()");
        this.f37278s = h13;
        this.f37279t = new C1644x();
        this.f37280u = new C1644x();
        this.f37281v = new C1644x();
        this.f37282w = new C1644x();
        this.f37283x = new C1644x();
        this.f37284y = new C1644x();
        this.f37285z = new C1644x();
        this.f37259A = new C1644x();
        this.f37260B = new C1644x();
        this.f37261C = C37591c.f90334a.mo90782a(new C19079d((C19074c.C19076b) null, (C19074c.C19078d) null, (C19074c.C19078d) null, (C19074c.C19075a) null, 15, (DefaultConstructorMarker) null), mo33147f(), new C12516a(this));
        m47562Tw();
        m47560Rw();
        m47564Vw();
        m47558Pw();
        m47557Ow(m47586xw(m47553Bw()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Bw */
    public final C19079d m47553Bw() {
        return (C19079d) this.f37261C.getValue(this, f37258E[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: Cw */
    public final List m47554Cw(double d) {
        double d2;
        CardFeeUiModel[] cardFeeUiModelArr = new CardFeeUiModel[2];
        String F = C32343x.m95388F("text.card.applications.card.fee", new Object[0]);
        C19073b bVar = this.f37275p;
        if (bVar == null) {
            C41536l.m120506z("resources");
            bVar = null;
        }
        C17102s a = bVar.mo47262e().mo44487a();
        if (a != null) {
            d2 = a.mo44479a();
        } else {
            d2 = Utils.DOUBLE_EPSILON;
        }
        cardFeeUiModelArr[0] = new CardFeeUiModel(F, d2, "GEL");
        cardFeeUiModelArr[1] = new CardFeeUiModel(C32343x.m95388F("text.card.applications.delivery.fee", new Object[0]), d, "GEL");
        return C41341q.m119910m(cardFeeUiModelArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: Dw */
    public final String m47555Dw() {
        C25950a aVar;
        String a;
        C31128a aVar2 = (C31128a) mo33146ee().mo4814f();
        byte[] bArr = null;
        if (aVar2 != null) {
            aVar = (C25950a) aVar2.mo71340a();
        } else {
            aVar = null;
        }
        if (!(aVar == null || (a = aVar.mo64864a()) == null)) {
            bArr = a.getBytes(C40407d.f95989b);
            C41536l.m120488h(bArr, "this as java.lang.String).getBytes(charset)");
        }
        return C32359z0.m95597y(bArr);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lw */
    public final OrderCardResult m47556Lw() {
        C12329c cVar = C12329c.f36974a;
        C19073b bVar = this.f37275p;
        C19073b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("resources");
            bVar = null;
        }
        List b = cVar.mo32919b(bVar, m47553Bw());
        C19073b bVar3 = this.f37275p;
        if (bVar3 == null) {
            C41536l.m120506z("resources");
        } else {
            bVar2 = bVar3;
        }
        return new OrderCardResult(b, cVar.mo32921d(bVar2, m47553Bw()), false, -1, true, (FeedbackItem) null, (FeedbackItem) null, (Long) null, C34646b.m101748b("text.card.application.instant.card.order.success.sms", new Object[0]), 96, (DefaultConstructorMarker) null);
    }

    /* renamed from: Ow */
    private final void m47557Ow(C19079d dVar) {
        this.f37261C.setValue(this, f37258E[0], dVar);
    }

    /* renamed from: Pw */
    private final void m47558Pw() {
        C40749p L0 = this.f37278s.mo94989L0(new C12510d2(new C12517b(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo33142Vg()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Qw */
    public static final C40754t m47559Qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Rw */
    private final void m47560Rw() {
        C40749p L0 = this.f37276q.mo94989L0(new C12500b2(new C12518c(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo33148i()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Sw */
    public static final C40754t m47561Sw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Tw */
    private final void m47562Tw() {
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C12505c2(new C12520d(this)));
        C41536l.m120488h(L0, "private fun subscribeToI…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo33148i()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Uw */
    public static final C40754t m47563Uw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: Vw */
    private final void m47564Vw() {
        C40749p L0 = this.f37277r.mo94989L0(new C12494a2(new C12522e(this)));
        C41536l.m120488h(L0, "private fun subscribeToP…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, mo33146ee()));
    }

    /* access modifiers changed from: private */
    /* renamed from: Ww */
    public static final C40754t m47565Ww(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: zm.b} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: ww */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m47585ww(p702zm.C19079d r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "text.card.applications.button.order"
            java.lang.String r0 = g91.C32343x.m95388F(r1, r0)
            java.lang.Double r1 = r6.f37262D
            r2 = 0
            if (r1 == 0) goto L_0x0033
            double r3 = r1.doubleValue()
            zm.b r1 = r6.f37275p
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = "resources"
            kotlin.jvm.internal.C41536l.m120506z(r1)
            goto L_0x001d
        L_0x001c:
            r2 = r1
        L_0x001d:
            nm.t r1 = r2.mo47262e()
            nm.s r1 = r1.mo44487a()
            if (r1 == 0) goto L_0x002c
            double r1 = r1.mo44479a()
            goto L_0x002e
        L_0x002c:
            r1 = 0
        L_0x002e:
            double r3 = r3 + r1
            java.lang.Double r2 = java.lang.Double.valueOf(r3)
        L_0x0033:
            androidx.lifecycle.x r1 = r6.mo33135J1()
            boolean r7 = r7.mo47288g()
            if (r7 == 0) goto L_0x0040
            xm.p r7 = p674xm.C18814p.ENABLED
            goto L_0x0042
        L_0x0040:
            xm.p r7 = p674xm.C18814p.DISABLED
        L_0x0042:
            if (r2 == 0) goto L_0x0068
            double r2 = r2.doubleValue()
            dn.b r4 = p398dn.C12327b.f36972a
            java.lang.String r5 = "GEL"
            java.lang.String r2 = r4.mo32912c(r2, r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = " - "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            if (r2 != 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r0 = r2
        L_0x0068:
            xm.o r2 = new xm.o
            r3 = 1
            r2.<init>(r7, r0, r3)
            r1.mo4823o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12515e2.m47585ww(zm.d):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: k51.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: xw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p702zm.C19079d m47586xw(p702zm.C19079d r12) {
        /*
            r11 = this;
            j51.f r0 = r11.f37264e
            java.util.List r0 = r0.mo89561a()
            r2 = 0
            r3 = 0
            zm.c$d r4 = r12.mo47285e()
            java.util.Iterator r1 = r0.iterator()
        L_0x0010:
            boolean r5 = r1.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x0025
            java.lang.Object r5 = r1.next()
            r7 = r5
            k51.b r7 = (k51.C36874b) r7
            boolean r7 = r7.mo89807b()
            if (r7 == 0) goto L_0x0010
            goto L_0x0026
        L_0x0025:
            r5 = r6
        L_0x0026:
            k51.b r5 = (k51.C36874b) r5
            if (r5 != 0) goto L_0x0031
            java.lang.Object r1 = ie1.C41358y.m120009Y(r0)
            r5 = r1
            k51.b r5 = (k51.C36874b) r5
        L_0x0031:
            if (r5 == 0) goto L_0x0039
            java.lang.String r1 = r5.mo89806a()
            r5 = r1
            goto L_0x003a
        L_0x0039:
            r5 = r6
        L_0x003a:
            int r0 = r0.size()
            r1 = 1
            if (r0 <= r1) goto L_0x0043
            r6 = r1
            goto L_0x0045
        L_0x0043:
            r0 = 0
            r6 = r0
        L_0x0045:
            r7 = 0
            r8 = 0
            r9 = 12
            r10 = 0
            zm.c$d r4 = p702zm.C19074c.C19078d.m64419e(r4, r5, r6, r7, r8, r9, r10)
            r5 = 0
            r6 = 11
            r7 = 0
            r1 = r12
            zm.d r12 = p702zm.C19079d.m64423b(r1, r2, r3, r4, r5, r6, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12515e2.m47586xw(zm.d):zm.d");
    }

    /* access modifiers changed from: private */
    /* renamed from: yw */
    public final C19073b m47587yw(C17388c cVar) {
        List c = cVar.mo44905c();
        C17389d b = cVar.mo44904b();
        C17103t d = cVar.mo44906d();
        DebitCardUiModel e = this.f37269j.mo26559e(cVar.mo44903a());
        OrderDebitCardData orderDebitCardData = this.f37272m;
        C12327b bVar = C12327b.f36972a;
        UserInfo client = this.f37270k.getUserInfo().getClient();
        C41536l.m120488h(client, "client.userInfo.client");
        String e2 = bVar.mo32914e(client);
        UserInfo client2 = this.f37270k.getUserInfo().getClient();
        C41536l.m120488h(client2, "client.userInfo.client");
        return new C19073b(c, b, d, e, orderDebitCardData, e2, bVar.mo32915f(client2));
    }

    /* renamed from: Aw */
    public C1644x mo33153y0() {
        return this.f37283x;
    }

    /* renamed from: C2 */
    public void mo33129C2(String str) {
        C41536l.m120489i(str, "phone");
        m47557Ow(C19079d.m64423b(m47553Bw(), (C19074c.C19076b) null, (C19074c.C19078d) null, C19074c.C19078d.m64419e(m47553Bw().mo47285e(), str, false, false, (C17799b) null, 14, (Object) null), (C19074c.C19075a) null, 11, (Object) null));
    }

    /* renamed from: Ew */
    public final C12707y1 mo33130Ew() {
        return this.f37273n;
    }

    /* renamed from: Fw */
    public C1644x mo33147f() {
        return this.f37280u;
    }

    /* renamed from: Gw */
    public C1644x mo33135J1() {
        return this.f37284y;
    }

    /* renamed from: Hw */
    public C1644x mo33149j9() {
        return this.f37281v;
    }

    /* renamed from: Iw */
    public C1644x mo33128Bm() {
        return this.f37282w;
    }

    /* renamed from: Jt */
    public void mo33136Jt(String str) {
        C41536l.m120489i(str, "address");
        m47557Ow(C19079d.m64423b(m47553Bw(), (C19074c.C19076b) null, C19074c.C19078d.m64419e(m47553Bw().mo47284d(), str, false, false, (C17799b) null, 14, (Object) null), (C19074c.C19078d) null, (C19074c.C19075a) null, 13, (Object) null));
    }

    /* renamed from: Jw */
    public C1644x mo33151w2() {
        return this.f37259A;
    }

    /* renamed from: K0 */
    public void mo33138K0(boolean z) {
        m47557Ow(C19079d.m64423b(m47553Bw(), (C19074c.C19076b) null, (C19074c.C19078d) null, (C19074c.C19078d) null, C19074c.C19075a.m64411b(m47553Bw().mo47287f(), z, false, false, 6, (Object) null), 7, (Object) null));
    }

    /* renamed from: Kw */
    public C1644x mo33142Vg() {
        return this.f37260B;
    }

    /* renamed from: Mw */
    public final C12712z1 mo33140Mw() {
        return this.f37274o;
    }

    /* renamed from: Nw */
    public C1644x mo33146ee() {
        return this.f37285z;
    }

    /* renamed from: X5 */
    public void mo33143X5() {
        C10104u uVar = this.f37268i;
        C19073b bVar = this.f37275p;
        if (bVar == null) {
            C41536l.m120506z("resources");
            bVar = null;
        }
        C37224b.m109965d(mo33149j9(), uVar.mo26582b(bVar.mo47261d()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: zm.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: zm.b} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: bg */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33144bg(p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel r12) {
        /*
            r11 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            zm.b r0 = r11.f37275p
            java.lang.String r1 = "resources"
            r2 = 0
            if (r0 != 0) goto L_0x0010
            kotlin.jvm.internal.C41536l.m120506z(r1)
            r0 = r2
        L_0x0010:
            java.util.List r0 = r0.mo47261d()
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r0.next()
            r4 = r3
            pm.d r4 = (p565pm.C17389d) r4
            long r4 = r4.mo44907a()
            long r6 = r12.mo39272d()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            if (r4 == 0) goto L_0x0018
            goto L_0x0038
        L_0x0037:
            r3 = r2
        L_0x0038:
            pm.d r3 = (p565pm.C17389d) r3
            zm.d r4 = r11.m47553Bw()
            zm.d r12 = r11.m47553Bw()
            zm.c$b r12 = r12.mo47283c()
            if (r3 == 0) goto L_0x005b
            zm.a r0 = new zm.a
            zm.b r5 = r11.f37275p
            if (r5 != 0) goto L_0x0052
            kotlin.jvm.internal.C41536l.m120506z(r1)
            goto L_0x0053
        L_0x0052:
            r2 = r5
        L_0x0053:
            pm.d r1 = r2.mo47260c()
            r0.<init>(r1, r3)
            r2 = r0
        L_0x005b:
            zm.c$b r5 = r12.mo47270a(r2)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 14
            r10 = 0
            zm.d r12 = p702zm.C19079d.m64423b(r4, r5, r6, r7, r8, r9, r10)
            r11.m47557Ow(r12)
            if (r3 == 0) goto L_0x0079
            java.lang.String r12 = r3.mo44910d()
            if (r12 == 0) goto L_0x0079
            ee1.b r0 = r11.f37276q
            r0.onNext(r12)
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12515e2.mo33144bg(ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel):void");
    }

    /* renamed from: dm */
    public void mo33145dm() {
        this.f37278s.onNext(C41238w.f97225a);
    }

    /* renamed from: u6 */
    public void mo33150u6() {
        C1644x Iw = mo33128Bm();
        List<C36874b> a = this.f37264e.mo89561a();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (C36874b a2 : a) {
            arrayList.add(a2.mo89806a());
        }
        C37224b.m109965d(Iw, arrayList);
    }

    /* renamed from: w3 */
    public void mo33152w3() {
        C12330d dVar = C12330d.f36975a;
        C19079d Bw = m47553Bw();
        C19073b bVar = this.f37275p;
        if (bVar == null) {
            C41536l.m120506z("resources");
            bVar = null;
        }
        Double d = this.f37262D;
        if (d != null) {
            this.f37277r.onNext(dVar.mo32925d(Bw, bVar, new C17267c(d.doubleValue(), "GEL")));
        }
    }

    /* renamed from: zw */
    public C1644x mo33148i() {
        return this.f37279t;
    }
}
