package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;

/* renamed from: ge.bog.mobilebank.eventbus.events.ModifyTemplateEvent */
public class ModifyTemplateEvent extends RootEvent {
    TemplateBasketItem template;

    public TemplateBasketItem getTemplate() {
        return this.template;
    }

    public void setTemplate(TemplateBasketItem templateBasketItem) {
        this.template = templateBasketItem;
    }
}
