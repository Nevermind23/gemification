package p341ge.bog.designsystem.components.infobadge;

import af1.C40303i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import he1.C41217g;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.common.Image;
import p561pi.C17365a;
import p561pi.C17367b;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17961b;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.infobadge.InfoBadgeView */
public final class InfoBadgeView extends LinearLayout {

    /* renamed from: o */
    static final /* synthetic */ C40303i[] f39574o = {C41520a0.m120439e(new C41539o(InfoBadgeView.class, "showAmount", "getShowAmount()Z", 0))};

    /* renamed from: d */
    private C13346b f39575d;

    /* renamed from: e */
    private C13345a f39576e;

    /* renamed from: f */
    private final C41217g f39577f;

    /* renamed from: g */
    private String f39578g;

    /* renamed from: h */
    private String f39579h;

    /* renamed from: i */
    private String f39580i;

    /* renamed from: j */
    private String f39581j;

    /* renamed from: k */
    private TextView f39582k;

    /* renamed from: l */
    private ImageView f39583l;

    /* renamed from: m */
    private Image f39584m;

    /* renamed from: n */
    private final C41555e f39585n;

    /* renamed from: ge.bog.designsystem.components.infobadge.InfoBadgeView$a */
    public enum C13345a {
        SMALL(0, C17786k.TextCaption1),
        LARGE(1, C17786k.f49825R);
        

        /* renamed from: d */
        private final int f39589d;

        /* renamed from: e */
        private final int f39590e;

        private C13345a(int i, int i2) {
            this.f39589d = i;
            this.f39590e = i2;
        }

        /* renamed from: b */
        public final int mo35839b() {
            return this.f39589d;
        }

