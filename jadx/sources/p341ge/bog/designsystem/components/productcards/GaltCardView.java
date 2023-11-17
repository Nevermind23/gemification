package p341ge.bog.designsystem.components.productcards;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41238w;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.productcards.basecard.C13473a;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p352ak.C10020t4;
import p352ak.C9884c0;
import p352ak.C9999q4;
import p365bj.C10299a;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.productcards.GaltCardView */
public final class GaltCardView extends C13473a {

    /* renamed from: g */
    protected C10299a f40111g;

    /* renamed from: ge.bog.designsystem.components.productcards.GaltCardView$a */
    public static final class C13459a {

        /* renamed from: a */
        private final String f40112a;

        /* renamed from: b */
        private final boolean f40113b;

        public C13459a(String str, boolean z) {
            C41536l.m120489i(str, "currency");
            this.f40112a = str;
            this.f40113b = z;
        }

        /* renamed from: a */
        public final String mo36519a() {
            return this.f40112a;
        }

        /* renamed from: b */
        public final boolean mo36520b() {
            return this.f40113b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13459a)) {
                return false;
            }
            C13459a aVar = (C13459a) obj;
            return C41536l.m120484d(this.f40112a, aVar.f40112a) && this.f40113b == aVar.f40113b;
        }

        public int hashCode() {
            int hashCode = this.f40112a.hashCode() * 31;
            boolean z = this.f40113b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f40112a;
            boolean z = this.f40113b;
            return "Currency(currency=" + str + ", isActive=" + z + ")";
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.GaltCardView$c */
    public static abstract class C13461c {

        /* renamed from: ge.bog.designsystem.components.productcards.GaltCardView$c$a */
        public static final class C13462a extends C13461c {

            /* renamed from: a */
            private final String f40124a;

            /* renamed from: b */
            private final String f40125b;

            /* renamed from: c */
            private final int f40126c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13462a(String str, String str2, int i) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(str, "badgeTitle");
                C41536l.m120489i(str2, C11755a.C11756a.f34100b);
                this.f40124a = str;
                this.f40125b = str2;
                this.f40126c = i;
            }

            /* renamed from: a */
            public final int mo36528a() {
                return this.f40126c;
            }

            /* renamed from: b */
            public final String mo36529b() {
                return this.f40124a;
            }

            /* renamed from: c */
            public final String mo36530c() {
                return this.f40125b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13462a)) {
                    return false;
                }
                C13462a aVar = (C13462a) obj;
                return C41536l.m120484d(this.f40124a, aVar.f40124a) && C41536l.m120484d(this.f40125b, aVar.f40125b) && this.f40126c == aVar.f40126c;
            }

            public int hashCode() {
                return (((this.f40124a.hashCode() * 31) + this.f40125b.hashCode()) * 31) + this.f40126c;
            }

            public String toString() {
                String str = this.f40124a;
                String str2 = this.f40125b;
                int i = this.f40126c;
                return "BadgeData(badgeTitle=" + str + ", value=" + str2 + ", amount=" + i + ")";
            }
        }

        /* renamed from: ge.bog.designsystem.components.productcards.GaltCardView$c$b */
        public static final class C13463b extends C13461c {

            /* renamed from: a */
            private final List f40127a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13463b(List list) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(list, "currencies");
                this.f40127a = list;
            }

            /* renamed from: a */
            public final List mo36534a() {
                return this.f40127a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13463b) && C41536l.m120484d(this.f40127a, ((C13463b) obj).f40127a);
            }

            public int hashCode() {
                return this.f40127a.hashCode();
            }

            public String toString() {
                List list = this.f40127a;
                return "CurrenciesData(currencies=" + list + ")";
            }
        }

        private C13461c() {
        }

        public /* synthetic */ C13461c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.productcards.GaltCardView$d */
    public /* synthetic */ class C13464d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40128a;

        static {
            int[] iArr = new int[C13473a.C13474a.values().length];
            try {
                iArr[C13473a.C13474a.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f40128a = iArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GaltCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: b */
    private final View m50531b(C13461c.C13462a aVar) {
        C9884c0 d = C9884c0.m36254d(LayoutInflater.from(getContext()), this, false);
        TextBadgeView textBadgeView = d.f26834f;
        textBadgeView.setBadgeText(aVar.mo36529b());
        textBadgeView.setBadgeSecondText(aVar.mo36530c());
        d.f26833e.setBadgeText(String.valueOf(aVar.mo36528a()));
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "inflate(\n            Lay…toString()\n        }.root");
        return c;
    }

    /* renamed from: c */
    private final View m50532c(C13461c.C13463b bVar) {
        if (!(!bVar.mo36534a().isEmpty())) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        LayoutInflater from = LayoutInflater.from(getContext());
        for (C13459a aVar : bVar.mo36534a()) {
            String a = aVar.mo36519a();
            boolean b = aVar.mo36520b();
            C9999q4 d = C9999q4.m36674d(from, linearLayout, true);
            C41536l.m120488h(d, "inflate(\n               …   true\n                )");
            InfoBadgeView infoBadgeView = d.f27434e;
            C41536l.m120488h(infoBadgeView, "getCurrenciesLayout$lambda$6$lambda$5");
            InfoBadgeView.m50233e(infoBadgeView, (String) null, (String) null, a, 3, (Object) null);
            infoBadgeView.setEnabled(b);
            if (getCardTheme() == C13473a.C13476b.WHITE) {
                infoBadgeView.setType(InfoBadgeView.C13346b.ACCOUNT_CURRENCY_BADGE_WHITE);
            } else {
                infoBadgeView.setType(InfoBadgeView.C13346b.ACCOUNT_CURRENCY_BADGE_BLACK);
            }
        }
        return linearLayout;
    }

    private final void setGaltCardInfoData(C13461c cVar) {
        C41238w wVar;
        View view;
        if (getCardShape() instanceof C10299a.C10307c) {
            if (cVar != null) {
                if (cVar instanceof C13461c.C13462a) {
                    view = m50531b((C13461c.C13462a) cVar);
                } else if (cVar instanceof C13461c.C13463b) {
                    view = m50532c((C13461c.C13463b) cVar);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                getCardShape().mo26912j(view);
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
        if (getCardTheme() != C13473a.C13476b.CLEAR && getCardTheme() != C13473a.C13476b.COLOR) {
            C13473a.C13476b cardTheme = getCardTheme();
            throw new IllegalArgumentException("Galt card doesn't support theme:" + cardTheme);
        }
    }

    /* access modifiers changed from: protected */
    public C10299a getCardShape() {
        C10299a aVar = this.f40111g;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("cardShape");
        return null;
    }

    /* access modifiers changed from: protected */
    public void setCardShape(C10299a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f40111g = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GaltCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setData(C13460b bVar) {
        C41536l.m120489i(bVar, "data");
        super.setData(bVar);
        setGaltCardInfoData(bVar.mo36525g());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GaltCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        int[] iArr = C17787l.f50556u5;
        C41536l.m120488h(iArr, "GaltCardView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50571v5, 0);
        String string = obtainStyledAttributes.getString(C17787l.f50601x5);
        LayoutInflater from = LayoutInflater.from(context);
        if (C13464d.f40128a[C13473a.C13474a.f40170e.mo36571a(i2).ordinal()] == 1) {
            C10020t4 d = C10020t4.m36752d(from, this, true);
            C41536l.m120488h(d, "inflate(layoutInflater, this@GaltCardView, true)");
            setCardShape(new C10299a.C10307c(d));
            getCardShape().mo26919r(string);
            setCardTheme(C13473a.C13476b.f40176k.mo36579a(obtainStyledAttributes.getInt(C17787l.f50586w5, C13473a.C13476b.COLOR.mo36576g())));
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException("Unknown card shape");
    }

    /* renamed from: ge.bog.designsystem.components.productcards.GaltCardView$b */
    public static final class C13460b implements C13473a.C13479d {

        /* renamed from: a */
        private final String f40114a;

        /* renamed from: b */
        private final Amount f40115b;

        /* renamed from: c */
        private final boolean f40116c;

        /* renamed from: d */
        private final C13473a.C13476b f40117d;

        /* renamed from: e */
        private final C13461c f40118e;

        /* renamed from: f */
        private final boolean f40119f;

        /* renamed from: g */
        private final List f40120g;

        /* renamed from: h */
        private final List f40121h;

        /* renamed from: i */
        private final Image f40122i;

        /* renamed from: j */
        private final Image f40123j;

        public C13460b(String str, Amount amount, boolean z, C13473a.C13476b bVar, C13461c cVar, boolean z2) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(amount, "amount");
            C41536l.m120489i(bVar, "cardTheme");
            this.f40114a = str;
            this.f40115b = amount;
            this.f40116c = z;
            this.f40117d = bVar;
            this.f40118e = cVar;
            this.f40119f = z2;
        }

        /* renamed from: a */
        public boolean mo36468a() {
            return this.f40116c;
        }

        /* renamed from: b */
        public List mo36469b() {
            return this.f40120g;
        }

        /* renamed from: c */
        public List mo36470c() {
            return this.f40121h;
        }

        /* renamed from: d */
        public C13473a.C13476b mo36471d() {
            return this.f40117d;
        }

        /* renamed from: e */
        public Image mo36472e() {
            return this.f40122i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13460b)) {
                return false;
            }
            C13460b bVar = (C13460b) obj;
            return C41536l.m120484d(getTitle(), bVar.getTitle()) && C41536l.m120484d(getAmount(), bVar.getAmount()) && mo36468a() == bVar.mo36468a() && mo36471d() == bVar.mo36471d() && C41536l.m120484d(this.f40118e, bVar.f40118e) && mo36474f() == bVar.mo36474f();
        }

        /* renamed from: f */
        public boolean mo36474f() {
            return this.f40119f;
        }

        /* renamed from: g */
        public final C13461c mo36525g() {
            return this.f40118e;
        }

        public Amount getAmount() {
            return this.f40115b;
        }

        public Image getIcon() {
            return this.f40123j;
        }

        public String getTitle() {
            return this.f40114a;
        }

        public int hashCode() {
            int hashCode = ((getTitle().hashCode() * 31) + getAmount().hashCode()) * 31;
            boolean a = mo36468a();
            boolean z = true;
            if (a) {
                a = true;
            }
            int hashCode2 = (((hashCode + (a ? 1 : 0)) * 31) + mo36471d().hashCode()) * 31;
            C13461c cVar = this.f40118e;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            boolean f = mo36474f();
            if (!f) {
                z = f;
            }
            return hashCode3 + (z ? 1 : 0);
        }

        public String toString() {
            String title = getTitle();
            Amount amount = getAmount();
            boolean a = mo36468a();
            C13473a.C13476b d = mo36471d();
            C13461c cVar = this.f40118e;
            boolean f = mo36474f();
            return "GaltCard(title=" + title + ", amount=" + amount + ", isBadgeVisible=" + a + ", cardTheme=" + d + ", galtCardInfoData=" + cVar + ", resetThemeOnFailed=" + f + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C13460b(String str, Amount amount, boolean z, C13473a.C13476b bVar, C13461c cVar, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, amount, (i & 4) != 0 ? false : z, bVar, (i & 16) != 0 ? null : cVar, (i & 32) != 0 ? true : z2);
        }
    }
}
