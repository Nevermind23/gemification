package p341ge.bog.mobilebank.model;

import java.util.ArrayList;

/* renamed from: ge.bog.mobilebank.model.ExternalPaymentDetails */
public class ExternalPaymentDetails {
    private ArrayList<PaymentDataObject> paymentDetails;

    public ExternalPaymentDetails() {
    }

    public ArrayList<PaymentDataObject> getPaymentDetails() {
        return this.paymentDetails;
    }

    public ExternalPaymentDetails(ArrayList<PaymentDataObject> arrayList) {
        this.paymentDetails = arrayList;
    }
}
