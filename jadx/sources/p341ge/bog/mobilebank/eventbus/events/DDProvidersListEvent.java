package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import java.util.HashSet;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.ddsto.DDProviderItem;

/* renamed from: ge.bog.mobilebank.eventbus.events.DDProvidersListEvent */
public class DDProvidersListEvent extends RootEvent {
    public HashSet<String> ddProviders;
    public Object instance;
    public ArrayList<DDProviderItem> providerItems;
}
