package p341ge.bog.designsystem.components.accountpicker;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewCompat;
import com.github.mikephil.charting.utils.Utils;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.multipledots.HideableAmountView;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeView;
import p352ak.C9995q0;
import p601sg.C17778c;
import p601sg.C17780e;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17961b;
import p615tg.C17962c;
import p641vg.C18332a;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18381t;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.accountpicker.AccountPickerView */
public final class AccountPickerView extends LayerView {

    /* renamed from: n */
    public static final C13136a f38669n = new C13136a((DefaultConstructorMarker) null);

    /* renamed from: o */
    static final /* synthetic */ C40303i[] f38670o;

    /* renamed from: d */
    private boolean f38671d;

    /* renamed from: e */
    private String f38672e;

    /* renamed from: f */
    private String f38673f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C9995q0 f38674g;

    /* renamed from: h */
    private final C18365j0 f38675h;

    /* renamed from: i */
    private final C18365j0 f38676i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f38677j;

    /* renamed from: k */
    private final C18381t f38678k;

    /* renamed from: l */
    private boolean f38679l;

    /* renamed from: m */
    private final C18365j0 f38680m;

    /* renamed from: ge.bog.designsystem.components.accountpicker.AccountPickerView$a */
    public static final class C13136a {
        private C13136a() {
        }

        public /* synthetic */ C13136a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.accountpicker.AccountPickerView$b */
    public static final class C13137b implements View.OnLayoutChangeListener {

        /* renamed from: d */
        final /* synthetic */ AccountPickerView f38681d;

        C13137b(AccountPickerView accountPickerView) {
            this.f38681d = accountPickerView;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C41536l.m120489i(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f38681d.m49450f();
        }
    }

    /* renamed from: ge.bog.designsystem.components.accountpicker.AccountPickerView$c */
    static final class C13138c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AccountPickerView f38682d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13138c(AccountPickerView accountPickerView) {
            super(1);
            this.f38682d = accountPickerView;
        }

