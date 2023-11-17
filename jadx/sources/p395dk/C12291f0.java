package p395dk;

import cx0.C31453a;
import dx0.C31615c;
import dx0.C31616d;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p380ck.C10468i;
import r90.C27954d;
import ue1.C43075l;

/* renamed from: dk.f0 */
public final class C12291f0 {

    /* renamed from: a */
    private final C31616d f36956a;

    /* renamed from: b */
    private final C31615c f36957b;

    /* renamed from: dk.f0$a */
    static final class C12292a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C12292a f36958d = new C12292a();

        C12292a() {
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

    /* renamed from: dk.f0$b */
    /* synthetic */ class C12293b extends C41535k implements C43075l {
        C12293b(Object obj) {
            super(1, obj, C12291f0.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        public final List invoke(List list) {
            C41536l.m120489i(list, "p0");
            return ((C12291f0) this.receiver).m47232e(list);
        }
    }

    public C12291f0(C31616d dVar, C31615c cVar) {
        C41536l.m120489i(dVar, "loadPaymentConfigurations");
        C41536l.m120489i(cVar, "getPaymentConfigurations");
        this.f36956a = dVar;
        this.f36957b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final List m47232e(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31453a aVar = (C31453a) it.next();
            PaymentProviderConfiguration paymentProviderConfiguration = new PaymentProviderConfiguration();
            paymentProviderConfiguration.f81344id = aVar.mo71827j();
            paymentProviderConfiguration.serviceId = aVar.mo71836s();
            paymentProviderConfiguration.paymentServiceId = aVar.mo71832o();
            paymentProviderConfiguration.serviceType = aVar.mo71840v();
            paymentProviderConfiguration.debtServiceId = aVar.mo71824h();
            paymentProviderConfiguration.commission = aVar.mo71822f();
            paymentProviderConfiguration.serviceCategory = aVar.mo71835r();
            paymentProviderConfiguration.serviceName = aVar.mo71837t();
            paymentProviderConfiguration.channel = aVar.mo71820e();
            paymentProviderConfiguration.orderingNumber = Integer.valueOf(aVar.mo71830m());
            paymentProviderConfiguration.logo = aVar.mo71828k();
            paymentProviderConfiguration.oldLogo = aVar.mo71829l();
            paymentProviderConfiguration.additionalData = aVar.mo71816a();
            paymentProviderConfiguration.isTemplateAccessAllowed = aVar.mo71815A();
            paymentProviderConfiguration.hasDebt = aVar.mo71826i();
            paymentProviderConfiguration.isDDAllowed = aVar.mo71843y();
            paymentProviderConfiguration.payAmountLimit = aVar.mo71831n();
            arrayList.add(paymentProviderConfiguration);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m47233g() {
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m47234h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final List m47235i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (List) lVar.invoke(obj);
    }

    /* renamed from: f */
    public final void mo32898f() {
        this.f36956a.mo72029a().mo94888G(new C12285c0(), new C12287d0(C12292a.f36958d));
        C27954d.m86305k(this.f36957b.mo72028a().mo95026k0(new C12289e0(new C12293b(this))));
    }
}
