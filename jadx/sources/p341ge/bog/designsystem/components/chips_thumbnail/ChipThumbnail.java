package p341ge.bog.designsystem.components.chips_thumbnail;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C1314o;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41217g;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.currencybadge.CurrencyBadgeView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C9942j2;
import p561pi.C17365a;
import p561pi.C17367b;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17961b;
import p642vh.C18355e0;
import p642vh.C18365j0;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail */
public final class ChipThumbnail extends ConstraintLayout {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f39073n;

    /* renamed from: d */
    private final C41217g f39074d;

    /* renamed from: e */
    private final C41555e f39075e;

    /* renamed from: f */
    private final C41555e f39076f;

    /* renamed from: g */
    private final C41555e f39077g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C9942j2 f39078h;

    /* renamed from: i */
    private final C18365j0 f39079i;

    /* renamed from: j */
    private final C18365j0 f39080j;

    /* renamed from: k */
    private final C18365j0 f39081k;

    /* renamed from: l */
    private final C18355e0 f39082l;

    /* renamed from: m */
    private String f39083m;

    /* renamed from: ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail$a */
    public enum C13236a {
        ACTIVE(C17780e.shape_chip_thumbnail_active, C17786k.TextSmallButtonPrimary500Left, C17786k.TextCaption1Primary500Left, C17786k.f49822D0),
        ENABLE(r11, r5, r6, r7),
        PRESSED(C17780e.shape_chip_thumbnail_pressed, r5, r6, r7),
        DISABLE(C17780e.shape_chip_thumbnail_disable, C17786k.TextSmallButtonInvertComponents150Left, C17786k.TextCaption1InvertComponents150Left, C17786k.f49839z0);
        

        /* renamed from: d */
        private final int f39089d;

        /* renamed from: e */
        private final int f39090e;

        /* renamed from: f */
        private final int f39091f;

        /* renamed from: g */
        private final int f39092g;

        private C13236a(int i, int i2, int i3, int i4) {
            this.f39089d = i;
            this.f39090e = i2;
            this.f39091f = i3;
            this.f39092g = i4;
        }

        /* renamed from: b */
        public final int mo35211b() {
            return this.f39092g;
        }

        /* renamed from: c */
        public final int mo35212c() {
            return this.f39091f;
        }

        /* renamed from: e */
        public final int mo35213e() {
            return this.f39089d;
        }

        /* renamed from: f */
        public final int mo35214f() {
            return this.f39090e;
        }
    }

    /* renamed from: ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail$b */
    static final class C13237b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13237b f39093d = new C13237b();

        C13237b() {
            super(0);
        }

