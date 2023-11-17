package gz0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import ed1.C40734b;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40767b;
import ez0.C31900e;
import f31.C31922a;
import fz0.C32038a;
import g91.C32300e0;
import g91.C32319m;
import g91.C32343x;
import h31.C36149a;
import hd1.C41204a;
import he1.C41238w;
import i31.C36344a;
import i31.C36345b;
import i31.C36346c;
import iu0.C36546y;
import j51.C36735g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import m51.C37228a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.products.data.model.cardinsurance.RemoveCardInsuranceParams;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.model.CardInsuranceStatusUiModel;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p863pw.C27635m;
import p863pw.C27636n;
import pc0.C27494a;
import ty0.C38884p0;
import ty0.C38895u0;
import ue1.C43075l;
import vy0.C39495b;
import z31.C40143a;

/* renamed from: gz0.i */
public final class C36102i extends C21481a implements C36093b, C36096c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C39495b f87257d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C36149a f87258e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C32038a f87259f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C38895u0 f87260g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C36735g f87261h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C38884p0 f87262i;

    /* renamed from: j */
    private final C27494a f87263j;

    /* renamed from: k */
    private final C1644x f87264k;

    /* renamed from: l */
    private final C1644x f87265l = new C1644x();

    /* renamed from: m */
    private final C1644x f87266m = new C1644x();

    /* renamed from: n */
    private final C1644x f87267n = new C1644x();

    /* renamed from: o */
    private final C1644x f87268o = new C1644x();

    /* renamed from: p */
    private final C1644x f87269p = new C1644x();

    /* renamed from: q */
    private final C1644x f87270q = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C27635m f87271r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C36345b f87272s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C40767b f87273t;

    /* renamed from: u */
    private final C40767b f87274u;

    /* renamed from: gz0.i$a */
    static final class C36103a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36102i f87275d;

        /* renamed from: e */
        final /* synthetic */ long f87276e;

        /* renamed from: gz0.i$a$a */
        static final class C36104a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36102i f87277d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36104a(C36102i iVar) {
                super(1);
                this.f87277d = iVar;
            }

            /* renamed from: a */
            public final void mo88866a(C27635m mVar) {
                String str;
                this.f87277d.f87271r = mVar;
                C27636n v = mVar.mo67139v();
                if (v != null) {
                    str = v.mo67155j();
                } else {
                    str = null;
                }
                if (str != null) {
                    this.f87277d.f87273t.onNext(mVar);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo88866a((C27635m) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: gz0.i$a$b */
        /* synthetic */ class C36105b extends C41535k implements C43075l {
            C36105b(Object obj) {
                super(1, obj, C32038a.class, "transform", "transform(Lge/bog/mobilebank/cleanarch/domain/products/model/Card;)Lge/bog/mobilebank/products/presentation/cardinsurance/model/CardInsuranceStatusUiModel;", 0);
            }

            /* renamed from: b */
            public final CardInsuranceStatusUiModel invoke(C27635m mVar) {
                C41536l.m120489i(mVar, "p0");
                return ((C32038a) this.receiver).mo72526a(mVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36103a(C36102i iVar, long j) {
            super(1);
            this.f87275d = iVar;
            this.f87276e = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m107435d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final CardInsuranceStatusUiModel m107436e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (CardInsuranceStatusUiModel) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "rc");
            C40762x A = this.f87275d.f87257d.mo93139b(this.f87276e, C41341q.m119910m(2, 153, 6).contains(num)).mo95084m(new C36100g(new C36104a(this.f87275d))).mo95062A(new C36101h(new C36105b(this.f87275d.f87259f)));
            C41536l.m120488h(A, "class ViewModel @Assiste…cycle()\n        }\n\n\n    }");
            return C31270e.m92880i(A, num.intValue());
        }
    }

    /* renamed from: gz0.i$b */
    static final class C36106b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36102i f87278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36106b(C36102i iVar) {
            super(1);
            this.f87278d = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m107441c(C36102i iVar) {
            C41536l.m120489i(iVar, "this$0");
            iVar.onRefresh(6);
            iVar.f87262i.mo92581a();
        }

        /* renamed from: b */
        public final C40754t invoke(RemoveCardInsuranceParams removeCardInsuranceParams) {
            C41536l.m120489i(removeCardInsuranceParams, "it");
            C40734b o = this.f87278d.f87260g.mo92592a(this.f87278d.mo88863rw(removeCardInsuranceParams)).mo94902o(new C36110j(this.f87278d));
            C41536l.m120488h(o, "useScaForAction(getOtpPa…s()\n                    }");
            return C31270e.m92878g(o, -1);
        }
    }

    /* renamed from: gz0.i$c */
    static final class C36107c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36102i f87279d;

        /* renamed from: gz0.i$c$a */
        static final class C36108a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36102i f87280d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36108a(C36102i iVar) {
                super(1);
                this.f87280d = iVar;
            }

            /* renamed from: a */
            public final void mo88870a(C36345b bVar) {
                this.f87280d.f87272s = bVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo88870a((C36345b) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: gz0.i$c$b */
        static final class C36109b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C27635m f87281d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36109b(C27635m mVar) {
                super(1);
                this.f87281d = mVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: i31.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: i31.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: i31.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: i31.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final z31.C40143a invoke(i31.C36345b r12) {
                /*
                    r11 = this;
                    java.lang.String r0 = "info"
                    kotlin.jvm.internal.C41536l.m120489i(r12, r0)
                    java.util.List r0 = r12.mo89065b()
                    pw.m r1 = r11.f87281d
                    java.util.Iterator r0 = r0.iterator()
                L_0x000f:
                    boolean r2 = r0.hasNext()
                    r3 = 0
                    if (r2 == 0) goto L_0x0034
                    java.lang.Object r2 = r0.next()
                    r4 = r2
                    i31.c r4 = (i31.C36346c) r4
                    java.lang.String r4 = r4.mo89077g()
                    pw.n r5 = r1.mo67139v()
                    if (r5 == 0) goto L_0x002c
                    java.lang.String r5 = r5.mo67157l()
                    goto L_0x002d
                L_0x002c:
                    r5 = r3
                L_0x002d:
                    boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r5)
                    if (r4 == 0) goto L_0x000f
                    goto L_0x0035
                L_0x0034:
                    r2 = r3
                L_0x0035:
                    r5 = r2
                    i31.c r5 = (i31.C36346c) r5
                    if (r5 == 0) goto L_0x0074
                    pw.m r0 = r11.f87281d
                    java.util.List r12 = r12.mo89064a()
                    java.util.Iterator r12 = r12.iterator()
                L_0x0044:
                    boolean r1 = r12.hasNext()
                    if (r1 == 0) goto L_0x0060
                    java.lang.Object r1 = r12.next()
                    r2 = r1
                    i31.a r2 = (i31.C36344a) r2
                    java.lang.String r2 = r2.mo89059b()
                    java.lang.String r4 = r5.mo89077g()
                    boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r4)
                    if (r2 == 0) goto L_0x0044
                    r3 = r1
                L_0x0060:
                    r6 = r3
                    i31.a r6 = (i31.C36344a) r6
                    pw.n r7 = r0.mo67139v()
                    kotlin.jvm.internal.C41536l.m120486f(r7)
                    r8 = 0
                    r9 = 8
                    r10 = 0
                    z31.a r3 = new z31.a
                    r4 = r3
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                L_0x0074:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: gz0.C36102i.C36107c.C36109b.invoke(i31.b):z31.a");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36107c(C36102i iVar) {
            super(1);
            this.f87279d = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m107445d(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final C40143a m107446e(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (C40143a) lVar.invoke(obj);
        }

        /* renamed from: c */
        public final C40754t invoke(C27635m mVar) {
            Long l;
            C41536l.m120489i(mVar, "card");
            C36149a iw = this.f87279d.f87258e;
            C37228a a = this.f87279d.f87261h.mo89562a();
            if (a != null) {
                l = Long.valueOf(a.mo90305b());
            } else {
                l = null;
            }
            C40762x A = C36149a.C36150a.m107539a(iw, String.valueOf(l), mVar.mo67118d(), mVar.mo67131o(), mVar.mo67105E(), String.valueOf(mVar.mo67126j()), (String) null, 32, (Object) null).mo95084m(new C36111k(new C36108a(this.f87279d))).mo95062A(new C36112l(new C36109b(mVar)));
            C41536l.m120488h(A, "private fun subscribeToG…ndToLifecycle()\n        }");
            return C31270e.m92880i(A, -1);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36102i(C39495b bVar, C36149a aVar, C32038a aVar2, C38895u0 u0Var, C36735g gVar, C38884p0 p0Var, C27494a aVar3, long j) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getCardDetails");
        C41536l.m120489i(aVar, "getDebitCardInsuranceTypeInfo");
        C41536l.m120489i(aVar2, "insuranceMapper");
        C41536l.m120489i(u0Var, "useScaForAction");
        C41536l.m120489i(gVar, "getLoginInfo");
        C41536l.m120489i(p0Var, "reloadCards");
        C41536l.m120489i(aVar3, "otpParamsMapBuilder");
        this.f87257d = bVar;
        this.f87258e = aVar;
        this.f87259f = aVar2;
        this.f87260g = u0Var;
        this.f87261h = gVar;
        this.f87262i = p0Var;
        this.f87263j = aVar3;
        C1644x xVar = new C1644x();
        this.f87264k = xVar;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<Card>()");
        this.f87273t = h1;
        C40767b h12 = C40767b.m118210h1();
        C41536l.m120488h(h12, "create<RemoveCardInsuranceParams>()");
        this.f87274u = h12;
        m107417yw();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C36099f(new C36103a(this, j)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…ervable(rc)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m107402gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: tw */
    private final boolean m107412tw() {
        C27635m mVar = this.f87271r;
        return C41536l.m120484d(mVar != null ? mVar.mo67101A() : null, C31922a.CREDIT_CARD.mo72370b());
    }

    /* renamed from: uw */
    private final void m107413uw() {
        C40749p L0 = this.f87274u.mo94989L0(new C36097d(new C36106b(this)));
        C41536l.m120488h(L0, "private fun subscribeToC…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f87269p));
    }

    /* access modifiers changed from: private */
    /* renamed from: vw */
    public static final C40754t m107414vw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: ww */
    private final void m107415ww() {
        C40749p L0 = this.f87273t.mo94989L0(new C36098e(new C36107c(this)));
        C41536l.m120488h(L0, "private fun subscribeToG…ndToLifecycle()\n        }");
        bindToLifecycle(C31270e.m92876e(L0, this.f87265l));
    }

    /* access modifiers changed from: private */
    /* renamed from: xw */
    public static final C40754t m107416xw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: yw */
    private final void m107417yw() {
        m107415ww();
        m107413uw();
    }

    /* renamed from: E3 */
    public LiveData mo88855E3() {
        return this.f87266m;
    }

    /* renamed from: G5 */
    public LiveData mo88856G5() {
        return this.f87269p;
    }

    /* renamed from: Iv */
    public void mo88850Iv(String str, String str2, String str3) {
        C27636n v;
        String j;
        C27635m mVar = this.f87271r;
        if (mVar != null && (v = mVar.mo67139v()) != null && (j = v.mo67155j()) != null) {
            if (C32300e0.f79712a.mo72816a(str, str2, str3)) {
                this.f87274u.onNext(new RemoveCardInsuranceParams(j, str, str2, str3, (String) null, 16, (DefaultConstructorMarker) null));
                return;
            }
            C37224b.m109965d(this.f87268o, new RemoveCardInsuranceParams(j, (String) null, (String) null, (String) null, (String) null, 30, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: Lc */
    public LiveData mo88857Lc() {
        return this.f87268o;
    }

    /* renamed from: Lf */
    public void mo88851Lf() {
        String str;
        C36346c cVar;
        C36344a aVar;
        String str2;
        long j;
        Long p;
        List a;
        Object obj;
        String str3;
        List b;
        Object obj2;
        String str4;
        if (m107412tw()) {
            C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_insurance_change_type");
        }
        C27635m mVar = this.f87271r;
        if (mVar != null) {
            C36345b bVar = this.f87272s;
            C27636n v = mVar.mo67139v();
            Long l = null;
            if (v != null) {
                str = v.mo67155j();
            } else {
                str = null;
            }
            if (str == null) {
                C37224b.m109965d(this.f87270q, Long.valueOf(mVar.mo67126j()));
                return;
            }
            if (bVar == null || (b = bVar.mo89065b()) == null) {
                cVar = null;
            } else {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    String g = ((C36346c) obj2).mo89077g();
                    C27636n v2 = mVar.mo67139v();
                    if (v2 != null) {
                        str4 = v2.mo67157l();
                    } else {
                        str4 = null;
                    }
                    if (C41536l.m120484d(g, str4)) {
                        break;
                    }
                }
                cVar = (C36346c) obj2;
            }
            if (bVar == null || (a = bVar.mo89064a()) == null) {
                aVar = null;
            } else {
                Iterator it2 = a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    String b2 = ((C36344a) obj).mo89059b();
                    if (cVar != null) {
                        str3 = cVar.mo89077g();
                    } else {
                        str3 = null;
                    }
                    if (C41536l.m120484d(b2, str3)) {
                        break;
                    }
                }
                aVar = (C36344a) obj;
            }
            C27636n v3 = mVar.mo67139v();
            if (v3 != null) {
                l = v3.mo67161p();
            }
            if (l == null) {
                str2 = C32343x.m95388F("card.insurance.actionsheet.change.message.no.date", new Object[0]);
            } else if (aVar == null || aVar.mo89058a() <= Utils.DOUBLE_EPSILON) {
                str2 = C32343x.m95388F("card.insurance.actionsheet.change.message.free", new Object[0]);
            } else {
                Object[] objArr = new Object[1];
                C27636n v4 = mVar.mo67139v();
                if (v4 == null || (p = v4.mo67161p()) == null) {
                    j = 0;
                } else {
                    j = p.longValue();
                }
                String d = C32319m.m95297d(j, "dd.MM.yyyy");
                C41536l.m120488h(d, "formatDate(\n            …                        )");
                objArr[0] = d;
                str2 = C32343x.m95388F("card.insurance.actionsheet.change.message", objArr);
            }
            C37224b.m109965d(this.f87267n, new C31900e(C32343x.m95388F("card.insurance.actionsheet.change.title", new Object[0]), str2, C32343x.m95388F("card.insurance.actionsheet.change.button.cancel", new Object[0]), C32343x.m95388F("card.insurance.actionsheet.change.button.ok", new Object[0])));
        }
    }

    /* renamed from: Vb */
    public void mo88852Vb() {
        Long l;
        Object obj;
        Object obj2;
        String str;
        long j;
        C27636n v;
        Long p;
        C27636n v2;
        String str2;
        C27636n v3;
        if (m107412tw()) {
            C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_insurance_cancel");
        }
        C36345b bVar = this.f87272s;
        if (bVar != null) {
            Iterator it = bVar.mo89065b().iterator();
            while (true) {
                l = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String g = ((C36346c) obj).mo89077g();
                C27635m mVar = this.f87271r;
                if (mVar == null || (v3 = mVar.mo67139v()) == null) {
                    str2 = null;
                } else {
                    str2 = v3.mo67157l();
                }
                if (C41536l.m120484d(g, str2)) {
                    break;
                }
            }
            C36346c cVar = (C36346c) obj;
            if (cVar != null) {
                Iterator it2 = bVar.mo89064a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (C41536l.m120484d(((C36344a) obj2).mo89059b(), cVar.mo89077g())) {
                        break;
                    }
                }
                C36344a aVar = (C36344a) obj2;
                C27635m mVar2 = this.f87271r;
                if (!(mVar2 == null || (v2 = mVar2.mo67139v()) == null)) {
                    l = v2.mo67161p();
                }
                if (l == null) {
                    str = C32343x.m95388F("card.insurance.actionsheet.deactivate.message.no.date", new Object[0]);
                } else if (aVar == null || aVar.mo89058a() <= Utils.DOUBLE_EPSILON) {
                    str = C32343x.m95388F("card.insurance.actionsheet.deactivate.message.free", new Object[0]);
                } else {
                    Object[] objArr = new Object[1];
                    C27635m mVar3 = this.f87271r;
                    if (mVar3 == null || (v = mVar3.mo67139v()) == null || (p = v.mo67161p()) == null) {
                        j = 0;
                    } else {
                        j = p.longValue();
                    }
                    String d = C32319m.m95297d(j, "dd.MM.yyyy");
                    C41536l.m120488h(d, "formatDate(\n            …                        )");
                    objArr[0] = d;
                    str = C32343x.m95388F("card.insurance.actionsheet.deactivate.message", objArr);
                }
                C37224b.m109965d(this.f87266m, new C31900e(C32343x.m95388F("card.insurance.actionsheet.deactivate.title", new Object[0]), str, C32343x.m95388F("card.insurance.actionsheet.deactivate.button.cancel", new Object[0]), C32343x.m95388F("card.insurance.actionsheet.deactivate.button.ok", new Object[0])));
            }
        }
    }

    /* renamed from: Vd */
    public LiveData mo88858Vd() {
        return this.f87264k;
    }

    /* renamed from: dl */
    public LiveData mo88859dl() {
        return this.f87265l;
    }

    /* renamed from: qt */
    public void mo88853qt() {
        this.f87262i.mo92581a();
    }

    /* renamed from: qw */
    public final C36093b mo88862qw() {
        return this;
    }

    /* renamed from: rw */
    public HashMap mo88863rw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f87263j.mo66809a(otpParams);
    }

    /* renamed from: sp */
    public LiveData mo88860sp() {
        return this.f87270q;
    }

    /* renamed from: st */
    public LiveData mo88861st() {
        return this.f87267n;
    }

    /* renamed from: sw */
    public final C36096c mo88864sw() {
        return this;
    }

    /* renamed from: wo */
    public void mo88854wo() {
        C1644x xVar = this.f87270q;
        C27635m mVar = this.f87271r;
        C37224b.m109965d(xVar, Long.valueOf(mVar != null ? mVar.mo67126j() : -1));
    }
}
