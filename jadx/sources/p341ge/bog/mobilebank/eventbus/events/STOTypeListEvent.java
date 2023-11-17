package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.ddsto.STOType;

/* renamed from: ge.bog.mobilebank.eventbus.events.STOTypeListEvent */
public class STOTypeListEvent extends RootEvent {
    public ArrayList<STOType> stoTypes;
}
