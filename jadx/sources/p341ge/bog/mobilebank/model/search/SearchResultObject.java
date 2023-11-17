package p341ge.bog.mobilebank.model.search;

/* renamed from: ge.bog.mobilebank.model.search.SearchResultObject */
public abstract class SearchResultObject {
    private SearchResultType type;

    public abstract String getFooterText();

    public abstract String getHeaderText();

    public abstract String getLogo();

    public abstract String getMiddleText();

    public abstract String getRightText();

    public abstract String getSearchResultId();

    public SearchResultType getType() {
        return this.type;
    }

    public void setType(SearchResultType searchResultType) {
        this.type = searchResultType;
    }
}
