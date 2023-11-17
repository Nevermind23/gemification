package p341ge.bog.designsystem.components.list;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p352ak.C9932i0;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17964e;
import p642vh.C18353d0;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.list.ThreeLineTextItem */
public final class ThreeLineTextItem extends FrameLayout {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f39714n;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9932i0 f39715d;

    /* renamed from: e */
    private final C18355e0 f39716e;

    /* renamed from: f */
    private final C18355e0 f39717f;

    /* renamed from: g */
    private final C18355e0 f39718g;

    /* renamed from: h */
    private final C13367d f39719h;

    /* renamed from: i */
    private final C13365b f39720i;

    /* renamed from: j */
    private final C13365b f39721j;

    /* renamed from: k */
    private final C18353d0 f39722k;

    /* renamed from: l */
    private final C18353d0 f39723l;

    /* renamed from: m */
    private final C18353d0 f39724m;

    /* renamed from: ge.bog.designsystem.components.list.ThreeLineTextItem$a */
    static final class C13357a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ThreeLineTextItem f39725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13357a(ThreeLineTextItem threeLineTextItem) {
            super(0);
            this.f39725d = threeLineTextItem;
        }

        public final void invoke() {
            AppCompatTextView appCompatTextView = this.f39725d.f39715d.f27089f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            AppCompatTextView appCompatTextView2 = this.f39725d.f39715d.f27090g;
            C41536l.m120488h(appCompatTextView2, "binding.titleView");
            C13369f.m50302c(appCompatTextView, appCompatTextView2);
        }
    }

    /* renamed from: ge.bog.designsystem.components.list.ThreeLineTextItem$b */
    static final class C13358b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ThreeLineTextItem f39726d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13358b(ThreeLineTextItem threeLineTextItem) {
            super(0);
            this.f39726d = threeLineTextItem;
        }

        public final void invoke() {
            AppCompatTextView appCompatTextView = this.f39726d.f39715d.f27090g;
            C41536l.m120488h(appCompatTextView, "binding.titleView");
            AppCompatTextView appCompatTextView2 = this.f39726d.f39715d.f27088e;
            C41536l.m120488h(appCompatTextView2, "binding.subtitleView");
            C13369f.m50302c(appCompatTextView, appCompatTextView2);
        }
    }

    /* renamed from: ge.bog.designsystem.components.list.ThreeLineTextItem$c */
    static final class C13359c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ThreeLineTextItem f39727d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13359c(ThreeLineTextItem threeLineTextItem) {
            super(0);
            this.f39727d = threeLineTextItem;
        }

        public final void invoke() {
            AppCompatTextView appCompatTextView = this.f39727d.f39715d.f27089f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            AppCompatTextView appCompatTextView2 = this.f39727d.f39715d.f27088e;
            C41536l.m120488h(appCompatTextView2, "binding.subtitleView");
            C13369f.m50302c(appCompatTextView, appCompatTextView2);
        }
    }

    static {
        Class<ThreeLineTextItem> cls = ThreeLineTextItem.class;
        f39714n = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, NotificationMessage.NOTIF_KEY_SUB_TITLE, "getSubtitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "semibold", "getSemibold()Z", 0)), C41520a0.m120439e(new C41539o(cls, "multilineText", "getMultilineText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "multilineMiddleText", "getMultilineMiddleText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColorStateList", "getTextColorStateList()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "titleColorStateList", "getTitleColorStateList()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "subtitleColorStateList", "getSubtitleColorStateList()Landroid/content/res/ColorStateList;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ThreeLineTextItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1314o.m4575q(this.f39715d.f27089f, C13369f.m50303d(C17786k.TextBody1, getSemibold()));
    }

    public final boolean getMultilineMiddleText() {
        return this.f39721j.getValue(this, f39714n[5]).booleanValue();
    }

    public final boolean getMultilineText() {
        return this.f39720i.getValue(this, f39714n[4]).booleanValue();
    }

    public final boolean getSemibold() {
        return this.f39719h.getValue(this, f39714n[3]).booleanValue();
    }

    public final CharSequence getSubtitle() {
        return this.f39718g.getValue(this, f39714n[2]);
    }

    public final ColorStateList getSubtitleColorStateList() {
        return this.f39724m.getValue(this, f39714n[8]);
    }

    public final CharSequence getText() {
        return this.f39717f.getValue(this, f39714n[1]);
    }

    public final ColorStateList getTextColorStateList() {
        return this.f39722k.getValue(this, f39714n[6]);
    }

    public final CharSequence getTitle() {
        return this.f39716e.getValue(this, f39714n[0]);
    }

    public final ColorStateList getTitleColorStateList() {
        return this.f39723l.getValue(this, f39714n[7]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C17779d.height_list_item_large);
        if (getMultilineText() || getMultilineMiddleText()) {
            dimensionPixelSize = Math.max(dimensionPixelSize, getMeasuredHeight() + getResources().getDimensionPixelSize(C17779d.list_item_extra_padding));
        }
        setMeasuredDimension(getMeasuredWidth(), dimensionPixelSize);
    }

    public final void setMultilineMiddleText(boolean z) {
        this.f39721j.mo36104b(this, f39714n[5], z);
    }

    public final void setMultilineText(boolean z) {
        this.f39720i.mo36104b(this, f39714n[4], z);
    }

    public final void setSemibold(boolean z) {
        this.f39719h.mo36109b(this, f39714n[3], z);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f39718g.setValue(this, f39714n[2], charSequence);
    }

    public final void setSubtitleColorInt(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C41536l.m120488h(valueOf, "valueOf(colorInt)");
        setSubtitleColorStateList(valueOf);
    }

    public final void setSubtitleColorRes(int i) {
        this.f39715d.f27088e.setTextColor(C0767a.m2894d(getContext(), i));
    }

    public final void setSubtitleColorStateList(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "<set-?>");
        this.f39724m.setValue(this, f39714n[8], colorStateList);
    }

    public final void setText(CharSequence charSequence) {
        this.f39717f.setValue(this, f39714n[1], charSequence);
    }

    public final void setTextColorInt(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C41536l.m120488h(valueOf, "valueOf(colorInt)");
        setTextColorStateList(valueOf);
    }

    public final void setTextColorRes(int i) {
        this.f39715d.f27089f.setTextColor(C0767a.m2894d(getContext(), i));
    }

    public final void setTextColorStateList(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "<set-?>");
        this.f39722k.setValue(this, f39714n[6], colorStateList);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39716e.setValue(this, f39714n[0], charSequence);
    }

    public final void setTitleColorInt(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C41536l.m120488h(valueOf, "valueOf(colorInt)");
        setTitleColorStateList(valueOf);
    }

    public final void setTitleColorRes(int i) {
        this.f39715d.f27090g.setTextColor(C0767a.m2894d(getContext(), i));
    }

    public final void setTitleColorStateList(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "<set-?>");
        this.f39723l.setValue(this, f39714n[7], colorStateList);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreeLineTextItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeLineTextItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9932i0 c = C9932i0.m36432c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39715d = c;
        AppCompatTextView appCompatTextView = c.f27090g;
        C41536l.m120488h(appCompatTextView, "binding.titleView");
        this.f39716e = new C18355e0(appCompatTextView, false, new C13359c(this), 2, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f27089f;
        C41536l.m120488h(appCompatTextView2, "binding.textView");
        this.f39717f = new C18355e0(appCompatTextView2, false, new C13358b(this), 2, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView3 = c.f27088e;
        C41536l.m120488h(appCompatTextView3, "binding.subtitleView");
        this.f39718g = new C18355e0(appCompatTextView3, false, new C13357a(this), 2, (DefaultConstructorMarker) null);
        this.f39719h = new C13367d(false, 1, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView4 = c.f27088e;
        C41536l.m120488h(appCompatTextView4, "binding.subtitleView");
        this.f39720i = new C13365b(appCompatTextView4);
        AppCompatTextView appCompatTextView5 = c.f27089f;
        C41536l.m120488h(appCompatTextView5, "binding.textView");
        this.f39721j = new C13365b(appCompatTextView5);
        AppCompatTextView appCompatTextView6 = c.f27089f;
        C41536l.m120488h(appCompatTextView6, "binding.textView");
        this.f39722k = new C18353d0(appCompatTextView6);
        AppCompatTextView appCompatTextView7 = c.f27090g;
        C41536l.m120488h(appCompatTextView7, "binding.titleView");
        this.f39723l = new C18353d0(appCompatTextView7);
        AppCompatTextView appCompatTextView8 = c.f27088e;
        C41536l.m120488h(appCompatTextView8, "binding.subtitleView");
        this.f39724m = new C18353d0(appCompatTextView8);
        int[] iArr = C17787l.f50063Oc;
        C41536l.m120488h(iArr, "ThreeLineTextItem");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getText(C17787l.f50183Wc));
        setText(obtainStyledAttributes.getText(C17787l.f50153Uc));
        setSubtitle(obtainStyledAttributes.getText(C17787l.f50123Sc));
        setSemibold(obtainStyledAttributes.getBoolean(C17787l.f50108Rc, false));
        setMultilineText(obtainStyledAttributes.getBoolean(C17787l.f50093Qc, false));
        setMultilineMiddleText(obtainStyledAttributes.getBoolean(C17787l.f50078Pc, false));
        setTextColorStateList(C17964e.m61893f(obtainStyledAttributes, C17787l.f50168Vc, context, 0, (Color) null, 12, (Object) null));
        setTitleColorStateList(C17964e.m61894g(obtainStyledAttributes, C17787l.f50198Xc, context2));
        setSubtitleColorStateList(C17964e.m61894g(obtainStyledAttributes, C17787l.f50138Tc, context2));
        obtainStyledAttributes.recycle();
    }
}
