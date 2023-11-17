package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.BogCountry;

/* renamed from: ge.bog.mobilebank.eventbus.events.CountriesEvent */
public class CountriesEvent extends RootEvent {
    public List<BogCountry> countries;
}
