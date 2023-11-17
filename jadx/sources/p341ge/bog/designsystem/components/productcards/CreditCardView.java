package p341ge.bog.designsystem.components.productcards;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.productcards.basecard.C13473a;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p352ak.C10006r4;
import p352ak.C10013s4;
import p352ak.C10020t4;
import p352ak.C9908f0;
import p365bj.C10299a;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.productcards.CreditCardView */
public final class CreditCardView extends C13473a {

    /* renamed from: g */
    protected C10299a f40069g;

    /* renamed from: h */
    private TextBadgeView f40070h;

    /* renamed from: i */
    private TextBadgeView f40071i;

    /* renamed from: ge.bog.designsystem.components.productcards.CreditCardView$b */
    public static abstract class C13449b {

        /* renamed from: ge.bog.designsystem.components.productcards.CreditCardView$b$a */
        public static final class C13450a extends C13449b {

            /* renamed from: a */
            private final String f40083a;

            /* renamed from: b */
            private final String f40084b;

            /* renamed from: c */
            private final Date f40085c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13450a(String str, String str2, Date date) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "badgeTitle");
                C41536l.m120489i(str2, C11755a.C11756a.f34100b);
                C41536l.m120489i(date, "date");
                this.f40083a = str;
                this.f40084b = str2;
                this.f40085c = date;
            }

            /* renamed from: a */
            public final String mo36493a() {
                return this.f40083a;
            }

            /* renamed from: b */
            public final Date mo36494b() {
                return this.f40085c;
            }

