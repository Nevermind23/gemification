package p341ge.bog.designsystem.components.creditcardsmallpicker;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C1314o;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C9997q2;
import p601sg.C17779d;
import p601sg.C17780e;
import p601sg.C17785j;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18377p;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView */
public final class CreditCardSmallPickerView extends ConstraintLayout {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f39250n;

    /* renamed from: d */
    private final C9997q2 f39251d;

    /* renamed from: e */
    private final C18377p f39252e;

    /* renamed from: f */
    private final C18355e0 f39253f;

    /* renamed from: g */
    private final C18365j0 f39254g;

    /* renamed from: h */
    private final C18365j0 f39255h;

    /* renamed from: i */
    private final C18365j0 f39256i;

    /* renamed from: j */
    private C13282c f39257j;

    /* renamed from: k */
    private C13279b f39258k;

    /* renamed from: l */
    private String f39259l;

    /* renamed from: m */
    private C13278a f39260m;

    /* renamed from: ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$a */
    public enum C13278a {
        WITH_IMAGE(0),
        WITHOUT_IMAGE(8);
        

        /* renamed from: d */
        private final int f39264d;

        private C13278a(int i) {
            this.f39264d = i;
        }

        /* renamed from: b */
        public final int mo35472b() {
            return this.f39264d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b */
    public static abstract class C13279b {

        /* renamed from: ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$a */
        public static final class C13280a extends C13279b {

            /* renamed from: a */
            public static final C13280a f39265a = new C13280a();

            private C13280a() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$b$b */
        public static final class C13281b extends C13279b {

            /* renamed from: a */
            private final String f39266a;

            /* renamed from: b */
            private final Integer f39267b;

            /* renamed from: c */
            private final String f39268c;

            /* renamed from: d */
            private final boolean f39269d;

            /* renamed from: e */
            private final String f39270e;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C13281b(String str, Integer num, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, num, str2, z, (i & 16) != 0 ? null : str3);
            }

            /* renamed from: a */
            public final String mo35473a() {
                return this.f39270e;
            }

            /* renamed from: b */
            public final String mo35474b() {
                return this.f39268c;
            }

            /* renamed from: c */
            public final Integer mo35475c() {
                return this.f39267b;
            }

            /* renamed from: d */
            public final String mo35476d() {
                return this.f39266a;
            }

            /* renamed from: e */
            public final boolean mo35477e() {
                return this.f39269d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13281b)) {
                    return false;
                }
                C13281b bVar = (C13281b) obj;
                return C41536l.m120484d(this.f39266a, bVar.f39266a) && C41536l.m120484d(this.f39267b, bVar.f39267b) && C41536l.m120484d(this.f39268c, bVar.f39268c) && this.f39269d == bVar.f39269d && C41536l.m120484d(this.f39270e, bVar.f39270e);
            }

            public int hashCode() {
                String str = this.f39266a;
                int i = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Integer num = this.f39267b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str2 = this.f39268c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                boolean z = this.f39269d;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
                String str3 = this.f39270e;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return i2 + i;
            }

            public String toString() {
                String str = this.f39266a;
                Integer num = this.f39267b;
                String str2 = this.f39268c;
                boolean z = this.f39269d;
                String str3 = this.f39270e;
                return "Selected(imageLink=" + str + ", image=" + num + ", cardName=" + str2 + ", isFavorite=" + z + ", cardId=" + str3 + ")";
            }

            public C13281b(String str, Integer num, String str2, boolean z, String str3) {
                super((DefaultConstructorMarker) null);
                this.f39266a = str;
                this.f39267b = num;
                this.f39268c = str2;
                this.f39269d = z;
                this.f39270e = str3;
            }
        }

        private C13279b() {
        }

        public /* synthetic */ C13279b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView$c */
    public static final class C13282c {

        /* renamed from: a */
        private String f39271a;

        /* renamed from: b */
        private final String f39272b;

        public C13282c(String str, String str2) {
            this.f39271a = str;
            this.f39272b = str2;
        }

        /* renamed from: a */
        public final String mo35481a() {
            return this.f39271a;
        }

