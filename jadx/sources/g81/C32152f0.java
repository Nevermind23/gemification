package g81;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import g91.C32289b0;
import g91.C32290b1;
import g91.C32297d;
import g91.C32303f;
import g91.C32314k;
import g91.C32335t0;
import g91.C32343x;
import iu0.C36546y;
import j81.C36764f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.search.SearchResultHeader;
import p341ge.bog.mobilebank.model.search.SearchResultModule;
import p341ge.bog.mobilebank.model.search.SearchResultObject;
import p341ge.bog.mobilebank.model.search.SearchResultType;
import p341ge.bog.mobilebank.model.search.result.ContactSearchResult;
import p341ge.bog.mobilebank.model.search.result.MapObjectSearchResult;
import p341ge.bog.mobilebank.model.search.result.StatementSearchResult;
import p341ge.bog.mobilebank.model.search.result.TemplateSearchResult;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.activities.SearchActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import p891su.C28267d;
import p891su.C28269e;
import r90.C27950a;
import r90.C27954d;

/* renamed from: g81.f0 */
public class C32152f0 extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List f79184d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C36764f f79185e = null;

    /* renamed from: f */
    private boolean f79186f;

    /* renamed from: g */
    private Client f79187g;

    /* renamed from: h */
    private boolean f79188h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f79189i = true;

    /* renamed from: g81.f0$a */
    class C32153a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ SearchResultHeader f79190d;

        C32153a(SearchResultHeader searchResultHeader) {
            this.f79190d = searchResultHeader;
        }

        public void onClick(View view) {
            C32152f0.this.f79185e.mo86372x(this.f79190d);
        }
    }

    /* renamed from: g81.f0$b */
    class C32154b implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ SearchResultObject f79192d;

        C32154b(SearchResultObject searchResultObject) {
            this.f79192d = searchResultObject;
        }

        public void onClick(View view) {
            C32152f0.this.f79185e.mo86372x(this.f79192d);
        }
    }

    /* renamed from: g81.f0$c */
    class C32155c implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ SearchResultObject f79194d;

        C32155c(SearchResultObject searchResultObject) {
            this.f79194d = searchResultObject;
        }

        public void onClick(View view) {
            C32152f0.this.f79185e.mo86372x(this.f79194d);
        }
    }

    /* renamed from: g81.f0$d */
    class C32156d implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ RecyclerView.C1734f0 f79196d;

        C32156d(RecyclerView.C1734f0 f0Var) {
            this.f79196d = f0Var;
        }

        public void onClick(View view) {
            ((SearchActivity) this.f79196d.itemView.getContext()).mo86369N2();
            C32152f0.this.f79184d = null;
            C32152f0.this.f79189i = true;
            C32152f0.this.notifyDataSetChanged();
        }
    }

    /* renamed from: g81.f0$e */
    static /* synthetic */ class C32157e {

        /* renamed from: a */
        static final /* synthetic */ int[] f79198a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ge.bog.mobilebank.model.search.SearchResultType[] r0 = p341ge.bog.mobilebank.model.search.SearchResultType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f79198a = r0
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_TEMPLATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x001d }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_TEMPLATE_GROUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_PAYMENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CONTACT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x003e }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CURRENCY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x0049 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_ACCOUNT_AND_CARDS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x0054 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x0060 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_LOANS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x006c }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_DEBITS     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x0078 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_MY_OPERATIONS     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x0084 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x0090 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_BOND     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x009c }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_LOCATION     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_RECENT_SEARCH     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_GT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_BONUS_PROGRAMS     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x00cc }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_TRANSFERS     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f79198a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_SEARCH_RESULT_MODULE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g81.C32152f0.C32157e.<clinit>():void");
        }
    }

    /* renamed from: g81.f0$f */
    private class C32158f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        BogTextView f79199d;

        /* renamed from: e */
        View f79200e;

        public C32158f(View view) {
            super(view);
            this.f79199d = (BogTextView) view.findViewById(C10322k.f28741Hf);
            this.f79200e = view.findViewById(C10322k.header_right_text);
            this.f79199d.setTextColor(C32335t0.m95360e(view.getContext(), C10316e.f28609l, false));
        }
    }

    /* renamed from: g81.f0$g */
    private class C32159g extends C32160h {

        /* renamed from: e */
        BogTextView f79202e;

        /* renamed from: f */
        BogTextView f79203f;

        /* renamed from: g */
        BogTextView f79204g;

        /* renamed from: h */
        BogTextView f79205h;

        /* renamed from: i */
        View f79206i;

        /* renamed from: j */
        BogImageView f79207j;

        /* renamed from: k */
        Button f79208k;

        /* renamed from: l */
        View f79209l;

        /* renamed from: m */
        SwipeLayout f79210m;

        /* renamed from: n */
        View f79211n;

        public C32159g(View view) {
            super(view);
            this.f79202e = (BogTextView) view.findViewById(C10322k.f28878p1);
            this.f79203f = (BogTextView) view.findViewById(C10322k.f28741Hf);
            this.f79204g = (BogTextView) view.findViewById(C10322k.middle_text);
            this.f79205h = (BogTextView) view.findViewById(C10322k.footer_text);
            this.f79206i = view.findViewById(C10322k.item_to_click);
            this.f79207j = (BogImageView) view.findViewById(C10322k.icon_iv);
            this.f79209l = view.findViewById(C10322k.item_divider);
            this.f79208k = (Button) view.findViewById(C10322k.rect_iv);
            this.f79210m = (SwipeLayout) view.findViewById(C10322k.swipe_layout);
            this.f79211n = view.findViewById(C10322k.categoryIndicator);
            this.f79206i.setBackgroundColor(C32335t0.m95360e(view.getContext(), C10316e.f28608k, false));
            this.f79204g.setTextColor(C32335t0.m95360e(view.getContext(), C10316e.f28611o, false));
        }

        /* renamed from: i */
        public SwipeLayout mo72676i() {
            return this.f79210m;
        }
    }

    /* renamed from: g81.f0$h */
    private abstract class C32160h extends RecyclerView.C1734f0 implements SwipeLayout.C2360d {

        /* renamed from: g81.f0$h$a */
        class C32161a implements SwipeLayout.C2362f {
            C32161a() {
            }

            /* renamed from: a */
            public void mo7627a(SwipeLayout swipeLayout, boolean z) {
                long j;
                if (((SearchResultObject) C32152f0.this.f79184d.get(C32160h.this.getAdapterPosition())) instanceof StatementSearchResult) {
                    C10463g F = C36546y.m108282F();
                    if (z) {
                        j = -1;
                    } else {
                        j = 1;
                    }
                    F.mo27153t("search", "", "swipe_transaction", Long.valueOf(j));
                }
            }
        }

        public C32160h(View view) {
            super(view);
        }

        /* renamed from: e */
        public void mo7625e(SwipeLayout swipeLayout, boolean z, String str) {
            SearchResultObject searchResultObject = (SearchResultObject) C32152f0.this.f79184d.get(getAdapterPosition());
            if (searchResultObject instanceof StatementSearchResult) {
                StatementSearchResult statementSearchResult = (StatementSearchResult) searchResultObject;
                boolean z2 = !TextUtils.isEmpty(statementSearchResult.getEssId());
                PaymentProviderConfiguration g = C27954d.m86301g(statementSearchResult.getEssId());
                Context context = this.itemView.getContext();
                mo72676i().mo7586B(2, true);
                if (z) {
                    if (!statementSearchResult.isDDSTOAlllowed()) {
                        return;
                    }
                    if (!z2) {
                        C36546y.m108282F().mo27152s("search", "create_sto", "swipe_menu_click");
                        TransferForm.startWith(context, "STO", "CREATE").setItemKey(statementSearchResult.getDocKey().longValue()).setPfmID(statementSearchResult.getPfmId()).setOperationDate(Long.valueOf(statementSearchResult.getPostDate())).setPrintFormType(statementSearchResult.getPrintFormType()).start();
                    } else if (g != null && g.isDDAllowed) {
                        C36546y.m108282F().mo27152s("search", "create_dd", "swipe_menu_click");
                        C33624a.m98713a((Activity) context).mo79806f(DDTransparentLoaderActivity.class).mo79819s(g.getServiceId()).mo79812l(statementSearchResult.getEssId()).mo79825y();
                    }
                } else if (str.equals("REPEAT_TRANSACTION_ID") && statementSearchResult.isRepeatAllowed()) {
                    C36546y.m108282F().mo27152s("search", "repeat", "swipe_menu_click");
                    if (!z2) {
                        TransferForm.startWith(context, "TRANSFER", TransferForm.OPERATION_VIEW).setItemKey(statementSearchResult.getDocKey().longValue()).setPfmID(statementSearchResult.getPfmId()).setOperationDate(Long.valueOf(statementSearchResult.getPostDate())).setPrintFormType(statementSearchResult.getPrintFormType()).start();
                    } else if (g != null) {
                        C33624a.m98713a((Activity) context).mo79806f(PaymentFormActivity.class).mo79819s(g.getServiceId()).mo79812l(statementSearchResult.getEssId()).mo79825y();
                    }
                } else if (str.equals("SHARE_ID")) {
                    if (statementSearchResult.isPrintAllowed()) {
                        C36546y.m108282F().mo27152s("search", "share", "swipe_menu_click");
                        C32303f.m95195f(C32303f.m95191b(statementSearchResult.getDocKey().longValue(), statementSearchResult.getEssId(), statementSearchResult.getPrintFormType()), (Activity) context, context.getString(C10328q.f28968x1) + ".pdf", "application/pdf");
                        return;
                    }
                    C32297d.m95158f((Activity) context, C27950a.m86284a("text.operation.print.not.allowed"), C32297d.f79709e);
                } else if (str.equals("SAVE_TEMPLATE_ID") && statementSearchResult.isTemplateAllowed()) {
                    C36546y.m108282F().mo27152s("search", "save_template", "swipe_menu_click");
                    if (!z2) {
                        TransferForm.startWith(context, TransferForm.MODULE_TEMPLATE, "CREATE").setItemKey(statementSearchResult.getDocKey().longValue()).setPfmID(statementSearchResult.getPfmId()).setOperationDate(Long.valueOf(statementSearchResult.getPostDate())).setPrintFormType(statementSearchResult.getPrintFormType()).start();
                    } else if (g != null) {
                        C33624a.m98713a((Activity) context).mo79806f(TemplateFormActivity.class).mo79819s(g.getServiceId()).mo79812l(statementSearchResult.getEssId()).mo79803c(true).mo79825y();
                    }
                } else if (str.equals("TRANSFER_BACK_ID") && statementSearchResult.hasTransferBack()) {
                    C36546y.m108282F().mo27152s("search", "transfer_back", "swipe_menu_click");
                    AccountOperation accountOperation = new AccountOperation();
                    accountOperation.setEssId(statementSearchResult.getEssId());
                    accountOperation.setPrintFormType(statementSearchResult.getPrintFormType());
                    accountOperation.setDocKey(statementSearchResult.getDocKey().longValue());
                    TransferForm.startWith(context, "TRANSFER", TransferForm.OPERATION_VIEW).setAccountOperation(accountOperation).start();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo72677h(StatementSearchResult statementSearchResult) {
            float f;
            ArrayList arrayList = new ArrayList();
            Context context = this.itemView.getContext();
            SwipeLayout i = mo72676i();
            if (statementSearchResult.isTemplateAllowed()) {
                arrayList.add(new SwipeLayout.C2363g("SAVE_TEMPLATE_ID", context.getString(C10328q.statement_swipe_menu_save_template), Integer.valueOf(C10320i.ic_swipe_add), (Integer) null, (Integer) null, (Integer) null, (Float) null));
            }
            arrayList.add(new SwipeLayout.C2363g("SHARE_ID", context.getString(C10328q.download_receipt), Integer.valueOf(C10320i.ic_download_menu_item), (Integer) null, (Integer) null, (Integer) null, (Float) null));
            if (statementSearchResult.hasTransferBack()) {
                arrayList.add(new SwipeLayout.C2363g("TRANSFER_BACK_ID", context.getString(C10328q.statement_swipe_menu_transfer_back), Integer.valueOf(C10320i.ic_transfer_back), (Integer) null, (Integer) null, (Integer) null, (Float) null));
            }
            if (statementSearchResult.isRepeatAllowed()) {
                arrayList.add(new SwipeLayout.C2363g("REPEAT_TRANSACTION_ID", context.getString(C10328q.statement_swipe_menu_repeat), Integer.valueOf(C10320i.ic_reload), (Integer) null, (Integer) null, (Integer) null, (Float) null));
            }
            int[] s = C32303f.m95208s(context, arrayList.size());
            int[] u = C32303f.m95210u(context, arrayList.size());
            int[] t = C32303f.m95209t(context, arrayList.size());
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((SwipeLayout.C2363g) arrayList.get(i2)).f7484d = Integer.valueOf(s[i2]);
                ((SwipeLayout.C2363g) arrayList.get(i2)).f7485e = Integer.valueOf(u[i2]);
                ((SwipeLayout.C2363g) arrayList.get(i2)).f7486f = Integer.valueOf(t[i2]);
            }
            i.setRightSwipeItems(arrayList);
            i.setLeftSwipeItem(new SwipeLayout.C2363g("AUTOMATIC_SERVICES_ID", context.getString(C10328q.template_swipe_menu_automatic_services), Integer.valueOf(C10320i.ic_swipe_automatic), Integer.valueOf(C0767a.m2893c(context, C10318g.swipe_menu_item_1)), Integer.valueOf(C0767a.m2893c(context, C10318g.swipe_menu_item_text_color)), Integer.valueOf(C0767a.m2893c(context, C10318g.swipe_menu_item_icon_tint_color)), (Float) null));
            float f2 = 1.0f;
            if (statementSearchResult.isPrintAllowed()) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            i.mo7585A(false, 0, f);
            if (!statementSearchResult.isDDSTOAlllowed()) {
                f2 = 0.5f;
            }
            i.mo7585A(true, 0, f2);
            i.setOnItemClickListener(this);
            i.setOnSwipedListener(new C32161a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public abstract SwipeLayout mo72676i();
    }

    /* renamed from: g81.f0$i */
    private class C32162i extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private TextView f79215d;

        /* renamed from: e */
        private FrameLayout f79216e;

        public C32162i(View view) {
            super(view);
            this.f79215d = (TextView) view.findViewById(C10322k.f28826da);
            this.f79216e = (FrameLayout) view.findViewById(C10322k.title_container);
        }

        /* renamed from: h */
        public void mo72678h(String str) {
            this.f79215d.setText(str);
            this.f79216e.setVisibility(8);
        }
    }

    /* renamed from: g81.f0$j */
    private class C32163j extends C32160h {

        /* renamed from: e */
        private final TextView f79218e = ((TextView) this.itemView.findViewById(C10322k.f28844ia));

        /* renamed from: f */
        private final ImageView f79219f = ((ImageView) this.itemView.findViewById(C10322k.f28767Lg));

        /* renamed from: g */
        private final TextView f79220g = ((TextView) this.itemView.findViewById(C10322k.f28915yx));

        /* renamed from: h */
        private final TextView f79221h = ((TextView) this.itemView.findViewById(C10322k.f28853jw));

        /* renamed from: i */
        private final TextView f79222i = ((TextView) this.itemView.findViewById(C10322k.f28817a1));

        /* renamed from: j */
        private final TextView f79223j = ((TextView) this.itemView.findViewById(C10322k.subamount));
        /* access modifiers changed from: private */

        /* renamed from: k */
        public final SwipeLayout f79224k = ((SwipeLayout) this.itemView.findViewById(C10322k.transaction_swipe_layout));

        /* renamed from: l */
        private final View f79225l = this.itemView.findViewById(C10322k.transaction_list_item);

        /* renamed from: m */
        private final AppCompatImageView f79226m = ((AppCompatImageView) this.itemView.findViewById(C10322k.non_include));

        /* renamed from: n */
        private final AppCompatImageView f79227n = ((AppCompatImageView) this.itemView.findViewById(C10322k.search_error_page_description));

        public C32163j(View view) {
            super(view);
        }

        /* renamed from: l */
        private int m94767l(BigDecimal bigDecimal) {
            if (bigDecimal.compareTo(new BigDecimal(0)) < 0) {
                return C10318g.f28641c1;
            }
            return C10318g.f28630R0;
        }

        /* renamed from: m */
        private void m94768m(SearchResultObject searchResultObject, Context context) {
            String R2;
            this.f79219f.setVisibility(0);
            int j = C32152f0.this.m94755o(searchResultObject);
            this.f79219f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f79219f.setImageDrawable(C32290b1.m95122l(context, C0767a.m2895e(context, j), C32335t0.m95367l(context, true)));
            if (!TextUtils.isEmpty(searchResultObject.getLogo())) {
                ImageView imageView = this.f79219f;
                String e = C32289b0.m95093e(searchResultObject.getLogo());
                int i = C10320i.white_circle;
                C32289b0.m95107s(imageView, e, Integer.valueOf(i), Integer.valueOf(i), true, false);
            }
            if (searchResultObject.getType() == SearchResultType.TYPE_TEMPLATE && (R2 = ((SearchActivity) context).mo86370R2(searchResultObject)) != null) {
                C32289b0.m95097i(this.f79219f, R2);
            }
        }

        /* renamed from: i */
        public SwipeLayout mo72676i() {
            return this.f79224k;
        }

        /* renamed from: k */
        public void mo72679k(StatementSearchResult statementSearchResult) {
            Context context = this.itemView.getContext();
            C32343x.m95455i0(this.f79218e);
            C32343x.m95455i0(this.f79223j);
            C32343x.m95447f1(this.f79224k);
            C32343x.m95458j0(this.f79226m, !statementSearchResult.isPfmComputable());
            mo72677h(statementSearchResult);
            this.f79221h.setText(statementSearchResult.getFooterText());
            TextView textView = this.f79221h;
            C32343x.m95477p1(textView, !textView.getText().toString().isEmpty());
            this.f79220g.setText(statementSearchResult.getMiddleText());
            this.f79222i.setText(C32303f.m95203n(statementSearchResult.getAmount().negate(), statementSearchResult.getCcy()));
            this.f79222i.setTextColor(C0767a.m2893c(context, m94767l(statementSearchResult.getAmount())));
            m94768m(statementSearchResult, context);
            this.f79225l.setPadding(C32343x.m95394I(16), C32343x.m95394I(8), C32343x.m95394I(16), C32343x.m95394I(8));
        }
    }

    /* renamed from: g81.f0$k */
    private class C32164k extends RecyclerView.C1734f0 {
        public C32164k(View view) {
            super(view);
        }
    }

    public C32152f0(ArrayList arrayList, boolean z, Client client) {
        this.f79184d = arrayList;
        if (arrayList != null && arrayList.size() > 0) {
            this.f79189i = false;
        }
        this.f79186f = z;
        this.f79187g = client;
    }

    /* renamed from: k */
    private void m94751k(C32158f fVar, SearchResultHeader searchResultHeader) {
        fVar.f79200e.setVisibility(8);
        fVar.f79199d.setText(m94754n(searchResultHeader.getSubType(), fVar.itemView.getContext()));
        fVar.f79199d.setOnClickListener(new C32153a(searchResultHeader));
    }

    /* renamed from: l */
    private void m94752l(C32163j jVar, int i) {
        SearchResultObject searchResultObject = (SearchResultObject) this.f79184d.get(i);
        jVar.f79224k.setOnItemClickListener((SwipeLayout.C2360d) null);
        jVar.f79224k.setOnClickListener(new C32154b(searchResultObject));
        if (searchResultObject instanceof StatementSearchResult) {
            jVar.mo72679k((StatementSearchResult) searchResultObject);
        }
    }

    /* renamed from: m */
    private void m94753m(C32159g gVar, int i) {
        String str;
        String R2;
        TemplateBasketItem templateBasketItem;
        SearchResultObject searchResultObject = (SearchResultObject) this.f79184d.get(i);
        Context context = gVar.itemView.getContext();
        SearchResultType type = searchResultObject.getType();
        gVar.f79210m.setOnItemClickListener((SwipeLayout.C2360d) null);
        gVar.f79210m.setOnClickListener(new C32155c(searchResultObject));
        gVar.f79204g.setVisibility(0);
        SearchResultType searchResultType = SearchResultType.TYPE_SEARCH_RESULT_MODULE;
        if (type == searchResultType) {
            gVar.f79204g.setText(m94754n(((SearchResultModule) searchResultObject).getSubType(), context));
        } else if (!TextUtils.isEmpty(searchResultObject.getMiddleText())) {
            gVar.f79204g.setText(searchResultObject.getMiddleText());
        } else {
            gVar.f79204g.setVisibility(8);
        }
        if (TextUtils.isEmpty(searchResultObject.getHeaderText())) {
            gVar.f79203f.setVisibility(8);
        } else {
            gVar.f79203f.setVisibility(0);
            gVar.f79203f.setText(searchResultObject.getHeaderText());
        }
        if (searchResultObject.getFooterText() == null || searchResultObject.getFooterText().equals("")) {
            gVar.f79205h.setVisibility(8);
        } else {
            gVar.f79205h.setVisibility(0);
            gVar.f79205h.setText(searchResultObject.getFooterText());
        }
        BogTextView bogTextView = gVar.f79202e;
        if (searchResultObject.getRightText() == null) {
            str = "";
        } else {
            str = searchResultObject.getRightText();
        }
        bogTextView.setText(str);
        gVar.f79211n.setVisibility(8);
        if (type == SearchResultType.TYPE_CURRENCY) {
            gVar.f79208k.setText(C32314k.m95245a(searchResultObject.getSearchResultId()));
            gVar.f79208k.setVisibility(0);
            gVar.f79207j.setVisibility(8);
            return;
        }
        gVar.f79208k.setVisibility(8);
        gVar.f79207j.setVisibility(0);
        int o = m94755o(searchResultObject);
        gVar.f79207j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        gVar.f79207j.setImageDrawable(C32290b1.m95122l(context, C0767a.m2895e(context, o), C32335t0.m95367l(context, true)));
        if (!searchResultObject.getType().equals(searchResultType)) {
            if (searchResultObject.getType() == SearchResultType.TYPE_LOCATION) {
                MapObjectSearchResult mapObjectSearchResult = (MapObjectSearchResult) searchResultObject;
                gVar.f79207j.setImageResource(m94756p(mapObjectSearchResult));
                String objectType = mapObjectSearchResult.getObjectType();
                if (objectType != null && (objectType.equals("ATM") || objectType.equals("PBX"))) {
                    gVar.f79207j.applyAccentTint();
                }
            }
            if (searchResultObject.getLogo() != null && !searchResultObject.getLogo().equals("")) {
                BogImageView bogImageView = gVar.f79207j;
                String logo = searchResultObject.getLogo();
                int i2 = C10320i.white_circle;
                C32289b0.m95107s(bogImageView, logo, Integer.valueOf(i2), Integer.valueOf(i2), true, false);
            }
            if (searchResultObject instanceof TemplateSearchResult) {
                Client client = this.f79187g;
                if (client != null) {
                    templateBasketItem = client.getTransferTemplateItemById(((TemplateSearchResult) searchResultObject).getTemplateId());
                } else {
                    templateBasketItem = null;
                }
                if (templateBasketItem != null && !TextUtils.isEmpty(templateBasketItem.getTemplateImage())) {
                    BogImageView bogImageView2 = gVar.f79207j;
                    String e = C32289b0.m95093e(templateBasketItem.getTemplateImage());
                    int i3 = C10320i.white_circle;
                    C32289b0.m95107s(bogImageView2, e, Integer.valueOf(i3), Integer.valueOf(i3), true, false);
                } else if (!TextUtils.isEmpty(searchResultObject.getLogo())) {
                    BogImageView bogImageView3 = gVar.f79207j;
                    String e2 = C32289b0.m95093e(searchResultObject.getLogo());
                    int i4 = C10320i.white_circle;
                    C32289b0.m95107s(bogImageView3, e2, Integer.valueOf(i4), Integer.valueOf(i4), true, false);
                }
            }
            if (searchResultObject instanceof ContactSearchResult) {
                ContactSearchResult contactSearchResult = (ContactSearchResult) searchResultObject;
                if (searchResultObject.getLogo() == null || searchResultObject.getLogo().isEmpty()) {
                    if (C28269e.JURIDICAL_PERSON.mo67882b().equals(contactSearchResult.getConnectionType())) {
                        gVar.f79207j.setImageResource(C10320i.ic_contact_company_small);
                    } else if (C28269e.BUDGET.mo67882b().equals(contactSearchResult.getConnectionType())) {
                        gVar.f79207j.setImageResource(C10320i.ic_contact_treasury);
                    } else {
                        gVar.f79207j.setImageResource(C10320i.ic_contact_default_avatar);
                    }
                    if (!C28267d.BANK_OF_GEORGIA.mo67880b().equals(contactSearchResult.getBank()) || !C28269e.PHYSICAL_PERSON.mo67882b().equals(contactSearchResult.getConnectionType())) {
                        gVar.f79207j.setImageTintList((ColorStateList) null);
                    } else {
                        gVar.f79207j.setImageTintList(ColorStateList.valueOf(C32335t0.m95357b()));
                    }
                } else {
                    C32289b0.m95097i(gVar.f79207j, searchResultObject.getLogo());
                }
            }
            if (searchResultObject.getType() == SearchResultType.TYPE_TEMPLATE && (R2 = ((SearchActivity) context).mo86370R2(searchResultObject)) != null) {
                C32289b0.m95097i(gVar.f79207j, R2);
            }
        }
    }

    /* renamed from: n */
    private String m94754n(SearchResultType searchResultType, Context context) {
        switch (C32157e.f79198a[searchResultType.ordinal()]) {
            case 1:
                return context.getString(C10328q.search_module_templates);
            case 2:
                return context.getString(C10328q.search_module_groups);
            case 3:
                return context.getString(C10328q.search_module_payments);
            case 4:
                return context.getString(C10328q.header_text_contacts);
            case 5:
                return context.getString(C10328q.search_module_currencies);
            case 6:
                return context.getString(C10328q.search_module_accounts_and_cards);
            case 7:
                return context.getString(C10328q.search_module_credit_cards);
            case 8:
                return context.getString(C10328q.search_module_loans);
            case 9:
                return context.getString(C10328q.search_module_auto_payments);
            case 10:
                return context.getString(C10328q.search_module_last_operations);
            case 11:
                return context.getString(C10328q.search_module_deposits);
            case 12:
                return context.getString(C10328q.search_module_bonds_and_shares);
            case 13:
                return context.getString(C10328q.search_module_atm);
            case 14:
                return context.getString(C10328q.search_module_recent_search);
            case 15:
                return context.getString(C10328q.search_module_galt_and_taggart);
            case 16:
                return context.getString(C10328q.search_module_loyalty);
            case 17:
                return context.getString(C10328q.search_module_transfers);
            case 18:
                return context.getString(C10328q.search_modules);
            default:
                return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public int m94755o(SearchResultObject searchResultObject) {
        int i = C10320i.rounded_white_background;
        SearchResultType type = searchResultObject.getType();
        if (searchResultObject.getType() == SearchResultType.TYPE_SEARCH_RESULT_MODULE) {
            type = ((SearchResultModule) searchResultObject).getSubType();
        }
        switch (C32157e.f79198a[type.ordinal()]) {
            case 1:
            case 2:
                return C10320i.templates_with_padding;
            case 3:
            case 17:
                return C10320i.transfers_padding;
            case 4:
                return C10320i.contacts_with_padding;
            case 5:
                return C10320i.currency_module_padding;
            case 6:
            case 15:
                return C10320i.accounts_with_padding;
            case 7:
                return C10320i.creditcards_with_padding;
            case 8:
                return C10320i.loans_with_padding;
            case 9:
                return C10320i.ic_automatic_with_padding_disabled;
            case 10:
                return C10320i.operations_with_padding;
            case 11:
                return C10320i.deposits_with_padding;
            case 12:
                return C10320i.bonds_with_padding;
            case 13:
                return C10320i.atms_with_padding;
            case 16:
                return C10320i.bonus_with_padding;
            default:
                return i;
        }
    }

    /* renamed from: p */
    private int m94756p(MapObjectSearchResult mapObjectSearchResult) {
        int i = C10320i.ic_sc;
        String objectType = mapObjectSearchResult.getObjectType();
        String objectSubType = mapObjectSearchResult.getObjectSubType();
        if (objectType == null) {
            return i;
        }
        if (objectType.equals("ATM")) {
            return C10320i.ic_atm;
        }
        if (objectType.equals("PBX")) {
            return C10320i.ic_paybox;
        }
        if (!objectType.equals("SC") || objectSubType == null) {
            return i;
        }
        if (objectType.equals("SOL")) {
            return C10320i.ic_solo;
        }
        if (objectType.equals("EXP")) {
            return C10320i.ic_express;
        }
        boolean equals = objectType.equals("BOG");
        return i;
    }

    public int getItemCount() {
        int i;
        if (this.f79189i || this.f79188h) {
            i = 1;
        } else {
            i = 0;
        }
        List list = this.f79184d;
        if (list != null) {
            return i + list.size();
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getItemViewType(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0010
            boolean r0 = r2.f79188h
            if (r0 == 0) goto L_0x0009
            r0 = 15
            goto L_0x0011
        L_0x0009:
            boolean r0 = r2.f79189i
            if (r0 == 0) goto L_0x0010
            r0 = 30
            goto L_0x0011
        L_0x0010:
            r0 = -1
        L_0x0011:
            boolean r1 = r2.f79189i
            int r3 = r3 - r1
            if (r3 < 0) goto L_0x0071
            java.util.List r1 = r2.f79184d
            if (r1 == 0) goto L_0x0071
            int r1 = r1.size()
            if (r1 == 0) goto L_0x0071
            java.util.List r1 = r2.f79184d
            int r1 = r1.size()
            if (r3 >= r1) goto L_0x0071
            java.util.List r0 = r2.f79184d
            java.lang.Object r3 = r0.get(r3)
            ge.bog.mobilebank.model.search.SearchResultObject r3 = (p341ge.bog.mobilebank.model.search.SearchResultObject) r3
            ge.bog.mobilebank.model.search.SearchResultType r0 = r3.getType()
            ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_SEARCH_RESULTS_HEADER
            if (r0 != r1) goto L_0x003b
            r0 = 25
            goto L_0x0071
        L_0x003b:
            boolean r0 = r3 instanceof p341ge.bog.mobilebank.model.search.result.StatementHeaderSearchResult
            if (r0 == 0) goto L_0x0042
            r3 = 10
            return r3
        L_0x0042:
            ge.bog.mobilebank.model.search.SearchResultType r0 = r3.getType()
            ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_SEARCH_RESULT_MODULE
            if (r0 == r1) goto L_0x006e
            ge.bog.mobilebank.model.search.SearchResultType r0 = r3.getType()
            ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CURRENCY
            if (r0 == r1) goto L_0x006e
            ge.bog.mobilebank.model.search.SearchResultType r0 = r3.getType()
            ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_LOCATION
            if (r0 == r1) goto L_0x006e
            ge.bog.mobilebank.model.search.SearchResultType r0 = r3.getType()
            ge.bog.mobilebank.model.search.SearchResultType r1 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_PAYMENT
            if (r0 == r1) goto L_0x006e
            ge.bog.mobilebank.model.search.SearchResultType r3 = r3.getType()
            ge.bog.mobilebank.model.search.SearchResultType r0 = p341ge.bog.mobilebank.model.search.SearchResultType.TYPE_CONTACT
            if (r3 != r0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r0 = 20
            goto L_0x0071
        L_0x006e:
            r3 = 35
            return r3
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g81.C32152f0.getItemViewType(int):int");
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        int itemViewType = f0Var.getItemViewType();
        if (itemViewType == 10) {
            ((C32162i) f0Var).mo72678h(((SearchResultObject) this.f79184d.get(i)).getHeaderText());
        } else if (itemViewType == 20) {
            m94752l((C32163j) f0Var, i);
        } else if (itemViewType == 25) {
            C32158f fVar = (C32158f) f0Var;
            SearchResultHeader searchResultHeader = (SearchResultHeader) this.f79184d.get(i);
            m94751k(fVar, searchResultHeader);
            if (searchResultHeader.getSubType() == SearchResultType.TYPE_RECENT_SEARCH) {
                fVar.f79200e.setVisibility(0);
                fVar.f79200e.setOnClickListener(new C32156d(f0Var));
            }
        } else if (itemViewType == 35) {
            m94753m((C32159g) f0Var, i);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.C1734f0 f0Var;
        if (i == 10) {
            f0Var = new C32162i(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.transaction_list_date_header, viewGroup, false));
        } else if (i == 15) {
            f0Var = new C32164k(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.layout_search_error, viewGroup, false));
        } else if (i == 20) {
            f0Var = new C32163j(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.transaction_swipable_list_item, viewGroup, false));
        } else if (i == 25) {
            f0Var = new C32158f(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.search_module_header, viewGroup, false));
        } else if (i == 30) {
            f0Var = new C32164k(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.layout_blank_search, viewGroup, false));
        } else if (i != 35) {
            return null;
        } else {
            f0Var = new C32159g(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.layout_search_result_swipable_item, viewGroup, false));
        }
        return f0Var;
    }

    /* renamed from: q */
    public void mo72669q(List list) {
        this.f79184d = list;
        boolean z = false;
        this.f79189i = false;
        if (list == null || list.size() == 0) {
            z = true;
        }
        this.f79188h = z;
        notifyDataSetChanged();
    }

    /* renamed from: r */
    public void mo72670r(List list) {
        this.f79188h = false;
        this.f79184d = list;
        if (list == null || list.size() == 0) {
            this.f79189i = true;
        }
        notifyDataSetChanged();
    }

    /* renamed from: s */
    public void mo72671s(C36764f fVar) {
        this.f79185e = fVar;
    }
}