        /* renamed from: c */
        public final int mo35840c() {
            return this.f39590e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.infobadge.InfoBadgeView$b */
    public enum C13346b {
        PRODUCT_INLINE_FEEDBACK_NORMAL(0, C17786k.ProductInlineFeedbackNormal, -2, C18368l.m62762k(16), C17780e.shape_product_inline_feedback_normal, (int) null, false, 32, (boolean) null),
        PRODUCT_INLINE_FEEDBACK_NEGATIVE(1, C17786k.ProductInlineFeedbackNegative, -2, C18368l.m62762k(16), C17780e.shape_product_inline_feedback_negative, (int) null, false, 32, (boolean) null),
        PRODUCT_INLINE_FEEDBACK_PENDING(2, C17786k.ProductInlineFeedbackPending, -2, C18368l.m62762k(16), C17780e.shape_product_inline_feedback_pending, (int) null, false, 32, (boolean) null),
        PRODUCT_INLINE_FEEDBACK_POSITIVE(3, C17786k.ProductInlineFeedbackPositive, -2, C18368l.m62762k(16), C17780e.shape_product_inline_feedback_positive, (int) null, false, 32, (boolean) null),
        INTERACTIVE_CURRENCY_BADGE_SMALL(4, r5, r6, r7, r20, (int) null, false, 96, (boolean) null),
        INTERACTIVE_CURRENCY_BADGE_LARGE(5, C17786k.InteractiveCurrencyBadgeLarge, -2, C18368l.m62762k(24), r15, (int) null, false, 96, (boolean) null),
        INTERACTIVE_CURRENCY_BADGE_BIG(6, C17786k.InteractiveCurrencyBadgeBig, C18368l.m62762k(48), C18368l.m62762k(32), r15, (int) null, false, 96, (boolean) null),
        INTERACTIVE_CURRENCY_BADGE_WHITE_AMOUNT_LARGE(7, C17786k.InteractiveCurrencyBadgeWhiteAmountLarge, -2, C18368l.m62762k(24), C17780e.shape_currency_amount_badge_white_amount, (int) null, false, 96, (boolean) null),
        INTERACTIVE_CURRENCY_BADGE_BLACK_AMOUNT_LARGE(8, C17786k.InteractiveCurrencyBadgeBlackAmountLarge, -2, C18368l.m62762k(24), C17780e.shape_currency_amount_badge_black, (int) null, false, 96, (boolean) null),
        ACCOUNT_CURRENCY_BADGE_WHITE(9, C17786k.AccountCurrencyBadgeWhite, -2, C18368l.m62762k(24), C17780e.shape_currency_account_badge_white, Integer.valueOf(C18368l.m62762k(28)), false, 64, (boolean) null),
        ACCOUNT_CURRENCY_BADGE_BLACK(10, C17786k.AccountCurrencyBadgeBlack, -2, C18368l.m62762k(24), C17780e.shape_account_currency_badge_black, Integer.valueOf(C18368l.m62762k(28)), false, 64, (boolean) null),
        ACCOUNT_CURRENCY_BADGE_INVERT(11, C17786k.AccountCurrencyBadgeInvert, -2, C18368l.m62762k(24), C17780e.shape_account_currency_badge_invert, Integer.valueOf(C18368l.m62762k(28)), false, 64, (boolean) null);
        

        /* renamed from: d */
        private final int f39604d;

        /* renamed from: e */
        private final int f39605e;

        /* renamed from: f */
        private final int f39606f;

        /* renamed from: g */
        private final int f39607g;

        /* renamed from: h */
        private final int f39608h;

        /* renamed from: i */
        private final Integer f39609i;

        /* renamed from: j */
        private final boolean f39610j;

        private C13346b(int i, int i2, int i3, int i4, int i5, Integer num, boolean z) {
            this.f39604d = i;
            this.f39605e = i2;
            this.f39606f = i3;
            this.f39607g = i4;
            this.f39608h = i5;
            this.f39609i = num;
            this.f39610j = z;
        }

        /* renamed from: b */
        public final int mo35841b() {
            return this.f39608h;
        }

        /* renamed from: c */
        public final int mo35842c() {
            return this.f39607g;
        }

        /* renamed from: e */
        public final int mo35843e() {
            return this.f39604d;
        }

        /* renamed from: f */
        public final Integer mo35844f() {
            return this.f39609i;
        }

        /* renamed from: g */
        public final int mo35845g() {
            return this.f39605e;
        }

        /* renamed from: h */
        public final int mo35846h() {
            return this.f39606f;
        }

        /* renamed from: l */
        public final boolean mo35847l() {
            return this.f39610j;
        }
    }

    /* renamed from: ge.bog.designsystem.components.infobadge.InfoBadgeView$c */
    public /* synthetic */ class C13347c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39611a;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b[] r0 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_NORMAL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_PENDING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.PRODUCT_INLINE_FEEDBACK_POSITIVE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.INTERACTIVE_CURRENCY_BADGE_SMALL     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.INTERACTIVE_CURRENCY_BADGE_LARGE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.INTERACTIVE_CURRENCY_BADGE_BIG     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.INTERACTIVE_CURRENCY_BADGE_WHITE_AMOUNT_LARGE     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.INTERACTIVE_CURRENCY_BADGE_BLACK_AMOUNT_LARGE     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.ACCOUNT_CURRENCY_BADGE_WHITE     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.ACCOUNT_CURRENCY_BADGE_BLACK     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                ge.bog.designsystem.components.infobadge.InfoBadgeView$b r1 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13346b.ACCOUNT_CURRENCY_BADGE_INVERT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                f39611a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13347c.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.infobadge.InfoBadgeView$d */
    static final class C13348d extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13348d f39612d = new C13348d();

        C13348d() {
            super(0);
        }

        /* renamed from: b */
        public final C17367b invoke() {
            C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            bVar.mo44810m("###,##0.00");
            return bVar;
        }
    }

    /* renamed from: ge.bog.designsystem.components.infobadge.InfoBadgeView$e */
    public static final class C13349e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ InfoBadgeView f39613a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13349e(Object obj, InfoBadgeView infoBadgeView) {
            super(obj);
            this.f39613a = infoBadgeView;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.f39613a.m50234f();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InfoBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final void m50231b() {
        ImageView imageView = this.f39583l;
        TextView textView = null;
        if (imageView != null) {
            if (imageView == null) {
                C41536l.m120506z("imageView");
                imageView = null;
            }
            removeView(imageView);
        }
        ImageView imageView2 = new ImageView(getContext());
        C18368l.m62746A(imageView2, this.f39584m, (C43075l) null, 2, (Object) null);
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams == null) {
            Resources resources = imageView2.getResources();
            int i = C17779d.f49642K1;
            layoutParams = new ViewGroup.MarginLayoutParams(resources.getDimensionPixelSize(i), imageView2.getResources().getDimensionPixelSize(i));
        } else {
            C41536l.m120488h(layoutParams, "layoutParams ?: ViewGrou…spacing_16)\n            )");
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(imageView2.getResources().getDimensionPixelSize(C17779d.f49645S1), 0, 0, 0);
        Resources resources2 = imageView2.getResources();
        int i2 = C17779d.f49642K1;
        layoutParams.width = resources2.getDimensionPixelSize(i2);
        layoutParams.height = imageView2.getResources().getDimensionPixelSize(i2);
        imageView2.setLayoutParams(layoutParams);
        TextView textView2 = this.f39582k;
        if (textView2 == null) {
            C41536l.m120506z("textView");
        } else {
            textView = textView2;
        }
        imageView2.setImageTintList(textView.getTextColors());
        this.f39583l = imageView2;
        addView(imageView2, 0);
    }

