package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import java.util.HashSet;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.BonusProvider;

/* renamed from: ge.bog.mobilebank.eventbus.events.BonusProvidersEvent */
public class BonusProvidersEvent extends RootEvent {
    private HashSet<String> bonusProviderServiceIds;
    private ArrayList<BonusProvider> bonusProviders;
    private String bonusType;
    private String prodType;

    public HashSet<String> getBonusProviderServiceIds() {
        return this.bonusProviderServiceIds;
    }

    public ArrayList<BonusProvider> getBonusProviders() {
        return this.bonusProviders;
    }

    public String getBonusType() {
        return this.bonusType;
    }

    public String getProdType() {
        return this.prodType;
    }

    public void setBonusProviderServiceIds(HashSet<String> hashSet) {
        this.bonusProviderServiceIds = hashSet;
    }

    public void setBonusProviders(ArrayList<BonusProvider> arrayList) {
        this.bonusProviders = arrayList;
    }

    public void setBonusType(String str) {
        this.bonusType = str;
    }

    public void setProdType(String str) {
        this.prodType = str;
    }
}
