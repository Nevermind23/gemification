package p341ge.bog.mobilebank.model.search;

import androidx.collection.ArrayMap;

/* renamed from: ge.bog.mobilebank.model.search.SearchResultType */
public enum SearchResultType {
    TYPE_TEMPLATE(0),
    TYPE_TEMPLATE_GROUP(1),
    TYPE_PAYMENT(2),
    TYPE_CONTACT(3),
    TYPE_CURRENCY(4),
    TYPE_ACCOUNT_AND_CARDS(5),
    TYPE_CREDIT_CARD(6),
    TYPE_LOANS(7),
    TYPE_DEBITS(8),
    TYPE_MY_OPERATIONS(9),
    TYPE_DEPOSIT(10),
    TYPE_BOND(11),
    TYPE_LOCATION(12),
    TYPE_GT(13),
    TYPE_TRANSFERS(14),
    TYPE_BONUS_PROGRAMS(15),
    TYPE_RECENT_SEARCH(16),
    TYPE_SEARCH_RESULTS_HEADER(17),
    TYPE_SEARCH_RESULT_MODULE(18);
    
    private static ArrayMap<Integer, SearchResultType> map;
    private int searchResultTypeNo;

    static {
        int i;
        map = new ArrayMap<>();
        for (SearchResultType searchResultType : values()) {
            map.put(Integer.valueOf(searchResultType.searchResultTypeNo), searchResultType);
        }
    }

    private SearchResultType(int i) {
        this.searchResultTypeNo = i;
    }

    public int getIntValue() {
        return this.searchResultTypeNo;
    }

    public static SearchResultType valueOf(int i) {
        return map.get(Integer.valueOf(i));
    }
}
