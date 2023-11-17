package p341ge.bog.designsystem.components.creditcard;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import he1.C41217g;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C10011s2;
import p561pi.C17365a;
import p561pi.C17367b;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17785j;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17961b;
import p642vh.C18365j0;
import p642vh.C18368l;
import p669xh.C18763a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.creditcard.CreditCardView */
public final class CreditCardView extends ConstraintLayout implements View.OnClickListener {

    /* renamed from: i */
    public static final C13269a f39217i = new C13269a((DefaultConstructorMarker) null);

    /* renamed from: j */
    static final /* synthetic */ C40303i[] f39218j;

    /* renamed from: d */
    private final C10011s2 f39219d;

    /* renamed from: e */
    private final C41217g f39220e;

    /* renamed from: f */
    private final C18365j0 f39221f;

    /* renamed from: g */
    private final C18365j0 f39222g;

    /* renamed from: h */
    private C13270b f39223h;

    /* renamed from: ge.bog.designsystem.components.creditcard.CreditCardView$a */
    public static final class C13269a {
        private C13269a() {
        }

        public /* synthetic */ C13269a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.creditcard.CreditCardView$c */
    public interface C13271c {
    }

    /* renamed from: ge.bog.designsystem.components.creditcard.CreditCardView$d */
    public enum C13272d {
        ENABLE(new Color.Resource(17170445)),
        PRESSED(new Color.Attribute(C17777b.color_black_tr_25)),
        ACTIVE(new Color.Attribute(C17777b.color_white_tr_100));
        

        /* renamed from: d */
        private final Color f39240d;

        private C13272d(Color color) {
            this.f39240d = color;
        }

        /* renamed from: b */
        public final Color mo35457b() {
            return this.f39240d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.creditcard.CreditCardView$e */
    public enum C13273e {
        BLACK,
        WHITE
    }

    /* renamed from: ge.bog.designsystem.components.creditcard.CreditCardView$f */
    public /* synthetic */ class C13274f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39244a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ge.bog.designsystem.components.creditcard.CreditCardView$e[] r0 = p341ge.bog.designsystem.components.creditcard.CreditCardView.C13273e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.designsystem.components.creditcard.CreditCardView$e r1 = p341ge.bog.designsystem.components.creditcard.CreditCardView.C13273e.WHITE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.designsystem.components.creditcard.CreditCardView$e r1 = p341ge.bog.designsystem.components.creditcard.CreditCardView.C13273e.BLACK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f39244a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.creditcard.CreditCardView.C13274f.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.creditcard.CreditCardView$g */
    static final class C13275g extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13275g f39245d = new C13275g();

        C13275g() {
            super(0);
        }

        /* renamed from: b */
        public final C17367b invoke() {
            C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            bVar.mo44810m("###,##0.00");
            return bVar;
        }
    }

    static {
        Class<CreditCardView> cls = CreditCardView.class;
        f39218j = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "isBadgeActive", "isBadgeActive()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isChevronEnable", "isChevronEnable()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreditCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final C17365a getNumeralFormatter() {
        return (C17365a) this.f39220e.getValue();
    }

    /* renamed from: h */
    private final void m49955h() {
        TextView textView = this.f39219d.f27508q;
        textView.setVisibility(8);
        textView.setText("");
        Button button = this.f39219d.f27501j;
        Context context = textView.getContext();
        C41536l.m120488h(context, "context");
        button.setButtonIconTint(ColorStateList.valueOf(C18368l.m62755d(context, C17777b.f49590A)));
    }

    /* renamed from: j */
    private final void m49956j() {
        setCreditCardContentVisibility(8);
        setCreditCardChevronEnable(true);
        setBadgeActive(false);
        setClickable(true);
        Button button = this.f39219d.f27501j;
        Context context = getContext();
        C41536l.m120488h(context, "context");
        button.setButtonIconTint(ColorStateList.valueOf(C18368l.m62755d(context, C17777b.f49597m)));
        this.f39219d.f27504m.setBackgroundColor(C0767a.m2893c(getContext(), C17778c.f49638w));
    }

    /* renamed from: k */
    private final void m49957k(String str, String str2) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C17365a numeralFormatter = getNumeralFormatter();
            String a = C17961b.f51154a.mo45631a(str2);
            numeralFormatter.mo44801a(" " + a);
            this.f39219d.f27499h.setText(getNumeralFormatter().mo44804d(str));
        }
    }

    /* renamed from: l */
    private final void m49958l() {
        setFocusable(true);
        setClickable(true);
    }

    private final void setBadgeActive(boolean z) {
        this.f39221f.mo46151c(this, f39218j[0], z);
    }

    private final void setChevronEnable(boolean z) {
        this.f39222g.mo46151c(this, f39218j[1], z);
    }

