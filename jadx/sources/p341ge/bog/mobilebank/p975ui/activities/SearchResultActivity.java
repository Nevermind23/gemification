package p341ge.bog.mobilebank.p975ui.activities;

import android.os.Bundle;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement.FinanceManagementActivity;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.search.SearchResultType;
import p341ge.bog.mobilebank.p975ui.fragments.C35635k0;
import p341ge.bog.mobilebank.p975ui.fragments.C35639l0;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.activities.SearchResultActivity */
public class SearchResultActivity extends C35441m0 {

    /* renamed from: G */
    protected Client f85484G;

    /* renamed from: H */
    private SearchResultType f85485H;

    /* renamed from: I */
    private int f85486I;

    /* renamed from: J */
    private long f85487J;

    /* renamed from: K */
    private int f85488K;

    /* renamed from: L */
    private C35639l0 f85489L;

    /* renamed from: ge.bog.mobilebank.ui.activities.SearchResultActivity$a */
    static /* synthetic */ class C35326a {

        /* renamed from: a */
        static final /* synthetic */ int[] f85490a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ge.bog.mobilebank.model.search.SearchResultType[] r0 = p341ge.bog.mobilebank.model.search.SearchResultType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f85490a = r0
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_ACCOUNT_AND_CARDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f85490a     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_BOND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f85490a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f85490a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_GT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f85490a     // Catch:{ NoSuchFieldError -> 0x003e }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_LOANS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f85490a     // Catch:{ NoSuchFieldError -> 0x0049 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f85490a     // Catch:{ NoSuchFieldError -> 0x0054 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_MY_OPERATIONS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f85490a     // Catch:{ NoSuchFieldError -> 0x0060 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_PAYMENT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f85490a     // Catch:{ NoSuchFieldError -> 0x006c }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_TRANSFERS     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.activities.SearchResultActivity.C35326a.<clinit>():void");
        }
    }

    /* renamed from: E2 */
    private void m104792E2(Bundle bundle) {
        if (bundle == null || this.f85489L == null) {
            this.f85489L = C35639l0.m105852k1();
            getSupportFragmentManager().mo4428p().mo4632c(C10322k.f28769Me, this.f85489L, "fragmentContainer").mo4515i();
        }
        this.f85489L.mo86727m1(this.f85488K);
        this.f85489L.mo86729o1(this.f85486I);
        this.f85489L.mo86728n1(this.f85487J);
    }

    /* renamed from: F2 */
    private void m104793F2(Bundle bundle) {
        if (bundle != null) {
            return;
        }
        if (this.f85484G.isAuthorized()) {
            FinanceManagementActivity.m71823J2(this);
            return;
        }
        getSupportFragmentManager().mo4428p().mo4632c(C10322k.f28769Me, C35635k0.m105841i1(), "fragmentOperations").mo4515i();
    }

    /* renamed from: G2 */
    private void m104794G2(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_search_result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f85485H = SearchResultType.valueOf(extras.getInt("FRAGMENT_TYPE_PRODUCTS_KEY", -1));
            this.f85487J = extras.getLong("PRODUCT_ACCT_KEY", -1);
            switch (C35326a.f85490a[this.f85485H.ordinal()]) {
                case 1:
                    this.f85486I = 1;
                    m104794G2(bundle);
                    return;
                case 2:
                    this.f85486I = 5;
                    m104794G2(bundle);
                    return;
                case 3:
                    this.f85486I = 2;
                    m104794G2(bundle);
                    return;
                case 4:
                    this.f85486I = 5;
                    m104794G2(bundle);
                    return;
                case 5:
                    this.f85486I = 3;
                    m104794G2(bundle);
                    return;
                case 6:
                    this.f85486I = 4;
                    m104794G2(bundle);
                    return;
                case 7:
                    m104793F2(bundle);
                    return;
                case 8:
                    this.f85488K = 1;
                    this.f85486I = extras.getInt("PRODUCT_TYPE_KEY", -1);
                    m104792E2(bundle);
                    return;
                case 9:
                    this.f85488K = 2;
                    m104792E2(bundle);
                    return;
                default:
                    return;
            }
        }
    }

    public void onBackPressed() {
        C35639l0 l0Var = this.f85489L;
        if (l0Var == null || !l0Var.mo86726l1()) {
            super.onBackPressed();
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        SearchResultType searchResultType = this.f85485H;
        if (searchResultType != null) {
            switch (C35326a.f85490a[searchResultType.ordinal()]) {
                case 1:
                    return getString(C10328q.f28941T4);
                case 2:
                case 4:
                    return getString(C10328q.f28945V4);
                case 3:
                    return getString(C10328q.f28952b5);
                case 5:
                    return getString(C10328q.f28957f5);
                case 6:
                    return getString(C10328q.f28954c5);
                case 7:
                    return getString(C10328q.header_text_statement);
                case 8:
                    return getString(C10328q.header_text_payments);
                case 9:
                    return getString(C10328q.header_text_transfers);
            }
        }
        return null;
    }
}
