package p341ge.bog.mobilebank.eventbus.events;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.AgreementTemplateEvent */
public final class AgreementTemplateEvent extends RootEvent {
    private String contractTypeId = "";
    private String html = "";
    private String requestTag = "";
    private String templateVersionId = "";

    public final String getContractTypeId() {
        return this.contractTypeId;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getRequestTag() {
        return this.requestTag;
    }

    public final String getTemplateVersionId() {
        return this.templateVersionId;
    }

    public final void setContractTypeId(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.contractTypeId = str;
    }

    public final void setHtml(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.html = str;
    }

    public final void setRequestTag(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.requestTag = str;
    }

    public final void setTemplateVersionId(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.templateVersionId = str;
    }
}
