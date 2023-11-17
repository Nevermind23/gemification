package p341ge.bog.mobilebank.model.search;

import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.model.search.result.CcySearchResult;
import p341ge.bog.mobilebank.model.search.result.ContactSearchResult;
import p341ge.bog.mobilebank.model.search.result.CustomerProdSearchResult;
import p341ge.bog.mobilebank.model.search.result.MapObjectSearchResult;
import p341ge.bog.mobilebank.model.search.result.ProviderSearchResultObject;
import p341ge.bog.mobilebank.model.search.result.StatementSearchResult;
import p341ge.bog.mobilebank.model.search.result.TemplateGroupSearchResult;
import p341ge.bog.mobilebank.model.search.result.TemplateSearchResult;

/* renamed from: ge.bog.mobilebank.model.search.SearchDataWrapper */
public class SearchDataWrapper {
    private CustomerProdSearchResult[] accounts;
    private CustomerProdSearchResult[] bonds;
    private SearchResultObject[] bonusprogram;
    private ContactSearchResult[] contacts;
    private CustomerProdSearchResult[] creditcards;
    private CcySearchResult[] currencies;
    private CustomerProdSearchResult[] debits;
    private CustomerProdSearchResult[] deposits;
    private SearchResultObject[] gnt;
    private CustomerProdSearchResult[] loans;
    private MapObjectSearchResult[] locations;
    private StatementSearchResult[] myoperations;
    private ProviderSearchResultObject[] payments;
    private TemplateGroupSearchResult[] templategroups;
    private TemplateSearchResult[] templates;
    private SearchResultObject[] transfers;

    public List<SearchResultObject> generateSearchResultObjects(SearchResultType searchResultType) {
        ArrayList arrayList;
        ArrayList arrayList2;
        SearchResultObject[] searchResultObjectArr;
        SearchResultObject[] searchResultObjectArr2;
        SearchResultType searchResultType2 = searchResultType;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayMap arrayMap = new ArrayMap();
        SearchResultType searchResultType3 = SearchResultType.TYPE_TEMPLATE;
        arrayMap.put(searchResultType3, this.templates);
        SearchResultType searchResultType4 = SearchResultType.TYPE_TEMPLATE_GROUP;
        arrayMap.put(searchResultType4, this.templategroups);
        SearchResultType searchResultType5 = SearchResultType.TYPE_PAYMENT;
        arrayMap.put(searchResultType5, this.payments);
        SearchResultType searchResultType6 = SearchResultType.TYPE_CONTACT;
        arrayMap.put(searchResultType6, this.contacts);
        SearchResultType searchResultType7 = SearchResultType.TYPE_TRANSFERS;
        arrayMap.put(searchResultType7, this.transfers);
        SearchResultType searchResultType8 = SearchResultType.TYPE_LOCATION;
        arrayMap.put(searchResultType8, this.locations);
        SearchResultType searchResultType9 = SearchResultType.TYPE_CURRENCY;
        arrayMap.put(searchResultType9, this.currencies);
        SearchResultType searchResultType10 = SearchResultType.TYPE_ACCOUNT_AND_CARDS;
        arrayMap.put(searchResultType10, this.accounts);
        SearchResultType searchResultType11 = SearchResultType.TYPE_BONUS_PROGRAMS;
        arrayMap.put(searchResultType11, this.bonusprogram);
        SearchResultType searchResultType12 = SearchResultType.TYPE_CREDIT_CARD;
        arrayMap.put(searchResultType12, this.creditcards);
        SearchResultType searchResultType13 = SearchResultType.TYPE_LOANS;
        ArrayList arrayList5 = arrayList4;
        arrayMap.put(searchResultType13, this.loans);
        SearchResultType searchResultType14 = SearchResultType.TYPE_DEPOSIT;
        ArrayList arrayList6 = arrayList3;
        arrayMap.put(searchResultType14, this.deposits);
        SearchResultType searchResultType15 = SearchResultType.TYPE_BOND;
        arrayMap.put(searchResultType15, this.bonds);
        SearchResultType searchResultType16 = SearchResultType.TYPE_GT;
        SearchResultType searchResultType17 = searchResultType15;
        arrayMap.put(searchResultType16, this.gnt);
        SearchResultType searchResultType18 = SearchResultType.TYPE_MY_OPERATIONS;
        SearchResultType searchResultType19 = searchResultType16;
        arrayMap.put(searchResultType18, this.myoperations);
        SearchResultType searchResultType20 = SearchResultType.TYPE_DEBITS;
        arrayMap.put(searchResultType20, this.debits);
        SearchResultType[] searchResultTypeArr = {searchResultType3, searchResultType4, searchResultType5, searchResultType6, searchResultType7, searchResultType8, searchResultType9, searchResultType10, searchResultType11, searchResultType12, searchResultType13, searchResultType14, searchResultType17, searchResultType19, searchResultType18, searchResultType20};
        SearchResultType searchResultType21 = searchResultType;
        if (searchResultType21 == null || (searchResultObjectArr2 = (SearchResultObject[]) arrayMap.get(searchResultType21)) == null) {
            arrayList = arrayList5;
            arrayList2 = arrayList6;
        } else {
            if (searchResultObjectArr2.length > 0) {
                arrayList2 = arrayList6;
                arrayList2.add(new SearchResultHeader(SearchResultType.TYPE_SEARCH_RESULTS_HEADER, searchResultType21));
            } else {
                arrayList2 = arrayList6;
            }
            arrayList = arrayList5;
            arrayList.add(new SearchResultModule(SearchResultType.TYPE_SEARCH_RESULT_MODULE, searchResultType21));
            for (SearchResultObject searchResultObject : searchResultObjectArr2) {
                searchResultObject.setType(searchResultType21);
                arrayList2.add(searchResultObject);
            }
        }
        for (int i = 0; i < 16; i++) {
            SearchResultType searchResultType22 = searchResultTypeArr[i];
            if (!(searchResultType21 == searchResultType22 || (searchResultObjectArr = (SearchResultObject[]) arrayMap.get(searchResultType22)) == null)) {
                if (searchResultObjectArr.length > 0) {
                    arrayList2.add(new SearchResultHeader(SearchResultType.TYPE_SEARCH_RESULTS_HEADER, searchResultType22));
                }
                arrayList.add(new SearchResultModule(SearchResultType.TYPE_SEARCH_RESULT_MODULE, searchResultType22));
                for (SearchResultObject searchResultObject2 : searchResultObjectArr) {
                    searchResultObject2.setType(searchResultType22);
                    arrayList2.add(searchResultObject2);
                }
            }
        }
        if (arrayList.size() > 0) {
            arrayList2.addAll(0, arrayList);
            arrayList2.add(0, new SearchResultHeader(SearchResultType.TYPE_SEARCH_RESULTS_HEADER, SearchResultType.TYPE_SEARCH_RESULT_MODULE));
        }
        return arrayList2;
    }

