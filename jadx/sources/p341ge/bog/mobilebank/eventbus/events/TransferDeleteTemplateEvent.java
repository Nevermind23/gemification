package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.TransferDeleteTemplateEvent */
public class TransferDeleteTemplateEvent extends RootEvent {
    private long templateId;

    public long getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(long j) {
        this.templateId = j;
    }
}
