package p341ge.bog.designsystem.components.productcards;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.productcards.basecard.C13473a;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p352ak.C10020t4;
import p352ak.C9992p4;
import p365bj.C10299a;
import p601sg.C17787l;
import p615tg.C17959a;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.productcards.PiggyBankCardView */
public final class PiggyBankCardView extends C13473a {

    /* renamed from: g */
    private final LayoutInflater f40149g;

    /* renamed from: h */
    private final C10020t4 f40150h;

    /* renamed from: i */
    private C10299a f40151i;

    /* renamed from: j */
    private final C9992p4 f40152j;

    /* renamed from: ge.bog.designsystem.components.productcards.PiggyBankCardView$b */
    public static final class C13472b {

        /* renamed from: a */
        private final boolean f40165a;

        /* renamed from: b */
        private final String f40166b;

        public C13472b(boolean z, String str) {
            C41536l.m120489i(str, "pausedText");
            this.f40165a = z;
            this.f40166b = str;
        }

        /* renamed from: a */
        public final String mo36560a() {
            return this.f40166b;
        }

        /* renamed from: b */
        public final boolean mo36561b() {
            return this.f40165a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13472b)) {
                return false;
            }
            C13472b bVar = (C13472b) obj;
            return this.f40165a == bVar.f40165a && C41536l.m120484d(this.f40166b, bVar.f40166b);
        }

        public int hashCode() {
            boolean z = this.f40165a;
            if (z) {
                z = true;
            }
            return ((z ? 1 : 0) * true) + this.f40166b.hashCode();
        }

        public String toString() {
            boolean z = this.f40165a;
            String str = this.f40166b;
            return "PiggyBankPauseInfo(isPaused=" + z + ", pausedText=" + str + ")";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PiggyBankCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public C10299a getCardShape() {
        return this.f40151i;
    }

    /* access modifiers changed from: protected */
    public void setCardShape(C10299a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f40151i = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PiggyBankCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setData(C13471a aVar) {
        C41536l.m120489i(aVar, "data");
        super.setData(aVar);
        TextBadgeView textBadgeView = this.f40152j.f27403f;
        C41536l.m120488h(textBadgeView, "textBadge.transactionBadge");
        C13472b i = aVar.mo36558i();
        boolean z = true;
        C18368l.m62751F(textBadgeView, !(i != null && i.mo36561b()), false, 2, (Object) null);
        TextBadgeView textBadgeView2 = this.f40152j.f27402e;
        C41536l.m120488h(textBadgeView2, "textBadge.pauseBadge");
        C13472b i2 = aVar.mo36558i();
        C18368l.m62751F(textBadgeView2, i2 != null && i2.mo36561b(), false, 2, (Object) null);
        C13472b i3 = aVar.mo36558i();
        if (i3 == null || !i3.mo36561b()) {
            z = false;
        }
        if (z) {
            this.f40152j.f27402e.setBadgeText(aVar.mo36558i().mo36560a());
            return;
        }
        TextBadgeView textBadgeView3 = this.f40152j.f27403f;
        textBadgeView3.setBadgeText(aVar.mo36556h());
        textBadgeView3.setBadgeSecondText(C17959a.m61877a(aVar.mo36555g()));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PiggyBankCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        this.f40149g = from;
        C10020t4 d = C10020t4.m36752d(from, this, true);
        C41536l.m120488h(d, "inflate(inflater, this, true)");
        this.f40150h = d;
        this.f40151i = new C10299a.C10307c(d);
        C9992p4 d2 = C9992p4.m36648d(from, this, false);
        C41536l.m120488h(d2, "inflate(inflater, this, false)");
        this.f40152j = d2;
        LayoutInflater.from(context);
        int[] iArr = C17787l.f50251b4;
        C41536l.m120488h(iArr, "DepositCards");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setCardShape(new C10299a.C10307c(d));
        obtainStyledAttributes.recycle();
        getCardShape().mo26912j(d2.mo3946b());
    }

    /* renamed from: ge.bog.designsystem.components.productcards.PiggyBankCardView$a */
    public static final class C13471a implements C13473a.C13479d {

        /* renamed from: a */
        private final String f40153a;

        /* renamed from: b */
        private final Amount f40154b;

        /* renamed from: c */
        private final String f40155c;

        /* renamed from: d */
        private final Amount f40156d;

        /* renamed from: e */
        private final C13472b f40157e;

        /* renamed from: f */
        private final Image f40158f;

        /* renamed from: g */
        private final Image f40159g;

        /* renamed from: h */
        private final C13473a.C13476b f40160h;

        /* renamed from: i */
        private final boolean f40161i;

        /* renamed from: j */
        private final boolean f40162j;

        /* renamed from: k */
        private final List f40163k;

        /* renamed from: l */
        private final List f40164l;

        public C13471a(String str, Amount amount, String str2, Amount amount2, C13472b bVar, Image image, Image image2, C13473a.C13476b bVar2, boolean z) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(amount, "amount");
            C41536l.m120489i(str2, "badgeText");
            C41536l.m120489i(amount2, "badgeAmount");
            C41536l.m120489i(image, "icon");
            C41536l.m120489i(bVar2, "cardTheme");
            this.f40153a = str;
            this.f40154b = amount;
            this.f40155c = str2;
            this.f40156d = amount2;
            this.f40157e = bVar;
            this.f40158f = image;
            this.f40159g = image2;
            this.f40160h = bVar2;
            this.f40161i = z;
        }

        /* renamed from: a */
        public boolean mo36468a() {
            return this.f40162j;
        }

        /* renamed from: b */
        public List mo36469b() {
            return this.f40163k;
        }

        /* renamed from: c */
        public List mo36470c() {
            return this.f40164l;
        }

        /* renamed from: d */
        public C13473a.C13476b mo36471d() {
            return this.f40160h;
        }

        /* renamed from: e */
        public Image mo36472e() {
            return this.f40159g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13471a)) {
                return false;
            }
            C13471a aVar = (C13471a) obj;
            return C41536l.m120484d(getTitle(), aVar.getTitle()) && C41536l.m120484d(getAmount(), aVar.getAmount()) && C41536l.m120484d(this.f40155c, aVar.f40155c) && C41536l.m120484d(this.f40156d, aVar.f40156d) && C41536l.m120484d(this.f40157e, aVar.f40157e) && C41536l.m120484d(getIcon(), aVar.getIcon()) && C41536l.m120484d(mo36472e(), aVar.mo36472e()) && mo36471d() == aVar.mo36471d() && mo36474f() == aVar.mo36474f();
        }

        /* renamed from: f */
        public boolean mo36474f() {
            return this.f40161i;
        }

        /* renamed from: g */
        public final Amount mo36555g() {
            return this.f40156d;
        }

        public Amount getAmount() {
            return this.f40154b;
        }

        public Image getIcon() {
            return this.f40158f;
        }

        public String getTitle() {
            return this.f40153a;
        }

        /* renamed from: h */
        public final String mo36556h() {
            return this.f40155c;
        }

        public int hashCode() {
            int hashCode = ((((((getTitle().hashCode() * 31) + getAmount().hashCode()) * 31) + this.f40155c.hashCode()) * 31) + this.f40156d.hashCode()) * 31;
            C13472b bVar = this.f40157e;
            int i = 0;
            int hashCode2 = (((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + getIcon().hashCode()) * 31;
            if (mo36472e() != null) {
                i = mo36472e().hashCode();
            }
            int hashCode3 = (((hashCode2 + i) * 31) + mo36471d().hashCode()) * 31;
            boolean f = mo36474f();
            if (f) {
                f = true;
            }
            return hashCode3 + (f ? 1 : 0);
        }

        /* renamed from: i */
        public final C13472b mo36558i() {
            return this.f40157e;
        }

        public String toString() {
            String title = getTitle();
            Amount amount = getAmount();
            String str = this.f40155c;
            Amount amount2 = this.f40156d;
            C13472b bVar = this.f40157e;
            Image icon = getIcon();
            Image e = mo36472e();
            C13473a.C13476b d = mo36471d();
            boolean f = mo36474f();
            return "PiggyBankCard(title=" + title + ", amount=" + amount + ", badgeText=" + str + ", badgeAmount=" + amount2 + ", pauseInfo=" + bVar + ", icon=" + icon + ", backgroundImage=" + e + ", cardTheme=" + d + ", resetThemeOnFailed=" + f + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13471a(java.lang.String r14, p341ge.bog.designsystem.components.Amount r15, java.lang.String r16, p341ge.bog.designsystem.components.Amount r17, p341ge.bog.designsystem.components.productcards.PiggyBankCardView.C13472b r18, p341ge.bog.designsystem.components.common.Image r19, p341ge.bog.designsystem.components.common.Image r20, p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b r21, boolean r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
            /*
                r13 = this;
                r0 = r23
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r8 = r2
                goto L_0x000b
            L_0x0009:
                r8 = r18
            L_0x000b:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0019
                ge.bog.designsystem.components.common.Image$Resource r1 = new ge.bog.designsystem.components.common.Image$Resource
                int r3 = p601sg.C17780e.f49657S
                r4 = 2
                r1.<init>(r3, r2, r4, r2)
                r9 = r1
                goto L_0x001b
            L_0x0019:
                r9 = r19
            L_0x001b:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0021
                r10 = r2
                goto L_0x0023
            L_0x0021:
                r10 = r20
            L_0x0023:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x002b
                ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR
                r11 = r1
                goto L_0x002d
            L_0x002b:
                r11 = r21
            L_0x002d:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0034
                r0 = 1
                r12 = r0
                goto L_0x0036
            L_0x0034:
                r12 = r22
            L_0x0036:
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.productcards.PiggyBankCardView.C13471a.<init>(java.lang.String, ge.bog.designsystem.components.Amount, java.lang.String, ge.bog.designsystem.components.Amount, ge.bog.designsystem.components.productcards.PiggyBankCardView$b, ge.bog.designsystem.components.common.Image, ge.bog.designsystem.components.common.Image, ge.bog.designsystem.components.productcards.basecard.a$b, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
