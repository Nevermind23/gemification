package g81;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import g91.C32289b0;
import g91.C32303f;
import g91.C32319m;
import g91.C32335t0;
import iu0.C36546y;
import j81.C36768j;
import j81.C36769k;
import j81.C36770l;
import java.util.ArrayList;
import java.util.List;
import l81.C37107d;
import o81.C37693a;
import o81.C37694b;
import p341ge.bog.mobilebank.model.CircularItemInterface;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.payment.LastOperation;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketItemsWithPaymentConfig;
import p341ge.bog.mobilebank.model.template.TemplateGroup;
import p341ge.bog.mobilebank.p975ui.activities.AllTemplateListActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.HorizontalRecyclerViewHolder;
import p366bk.C10313b;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import r90.C27954d;

/* renamed from: g81.w */
public class C32276w extends C37694b {

    /* renamed from: A */
    private Runnable f79627A;

    /* renamed from: B */
    private Runnable f79628B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public Context f79629C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C36769k f79630D;

    /* renamed from: E */
    private int f79631E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f79632F;

    /* renamed from: G */
    private Client f79633G;

    /* renamed from: H */
    private Animation f79634H;

    /* renamed from: I */
    private boolean f79635I;

    /* renamed from: J */
    private boolean f79636J;

    /* renamed from: K */
    private boolean f79637K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public String f79638L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public List f79639M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public String f79640N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f79641O;

    /* renamed from: l */
    private C32175h f79642l;

    /* renamed from: m */
    private C32175h f79643m;

    /* renamed from: n */
    private C32175h f79644n;

    /* renamed from: o */
    private C32175h f79645o;

    /* renamed from: p */
    private C32175h f79646p;

    /* renamed from: q */
    private int f79647q;

    /* renamed from: r */
    private int f79648r;

    /* renamed from: s */
    private int f79649s;

    /* renamed from: t */
    private int f79650t;

    /* renamed from: u */
    private boolean f79651u;

    /* renamed from: v */
    private boolean f79652v;

    /* renamed from: w */
    private Runnable f79653w;

    /* renamed from: x */
    private Runnable f79654x;

    /* renamed from: y */
    private Runnable f79655y;

    /* renamed from: z */
    private Runnable f79656z;

    /* renamed from: g81.w$a */
    private class C32277a extends C37107d {
        public C32277a(View view) {
            super(view);
        }
    }

    /* renamed from: g81.w$b */
    private class C32278b extends C37107d {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public RecyclerView f79658f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public HorizontalRecyclerViewHolder f79659g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public BogTextView f79660h;

        /* renamed from: i */
        private BogTextView f79661i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public View f79662j;

        /* renamed from: k */
        private String f79663k = "";

        /* renamed from: l */
        View f79664l;

