package p341ge.bog.designsystem.components.productcards;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.core.content.C0767a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.productcards.basecard.C13473a;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p352ak.C10013s4;
import p352ak.C10020t4;
import p365bj.C10299a;
import p601sg.C17778c;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.productcards.DepositCardView */
public final class DepositCardView extends C13473a {

    /* renamed from: g */
    protected C10299a f40089g;

    /* renamed from: ge.bog.designsystem.components.productcards.DepositCardView$b */
    public static abstract class C13454b {

        /* renamed from: ge.bog.designsystem.components.productcards.DepositCardView$b$a */
        public static final class C13455a extends C13454b {

            /* renamed from: a */
            private final String f40100a;

            /* renamed from: b */
            private final Amount f40101b;

            /* renamed from: c */
            private final String f40102c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C13455a(String str, Amount amount, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : amount, (i & 4) != 0 ? null : str2);
            }

            /* renamed from: a */
            public final Amount mo36508a() {
                return this.f40101b;
            }

            /* renamed from: b */
            public final String mo36509b() {
                return this.f40102c;
            }

            /* renamed from: c */
            public final String mo36510c() {
                return this.f40100a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13455a)) {
                    return false;
                }
                C13455a aVar = (C13455a) obj;
                return C41536l.m120484d(this.f40100a, aVar.f40100a) && C41536l.m120484d(this.f40101b, aVar.f40101b) && C41536l.m120484d(this.f40102c, aVar.f40102c);
            }

            public int hashCode() {
                int hashCode = this.f40100a.hashCode() * 31;
                Amount amount = this.f40101b;
                int i = 0;
                int hashCode2 = (hashCode + (amount == null ? 0 : amount.hashCode())) * 31;
                String str = this.f40102c;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                String str = this.f40100a;
                Amount amount = this.f40101b;
                String str2 = this.f40102c;
                return "Accured(badgeTitle=" + str + ", badgeAmount=" + amount + ", badgeText=" + str2 + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13455a(String str, Amount amount, String str2) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "badgeTitle");
                this.f40100a = str;
                this.f40101b = amount;
                this.f40102c = str2;
            }
        }

        /* renamed from: ge.bog.designsystem.components.productcards.DepositCardView$b$b */
        public static final class C13456b extends C13454b {

            /* renamed from: a */
            private final TextProgressBarView.ProgressModel.Progress f40103a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13456b(TextProgressBarView.ProgressModel.Progress progress) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(progress, "data");
                this.f40103a = progress;
            }

            /* renamed from: a */
            public final TextProgressBarView.ProgressModel.Progress mo36514a() {
                return this.f40103a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13456b) && C41536l.m120484d(this.f40103a, ((C13456b) obj).f40103a);
            }

            public int hashCode() {
                return this.f40103a.hashCode();
            }

            public String toString() {
                TextProgressBarView.ProgressModel.Progress progress = this.f40103a;
                return "Goal(data=" + progress + ")";
            }
        }

        private C13454b() {
        }

        public /* synthetic */ C13454b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.DepositCardView$c */
    public enum C13457c {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    /* renamed from: ge.bog.designsystem.components.productcards.DepositCardView$d */
    public /* synthetic */ class C13458d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40108a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40109b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f40110c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004c */
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
                f40108a = r0
                ge.bog.designsystem.components.productcards.basecard.a$b[] r0 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.productcards.basecard.a$b r3 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.WHITE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                ge.bog.designsystem.components.productcards.basecard.a$b r3 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                ge.bog.designsystem.components.productcards.basecard.a$b r3 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.COLOR     // Catch:{ NoSuchFieldError -> 0x003b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f40109b = r0
                ge.bog.designsystem.components.productcards.DepositCardView$c[] r0 = p341ge.bog.designsystem.components.productcards.DepositCardView.C13457c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.productcards.DepositCardView$c r3 = p341ge.bog.designsystem.components.productcards.DepositCardView.C13457c.POSITIVE     // Catch:{ NoSuchFieldError -> 0x004c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                ge.bog.designsystem.components.productcards.DepositCardView$c r1 = p341ge.bog.designsystem.components.productcards.DepositCardView.C13457c.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f40110c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productcards.DepositCardView.C13458d.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DepositCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final void m50517b(C13457c cVar, TextBadgeView textBadgeView) {
        int i = C13458d.f40110c[cVar.ordinal()];
        if (i == 1) {
            textBadgeView.setBackgroundColor(C0767a.m2893c(getContext(), C17778c.color_positive_tr_5));
            textBadgeView.setBadgeSecondTextColor(C0767a.m2893c(getContext(), C17778c.f49617S));
        } else if (i == 2) {
            textBadgeView.setBackgroundColor(C0767a.m2893c(getContext(), C17778c.f49608F));
            textBadgeView.setBadgeSecondTextColor(C0767a.m2893c(getContext(), C17778c.f49605C));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: ak.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: ak.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: ak.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: ak.a0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m50518c(p341ge.bog.designsystem.components.productcards.DepositCardView.C13454b r8, p341ge.bog.designsystem.components.productcards.DepositCardView.C13457c r9) {
        /*
            r7 = this;
            bj.a r0 = r7.getCardShape()
            boolean r0 = r0 instanceof p365bj.C10299a.C10307c
            if (r0 == 0) goto L_0x00f6
            r0 = 0
            if (r8 == 0) goto L_0x00ec
            boolean r1 = r8 instanceof p341ge.bog.designsystem.components.productcards.DepositCardView.C13454b.C13456b
            java.lang.String r2 = "{\n                      …  }\n                    }"
            r3 = 0
            if (r1 == 0) goto L_0x0057
            android.content.Context r9 = r7.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            ak.b0 r9 = p352ak.C9876b0.m36225d(r9, r7, r3)
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView r1 = r9.mo3946b()
            ge.bog.designsystem.components.productcards.DepositCardView$b$b r8 = (p341ge.bog.designsystem.components.productcards.DepositCardView.C13454b.C13456b) r8
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$Progress r8 = r8.mo36514a()
            r1.setBudget(r8)
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView r8 = r9.mo3946b()
            ge.bog.designsystem.components.productcards.basecard.a$b r1 = r7.getCardTheme()
            int[] r3 = p341ge.bog.designsystem.components.productcards.DepositCardView.C13458d.f40109b
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L_0x004d
            r3 = 2
            if (r1 == r3) goto L_0x004a
            r3 = 3
            if (r1 == r3) goto L_0x0047
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView$a r1 = p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.C13541a.BLACK
            goto L_0x004f
        L_0x0047:
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView$a r1 = p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.C13541a.CLEAR
            goto L_0x004f
        L_0x004a:
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView$a r1 = p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.C13541a.CLEAR
            goto L_0x004f
        L_0x004d:
            ge.bog.designsystem.components.textprogressbar.TextProgressBarView$a r1 = p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView.C13541a.WHITE
        L_0x004f:
            r8.setColorTheme(r1)
            kotlin.jvm.internal.C41536l.m120488h(r9, r2)
            goto L_0x00d8
        L_0x0057:
            boolean r1 = r8 instanceof p341ge.bog.designsystem.components.productcards.DepositCardView.C13454b.C13455a
            if (r1 == 0) goto L_0x00e6
            android.content.Context r1 = r7.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            ak.a0 r1 = p352ak.C9868a0.m36197d(r1, r7, r3)
            ge.bog.designsystem.components.textbadge.TextBadgeView r3 = r1.mo3946b()
            ge.bog.designsystem.components.productcards.basecard.a$b r4 = r7.getCardTheme()
            ge.bog.designsystem.components.common.Color r4 = r4.mo36577h()
            android.content.Context r5 = r7.getContext()
            java.lang.String r6 = "context"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            int r4 = r4.mo35260a(r5)
            r3.setBadgeTextColor(r4)
            ge.bog.designsystem.components.textbadge.TextBadgeView r3 = r1.mo3946b()
            ge.bog.designsystem.components.productcards.basecard.a$b r4 = r7.getCardTheme()
            ge.bog.designsystem.components.common.Color r4 = r4.mo36572b()
            android.content.Context r5 = r7.getContext()
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            int r4 = r4.mo35260a(r5)
            r3.setBadgeSecondTextColor(r4)
            ge.bog.designsystem.components.textbadge.TextBadgeView r3 = r1.mo3946b()
            ge.bog.designsystem.components.productcards.DepositCardView$b$a r8 = (p341ge.bog.designsystem.components.productcards.DepositCardView.C13454b.C13455a) r8
            java.lang.String r4 = r8.mo36510c()
            r3.setBadgeText(r4)
            ge.bog.designsystem.components.Amount r3 = r8.mo36508a()
            if (r3 == 0) goto L_0x00b9
            ge.bog.designsystem.components.Amount r8 = r8.mo36508a()
            java.lang.String r8 = p615tg.C17959a.m61877a(r8)
            goto L_0x00bd
        L_0x00b9:
            java.lang.String r8 = r8.mo36509b()
        L_0x00bd:
            if (r8 != 0) goto L_0x00c1
            java.lang.String r8 = ""
        L_0x00c1:
            ge.bog.designsystem.components.textbadge.TextBadgeView r3 = r1.mo3946b()
            r3.setBadgeSecondText(r8)
            ge.bog.designsystem.components.textbadge.TextBadgeView r8 = r1.mo3946b()
            java.lang.String r3 = "root"
            kotlin.jvm.internal.C41536l.m120488h(r8, r3)
            r7.m50517b(r9, r8)
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            r9 = r1
        L_0x00d8:
            bj.a r8 = r7.getCardShape()
            android.view.View r9 = r9.mo3946b()
            r8.mo26912j(r9)
            he1.w r8 = he1.C41238w.f97225a
            goto L_0x00ed
        L_0x00e6:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x00ec:
            r8 = r0
        L_0x00ed:
            if (r8 != 0) goto L_0x00f6
            bj.a r8 = r7.getCardShape()
            r8.mo26912j(r0)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productcards.DepositCardView.m50518c(ge.bog.designsystem.components.productcards.DepositCardView$b, ge.bog.designsystem.components.productcards.DepositCardView$c):void");
    }

    /* access modifiers changed from: protected */
    public C10299a getCardShape() {
        C10299a aVar = this.f40089g;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("cardShape");
        return null;
    }

    /* access modifiers changed from: protected */
    public void setCardShape(C10299a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f40089g = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepositCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setData(C13453a aVar) {
        C41536l.m120489i(aVar, "data");
        super.setData(aVar);
        m50518c(aVar.mo36505g(), C13457c.NEUTRAL);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DepositCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10299a aVar;
        C41536l.m120489i(context, "context");
        int[] iArr = C17787l.f50251b4;
        C41536l.m120488h(iArr, "DepositCards");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50267c4, 0);
        int i3 = obtainStyledAttributes.getInt(C17787l.f50283d4, C13473a.C13476b.COLOR.mo36576g());
        String string = obtainStyledAttributes.getString(C17787l.f50315f4);
        LayoutInflater from = LayoutInflater.from(context);
        int i4 = C13458d.f40108a[C13473a.C13474a.f40170e.mo36571a(i2).ordinal()];
        if (i4 == 1) {
            C10020t4 d = C10020t4.m36752d(from, this, true);
            C41536l.m120488h(d, "inflate(layoutInflater, …is@DepositCardView, true)");
            aVar = new C10299a.C10307c(d);
        } else if (i4 == 2) {
            C10013s4 d2 = C10013s4.m36726d(from, this, true);
            C41536l.m120488h(d2, "inflate(\n               …rue\n                    )");
            aVar = new C10299a.C10303b(d2);
        } else {
            throw new IllegalStateException("Unknown card shape");
        }
        setCardShape(aVar);
        setBadgeVisible(obtainStyledAttributes.getBoolean(C17787l.f50299e4, false));
        setCardTheme(C13473a.C13476b.f40176k.mo36579a(i3));
        getCardShape().mo26919r(string);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ge.bog.designsystem.components.productcards.DepositCardView$a */
    public static final class C13453a implements C13473a.C13479d {

        /* renamed from: a */
        private final String f40090a;

        /* renamed from: b */
        private final Amount f40091b;

        /* renamed from: c */
        private final Image f40092c;

        /* renamed from: d */
        private final boolean f40093d;

        /* renamed from: e */
        private final C13473a.C13476b f40094e;

        /* renamed from: f */
        private final C13454b f40095f;

        /* renamed from: g */
        private final Image f40096g;

        /* renamed from: h */
        private final boolean f40097h;

        /* renamed from: i */
        private final List f40098i;

        /* renamed from: j */
        private final List f40099j;

        public C13453a(String str, Amount amount, Image image, boolean z, C13473a.C13476b bVar, C13454b bVar2, Image image2, boolean z2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(amount, "amount");
            C41536l.m120489i(bVar, "cardTheme");
            this.f40090a = str;
            this.f40091b = amount;
            this.f40092c = image;
            this.f40093d = z;
            this.f40094e = bVar;
            this.f40095f = bVar2;
            this.f40096g = image2;
            this.f40097h = z2;
        }

        /* renamed from: a */
        public boolean mo36468a() {
            return this.f40093d;
        }

        /* renamed from: b */
        public List mo36469b() {
            return this.f40098i;
        }

        /* renamed from: c */
        public List mo36470c() {
            return this.f40099j;
        }

        /* renamed from: d */
        public C13473a.C13476b mo36471d() {
            return this.f40094e;
        }

        /* renamed from: e */
        public Image mo36472e() {
            return this.f40096g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13453a)) {
                return false;
            }
            C13453a aVar = (C13453a) obj;
            return C41536l.m120484d(getTitle(), aVar.getTitle()) && C41536l.m120484d(getAmount(), aVar.getAmount()) && C41536l.m120484d(getIcon(), aVar.getIcon()) && mo36468a() == aVar.mo36468a() && mo36471d() == aVar.mo36471d() && C41536l.m120484d(this.f40095f, aVar.f40095f) && C41536l.m120484d(mo36472e(), aVar.mo36472e()) && mo36474f() == aVar.mo36474f();
        }

        /* renamed from: f */
        public boolean mo36474f() {
            return this.f40097h;
        }

        /* renamed from: g */
        public final C13454b mo36505g() {
            return this.f40095f;
        }

        public Amount getAmount() {
            return this.f40091b;
        }

        public Image getIcon() {
            return this.f40092c;
        }

        public String getTitle() {
            return this.f40090a;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = ((((getTitle().hashCode() * 31) + getAmount().hashCode()) * 31) + (getIcon() == null ? 0 : getIcon().hashCode())) * 31;
            boolean a = mo36468a();
            boolean z = true;
            if (a) {
                a = true;
            }
            int hashCode2 = (((hashCode + (a ? 1 : 0)) * 31) + mo36471d().hashCode()) * 31;
            C13454b bVar = this.f40095f;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            if (mo36472e() != null) {
                i = mo36472e().hashCode();
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
            Image icon = getIcon();
            boolean a = mo36468a();
            C13473a.C13476b d = mo36471d();
            C13454b bVar = this.f40095f;
            Image e = mo36472e();
            boolean f = mo36474f();
            return "DepositCard(title=" + title + ", amount=" + amount + ", icon=" + icon + ", isBadgeVisible=" + a + ", cardTheme=" + d + ", depositCardInfoData=" + bVar + ", backgroundImage=" + e + ", resetThemeOnFailed=" + f + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13453a(java.lang.String r13, p341ge.bog.designsystem.components.Amount r14, p341ge.bog.designsystem.components.common.Image r15, boolean r16, p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b r17, p341ge.bog.designsystem.components.productcards.DepositCardView.C13454b r18, p341ge.bog.designsystem.components.common.Image r19, boolean r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
            /*
                r12 = this;
                r0 = r21
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r6 = r2
                goto L_0x000a
            L_0x0009:
                r6 = r15
            L_0x000a:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0011
                r1 = 0
                r7 = r1
                goto L_0x0013
            L_0x0011:
                r7 = r16
            L_0x0013:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0019
                r9 = r2
                goto L_0x001b
            L_0x0019:
                r9 = r18
            L_0x001b:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0021
                r10 = r2
                goto L_0x0023
            L_0x0021:
                r10 = r19
            L_0x0023:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x002a
                r0 = 1
                r11 = r0
                goto L_0x002c
            L_0x002a:
                r11 = r20
            L_0x002c:
                r3 = r12
                r4 = r13
                r5 = r14
                r8 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productcards.DepositCardView.C13453a.<init>(java.lang.String, ge.bog.designsystem.components.Amount, ge.bog.designsystem.components.common.Image, boolean, ge.bog.designsystem.components.productcards.basecard.a$b, ge.bog.designsystem.components.productcards.DepositCardView$b, ge.bog.designsystem.components.common.Image, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
