package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;

/* renamed from: ge.bog.mobilebank.eventbus.events.TransferTemplatesEvent */
public class TransferTemplatesEvent extends RootEvent {
    private ArrayList<TemplateBasketItem> templates;

    public ArrayList<TemplateBasketItem> getTemplates() {
        return this.templates;
    }

    public void setTemplates(ArrayList<TemplateBasketItem> arrayList) {
        this.templates = arrayList;
    }
}