        /* renamed from: b */
        public final String mo35482b() {
            return this.f39272b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13282c)) {
                return false;
            }
            C13282c cVar = (C13282c) obj;
            return C41536l.m120484d(this.f39271a, cVar.f39271a) && C41536l.m120484d(this.f39272b, cVar.f39272b);
        }

        public int hashCode() {
            String str = this.f39271a;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f39272b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            String str = this.f39271a;
            String str2 = this.f39272b;
            return "CreditCardSmallPickerTitle(emptyTitle=" + str + ", selectedTitle=" + str2 + ")";
        }
    }

    static {
        Class<CreditCardSmallPickerView> cls = CreditCardSmallPickerView.class;
        f39250n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "icon", "getIcon()Ljava/lang/Integer;", 0)), C41520a0.m120439e(new C41539o(cls, "cardName", "getCardName()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "titleVisibility", "getTitleVisibility()Z", 0)), C41520a0.m120439e(new C41539o(cls, "starImageVisibility", "getStarImageVisibility()Z", 0)), C41520a0.m120439e(new C41539o(cls, "cardNameVisibility", "getCardNameVisibility()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreditCardSmallPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final CharSequence getCardName() {
        return this.f39253f.getValue(this, f39250n[1]);
    }

    private final boolean getCardNameVisibility() {
        return this.f39256i.getValue(this, f39250n[4]).booleanValue();
    }

    private final Integer getIcon() {
        return this.f39252e.getValue(this, f39250n[0]);
    }

    private final boolean getStarImageVisibility() {
        return this.f39255h.getValue(this, f39250n[3]).booleanValue();
    }

    private final boolean getTitleVisibility() {
        return this.f39254g.getValue(this, f39250n[2]).booleanValue();
    }

    /* renamed from: i */
    private final void m49983i(C13278a aVar) {
        this.f39251d.f27425f.setVisibility(aVar.mo35472b());
    }

    /* renamed from: j */
    private final boolean m49984j(C13279b bVar) {
        return C41536l.m120484d(bVar, C13279b.C13280a.f39265a);
    }

    /* renamed from: k */
    private final void m49985k(String str) {
        ((C2394j) C2379b.m9210t(getContext()).mo7757y(str).mo7220c0(C17780e.ic_credit_card_empty)).mo7718L0(this.f39251d.f27425f);
    }

    private final void setCardName(CharSequence charSequence) {
        this.f39253f.setValue(this, f39250n[1], charSequence);
    }

    private final void setCardNameVisibility(boolean z) {
        this.f39256i.mo46151c(this, f39250n[4], z);
    }

    private final void setIcon(Integer num) {
        this.f39252e.setValue(this, f39250n[0], num);
    }

    private final void setStarImageVisibility(boolean z) {
        this.f39255h.mo46151c(this, f39250n[3], z);
    }

    private final void setTitleVisibility(boolean z) {
        this.f39254g.mo46151c(this, f39250n[2], z);
    }

    public final C13278a getCreditCardPickerType() {
        return this.f39260m;
    }

    public final String getSelectedCardId() {
        C13279b bVar = this.f39258k;
        C13279b.C13281b bVar2 = bVar instanceof C13279b.C13281b ? (C13279b.C13281b) bVar : null;
        if (bVar2 != null) {
            return bVar2.mo35473a();
        }
        return null;
    }

    public final String getTitleText() {
        return this.f39259l;
    }

    /* renamed from: h */
    public final void mo35468h(C13282c cVar) {
        String str;
        C41536l.m120489i(cVar, "newTitle");
        this.f39257j = cVar;
        C13282c cVar2 = null;
        if (m49984j(this.f39258k)) {
            C13282c cVar3 = this.f39257j;
            if (cVar3 == null) {
                C41536l.m120506z("title");
            } else {
                cVar2 = cVar3;
            }
            str = cVar2.mo35481a();
        } else {
            C13282c cVar4 = this.f39257j;
            if (cVar4 == null) {
                C41536l.m120506z("title");
            } else {
                cVar2 = cVar4;
            }
            str = cVar2.mo35482b();
        }
        if (str != null) {
            setTitleText(str);
        }
    }

    public final void setCreditCard(C13279b bVar) {
        C41536l.m120489i(bVar, "creditCard");
        this.f39258k = bVar;
        ViewGroup.LayoutParams layoutParams = this.f39251d.f27428i.getLayoutParams();
        C41536l.m120487g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0620b bVar2 = (ConstraintLayout.C0620b) layoutParams;
        C13282c cVar = null;
        if (C41536l.m120484d(bVar, C13279b.C13280a.f39265a)) {
            setIcon(Integer.valueOf(C17780e.ic_credit_card_empty));
            C13282c cVar2 = this.f39257j;
            if (cVar2 == null) {
                C41536l.m120506z("title");
            } else {
                cVar = cVar2;
            }
            String a = cVar.mo35481a();
            if (a == null) {
                a = getContext().getString(C17785j.choose_deposit_account);
            }
            setTitleText(a);
            setStarImageVisibility(false);
            setCardNameVisibility(false);
            C1314o.m4575q(this.f39251d.f27428i, C17786k.TextSmallButtonInvertComponents500Left);
            bVar2.topMargin = 0;
        } else if (bVar instanceof C13279b.C13281b) {
            C13279b.C13281b bVar3 = (C13279b.C13281b) bVar;
            if (bVar3.mo35476d() != null) {
                m49985k(bVar3.mo35476d());
            } else {
                setIcon(bVar3.mo35475c());
            }
            C13282c cVar3 = this.f39257j;
            if (cVar3 == null) {
                C41536l.m120506z("title");
            } else {
                cVar = cVar3;
            }
            String b = cVar.mo35482b();
            if (b == null) {
                b = getContext().getString(C17785j.deposit_account);
            }
            setTitleText(b);
            C1314o.m4575q(this.f39251d.f27428i, C17786k.TextCaption1InvertComponents200Left);
            setCardName(bVar3.mo35474b());
            setCardNameVisibility(true);
            setTitleVisibility(true);
            setStarImageVisibility(bVar3.mo35477e());
            bVar2.topMargin = getResources().getDimensionPixelSize(C17779d.spacing_12);
        }
    }

    public final void setCreditCardPickerType(C13278a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f39260m = aVar;
        m49983i(aVar);
    }

    public final void setTitleText(String str) {
        boolean z;
        this.f39259l = str;
        this.f39251d.f27428i.setText(str);
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        setTitleVisibility(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditCardSmallPickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreditCardSmallPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9997q2 d = C9997q2.m36667d(LayoutInflater.from(context), this, true);
        C41536l.m120488h(d, "inflate(\n            Lay…xt), this, true\n        )");
        this.f39251d = d;
        AppCompatImageView appCompatImageView = d.f27425f;
        C41536l.m120488h(appCompatImageView, "binding.cardImage");
        this.f39252e = new C18377p(appCompatImageView);
        AppCompatTextView appCompatTextView = d.f27424e;
        C41536l.m120488h(appCompatTextView, "binding.bottomText");
        this.f39253f = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = d.f27428i;
        C41536l.m120488h(appCompatTextView2, "binding.topText");
        this.f39254g = new C18365j0(appCompatTextView2, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView2 = d.f27427h;
        C41536l.m120488h(appCompatImageView2, "binding.starImage");
        this.f39255h = new C18365j0(appCompatImageView2, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView3 = d.f27424e;
        C41536l.m120488h(appCompatTextView3, "binding.bottomText");
        this.f39256i = new C18365j0(appCompatTextView3, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        C13279b.C13280a aVar = C13279b.C13280a.f39265a;
        this.f39258k = aVar;
        C13278a aVar2 = C13278a.WITH_IMAGE;
        this.f39260m = aVar2;
        int[] iArr = C17787l.f50614y3;
        C41536l.m120488h(iArr, "CreditCardSmallPickerView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50629z3, 0);
        if (i2 != 0) {
            if (i2 == 1) {
                aVar2 = C13278a.WITHOUT_IMAGE;
            } else {
                throw new IllegalStateException("Unknown type");
            }
        }
        setCreditCardPickerType(aVar2);
        this.f39257j = new C13282c(obtainStyledAttributes.getString(C17787l.f49844A3), obtainStyledAttributes.getString(C17787l.f49859B3));
        obtainStyledAttributes.recycle();
        setCreditCard(aVar);
    }
}
