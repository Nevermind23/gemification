package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30530ab;
import a81.C30544bb;
import a81.C30798ua;
import a81.C30811va;
import a81.C30824wa;
import a81.C30837xa;
import a81.C30850ya;
import a81.C30863za;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import ee1.C40767b;
import g81.C32152f0;
import g91.C32289b0;
import g91.C32297d;
import g91.C32338u0;
import g91.C32343x;
import gd1.C40992a;
import iu0.C36546y;
import j81.C36764f;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jg1.C41438c;
import jg1.C41452l;
import p341ge.bog.mobilebank.eventbus.events.SearchDataEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.search.SearchDataWrapper;
import p341ge.bog.mobilebank.model.search.SearchResultHeader;
import p341ge.bog.mobilebank.model.search.SearchResultObject;
import p341ge.bog.mobilebank.model.search.SearchResultType;
import p341ge.bog.mobilebank.model.search.result.StatementSearchResult;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p342j$.lang.Iterable$EL;
import p342j$.util.Collection$EL;
import p342j$.util.stream.Collectors;
import p366bk.C10324m;
import p750ew.C20300c;
import p90.C27471y1;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.SearchActivity */
public class SearchActivity extends C35435l0 implements C36764f {

    /* renamed from: G */
    private C27471y1 f85472G;

    /* renamed from: H */
    private C32152f0 f85473H;

    /* renamed from: I */
    private ArrayList f85474I;

    /* renamed from: J */
    private SearchResultType f85475J;

    /* renamed from: K */
    boolean f85476K;

    /* renamed from: L */
    C40767b f85477L = C40767b.m118210h1();

    /* renamed from: M */
    C20300c f85478M;

    /* renamed from: N */
    protected RootBankApiManager f85479N;

    /* renamed from: O */
    protected Client f85480O;

    /* renamed from: P */
    protected C41438c f85481P;

    /* renamed from: Q */
    protected PreferencesApiManager f85482Q;

