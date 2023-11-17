package p341ge.bog.mobilebank.model;

import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.PaymentCommissionRequest */
public class PaymentCommissionRequest {
    private ArrayList<ArrayList<KeyValue>> providersCommissionDetails;

    public PaymentCommissionRequest(ArrayList<ArrayList<KeyValue>> arrayList) {
        this.providersCommissionDetails = arrayList;
    }
}
