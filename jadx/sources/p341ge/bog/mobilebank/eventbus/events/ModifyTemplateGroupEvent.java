package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.template.TemplateGroup;

/* renamed from: ge.bog.mobilebank.eventbus.events.ModifyTemplateGroupEvent */
public class ModifyTemplateGroupEvent extends RootEvent {
    TemplateGroup templateGroup;

    public TemplateGroup getTemplateGroup() {
        return this.templateGroup;
    }

    public void setTemplateGroup(TemplateGroup templateGroup2) {
        this.templateGroup = templateGroup2;
    }
}
