package f50;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import b50.C19335b;
import b50.C19336c;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import g91.C32289b0;
import g91.C32297d;
import g91.C32303f;
import g91.C32343x;
import g91.C32359z0;
import h50.C24881a;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.OperationDetailsActivity;
import p341ge.bog.mobilebank.p975ui.activities.qrpay.QrPayReversalActivity;
import p341ge.bog.mobilebank.payment.activities.DDTransparentLoaderActivity;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import r90.C27950a;
import ue1.C43075l;

/* renamed from: f50.f */
public final class C20432f extends C20427a {

    /* renamed from: t */
    public static final C20433a f55387t = new C20433a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final Activity f55388f;

    /* renamed from: g */
    private final String f55389g;

    /* renamed from: h */
    private final boolean f55390h;

    /* renamed from: i */
    private final TextView f55391i;

    /* renamed from: j */
    private final ImageView f55392j;

    /* renamed from: k */
    private final TextView f55393k;

    /* renamed from: l */
    private final TextView f55394l;

    /* renamed from: m */
    private final TextView f55395m;

    /* renamed from: n */
    private final TextView f55396n;

    /* renamed from: o */
    private final SwipeLayout f55397o;

    /* renamed from: p */
    private final View f55398p;

    /* renamed from: q */
    private final AppCompatImageView f55399q;

    /* renamed from: r */
    private final C10463g f55400r;

    /* renamed from: s */
    private final PopupWindow f55401s;

    /* renamed from: f50.f$a */
    public static final class C20433a {
        private C20433a() {
        }

        public /* synthetic */ C20433a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C20432f m66586b(C20433a aVar, ViewGroup viewGroup, Activity activity, String str, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = true;
            }
            return aVar.mo48921a(viewGroup, activity, str, z);
        }

