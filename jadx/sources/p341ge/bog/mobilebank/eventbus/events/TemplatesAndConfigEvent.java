package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;

/* renamed from: ge.bog.mobilebank.eventbus.events.TemplatesAndConfigEvent */
public class TemplatesAndConfigEvent extends RootEvent {
    private TemplateBasketItemsWithPaymentConfig templatesWithPaymentConfig;

    public TemplateBasketItemsWithPaymentConfig getTemplatesWithPaymentConfig() {
        return this.templatesWithPaymentConfig;
    }

    public void setTemplatesWithPaymentConfig(TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig) {
        this.templatesWithPaymentConfig = templateBasketItemsWithPaymentConfig;
    }
}
