package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;

/* renamed from: ge.bog.mobilebank.eventbus.events.CTPark6MonthsEvent */
public class CTPark6MonthsEvent extends RootEvent {
    private ArrayList<TemplateBasketItem> CTPark6Months;

    public ArrayList<TemplateBasketItem> getCTPark6Months() {
        return this.CTPark6Months;
    }

    public void setCTPark6Months(ArrayList<TemplateBasketItem> arrayList) {
        this.CTPark6Months = arrayList;
    }
}