        /* renamed from: b */
        public final C17367b invoke() {
            C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            bVar.mo44810m("###,##0.00");
            return bVar;
        }
    }

    /* renamed from: ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail$c */
    public static final class C13238c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ChipThumbnail f39094a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13238c(Object obj, ChipThumbnail chipThumbnail) {
            super(obj);
            this.f39094a = chipThumbnail;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C13236a aVar = (C13236a) obj2;
            if (((C13236a) obj) != aVar) {
                this.f39094a.setChipsThumbnailStyleWithStateType(aVar);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail$d */
    public static final class C13239d extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ChipThumbnail f39095a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13239d(Object obj, ChipThumbnail chipThumbnail) {
            super(obj);
            this.f39095a = chipThumbnail;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            if (!C41536l.m120484d((String) obj, (String) obj2)) {
                C17365a i = this.f39095a.getNumeralFormatter();
                String a = C17961b.f51154a.mo45631a(this.f39095a.getSuffix());
                if (a == null) {
                    a = this.f39095a.getSuffix();
                }
                i.mo44801a(" " + a);
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.chips_thumbnail.ChipThumbnail$e */
    public static final class C13240e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ ChipThumbnail f39096a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13240e(Object obj, ChipThumbnail chipThumbnail) {
            super(obj);
            this.f39096a = chipThumbnail;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            boolean z;
            C41536l.m120489i(iVar, "property");
            String str = (String) obj2;
            if (!C41536l.m120484d((String) obj, str)) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f39096a.f39078h.f27137e.setText(this.f39096a.getNumeralFormatter().mo44804d(str));
                    this.f39096a.f39078h.f27138f.setVisibility(0);
                } else {
                    this.f39096a.f39078h.f27138f.setVisibility(8);
                }
                ChipThumbnail chipThumbnail = this.f39096a;
                chipThumbnail.setChipsThumbnailStyleWithStateType(chipThumbnail.getStateType());
            }
        }
    }

    static {
        Class<ChipThumbnail> cls = ChipThumbnail.class;
        f39073n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "stateType", "getStateType()Lge/bog/designsystem/components/chips_thumbnail/ChipThumbnail$ChipThumbnailStateType;", 0)), C41520a0.m120439e(new C41539o(cls, "suffix", "getSuffix()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "amount", "getAmount()Ljava/lang/String;", 0)), C41520a0.m120439e(new C41539o(cls, "isIconImageVisible", "isIconImageVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isIconTextVisible", "isIconTextVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isBadgeVisible", "isBadgeVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChipThumbnail(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public static /* synthetic */ void getAmount$annotations() {
    }

    /* access modifiers changed from: private */
    public final C17365a getNumeralFormatter() {
        return (C17365a) this.f39074d.getValue();
    }

    /* access modifiers changed from: private */
    public final void setChipsThumbnailStyleWithStateType(C13236a aVar) {
        boolean z;
        int i;
        setBackgroundResource(aVar.mo35213e());
        C9942j2 j2Var = this.f39078h;
        AppCompatTextView appCompatTextView = j2Var.f27143k;
        if (j2Var.f27137e.getText().toString().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = aVar.mo35214f();
        } else {
            i = aVar.mo35212c();
        }
        C1314o.m4575q(appCompatTextView, i);
        C1314o.m4575q(this.f39078h.f27137e, aVar.mo35211b());
    }

    private final void setIconImageVisible(boolean z) {
        this.f39079i.mo46151c(this, f39073n[3], z);
    }

    private final void setIconTextVisible(boolean z) {
        this.f39080j.mo46151c(this, f39073n[4], z);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        C13236a aVar;
        super.drawableStateChanged();
        if (getStateType() != C13236a.ACTIVE && getStateType() != C13236a.DISABLE) {
            int[] drawableState = getDrawableState();
            C41536l.m120488h(drawableState, "drawableState");
            if (C41333m.m119793r(drawableState, 16842919)) {
                aVar = C13236a.PRESSED;
            } else {
                aVar = C13236a.ENABLE;
            }
            setStateType(aVar);
        }
    }

    public final String getAmount() {
        return (String) this.f39077g.getValue(this, f39073n[2]);
    }

    public final String getDescription() {
        return this.f39083m;
    }

    public final C13236a getStateType() {
        return (C13236a) this.f39075e.getValue(this, f39073n[0]);
    }

    public final String getSuffix() {
        return (String) this.f39076f.getValue(this, f39073n[1]);
    }

    public final CharSequence getTitle() {
        return this.f39082l.getValue(this, f39073n[6]);
    }

    /* renamed from: k */
    public final void mo35203k(String str, boolean z) {
        C2394j y = C2379b.m9210t(getContext()).mo7757y(str);
        if (z) {
            y = y.mo7730b1(C2379b.m9210t(getContext()).mo7755w(Integer.valueOf(C17780e.f49668q1)));
        }
        ((C2394j) y.mo7219c()).mo7718L0(this.f39078h.f27141i);
        setIconImageVisible(true);
        setIconTextVisible(false);
        this.f39078h.f27140h.setLayerStyle(C17786k.LayerRadiusCircleShadow0);
    }

    public final void setAmount(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f39077g.setValue(this, f39073n[2], str);
    }

    public final void setBadgeVisible(boolean z) {
        this.f39081k.mo46151c(this, f39073n[5], z);
    }

    public final void setDescription(String str) {
        boolean z;
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f39083m = str;
        this.f39078h.f27137e.setText(str);
        HideableAmountView hideableAmountView = this.f39078h.f27138f;
        C41536l.m120488h(hideableAmountView, "binding.chipThumbnailAmountTextHideable");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        C18368l.m62751F(hideableAmountView, z, false, 2, (Object) null);
        setChipsThumbnailStyleWithStateType(getStateType());
    }

    public final void setIconText(String str) {
        C41536l.m120489i(str, "text");
        this.f39078h.f27142j.setBadgeTitle(str);
        setIconImageVisible(false);
        setIconTextVisible(true);
        this.f39078h.f27140h.setLayerStyle(C17786k.LayerRadius4Shadow0);
    }

    public final void setStateType(C13236a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f39075e.setValue(this, f39073n[0], aVar);
    }

    public final void setSuffix(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f39076f.setValue(this, f39073n[1], str);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39082l.setValue(this, f39073n[6], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChipThumbnail(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChipThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        this.f39074d = C41219i.m119470b(C13237b.f39093d);
        C41551a aVar = C41551a.f97718a;
        this.f39075e = new C13238c(C13236a.DISABLE, this);
        String str = "";
        this.f39076f = new C13239d(str, this);
        this.f39077g = new C13240e(str, this);
        C9942j2 c = C9942j2.m36466c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39078h = c;
        AppCompatImageView appCompatImageView = c.f27141i;
        C41536l.m120488h(appCompatImageView, "binding.chipThumbnailIconImage");
        this.f39079i = new C18365j0(appCompatImageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        CurrencyBadgeView currencyBadgeView = c.f27142j;
        C41536l.m120488h(currencyBadgeView, "binding.chipThumbnailIconText");
        this.f39080j = new C18365j0(currencyBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        NotificationBadgeView notificationBadgeView = c.f27139g;
        C41536l.m120488h(notificationBadgeView, "binding.chipThumbnailBadgeView");
        this.f39081k = new C18365j0(notificationBadgeView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView = c.f27143k;
        C41536l.m120488h(appCompatTextView, "binding.chipThumbnailTitleText");
        this.f39082l = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f39083m = str;
        int[] iArr = C17787l.f50143U2;
        C41536l.m120488h(iArr, "ChipThumbnail");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        String nonResourceString = obtainStyledAttributes.getNonResourceString(C17787l.f50173W2);
        setTitle(nonResourceString == null ? str : nonResourceString);
        String nonResourceString2 = obtainStyledAttributes.getNonResourceString(C17787l.f50158V2);
        if (nonResourceString2 != null) {
            C41536l.m120488h(nonResourceString2, "getNonResourceString(R.s…mbnail_description) ?: \"\"");
            str = nonResourceString2;
        }
        setDescription(str);
        obtainStyledAttributes.recycle();
        setStateType(C13236a.ENABLE);
    }
}
