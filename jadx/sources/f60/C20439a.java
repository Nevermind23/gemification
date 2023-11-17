package f60;

import f60.C20444f;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;

/* renamed from: f60.a */
public final class C20439a implements C20444f {

    /* renamed from: a */
    private final PaymentProviderConfiguration f55419a;

    /* renamed from: b */
    private final C20444f.C20445a f55420b = C20444f.C20445a.Provider;

    public C20439a(PaymentProviderConfiguration paymentProviderConfiguration) {
        C41536l.m120489i(paymentProviderConfiguration, "provider");
        this.f55419a = paymentProviderConfiguration;
    }

    /* renamed from: a */
    public C20444f.C20445a mo48943a() {
        return this.f55420b;
    }

    /* renamed from: b */
    public final PaymentProviderConfiguration mo48944b() {
        return this.f55419a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20439a) && C41536l.m120484d(this.f55419a, ((C20439a) obj).f55419a);
    }

    public int hashCode() {
        return this.f55419a.hashCode();
    }

    public String toString() {
        PaymentProviderConfiguration paymentProviderConfiguration = this.f55419a;
        return "ProviderItem(provider=" + paymentProviderConfiguration + ")";
    }
}
