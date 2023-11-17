package p341ge.bog.mobilebank.model.search.result;

import p341ge.bog.mobilebank.model.search.SearchResultObject;

/* renamed from: ge.bog.mobilebank.model.search.result.CcySearchResult */
public class CcySearchResult extends SearchResultObject {
    private String ccy;
    private String name;

    public String getCcy() {
        return this.ccy;
    }

    public String getFooterText() {
        return null;
    }

    public String getHeaderText() {
        return null;
    }

    public String getLogo() {
        return null;
    }

    public String getMiddleText() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public String getRightText() {
        return null;
    }

    public String getSearchResultId() {
        return this.ccy;
    }

    public void setCcy(String str) {
        this.ccy = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