    public CustomerProdSearchResult[] getAccounts() {
        return this.accounts;
    }

    public CustomerProdSearchResult[] getBonds() {
        return this.bonds;
    }

    public ContactSearchResult[] getContacts() {
        return this.contacts;
    }

    public CcySearchResult[] getCurrencies() {
        return this.currencies;
    }

    public CustomerProdSearchResult[] getDeposits() {
        return this.deposits;
    }

    public CustomerProdSearchResult[] getLoans() {
        return this.loans;
    }

    public MapObjectSearchResult[] getLocations() {
        return this.locations;
    }

    public StatementSearchResult[] getMyoperations() {
        return this.myoperations;
    }

    public ProviderSearchResultObject[] getPayments() {
        return this.payments;
    }

    public TemplateSearchResult[] getTemplates() {
        return this.templates;
    }

    public SearchResultObject[] getTransfers() {
        return this.transfers;
    }

    public void setAccounts(CustomerProdSearchResult[] customerProdSearchResultArr) {
        this.accounts = customerProdSearchResultArr;
    }

    public void setContacts(ContactSearchResult[] contactSearchResultArr) {
        this.contacts = contactSearchResultArr;
    }

    public void setCurrencies(CcySearchResult[] ccySearchResultArr) {
        this.currencies = ccySearchResultArr;
    }

    public void setDeposits(CustomerProdSearchResult[] customerProdSearchResultArr) {
        this.deposits = customerProdSearchResultArr;
    }

    public void setLoans(CustomerProdSearchResult[] customerProdSearchResultArr) {
        this.loans = customerProdSearchResultArr;
    }

    public void setLocations(MapObjectSearchResult[] mapObjectSearchResultArr) {
        this.locations = mapObjectSearchResultArr;
    }

    public void setPayments(ProviderSearchResultObject[] providerSearchResultObjectArr) {
        this.payments = providerSearchResultObjectArr;
    }

    public void setTemplates(TemplateSearchResult[] templateSearchResultArr) {
        this.templates = templateSearchResultArr;
    }

    public void setTransfers(SearchResultObject[] searchResultObjectArr) {
        this.transfers = searchResultObjectArr;
    }
}
