package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;

/* renamed from: ge.bog.mobilebank.eventbus.events.CTParkPenaltiesEvent */
public class CTParkPenaltiesEvent extends RootEvent {
    private ArrayList<TemplateBasketItem> CTParkPenalties;

    public ArrayList<TemplateBasketItem> getCTParkPenalties() {
        return this.CTParkPenalties;
    }

    public void setCTParkPenalties(ArrayList<TemplateBasketItem> arrayList) {
        this.CTParkPenalties = arrayList;
    }
}
