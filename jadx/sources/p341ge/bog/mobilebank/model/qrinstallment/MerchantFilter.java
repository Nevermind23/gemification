package p341ge.bog.mobilebank.model.qrinstallment;

import java.util.List;

/* renamed from: ge.bog.mobilebank.model.qrinstallment.MerchantFilter */
public class MerchantFilter {
    private List<MerchantCategory> categories;
    private List<MerchantCity> citiesAndRegions;

    public List<MerchantCategory> getCategories() {
        return this.categories;
    }

    public List<MerchantCity> getCitiesAndRegions() {
        return this.citiesAndRegions;
    }

    public void setCategories(List<MerchantCategory> list) {
        this.categories = list;
    }

    public void setCitiesAndRegions(List<MerchantCity> list) {
        this.citiesAndRegions = list;
    }
}
