package p341ge.bog.mobilebank.eventbus.event;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.ddsto.STOPeriodType;

/* renamed from: ge.bog.mobilebank.eventbus.event.DDPeriodTypesEvent */
public class DDPeriodTypesEvent extends RootEvent {
    public ArrayList<STOPeriodType> ddPeriodTypes;
}