        /* renamed from: a */
        public final C20432f mo48921a(ViewGroup viewGroup, Activity activity, String str, boolean z) {
            C41536l.m120489i(viewGroup, "parent");
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(str, "analyticsCategory");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.transaction_swipable_list_item, viewGroup, false);
            C41536l.m120488h(inflate, "itemView");
            return new C20432f(inflate, activity, str, z);
        }
    }

    /* renamed from: f50.f$b */
    public static abstract class C20434b {

        /* renamed from: f50.f$b$a */
        public static final class C20435a extends C20434b {

            /* renamed from: a */
            private final String f55402a;

            /* renamed from: b */
            private final boolean f55403b;

            public C20435a(String str, boolean z) {
                super((DefaultConstructorMarker) null);
                this.f55402a = str;
                this.f55403b = z;
            }

            /* renamed from: a */
            public final String mo48922a() {
                return this.f55402a;
            }

            /* renamed from: b */
            public final boolean mo48923b() {
                return this.f55403b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C20435a)) {
                    return false;
                }
                C20435a aVar = (C20435a) obj;
                return C41536l.m120484d(this.f55402a, aVar.f55402a) && this.f55403b == aVar.f55403b;
            }

            public int hashCode() {
                String str = this.f55402a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                boolean z = this.f55403b;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            public String toString() {
                String str = this.f55402a;
                boolean z = this.f55403b;
                return "OperationDateHeaderUiModel(text=" + str + ", isHeaderShown=" + z + ")";
            }
        }

        /* renamed from: f50.f$b$b */
        public static final class C20436b extends C20434b {

            /* renamed from: a */
            private final Integer f55404a;

            /* renamed from: b */
            private final BigDecimal f55405b;

            /* renamed from: c */
            private final String f55406c;

            /* renamed from: d */
            private final String f55407d;

            /* renamed from: e */
            private final Boolean f55408e;

            /* renamed from: f */
            private final AccountOperation f55409f;

            /* renamed from: g */
            private final String f55410g;

            /* renamed from: h */
            private final String f55411h;

            /* renamed from: i */
            private final Long f55412i;

            /* renamed from: j */
            private final String f55413j;

            /* renamed from: k */
            private final C19336c f55414k;

            /* renamed from: l */
            private final Boolean f55415l;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public /* synthetic */ C20436b(java.lang.Integer r14, java.math.BigDecimal r15, java.lang.String r16, java.lang.String r17, java.lang.Boolean r18, p341ge.bog.mobilebank.model.account.AccountOperation r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, java.lang.String r23, b50.C19336c r24, java.lang.Boolean r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
                /*
                    r13 = this;
                    r0 = r26
                    r1 = r0 & 1
                    r2 = 0
                    if (r1 == 0) goto L_0x0009
                    r1 = r2
                    goto L_0x000a
                L_0x0009:
                    r1 = r14
                L_0x000a:
                    r3 = r0 & 2
                    if (r3 == 0) goto L_0x0010
                    r3 = r2
                    goto L_0x0011
                L_0x0010:
                    r3 = r15
                L_0x0011:
                    r4 = r0 & 4
                    if (r4 == 0) goto L_0x0017
                    r4 = r2
                    goto L_0x0019
                L_0x0017:
                    r4 = r16
                L_0x0019:
                    r5 = r0 & 8
                    if (r5 == 0) goto L_0x001f
                    r5 = r2
                    goto L_0x0021
                L_0x001f:
                    r5 = r17
                L_0x0021:
                    r6 = r0 & 16
                    if (r6 == 0) goto L_0x0027
                    r6 = r2
                    goto L_0x0029
                L_0x0027:
                    r6 = r18
                L_0x0029:
                    r7 = r0 & 32
                    if (r7 == 0) goto L_0x002f
                    r7 = r2
                    goto L_0x0031
                L_0x002f:
                    r7 = r19
                L_0x0031:
                    r8 = r0 & 64
                    if (r8 == 0) goto L_0x0037
                    r8 = r2
                    goto L_0x0039
                L_0x0037:
                    r8 = r20
                L_0x0039:
                    r9 = r0 & 128(0x80, float:1.794E-43)
                    if (r9 == 0) goto L_0x003f
                    r9 = r2
                    goto L_0x0041
                L_0x003f:
                    r9 = r21
                L_0x0041:
                    r10 = r0 & 256(0x100, float:3.59E-43)
                    if (r10 == 0) goto L_0x0047
                    r10 = r2
                    goto L_0x0049
                L_0x0047:
                    r10 = r22
                L_0x0049:
                    r11 = r0 & 512(0x200, float:7.175E-43)
                    if (r11 == 0) goto L_0x004f
                    r11 = r2
                    goto L_0x0051
                L_0x004f:
                    r11 = r23
                L_0x0051:
                    r12 = r0 & 1024(0x400, float:1.435E-42)
                    if (r12 == 0) goto L_0x0057
                    r12 = r2
                    goto L_0x0059
                L_0x0057:
                    r12 = r24
                L_0x0059:
                    r0 = r0 & 2048(0x800, float:2.87E-42)
                    if (r0 == 0) goto L_0x005e
                    goto L_0x0060
                L_0x005e:
                    r2 = r25
                L_0x0060:
                    r14 = r13
                    r15 = r1
                    r16 = r3
                    r17 = r4
                    r18 = r5
                    r19 = r6
                    r20 = r7
                    r21 = r8
                    r22 = r9
                    r23 = r10
                    r24 = r11
                    r25 = r12
                    r26 = r2
                    r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: f50.C20432f.C20434b.C20436b.<init>(java.lang.Integer, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.Boolean, ge.bog.mobilebank.model.account.AccountOperation, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, b50.c, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            /* renamed from: a */
            public final AccountOperation mo48927a() {
                return this.f55409f;
            }

            /* renamed from: b */
            public final Integer mo48928b() {
                return this.f55404a;
            }

            /* renamed from: c */
            public final String mo48929c() {
                return this.f55413j;
            }

            /* renamed from: d */
            public final Boolean mo48930d() {
                return this.f55408e;
            }

            /* renamed from: e */
            public final Long mo48931e() {
                return this.f55412i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C20436b)) {
                    return false;
                }
                C20436b bVar = (C20436b) obj;
                return C41536l.m120484d(this.f55404a, bVar.f55404a) && C41536l.m120484d(this.f55405b, bVar.f55405b) && C41536l.m120484d(this.f55406c, bVar.f55406c) && C41536l.m120484d(this.f55407d, bVar.f55407d) && C41536l.m120484d(this.f55408e, bVar.f55408e) && C41536l.m120484d(this.f55409f, bVar.f55409f) && C41536l.m120484d(this.f55410g, bVar.f55410g) && C41536l.m120484d(this.f55411h, bVar.f55411h) && C41536l.m120484d(this.f55412i, bVar.f55412i) && C41536l.m120484d(this.f55413j, bVar.f55413j) && this.f55414k == bVar.f55414k && C41536l.m120484d(this.f55415l, bVar.f55415l);
            }

            /* renamed from: f */
            public final C19336c mo48933f() {
                return this.f55414k;
            }

            /* renamed from: g */
            public final String mo48934g() {
                return this.f55411h;
            }

            /* renamed from: h */
            public final BigDecimal mo48935h() {
                return this.f55405b;
            }

            public int hashCode() {
                Integer num = this.f55404a;
                int i = 0;
                int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                BigDecimal bigDecimal = this.f55405b;
                int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
                String str = this.f55406c;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f55407d;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.f55408e;
                int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                AccountOperation accountOperation = this.f55409f;
                int hashCode6 = (hashCode5 + (accountOperation == null ? 0 : accountOperation.hashCode())) * 31;
                String str3 = this.f55410g;
                int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f55411h;
                int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Long l = this.f55412i;
                int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
                String str5 = this.f55413j;
                int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
                C19336c cVar = this.f55414k;
                int hashCode11 = (hashCode10 + (cVar == null ? 0 : cVar.hashCode())) * 31;
                Boolean bool2 = this.f55415l;
                if (bool2 != null) {
                    i = bool2.hashCode();
                }
                return hashCode11 + i;
            }

            /* renamed from: i */
            public final String mo48937i() {
                return this.f55406c;
            }

            /* renamed from: j */
            public final String mo48938j() {
                return this.f55410g;
            }

            /* renamed from: k */
            public final String mo48939k() {
                return this.f55407d;
            }

            public String toString() {
                Integer num = this.f55404a;
                BigDecimal bigDecimal = this.f55405b;
                String str = this.f55406c;
                String str2 = this.f55407d;
                Boolean bool = this.f55408e;
                AccountOperation accountOperation = this.f55409f;
                String str3 = this.f55410g;
                String str4 = this.f55411h;
                Long l = this.f55412i;
                String str5 = this.f55413j;
                C19336c cVar = this.f55414k;
                Boolean bool2 = this.f55415l;
                return "OperationDetailsUiModel(amountColor=" + num + ", subamount=" + bigDecimal + ", subamountType=" + str + ", url=" + str2 + ", applyTint=" + bool + ", accountOperation=" + accountOperation + ", title=" + str3 + ", subTitle=" + str4 + ", date=" + l + ", amountccy=" + str5 + ", sign=" + cVar + ", approved=" + bool2 + ")";
            }

            public C20436b(Integer num, BigDecimal bigDecimal, String str, String str2, Boolean bool, AccountOperation accountOperation, String str3, String str4, Long l, String str5, C19336c cVar, Boolean bool2) {
                super((DefaultConstructorMarker) null);
                this.f55404a = num;
                this.f55405b = bigDecimal;
                this.f55406c = str;
                this.f55407d = str2;
                this.f55408e = bool;
                this.f55409f = accountOperation;
                this.f55410g = str3;
                this.f55411h = str4;
                this.f55412i = l;
                this.f55413j = str5;
                this.f55414k = cVar;
                this.f55415l = bool2;
            }
        }

        private C20434b() {
        }

        public /* synthetic */ C20434b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20432f(View view, Activity activity, String str, boolean z) {
        super(view);
        C41536l.m120489i(view, "itemView");
        C41536l.m120489i(activity, "activity");
        C41536l.m120489i(str, "analyticsCategory");
        this.f55388f = activity;
        this.f55389g = str;
        this.f55390h = z;
        View findViewById = view.findViewById(C10322k.f28844ia);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.date_title)");
        this.f55391i = (TextView) findViewById;
        View findViewById2 = view.findViewById(C10322k.f28767Lg);
        C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.icon)");
        this.f55392j = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(C10322k.f28915yx);
        C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.title)");
        this.f55393k = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C10322k.f28853jw);
        C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.subtitle)");
        this.f55394l = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C10322k.f28817a1);
        C41536l.m120488h(findViewById5, "itemView.findViewById(R.id.amount)");
        this.f55395m = (TextView) findViewById5;
        View findViewById6 = view.findViewById(C10322k.subamount);
        C41536l.m120488h(findViewById6, "itemView.findViewById(R.id.subamount)");
        this.f55396n = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C10322k.transaction_swipe_layout);
        C41536l.m120488h(findViewById7, "itemView.findViewById(R.…transaction_swipe_layout)");
        this.f55397o = (SwipeLayout) findViewById7;
        View findViewById8 = view.findViewById(C10322k.transaction_list_item);
        C41536l.m120488h(findViewById8, "itemView.findViewById(R.id.transaction_list_item)");
        this.f55398p = findViewById8;
        View findViewById9 = view.findViewById(C10322k.non_include);
        C41536l.m120488h(findViewById9, "itemView.findViewById(R.id.non_include)");
        this.f55399q = (AppCompatImageView) findViewById9;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        this.f55400r = F;
        PopupWindow popupWindow = new PopupWindow(LayoutInflater.from(view.getContext()).inflate(C10324m.layout_transction_not_included_in_calculation_hint, (ViewGroup) null), view.getContext().getResources().getDimensionPixelSize(C10319h.transaction_not_included_in_analytics_hint_width), view.getContext().getResources().getDimensionPixelSize(C10319h.transaction_not_included_in_analytics_hint_height));
        this.f55401s = popupWindow;
        popupWindow.setBackgroundDrawable(C0767a.m2895e(view.getContext(), C10320i.transaction_hint_background));
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(new C20428b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m66564A(C20432f fVar, SwipeLayout swipeLayout, boolean z) {
        int i;
        C41536l.m120489i(fVar, "this$0");
        C10463g gVar = fVar.f55400r;
        String str = fVar.f55389g;
        if (z) {
            i = -1;
        } else {
            i = 1;
        }
        gVar.mo27153t(str, "", "swipe_transaction", Long.valueOf((long) i));
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static final void m66565B(C20432f fVar, AccountOperation accountOperation, C43075l lVar, C43075l lVar2, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(accountOperation, "$accountOperation");
        fVar.f55400r.mo27152s(fVar.f55389g, accountOperation.getPrintFormType(), "open_transaction");
        if (lVar != null) {
            lVar.invoke(accountOperation);
            return;
        }
        fVar.f55397o.mo7586B(2, true);
        Intent intent = new Intent(fVar.f55388f, OperationDetailsActivity.class);
        intent.putExtra("PAYMENT_OPERATION_TYPE", 30);
        intent.putExtra("PAYMENT_DETAILS_OBJECT", C42035e.m122121c(accountOperation));
        if (lVar2 != null) {
            lVar2.invoke(accountOperation);
        }
        fVar.f55388f.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static final void m66566C(C20432f fVar, AccountOperation accountOperation, boolean z, String str) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(accountOperation, "$accountOperation");
        fVar.f55397o.mo7586B(2, true);
        if (str != null) {
            switch (str.hashCode()) {
                case -1031765760:
                    if (str.equals("CANCEL_ID")) {
                        fVar.m66576s(accountOperation);
                        return;
                    }
                    return;
                case -510760130:
                    if (str.equals("SAVE_TEMPLATE_ID")) {
                        fVar.m66582y(accountOperation);
                        return;
                    }
                    return;
                case -18667745:
                    if (str.equals("TRANSFER_BACK_ID")) {
                        fVar.m66567D(accountOperation);
                        return;
                    }
                    return;
                case 38898075:
                    if (str.equals("SHARE_ID")) {
                        fVar.m66579v(accountOperation);
                        C36546y.m108282F().mo27140K("transaction_receipt");
                        if (C41536l.m120484d(fVar.f55389g, "deposits")) {
                            fVar.f55400r.mo27152s(fVar.f55389g, "share", "swipe_menu_click");
                            return;
                        }
                        return;
                    }
                    return;
                case 42340456:
                    if (str.equals("AUTOMATIC_SERVICES_ID")) {
                        fVar.m66578u(accountOperation);
                        return;
                    }
                    return;
                case 1239034208:
                    if (str.equals("REPEAT_TRANSACTION_ID")) {
                        fVar.m66581x(accountOperation);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: D */
    private final void m66567D(AccountOperation accountOperation) {
        this.f55400r.mo27152s(this.f55389g, "transfer_back", "swipe_menu_click");
        TransferForm.startWith(this.f55388f, "TRANSFER", TransferForm.OPERATION_VIEW).setAccountOperation(accountOperation).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final boolean m66572m(C20432f fVar, View view, MotionEvent motionEvent) {
        C41536l.m120489i(fVar, "this$0");
        fVar.f55401s.dismiss();
        return false;
    }

    /* renamed from: n */
    private final void m66573n(AccountOperation accountOperation) {
        float f;
        String string = this.f55388f.getString(C10328q.template_swipe_menu_automatic_services);
        Integer valueOf = Integer.valueOf(C10320i.ic_swipe_automatic);
        Integer valueOf2 = Integer.valueOf(C0767a.m2893c(this.f55388f, C10318g.swipe_menu_item_1));
        Integer valueOf3 = Integer.valueOf(C0767a.m2893c(this.f55388f, C10318g.swipe_menu_item_text_color));
        Integer valueOf4 = Integer.valueOf(C0767a.m2893c(this.f55388f, C10318g.swipe_menu_item_icon_tint_color));
        if (C24881a.m79530a(accountOperation)) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        this.f55397o.setLeftSwipeItem(new SwipeLayout.C2363g("AUTOMATIC_SERVICES_ID", string, valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(f)));
    }

    /* renamed from: o */
    private final void m66574o(AccountOperation accountOperation) {
        float f;
        ArrayList arrayList = new ArrayList();
        if (C24881a.m79531b(accountOperation)) {
            arrayList.add(new SwipeLayout.C2363g("SAVE_TEMPLATE_ID", this.f55388f.getString(C10328q.statement_swipe_menu_save_template), Integer.valueOf(C10320i.ic_swipe_add)));
        }
        SwipeLayout.C2363g gVar = new SwipeLayout.C2363g("SHARE_ID", this.f55388f.getString(C10328q.download_receipt), Integer.valueOf(C10320i.ic_download_menu_item));
        if (accountOperation.isPrintableBool()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        gVar.f7487g = Float.valueOf(f);
        arrayList.add(gVar);
        if (accountOperation.isBackTransferAllowedBool()) {
            arrayList.add(new SwipeLayout.C2363g("TRANSFER_BACK_ID", this.f55388f.getString(C10328q.statement_swipe_menu_transfer_back), Integer.valueOf(C10320i.ic_transfer_back)));
        }
        if (accountOperation.isRepeatAllowed()) {
            arrayList.add(new SwipeLayout.C2363g("REPEAT_TRANSACTION_ID", this.f55388f.getString(C10328q.statement_swipe_menu_repeat), Integer.valueOf(C10320i.ic_reload)));
        }
        if (accountOperation.isReversalAvailable()) {
            arrayList.add(new SwipeLayout.C2363g("CANCEL_ID", this.f55388f.getString(C10328q.qr_pay_cancel_transaction), Integer.valueOf(C10320i.ic_swipe_cancel_transaction)));
        }
        C32303f.m95185E(this.f55388f, arrayList);
        this.f55397o.setRightSwipeItems(arrayList);
    }

    /* renamed from: q */
    public static /* synthetic */ void m66575q(C20432f fVar, C20434b.C20436b bVar, C43075l lVar, Boolean bool, C43075l lVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            bool = Boolean.TRUE;
        }
        if ((i & 8) != 0) {
            lVar2 = null;
        }
        fVar.mo48919p(bVar, lVar, bool, lVar2);
    }

    /* renamed from: s */
    private final void m66576s(AccountOperation accountOperation) {
        String valueOf = String.valueOf(accountOperation.getDocKey());
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = language.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String merchantNameByLocale = accountOperation.getMerchantNameByLocale(Boolean.valueOf(C40440x.m117139M(lowerCase, "ka", false, 2, (Object) null)));
        String bigDecimal = accountOperation.getAmount().toString();
        C41536l.m120488h(bigDecimal, "amount.toString()");
        QrPayReversalActivity.m105407S2(this.f55388f, valueOf, merchantNameByLocale, bigDecimal);
    }

    /* renamed from: t */
    public static final C20432f m66577t(ViewGroup viewGroup, Activity activity, String str, boolean z) {
        return f55387t.mo48921a(viewGroup, activity, str, z);
    }

    /* renamed from: u */
    private final void m66578u(AccountOperation accountOperation) {
        if (!C24881a.m79530a(accountOperation)) {
            return;
        }
        if (C41536l.m120484d("OUT_TRANSFER", accountOperation.getPrintFormType())) {
            TransferForm.startWith(this.f55388f, "STO", "CREATE").setItemKey(accountOperation.getDocKey()).setPfmID(accountOperation.getPfmId()).setOperationDate(Long.valueOf(accountOperation.getOperationDate())).setPrintFormType(accountOperation.getPrintFormType()).start();
            this.f55400r.mo27152s(this.f55389g, "create_sto", "swipe_menu_click");
            return;
        }
        PaymentProviderConfiguration c = C24881a.m79532c(accountOperation);
        if (c != null) {
            this.f55400r.mo27152s(this.f55389g, "create_dd", "swipe_menu_click");
            C33624a.m98713a(this.f55388f).mo79806f(DDTransparentLoaderActivity.class).mo79819s(c.getServiceId()).mo79812l(accountOperation.getEssId()).mo79825y();
        }
    }

    /* renamed from: v */
    private final void m66579v(AccountOperation accountOperation) {
        if (accountOperation.isPrintableBool()) {
            this.f55400r.mo27152s(this.f55389g, "share", "swipe_menu_click");
            if (this.f55388f instanceof C35388f2) {
                String b = C32303f.m95191b(accountOperation.getDocKey(), accountOperation.getEssId(), accountOperation.getPrintFormType());
                Activity activity = this.f55388f;
                String h0 = C32343x.m95452h0(C10328q.f28968x1, new Object[0]);
                C32303f.m95195f(b, activity, h0 + ".pdf", "application/pdf");
                return;
            }
            return;
        }
        C32297d.m95158f(this.f55388f, C27950a.m86287d("text.operation.print.not.allowed", false, 2, (Object) null), C32297d.f79709e);
    }

    /* renamed from: w */
    private final String m66580w(BigDecimal bigDecimal, String str) {
        if (bigDecimal == null || str == null) {
            return "";
        }
        if (C41536l.m120484d(str, C19335b.MR.mo47537b())) {
            String string = this.f89287d.getContext().getString(C10328q.common_text_point);
            return "+ " + bigDecimal + " MR " + string;
        } else if (C41536l.m120484d(str, C19335b.CASHBACK.mo47537b())) {
            String n = C32303f.m95203n(bigDecimal, "GEL");
            return "+ " + n;
        } else if (!C41536l.m120484d(str, C19335b.PLUS.mo47537b())) {
            return "";
        } else {
            String B = C32359z0.m95531B(bigDecimal);
            String string2 = this.f89287d.getContext().getString(C10328q.payments_plus_points);
            return "+ " + B + " " + string2;
        }
    }

    /* renamed from: x */
    private final C41238w m66581x(AccountOperation accountOperation) {
        this.f55400r.mo27152s(this.f55389g, "repeat", "swipe_menu_click");
        if (C41536l.m120484d("OUT_TRANSFER", accountOperation.getPrintFormType())) {
            TransferForm.startWith(this.f55388f, "TRANSFER", TransferForm.OPERATION_VIEW).setItemKey(accountOperation.getDocKey()).setPfmID(accountOperation.getPfmId()).setOperationDate(Long.valueOf(accountOperation.getOperationDate())).setPrintFormType(accountOperation.getPrintFormType()).start();
            return C41238w.f97225a;
        }
        PaymentProviderConfiguration c = C24881a.m79532c(accountOperation);
        if (c == null) {
            return null;
        }
        C33624a.m98713a(this.f55388f).mo79806f(PaymentFormActivity.class).mo79819s(c.getServiceId()).mo79812l(accountOperation.getEssId()).mo79825y();
        return C41238w.f97225a;
    }

    /* renamed from: y */
    private final C41238w m66582y(AccountOperation accountOperation) {
        this.f55400r.mo27152s(this.f55389g, "save_template", "swipe_menu_click");
        if (C41536l.m120484d("OUT_TRANSFER", accountOperation.getPrintFormType())) {
            TransferForm.startWith(this.f55388f, TransferForm.MODULE_TEMPLATE, "CREATE").setItemKey(accountOperation.getDocKey()).setPfmID(accountOperation.getPfmId()).setOperationDate(Long.valueOf(accountOperation.getOperationDate())).setPrintFormType(accountOperation.getPrintFormType()).start();
            return C41238w.f97225a;
        }
        PaymentProviderConfiguration c = C24881a.m79532c(accountOperation);
        if (c == null) {
            return null;
        }
        C33624a.m98713a(this.f55388f).mo79806f(TemplateFormActivity.class).mo79819s(c.getServiceId()).mo79812l(accountOperation.getEssId()).mo79803c(true).mo79825y();
        return C41238w.f97225a;
    }

    /* renamed from: z */
    private final void m66583z(AccountOperation accountOperation, C43075l lVar, C43075l lVar2) {
        m66574o(accountOperation);
        m66573n(accountOperation);
        this.f55397o.setOnSwipedListener(new C20429c(this));
        this.f55397o.setOnClickListener(new C20430d(this, accountOperation, lVar, lVar2));
        this.f55397o.setOnSwipeItemClickListener(new C20431e(this, accountOperation));
    }

    /* renamed from: p */
    public final void mo48919p(C20434b.C20436b bVar, C43075l lVar, Boolean bool, C43075l lVar2) {
        boolean z;
        int i;
        boolean z2;
        C41536l.m120489i(bVar, "statementItem");
        AccountOperation a = bVar.mo48927a();
        if (a != null) {
            C32343x.m95455i0(this.f55391i);
            C32343x.m95458j0(this.f55399q, !a.isPfmComputable());
            C32343x.m95447f1(this.f55397o);
            this.f55401s.dismiss();
            m66583z(a, lVar, lVar2);
            this.f55394l.setText(a.getFullCategoryName());
            TextView textView = this.f55394l;
            CharSequence text = textView.getText();
            boolean z3 = false;
            if (text == null || C40439w.m117118v(text)) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView, !z, false, 2, (Object) null);
            this.f55393k.setText(a.getOperationTitle());
            this.f55395m.setText(C32303f.m95203n(a.getAmount().negate(), a.getCcy()));
            TextView textView2 = this.f55395m;
            Context context = this.f89287d.getContext();
            Integer b = bVar.mo48928b();
            if (b != null) {
                i = b.intValue();
            } else {
                i = C10318g.f28630R0;
            }
            textView2.setTextColor(C0767a.m2893c(context, i));
            this.f55396n.setText(m66580w(bVar.mo48935h(), bVar.mo48937i()));
            TextView textView3 = this.f55396n;
            if (bVar.mo48935h() == null || bVar.mo48937i() == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C32343x.m95483r1(textView3, z2, false, 2, (Object) null);
            if (bVar.mo48939k() != null) {
                C32343x.m95483r1(this.f55392j, true, false, 2, (Object) null);
                ImageView imageView = this.f55392j;
                String e = C32289b0.m95093e(bVar.mo48939k());
                int i2 = C10320i.f28688dc;
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(i2);
                Boolean d = bVar.mo48930d();
                if (d != null) {
                    z3 = d.booleanValue();
                }
                C32289b0.m95107s(imageView, e, valueOf, valueOf2, true, z3);
            } else {
                C32343x.m95483r1(this.f55392j, false, false, 2, (Object) null);
            }
            if (C41536l.m120484d("P", a.getStatus()) || !C41536l.m120484d(bool, Boolean.TRUE)) {
                this.f55392j.setAlpha(1.0f);
                this.f55393k.setTextColor(C0767a.m2893c(this.f55388f, C10318g.f28628O0));
                this.f55398p.setBackgroundColor(C0767a.m2893c(this.f55388f, C10318g.f28625J0));
                return;
            }
            this.f55392j.setAlpha(0.5f);
            TextView textView4 = this.f55395m;
            Activity activity = this.f55388f;
            int i3 = C10318g.f28627N0;
            textView4.setTextColor(C0767a.m2893c(activity, i3));
            this.f55393k.setTextColor(C0767a.m2893c(this.f55388f, i3));
            this.f55398p.setBackgroundColor(C0767a.m2893c(this.f55388f, C10318g.f28623H0));
        }
    }

    /* renamed from: r */
    public final void mo48920r(String str) {
        C41536l.m120489i(str, "text");
        this.f55391i.setText(str);
        C32343x.m95447f1(this.f55391i);
        C32343x.m95455i0(this.f55397o);
    }
}
