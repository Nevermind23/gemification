package f60;

import f60.C20444f;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;

/* renamed from: f60.c */
public final class C20441c implements C20444f {

    /* renamed from: a */
    private final TemplateGroup f55422a;

    /* renamed from: b */
    private final TemplateBasketItemsWithPaymentConfig f55423b;

    /* renamed from: c */
    private final C20444f.C20445a f55424c = C20444f.C20445a.TemplateGroup;

    public C20441c(TemplateGroup templateGroup, TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig) {
        C41536l.m120489i(templateGroup, "templateGroupItem");
        C41536l.m120489i(templateBasketItemsWithPaymentConfig, "templatesGroupItem");
        this.f55422a = templateGroup;
        this.f55423b = templateBasketItemsWithPaymentConfig;
    }

    /* renamed from: a */
    public C20444f.C20445a mo48943a() {
        return this.f55424c;
    }

    /* renamed from: b */
    public final TemplateGroup mo48951b() {
        return this.f55422a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20441c)) {
            return false;
        }
        C20441c cVar = (C20441c) obj;
        return C41536l.m120484d(this.f55422a, cVar.f55422a) && C41536l.m120484d(this.f55423b, cVar.f55423b);
    }

    public int hashCode() {
        return (this.f55422a.hashCode() * 31) + this.f55423b.hashCode();
    }

    public String toString() {
        TemplateGroup templateGroup = this.f55422a;
        TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig = this.f55423b;
        return "TemplateGroupItem(templateGroupItem=" + templateGroup + ", templatesGroupItem=" + templateBasketItemsWithPaymentConfig + ")";
    }
}
