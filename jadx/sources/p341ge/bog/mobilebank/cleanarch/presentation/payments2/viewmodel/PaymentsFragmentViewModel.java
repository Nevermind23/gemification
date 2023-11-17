package p341ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel;

import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ed1.C40749p;
import ee1.C40767b;
import g91.C32289b0;
import g91.C32312j;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jg1.C41438c;
import jg1.C41452l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import o30.C26713c;
import o30.C26716f;
import o30.C26720h;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.eventbus.events.TemplatesAndConfigEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateDebtInfo;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.model.template.TransportPassItem;
import p366bk.C10320i;
import p366bk.C10328q;
import p380ck.C10468i;
import p738du.C20101a;
import p748eu.C20292b;
import p748eu.C20294d;
import p758fu.C20557a;
import p802jv.C25507k;
import p802jv.C25508l;
import p881ru.C28096e;
import p881ru.C28105m;
import p881ru.C28106n;
import p891su.C28271f;
import p911us.C28932a;
import q30.C27677a;
import q30.C27678b;
import r30.C27895b;
import r30.C27908h;
import r30.C27909i;
import r90.C27950a;
import s30.C28141c;
import ue1.C43075l;
import w30.C29205f;
import w30.C29206g;
import w30.C29207h;
import w30.C29208i;
import w30.C29209j;
import w30.C29210k;
import w30.C29211l;
import w30.C29212m;
import w30.C29213n;
import w30.C29214o;
import w30.C29215p;
import w30.C29216q;
import w30.C29219t;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel */
public final class PaymentsFragmentViewModel extends C21481a {

