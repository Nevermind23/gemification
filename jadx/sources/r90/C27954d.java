package r90;

import ed1.C40749p;
import gd1.C40992a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;

/* renamed from: r90.d */
public abstract class C27954d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static List f71167a = Collections.emptyList();

    /* renamed from: c */
    private static void m86297c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentProviderConfiguration paymentProviderConfiguration = (PaymentProviderConfiguration) it.next();
            if (paymentProviderConfiguration.getServiceCategory() == null) {
                m86298d(paymentProviderConfiguration, list);
            }
        }
    }

    /* renamed from: d */
    private static void m86298d(PaymentProviderConfiguration paymentProviderConfiguration, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentProviderConfiguration paymentProviderConfiguration2 = (PaymentProviderConfiguration) it.next();
            if (paymentProviderConfiguration2.getServiceCategory() != null && paymentProviderConfiguration2.getServiceCategory().equals(paymentProviderConfiguration.getServiceId())) {
                paymentProviderConfiguration2.parentID = paymentProviderConfiguration.f81344id;
                if (paymentProviderConfiguration2.getServiceType().equals("C")) {
                    m86298d(paymentProviderConfiguration2, list);
                }
            }
        }
    }

    /* renamed from: e */
    private static void m86299e(PaymentProviderConfiguration paymentProviderConfiguration, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentProviderConfiguration paymentProviderConfiguration2 = (PaymentProviderConfiguration) it.next();
            if (paymentProviderConfiguration2.getServiceCategory() != null && paymentProviderConfiguration2.getServiceCategory().equals(paymentProviderConfiguration.getServiceId())) {
                paymentProviderConfiguration.addChild(paymentProviderConfiguration2);
                paymentProviderConfiguration2.setParent(paymentProviderConfiguration);
                if (paymentProviderConfiguration2.getServiceType().equals("C")) {
                    m86299e(paymentProviderConfiguration2, list);
                }
            }
        }
    }

    /* renamed from: f */
    public static PaymentProviderConfiguration m86300f(long j) {
        List<PaymentProviderConfiguration> i = m86303i();
        if (i != null && i.size() > 0) {
            for (PaymentProviderConfiguration paymentProviderConfiguration : i) {
                if (paymentProviderConfiguration != null && paymentProviderConfiguration.f81344id == j) {
                    return paymentProviderConfiguration;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public static PaymentProviderConfiguration m86301g(String str) {
        List<PaymentProviderConfiguration> i = m86303i();
        if (!(i == null || i.size() <= 0 || str == null)) {
            for (PaymentProviderConfiguration paymentProviderConfiguration : i) {
                if (paymentProviderConfiguration != null && str.equals(paymentProviderConfiguration.paymentServiceId)) {
                    return paymentProviderConfiguration;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    public static PaymentProviderConfiguration m86302h(String str) {
        List<PaymentProviderConfiguration> i = m86303i();
        if (!(i == null || i.size() <= 0 || str == null)) {
            for (PaymentProviderConfiguration paymentProviderConfiguration : i) {
                if (paymentProviderConfiguration != null && str.equals(paymentProviderConfiguration.serviceId)) {
                    return paymentProviderConfiguration;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    public static List m86303i() {
        return f71167a;
    }

    /* renamed from: j */
    public static String m86304j(String str) {
        PaymentProviderConfiguration h = m86302h(str);
        if (h != null) {
            return h.getLogo();
        }
        return null;
    }

    /* renamed from: k */
    public static void m86305k(C40749p pVar) {
        pVar.mo95026k0(new C27952b()).mo95027o0(C40992a.m118827a()).mo94981F0(new C27953c());
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ List m86306l(List list) {
        m86297c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentProviderConfiguration paymentProviderConfiguration = (PaymentProviderConfiguration) it.next();
            if (paymentProviderConfiguration.getServiceCategory() == null) {
                m86299e(paymentProviderConfiguration, list);
            }
        }
        return list;
    }
}
