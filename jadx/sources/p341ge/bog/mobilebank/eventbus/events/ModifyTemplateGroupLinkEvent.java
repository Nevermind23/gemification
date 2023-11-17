package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.ModifyTemplateGroupLinkEvent */
public class ModifyTemplateGroupLinkEvent extends RootEvent {
    String operationKey;
    long templateGroupId;
    String templateIds;

    public ModifyTemplateGroupLinkEvent(long j, String str, String str2) {
        this.templateGroupId = j;
        this.templateIds = str;
        this.operationKey = str2;
    }

    public String getOperationKey() {
        return this.operationKey;
    }

    public long getTemplateGroupId() {
        return this.templateGroupId;
    }

    public String getTemplateIds() {
        return this.templateIds;
    }

    public void setOperationKey(String str) {
        this.operationKey = str;
    }

    public void setTemplateGroupId(long j) {
        this.templateGroupId = j;
    }

    public void setTemplateIds(String str) {
        this.templateIds = str;
    }
}
