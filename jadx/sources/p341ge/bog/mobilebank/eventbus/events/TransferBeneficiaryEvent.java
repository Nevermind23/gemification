package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.Beneficiary;

/* renamed from: ge.bog.mobilebank.eventbus.events.TransferBeneficiaryEvent */
public class TransferBeneficiaryEvent extends RootEvent {
    public ArrayList<Beneficiary> beneficiaries;
}