    /* renamed from: c */
    private final void m50232c() {
        TextView textView = this.f39582k;
        if (textView != null) {
            if (textView == null) {
                C41536l.m120506z("textView");
                textView = null;
            }
            removeView(textView);
        }
        TextView textView2 = new TextView(getContext(), (AttributeSet) null, 0, this.f39575d.mo35845g());
        textView2.setDuplicateParentStateEnabled(true);
        textView2.setText(this.f39581j);
        textView2.setIncludeFontPadding(false);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(this.f39575d.mo35846h(), this.f39575d.mo35842c()));
        Integer f = this.f39575d.mo35844f();
        if (f != null) {
            textView2.setMinWidth(f.intValue());
        }
        if (!this.f39575d.mo35847l()) {
            C1314o.m4575q(textView2, this.f39576e.mo35840c());
        }
        this.f39582k = textView2;
        addView(textView2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m50233e(InfoBadgeView infoBadgeView, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        infoBadgeView.mo35833d(str, str2, str3);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        r2 = r0;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m50234f() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f39580i
            r1 = 0
            if (r0 == 0) goto L_0x000c
            boolean r2 = r5.getShowAmount()
            if (r2 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0012
            r0 = r2
        L_0x0012:
            ge.bog.designsystem.components.infobadge.InfoBadgeView$b r3 = r5.f39575d
            int[] r4 = p341ge.bog.designsystem.components.infobadge.InfoBadgeView.C13347c.f39611a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            switch(r3) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0085;
                case 3: goto L_0x0085;
                case 4: goto L_0x0085;
                case 5: goto L_0x007e;
                case 6: goto L_0x0068;
                case 7: goto L_0x0063;
                case 8: goto L_0x004d;
                case 9: goto L_0x0037;
                case 10: goto L_0x0031;
                case 11: goto L_0x002b;
                case 12: goto L_0x0025;
                default: goto L_0x001f;
            }
        L_0x001f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0025:
            java.lang.String r0 = r5.f39579h
            if (r0 != 0) goto L_0x0083
            goto L_0x00a2
        L_0x002b:
            java.lang.String r0 = r5.f39579h
            if (r0 != 0) goto L_0x0083
            goto L_0x00a2
        L_0x0031:
            java.lang.String r0 = r5.f39579h
            if (r0 != 0) goto L_0x0083
            goto L_0x00a2
        L_0x0037:
            java.lang.String r3 = r5.f39579h
            if (r3 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x00a2
        L_0x004d:
            java.lang.String r3 = r5.f39579h
            if (r3 != 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r2 = r3
        L_0x0053:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x00a2
        L_0x0063:
            java.lang.String r0 = r5.f39579h
            if (r0 != 0) goto L_0x0083
            goto L_0x00a2
        L_0x0068:
            java.lang.String r3 = r5.f39579h
            if (r3 != 0) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r2 = r3
        L_0x006e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x00a2
        L_0x007e:
            java.lang.String r0 = r5.f39579h
            if (r0 != 0) goto L_0x0083
            goto L_0x00a2
        L_0x0083:
            r2 = r0
            goto L_0x00a2
        L_0x0085:
            java.lang.String r3 = r5.f39578g
            if (r3 != 0) goto L_0x008a
            r3 = r2
        L_0x008a:
            java.lang.String r4 = r5.f39579h
            if (r4 != 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r4
        L_0x0090:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x00a2:
            java.lang.CharSequence r0 = cf1.C40440x.m117146P0(r2)
            java.lang.String r0 = r0.toString()
            r5.f39581j = r0
            android.widget.TextView r0 = r5.f39582k
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "textView"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            goto L_0x00b7
        L_0x00b6:
            r1 = r0
        L_0x00b7:
            java.lang.String r0 = r5.f39581j
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.infobadge.InfoBadgeView.m50234f():void");
    }

    private final C17365a getNumeralFormatter() {
        return (C17365a) this.f39577f.getValue();
    }

    private final void setIconImage(Image image) {
        if (image != null) {
            this.f39576e = C13345a.LARGE;
        }
        this.f39584m = image;
    }

    /* renamed from: d */
    public final void mo35833d(String str, String str2, String str3) {
        if (str != null) {
            this.f39578g = str;
        }
        if (str3 != null) {
            this.f39579h = C17961b.f51154a.mo45631a(str3);
        }
        if (str2 != null) {
            String d = getNumeralFormatter().mo44804d(str2);
            this.f39580i = " " + d + " ";
        }
        m50234f();
    }

    public final boolean getShowAmount() {
        return ((Boolean) this.f39585n.getValue(this, f39574o[0])).booleanValue();
    }

    public final void setIcon(Image image) {
        if (image != null) {
            setIconImage(image);
            m50231b();
            setSize(C13345a.LARGE);
        }
    }

    public final void setShowAmount(boolean z) {
        this.f39585n.setValue(this, f39574o[0], Boolean.valueOf(z));
    }

    public final void setSize(C13345a aVar) {
        C41536l.m120489i(aVar, "infoBadgeSize");
        this.f39576e = aVar;
        m50232c();
        if (aVar == C13345a.LARGE) {
            Resources resources = getContext().getResources();
            int i = C17779d.f49644Q1;
            int dimensionPixelSize = resources.getDimensionPixelSize(i);
            Resources resources2 = getContext().getResources();
            int i2 = C17779d.f49645S1;
            setPadding(dimensionPixelSize, resources2.getDimensionPixelSize(i2), getContext().getResources().getDimensionPixelSize(i), getContext().getResources().getDimensionPixelSize(i2));
        }
    }

    public final void setType(C13346b bVar) {
        C41536l.m120489i(bVar, "infoBadgeType");
        this.f39575d = bVar;
        setBackground(C0767a.m2895e(getContext(), this.f39575d.mo35841b()));
        m50232c();
        if (this.f39584m != null) {
            m50231b();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InfoBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f39575d = C13346b.PRODUCT_INLINE_FEEDBACK_NORMAL;
        this.f39576e = C13345a.SMALL;
        this.f39577f = C41219i.m119470b(C13348d.f39612d);
        C41551a aVar = C41551a.f97718a;
        this.f39585n = new C13349e(Boolean.TRUE, this);
        setOrientation(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f50146U5);
            for (C13346b bVar : C13346b.values()) {
                if (bVar.mo35843e() == obtainStyledAttributes.getInt(C17787l.f50221Z5, 0)) {
                    this.f39575d = bVar;
                    this.f39578g = obtainStyledAttributes.getString(C17787l.f50176W5);
                    this.f39579h = C17961b.f51154a.mo45631a(obtainStyledAttributes.getString(C17787l.f50206Y5));
                    for (C13345a aVar2 : C13345a.values()) {
                        if (aVar2.mo35839b() == obtainStyledAttributes.getInt(C17787l.f50191X5, 0)) {
                            this.f39576e = aVar2;
                            int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50161V5, -1);
                            if (resourceId != -1) {
                                setIconImage(new Image.Resource(resourceId, (Boolean) null, 2, (DefaultConstructorMarker) null));
                                this.f39576e = C13345a.LARGE;
                            }
                            obtainStyledAttributes.recycle();
                            setType(this.f39575d);
                            setSize(this.f39576e);
                            C13346b bVar2 = this.f39575d;
                            if (bVar2 == C13346b.INTERACTIVE_CURRENCY_BADGE_SMALL || bVar2 == C13346b.INTERACTIVE_CURRENCY_BADGE_BIG || bVar2 == C13346b.ACCOUNT_CURRENCY_BADGE_BLACK || bVar2 == C13346b.ACCOUNT_CURRENCY_BADGE_WHITE || bVar2 == C13346b.ACCOUNT_CURRENCY_BADGE_INVERT) {
                                m50233e(this, (String) null, (String) null, this.f39579h, 3, (Object) null);
                                return;
                            }
                            return;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
