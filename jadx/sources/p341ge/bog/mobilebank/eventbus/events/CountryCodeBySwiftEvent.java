package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBank;

/* renamed from: ge.bog.mobilebank.eventbus.events.CountryCodeBySwiftEvent */
public class CountryCodeBySwiftEvent extends RootEvent {
    public ForeignBank foreignBank;
    public String swift;
    public String tag;
}
