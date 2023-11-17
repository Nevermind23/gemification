package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.search.SearchDataWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.events.SearchDataEvent */
public class SearchDataEvent extends RootEvent {
    private SearchDataWrapper mSearchDataWrapper;

    public SearchDataEvent() {
    }

    public SearchDataWrapper getSearchDataWrapper() {
        return this.mSearchDataWrapper;
    }

    public void setSearchDataWrapper(SearchDataWrapper searchDataWrapper) {
        this.mSearchDataWrapper = searchDataWrapper;
    }

    public SearchDataEvent(SearchDataWrapper searchDataWrapper) {
        this.mSearchDataWrapper = searchDataWrapper;
    }
}
