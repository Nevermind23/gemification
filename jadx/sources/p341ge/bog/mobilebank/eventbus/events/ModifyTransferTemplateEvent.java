package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.TransferTemplateObject;

/* renamed from: ge.bog.mobilebank.eventbus.events.ModifyTransferTemplateEvent */
public class ModifyTransferTemplateEvent extends RootEvent {
    public TransferTemplateObject template;
}