    private final void setCreditCardChevronEnable(boolean z) {
        setChevronEnable(z);
    }

    private final void setCreditCardContentVisibility(int i) {
        C10011s2 s2Var = this.f39219d;
        s2Var.f27500i.setVisibility(i);
        s2Var.f27506o.setVisibility(i);
        s2Var.f27496e.setVisibility(i);
        s2Var.f27503l.setVisibility(i);
        s2Var.f27507p.setVisibility(i);
    }

    private final void setCreditCardExpireDate(String str) {
        this.f39219d.f27503l.setText(str);
    }

    private final void setCreditCardTitle(String str) {
        this.f39219d.f27506o.setText(str);
    }

    private final void setCreditCardType(C18763a aVar) {
        this.f39219d.f27507p.setCards((List<? extends C18763a>) C41339p.m119900e(aVar));
    }

    private final void setLastFourDigits(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C10011s2 s2Var = this.f39219d;
            s2Var.f27499h.setText(s2Var.mo3946b().getContext().getString(C17785j.ds_last_four_digits, new Object[]{str}));
        }
    }

    private final void setTheme(C13273e eVar) {
        int i = C13274f.f39244a[eVar.ordinal()];
        if (i == 1) {
            C1314o.m4575q(this.f39219d.f27506o, C17786k.TextOverline2White500Left);
            C1314o.m4575q(this.f39219d.f27499h, C17786k.TextH4White500Left);
            C1314o.m4575q(this.f39219d.f27503l, C17786k.TextBody2White500Left);
            Button button = this.f39219d.f27501j;
            Context context = getContext();
            C41536l.m120488h(context, "context");
            button.setButtonIconTint(ColorStateList.valueOf(C18368l.m62755d(context, C17777b.f49590A)));
        } else if (i == 2) {
            C1314o.m4575q(this.f39219d.f27506o, C17786k.TextOverline2Black400Left);
            C1314o.m4575q(this.f39219d.f27499h, C17786k.f49826S0);
            C1314o.m4575q(this.f39219d.f27503l, C17786k.TextBody2Black400Left);
            Button button2 = this.f39219d.f27501j;
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            button2.setButtonIconTint(ColorStateList.valueOf(C18368l.m62755d(context2, C17777b.f49601r)));
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        Color color;
        super.drawableStateChanged();
        LayerView layerView = this.f39219d.f27504m;
        int[] drawableState = getDrawableState();
        C41536l.m120488h(drawableState, "drawableState");
        if (C41333m.m119793r(drawableState, 16843518)) {
            color = C13272d.ACTIVE.mo35457b();
        } else {
            int[] drawableState2 = getDrawableState();
            C41536l.m120488h(drawableState2, "drawableState");
            if (C41333m.m119793r(drawableState2, 16842919)) {
                int[] drawableState3 = getDrawableState();
                C41536l.m120488h(drawableState3, "drawableState");
                if (C41333m.m119793r(drawableState3, 16842910)) {
                    color = C13272d.PRESSED.mo35457b();
                }
            }
            int[] drawableState4 = getDrawableState();
            C41536l.m120488h(drawableState4, "drawableState");
            if (C41333m.m119793r(drawableState4, 16842910)) {
                color = C13272d.ENABLE.mo35457b();
            } else {
                color = C13272d.ENABLE.mo35457b();
            }
        }
        Context context = getContext();
        C41536l.m120488h(context, "context");
        layerView.setForeground(new ColorDrawable(color.mo35260a(context)));
    }

    /* renamed from: i */
    public final void mo35429i() {
        C10011s2 s2Var = this.f39219d;
        s2Var.f27504m.setBackgroundResource(C17780e.shape_card_neutral);
        s2Var.f27502k.setVisibility(8);
        s2Var.f27502k.setText("");
    }

    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int id = getId();
        if (num == null || num.intValue() != id) {
            this.f39219d.f27501j.getId();
            if (num != null) {
                num.intValue();
            }
        }
    }

    public final void setCreditCard(C13270b bVar) {
        if (bVar == null) {
            m49956j();
            return;
        }
        m49955h();
        setCreditCardContentVisibility(0);
        this.f39223h = bVar;
        setCreditCardTitle(bVar.mo35450j());
        m49957k(bVar.mo35439a(), bVar.mo35440b());
        setCreditCardExpireDate(bVar.mo35445f());
        setCreditCardType(bVar.mo35443e());
        setCreditCardBackgroundRes(bVar.mo35441c());
        setCreditCardBackgroundUrl(bVar.mo35442d());
        setCreditCardActive(bVar.mo35451k());
        setCreditCardChevronEnable(bVar.mo35452l());
        setTheme(bVar.mo35449i());
        setLastFourDigits(bVar.mo35447h());
    }

    public final void setCreditCardActive(boolean z) {
        C13270b bVar = this.f39223h;
        if (bVar != null) {
            bVar.mo35453m(z);
        }
        setActivated(z);
        setBadgeActive(z);
    }

    public final void setCreditCardBackgroundDrawable(Drawable drawable) {
        this.f39219d.f27500i.setImageDrawable(drawable);
    }

    public final void setCreditCardBackgroundRes(int i) {
        if (i != 0) {
            C13270b bVar = this.f39223h;
            if (bVar != null) {
                bVar.mo35454n(i);
            }
            this.f39219d.f27500i.setImageResource(i);
        }
    }

    public final void setCreditCardBackgroundUrl(String str) {
        if (str != null) {
            C13270b bVar = this.f39223h;
            if (bVar != null) {
                bVar.mo35455o(str);
            }
            ((C2394j) C2379b.m9210t(getContext()).mo7757y(str).mo7219c()).mo7718L0(this.f39219d.f27500i);
        }
    }

    public final void setEmptyCreditCardText(String str) {
        C41536l.m120489i(str, "message");
        TextView textView = this.f39219d.f27508q;
        textView.setVisibility(0);
        textView.setText(str);
    }

    public final void setErrorState(String str) {
        C41536l.m120489i(str, "message");
        C10011s2 s2Var = this.f39219d;
        s2Var.f27502k.setVisibility(0);
        s2Var.f27502k.setText(str);
        s2Var.f27504m.setBackgroundResource(C17780e.shape_card_negative);
    }

    public final void setOnCreditCardEventListener(C13271c cVar) {
        setOnClickListener(this);
        this.f39219d.f27501j.setOnClickListener(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreditCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C10011s2 c = C10011s2.m36720c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39219d = c;
        this.f39220e = C41219i.m119470b(C13275g.f39245d);
        NotificationBadgeView notificationBadgeView = c.f27498g;
        C41536l.m120488h(notificationBadgeView, "binding.creditCardActiveBadge");
        this.f39221f = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        Button button = c.f27501j;
        C41536l.m120488h(button, "binding.creditCardChevronImage");
        this.f39222g = new C18365j0(button, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        m49956j();
        int[] iArr = C17787l.f49874C3;
        C41536l.m120488h(iArr, "CreditCardView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f49889D3, 0);
        String string = obtainStyledAttributes.getString(C17787l.f49904E3);
        setCreditCardBackgroundRes(resourceId);
        setEmptyCreditCardText(string == null ? "" : string);
        obtainStyledAttributes.recycle();
        m49958l();
    }

    /* renamed from: ge.bog.designsystem.components.creditcard.CreditCardView$b */
    public static final class C13270b {

        /* renamed from: a */
        private final String f39224a;

        /* renamed from: b */
        private String f39225b;

        /* renamed from: c */
        private String f39226c;

        /* renamed from: d */
        private String f39227d;

        /* renamed from: e */
        private String f39228e;

        /* renamed from: f */
        private C18763a f39229f;

        /* renamed from: g */
        private int f39230g;

        /* renamed from: h */
        private String f39231h;

        /* renamed from: i */
        private boolean f39232i;

        /* renamed from: j */
        private boolean f39233j;

        /* renamed from: k */
        private C13273e f39234k;

        /* renamed from: l */
        private String f39235l;

        public C13270b(String str, String str2, String str3, String str4, String str5, C18763a aVar, int i, String str6, boolean z, boolean z2, C13273e eVar, String str7) {
            C41536l.m120489i(str, "id");
            C41536l.m120489i(str2, "title");
            C41536l.m120489i(str3, "amount");
            C41536l.m120489i(str4, "amountSuffix");
            C41536l.m120489i(str5, "expireDate");
            C41536l.m120489i(aVar, "cardType");
            C41536l.m120489i(eVar, "themeType");
            C41536l.m120489i(str7, "lastFourDigits");
            this.f39224a = str;
            this.f39225b = str2;
            this.f39226c = str3;
            this.f39227d = str4;
            this.f39228e = str5;
            this.f39229f = aVar;
            this.f39230g = i;
            this.f39231h = str6;
            this.f39232i = z;
            this.f39233j = z2;
            this.f39234k = eVar;
            this.f39235l = str7;
        }

        /* renamed from: a */
        public final String mo35439a() {
            return this.f39226c;
        }

        /* renamed from: b */
        public final String mo35440b() {
            return this.f39227d;
        }

        /* renamed from: c */
        public final int mo35441c() {
            return this.f39230g;
        }

        /* renamed from: d */
        public final String mo35442d() {
            return this.f39231h;
        }

        /* renamed from: e */
        public final C18763a mo35443e() {
            return this.f39229f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C13270b)) {
                return false;
            }
            C13270b bVar = (C13270b) obj;
            return C41536l.m120484d(this.f39224a, bVar.f39224a) && C41536l.m120484d(this.f39225b, bVar.f39225b) && C41536l.m120484d(this.f39226c, bVar.f39226c) && C41536l.m120484d(this.f39227d, bVar.f39227d) && C41536l.m120484d(this.f39228e, bVar.f39228e) && this.f39229f == bVar.f39229f && this.f39230g == bVar.f39230g && C41536l.m120484d(this.f39231h, bVar.f39231h) && this.f39232i == bVar.f39232i && this.f39233j == bVar.f39233j && this.f39234k == bVar.f39234k && C41536l.m120484d(this.f39235l, bVar.f39235l);
        }

        /* renamed from: f */
        public final String mo35445f() {
            return this.f39228e;
        }

        /* renamed from: g */
        public final String mo35446g() {
            return this.f39224a;
        }

        /* renamed from: h */
        public final String mo35447h() {
            return this.f39235l;
        }

        public int hashCode() {
            int hashCode = ((((((((((((this.f39224a.hashCode() * 31) + this.f39225b.hashCode()) * 31) + this.f39226c.hashCode()) * 31) + this.f39227d.hashCode()) * 31) + this.f39228e.hashCode()) * 31) + this.f39229f.hashCode()) * 31) + this.f39230g) * 31;
            String str = this.f39231h;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f39232i;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f39233j;
            if (!z3) {
                z2 = z3;
            }
            return ((((i + (z2 ? 1 : 0)) * 31) + this.f39234k.hashCode()) * 31) + this.f39235l.hashCode();
        }

        /* renamed from: i */
        public final C13273e mo35449i() {
            return this.f39234k;
        }

        /* renamed from: j */
        public final String mo35450j() {
            return this.f39225b;
        }

        /* renamed from: k */
        public final boolean mo35451k() {
            return this.f39232i;
        }

        /* renamed from: l */
        public final boolean mo35452l() {
            return this.f39233j;
        }

        /* renamed from: m */
        public final void mo35453m(boolean z) {
            this.f39232i = z;
        }

        /* renamed from: n */
        public final void mo35454n(int i) {
            this.f39230g = i;
        }

        /* renamed from: o */
        public final void mo35455o(String str) {
            this.f39231h = str;
        }

        public String toString() {
            String str = this.f39224a;
            String str2 = this.f39225b;
            String str3 = this.f39226c;
            String str4 = this.f39227d;
            String str5 = this.f39228e;
            C18763a aVar = this.f39229f;
            int i = this.f39230g;
            String str6 = this.f39231h;
            boolean z = this.f39232i;
            boolean z2 = this.f39233j;
            C13273e eVar = this.f39234k;
            String str7 = this.f39235l;
            return "CreditCard(id=" + str + ", title=" + str2 + ", amount=" + str3 + ", amountSuffix=" + str4 + ", expireDate=" + str5 + ", cardType=" + aVar + ", backgroundResId=" + i + ", backgroundUrl=" + str6 + ", isActive=" + z + ", isChevronEnable=" + z2 + ", themeType=" + eVar + ", lastFourDigits=" + str7 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C13270b(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, p669xh.C18763a r22, int r23, java.lang.String r24, boolean r25, boolean r26, p341ge.bog.designsystem.components.creditcard.CreditCardView.C13273e r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
            /*
                r16 = this;
                r0 = r29
                r1 = r0 & 1
                if (r1 == 0) goto L_0x0015
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r4 = r1
                goto L_0x0017
            L_0x0015:
                r4 = r17
            L_0x0017:
                r1 = r0 & 4
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x001f
                r6 = r2
                goto L_0x0021
            L_0x001f:
                r6 = r19
            L_0x0021:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0027
                r7 = r2
                goto L_0x0029
            L_0x0027:
                r7 = r20
            L_0x0029:
                r1 = r0 & 64
                r3 = 0
                if (r1 == 0) goto L_0x0030
                r10 = r3
                goto L_0x0032
            L_0x0030:
                r10 = r23
            L_0x0032:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0039
                r1 = 0
                r11 = r1
                goto L_0x003b
            L_0x0039:
                r11 = r24
            L_0x003b:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0041
                r12 = r3
                goto L_0x0043
            L_0x0041:
                r12 = r25
            L_0x0043:
                r0 = r0 & 2048(0x800, float:2.87E-42)
                if (r0 == 0) goto L_0x0049
                r15 = r2
                goto L_0x004b
            L_0x0049:
                r15 = r28
            L_0x004b:
                r3 = r16
                r5 = r18
                r8 = r21
                r9 = r22
                r13 = r26
                r14 = r27
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.creditcard.CreditCardView.C13270b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, xh.a, int, java.lang.String, boolean, boolean, ge.bog.designsystem.components.creditcard.CreditCardView$e, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