            /* renamed from: c */
            public final String mo36495c() {
                return this.f40084b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13450a)) {
                    return false;
                }
                C13450a aVar = (C13450a) obj;
                return C41536l.m120484d(this.f40083a, aVar.f40083a) && C41536l.m120484d(this.f40084b, aVar.f40084b) && C41536l.m120484d(this.f40085c, aVar.f40085c);
            }

            public int hashCode() {
                return (((this.f40083a.hashCode() * 31) + this.f40084b.hashCode()) * 31) + this.f40085c.hashCode();
            }

            public String toString() {
                String str = this.f40083a;
                String str2 = this.f40084b;
                Date date = this.f40085c;
                return "DateBadge(badgeTitle=" + str + ", value=" + str2 + ", date=" + date + ")";
            }
        }

        /* renamed from: ge.bog.designsystem.components.productcards.CreditCardView$b$b */
        public static final class C13451b extends C13449b {

            /* renamed from: a */
            private final String f40086a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13451b(String str) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "badgeTitle");
                this.f40086a = str;
            }

            /* renamed from: a */
            public final String mo36499a() {
                return this.f40086a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13451b) && C41536l.m120484d(this.f40086a, ((C13451b) obj).f40086a);
            }

            public int hashCode() {
                return this.f40086a.hashCode();
            }

            public String toString() {
                String str = this.f40086a;
                return "Spent(badgeTitle=" + str + ")";
            }
        }

        private C13449b() {
        }

        public /* synthetic */ C13449b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.CreditCardView$c */
    public /* synthetic */ class C13452c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40087a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40088b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                ge.bog.designsystem.components.productcards.basecard.a$a[] r0 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13474a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ge.bog.designsystem.components.productcards.basecard.a$a r2 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13474a.WIDE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ge.bog.designsystem.components.productcards.basecard.a$a r3 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13474a.SQUARE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.designsystem.components.productcards.basecard.a$a r3 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13474a.WIDE_NEW     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f40087a = r0
                ge.bog.designsystem.components.productcards.basecard.a$b[] r0 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.productcards.basecard.a$b r3 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.WHITE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f40088b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productcards.CreditCardView.C13452c.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreditCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final void m50502b() {
        TextBadgeView textBadgeView = this.f40070h;
        if (textBadgeView != null) {
            int i = C13452c.f40088b[getCardTheme().ordinal()];
            if (i == 1) {
                Context context = textBadgeView.getContext();
                C41536l.m120488h(context, "context");
                textBadgeView.setBackgroundColor(C18368l.m62755d(context, C17777b.color_white_tr_50));
                Context context2 = textBadgeView.getContext();
                C41536l.m120488h(context2, "context");
                textBadgeView.setBadgeTextColor(C18368l.m62755d(context2, C17777b.color_white_tr_200));
                Context context3 = textBadgeView.getContext();
                C41536l.m120488h(context3, "context");
                int i2 = C17777b.f49590A;
                textBadgeView.setBadgeCaptionTextColor(C18368l.m62755d(context3, i2));
                Context context4 = textBadgeView.getContext();
                C41536l.m120488h(context4, "context");
                textBadgeView.setBadgeSecondTextColor(C18368l.m62755d(context4, i2));
            } else if (i != 2) {
                Context context5 = textBadgeView.getContext();
                C41536l.m120488h(context5, "context");
                textBadgeView.setBackgroundColor(C18368l.m62755d(context5, C17777b.color_black_tr_50));
                Context context6 = textBadgeView.getContext();
                C41536l.m120488h(context6, "context");
                textBadgeView.setBadgeTextColor(C18368l.m62755d(context6, C17777b.color_black_tr_200));
                Context context7 = textBadgeView.getContext();
                C41536l.m120488h(context7, "context");
                int i3 = C17777b.color_black_tr_400;
                textBadgeView.setBadgeCaptionTextColor(C18368l.m62755d(context7, i3));
                Context context8 = textBadgeView.getContext();
                C41536l.m120488h(context8, "context");
                textBadgeView.setBadgeSecondTextColor(C18368l.m62755d(context8, i3));
            } else {
                Context context9 = textBadgeView.getContext();
                C41536l.m120488h(context9, "context");
                textBadgeView.setBackgroundColor(C18368l.m62755d(context9, C17777b.color_invert_component_tr_50));
                Context context10 = textBadgeView.getContext();
                C41536l.m120488h(context10, "context");
                textBadgeView.setBadgeTextColor(C18368l.m62755d(context10, C17777b.f49599p));
                Context context11 = textBadgeView.getContext();
                C41536l.m120488h(context11, "context");
                int i4 = C17777b.f49601r;
                textBadgeView.setBadgeCaptionTextColor(C18368l.m62755d(context11, i4));
                Context context12 = textBadgeView.getContext();
                C41536l.m120488h(context12, "context");
                textBadgeView.setBadgeSecondTextColor(C18368l.m62755d(context12, i4));
            }
        }
    }

    /* renamed from: c */
    private final void m50503c() {
        if ((getCardShape() instanceof C10299a.C10307c) && getCardTheme() == C13473a.C13476b.COLOR) {
            throw new IllegalArgumentException("Wide version doesn't support color theme");
        }
    }

    private final void setDateInfoData(C13449b.C13450a aVar) {
        C41238w wVar;
        if (!(getCardShape() instanceof C10299a.C10303b)) {
            if (aVar != null) {
                C9908f0 d = C9908f0.m36344d(LayoutInflater.from(getContext()), this, false);
                d.f26972e.setBadgeText(aVar.mo36493a());
                d.f26972e.setBadgeCaption(aVar.mo36495c());
                d.f26972e.setBadgeSecondText(getDateFormat().format(aVar.mo36494b()));
                this.f40070h = d.f26972e;
                C41536l.m120488h(d, "inflate(\n               …xtBadge\n                }");
                m50502b();
                getCardShape().mo26912j(d.mo3946b());
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                getCardShape().mo26912j((View) null);
            }
        }
    }

    private final void setSpentInfo(C13449b.C13451b bVar) {
        C41238w wVar;
        TextBadgeView textBadgeView;
        if (!(getCardShape() instanceof C10299a.C10303b)) {
            if (bVar != null) {
                TextBadgeView textBadgeView2 = this.f40071i;
                if (textBadgeView2 != null) {
                    textBadgeView2.setVisibility(0);
                }
                TextBadgeView textBadgeView3 = this.f40071i;
                if (textBadgeView3 != null) {
                    textBadgeView3.setBadgeText(bVar.mo36499a());
                }
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null && (textBadgeView = this.f40071i) != null) {
                textBadgeView.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36461a() {
        m50503c();
        m50502b();
    }

    /* access modifiers changed from: protected */
    public C10299a getCardShape() {
        C10299a aVar = this.f40069g;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("cardShape");
        return null;
    }

    /* access modifiers changed from: protected */
    public void setCardShape(C10299a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f40069g = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setData(C13448a aVar) {
        C41536l.m120489i(aVar, "data");
        super.setData(aVar);
        setDateInfoData(aVar.mo36489g());
        setSpentInfo(aVar.mo36490h());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreditCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10299a aVar;
        C41536l.m120489i(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int[] iArr = C17787l.f50090Q9;
        C41536l.m120488h(iArr, "ProductCreditCards");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50105R9, 0);
        int i3 = obtainStyledAttributes.getInt(C17787l.f50120S9, 0);
        String string = obtainStyledAttributes.getString(C17787l.f50150U9);
        int i4 = C13452c.f40087a[C13473a.C13474a.f40170e.mo36571a(i2).ordinal()];
        if (i4 == 1) {
            C10020t4 d = C10020t4.m36752d(from, this, true);
            FrameLayout frameLayout = d.f27591h;
            C41536l.m120488h(frameLayout, "bottomViewContainer");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams;
                bVar.f2491B = obtainStyledAttributes.getResources().getDimensionPixelSize(C17779d.spacing_64);
                frameLayout.setLayoutParams(bVar);
                this.f40071i = d.f27597n;
                C41536l.m120488h(d, "inflate(layoutInflater, …                        }");
                aVar = new C10299a.C10307c(d);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else if (i4 == 2) {
            C10013s4 d2 = C10013s4.m36726d(from, this, true);
            C41536l.m120488h(d2, "inflate(\n               …rue\n                    )");
            aVar = new C10299a.C10303b(d2);
        } else if (i4 == 3) {
            C10006r4 d3 = C10006r4.m36700d(from, this, true);
            this.f40071i = d3.f27481o;
            C41536l.m120488h(d3, "inflate(\n               …dge\n                    }");
            aVar = new C10299a.C10300a(d3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        setCardShape(aVar);
        setBadgeVisible(obtainStyledAttributes.getBoolean(C17787l.f50135T9, false));
        setCardTheme(C13473a.C13476b.f40176k.mo36579a(i3));
        getCardShape().mo26919r(string);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ge.bog.designsystem.components.productcards.CreditCardView$a */
    public static final class C13448a implements C13473a.C13479d {

        /* renamed from: a */
        private final String f40072a;

        /* renamed from: b */
        private final Amount f40073b;

        /* renamed from: c */
        private final Image f40074c;

        /* renamed from: d */
        private final Image f40075d;

        /* renamed from: e */
        private final boolean f40076e;

        /* renamed from: f */
        private final C13473a.C13476b f40077f;

        /* renamed from: g */
        private final List f40078g;

        /* renamed from: h */
        private final List f40079h;

        /* renamed from: i */
        private final C13449b.C13450a f40080i;

        /* renamed from: j */
        private final C13449b.C13451b f40081j;

        /* renamed from: k */
        private final boolean f40082k;

        public C13448a(String str, Amount amount, Image image, Image image2, boolean z, C13473a.C13476b bVar, List list, List list2, C13449b.C13450a aVar, C13449b.C13451b bVar2, boolean z2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(amount, "amount");
            C41536l.m120489i(bVar, "cardTheme");
            this.f40072a = str;
            this.f40073b = amount;
            this.f40074c = image;
            this.f40075d = image2;
            this.f40076e = z;
            this.f40077f = bVar;
            this.f40078g = list;
            this.f40079h = list2;
            this.f40080i = aVar;
            this.f40081j = bVar2;
            this.f40082k = z2;
        }

        /* renamed from: a */
        public boolean mo36468a() {
            return this.f40076e;
        }

        /* renamed from: b */
        public List mo36469b() {
            return this.f40078g;
        }

        /* renamed from: c */
        public List mo36470c() {
            return this.f40079h;
        }

        /* renamed from: d */
        public C13473a.C13476b mo36471d() {
            return this.f40077f;
        }

        /* renamed from: e */
        public Image mo36472e() {
            return this.f40074c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13448a)) {
                return false;
            }
            C13448a aVar = (C13448a) obj;
            return C41536l.m120484d(getTitle(), aVar.getTitle()) && C41536l.m120484d(getAmount(), aVar.getAmount()) && C41536l.m120484d(mo36472e(), aVar.mo36472e()) && C41536l.m120484d(getIcon(), aVar.getIcon()) && mo36468a() == aVar.mo36468a() && mo36471d() == aVar.mo36471d() && C41536l.m120484d(mo36469b(), aVar.mo36469b()) && C41536l.m120484d(mo36470c(), aVar.mo36470c()) && C41536l.m120484d(this.f40080i, aVar.f40080i) && C41536l.m120484d(this.f40081j, aVar.f40081j) && mo36474f() == aVar.mo36474f();
        }

        /* renamed from: f */
        public boolean mo36474f() {
            return this.f40082k;
        }

        /* renamed from: g */
        public final C13449b.C13450a mo36489g() {
            return this.f40080i;
        }

        public Amount getAmount() {
            return this.f40073b;
        }

        public Image getIcon() {
            return this.f40075d;
        }

        public String getTitle() {
            return this.f40072a;
        }

        /* renamed from: h */
        public final C13449b.C13451b mo36490h() {
            return this.f40081j;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((((getTitle().hashCode() * 31) + getAmount().hashCode()) * 31) + (mo36472e() == null ? 0 : mo36472e().hashCode())) * 31) + (getIcon() == null ? 0 : getIcon().hashCode())) * 31;
            boolean a = mo36468a();
            boolean z = true;
            if (a) {
                a = true;
            }
            int hashCode2 = (((((((hashCode + (a ? 1 : 0)) * 31) + mo36471d().hashCode()) * 31) + (mo36469b() == null ? 0 : mo36469b().hashCode())) * 31) + (mo36470c() == null ? 0 : mo36470c().hashCode())) * 31;
            C13449b.C13450a aVar = this.f40080i;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            C13449b.C13451b bVar = this.f40081j;
            if (bVar != null) {
                i = bVar.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean f = mo36474f();
            if (!f) {
                z = f;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            String title = getTitle();
            Amount amount = getAmount();
            Image e = mo36472e();
            Image icon = getIcon();
            boolean a = mo36468a();
            C13473a.C13476b d = mo36471d();
            List b = mo36469b();
            List c = mo36470c();
            C13449b.C13450a aVar = this.f40080i;
            C13449b.C13451b bVar = this.f40081j;
            boolean f = mo36474f();
            return "CreditCard(title=" + title + ", amount=" + amount + ", backgroundImage=" + e + ", icon=" + icon + ", isBadgeVisible=" + a + ", cardTheme=" + d + ", creditCards=" + b + ", newBadgeCards=" + c + ", dateInfoData=" + aVar + ", spentInfoData=" + bVar + ", resetThemeOnFailed=" + f + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13448a(java.lang.String r16, p341ge.bog.designsystem.components.Amount r17, p341ge.bog.designsystem.components.common.Image r18, p341ge.bog.designsystem.components.common.Image r19, boolean r20, p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b r21, java.util.List r22, java.util.List r23, p341ge.bog.designsystem.components.productcards.CreditCardView.C13449b.C13450a r24, p341ge.bog.designsystem.components.productcards.CreditCardView.C13449b.C13451b r25, boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            /*
                r15 = this;
                r0 = r27
                r1 = r0 & 8
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r7 = r2
                goto L_0x000b
            L_0x0009:
                r7 = r19
            L_0x000b:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0012
                r1 = 0
                r8 = r1
                goto L_0x0014
            L_0x0012:
                r8 = r20
            L_0x0014:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x001c
                ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.BLACK
                r9 = r1
                goto L_0x001e
            L_0x001c:
                r9 = r21
            L_0x001e:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0024
                r10 = r2
                goto L_0x0026
            L_0x0024:
                r10 = r22
            L_0x0026:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x002c
                r11 = r2
                goto L_0x002e
            L_0x002c:
                r11 = r23
            L_0x002e:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0034
                r12 = r2
                goto L_0x0036
            L_0x0034:
                r12 = r24
            L_0x0036:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x003c
                r13 = r2
                goto L_0x003e
            L_0x003c:
                r13 = r25
            L_0x003e:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0045
                r0 = 1
                r14 = r0
                goto L_0x0047
            L_0x0045:
                r14 = r26
            L_0x0047:
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productcards.CreditCardView.C13448a.<init>(java.lang.String, ge.bog.designsystem.components.Amount, ge.bog.designsystem.components.common.Image, ge.bog.designsystem.components.common.Image, boolean, ge.bog.designsystem.components.productcards.basecard.a$b, java.util.List, java.util.List, ge.bog.designsystem.components.productcards.CreditCardView$b$a, ge.bog.designsystem.components.productcards.CreditCardView$b$b, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