    /* renamed from: H */
    public static final C22028e f58601H = new C22028e((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C1644x f58602A;

    /* renamed from: B */
    private TemplateBasketItemsWithPaymentConfig f58603B;

    /* renamed from: C */
    private final C1644x f58604C;

    /* renamed from: D */
    private final C1644x f58605D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C1644x f58606E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C1644x f58607F;

    /* renamed from: G */
    private final LiveData f58608G;

    /* renamed from: d */
    private final C41438c f58609d;

    /* renamed from: e */
    private final Client f58610e;

    /* renamed from: f */
    private final C20292b f58611f;

    /* renamed from: g */
    private final C28106n f58612g;

    /* renamed from: h */
    private final C28932a f58613h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C27677a f58614i;

    /* renamed from: j */
    private final C28096e f58615j;

    /* renamed from: k */
    private final C27908h f58616k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C27678b f58617l;

    /* renamed from: m */
    private final C25508l f58618m;

    /* renamed from: n */
    private final C20294d f58619n;

    /* renamed from: o */
    private final C1644x f58620o = new C1644x();

    /* renamed from: p */
    private final C1644x f58621p = new C1644x();

    /* renamed from: q */
    private final C1644x f58622q = new C1644x();

    /* renamed from: r */
    private final C1644x f58623r = new C1644x();

    /* renamed from: s */
    private final C1644x f58624s = new C1644x();

    /* renamed from: t */
    private final C1644x f58625t = new C1644x();

    /* renamed from: u */
    private final C1644x f58626u = new C1644x();

    /* renamed from: v */
    private final C1644x f58627v = new C1644x();

    /* renamed from: w */
    private final C1644x f58628w = new C1644x(m71318Ew());
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C1644x f58629x = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final C40767b f58630y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public final C40767b f58631z;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$a */
    static final class C22024a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentsFragmentViewModel f58632d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22024a(PaymentsFragmentViewModel paymentsFragmentViewModel) {
            super(1);
            this.f58632d = paymentsFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54758a(C28271f fVar) {
            C27895b b = this.f58632d.f58614i.mo67214b(fVar.mo67884a());
            if (fVar instanceof C28271f.C28275d) {
                this.f58632d.m71357vx(b);
                this.f58632d.f58630y.onNext(b);
            } else if (fVar instanceof C28271f.C28272a) {
                this.f58632d.m71340mx(b);
                this.f58632d.f58631z.onNext(b);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54758a((C28271f) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$b */
    static final class C22025b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentsFragmentViewModel f58633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22025b(PaymentsFragmentViewModel paymentsFragmentViewModel) {
            super(1);
            this.f58633d = paymentsFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54759a(List list) {
            C1644x Aw = this.f58633d.f58606E;
            C27678b vw = this.f58633d.f58617l;
            C41536l.m120488h(list, "it");
            Aw.mo4826r(vw.mo67215g(list));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54759a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$c */
    static final class C22026c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22026c f58634d = new C22026c();

        C22026c() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C10468i.m38038b(th);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$d */
    static final class C22027d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentsFragmentViewModel f58635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22027d(PaymentsFragmentViewModel paymentsFragmentViewModel) {
            super(1);
            this.f58635d = paymentsFragmentViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41536l.m120488h(bool, "loaded");
            if (bool.booleanValue()) {
                this.f58635d.mo54731Fw().mo4826r(this.f58635d.m71318Ew());
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$e */
    public static final class C22028e {
        private C22028e() {
        }

        public /* synthetic */ C22028e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$f */
    static final class C22029f extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C22029f f58636d = new C22029f();

        C22029f() {
            super(1);
        }

        /* renamed from: a */
        public final C21503d invoke(C21503d dVar) {
            C41536l.m120488h(dVar, "it");
            try {
                if (dVar instanceof C21503d.C21506c) {
                    Object a = dVar.mo53701a();
                    C41536l.m120486f(a);
                    return new C21503d.C21506c((ArrayList) a);
                } else if (dVar instanceof C21503d.C21504a) {
                    return new C21503d.C21504a(((C21503d.C21504a) dVar).mo53706f(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    if (dVar instanceof C21503d.C21505b) {
                        return new C21503d.C21505b((Object) null, 1, (DefaultConstructorMarker) null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                return new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$g */
    static final class C22030g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentsFragmentViewModel f58637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22030g(PaymentsFragmentViewModel paymentsFragmentViewModel) {
            super(1);
            this.f58637d = paymentsFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54763a(C41205b bVar) {
            C21484c.m69417i(this.f58637d.f58629x, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54763a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$h */
    static final class C22031h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentsFragmentViewModel f58638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22031h(PaymentsFragmentViewModel paymentsFragmentViewModel) {
            super(1);
            this.f58638d = paymentsFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54764a(List list) {
            C27677a tw = this.f58638d.f58614i;
            C41536l.m120488h(list, "it");
            List a = tw.mo67213a(list);
            C1644x yw = this.f58638d.f58629x;
            boolean z = false;
            if (!(a instanceof Collection) || !a.isEmpty()) {
                Iterator it = a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C27895b) it.next()).mo67446m()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (Object next : a) {
                    if (((C27895b) next).mo67446m()) {
                        arrayList.add(next);
                    }
                }
                a = arrayList;
            }
            C21484c.m69418j(yw, new ArrayList(a));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54764a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$i */
    static final class C22032i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentsFragmentViewModel f58639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22032i(PaymentsFragmentViewModel paymentsFragmentViewModel) {
            super(1);
            this.f58639d = paymentsFragmentViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f58639d.f58629x, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$j */
    static final class C22033j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentsFragmentViewModel f58640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22033j(PaymentsFragmentViewModel paymentsFragmentViewModel) {
            super(1);
            this.f58640d = paymentsFragmentViewModel;
        }

        /* renamed from: a */
        public final void mo54766a(C41205b bVar) {
            this.f58640d.f58607F.mo4823o(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo54766a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$k */
    static final class C22034k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentsFragmentViewModel f58641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22034k(PaymentsFragmentViewModel paymentsFragmentViewModel) {
            super(1);
            this.f58641d = paymentsFragmentViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f58641d.f58607F.mo4823o(Boolean.FALSE);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$l */
    static final class C22035l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PaymentsFragmentViewModel f58642d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22035l(PaymentsFragmentViewModel paymentsFragmentViewModel) {
            super(1);
            this.f58642d = paymentsFragmentViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f58642d.f58602A.mo4826r(new C37223a(new C21503d.C21504a(th, (Object) null, 2, (DefaultConstructorMarker) null)));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$m */
    static final class C22036m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27895b f58643d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22036m(C27895b bVar) {
            super(1);
            this.f58643d = bVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C27895b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "item");
            if (bVar.mo67439g() == this.f58643d.mo67439g()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel$n */
    public static final class C22037n implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C26720h) obj2).mo65926e()), Integer.valueOf(((C26720h) obj).mo65926e()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsFragmentViewModel(C41438c cVar, Client client, C20292b bVar, C28106n nVar, C28932a aVar, C28105m mVar, C27677a aVar2, C28096e eVar, C27908h hVar, C25507k kVar, C27678b bVar2, C25508l lVar, C20294d dVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(cVar, "eventBus");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(nVar, "getContacts");
        C41536l.m120489i(aVar, "scaOfferLocalStorage");
        C41536l.m120489i(mVar, "getContactEvent");
        C41536l.m120489i(aVar2, "contactMapper");
        C41536l.m120489i(eVar, "deleteContact");
        C41536l.m120489i(hVar, "globalObject");
        C41536l.m120489i(kVar, "getMoneyRequests");
        C41536l.m120489i(bVar2, "moneyRequestMapper");
        C41536l.m120489i(lVar, "refreshMoneyRequests");
        C41536l.m120489i(dVar, "internalAppSettingsLoadedUseCase");
        this.f58609d = cVar;
        this.f58610e = client;
        this.f58611f = bVar;
        this.f58612g = nVar;
        this.f58613h = aVar;
        this.f58614i = aVar2;
        this.f58615j = eVar;
        this.f58616k = hVar;
        this.f58617l = bVar2;
        this.f58618m = lVar;
        this.f58619n = dVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<ContactItem>()");
        this.f58630y = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<ContactItem>()");
        this.f58631z = h12;
        this.f58602A = new C1644x();
        C1644x xVar = new C1644x();
        this.f58604C = xVar;
        this.f58605D = new C1644x();
        this.f58606E = new C1644x();
        C1644x xVar2 = new C1644x();
        this.f58607F = xVar2;
        this.f58608G = new C29219t(mo54745Vw(), mo54734Iw(), xVar2);
        cVar.mo96185q(this);
        client.requestTemplatesWithConfig(true);
        if (client.isAuthorized()) {
            C41205b F0 = mVar.mo67639a().mo95027o0(C40992a.m118827a()).mo94981F0(new C29212m(new C22024a(this)));
            C41536l.m120488h(F0, "getContactEvent().observ…          }\n            }");
            bindToLifecycle(F0);
            C41205b G0 = kVar.mo64057a().mo95027o0(C40992a.m118827a()).mo94983G0(new C29213n(new C22025b(this)), new C29214o(C22026c.f58634d));
            C41536l.m120488h(G0, "getMoneyRequests().obser…report(it)\n            })");
            bindToLifecycle(G0);
            C26720h a = hVar.mo67484a();
            if (a != null) {
                xVar.mo4826r(new C37223a(a));
            }
            C41205b F02 = dVar.mo48777a().mo94981F0(new C29215p(new C22027d(this)));
            C41536l.m120488h(F02, "internalAppSettingsLoade…          }\n            }");
            bindToLifecycle(F02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        if (r6.getDebtAmount() > 0) goto L_0x006c;
     */
    /* renamed from: Dw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m71317Dw(p341ge.bog.mobilebank.model.template.TemplateGroup r12) {
        /*
            r11 = this;
            java.util.List r12 = r12.getTemplates()
            r0 = 0
            if (r12 == 0) goto L_0x007b
            java.util.Iterator r12 = r12.iterator()
            r1 = r0
        L_0x000c:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x007a
            java.lang.Object r2 = r12.next()
            ge.bog.mobilebank.model.template.TemplateBasketItem r2 = (p341ge.bog.mobilebank.model.template.TemplateBasketItem) r2
            ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig r3 = r11.f58603B
            if (r3 != 0) goto L_0x0022
            java.lang.String r3 = "templatesAndPayments"
            kotlin.jvm.internal.C41536l.m120506z(r3)
            r3 = 0
        L_0x0022:
            java.util.ArrayList r3 = r3.getTemplates()
            if (r3 == 0) goto L_0x0077
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0072
            java.lang.Object r5 = r3.next()
            r6 = r5
            ge.bog.mobilebank.model.template.TemplateBasketItem r6 = (p341ge.bog.mobilebank.model.template.TemplateBasketItem) r6
            long r7 = r6.getId()
            long r9 = r2.getId()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x006b
            boolean r7 = r6.canGetDebt()
            if (r7 == 0) goto L_0x006b
            ge.bog.mobilebank.eventbus.events.TemplateDebtEvent r7 = r6.getTemplateDebtEvent()
            r8 = 1
            if (r7 == 0) goto L_0x0061
            int r7 = r7.getState()
            r9 = 20
            if (r7 != r9) goto L_0x0061
            r7 = r8
            goto L_0x0062
        L_0x0061:
            r7 = r0
        L_0x0062:
            if (r7 == 0) goto L_0x006b
            int r6 = r6.getDebtAmount()
            if (r6 <= 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r8 = r0
        L_0x006c:
            if (r8 == 0) goto L_0x0031
            r4.add(r5)
            goto L_0x0031
        L_0x0072:
            int r2 = r4.size()
            goto L_0x0078
        L_0x0077:
            r2 = r0
        L_0x0078:
            int r1 = r1 + r2
            goto L_0x000c
        L_0x007a:
            r0 = r1
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel.m71317Dw(ge.bog.mobilebank.model.template.TemplateGroup):int");
    }

    /* access modifiers changed from: private */
    /* renamed from: Ew */
    public final List m71318Ew() {
        Integer num;
        int i = C10328q.payments_and_transfers_category_payment;
        int i2 = C10320i.ic_category_payment_full;
        C26716f.C26717a aVar = C26716f.C26717a.f67351a;
        List e = C41339p.m119900e(new C26713c("PAYMENTS_AND_TRANSFERS_PAYMENTS_CATEGORY_ID", Integer.valueOf(i2), (String) null, (String) null, 0, false, aVar, 0, 0, 0, Integer.valueOf(i), (Integer) null, 3004, (DefaultConstructorMarker) null));
        C26713c[] cVarArr = new C26713c[6];
        int i3 = C10328q.payments_and_transfers_category_transfer_own_account;
        cVarArr[0] = new C26713c("PAYMENT_OWN_ACCOUNTS", Integer.valueOf(C10320i.ic_category_transfer_own_account_full), (String) null, (String) null, 0, false, aVar, 0, 0, 0, Integer.valueOf(i3), (Integer) null, 3004, (DefaultConstructorMarker) null);
        int i4 = C10328q.payments_and_transfers_category_transfer_someone_else_account;
        cVarArr[1] = new C26713c("PAYMENT_WITHIN_BANK", Integer.valueOf(C10320i.ic_category_transfer_someone_else_full), (String) null, (String) null, 0, false, aVar, 0, 0, 0, Integer.valueOf(i4), (Integer) null, 3004, (DefaultConstructorMarker) null);
        int i5 = C10328q.payments_and_transfers_category_currency_exchange;
        cVarArr[2] = new C26713c("PAYMENT_CONVERSION", Integer.valueOf(C10320i.ic_category_currency_exchange_full), (String) null, (String) null, 0, false, aVar, 0, 0, 0, Integer.valueOf(i5), (Integer) null, 3004, (DefaultConstructorMarker) null);
        int i6 = C10328q.payments_and_transfers_category_money_request;
        int i7 = C10320i.ic_category_money_request_full;
        C20101a aVar2 = C20101a.f54724a;
        if (aVar2.mo48498b(this.f58611f)) {
            num = Integer.valueOf(C10320i.f28673O4);
        } else {
            num = null;
        }
        Integer num2 = num;
        Integer valueOf = Integer.valueOf(i7);
        cVarArr[3] = new C26713c("PAYMENTS_AND_TRANSFERS_MONEY_REQUEST_CATEGORY_ID", valueOf, (String) null, (String) null, 0, false, aVar, 0, 0, 0, Integer.valueOf(i6), num2, 956, (DefaultConstructorMarker) null);
        int i8 = C10328q.payments_and_transfers_category_receive_money_transfer;
        cVarArr[4] = new C26713c("PAYMENTS_AND_TRANSFERS_RECEIVE_MONEY_TRANSFER_CATEGORY_ID", Integer.valueOf(C10320i.ic_receive_money_transfer_full), (String) null, (String) null, 0, false, aVar, 0, 0, 0, Integer.valueOf(i8), (Integer) null, 3004, (DefaultConstructorMarker) null);
        int i9 = C10328q.payments_and_transfers_category_transfer_treasury;
        cVarArr[5] = new C26713c("PAYMENT_WITHIN_BUDGET", Integer.valueOf(C10320i.ic_category_transfer_treasury_full), (String) null, (String) null, 0, false, aVar, 0, 0, 0, Integer.valueOf(i9), (Integer) null, 3004, (DefaultConstructorMarker) null);
        List p = C41341q.m119913p(cVarArr);
        if (aVar2.mo48499c(this.f58611f)) {
            String F = C32343x.m95388F(C32312j.f79740j, new Object[0]);
            int i12 = C10320i.ic_category_top_up_full;
            int i13 = C10320i.f28671N4;
            C26713c cVar = r3;
            C26713c cVar2 = new C26713c("TOP_UP", Integer.valueOf(i12), (String) null, F, 0, false, aVar, 0, 0, 0, (Integer) null, Integer.valueOf(i13), 1972, (DefaultConstructorMarker) null);
            p.add(3, cVar);
        }
        if (this.f58610e.isAuthorized()) {
            return C41358y.m120023m0(e, p);
        }
        return p;
    }

    /* renamed from: Lw */
    private final int m71319Lw() {
        Double c;
        C20557a b = this.f58611f.mo48775b("SCA_CONTACTS_TRUST_SUGGESTION_TRANSFERS_SHOW_COUNT");
        if (b == null || (c = b.mo49086c()) == null) {
            return 0;
        }
        return (int) c.doubleValue();
    }

    /* renamed from: Mw */
    private final int m71320Mw() {
        Double c;
        C20557a b = this.f58611f.mo48775b("SCA_CONTACTS_TRUST_SUGGESTION_TRANSFERS_MIN_CONTACTS");
        if (b == null || (c = b.mo49086c()) == null) {
            return 0;
        }
        return (int) c.doubleValue();
    }

    /* renamed from: Yw */
    public static /* synthetic */ void m71321Yw(PaymentsFragmentViewModel paymentsFragmentViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        paymentsFragmentViewModel.mo54747Xw(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: Zw */
    public static final void m71322Zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void _init_$lambda$5(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public static final void m71323ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: bx */
    public static final void m71324bx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: fx */
    public static final void m71328fx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gx */
    public static final void m71330gx(PaymentsFragmentViewModel paymentsFragmentViewModel) {
        C41536l.m120489i(paymentsFragmentViewModel, "this$0");
        paymentsFragmentViewModel.f58607F.mo4823o(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    /* renamed from: hx */
    public static final void m71332hx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: kx */
    public static final void m71336kx(PaymentsFragmentViewModel paymentsFragmentViewModel) {
        C41536l.m120489i(paymentsFragmentViewModel, "this$0");
        paymentsFragmentViewModel.f58602A.mo4826r(new C37223a(new C21503d.C21506c(C41238w.f97225a)));
    }

    /* access modifiers changed from: private */
    /* renamed from: lx */
    public static final void m71338lx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mx */
    public final void m71340mx(C27895b bVar) {
        C21503d dVar;
        ArrayList arrayList;
        C1644x xVar = this.f58629x;
        if ((xVar instanceof C21503d.C21506c) && (dVar = (C21503d) xVar.mo4814f()) != null && (arrayList = (ArrayList) dVar.mo53701a()) != null) {
            boolean unused = C41352v.m119961F(arrayList, new C22036m(bVar));
        }
    }

    /* renamed from: nx */
    private final void m71342nx(TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig) {
        List list;
        List list2;
        Collection<PaymentProviderConfiguration> values;
        Object obj;
        List list3;
        this.f58603B = templateBasketItemsWithPaymentConfig;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList<TemplateGroup> templateGroups = templateBasketItemsWithPaymentConfig.getTemplateGroups();
        String str = null;
        if (templateGroups != null) {
            for (TemplateGroup templateGroup : templateGroups) {
                String groupType = templateGroup.getGroupType();
                if (C41536l.m120484d(groupType, "C")) {
                    C41536l.m120488h(templateGroup, "group");
                    obj = m71347qx(templateGroup);
                } else if (C41536l.m120484d(groupType, PensionStatusResult.STATUS_INACTIVE)) {
                    C41536l.m120488h(templateGroup, "group");
                    obj = m71349rx(templateGroup);
                } else {
                    throw new IllegalStateException("Unknown Template Group".toString());
                }
                arrayList.add(obj);
                List<TemplateBasketItem> templates = templateGroup.getTemplates();
                if (templates != null) {
                    C41536l.m120488h(templates, "templates");
                    list3 = new ArrayList(C41343r.m119925u(templates, 10));
                    for (TemplateBasketItem id : templates) {
                        list3.add(Long.valueOf(id.getId()));
                    }
                } else {
                    list3 = null;
                }
                if (list3 == null) {
                    list3 = C41341q.m119907j();
                }
                hashSet.addAll(list3);
            }
        }
        ArrayList<TemplateBasketItem> templates2 = templateBasketItemsWithPaymentConfig.getTemplates();
        if (templates2 != null) {
            ArrayList<TemplateBasketItem> arrayList2 = new ArrayList<>();
            for (T next : templates2) {
                if (!hashSet.contains(Long.valueOf(((TemplateBasketItem) next).getId()))) {
                    arrayList2.add(next);
                }
            }
            list = new ArrayList(C41343r.m119925u(arrayList2, 10));
            for (TemplateBasketItem templateBasketItem : arrayList2) {
                C41536l.m120488h(templateBasketItem, "it");
                list.add(m71353tx(templateBasketItem));
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = C41341q.m119907j();
        }
        arrayList.addAll(list);
        Map<String, PaymentProviderConfiguration> recentPayments = templateBasketItemsWithPaymentConfig.getRecentPayments();
        if (recentPayments == null || (values = recentPayments.values()) == null) {
            list2 = null;
        } else {
            list2 = new ArrayList(C41343r.m119925u(values, 10));
            for (PaymentProviderConfiguration paymentProviderConfiguration : values) {
                C41536l.m120488h(paymentProviderConfiguration, "it");
                list2.add(m71351sx(paymentProviderConfiguration));
            }
        }
        if (list2 == null) {
            list2 = C41341q.m119907j();
        }
        arrayList.addAll(list2);
        if (templateBasketItemsWithPaymentConfig.getTransportPass() != null) {
            TransportPassItem transportPass = templateBasketItemsWithPaymentConfig.getTransportPass();
            C41536l.m120488h(transportPass, "templatesAndPayments.transportPass");
            arrayList.add(m71355ux(transportPass));
        }
        if (arrayList.size() > 1) {
            C41349u.m119946y(arrayList, new C22037n());
        }
        if (!arrayList.isEmpty()) {
            TemplateDebtInfo downloadedDebtTemplatesCount = templateBasketItemsWithPaymentConfig.getDownloadedDebtTemplatesCount();
            if (downloadedDebtTemplatesCount.getTotalDebt() > 0) {
                str = C32359z0.m95544O(String.valueOf(downloadedDebtTemplatesCount.getTotalDebt()));
            }
            if (str != null) {
                arrayList.add(0, new C28141c(str, downloadedDebtTemplatesCount.getActualDebts()));
            }
            this.f58620o.mo4823o(new C27909i.C27913d(arrayList));
            return;
        }
        this.f58620o.mo4823o(C27909i.C27912c.f71100b);
    }

    /* renamed from: ox */
    private final boolean m71344ox() {
        ArrayList arrayList;
        if (C28932a.f73788b.mo68687a()) {
            return false;
        }
        C21503d dVar = (C21503d) this.f58629x.mo4814f();
        if (dVar != null) {
            arrayList = (ArrayList) dVar.mo53701a();
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return false;
        }
        int Mw = m71320Mw();
        Object f = this.f58629x.mo4814f();
        C41536l.m120486f(f);
        Object a = ((C21503d) f).mo53701a();
        C41536l.m120486f(a);
        int size = ((ArrayList) a).size();
        Object f2 = this.f58629x.mo4814f();
        C41536l.m120486f(f2);
        Object a2 = ((C21503d) f2).mo53701a();
        C41536l.m120486f(a2);
        ArrayList arrayList2 = new ArrayList();
        for (Object next : (Iterable) a2) {
            if (((C27895b) next).mo67447n()) {
                arrayList2.add(next);
            }
        }
        int size2 = arrayList2.size();
        int b = this.f58613h.mo68685b();
        int Lw = m71319Lw();
        if (size <= size2) {
            return false;
        }
        if ((size2 < Mw || Mw == 0) && b < Lw) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public static final void m71345pw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: qw */
    public static final void m71346qw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* renamed from: qx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final s30.C28139a m71347qx(p341ge.bog.mobilebank.model.template.TemplateGroup r11) {
        /*
            r10 = this;
            ge.bog.mobilebank.eventbus.events.CTParkPenaltiesEvent r0 = r11.getCtParkPenaltiesEvent()
            int r0 = r0.getState()
            r1 = 20
            r2 = 0
            if (r0 != r1) goto L_0x0046
            ge.bog.mobilebank.eventbus.events.CTParkPenaltiesEvent r0 = r11.getCtParkPenaltiesEvent()
            java.util.ArrayList r0 = r0.getCTParkPenalties()
            java.lang.String r1 = "ctParkPenaltiesEvent.ctParkPenalties"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0025
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0025
            goto L_0x0046
        L_0x0025:
            java.util.Iterator r0 = r0.iterator()
            r1 = r2
        L_0x002a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()
            ge.bog.mobilebank.model.template.TemplateBasketItem r3 = (p341ge.bog.mobilebank.model.template.TemplateBasketItem) r3
            boolean r3 = r3.isUserPaying()
            if (r3 == 0) goto L_0x002a
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x002a
            ie1.C41341q.m119916s()
            goto L_0x002a
        L_0x0044:
            r5 = r1
            goto L_0x0047
        L_0x0046:
            r5 = r2
        L_0x0047:
            java.lang.String r0 = "A"
            ge.bog.mobilebank.model.template.TemplateGroupComment r0 = r11.getCommentGroupByType(r0)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = r0.getComment()
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = ""
        L_0x0059:
            r6 = r0
            long r0 = r11.getId()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "G"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = r3.toString()
            java.lang.String r7 = r11.getGroupName()
            java.lang.String r0 = r11.getGroupImage()
            java.lang.String r8 = g91.C32289b0.m95093e(r0)
            java.lang.Integer r11 = r11.getGroupOrder()
            if (r11 != 0) goto L_0x0082
            goto L_0x0086
        L_0x0082:
            int r2 = r11.intValue()
        L_0x0086:
            r9 = r2
            s30.a r11 = new s30.a
            java.lang.String r0 = "groupName"
            kotlin.jvm.internal.C41536l.m120488h(r7, r0)
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel.m71347qx(ge.bog.mobilebank.model.template.TemplateGroup):s30.a");
    }

    /* access modifiers changed from: private */
    /* renamed from: rw */
    public static final void m71348rw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* renamed from: rx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final s30.C28140b m71349rx(p341ge.bog.mobilebank.model.template.TemplateGroup r12) {
        /*
            r11 = this;
            java.lang.String r0 = "B"
            ge.bog.mobilebank.model.template.TemplateGroupComment r0 = r12.getCommentGroupByType(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r0.getComment()
            if (r0 == 0) goto L_0x0049
            cf1.j r3 = new cf1.j
            java.lang.String r4 = "(\\d+)(\\D)?"
            r3.<init>((java.lang.String) r4)
            r4 = 2
            cf1.h r0 = cf1.C40419j.m117007b(r3, r0, r1, r4, r2)
            if (r0 == 0) goto L_0x0046
            cf1.h$b r0 = r0.mo94466a()
            if (r0 == 0) goto L_0x0046
            cf1.h r3 = r0.mo94471a()
            java.util.List r3 = r3.mo94467b()
            r5 = 1
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            cf1.h r0 = r0.mo94471a()
            java.util.List r0 = r0.mo94467b()
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            he1.m r0 = he1.C41233s.m119492a(r3, r0)
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 != 0) goto L_0x004d
        L_0x0049:
            he1.m r0 = he1.C41233s.m119492a(r2, r2)
        L_0x004d:
            java.lang.Object r2 = r0.mo95675a()
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r0.mo95676b()
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            s30.b r0 = new s30.b
            long r2 = r12.getId()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "G"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            int r5 = r11.m71317Dw(r12)
            java.lang.String r6 = r12.getGroupName()
            java.lang.String r2 = "groupName"
            kotlin.jvm.internal.C41536l.m120488h(r6, r2)
            java.lang.String r2 = r12.getGroupImage()
            java.lang.String r7 = g91.C32289b0.m95093e(r2)
            java.lang.Integer r12 = r12.getGroupOrder()
            if (r12 != 0) goto L_0x008e
            goto L_0x0092
        L_0x008e:
            int r1 = r12.intValue()
        L_0x0092:
            r10 = r1
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsFragmentViewModel.m71349rx(ge.bog.mobilebank.model.template.TemplateGroup):s30.b");
    }

    /* renamed from: sx */
    private final C26720h m71351sx(PaymentProviderConfiguration paymentProviderConfiguration) {
        int i;
        PaymentProviderConfiguration paymentProviderConfiguration2 = paymentProviderConfiguration;
        String str = "P" + paymentProviderConfiguration2.f81344id;
        String c = C27950a.m86286c(paymentProviderConfiguration2.serviceName, true);
        String c2 = C32289b0.m95091c(paymentProviderConfiguration2.logo);
        Integer orderId = paymentProviderConfiguration.getOrderId();
        if (orderId == null) {
            i = 0;
        } else {
            i = orderId.intValue();
        }
        return new C26713c(str, (Integer) null, c2, c, 0, false, (C26716f) null, 0, i, 2, (Integer) null, (Integer) null, 3314, (DefaultConstructorMarker) null);
    }

    /* renamed from: tx */
    private final C26720h m71353tx(TemplateBasketItem templateBasketItem) {
        boolean z;
        boolean z2;
        TemplateBasketItem templateBasketItem2 = templateBasketItem;
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig = this.f58603B;
        if (templateBasketItemsWithPaymentConfig == null) {
            C41536l.m120506z("templatesAndPayments");
            templateBasketItemsWithPaymentConfig = null;
        }
        PaymentProviderConfiguration paymentProviderConfiguration = templateBasketItemsWithPaymentConfig.getPaymentProviderConfiguration(templateBasketItem2);
        int i = 0;
        if (paymentProviderConfiguration != null) {
            if (!paymentProviderConfiguration.hasDebt || !templateBasketItem.canGetDebt() || templateBasketItem.getTemplateDebtEvent().getState() != 20 || templateBasketItem.getDebtAmount() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        String str = "T" + templateBasketItem.getId();
        String templateNameOrServiceName = templateBasketItem2.getTemplateNameOrServiceName(this.f58610e);
        String templateImage = templateBasketItem.getTemplateImage();
        if (templateImage == null) {
            templateImage = templateBasketItem.getLogo();
        }
        String e = C32289b0.m95093e(templateImage);
        Integer templateOrder = templateBasketItem.getTemplateOrder();
        if (templateOrder != null) {
            i = templateOrder.intValue();
        }
        return new C26713c(str, (Integer) null, e, templateNameOrServiceName, 0, z, (C26716f) null, 0, i, 2, (Integer) null, (Integer) null, 3282, (DefaultConstructorMarker) null);
    }

    /* renamed from: ux */
    private final C26720h m71355ux(TransportPassItem transportPassItem) {
        return new C26713c("S0", (Integer) null, C32289b0.m95091c(transportPassItem.getLogo()), C32343x.m95388F(transportPassItem.getTitleDictionaryKey(), new Object[0]), 0, false, (C26716f) null, 0, transportPassItem.getOrderId(), 2, (Integer) null, (Integer) null, 3314, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: vx */
    public final void m71357vx(C27895b bVar) {
        C21503d dVar;
        ArrayList arrayList;
        boolean z;
        C1644x xVar = this.f58629x;
        if ((xVar instanceof C21503d.C21506c) && (dVar = (C21503d) xVar.mo4814f()) != null && (arrayList = (ArrayList) dVar.mo53701a()) != null) {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((C27895b) it.next()).mo67439g() == bVar.mo67439g()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                arrayList.set(i, bVar);
            }
        }
    }

    /* renamed from: Fw */
    public final C1644x mo54731Fw() {
        return this.f58628w;
    }

    /* renamed from: Gw */
    public final C40749p mo54732Gw() {
        return this.f58631z;
    }

    /* renamed from: Hw */
    public final C40749p mo54733Hw() {
        return this.f58630y;
    }

    /* renamed from: Iw */
    public final LiveData mo54734Iw() {
        return C1607m0.m5655c(this.f58629x, C22029f.f58636d);
    }

    /* renamed from: Jw */
    public final LiveData mo54735Jw() {
        return this.f58602A;
    }

    /* renamed from: Kw */
    public final LiveData mo54736Kw() {
        return this.f58605D;
    }

    /* renamed from: Nw */
    public final LiveData mo54737Nw() {
        return this.f58606E;
    }

    /* renamed from: Ow */
    public final LiveData mo54738Ow() {
        return this.f58625t;
    }

    /* renamed from: Pw */
    public final LiveData mo54739Pw() {
        return this.f58626u;
    }

    /* renamed from: Qw */
    public final LiveData mo54740Qw() {
        return this.f58622q;
    }

    /* renamed from: Rw */
    public final LiveData mo54741Rw() {
        return this.f58621p;
    }

    /* renamed from: Sw */
    public final LiveData mo54742Sw() {
        return this.f58627v;
    }

    /* renamed from: Tw */
    public final LiveData mo54743Tw() {
        return this.f58623r;
    }

    /* renamed from: Uw */
    public final LiveData mo54744Uw() {
        return this.f58624s;
    }

    /* renamed from: Vw */
    public final LiveData mo54745Vw() {
        return this.f58620o;
    }

    /* renamed from: Ww */
    public final LiveData mo54746Ww() {
        return this.f58608G;
    }

    /* renamed from: Xw */
    public final void mo54747Xw(boolean z) {
        if (this.f58610e.isAuthorized()) {
            C41205b I = this.f58612g.mo67641b(z, 10L).mo95063B(C40992a.m118827a()).mo95083l(new C29216q(new C22030g(this))).mo95070I(new C29206g(new C22031h(this)), new C29207h(new C22032i(this)));
            C41536l.m120488h(I, "fun loadContacts(refresh…fecycle()\n        }\n    }");
            bindToLifecycle(I);
        }
    }

    /* renamed from: cx */
    public final void mo54748cx(C26720h hVar) {
        C41536l.m120489i(hVar, "categoryItem");
        if (this.f58610e.isAuthorized() || C41536l.m120484d(hVar.mo65922a(), "PAYMENTS_AND_TRANSFERS_PAYMENTS_CATEGORY_ID")) {
            this.f58604C.mo4826r(new C37223a(hVar));
            return;
        }
        this.f58605D.mo4826r(new C37223a(C41238w.f97225a));
        this.f58616k.mo67485b(hVar);
    }

    /* renamed from: dx */
    public final void mo54749dx(String str) {
        boolean z;
        Collection<PaymentProviderConfiguration> values;
        boolean z2;
        C41536l.m120489i(str, "itemId");
        boolean z3 = true;
        String Y0 = C40445z.m117194Y0(str, 1);
        String substring = str.substring(1);
        C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
        long parseLong = Long.parseLong(substring);
        int hashCode = Y0.hashCode();
        T t = null;
        if (hashCode != 71) {
            if (hashCode != 80) {
                if (hashCode != 83) {
                    if (hashCode == 84 && Y0.equals("T")) {
                        this.f58623r.mo4826r(new C37223a(Long.valueOf(parseLong)));
                    }
                } else if (Y0.equals("S")) {
                    C37224b.m109962a(this.f58624s);
                }
            } else if (Y0.equals("P")) {
                TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig = this.f58603B;
                if (templateBasketItemsWithPaymentConfig == null) {
                    C41536l.m120506z("templatesAndPayments");
                    templateBasketItemsWithPaymentConfig = null;
                }
                Map<String, PaymentProviderConfiguration> recentPayments = templateBasketItemsWithPaymentConfig.getRecentPayments();
                if (recentPayments != null && (values = recentPayments.values()) != null) {
                    Iterator<T> it = values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (((PaymentProviderConfiguration) next).f81344id == parseLong) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            t = next;
                            break;
                        }
                    }
                    PaymentProviderConfiguration paymentProviderConfiguration = (PaymentProviderConfiguration) t;
                    if (paymentProviderConfiguration != null) {
                        if (C41536l.m120484d(paymentProviderConfiguration.getServiceType(), "C")) {
                            List<PaymentProviderConfiguration> list = paymentProviderConfiguration.children;
                            if (list != null && !list.isEmpty()) {
                                z3 = false;
                            }
                            if (!z3) {
                                this.f58622q.mo4826r(new C37223a(Long.valueOf(parseLong)));
                                return;
                            }
                        }
                        if (C41536l.m120484d(paymentProviderConfiguration.getServiceType(), "F")) {
                            this.f58621p.mo4826r(new C37223a(paymentProviderConfiguration.serviceId));
                        }
                    }
                }
            }
        } else if (Y0.equals("G")) {
            TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig2 = this.f58603B;
            if (templateBasketItemsWithPaymentConfig2 == null) {
                C41536l.m120506z("templatesAndPayments");
                templateBasketItemsWithPaymentConfig2 = null;
            }
            ArrayList<TemplateGroup> templateGroups = templateBasketItemsWithPaymentConfig2.getTemplateGroups();
            if (templateGroups != null) {
                Iterator<T> it2 = templateGroups.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (((TemplateGroup) next2).getId() == parseLong) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        t = next2;
                        break;
                    }
                }
                TemplateGroup templateGroup = (TemplateGroup) t;
                if (templateGroup != null) {
                    if (C41536l.m120484d(templateGroup.getGroupType(), "C")) {
                        this.f58625t.mo4826r(new C37223a(Long.valueOf(parseLong)));
                    }
                    if (C41536l.m120484d(templateGroup.getGroupType(), PensionStatusResult.STATUS_INACTIVE)) {
                        this.f58626u.mo4826r(new C37223a(Long.valueOf(parseLong)));
                    }
                }
            }
        }
    }

    /* renamed from: ex */
    public final void mo54750ex() {
        LiveData liveData = this.f58608G;
        C41536l.m120487g(liveData, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.payments2.viewmodel.PaymentsRefreshingLiveData");
        ((C29219t) liveData).mo69065y();
        mo54751ix();
        mo54747Xw(true);
        if (this.f58610e.isAuthorized()) {
            C41205b G = this.f58618m.mo64058a().mo94904r(new C29209j(new C22033j(this))).mo94888G(new C29210k(this), new C29211l(new C22034k(this)));
            C41536l.m120488h(G, "fun refreshData() {\n    …fecycle()\n        }\n    }");
            bindToLifecycle(G);
        }
    }

    /* renamed from: ix */
    public final void mo54751ix() {
        this.f58610e.requestTemplatesWithConfig(true);
    }

    /* renamed from: jx */
    public final void mo54752jx(long j) {
        C41205b G = this.f58615j.mo67631a(j).mo94906z(C40992a.m118827a()).mo94888G(new C29205f(this), new C29208i(new C22035l(this)));
        C41536l.m120488h(G, "fun removeContact(contac…       })\n        )\n    }");
        addDisposable(G);
    }

    @C41452l
    public final void onCarDebtEvent(TemplateGroup templateGroup) {
        C41536l.m120489i(templateGroup, "group");
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig = this.f58603B;
        if (templateBasketItemsWithPaymentConfig == null) {
            C41536l.m120506z("templatesAndPayments");
            templateBasketItemsWithPaymentConfig = null;
        }
        m71342nx(templateBasketItemsWithPaymentConfig);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.f58609d.mo96186s(this);
    }

    @C41452l
    public final void onTemplateBasketItemChanged(TemplateBasketItem templateBasketItem) {
        C41536l.m120489i(templateBasketItem, "item");
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig = this.f58603B;
        if (templateBasketItemsWithPaymentConfig == null) {
            C41536l.m120506z("templatesAndPayments");
            templateBasketItemsWithPaymentConfig = null;
        }
        m71342nx(templateBasketItemsWithPaymentConfig);
    }

    @C41452l
    public final void onTemplatesAndPaymentsEvent(TemplatesAndConfigEvent templatesAndConfigEvent) {
        C41536l.m120489i(templatesAndConfigEvent, "event");
        int state = templatesAndConfigEvent.getState();
        if (state == 10) {
            this.f58620o.mo4823o(C27909i.C27911b.f71099b);
        } else if (state == 20) {
            TemplateBasketItemsWithPaymentConfig templatesWithPaymentConfig = templatesAndConfigEvent.getTemplatesWithPaymentConfig();
            C41536l.m120488h(templatesWithPaymentConfig, "event.templatesWithPaymentConfig");
            m71342nx(templatesWithPaymentConfig);
        } else if (state == 30 || state == 40) {
            this.f58620o.mo4823o(C27909i.C27910a.f71098b);
        }
    }

    /* renamed from: pg */
    public final LiveData mo54756pg() {
        return this.f58604C;
    }

    /* renamed from: px */
    public final void mo54757px() {
        if (m71344ox()) {
            this.f58613h.mo68686c();
            this.f58627v.mo4823o(C32343x.m95466m(Boolean.TRUE));
        }
    }
}
