package p341ge.bog.mobilebank.p975ui.fragments;

import p341ge.bog.mobilebank.model.search.SearchResultType;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.fragments.q1 */
public class C35660q1 extends C35651n1 {
    /* renamed from: i1 */
    public static C35660q1 m105895i1(boolean z) {
        C35660q1 q1Var = new C35660q1();
        q1Var.setViewPagerFragment(z);
        return q1Var;
    }

    public String getHeaderText() {
        return getString(C10328q.header_text_cards);
    }

    public SearchResultType getSearchType() {
        return SearchResultType.TYPE_ACCOUNT_AND_CARDS;
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_saved_cards;
    }
}
