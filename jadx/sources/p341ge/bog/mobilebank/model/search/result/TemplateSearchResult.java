package p341ge.bog.mobilebank.model.search.result;

import p341ge.bog.mobilebank.model.search.SearchResultObject;

/* renamed from: ge.bog.mobilebank.model.search.result.TemplateSearchResult */
public class TemplateSearchResult extends SearchResultObject {
    private String benefProfilePicture;
    private long templateId;
    private String templateName;

    public String getFooterText() {
        return null;
    }

    public String getHeaderText() {
        return null;
    }

    public String getLogo() {
        return this.benefProfilePicture;
    }

    public String getMiddleText() {
        return this.templateName;
    }

    public String getRightText() {
        return null;
    }

    public String getSearchResultId() {
        return String.valueOf(this.templateId);
    }

    public long getTemplateId() {
        return this.templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public void setTemplateId(long j) {
        this.templateId = j;
    }

    public void setTemplateName(String str) {
        this.templateName = str;
    }
}
