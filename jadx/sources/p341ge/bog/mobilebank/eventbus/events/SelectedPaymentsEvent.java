package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.SelectedPayment;

/* renamed from: ge.bog.mobilebank.eventbus.events.SelectedPaymentsEvent */
public class SelectedPaymentsEvent extends RootEvent {
    private ArrayList<SelectedPayment> selectedPayments;

    public ArrayList<SelectedPayment> getSelectedPayments() {
        return this.selectedPayments;
    }

    public void setSelectedPayments(ArrayList<SelectedPayment> arrayList) {
        this.selectedPayments = arrayList;
    }
}
