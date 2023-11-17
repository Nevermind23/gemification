package ix0;

import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import ee1.C40765a;
import gx0.C36086a;
import gx0.C36087b;
import he1.C41238w;
import hx0.C36262a;
import hx0.C36266e;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kx0.C37013a;
import lx0.C37177b;
import lx0.C37179d;
import lx0.C37181f;
import p341ge.bog.mobilebank.payments.data.model.PaymentCommissionApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentDebtApiModel;
import p341ge.bog.mobilebank.payments.data.model.PaymentResponseApiModel;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared.payments.data.model.PaymentConfigDetailsApiModel;
import ue1.C43075l;

/* renamed from: ix0.i */
public final class C36569i implements C37013a {

    /* renamed from: d */
    private final C36266e f88128d;

    /* renamed from: e */
    private final C36262a f88129e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C36086a f88130f;

    /* renamed from: g */
    private final C36087b f88131g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AtomicReference f88132h = new AtomicReference((Object) null);

    /* renamed from: i */
    private C40765a f88133i;

    /* renamed from: ix0.i$a */
    /* synthetic */ class C36570a extends C41535k implements C43075l {
        C36570a(Object obj) {
            super(1, obj, C36087b.class, "convert", "convert(Lge/bog/mobilebank/payments/data/model/PaymentCommissionApiModel;)Lge/bog/mobilebank/payments/domain/model/PaymentCommission;", 0);
        }

        /* renamed from: b */
        public final C37177b invoke(PaymentCommissionApiModel paymentCommissionApiModel) {
            C41536l.m120489i(paymentCommissionApiModel, "p0");
            return ((C36087b) this.receiver).mo88824e(paymentCommissionApiModel);
        }
    }

    /* renamed from: ix0.i$b */
    /* synthetic */ class C36571b extends C41535k implements C43075l {
        C36571b(Object obj) {
            super(1, obj, C36087b.class, "convertPackages", "convertPackages(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C36087b) this.receiver).mo88827i(list);
        }
    }

    /* renamed from: ix0.i$c */
    static final class C36572c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36569i f88134d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36572c(C36569i iVar) {
            super(1);
            this.f88134d = iVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            this.f88134d.f88132h.set((Object) null);
        }
    }

