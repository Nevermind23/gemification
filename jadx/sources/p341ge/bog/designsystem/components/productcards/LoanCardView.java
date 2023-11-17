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
import p352ak.C10013s4;
import p352ak.C10020t4;
import p352ak.C9892d0;
import p352ak.C9900e0;
import p365bj.C10299a;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.productcards.LoanCardView */
public final class LoanCardView extends C13473a {

    /* renamed from: g */
    protected C10299a f40129g;

    /* renamed from: ge.bog.designsystem.components.productcards.LoanCardView$a */
    public static final class C13465a extends C13468d {

        /* renamed from: a */
        private final String f40130a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13465a(String str) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "badgeTitle");
            this.f40130a = str;
        }

        /* renamed from: a */
        public final String mo36539a() {
            return this.f40130a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13465a) && C41536l.m120484d(this.f40130a, ((C13465a) obj).f40130a);
        }

        public int hashCode() {
            return this.f40130a.hashCode();
        }

        public String toString() {
            String str = this.f40130a;
            return "CoSignerBadge(badgeTitle=" + str + ")";
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.LoanCardView$b */
    public static final class C13466b extends C13468d {

        /* renamed from: a */
        private final String f40131a;

        /* renamed from: b */
        private final String f40132b;

        /* renamed from: c */
        private final Date f40133c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13466b(String str, String str2, Date date) {
            super((DefaultConstructorMarker) null);
            C41536l.m120489i(str, "badgeTitle");
            C41536l.m120489i(str2, C11755a.C11756a.f34100b);
            C41536l.m120489i(date, "date");
            this.f40131a = str;
            this.f40132b = str2;
            this.f40133c = date;
        }

        /* renamed from: a */
        public final String mo36543a() {
            return this.f40131a;
        }

        /* renamed from: b */
        public final Date mo36544b() {
            return this.f40133c;
        }

        /* renamed from: c */
        public final String mo36545c() {
            return this.f40132b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13466b)) {
                return false;
            }
            C13466b bVar = (C13466b) obj;
            return C41536l.m120484d(this.f40131a, bVar.f40131a) && C41536l.m120484d(this.f40132b, bVar.f40132b) && C41536l.m120484d(this.f40133c, bVar.f40133c);
        }

        public int hashCode() {
            return (((this.f40131a.hashCode() * 31) + this.f40132b.hashCode()) * 31) + this.f40133c.hashCode();
        }

        public String toString() {
            String str = this.f40131a;
            String str2 = this.f40132b;
            Date date = this.f40133c;
            return "DateBadge(badgeTitle=" + str + ", value=" + str2 + ", date=" + date + ")";
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.LoanCardView$d */
    public static abstract class C13468d {
        private C13468d() {
        }

        public /* synthetic */ C13468d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.LoanCardView$e */
    public enum C13469e {
        NEGATIVE,
        NEUTRAL
    }

    /* renamed from: ge.bog.designsystem.components.productcards.LoanCardView$f */
    public /* synthetic */ class C13470f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40147a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40148b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
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
                f40147a = r0
                ge.bog.designsystem.components.productcards.LoanCardView$e[] r0 = p341ge.bog.designsystem.components.productcards.LoanCardView.C13469e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.productcards.LoanCardView$e r3 = p341ge.bog.designsystem.components.productcards.LoanCardView.C13469e.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                ge.bog.designsystem.components.productcards.LoanCardView$e r1 = p341ge.bog.designsystem.components.productcards.LoanCardView.C13469e.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                f40148b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productcards.LoanCardView.C13470f.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LoanCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final TextBadgeView m50547b(C13468d dVar) {
        if (dVar instanceof C13465a) {
            TextBadgeView textBadgeView = C9892d0.m36282d(LayoutInflater.from(getContext()), this, false).f26877e;
            textBadgeView.setBadgeText(((C13465a) dVar).mo36539a());
            C41536l.m120488h(textBadgeView, "inflate(\n               ….badgeTitle\n            }");
            return textBadgeView;
        } else if (dVar instanceof C13466b) {
            TextBadgeView textBadgeView2 = C9900e0.m36314d(LayoutInflater.from(getContext()), this, false).f26923e;
            Context context = textBadgeView2.getContext();
            C41536l.m120488h(context, "context");
            int i = C17777b.f49590A;
            textBadgeView2.setBadgeSecondTextColor(C18368l.m62755d(context, i));
            Context context2 = textBadgeView2.getContext();
            C41536l.m120488h(context2, "context");
            textBadgeView2.setBadgeTextColor(C18368l.m62755d(context2, C17777b.color_white_tr_200));
            Context context3 = textBadgeView2.getContext();
            C41536l.m120488h(context3, "context");
            textBadgeView2.setBadgeCaptionTextColor(C18368l.m62755d(context3, i));
            C13466b bVar = (C13466b) dVar;
            textBadgeView2.setBadgeText(bVar.mo36543a());
            textBadgeView2.setBadgeSecondText(getDateFormat().format(bVar.mo36544b()));
            textBadgeView2.setBadgeCaption(bVar.mo36545c());
            C41536l.m120488h(textBadgeView2, "inflate(\n               … data.value\n            }");
            return textBadgeView2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void setLoanCardInfoData(C13468d dVar) {
        C41238w wVar;
        if (getCardShape() instanceof C10299a.C10307c) {
            if (dVar != null) {
                getCardShape().mo26912j(m50547b(dVar));
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                getCardShape().mo26912j((View) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36461a() {
        if (getCardTheme() == C13473a.C13476b.BLACK) {
            throw new IllegalArgumentException("Loan card doesn't support black theme");
        }
    }

    /* access modifiers changed from: protected */
    public C10299a getCardShape() {
        C10299a aVar = this.f40129g;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("cardShape");
        return null;
    }

    /* access modifiers changed from: protected */
    public void setCardShape(C10299a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f40129g = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoanCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setData(C13467c cVar) {
        C41536l.m120489i(cVar, "data");
        super.setData(cVar);
        setLoanCardInfoData(cVar.mo36550g());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoanCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10299a aVar;
        C41536l.m120489i(context, "context");
        int[] iArr = C17787l.f50633z7;
        C41536l.m120488h(iArr, "LoanCards");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f49848A7, 0);
        String string = obtainStyledAttributes.getString(C17787l.f49893D7);
        LayoutInflater from = LayoutInflater.from(context);
        int i3 = C13470f.f40147a[C13473a.C13474a.f40170e.mo36571a(i2).ordinal()];
        if (i3 == 1) {
            C10020t4 d = C10020t4.m36752d(from, this, true);
            FrameLayout frameLayout = d.f27591h;
            C41536l.m120488h(frameLayout, "bottomViewContainer");
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.C0620b bVar = (ConstraintLayout.C0620b) layoutParams;
                bVar.f2491B = obtainStyledAttributes.getResources().getDimensionPixelSize(C17779d.spacing_64);
                frameLayout.setLayoutParams(bVar);
                C41536l.m120488h(d, "inflate(layoutInflater, …                        }");
                aVar = new C10299a.C10307c(d);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        } else if (i3 == 2) {
            C10013s4 d2 = C10013s4.m36726d(from, this, true);
            C41536l.m120488h(d2, "inflate(\n               …rue\n                    )");
            aVar = new C10299a.C10303b(d2);
        } else {
            throw new IllegalStateException("Unknown card shape");
        }
        setCardShape(aVar);
        getCardShape().mo26919r(string);
        setBadgeVisible(obtainStyledAttributes.getBoolean(C17787l.f49863B7, false));
        setCardTheme(C13473a.C13476b.f40176k.mo36579a(obtainStyledAttributes.getInt(C17787l.f49878C7, C13473a.C13476b.COLOR.mo36576g())));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ge.bog.designsystem.components.productcards.LoanCardView$c */
    public static final class C13467c implements C13473a.C13479d {

        /* renamed from: a */
        private final String f40134a;

        /* renamed from: b */
        private final Amount f40135b;

        /* renamed from: c */
        private final Image f40136c;

        /* renamed from: d */
        private final boolean f40137d;

        /* renamed from: e */
        private final C13473a.C13476b f40138e;

        /* renamed from: f */
        private final C13468d f40139f;

        /* renamed from: g */
        private final boolean f40140g;

        /* renamed from: h */
        private final Image f40141h;

        /* renamed from: i */
        private final List f40142i;

        /* renamed from: j */
        private final List f40143j;

        public C13467c(String str, Amount amount, Image image, boolean z, C13473a.C13476b bVar, C13468d dVar, boolean z2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(amount, "amount");
            C41536l.m120489i(bVar, "cardTheme");
            this.f40134a = str;
            this.f40135b = amount;
            this.f40136c = image;
            this.f40137d = z;
            this.f40138e = bVar;
            this.f40139f = dVar;
            this.f40140g = z2;
        }

        /* renamed from: a */
        public boolean mo36468a() {
            return this.f40137d;
        }

        /* renamed from: b */
        public List mo36469b() {
            return this.f40142i;
        }

        /* renamed from: c */
        public List mo36470c() {
            return this.f40143j;
        }

        /* renamed from: d */
        public C13473a.C13476b mo36471d() {
            return this.f40138e;
        }

        /* renamed from: e */
        public Image mo36472e() {
            return this.f40141h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13467c)) {
                return false;
            }
            C13467c cVar = (C13467c) obj;
            return C41536l.m120484d(getTitle(), cVar.getTitle()) && C41536l.m120484d(getAmount(), cVar.getAmount()) && C41536l.m120484d(getIcon(), cVar.getIcon()) && mo36468a() == cVar.mo36468a() && mo36471d() == cVar.mo36471d() && C41536l.m120484d(this.f40139f, cVar.f40139f) && mo36474f() == cVar.mo36474f();
        }

        /* renamed from: f */
        public boolean mo36474f() {
            return this.f40140g;
        }

        /* renamed from: g */
        public final C13468d mo36550g() {
            return this.f40139f;
        }

        public Amount getAmount() {
            return this.f40135b;
        }

        public Image getIcon() {
            return this.f40136c;
        }

        public String getTitle() {
            return this.f40134a;
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
            C13468d dVar = this.f40139f;
            if (dVar != null) {
                i = dVar.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
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
            C13468d dVar = this.f40139f;
            boolean f = mo36474f();
            return "LoanCard(title=" + title + ", amount=" + amount + ", icon=" + icon + ", isBadgeVisible=" + a + ", cardTheme=" + d + ", loanCardInfoData=" + dVar + ", resetThemeOnFailed=" + f + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13467c(String str, Amount amount, Image image, boolean z, C13473a.C13476b bVar, C13468d dVar, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, amount, (i & 4) != 0 ? null : image, (i & 8) != 0 ? false : z, bVar, (i & 32) != 0 ? null : dVar, (i & 64) != 0 ? true : z2);
        }
    }
}
