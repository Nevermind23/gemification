package p341ge.bog.mobilebank.model.search;

/* renamed from: ge.bog.mobilebank.model.search.SearchPreferenceObject */
public class SearchPreferenceObject {
    SearchResultType searchObjectType;
    String searchResultObjectJson;

    public SearchPreferenceObject(SearchResultType searchResultType, String str) {
        this.searchObjectType = searchResultType;
        this.searchResultObjectJson = str;
    }

    public SearchResultType getSearchObjectType() {
        return this.searchObjectType;
    }

    public String getSearchResultObjectJson() {
        return this.searchResultObjectJson;
    }

    public SearchPreferenceObject() {
    }
}
