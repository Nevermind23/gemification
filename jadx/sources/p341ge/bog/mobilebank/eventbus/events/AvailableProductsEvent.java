package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.ProductType;

/* renamed from: ge.bog.mobilebank.eventbus.events.AvailableProductsEvent */
public class AvailableProductsEvent extends RootEvent {
    private ArrayList<ProductType> productTypes;

    public ArrayList<ProductType> getProductTypes() {
        return this.productTypes;
    }

    public void setProductTypes(ArrayList<ProductType> arrayList) {
        this.productTypes = arrayList;
    }
}