        /* renamed from: a */
        public final void mo34668a(boolean z) {
            this.f38682d.f38677j = z;
            if (z && this.f38682d.mo34656i()) {
                this.f38682d.f38674g.f27416j.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo34668a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.designsystem.components.accountpicker.AccountPickerView$d */
    static final class C13139d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AccountPickerView f38683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13139d(AccountPickerView accountPickerView) {
            super(1);
            this.f38683d = accountPickerView;
        }

        /* renamed from: a */
        public final void mo34669a(boolean z) {
            if (z) {
                this.f38683d.f38674g.f27412f.setVisibility(8);
                return;
            }
            AccountPickerView accountPickerView = this.f38683d;
            accountPickerView.setEndImageVisible(accountPickerView.f38677j);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo34669a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    static {
        Class<AccountPickerView> cls = AccountPickerView.class;
        f38670o = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "isEndImageLayoutVisible", "isEndImageLayoutVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isEndImageVisible", "isEndImageVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "endImageColor", "getEndImageColor()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "isLoadingVisible", "isLoadingVisible()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AccountPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m49450f() {
        float f;
        float f2;
        long j;
        boolean z = false;
        this.f38679l = false;
        CharSequence text = this.f38674g.f27411e.getText();
        if (text == null || C40439w.m117118v(text)) {
            z = true;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.85f;
        }
        float f3 = Utils.FLOAT_EPSILON;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = getHintLateralTranslation();
        }
        if (!z) {
            f3 = getHintLongitudinalTranslation();
        }
        ViewPropertyAnimator translationY = this.f38674g.f27415i.animate().scaleX(f).scaleY(f).translationX(f2).translationY(f3);
        if (this.f38671d) {
            j = 150;
        } else {
            j = 0;
        }
        translationY.setDuration(j).start();
    }

    /* renamed from: g */
    private final void m49451g() {
        addOnLayoutChangeListener(new C13137b(this));
    }

    public static /* synthetic */ void getEndImageIconTint$annotations() {
    }

    private final float getHintLateralTranslation() {
        float measuredWidth = (float) this.f38674g.f27415i.getMeasuredWidth();
        return -((measuredWidth - (0.85f * measuredWidth)) * 0.5f);
    }

    private final float getHintLongitudinalTranslation() {
        return (float) (-(((getHeight() - this.f38674g.f27415i.getMeasuredHeight()) / 2) - C18368l.m62762k(16)));
    }

    /* renamed from: j */
    private final void m49452j() {
        TextView textView = this.f38674g.f27415i;
        if (textView.getMeasuredHeight() == 0 || textView.getMeasuredWidth() == 0) {
            this.f38674g.f27415i.measure(0, 0);
        }
        m49454m();
        if (ViewCompat.m3579V(this)) {
            m49450f();
        } else if (!this.f38679l) {
            this.f38679l = true;
            m49451g();
        }
    }

    /* renamed from: l */
    public static /* synthetic */ void m49453l(AccountPickerView accountPickerView, BigDecimal bigDecimal, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        accountPickerView.mo34657k(bigDecimal, str, z);
    }

    /* renamed from: m */
    private final void m49454m() {
        boolean z;
        String str;
        CharSequence text = this.f38674g.f27411e.getText();
        if (text == null || C40439w.m117118v(text)) {
            z = true;
        } else {
            z = false;
        }
        TextView textView = this.f38674g.f27415i;
        if (z) {
            str = this.f38672e;
        } else {
            str = this.f38673f;
        }
        textView.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m49455n(C43064a aVar, View view) {
        aVar.invoke();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C41536l.m120488h(drawableState, "states");
        if (C41333m.m119793r(drawableState, 16842910)) {
            i = C17786k.LayerRadius16Shadow10;
        } else {
            i = C17786k.f49834t;
        }
        setLayerStyle(i);
    }

    public final boolean getAnimate() {
        return this.f38671d;
    }

    public final String getCollapsedHint() {
        return this.f38673f;
    }

    public final ColorStateList getEndImageColor() {
        return this.f38678k.getValue(this, f38670o[2]);
    }

    public final Integer getEndImageIconTint() {
        throw new UnsupportedOperationException();
    }

    public final String getExpandedHint() {
        return this.f38672e;
    }

    /* renamed from: h */
    public final boolean mo34655h() {
        return this.f38676i.getValue(this, f38670o[1]).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo34656i() {
        return this.f38680m.getValue(this, f38670o[3]).booleanValue();
    }

    /* renamed from: k */
    public final void mo34657k(BigDecimal bigDecimal, String str, boolean z) {
        int i;
        HideableAmountView hideableAmountView = this.f38674g.f27418l;
        String a = C17961b.f51154a.mo45631a(str);
        String str2 = "";
        if (a == null) {
            a = str2;
        }
        hideableAmountView.setCurrencyText(" " + a);
        TextView textView = this.f38674g.f27411e;
        if (bigDecimal != null) {
            C17962c cVar = C17962c.f51156a;
            if (str == null) {
                str = str2;
            }
            String a2 = cVar.mo45632a(bigDecimal, str);
            if (a2 != null) {
                str2 = a2;
            }
        }
        textView.setText(str2);
        HideableAmountView hideableAmountView2 = this.f38674g.f27418l;
        if (bigDecimal == null) {
            i = 8;
        } else {
            i = 0;
        }
        hideableAmountView2.setVisibility(i);
        this.f38674g.f27418l.setShowAmount(z);
        m49452j();
    }

    public final void setAnimate(boolean z) {
        this.f38671d = z;
    }

    public final void setCollapsedHint(String str) {
        this.f38673f = str;
        m49454m();
    }

    public final void setEndImageColor(ColorStateList colorStateList) {
        this.f38678k.setValue(this, f38670o[2], colorStateList);
    }

    public final void setEndImageIconTint(Integer num) {
        ColorStateList colorStateList;
        if (num != null) {
            num.intValue();
            colorStateList = ColorStateList.valueOf(num.intValue());
        } else {
            colorStateList = null;
        }
        setEndImageColor(colorStateList);
    }

    public final void setEndImageLayoutVisible(boolean z) {
        this.f38675h.mo46151c(this, f38670o[0], z);
    }

    public final void setEndImageVisible(boolean z) {
        this.f38676i.mo46151c(this, f38670o[1], z);
    }

    public final void setExpandedHint(String str) {
        this.f38672e = str;
        m49454m();
    }

    public final void setLoadingVisible(boolean z) {
        this.f38680m.mo46151c(this, f38670o[3], z);
    }

    public final void setOnArrowClickListener(C43064a aVar) {
        C9995q0 q0Var = this.f38674g;
        if (aVar != null) {
            q0Var.f27412f.setOnClickListener(new C18332a(aVar));
            q0Var.f27412f.setClickable(true);
            return;
        }
        q0Var.f27412f.setOnClickListener((View.OnClickListener) null);
        q0Var.f27412f.setClickable(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountPickerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9995q0 c = C9995q0.m36660c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f38674g = c;
        CardView cardView = c.f27413g;
        C41536l.m120488h(cardView, "binding.endImageLayout");
        this.f38675h = new C18365j0(cardView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = c.f27412f;
        C41536l.m120488h(appCompatImageView, "binding.endIconImage");
        this.f38676i = new C18365j0(appCompatImageView, 0, new C13138c(this), 2, (DefaultConstructorMarker) null);
        this.f38677j = mo34655h();
        AppCompatImageView appCompatImageView2 = c.f27412f;
        C41536l.m120488h(appCompatImageView2, "binding.endIconImage");
        this.f38678k = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
        StatusBadgeView statusBadgeView = c.f27416j;
        C41536l.m120488h(statusBadgeView, "binding.statusBadgeIcon");
        this.f38680m = new C18365j0(statusBadgeView, 0, new C13139d(this), 2, (DefaultConstructorMarker) null);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f50406l, 0, 0);
        try {
            setEndImageVisible(obtainStyledAttributes.getBoolean(C17787l.f50470p, true));
            setExpandedHint(obtainStyledAttributes.getString(C17787l.f50486q));
            setCollapsedHint(obtainStyledAttributes.getString(C17787l.f50438n));
            this.f38671d = obtainStyledAttributes.getBoolean(C17787l.f50422m, false);
            setEndImageColor(C5769a.m23209a(context2, obtainStyledAttributes.getResourceId(C17787l.f50454o, C17778c.selector_image_tint_color)));
            setLoadingVisible(obtainStyledAttributes.getBoolean(C17787l.f50502r, false));
            obtainStyledAttributes.recycle();
            setLayerStyle(C17786k.LayerRadius16Shadow10);
            setBackgroundResource(C17780e.selector_account_picker);
            HideableAmountView hideableAmountView = c.f27418l;
            hideableAmountView.setInAnimation((Animation) null);
            hideableAmountView.setOutAnimation((Animation) null);
            hideableAmountView.setMeasureAllChildren(false);
            m49452j();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
