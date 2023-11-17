package p341ge.bog.mobilebank.model.search.result;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.search.SearchResultObject;

/* renamed from: ge.bog.mobilebank.model.search.result.StatementHeaderSearchResult */
public final class StatementHeaderSearchResult extends SearchResultObject {
    private String dateTitle;

    public StatementHeaderSearchResult(String str) {
        C41536l.m120489i(str, "dateTitle");
        this.dateTitle = str;
    }

    public String getFooterText() {
        return null;
    }

    public String getHeaderText() {
        return this.dateTitle;
    }

    public String getLogo() {
        return null;
    }

    public String getMiddleText() {
        return null;
    }

    public String getRightText() {
        return null;
    }

    public String getSearchResultId() {
        return null;
    }

    public final void setDateTitle(String str) {
        C41536l.m120489i(str, "dateTitle");
        this.dateTitle = str;
    }
}