    /* renamed from: ge.bog.mobilebank.ui.activities.SearchActivity$a */
    static /* synthetic */ class C35325a {

        /* renamed from: a */
        static final /* synthetic */ int[] f85483a;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ge.bog.mobilebank.model.search.SearchResultType[] r0 = p341ge.bog.mobilebank.model.search.SearchResultType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f85483a = r0
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_TEMPLATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_TEMPLATE_GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_PAYMENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CONTACT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x003e }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CURRENCY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x0049 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_ACCOUNT_AND_CARDS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x0054 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x0060 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_LOANS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x006c }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_BOND     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x0078 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x0084 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_GT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x0090 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_TRANSFERS     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x009c }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_MY_OPERATIONS     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_DEBITS     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_LOCATION     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f85483a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_BONUS_PROGRAMS     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.SearchActivity.C35325a.<clinit>():void");
        }
    }

    /* renamed from: O2 */
    private List m104769O2(List list) {
        return (List) Collection$EL.stream(list).filter(new C30850ya()).collect(Collectors.toList());
    }

    /* renamed from: P2 */
    private List m104770P2(List list) {
        return (List) Collection$EL.stream(list).filter(new C30544bb()).collect(Collectors.toList());
    }

    /* renamed from: Q2 */
    private List m104771Q2(List list) {
        List P2 = m104770P2(list);
        LinkedList linkedList = new LinkedList();
        Iterable$EL.forEach(P2, new C30837xa(linkedList));
        return linkedList;
    }

    /* renamed from: S2 */
    private void m104772S2() {
        this.f85472G.f70254g.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public static /* synthetic */ boolean m104773T2(SearchResultObject searchResultObject) {
        return !(searchResultObject instanceof StatementSearchResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static /* synthetic */ boolean m104774U2(SearchResultObject searchResultObject) {
        return searchResultObject instanceof StatementSearchResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public /* synthetic */ void m104776W2(SearchDataWrapper searchDataWrapper, List list) {
        C32338u0.m95374e(searchDataWrapper.getMyoperations(), list);
        m104782c3(searchDataWrapper);
        m104772S2();
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public /* synthetic */ void m104777X2(SearchDataWrapper searchDataWrapper, Throwable th) {
        m104782c3(searchDataWrapper);
        m104772S2();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public /* synthetic */ void m104778Y2(String str) {
        this.f85479N.searchData(str, 0, 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public /* synthetic */ void m104779Z2(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public /* synthetic */ void m104780a3(String str) {
        if (str.length() > 2) {
            this.f85476K = false;
            m104785f3();
            C36546y.m108282F().mo27152s("search", str, "search");
            C36546y.m108282F().mo27139J(str);
            this.f85477L.onNext(str);
            return;
        }
        this.f85476K = true;
        this.f85473H.mo72670r(this.f85474I);
        m104772S2();
    }

    /* renamed from: b3 */
    private void m104781b3(SearchDataWrapper searchDataWrapper) {
        C20300c cVar = this.f85478M;
        if (cVar != null) {
            mo86438k1(cVar.mo48784a().mo95063B(C40992a.m118827a()).mo95070I(new C30798ua(this, searchDataWrapper), new C30811va(this, searchDataWrapper)));
            return;
        }
        m104782c3(searchDataWrapper);
        m104772S2();
    }

    /* renamed from: c3 */
    private void m104782c3(SearchDataWrapper searchDataWrapper) {
        List<SearchResultObject> generateSearchResultObjects = searchDataWrapper.generateSearchResultObjects(this.f85475J);
        List O2 = m104769O2(generateSearchResultObjects);
        O2.addAll(m104771Q2(generateSearchResultObjects));
        this.f85473H.mo72669q(O2);
    }

    /* renamed from: d3 */
    private void m104783d3() {
        m104784e3();
        if (this.f85473H == null) {
            C32152f0 f0Var = new C32152f0(this.f85474I, this.f85480O.isAuthorized(), this.f85480O);
            this.f85473H = f0Var;
            f0Var.mo72671s(this);
        }
        this.f85472G.f70252e.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.f85472G.f70252e.setAdapter(this.f85473H);
    }

    /* renamed from: e3 */
    private void m104784e3() {
        this.f85472G.f70255h.setNavigationOnClickListener(new C30863za(this));
        this.f85472G.f70255h.mo36690f();
        this.f85472G.f70255h.setOnTextChangeListener(new C30530ab(this));
    }

    /* renamed from: f3 */
    private void m104785f3() {
        this.f85472G.f70254g.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_search;
    }

    /* renamed from: M2 */
    public void mo86368M2(SearchResultObject searchResultObject) {
        int i = 1;
        while (true) {
            if (i >= this.f85474I.size()) {
                break;
            }
            SearchResultObject searchResultObject2 = (SearchResultObject) this.f85474I.get(i);
            if (searchResultObject2.getType() == searchResultObject.getType() && searchResultObject2.getSearchResultId().equals(searchResultObject.getSearchResultId())) {
                this.f85474I.remove(i);
                break;
            }
            i++;
        }
        if (this.f85474I.size() == 0) {
            this.f85474I.add(new SearchResultHeader(SearchResultType.TYPE_SEARCH_RESULTS_HEADER, SearchResultType.TYPE_RECENT_SEARCH));
        }
        this.f85474I.add(1, searchResultObject);
        if (this.f85474I.size() > 11) {
            this.f85474I.remove(11);
        }
        this.f85482Q.setRecentSearch(this.f85474I, C36546y.m108285N().mo89315M());
    }

    /* renamed from: N2 */
    public void mo86369N2() {
        m104785f3();
        this.f85474I = new ArrayList();
        this.f85482Q.clearRecentSearches(C36546y.m108285N().mo89315M());
        m104772S2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27471y1 d = C27471y1.m85191d(getLayoutInflater());
        this.f85472G = d;
        super.mo70996D2(bundle, d);
        C32343x.m95423W0(this.f85481P, this);
        try {
            this.f85474I = this.f85482Q.getRecentSearches(C36546y.m108285N().mo89315M());
        } catch (Exception unused) {
            this.f85474I = new ArrayList();
        }
        this.f85475J = SearchResultType.valueOf(getIntent().getIntExtra("SEARCH_TYPE", -1));
        m104783d3();
        mo86438k1(this.f85477L.mo95032s(500, TimeUnit.MILLISECONDS).mo94981F0(new C30824wa(this)));
    }

    /* renamed from: R2 */
    public String mo86370R2(SearchResultObject searchResultObject) {
        try {
            String logo = this.f85480O.getTemplateItemById(Long.valueOf(searchResultObject.getSearchResultId()).longValue()).getLogo();
            if (logo != null) {
                return C32289b0.m95093e(logo);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C32343x.m95489t1(this.f85481P, this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @C41452l
    public void onSearchDataEvent(SearchDataEvent searchDataEvent) {
        if (!this.f85476K) {
            int state = searchDataEvent.getState();
            if (state == 20) {
                m104781b3(searchDataEvent.getSearchDataWrapper());
            } else if (state == 30) {
                this.f85473H.mo72669q((List) null);
                m104772S2();
            } else if (state == 40) {
                C32297d.m95154b(this, C27950a.m86284a(searchDataEvent.getErrorKey()));
                this.f85473H.mo72669q((List) null);
                m104772S2();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: ge.bog.mobilebank.model.template.TemplateBasketItem} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: ge.bog.mobilebank.model.template.TemplateGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r15v6, types: [android.content.Intent] */
    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: type inference failed for: r15v11 */
    /* JADX WARNING: type inference failed for: r15v12 */
    /* JADX WARNING: type inference failed for: r15v13 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02f9, code lost:
        if (r1.equals("G") == false) goto L_0x02c7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x028f  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86372x(p341ge.bog.mobilebank.model.search.SearchResultObject r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            ge.bog.mobilebank.model.search.SearchResultType r2 = r17.getType()
            ge.bog.mobilebank.model.search.SearchResultType r3 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_SEARCH_RESULTS_HEADER
            r4 = 1
            if (r2 != r3) goto L_0x0016
            r2 = r1
            ge.bog.mobilebank.model.search.SearchResultHeader r2 = (p341ge.bog.mobilebank.model.search.SearchResultHeader) r2
            ge.bog.mobilebank.model.search.SearchResultType r2 = r2.getSubType()
        L_0x0014:
            r3 = r4
            goto L_0x0026
        L_0x0016:
            ge.bog.mobilebank.model.search.SearchResultType r3 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_SEARCH_RESULT_MODULE
            if (r2 != r3) goto L_0x0022
            r2 = r1
            ge.bog.mobilebank.model.search.SearchResultModule r2 = (p341ge.bog.mobilebank.model.search.SearchResultModule) r2
            ge.bog.mobilebank.model.search.SearchResultType r2 = r2.getSubType()
            goto L_0x0014
        L_0x0022:
            r16.mo86368M2(r17)
            r3 = 0
        L_0x0026:
            int[] r6 = p341ge.bog.mobilebank.p975ui.activities.SearchActivity.C35325a.f85483a
            int r7 = r2.ordinal()
            r6 = r6[r7]
            java.lang.String r7 = "I"
            java.lang.String r9 = "VIEW"
            java.lang.String r10 = "FRAGMENT_TYPE_PRODUCTS_KEY"
            java.lang.Class<ge.bog.mobilebank.ui.activities.SearchResultActivity> r11 = p341ge.bog.mobilebank.p975ui.activities.SearchResultActivity.class
            java.lang.Class<ge.bog.mobilebank.ui.activities.AllTemplateListActivity> r12 = p341ge.bog.mobilebank.p975ui.activities.AllTemplateListActivity.class
            java.lang.String r13 = "C"
            java.lang.Class<ge.bog.mobilebank.ui.activities.NewPaymentsActivity> r14 = p341ge.bog.mobilebank.p975ui.activities.NewPaymentsActivity.class
            r15 = 0
            java.lang.String r5 = "search"
            java.lang.String r8 = "open_result"
            switch(r6) {
                case 1: goto L_0x028f;
                case 2: goto L_0x0225;
                case 3: goto L_0x01a1;
                case 4: goto L_0x0182;
                case 5: goto L_0x0164;
                case 6: goto L_0x0126;
                case 7: goto L_0x0126;
                case 8: goto L_0x0158;
                case 9: goto L_0x0158;
                case 10: goto L_0x0158;
                case 11: goto L_0x0158;
                case 12: goto L_0x0118;
                case 13: goto L_0x00cc;
                case 14: goto L_0x0081;
                case 15: goto L_0x0063;
                case 16: goto L_0x0046;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x0349
        L_0x0046:
            ge.bog.mobilebank.model.Client r1 = r0.f85480O
            boolean r1 = r1.isAuthorized()
            if (r1 == 0) goto L_0x0349
            java.lang.String r1 = "module_loyalty_programs"
            ck.g r2 = iu0.C36546y.m108282F()
            r2.mo27152s(r5, r1, r8)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity> r2 = p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity.class
            r1.<init>(r0, r2)
            r0.startActivity(r1)
            goto L_0x0349
        L_0x0063:
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.ui.activities.MapActivity> r3 = p341ge.bog.mobilebank.p975ui.activities.MapActivity.class
            r2.<init>(r0, r3)
            java.lang.String r3 = "MAP_OBJECT_KEY"
            java.lang.String r1 = r17.getSearchResultId()
            r2.putExtra(r3, r1)
            java.lang.String r1 = "module_locations"
            ck.g r3 = iu0.C36546y.m108282F()
            r3.mo27152s(r5, r1, r8)
            r0.startActivity(r2)
            goto L_0x0349
        L_0x0081:
            if (r3 == 0) goto L_0x008f
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.ui.activities.DDSTOListActivity> r2 = p341ge.bog.mobilebank.p975ui.activities.DDSTOListActivity.class
            r1.<init>(r0, r2)
            r0.startActivity(r1)
            goto L_0x0349
        L_0x008f:
            ge.bog.mobilebank.model.search.result.CustomerProdSearchResult r1 = (p341ge.bog.mobilebank.model.search.result.CustomerProdSearchResult) r1
            long r2 = r1.getProductKey()
            java.lang.String r4 = "automatic_services"
            ck.g r6 = iu0.C36546y.m108282F()
            r6.mo27152s(r5, r4, r8)
            java.lang.String r4 = "DEB"
            java.lang.String r1 = r1.getProductCode()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x00bd
            ge.bog.mobilebank.payment.model.a$a r1 = p341ge.bog.mobilebank.payment.model.C33624a.m98713a(r16)
            java.lang.Class<ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity> r4 = p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity.class
            ge.bog.mobilebank.payment.model.a$a r1 = r1.mo79806f(r4)
            ge.bog.mobilebank.payment.model.a$a r1 = r1.mo79809i(r2)
            r1.mo79825y()
            goto L_0x0349
        L_0x00bd:
            java.lang.String r1 = "STO"
            ge.bog.mobilebank.transfers.model.TransferForm$I r1 = p341ge.bog.mobilebank.transfers.model.TransferForm.startWith((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r9)
            ge.bog.mobilebank.transfers.model.TransferForm$I r1 = r1.setDDKey(r2)
            r1.start()
            goto L_0x0349
        L_0x00cc:
            if (r3 == 0) goto L_0x00e8
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r11)
            int r2 = r2.getIntValue()
            r1.putExtra(r10, r2)
            java.lang.String r2 = "module_statement"
            ck.g r3 = iu0.C36546y.m108282F()
            r3.mo27152s(r5, r2, r8)
            r0.startActivity(r1)
            goto L_0x0349
        L_0x00e8:
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.ui.activities.OperationDetailsActivity> r3 = p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity.class
            r2.<init>(r0, r3)
            java.lang.String r3 = "PAYMENT_OPERATION_TYPE"
            r4 = 40
            r2.putExtra(r3, r4)
            ge.bog.mobilebank.model.search.result.StatementSearchResult r1 = (p341ge.bog.mobilebank.model.search.result.StatementSearchResult) r1
            java.lang.Long r3 = r1.getDocKey()
            java.lang.String r4 = "PAYMENT_DETAILS_ITEM_DOC_KEY"
            r2.putExtra(r4, r3)
            java.lang.String r3 = "PAYMENT_DETAILS_ITEM_ENTRY_ID"
            java.lang.Long r1 = r1.getEntryId()
            r2.putExtra(r3, r1)
            java.lang.String r1 = "item_statement"
            ck.g r3 = iu0.C36546y.m108282F()
            r3.mo27152s(r5, r1, r8)
            r0.startActivity(r2)
            goto L_0x0349
        L_0x0118:
            java.lang.String r1 = "module_products"
            ck.g r2 = iu0.C36546y.m108282F()
            r2.mo27152s(r5, r1, r8)
            r0.mo86447x2(r14)
            goto L_0x0349
        L_0x0126:
            if (r3 != 0) goto L_0x0158
            boolean r3 = r1 instanceof p341ge.bog.mobilebank.model.search.result.CustomerProdSearchResult
            if (r3 == 0) goto L_0x0158
            ge.bog.mobilebank.model.search.result.CustomerProdSearchResult r1 = (p341ge.bog.mobilebank.model.search.result.CustomerProdSearchResult) r1
            java.lang.String r3 = r1.getProductGroup()
            java.lang.String r4 = "ACCOUNT"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0158
            ge.bog.mobilebank.model.search.SearchResultType r3 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_ACCOUNT_AND_CARDS
            if (r2 != r3) goto L_0x014b
            q31.f r2 = q31.C38125h.m112238c(r16)
            long r3 = r1.getProductKey()
            r2.mo91593b(r0, r3)
            goto L_0x0349
        L_0x014b:
            q31.f r2 = q31.C38125h.m112238c(r16)
            long r3 = r1.getProductKey()
            r2.mo91546E(r0, r3)
            goto L_0x0349
        L_0x0158:
            g91.C32290b1.m95111a(r16)
            java.lang.Class<ge.bog.mobilebank.ui.activities.MainActivity> r1 = p341ge.bog.mobilebank.p975ui.activities.MainActivity.class
            g91.b r2 = g91.C32288b.OpenProductsOnMainActivity
            r0.mo86424F1(r1, r2)
            goto L_0x0349
        L_0x0164:
            java.lang.String r2 = "module_exchange_rates"
            ck.g r3 = iu0.C36546y.m108282F()
            r3.mo27152s(r5, r2, r8)
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.ui.activities.ExchangeActivity> r3 = p341ge.bog.mobilebank.p975ui.activities.ExchangeActivity.class
            r2.<init>(r0, r3)
            java.lang.String r3 = "RATES_CCY"
            java.lang.String r1 = r17.getSearchResultId()
            r2.putExtra(r3, r1)
            r0.startActivity(r2)
            goto L_0x0349
        L_0x0182:
            java.lang.String r2 = "module_contacts"
            ck.g r4 = iu0.C36546y.m108282F()
            r4.mo27152s(r5, r2, r8)
            if (r3 == 0) goto L_0x0192
            r0.mo86447x2(r14)
            goto L_0x0349
        L_0x0192:
            ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity$a r2 = p341ge.bog.mobilebank.cleanarch.presentation.contacts.details.activity.ContactDetailsActivity.f57629O
            java.lang.String r1 = r17.getSearchResultId()
            long r3 = java.lang.Long.parseLong(r1)
            r2.mo53868a(r0, r3)
            goto L_0x0349
        L_0x01a1:
            if (r3 == 0) goto L_0x01bd
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r11)
            int r2 = r2.getIntValue()
            r1.putExtra(r10, r2)
            java.lang.String r2 = "module_payments"
            ck.g r3 = iu0.C36546y.m108282F()
            r3.mo27152s(r5, r2, r8)
            r0.startActivity(r1)
            goto L_0x0349
        L_0x01bd:
            ge.bog.mobilebank.model.search.result.ProviderSearchResultObject r1 = (p341ge.bog.mobilebank.model.search.result.ProviderSearchResultObject) r1
            java.lang.String r2 = r1.getServiceId()
            ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r2 = r90.C27954d.m86302h(r2)
            if (r2 == 0) goto L_0x0349
            java.lang.String r3 = r2.getServiceType()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L_0x01f9
            java.lang.String r3 = r2.getAdditionalData()
            if (r3 == 0) goto L_0x01e4
            java.lang.String r3 = r2.getAdditionalData()
            boolean r3 = r3.equals(r13)
            if (r3 == 0) goto L_0x01e4
            goto L_0x01fa
        L_0x01e4:
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.ui.activities.ProviderListActivity> r3 = p341ge.bog.mobilebank.p975ui.activities.ProviderListActivity.class
            r15.<init>(r0, r3)
            java.lang.String r3 = "PROVIDER_LIST_IS_SHOW_ALL_LIST"
            r15.putExtra(r3, r4)
            java.lang.String r3 = "PAYMENT_CONFIGURATION_KEY"
            long r6 = r2.getId()
            r15.putExtra(r3, r6)
        L_0x01f9:
            r4 = 0
        L_0x01fa:
            ck.g r2 = iu0.C36546y.m108282F()
            java.lang.String r3 = "item_payments"
            r2.mo27152s(r5, r3, r8)
            if (r15 == 0) goto L_0x020a
            r0.startActivity(r15)
            goto L_0x0349
        L_0x020a:
            ge.bog.mobilebank.payment.model.a$a r2 = p341ge.bog.mobilebank.payment.model.C33624a.m98713a(r16)
            java.lang.Class<ge.bog.mobilebank.payment.activities.PaymentFormActivity> r3 = p341ge.bog.mobilebank.payment.activities.PaymentFormActivity.class
            ge.bog.mobilebank.payment.model.a$a r2 = r2.mo79806f(r3)
            java.lang.String r1 = r1.getServiceId()
            ge.bog.mobilebank.payment.model.a$a r1 = r2.mo79819s(r1)
            ge.bog.mobilebank.payment.model.a$a r1 = r1.mo79807g(r4)
            r1.mo79825y()
            goto L_0x0349
        L_0x0225:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0, r12)
            java.lang.String r4 = "module_template_group"
            if (r3 != 0) goto L_0x0283
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.ui.activities.PaymentsTemplateListActivity> r3 = p341ge.bog.mobilebank.p975ui.activities.PaymentsTemplateListActivity.class
            r2.<init>(r0, r3)
            java.lang.String r1 = r17.getSearchResultId()     // Catch:{ Exception -> 0x0247 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x0247 }
            long r9 = r1.longValue()     // Catch:{ Exception -> 0x0247 }
            ge.bog.mobilebank.model.Client r1 = r0.f85480O     // Catch:{ Exception -> 0x0247 }
            ge.bog.mobilebank.model.template.TemplateGroup r15 = r1.getTemplateGroupById(r9)     // Catch:{ Exception -> 0x0247 }
        L_0x0247:
            if (r15 == 0) goto L_0x0283
            java.lang.String r1 = r15.getGroupType()
            if (r1 == 0) goto L_0x025f
            java.lang.String r1 = r15.getGroupType()
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x025f
            r1 = 20
            java.lang.String r3 = "item_group_house"
        L_0x025d:
            r4 = r3
            goto L_0x0275
        L_0x025f:
            java.lang.String r1 = r15.getGroupType()
            if (r1 == 0) goto L_0x0274
            java.lang.String r1 = r15.getGroupType()
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0274
            r1 = 30
            java.lang.String r3 = "item_group_car"
            goto L_0x025d
        L_0x0274:
            r1 = -1
        L_0x0275:
            java.lang.String r3 = "PAYMENT_TEMPLATE_LIST_TYPE_KEY"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "PAYMENT_TEMPLATE_LIST_GROUP_KEY"
            long r6 = r15.getId()
            r2.putExtra(r1, r6)
        L_0x0283:
            ck.g r1 = iu0.C36546y.m108282F()
            r1.mo27152s(r5, r4, r8)
            r0.startActivity(r2)
            goto L_0x0349
        L_0x028f:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0, r12)
            java.lang.String r6 = "module_templates"
            if (r3 == 0) goto L_0x029d
            r0.mo86447x2(r14)
            goto L_0x0342
        L_0x029d:
            java.lang.String r1 = r17.getSearchResultId()     // Catch:{ Exception -> 0x02b7 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x02b7 }
            long r10 = r1.longValue()     // Catch:{ Exception -> 0x02b7 }
            ge.bog.mobilebank.model.Client r1 = r0.f85480O     // Catch:{ Exception -> 0x02b7 }
            ge.bog.mobilebank.model.template.TemplateBasketItem r15 = r1.getTemplateItemById(r10)     // Catch:{ Exception -> 0x02b7 }
            if (r15 != 0) goto L_0x02b7
            ge.bog.mobilebank.model.Client r1 = r0.f85480O     // Catch:{ Exception -> 0x02b7 }
            ge.bog.mobilebank.model.template.TemplateBasketItem r15 = r1.getTransferTemplateItemById(r10)     // Catch:{ Exception -> 0x02b7 }
        L_0x02b7:
            if (r15 == 0) goto L_0x033f
            java.lang.String r1 = r15.getTemplateType()
            r1.hashCode()
            int r3 = r1.hashCode()
            switch(r3) {
                case 66: goto L_0x02fc;
                case 71: goto L_0x02f3;
                case 73: goto L_0x02ea;
                case 77: goto L_0x02df;
                case 82: goto L_0x02d4;
                case 83: goto L_0x02c9;
                default: goto L_0x02c7;
            }
        L_0x02c7:
            r4 = -1
            goto L_0x0306
        L_0x02c9:
            java.lang.String r3 = "S"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x02d2
            goto L_0x02c7
        L_0x02d2:
            r4 = 5
            goto L_0x0306
        L_0x02d4:
            java.lang.String r3 = "R"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x02dd
            goto L_0x02c7
        L_0x02dd:
            r4 = 4
            goto L_0x0306
        L_0x02df:
            java.lang.String r3 = "M"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x02e8
            goto L_0x02c7
        L_0x02e8:
            r4 = 3
            goto L_0x0306
        L_0x02ea:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x02f1
            goto L_0x02c7
        L_0x02f1:
            r4 = 2
            goto L_0x0306
        L_0x02f3:
            java.lang.String r3 = "G"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0306
            goto L_0x02c7
        L_0x02fc:
            java.lang.String r3 = "B"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0305
            goto L_0x02c7
        L_0x0305:
            r4 = 0
        L_0x0306:
            java.lang.String r1 = "item_templates"
            switch(r4) {
                case 0: goto L_0x032a;
                case 1: goto L_0x032a;
                case 2: goto L_0x030d;
                case 3: goto L_0x032a;
                case 4: goto L_0x032a;
                case 5: goto L_0x030d;
                default: goto L_0x030b;
            }
        L_0x030b:
            r6 = r1
            goto L_0x033f
        L_0x030d:
            ck.g r2 = iu0.C36546y.m108282F()
            r2.mo27152s(r5, r1, r8)
            ge.bog.mobilebank.payment.model.a$a r1 = p341ge.bog.mobilebank.payment.model.C33624a.m98713a(r16)
            java.lang.Class<ge.bog.mobilebank.payment.activities.TemplateFormActivity> r2 = p341ge.bog.mobilebank.payment.activities.TemplateFormActivity.class
            ge.bog.mobilebank.payment.model.a$a r1 = r1.mo79806f(r2)
            long r2 = r15.getId()
            ge.bog.mobilebank.payment.model.a$a r1 = r1.mo79821u(r2)
            r1.mo79825y()
            return
        L_0x032a:
            ck.g r2 = iu0.C36546y.m108282F()
            r2.mo27152s(r5, r1, r8)
            java.lang.String r1 = "TEMPLATE"
            ge.bog.mobilebank.transfers.model.TransferForm$I r1 = p341ge.bog.mobilebank.transfers.model.TransferForm.startWith((android.app.Activity) r0, (java.lang.String) r1, (java.lang.String) r9)
            ge.bog.mobilebank.transfers.model.TransferForm$I r1 = r1.setTemplate(r15)
            r1.start()
            return
        L_0x033f:
            r0.startActivity(r2)
        L_0x0342:
            ck.g r1 = iu0.C36546y.m108282F()
            r1.mo27152s(r5, r6, r8)
        L_0x0349:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.SearchActivity.mo86372x(ge.bog.mobilebank.model.search.SearchResultObject):void");
    }
}