        public C32278b(View view) {
            super(view);
            HorizontalRecyclerViewHolder horizontalRecyclerViewHolder = (HorizontalRecyclerViewHolder) view.findViewById(C10322k.horizontal_recycler_view);
            this.f79659g = horizontalRecyclerViewHolder;
            this.f79658f = horizontalRecyclerViewHolder.getRecyclerView();
            this.f79660h = (BogTextView) view.findViewById(C10322k.header_left_text);
            this.f79661i = (BogTextView) view.findViewById(C10322k.header_right_text);
            this.f79662j = view.findViewById(C10322k.header_arrow_container);
            this.f79664l = view.findViewById(C10322k.f28719Dq);
            this.f79658f.setLayoutManager(new LinearLayoutManager(C32276w.this.f79629C, 0, false));
            this.f79658f.setNestedScrollingEnabled(false);
            this.f79662j.setOnClickListener(new C32281x(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m95058n(View view) {
            int i;
            String str;
            int i2;
            int itemViewType = C32276w.this.getItemViewType(getAdapterPosition());
            if (itemViewType == 20) {
                i = 1;
                str = "categories";
            } else if (itemViewType != 23) {
                str = "templates";
                if (itemViewType == 26) {
                    i2 = 3;
                    if ("all_templates".equals(C32276w.this.f79638L)) {
                        str = "payment_templates";
                    }
                } else if (itemViewType != 29) {
                    i = -1;
                    str = "";
                } else {
                    i2 = 8;
                    if ("all_templates".equals(C32276w.this.f79638L)) {
                        str = "transfer_templates";
                    }
                }
                i = i2;
            } else {
                i = 2;
                str = "payment_method";
            }
            C36546y.m108282F().mo27152s(C32276w.this.f79638L, str, "show_all");
            if (C32276w.this.f79630D != null) {
                C32276w.this.f79630D.mo86062e(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo72801o(String str) {
            this.f79659g.setType(str);
        }
    }

    /* renamed from: g81.w$c */
    private class C32279c extends C37107d {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public ImageView f79666f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public BogTextView f79667g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public BogTextView f79668h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public BogTextView f79669i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public BogTextView f79670j = ((BogTextView) mo90036h(C10322k.time_text));
        /* access modifiers changed from: private */

        /* renamed from: k */
        public BogTextView f79671k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public BogTextView f79672l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public SwipeLayout f79673m = ((SwipeLayout) mo90036h(C10322k.swipe_layout));
        /* access modifiers changed from: private */

        /* renamed from: n */
        public View f79674n = mo90036h(C10322k.background_container);
        /* access modifiers changed from: private */

        /* renamed from: o */
        public View f79675o = mo90036h(C10322k.categoryIndicator);

        public C32279c(View view) {
            super(view);
            this.f79666f = (ImageView) view.findViewById(C10322k.rounded_image);
            this.f79667g = (BogTextView) view.findViewById(C10322k.provider_text);
            this.f79668h = (BogTextView) view.findViewById(C10322k.acc_text);
            this.f79669i = (BogTextView) view.findViewById(C10322k.f28916zn);
            this.f79671k = (BogTextView) view.findViewById(C10322k.express_points);
            BogTextView bogTextView = (BogTextView) mo90036h(C10322k.transfer_text);
            this.f79672l = bogTextView;
            bogTextView.setVisibility(0);
            this.f79673m.setOnSwipedListener(new C32282y(this));
            this.f79673m.setOnClickListener(new C32283z(this));
            this.f79673m.setOnSwipeItemClickListener(new C32124a0(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public /* synthetic */ void m95073v(SwipeLayout swipeLayout, boolean z) {
            long j;
            C32276w wVar = C32276w.this;
            LastOperation lastOperation = ((C36768j) wVar.mo90883o(wVar.m95039Y(getAdapterPosition()))).getLastOperation();
            C32276w wVar2 = C32276w.this;
            TransferHistoryItem transferHistoryItem = ((C36768j) wVar2.mo90883o(wVar2.m95039Y(getAdapterPosition()))).getTransferHistoryItem();
            if (lastOperation != null || transferHistoryItem != null) {
                C10463g F = C36546y.m108282F();
                String J = C32276w.this.f79638L;
                if (z) {
                    j = -1;
                } else {
                    j = 1;
                }
                F.mo27153t(J, "", "swipe_transaction", Long.valueOf(j));
            }
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
            if (r4.equals("PAYMENT_OWN_ACCOUNTS") == false) goto L_0x004a;
         */
        /* renamed from: w */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ void m95074w(android.view.View r8) {
            /*
                r7 = this;
                com.alexandrius.accordionswipelayout.library.SwipeLayout r8 = r7.f79673m
                r0 = 2
                r1 = 1
                r8.mo7586B(r0, r1)
                g81.w r8 = g81.C32276w.this
                int r2 = r7.getAdapterPosition()
                int r2 = r8.m95039Y(r2)
                java.lang.Object r8 = r8.mo90883o(r2)
                j81.j r8 = (j81.C36768j) r8
                ge.bog.mobilebank.model.payment.LastOperation r8 = r8.getLastOperation()
                g81.w r2 = g81.C32276w.this
                int r3 = r7.getAdapterPosition()
                int r3 = r2.m95039Y(r3)
                java.lang.Object r2 = r2.mo90883o(r3)
                j81.j r2 = (j81.C36768j) r2
                ge.bog.mobilebank.model.TransferHistoryItem r2 = r2.getTransferHistoryItem()
                if (r8 != 0) goto L_0x0034
                if (r2 != 0) goto L_0x0034
                return
            L_0x0034:
                if (r8 == 0) goto L_0x0039
                java.lang.String r3 = "payment"
                goto L_0x003b
            L_0x0039:
                java.lang.String r3 = ""
            L_0x003b:
                if (r2 == 0) goto L_0x0084
                java.lang.String r4 = r2.docType
                r4.hashCode()
                int r5 = r4.hashCode()
                r6 = -1
                switch(r5) {
                    case -93971273: goto L_0x006b;
                    case -93909248: goto L_0x0060;
                    case 499781208: goto L_0x0057;
                    case 1078753379: goto L_0x004c;
                    default: goto L_0x004a;
                }
            L_0x004a:
                r0 = r6
                goto L_0x0075
            L_0x004c:
                java.lang.String r0 = "PAYMENT_WITHIN_GEORGIA"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x0055
                goto L_0x004a
            L_0x0055:
                r0 = 3
                goto L_0x0075
            L_0x0057:
                java.lang.String r1 = "PAYMENT_OWN_ACCOUNTS"
                boolean r1 = r4.equals(r1)
                if (r1 != 0) goto L_0x0075
                goto L_0x004a
            L_0x0060:
                java.lang.String r0 = "PAYMENT_WITHIN_BUDGET"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x0069
                goto L_0x004a
            L_0x0069:
                r0 = r1
                goto L_0x0075
            L_0x006b:
                java.lang.String r0 = "PAYMENT_WITHIN_BANK"
                boolean r0 = r4.equals(r0)
                if (r0 != 0) goto L_0x0074
                goto L_0x004a
            L_0x0074:
                r0 = 0
            L_0x0075:
                switch(r0) {
                    case 0: goto L_0x0082;
                    case 1: goto L_0x007f;
                    case 2: goto L_0x007c;
                    case 3: goto L_0x0079;
                    default: goto L_0x0078;
                }
            L_0x0078:
                goto L_0x0084
            L_0x0079:
                java.lang.String r3 = "other_bank"
                goto L_0x0084
            L_0x007c:
                java.lang.String r3 = "own_account"
                goto L_0x0084
            L_0x007f:
                java.lang.String r3 = "treasury"
                goto L_0x0084
            L_0x0082:
                java.lang.String r3 = "within_bank"
            L_0x0084:
                ck.g r0 = iu0.C36546y.m108282F()
                g81.w r1 = g81.C32276w.this
                java.lang.String r1 = r1.f79638L
                java.lang.String r4 = "open_transaction"
                r0.mo27152s(r1, r3, r4)
                android.content.Intent r0 = new android.content.Intent
                g81.w r1 = g81.C32276w.this
                android.content.Context r1 = r1.f79629C
                java.lang.Class<ge.bog.mobilebank.ui.activities.OperationDetailsActivity> r3 = p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity.class
                r0.<init>(r1, r3)
                if (r8 == 0) goto L_0x00a5
                r1 = 10
                goto L_0x00a7
            L_0x00a5:
                r1 = 20
            L_0x00a7:
                java.lang.String r3 = "PAYMENT_OPERATION_TYPE"
                r0.putExtra(r3, r1)
                if (r8 == 0) goto L_0x00b3
                android.os.Parcelable r8 = org.parceler.C42035e.m122121c(r8)
                goto L_0x00b7
            L_0x00b3:
                android.os.Parcelable r8 = org.parceler.C42035e.m122121c(r2)
            L_0x00b7:
                java.lang.String r1 = "PAYMENT_DETAILS_OBJECT"
                r0.putExtra(r1, r8)
                g81.w r8 = g81.C32276w.this
                android.content.Context r8 = r8.f79629C
                r8.startActivity(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g81.C32276w.C32279c.m95074w(android.view.View):void");
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e2, code lost:
            if (r10.equals("REPEAT_TRANSACTION_ID") == false) goto L_0x00da;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ void m95075x(boolean r9, java.lang.String r10) {
            /*
                r8 = this;
                com.alexandrius.accordionswipelayout.library.SwipeLayout r0 = r8.f79673m
                r1 = 2
                r2 = 1
                r0.mo7586B(r1, r2)
                g81.w r0 = g81.C32276w.this
                int r3 = r8.getAdapterPosition()
                int r3 = r0.m95039Y(r3)
                java.lang.Object r0 = r0.mo90883o(r3)
                j81.j r0 = (j81.C36768j) r0
                ge.bog.mobilebank.model.payment.LastOperation r0 = r0.getLastOperation()
                g81.w r3 = g81.C32276w.this
                int r4 = r8.getAdapterPosition()
                int r4 = r3.m95039Y(r4)
                java.lang.Object r3 = r3.mo90883o(r4)
                j81.j r3 = (j81.C36768j) r3
                ge.bog.mobilebank.model.TransferHistoryItem r3 = r3.getTransferHistoryItem()
                if (r0 != 0) goto L_0x0034
                if (r3 != 0) goto L_0x0034
                return
            L_0x0034:
                java.lang.String r4 = "CREATE"
                java.lang.String r5 = "swipe_menu_click"
                if (r9 == 0) goto L_0x00ce
                ck.g r9 = iu0.C36546y.m108282F()
                g81.w r10 = g81.C32276w.this
                java.lang.String r10 = r10.f79638L
                java.lang.String r1 = "automatic_services"
                r9.mo27152s(r10, r1, r5)
                if (r0 == 0) goto L_0x00b7
                java.lang.String r9 = r0.getEssPaymentId()
                if (r9 == 0) goto L_0x00b7
                g81.w r9 = g81.C32276w.this
                java.util.List r9 = r9.f79639M
                if (r9 == 0) goto L_0x00b7
                java.lang.String r9 = r0.getServiceId()
                ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r9 = r90.C27954d.m86302h(r9)
                if (r9 == 0) goto L_0x0276
                boolean r9 = r9.isDDAllowed()
                if (r9 == 0) goto L_0x0276
                java.util.List r9 = r90.C27954d.m86303i()
                java.util.Iterator r9 = r9.iterator()
            L_0x0071:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0276
                java.lang.Object r10 = r9.next()
                ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r10 = (p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration) r10
                java.lang.String r1 = r10.getPaymentServiceId()
                if (r1 == 0) goto L_0x0071
                java.lang.String r1 = r10.getPaymentServiceId()
                java.lang.String r2 = r0.getServiceId()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0071
                g81.w r9 = g81.C32276w.this
                android.content.Context r9 = r9.f79629C
                android.app.Activity r9 = (android.app.Activity) r9
                ge.bog.mobilebank.payment.model.a$a r9 = p341ge.bog.mobilebank.payment.model.C33624a.m98713a(r9)
                java.lang.Class<ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity> r1 = p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity.class
                ge.bog.mobilebank.payment.model.a$a r9 = r9.mo79806f(r1)
                java.lang.String r10 = r10.getServiceId()
                ge.bog.mobilebank.payment.model.a$a r9 = r9.mo79819s(r10)
                java.lang.String r10 = r0.getEssPaymentId()
                ge.bog.mobilebank.payment.model.a$a r9 = r9.mo79812l(r10)
                r9.mo79825y()
                return
            L_0x00b7:
                if (r3 == 0) goto L_0x0276
                g81.w r9 = g81.C32276w.this
                android.content.Context r9 = r9.f79629C
                java.lang.String r10 = "STO"
                ge.bog.mobilebank.transfers.model.TransferForm$I r9 = p341ge.bog.mobilebank.transfers.model.TransferForm.startWith((android.content.Context) r9, (java.lang.String) r10, (java.lang.String) r4)
                ge.bog.mobilebank.transfers.model.TransferForm$I r9 = r9.setTransferHistoryItem(r3)
                r9.start()
                goto L_0x0276
            L_0x00ce:
                r10.hashCode()
                int r9 = r10.hashCode()
                r6 = 0
                r7 = -1
                switch(r9) {
                    case -510760130: goto L_0x00f0;
                    case 38898075: goto L_0x00e5;
                    case 1239034208: goto L_0x00dc;
                    default: goto L_0x00da;
                }
            L_0x00da:
                r1 = r7
                goto L_0x00fa
            L_0x00dc:
                java.lang.String r9 = "REPEAT_TRANSACTION_ID"
                boolean r9 = r10.equals(r9)
                if (r9 != 0) goto L_0x00fa
                goto L_0x00da
            L_0x00e5:
                java.lang.String r9 = "SHARE_ID"
                boolean r9 = r10.equals(r9)
                if (r9 != 0) goto L_0x00ee
                goto L_0x00da
            L_0x00ee:
                r1 = r2
                goto L_0x00fa
            L_0x00f0:
                java.lang.String r9 = "SAVE_TEMPLATE_ID"
                boolean r9 = r10.equals(r9)
                if (r9 != 0) goto L_0x00f9
                goto L_0x00da
            L_0x00f9:
                r1 = r6
            L_0x00fa:
                switch(r1) {
                    case 0: goto L_0x01f2;
                    case 1: goto L_0x0187;
                    case 2: goto L_0x00ff;
                    default: goto L_0x00fd;
                }
            L_0x00fd:
                goto L_0x0276
            L_0x00ff:
                ck.g r9 = iu0.C36546y.m108282F()
                g81.w r10 = g81.C32276w.this
                java.lang.String r10 = r10.f79638L
                java.lang.String r1 = "repeat"
                r9.mo27152s(r10, r1, r5)
                if (r0 == 0) goto L_0x016e
                java.lang.String r9 = r0.getEssPaymentId()
                if (r9 == 0) goto L_0x016e
                g81.w r9 = g81.C32276w.this
                java.util.List r9 = r9.f79639M
                if (r9 == 0) goto L_0x016e
                g81.w r9 = g81.C32276w.this
                java.util.List r9 = r9.f79639M
                java.util.Iterator r9 = r9.iterator()
            L_0x0128:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0276
                java.lang.Object r10 = r9.next()
                ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r10 = (p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration) r10
                java.lang.String r1 = r10.getPaymentServiceId()
                if (r1 == 0) goto L_0x0128
                java.lang.String r1 = r10.getPaymentServiceId()
                java.lang.String r2 = r0.getServiceId()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0128
                g81.w r9 = g81.C32276w.this
                android.content.Context r9 = r9.f79629C
                android.app.Activity r9 = (android.app.Activity) r9
                ge.bog.mobilebank.payment.model.a$a r9 = p341ge.bog.mobilebank.payment.model.C33624a.m98713a(r9)
                java.lang.Class<ge.bog.mobilebank.payment.activities.PaymentFormActivity> r1 = p341ge.bog.mobilebank.payment.activities.PaymentFormActivity.class
                ge.bog.mobilebank.payment.model.a$a r9 = r9.mo79806f(r1)
                java.lang.String r10 = r10.getServiceId()
                ge.bog.mobilebank.payment.model.a$a r9 = r9.mo79819s(r10)
                java.lang.String r10 = r0.getEssPaymentId()
                ge.bog.mobilebank.payment.model.a$a r9 = r9.mo79812l(r10)
                r9.mo79825y()
                return
            L_0x016e:
                if (r3 == 0) goto L_0x0276
                g81.w r9 = g81.C32276w.this
                android.content.Context r9 = r9.f79629C
                java.lang.String r10 = "TRANSFER"
                java.lang.String r0 = "VIEW"
                ge.bog.mobilebank.transfers.model.TransferForm$I r9 = p341ge.bog.mobilebank.transfers.model.TransferForm.startWith((android.content.Context) r9, (java.lang.String) r10, (java.lang.String) r0)
                ge.bog.mobilebank.transfers.model.TransferForm$I r9 = r9.setTransferHistoryItem(r3)
                r9.start()
                goto L_0x0276
            L_0x0187:
                ck.g r9 = iu0.C36546y.m108282F()
                g81.w r10 = g81.C32276w.this
                java.lang.String r10 = r10.f79638L
                java.lang.String r1 = "share"
                r9.mo27152s(r10, r1, r5)
                ck.g r9 = iu0.C36546y.m108282F()
                java.lang.String r10 = "transaction_receipt"
                r9.mo27140K(r10)
                if (r0 == 0) goto L_0x01a6
                java.lang.String r9 = r0.getEssPaymentId()
                goto L_0x01ae
            L_0x01a6:
                long r9 = r3.getDocKey()
                java.lang.String r9 = java.lang.String.valueOf(r9)
            L_0x01ae:
                g81.w r10 = g81.C32276w.this
                r10.f79640N = r9
                g81.w r10 = g81.C32276w.this
                if (r0 == 0) goto L_0x01b8
                goto L_0x01b9
            L_0x01b8:
                r2 = r6
            L_0x01b9:
                r10.f79641O = r2
                g81.w r10 = g81.C32276w.this
                boolean r10 = r10.f79641O
                java.lang.String r9 = g91.C32303f.m95192c(r10, r9)
                g81.w r10 = g81.C32276w.this
                android.content.Context r10 = r10.f79629C
                android.app.Activity r10 = (android.app.Activity) r10
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                g81.w r1 = g81.C32276w.this
                android.content.Context r1 = r1.f79629C
                int r2 = p366bk.C10328q.f28968x1
                java.lang.String r1 = r1.getString(r2)
                r0.append(r1)
                java.lang.String r1 = ".pdf"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "application/pdf"
                g91.C32303f.m95195f(r9, r10, r0, r1)
                goto L_0x0276
            L_0x01f2:
                ck.g r9 = iu0.C36546y.m108282F()
                g81.w r10 = g81.C32276w.this
                java.lang.String r10 = r10.f79638L
                java.lang.String r1 = "save_template"
                r9.mo27152s(r10, r1, r5)
                if (r0 == 0) goto L_0x0261
                java.lang.String r9 = r0.getEssPaymentId()
                if (r9 == 0) goto L_0x0261
                g81.w r9 = g81.C32276w.this
                java.util.List r9 = r9.f79639M
                if (r9 == 0) goto L_0x0261
                g81.w r9 = g81.C32276w.this
                java.util.List r9 = r9.f79639M
                java.util.Iterator r9 = r9.iterator()
            L_0x021b:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0276
                java.lang.Object r10 = r9.next()
                ge.bog.mobilebank.model.payment.PaymentProviderConfiguration r10 = (p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration) r10
                java.lang.String r1 = r10.getPaymentServiceId()
                if (r1 == 0) goto L_0x021b
                java.lang.String r1 = r10.getPaymentServiceId()
                java.lang.String r2 = r0.getServiceId()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x021b
                g81.w r9 = g81.C32276w.this
                android.content.Context r9 = r9.f79629C
                android.app.Activity r9 = (android.app.Activity) r9
                ge.bog.mobilebank.payment.model.a$a r9 = p341ge.bog.mobilebank.payment.model.C33624a.m98713a(r9)
                java.lang.Class<ge.bog.mobilebank.payment.activities.TemplateFormActivity> r1 = p341ge.bog.mobilebank.payment.activities.TemplateFormActivity.class
                ge.bog.mobilebank.payment.model.a$a r9 = r9.mo79806f(r1)
                java.lang.String r10 = r10.getServiceId()
                ge.bog.mobilebank.payment.model.a$a r9 = r9.mo79819s(r10)
                java.lang.String r10 = r0.getEssPaymentId()
                ge.bog.mobilebank.payment.model.a$a r9 = r9.mo79812l(r10)
                r9.mo79825y()
                return
            L_0x0261:
                if (r3 == 0) goto L_0x0276
                g81.w r9 = g81.C32276w.this
                android.content.Context r9 = r9.f79629C
                java.lang.String r10 = "TEMPLATE"
                ge.bog.mobilebank.transfers.model.TransferForm$I r9 = p341ge.bog.mobilebank.transfers.model.TransferForm.startWith((android.content.Context) r9, (java.lang.String) r10, (java.lang.String) r4)
                ge.bog.mobilebank.transfers.model.TransferForm$I r9 = r9.setTransferHistoryItem(r3)
                r9.start()
            L_0x0276:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g81.C32276w.C32279c.m95075x(boolean, java.lang.String):void");
        }
    }

    /* renamed from: g81.w$d */
    private class C32280d extends C37107d {

        /* renamed from: f */
        private View f79677f;

        /* renamed from: g */
        private View f79678g;

        public C32280d(View view) {
            super(view);
            this.f79677f = view.findViewById(C10322k.top_menu_left_text_container);
            this.f79678g = view.findViewById(C10322k.top_menu_middle_text_container);
            View view2 = this.f79677f;
            Context K = C32276w.this.f79629C;
            int i = C10320i.background_grey_fill_corner_radius;
            view2.setBackground(C0767a.m2895e(K, i));
            this.f79678g.setBackground(C0767a.m2895e(C32276w.this.f79629C, i));
            int O = C32276w.this.f79632F;
            if (O == 0) {
                this.f79677f.setBackground(C32335t0.m95362g(C32276w.this.f79629C, C10316e.background_orange_fill_corner_radius));
            } else if (O == 1) {
                this.f79678g.setBackground(C32335t0.m95362g(C32276w.this.f79629C, C10316e.background_orange_fill_corner_radius));
            }
            C36770l unused = C32276w.this.getClass();
        }
    }

    private C32276w(C37693a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public int m95039Y(int i) {
        return i - m95041a0();
    }

    /* renamed from: Z */
    public static C32276w m95040Z(Context context, int i, Client client, boolean z, boolean z2, boolean z3, C36769k kVar, C36770l lVar, String str) {
        C37693a aVar = new C37693a();
        aVar.mo90874e(C10324m.operation_error_item);
        aVar.mo90875f(C10324m.operaion_loading_item);
        aVar.mo90873d(C10322k.f28793Ts);
        C32276w wVar = new C32276w(aVar);
        wVar.f79638L = str;
        wVar.m95046i0(context, i, client, z, z2, z3, kVar, lVar);
        return wVar;
    }

    /* renamed from: a0 */
    private int m95041a0() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        int i7 = (this.f79636J ? 1 : 0) + true;
        if (mo90885q() || !this.f79636J || !isEmpty()) {
            i = 0;
        } else {
            i = 1;
        }
        int i8 = i7 + i;
        if (this.f79642l == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int i9 = i8 + i2;
        if (this.f79643m == null) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        int i12 = i9 + i3;
        if (this.f79645o == null) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        int i13 = i12 + i4;
        if (this.f79646p == null) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        int i14 = i13 + i5;
        if (this.f79644n == null) {
            i6 = 0;
        }
        int i15 = i14 + i6;
        if (!this.f79637K || mo90885q() || !isEmpty()) {
            return i15;
        }
        return i15 + 1;
    }

    /* renamed from: b0 */
    private int m95042b0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.f79631E;
        int i8 = 1;
        if (i == 1) {
            return i7;
        }
        if (i == 2) {
            if (this.f79642l == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            int i9 = i7 + i2;
            if (this.f79644n == null) {
                i8 = 0;
            }
            return i9 + i8;
        } else if (i == 3) {
            if (this.f79645o == null) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i12 = i7 + i3;
            if (this.f79642l == null) {
                i8 = 0;
            }
            return i12 + i8;
        } else if (i == 6) {
            return i7;
        } else {
            if (i != 8) {
                return 0;
            }
            if (this.f79644n == null) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            int i13 = i7 + i4;
            if (this.f79645o == null) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            int i14 = i13 + i5;
            if (this.f79642l == null) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            int i15 = i14 + i6;
            if (this.f79643m == null) {
                i8 = 0;
            }
            return i15 + i8;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m95043d0(View view) {
        this.f79630D.mo86062e(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m95044e0(int i) {
        if (this.f79630D != null) {
            CircularItemInterface circularItemInterface = new CircularItemInterface();
            circularItemInterface.setSumItem(false);
            circularItemInterface.setAddItem(true);
            this.f79630D.mo86061c(i, circularItemInterface);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m95045f0(int i) {
        if (this.f79630D != null) {
            CircularItemInterface circularItemInterface = new CircularItemInterface();
            circularItemInterface.setSumItem(false);
            circularItemInterface.setAddItem(true);
            this.f79630D.mo86061c(i, circularItemInterface);
        }
    }

    /* renamed from: i0 */
    private void m95046i0(Context context, int i, Client client, boolean z, boolean z2, boolean z3, C36769k kVar, C36770l lVar) {
        this.f79629C = context;
        this.f79630D = kVar;
        this.f79632F = i;
        this.f79633G = client;
        this.f79635I = z;
        this.f79637K = z2;
        this.f79636J = z3;
        this.f79631E = 1;
        this.f79634H = AnimationUtils.loadAnimation(context, C10313b.infinite_alpha);
        this.f79639M = C27954d.m86303i();
    }

    /* renamed from: c0 */
    public void mo72798c0(int i, Object obj) {
        if (i == 3) {
            try {
                TemplateBasketItem templateBasketItem = (TemplateBasketItem) obj;
                C32175h hVar = this.f79644n;
                if (hVar != null) {
                    hVar.mo72702r(templateBasketItem);
                }
            } catch (Exception unused) {
                TemplateGroup templateGroup = (TemplateGroup) obj;
                C32175h hVar2 = this.f79644n;
                if (hVar2 != null) {
                    hVar2.mo72701q(templateGroup);
                }
            }
        }
    }

    /* renamed from: g0 */
    public void onViewAttachedToWindow(C37107d dVar) {
        super.onViewAttachedToWindow(dVar);
        if (dVar.getItemViewType() == -2) {
            dVar.f89287d.findViewById(C10322k.animation_container).startAnimation(this.f79634H);
        }
    }

    public int getItemCount() {
        return m95041a0() + super.getItemCount();
    }

    public int getItemViewType(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i12;
        int i13;
        int i14;
        int i15;
        int itemViewType = super.getItemViewType(i);
        if (itemViewType != -1) {
            return itemViewType;
        }
        if (i == 0 && this.f79635I) {
            return 10;
        }
        if (i == 0) {
            return 5;
        }
        int i16 = 1;
        if (i == 1 && this.f79637K && !mo90885q() && (mo90884p() == null || mo90884p().size() == 0)) {
            return 50;
        }
        C32175h hVar = this.f79645o;
        if (hVar != null && i == this.f79631E) {
            return 22;
        }
        C32175h hVar2 = this.f79642l;
        if (hVar2 != null && i == this.f79631E) {
            return 20;
        }
        C32175h hVar3 = this.f79644n;
        if (hVar3 != null) {
            int i17 = this.f79631E;
            if (hVar2 == null) {
                i14 = 0;
            } else {
                i14 = 1;
            }
            int i18 = i17 + i14;
            if (hVar == null) {
                i15 = 0;
            } else {
                i15 = 1;
            }
            if (i == i18 + i15) {
                return 26;
            }
        }
        C32175h hVar4 = this.f79643m;
        if (hVar4 != null) {
            int i19 = this.f79631E;
            if (hVar2 == null) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i22 = i19 + i12;
            if (hVar3 == null) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            if (i == i22 + i13) {
                return 23;
            }
        }
        C32175h hVar5 = this.f79646p;
        if (hVar5 != null) {
            int i23 = this.f79631E;
            if (hVar2 == null) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            int i24 = i23 + i6;
            if (hVar4 == null) {
                i7 = 0;
            } else {
                i7 = 1;
            }
            int i25 = i24 + i7;
            if (hVar == null) {
                i8 = 0;
            } else {
                i8 = 1;
            }
            int i26 = i25 + i8;
            if (hVar3 == null) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            if (i == i26 + i9) {
                return 29;
            }
        }
        if (hVar2 == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (hVar4 == null) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        int i27 = i2 + i3;
        if (hVar == null) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        int i28 = i27 + i4;
        if (hVar3 == null) {
            i5 = 0;
        } else {
            i5 = 1;
        }
        int i29 = i28 + i5;
        if (hVar5 == null) {
            i16 = 0;
        }
        int i32 = i29 + i16;
        if (!this.f79636J) {
            return 3333;
        }
        if (i == this.f79631E + i32) {
            return 45;
        }
        if (mo90885q() || !isEmpty()) {
            return 3333;
        }
        return 100;
    }

    /* renamed from: h0 */
    public void mo72800h0(int i, ArrayList arrayList, TemplateBasketItemsWithPaymentConfig templateBasketItemsWithPaymentConfig, int i2, Runnable runnable) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (i == 1) {
            C32175h hVar = this.f79642l;
            if (hVar == null) {
                C32175h hVar2 = new C32175h(arrayList, this.f79629C, this.f79630D, i, this.f79633G);
                this.f79642l = hVar2;
                hVar2.mo72697m(true);
            } else {
                hVar.mo72696l();
                this.f79642l.mo72699o(arrayList);
                this.f79642l.mo72698n(this.f79633G);
            }
            this.f79648r = i2;
            this.f79653w = runnable;
        } else if (i == 2) {
            if (!(arrayList == null || arrayList.size() == 0)) {
                C32175h hVar3 = this.f79643m;
                if (hVar3 == null) {
                    this.f79643m = new C32175h(arrayList, this.f79629C, this.f79630D, i, this.f79633G);
                } else {
                    hVar3.mo72696l();
                    this.f79643m.mo72699o(arrayList);
                    this.f79643m.mo72698n(this.f79633G);
                }
            }
            this.f79647q = i2;
            this.f79654x = runnable;
        } else if (i == 3) {
            C32175h hVar4 = this.f79644n;
            if (hVar4 == null) {
                C32175h hVar5 = new C32175h(arrayList, this.f79629C, this.f79630D, i, this.f79633G);
                this.f79644n = hVar5;
                if (arrayList == null || arrayList.size() <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                hVar5.mo72695k(z2);
                this.f79644n.mo72694j(true);
            } else {
                if (arrayList == null || arrayList.size() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                hVar4.mo72695k(z);
                this.f79644n.mo72696l();
                this.f79644n.mo72699o(arrayList);
                this.f79644n.mo72698n(this.f79633G);
            }
            if (arrayList == null || arrayList.size() <= 0) {
                z3 = false;
            }
            this.f79651u = z3;
            this.f79627A = new C32273t(this, i);
            this.f79644n.mo72700p(templateBasketItemsWithPaymentConfig);
            this.f79649s = i2;
            this.f79655y = runnable;
        } else if (i == 6) {
            C32175h hVar6 = this.f79645o;
            if (hVar6 == null) {
                this.f79645o = new C32175h(arrayList, this.f79629C, this.f79630D, i, this.f79633G);
            } else {
                hVar6.mo72696l();
                this.f79645o.mo72699o(arrayList);
                this.f79645o.mo72698n(this.f79633G);
            }
        } else if (i == 8) {
            C32175h hVar7 = this.f79646p;
            if (hVar7 == null) {
                C32175h hVar8 = new C32175h(arrayList, this.f79629C, this.f79630D, i, this.f79633G);
                this.f79646p = hVar8;
                hVar8.mo72694j(true);
            } else {
                hVar7.mo72696l();
                this.f79646p.mo72699o(arrayList);
                this.f79646p.mo72698n(this.f79633G);
            }
            this.f79628B = new C32274u(this, i);
            if (arrayList == null || arrayList.size() <= 0) {
                z3 = false;
            }
            this.f79652v = z3;
            this.f79650t = i2;
            this.f79656z = runnable;
        }
        notifyItemChanged(m95042b0(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo72619v(C37107d dVar, int i) {
        super.mo72619v(dVar, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo72620w(C37107d dVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        int i2;
        int itemViewType = dVar.getItemViewType();
        if (itemViewType != 20) {
            int i3 = 8;
            if (itemViewType == 26) {
                C32278b bVar = (C32278b) dVar;
                if (bVar.f79658f.getAdapter() != this.f79644n) {
                    bVar.f79658f.setAdapter(this.f79644n);
                }
                if (this.f79629C instanceof AllTemplateListActivity) {
                    bVar.f79660h.setText(this.f79629C.getString(C10328q.header_text_payments));
                } else {
                    bVar.f79660h.setText(this.f79629C.getString(C10328q.templates_card_view_title));
                }
                View j = bVar.f79662j;
                if (this.f79651u) {
                    i3 = 0;
                }
                j.setVisibility(i3);
                bVar.f79659g.setExecutableRunnable(this.f79655y);
                bVar.f79659g.setEmptyRunnable(this.f79627A);
                int i4 = this.f79649s;
                if (i4 == 10) {
                    bVar.f79659g.setState(0);
                } else if (i4 != 20) {
                    if (i4 == 30) {
                        bVar.f79659g.setState(1);
                    } else if (i4 == 40) {
                        bVar.f79659g.setState(1);
                    }
                } else if (this.f79644n.getItemCount() == 1) {
                    bVar.f79659g.setState(3);
                } else {
                    bVar.f79659g.setState(2);
                }
            } else if (itemViewType == 29) {
                C32278b bVar2 = (C32278b) dVar;
                if (bVar2.f79658f.getAdapter() != this.f79646p) {
                    bVar2.f79658f.setAdapter(this.f79646p);
                }
                if (this.f79629C instanceof AllTemplateListActivity) {
                    bVar2.f79660h.setText(this.f79629C.getString(C10328q.header_text_transfers));
                } else {
                    bVar2.f79660h.setText(this.f79629C.getString(C10328q.templates_card_view_title));
                }
                bVar2.mo72801o(HorizontalRecyclerViewHolder.TRANSFER_TEMPLATE_TYPE);
                View j2 = bVar2.f79662j;
                if (this.f79652v) {
                    i3 = 0;
                }
                j2.setVisibility(i3);
                bVar2.f79659g.setExecutableRunnable(this.f79656z);
                bVar2.f79659g.setEmptyRunnable(this.f79628B);
                int i5 = this.f79650t;
                if (i5 == 10) {
                    bVar2.f79659g.setState(0);
                } else if (i5 != 20) {
                    if (i5 == 30) {
                        bVar2.f79659g.setState(1);
                    } else if (i5 == 40) {
                        bVar2.f79659g.setState(1);
                    }
                } else if (this.f79646p.getItemCount() == 1) {
                    bVar2.f79659g.setState(3);
                } else {
                    bVar2.f79659g.setState(2);
                }
            } else if (itemViewType == 3333) {
                C36768j jVar = (C36768j) mo90883o(m95039Y(i));
                if (jVar.getLastOperation() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (jVar.getTransferHistoryItem() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    PaymentProviderConfiguration h = C27954d.m86302h(jVar.getLastOperation().getServiceId());
                    if (h == null || !h.isDDAllowed()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (h == null || !h.isTemplateAccessAllowed) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                } else {
                    if (z2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z3 = z4;
                }
                ArrayList arrayList = new ArrayList();
                if (z4) {
                    arrayList.add(new SwipeLayout.C2363g("SAVE_TEMPLATE_ID", this.f79629C.getString(C10328q.statement_swipe_menu_save_template), Integer.valueOf(C10320i.ic_swipe_add), (Integer) null, (Integer) null, (Integer) null, (Float) null));
                }
                arrayList.add(new SwipeLayout.C2363g("SHARE_ID", this.f79629C.getString(C10328q.download_receipt), Integer.valueOf(C10320i.ic_download_menu_item), (Integer) null, (Integer) null, (Integer) null, (Float) null));
                arrayList.add(new SwipeLayout.C2363g("REPEAT_TRANSACTION_ID", this.f79629C.getString(C10328q.statement_swipe_menu_repeat), Integer.valueOf(C10320i.ic_reload), (Integer) null, (Integer) null, (Integer) null, (Float) null));
                int[] s = C32303f.m95208s(this.f79629C, arrayList.size());
                int[] u = C32303f.m95210u(this.f79629C, arrayList.size());
                int[] t = C32303f.m95209t(this.f79629C, arrayList.size());
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    ((SwipeLayout.C2363g) arrayList.get(i6)).f7484d = Integer.valueOf(s[i6]);
                    ((SwipeLayout.C2363g) arrayList.get(i6)).f7485e = Integer.valueOf(u[i6]);
                    ((SwipeLayout.C2363g) arrayList.get(i6)).f7486f = Integer.valueOf(t[i6]);
                }
                C32279c cVar = (C32279c) dVar;
                cVar.f79673m.setRightSwipeItems(arrayList);
                String string = this.f79629C.getString(C10328q.template_swipe_menu_automatic_services);
                Integer valueOf = Integer.valueOf(C10320i.ic_swipe_automatic);
                Integer valueOf2 = Integer.valueOf(C0767a.m2893c(this.f79629C, C10318g.swipe_menu_item_1));
                Context context = this.f79629C;
                int i7 = C10318g.swipe_menu_item_text_color;
                SwipeLayout.C2363g gVar = new SwipeLayout.C2363g("AUTOMATIC_SERVICES_ID", string, valueOf, valueOf2, Integer.valueOf(C0767a.m2893c(context, i7)), Integer.valueOf(C0767a.m2893c(this.f79629C, i7)), (Float) null);
                if (jVar.getCategoryColor() != -1) {
                    cVar.f79675o.setVisibility(0);
                    cVar.f79675o.setBackgroundColor(jVar.getCategoryColor());
                } else {
                    cVar.f79675o.setVisibility(8);
                }
                cVar.f79673m.setLeftSwipeItem(gVar);
                SwipeLayout t2 = cVar.f79673m;
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                t2.mo7585A(true, 0, f);
                cVar.f79673m.mo7598r();
                cVar.f79670j.setText(C32319m.m95296c(jVar.getOperationTime().longValue(), this.f79629C));
                cVar.f79667g.setText(jVar.getMainText());
                cVar.f79668h.setText(jVar.getBottomText());
                BogTextView l = cVar.f79668h;
                if (TextUtils.isEmpty(jVar.getBottomText())) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                l.setVisibility(i2);
                cVar.f79669i.setText(String.format("-%s", new Object[]{jVar.getAmountText()}));
                cVar.f79671k.setVisibility(8);
                if (jVar.getImageUrl() != null || z) {
                    ImageView q = cVar.f79666f;
                    String e = C32289b0.m95093e(jVar.getImageUrl());
                    int i8 = C10320i.f28688dc;
                    C32289b0.m95107s(q, e, Integer.valueOf(i8), Integer.valueOf(i8), true, false);
                    cVar.f79666f.setVisibility(0);
                    cVar.f79672l.setText("");
                } else if (jVar.getImageRes() > 0) {
                    cVar.f79666f.setVisibility(0);
                    cVar.f79672l.setText("");
                    ImageView q2 = cVar.f79666f;
                    Integer valueOf3 = Integer.valueOf(jVar.getImageRes());
                    int i9 = C10320i.f28688dc;
                    C32289b0.m95100l(q2, valueOf3, Integer.valueOf(i9), Integer.valueOf(i9), true);
                } else {
                    cVar.f79666f.setVisibility(8);
                    cVar.f79672l.setText(jVar.getImageText());
                }
                cVar.f79666f.setAlpha(1.0f);
                cVar.f79669i.setTextColor(C0767a.m2893c(this.f79629C, C10318g.bog_black_color));
                cVar.f79667g.setTextColor(C0767a.m2893c(this.f79629C, C10318g.dark_text_color));
                cVar.f79674n.setBackgroundColor(C0767a.m2893c(this.f79629C, C10318g.f28616A));
            } else if (itemViewType == 22) {
                C32278b bVar3 = (C32278b) dVar;
                if (bVar3.f79658f.getAdapter() != this.f79645o) {
                    bVar3.f79658f.setAdapter(this.f79645o);
                }
                bVar3.f79660h.setText(this.f79629C.getString(C10328q.payments_card_view_title_categories));
                bVar3.f79662j.setVisibility(8);
                bVar3.f79659g.setState(2);
            } else if (itemViewType == 23) {
                C32278b bVar4 = (C32278b) dVar;
                if (bVar4.f79658f.getAdapter() != this.f79643m) {
                    bVar4.f79658f.setAdapter(this.f79643m);
                }
                bVar4.f79660h.setText(this.f79629C.getString(C10328q.payment_method));
                bVar4.f79662j.setVisibility(8);
                bVar4.f79659g.setExecutableRunnable(this.f79654x);
                int i12 = this.f79647q;
                if (i12 == 10) {
                    bVar4.f79659g.setState(0);
                } else if (i12 == 20) {
                    bVar4.f79659g.setState(2);
                } else if (i12 == 30) {
                    bVar4.f79659g.setState(1);
                } else if (i12 == 40) {
                    bVar4.f79659g.setState(1);
                }
            }
        } else {
            C32278b bVar5 = (C32278b) dVar;
            if (bVar5.f79658f.getAdapter() != this.f79642l) {
                bVar5.f79658f.setAdapter(this.f79642l);
            }
            bVar5.f79660h.setText(this.f79629C.getString(C10328q.payments_card_view_title_categories));
            bVar5.f79662j.setVisibility(0);
            bVar5.f79659g.setExecutableRunnable(this.f79653w);
            int i13 = this.f79648r;
            if (i13 == 10) {
                bVar5.f79659g.setState(0);
            } else if (i13 == 20) {
                bVar5.f79659g.setState(2);
            } else if (i13 == 30) {
                bVar5.f79659g.setState(1);
            } else if (i13 == 40) {
                bVar5.f79659g.setState(1);
            }
        }
    }

    /* renamed from: y */
    public C37107d mo72621y(ViewGroup viewGroup, int i) {
        if (i == 5) {
            return new C37107d(new BigDividerView(this.f79629C));
        }
        if (i == 10) {
            return new C32280d(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_top_menu, viewGroup, false));
        }
        if (!(i == 20 || i == 26 || i == 29)) {
            if (i == 45) {
                return new C32277a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_last_operations_list_header, viewGroup, false));
            }
            if (i == 50) {
                return new C32277a(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.operations_no_data_view, viewGroup, false));
            }
            if (i == 100) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_empty_operations_item, viewGroup, false);
                inflate.findViewById(C10322k.f28889ro).setOnClickListener(new C32275v(this));
                return new C32277a(inflate);
            } else if (i == 3333) {
                return new C32279c(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.operations_swipable_layout, viewGroup, false));
            } else {
                if (!(i == 22 || i == 23)) {
                    return null;
                }
            }
        }
        return new C32278b(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.payments_horizontal_recycler_view, viewGroup, false));
    }
}