    /* renamed from: ix0.i$d */
    /* synthetic */ class C36573d extends C41535k implements C43075l {
        C36573d(Object obj) {
            super(1, obj, C36087b.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C36087b) this.receiver).mo88823c(list);
        }
    }

    /* renamed from: ix0.i$e */
    static final class C36574e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36569i f88135d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36574e(C36569i iVar) {
            super(1);
            this.f88135d = iVar;
        }

        /* renamed from: a */
        public final C40735b0 invoke(List list) {
            C41536l.m120489i(list, "it");
            return C40762x.m118162z(this.f88135d.f88130f.mo88822a((PaymentConfigDetailsApiModel) C41358y.m120007W(list)));
        }
    }

    /* renamed from: ix0.i$f */
    /* synthetic */ class C36575f extends C41535k implements C43075l {
        C36575f(Object obj) {
            super(1, obj, C36087b.class, "convert", "convert(Lge/bog/mobilebank/payments/data/model/PaymentDebtApiModel;)Lge/bog/mobilebank/payments/domain/model/PaymentDebt;", 0);
        }

        /* renamed from: b */
        public final C37179d invoke(PaymentDebtApiModel paymentDebtApiModel) {
            C41536l.m120489i(paymentDebtApiModel, "p0");
            return ((C36087b) this.receiver).mo88825f(paymentDebtApiModel);
        }
    }

    /* renamed from: ix0.i$g */
    static final class C36576g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C36576g f88136d = new C36576g();

        C36576g() {
            super(1);
        }

        /* renamed from: a */
        public final C40754t invoke(C40749p pVar) {
            C41536l.m120489i(pVar, "it");
            return pVar;
        }
    }

    /* renamed from: ix0.i$h */
    /* synthetic */ class C36577h extends C41535k implements C43075l {
        C36577h(Object obj) {
            super(1, obj, C36087b.class, "convert", "convert(Lge/bog/mobilebank/payments/data/model/PaymentResponseApiModel;)Lge/bog/mobilebank/payments/domain/model/PaymentResponse;", 0);
        }

        /* renamed from: b */
        public final C37181f invoke(PaymentResponseApiModel paymentResponseApiModel) {
            C41536l.m120489i(paymentResponseApiModel, "p0");
            return ((C36087b) this.receiver).mo88826g(paymentResponseApiModel);
        }
    }

    public C36569i(C36266e eVar, C36262a aVar, C36086a aVar2, C36087b bVar) {
        C41536l.m120489i(eVar, "service");
        C41536l.m120489i(aVar, "payService");
        C41536l.m120489i(aVar2, "configDetailsMapper");
        C41536l.m120489i(bVar, "paymentsMapper");
        this.f88128d = eVar;
        this.f88129e = aVar;
        this.f88130f = aVar2;
        this.f88131g = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public static final C37177b m108415j4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37177b) lVar.invoke(obj);
    }

    /* renamed from: k4 */
    private final C40749p m108416k4() {
        C36266e eVar = this.f88128d;
        Object obj = this.f88132h.get();
        C41536l.m120488h(obj, "isPackagesLoading.get()");
        C40749p g = eVar.mo88997z((String) obj).mo95062A(new C36567g(new C36571b(this.f88131g))).mo95082k(new C36568h(new C36572c(this))).mo95075O().mo95021g();
        C41536l.m120488h(g, "private fun getPackagesO…           .cache()\n    }");
        return g;
    }

    /* access modifiers changed from: private */
    /* renamed from: l4 */
    public static final List m108417l4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m4 */
    public static final void m108418m4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n4 */
    public static final List m108419n4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: p4 */
    public static final C40735b0 m108420p4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public static final C37179d m108421q4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37179d) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public static final C40754t m108422r4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public static final C37181f m108423s4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C37181f) lVar.invoke(obj);
    }

    /* renamed from: t4 */
    private final C40749p m108424t4() {
        C40749p k4 = m108416k4();
        C40765a aVar = this.f88133i;
        if (aVar == null) {
            aVar = C40765a.m118199i1(m108416k4());
            this.f88133i = aVar;
            C41536l.m120488h(aVar, "createDefault(getPackage…sSubject = this\n        }");
        }
        aVar.onNext(k4);
        return k4;
    }

    /* renamed from: A */
    public C40762x mo89392A(String str, String str2, String str3) {
        C41536l.m120489i(str, "requestId");
        C41536l.m120489i(str2, "essServiceId");
        C40762x A = this.f88128d.mo88992A(str, str2, str3).mo95062A(new C36565e(new C36575f(this.f88131g)));
        C41536l.m120488h(A, "service.getPaymentDebt(r…(paymentsMapper::convert)");
        return A;
    }

    /* renamed from: N */
    public C40762x mo89393N(List list) {
        C41536l.m120489i(list, "providerIds");
        C40762x A = this.f88128d.mo88993N(list).mo95062A(new C36561a(new C36573d(this.f88131g)));
        C41536l.m120488h(A, "service.getPaymentCards(…(paymentsMapper::convert)");
        return A;
    }

    /* renamed from: W */
    public C40762x mo89394W(String str, String str2, String str3) {
        C41536l.m120489i(str, "essServiceId");
        C41536l.m120489i(str2, "randomString");
        C40762x A = this.f88128d.mo88994W(str, str2, str3).mo95062A(new C36562b(new C36570a(this.f88131g)));
        C41536l.m120488h(A, "service.calculateCommiss…(paymentsMapper::convert)");
        return A;
    }

    /* renamed from: X */
    public C40762x mo89395X(HashMap hashMap) {
        C41536l.m120489i(hashMap, "params");
        C40762x A = this.f88129e.mo88989X(hashMap).mo95062A(new C36563c(new C36577h(this.f88131g)));
        C41536l.m120488h(A, "payService.pay(params)\n …(paymentsMapper::convert)");
        return A;
    }

    public void clean() {
        this.f88133i = C40765a.m118199i1(m108416k4());
        this.f88132h.set((Object) null);
    }

    /* renamed from: q */
    public C40762x mo89396q() {
        return this.f88128d.mo88996q();
    }

    /* renamed from: w3 */
    public C40762x mo89397w3(String str) {
        C41536l.m120489i(str, "essServiceId");
        C40762x r = this.f88128d.mo88995X(str).mo95087r(new C36564d(new C36574e(this)));
        C41536l.m120488h(r, "override fun getPaymentC…t.first()))\n            }");
        return r;
    }

    /* renamed from: z */
    public C40749p mo89398z(String str) {
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C40765a aVar = this.f88133i;
        if (!C41536l.m120484d(this.f88132h.get(), str) || aVar == null) {
            this.f88132h.set(str);
            return m108424t4();
        }
        C40749p Q = aVar.mo94998Q(new C36566f(C36576g.f88136d));
        C41536l.m120488h(Q, "{\n            subj.flatM…t\n            }\n        }");
        return Q;
    }
}
