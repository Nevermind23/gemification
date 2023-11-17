package p341ge.bog.mobilebank.model.search.result;

import p341ge.bog.mobilebank.model.search.SearchResultObject;

/* renamed from: ge.bog.mobilebank.model.search.result.TemplateGroupSearchResult */
public class TemplateGroupSearchResult extends SearchResultObject {
    private String groupName;
    private int groupOrder;
    private String groupType;
    private long templateGroupId;

    public String getFooterText() {
        return null;
    }

    public String getGroupType() {
        return this.groupType;
    }

    public String getHeaderText() {
        return null;
    }

    public String getLogo() {
        return null;
    }

    public String getMiddleText() {
        return this.groupName;
    }

    public String getRightText() {
        return null;
    }

    public String getSearchResultId() {
        return String.valueOf(this.templateGroupId);
    }

    public long getTemplateGroupId() {
        return this.templateGroupId;
    }

    public void setTemplateGroupId(long j) {
        this.templateGroupId = j;
    }
}
