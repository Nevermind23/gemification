package p341ge.bog.designsystem.components.productcards;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.productcards.basecard.C13473a;
import p352ak.C10006r4;
import p352ak.C10013s4;
import p352ak.C10020t4;
import p352ak.C9999q4;
import p365bj.C10299a;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.productcards.AccountCardView */
public final class AccountCardView extends C13473a {

    /* renamed from: g */
    protected C10299a f40052g;

    /* renamed from: h */
    private List f40053h;

    /* renamed from: ge.bog.designsystem.components.productcards.AccountCardView$b */
    public static final class C13446b {

        /* renamed from: a */
        private final String f40065a;

        /* renamed from: b */
        private final boolean f40066b;

        public C13446b(String str, boolean z) {
            C41536l.m120489i(str, "currency");
            this.f40065a = str;
            this.f40066b = z;
        }

        /* renamed from: a */
        public final String mo36482a() {
            return this.f40065a;
        }

        /* renamed from: b */
        public final boolean mo36483b() {
            return this.f40066b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13446b)) {
                return false;
            }
            C13446b bVar = (C13446b) obj;
            return C41536l.m120484d(this.f40065a, bVar.f40065a) && this.f40066b == bVar.f40066b;
        }

        public int hashCode() {
            int hashCode = this.f40065a.hashCode() * 31;
            boolean z = this.f40066b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f40065a;
            boolean z = this.f40066b;
            return "Currency(currency=" + str + ", isActive=" + z + ")";
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.AccountCardView$c */
    public /* synthetic */ class C13447c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40067a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40068b;

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
                f40067a = r0
                ge.bog.designsystem.components.productcards.basecard.a$b[] r0 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.productcards.basecard.a$b r3 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.WHITE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.BLACK     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f40068b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productcards.AccountCardView.C13447c.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccountCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final void m50490b() {
        if (getCardShape() instanceof C10299a.C10303b) {
            return;
        }
        if (!this.f40053h.isEmpty()) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            LayoutInflater from = LayoutInflater.from(getContext());
            for (C13446b bVar : this.f40053h) {
                String a = bVar.mo36482a();
                boolean b = bVar.mo36483b();
                C9999q4 d = C9999q4.m36674d(from, linearLayout, true);
                C41536l.m120488h(d, "inflate(\n               …rue\n                    )");
                InfoBadgeView infoBadgeView = d.f27434e;
                C41536l.m120488h(infoBadgeView, "drawAmountBadges$lambda$2$lambda$1");
                InfoBadgeView.m50233e(infoBadgeView, (String) null, (String) null, a, 3, (Object) null);
                infoBadgeView.setEnabled(b);
                int i = C13447c.f40068b[getCardTheme().ordinal()];
                if (i == 1) {
                    infoBadgeView.setType(InfoBadgeView.C13346b.ACCOUNT_CURRENCY_BADGE_WHITE);
                } else if (i != 2) {
                    infoBadgeView.setType(InfoBadgeView.C13346b.ACCOUNT_CURRENCY_BADGE_INVERT);
                } else {
                    infoBadgeView.setType(InfoBadgeView.C13346b.ACCOUNT_CURRENCY_BADGE_BLACK);
                }
            }
            getCardShape().mo26912j(linearLayout);
            return;
        }
        getCardShape().mo26912j((View) null);
    }

    private final void setCurrencies(List<C13446b> list) {
        this.f40053h = list;
        m50490b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36461a() {
        m50490b();
    }

    /* access modifiers changed from: protected */
    public C10299a getCardShape() {
        C10299a aVar = this.f40052g;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("cardShape");
        return null;
    }

    public final boolean getShowAmount() {
        return getCardShape().mo26908f();
    }

    /* access modifiers changed from: protected */
    public void setCardShape(C10299a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f40052g = aVar;
    }

    public final void setShowAmount(boolean z) {
        getCardShape().mo26918q(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setData(C13445a aVar) {
        C41536l.m120489i(aVar, "data");
        super.setData(aVar);
        setCurrencies(aVar.mo36475g());
        setShowAmount(aVar.mo36479h());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10299a aVar;
        C41536l.m120489i(context, "context");
        this.f40053h = C41341q.m119907j();
        int[] iArr = C17787l.f50326g;
        C41536l.m120488h(iArr, "AccountCards");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50358i, 0);
        int i3 = obtainStyledAttributes.getInt(C17787l.f50342h, 0);
        String string = obtainStyledAttributes.getString(C17787l.f50390k);
        LayoutInflater from = LayoutInflater.from(context);
        int i4 = C13447c.f40067a[C13473a.C13474a.f40170e.mo36571a(i2).ordinal()];
        if (i4 == 1) {
            C10020t4 d = C10020t4.m36752d(from, this, true);
            C41536l.m120488h(d, "inflate(layoutInflater, …is@AccountCardView, true)");
            aVar = new C10299a.C10307c(d);
        } else if (i4 == 2) {
            C10013s4 d2 = C10013s4.m36726d(from, this, true);
            C41536l.m120488h(d2, "inflate(\n               …rue\n                    )");
            aVar = new C10299a.C10303b(d2);
        } else if (i4 == 3) {
            C10006r4 d3 = C10006r4.m36700d(from, this, true);
            C41536l.m120488h(d3, "inflate(\n               …rue\n                    )");
            aVar = new C10299a.C10300a(d3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        setCardShape(aVar);
        setBadgeVisible(obtainStyledAttributes.getBoolean(C17787l.f50374j, false));
        setCardTheme(C13473a.C13476b.f40176k.mo36579a(i3));
        getCardShape().mo26919r(string);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ge.bog.designsystem.components.productcards.AccountCardView$a */
    public static final class C13445a implements C13473a.C13479d {

        /* renamed from: a */
        private final String f40054a;

        /* renamed from: b */
        private final Amount f40055b;

        /* renamed from: c */
        private final Image f40056c;

        /* renamed from: d */
        private final Image f40057d;

        /* renamed from: e */
        private final boolean f40058e;

        /* renamed from: f */
        private final C13473a.C13476b f40059f;

        /* renamed from: g */
        private final List f40060g;

        /* renamed from: h */
        private final List f40061h;

        /* renamed from: i */
        private final List f40062i;

        /* renamed from: j */
        private final boolean f40063j;

        /* renamed from: k */
        private final boolean f40064k;

        public C13445a(String str, Amount amount, Image image, Image image2, boolean z, C13473a.C13476b bVar, List list, List list2, List list3, boolean z2, boolean z3) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(amount, "amount");
            C41536l.m120489i(bVar, "cardTheme");
            C41536l.m120489i(list3, "currencies");
            this.f40054a = str;
            this.f40055b = amount;
            this.f40056c = image;
            this.f40057d = image2;
            this.f40058e = z;
            this.f40059f = bVar;
            this.f40060g = list;
            this.f40061h = list2;
            this.f40062i = list3;
            this.f40063j = z2;
            this.f40064k = z3;
        }

        /* renamed from: a */
        public boolean mo36468a() {
            return this.f40058e;
        }

        /* renamed from: b */
        public List mo36469b() {
            return this.f40060g;
        }

        /* renamed from: c */
        public List mo36470c() {
            return this.f40061h;
        }

        /* renamed from: d */
        public C13473a.C13476b mo36471d() {
            return this.f40059f;
        }

        /* renamed from: e */
        public Image mo36472e() {
            return this.f40056c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13445a)) {
                return false;
            }
            C13445a aVar = (C13445a) obj;
            return C41536l.m120484d(getTitle(), aVar.getTitle()) && C41536l.m120484d(getAmount(), aVar.getAmount()) && C41536l.m120484d(mo36472e(), aVar.mo36472e()) && C41536l.m120484d(getIcon(), aVar.getIcon()) && mo36468a() == aVar.mo36468a() && mo36471d() == aVar.mo36471d() && C41536l.m120484d(mo36469b(), aVar.mo36469b()) && C41536l.m120484d(mo36470c(), aVar.mo36470c()) && C41536l.m120484d(this.f40062i, aVar.f40062i) && this.f40063j == aVar.f40063j && mo36474f() == aVar.mo36474f();
        }

        /* renamed from: f */
        public boolean mo36474f() {
            return this.f40064k;
        }

        /* renamed from: g */
        public final List mo36475g() {
            return this.f40062i;
        }

        public Amount getAmount() {
            return this.f40055b;
        }

        public Image getIcon() {
            return this.f40057d;
        }

        public String getTitle() {
            return this.f40054a;
        }

        /* renamed from: h */
        public final boolean mo36479h() {
            return this.f40063j;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((((getTitle().hashCode() * 31) + getAmount().hashCode()) * 31) + (mo36472e() == null ? 0 : mo36472e().hashCode())) * 31) + (getIcon() == null ? 0 : getIcon().hashCode())) * 31;
            boolean a = mo36468a();
            boolean z = true;
            if (a) {
                a = true;
            }
            int hashCode2 = (((((hashCode + (a ? 1 : 0)) * 31) + mo36471d().hashCode()) * 31) + (mo36469b() == null ? 0 : mo36469b().hashCode())) * 31;
            if (mo36470c() != null) {
                i = mo36470c().hashCode();
            }
            int hashCode3 = (((hashCode2 + i) * 31) + this.f40062i.hashCode()) * 31;
            boolean z2 = this.f40063j;
            if (z2) {
                z2 = true;
            }
            int i2 = (hashCode3 + (z2 ? 1 : 0)) * 31;
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
            List list = this.f40062i;
            boolean z = this.f40063j;
            boolean f = mo36474f();
            return "AccountCard(title=" + title + ", amount=" + amount + ", backgroundImage=" + e + ", icon=" + icon + ", isBadgeVisible=" + a + ", cardTheme=" + d + ", creditCards=" + b + ", newBadgeCards=" + c + ", currencies=" + list + ", showAmount=" + z + ", resetThemeOnFailed=" + f + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13445a(java.lang.String r16, p341ge.bog.designsystem.components.Amount r17, p341ge.bog.designsystem.components.common.Image r18, p341ge.bog.designsystem.components.common.Image r19, boolean r20, p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b r21, java.util.List r22, java.util.List r23, java.util.List r24, boolean r25, boolean r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
            /*
                r15 = this;
                r0 = r27
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r6 = r2
                goto L_0x000b
            L_0x0009:
                r6 = r18
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r7 = r2
                goto L_0x0013
            L_0x0011:
                r7 = r19
            L_0x0013:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x001a
                r1 = 0
                r8 = r1
                goto L_0x001c
            L_0x001a:
                r8 = r20
            L_0x001c:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0024
                ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.BLACK
                r9 = r1
                goto L_0x0026
            L_0x0024:
                r9 = r21
            L_0x0026:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x002c
                r10 = r2
                goto L_0x002e
            L_0x002c:
                r10 = r22
            L_0x002e:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0034
                r11 = r2
                goto L_0x0036
            L_0x0034:
                r11 = r23
            L_0x0036:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0040
                java.util.List r1 = ie1.C41341q.m119907j()
                r12 = r1
                goto L_0x0042
            L_0x0040:
                r12 = r24
            L_0x0042:
                r1 = r0 & 512(0x200, float:7.175E-43)
                r2 = 1
                if (r1 == 0) goto L_0x0049
                r13 = r2
                goto L_0x004b
            L_0x0049:
                r13 = r25
            L_0x004b:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0051
                r14 = r2
                goto L_0x0053
            L_0x0051:
                r14 = r26
            L_0x0053:
                r3 = r15
                r4 = r16
                r5 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productcards.AccountCardView.C13445a.<init>(java.lang.String, ge.bog.designsystem.components.Amount, ge.bog.designsystem.components.common.Image, ge.bog.designsystem.components.common.Image, boolean, ge.bog.designsystem.components.productcards.basecard.a$b, java.util.List, java.util.List, java.util.List, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
