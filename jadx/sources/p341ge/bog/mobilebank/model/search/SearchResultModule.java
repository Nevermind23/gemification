package p341ge.bog.mobilebank.model.search;

/* renamed from: ge.bog.mobilebank.model.search.SearchResultModule */
public class SearchResultModule extends SearchResultObject {
    SearchResultType subType;

    public SearchResultModule(SearchResultType searchResultType, SearchResultType searchResultType2) {
        setType(searchResultType);
        this.subType = searchResultType2;
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
        return null;
    }

    public String getRightText() {
        return null;
    }

    public String getSearchResultId() {
        return null;
    }

    public SearchResultType getSubType() {
        return this.subType;
    }
}
