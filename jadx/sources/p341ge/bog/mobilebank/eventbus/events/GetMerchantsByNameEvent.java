package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.Merchant;

/* renamed from: ge.bog.mobilebank.eventbus.events.GetMerchantsByNameEvent */
public class GetMerchantsByNameEvent extends RootEvent {
    private List<Merchant> merchantList;

    public List<Merchant> getMerchantList() {
        return this.merchantList;
    }

    public void setMerchantList(List<Merchant> list) {
        this.merchantList = list;
    }
}
