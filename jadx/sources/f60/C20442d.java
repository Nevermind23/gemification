package f60;

import f60.C20444f;
import g91.C32315k0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.eventbus.events.TemplateDebtEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;

/* renamed from: f60.d */
public final class C20442d implements C20444f {

    /* renamed from: a */
    private final TemplateBasketItem f55425a;

    /* renamed from: b */
    private final Client f55426b;

    /* renamed from: c */
    private final TemplateBasketItemsWithPaymentConfig f55427c;

    /* renamed from: d */
    private final C20444f.C20445a f55428d = C20444f.C20445a.Template;

    /* renamed from: e */
    private String f55429e = mo48955c();

    public C20442d(TemplateBasketItem templateBasketItem, Client client, TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig) {
        C41536l.m120489i(templateBasketItem, "template");
        C41536l.m120489i(client, "client");
        C41536l.m120489i(templateBasketItemsWithPaymentConfig, "templateBasketItemsWithPaymentConfig");
        this.f55425a = templateBasketItem;
        this.f55426b = client;
        this.f55427c = templateBasketItemsWithPaymentConfig;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (kotlin.jvm.internal.C41536l.m120484d(r13, r0) != false) goto L_0x000e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m66609b(p341ge.bog.mobilebank.model.template.TemplateBasketItem r13) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            java.lang.String r13 = r13.getAmount()     // Catch:{ Exception -> 0x002a }
            if (r13 == 0) goto L_0x000e
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r13, r0)     // Catch:{ Exception -> 0x0029 }
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            java.lang.String r13 = "0"
        L_0x0010:
            java.lang.String r1 = ".00"
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r13
            java.lang.String r0 = cf1.C40439w.m117103B(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r7 = ".0"
            java.lang.String r8 = ""
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r0
            java.lang.String r13 = cf1.C40439w.m117103B(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x002a }
            goto L_0x002b
        L_0x0029:
            r0 = r13
        L_0x002a:
            r13 = r0
        L_0x002b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: f60.C20442d.m66609b(ge.bog.mobilebank.model.template.TemplateBasketItem):java.lang.String");
    }

    /* renamed from: a */
    public C20444f.C20445a mo48943a() {
        return this.f55428d;
    }

    /* renamed from: c */
    public final String mo48955c() {
        if (!this.f55425a.canGetDebt() && !this.f55425a.isCTParkItem()) {
            return m66609b(this.f55425a);
        }
        int debtAmount = this.f55425a.getDebtAmount();
        StringBuilder sb = new StringBuilder();
        sb.append(debtAmount);
        return sb.toString();
    }

    /* renamed from: d */
    public final TemplateBasketItem mo48956d() {
        return this.f55425a;
    }

    /* renamed from: e */
    public final String mo48957e() {
        PaymentDebtResponse paymentDebt;
        PaymentServiceConfig paymentServiceConfigOfItem = this.f55427c.getPaymentServiceConfigOfItem(this.f55425a);
        if (paymentServiceConfigOfItem == null) {
            return null;
        }
        String parameterIdByParamType = paymentServiceConfigOfItem.getParameterIdByParamType("N");
        if (!this.f55425a.canGetDebt()) {
            return this.f55425a.getParameterValue(parameterIdByParamType, 0);
        }
        TemplateDebtEvent templateDebtEvent = this.f55425a.getTemplateDebtEvent();
        if (templateDebtEvent == null || (paymentDebt = templateDebtEvent.getPaymentDebt()) == null) {
            return null;
        }
        return paymentDebt.getValueByKey(parameterIdByParamType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20442d)) {
            return false;
        }
        C20442d dVar = (C20442d) obj;
        return C41536l.m120484d(this.f55425a, dVar.f55425a) && C41536l.m120484d(this.f55426b, dVar.f55426b) && C41536l.m120484d(this.f55427c, dVar.f55427c);
    }

    /* renamed from: f */
    public final String mo48959f() {
        return C32315k0.m95275x(this.f55427c, this.f55425a, false);
    }

    /* renamed from: g */
    public final String mo48960g() {
        return this.f55425a.getTemplateNameOrServiceName(this.f55426b);
    }

    /* renamed from: h */
    public final void mo48961h(String str) {
        String str2;
        if (str != null) {
            str2 = C40439w.m117103B(str, ".0", "", false, 4, (Object) null);
        } else {
            str2 = null;
        }
        this.f55429e = str2;
    }

    public int hashCode() {
        return (((this.f55425a.hashCode() * 31) + this.f55426b.hashCode()) * 31) + this.f55427c.hashCode();
    }

    public String toString() {
        TemplateBasketItem templateBasketItem = this.f55425a;
        Client client = this.f55426b;
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig = this.f55427c;
        return "TemplateItem(template=" + templateBasketItem + ", client=" + client + ", templateBasketItemsWithPaymentConfig=" + templateBasketItemsWithPaymentConfig + ")";
    }
}
