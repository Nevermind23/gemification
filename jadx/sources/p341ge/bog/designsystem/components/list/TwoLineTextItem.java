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
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p352ak.C9948k0;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17964e;
import p642vh.C18353d0;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.list.TwoLineTextItem */
public final class TwoLineTextItem extends FrameLayout {

    /* renamed from: k */
    static final /* synthetic */ C40303i[] f39740k;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9948k0 f39741d;

    /* renamed from: e */
    private final C18355e0 f39742e;

    /* renamed from: f */
    private final C18355e0 f39743f;

    /* renamed from: g */
    private final C13367d f39744g;

    /* renamed from: h */
    private final C13365b f39745h;

    /* renamed from: i */
    private final C18353d0 f39746i;

    /* renamed from: j */
    private final C18353d0 f39747j;

    /* renamed from: ge.bog.designsystem.components.list.TwoLineTextItem$a */
    static final class C13362a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TwoLineTextItem f39748d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13362a(TwoLineTextItem twoLineTextItem) {
            super(0);
            this.f39748d = twoLineTextItem;
        }

        public final void invoke() {
            AppCompatTextView appCompatTextView = this.f39748d.f39741d.f27186f;
            C41536l.m120488h(appCompatTextView, "binding.titleView");
            C13369f.m50302c(appCompatTextView);
        }
    }

    /* renamed from: ge.bog.designsystem.components.list.TwoLineTextItem$b */
    static final class C13363b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TwoLineTextItem f39749d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13363b(TwoLineTextItem twoLineTextItem) {
            super(0);
            this.f39749d = twoLineTextItem;
        }

        public final void invoke() {
            AppCompatTextView appCompatTextView = this.f39749d.f39741d.f27185e;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            C13369f.m50302c(appCompatTextView);
        }
    }

    static {
        Class<TwoLineTextItem> cls = TwoLineTextItem.class;
        f39740k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "semibold", "getSemibold()Z", 0)), C41520a0.m120439e(new C41539o(cls, "multilineText", "getMultilineText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColorStateList", "getTextColorStateList()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "titleColorStateList", "getTitleColorStateList()Landroid/content/res/ColorStateList;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TwoLineTextItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1314o.m4575q(this.f39741d.f27185e, C13369f.m50303d(C17786k.TextBody1, getSemibold()));
    }

    public final boolean getMultilineText() {
        return this.f39745h.getValue(this, f39740k[3]).booleanValue();
    }

    public final boolean getSemibold() {
        return this.f39744g.getValue(this, f39740k[2]).booleanValue();
    }

    public final CharSequence getText() {
        return this.f39743f.getValue(this, f39740k[1]);
    }

    public final ColorStateList getTextColorStateList() {
        return this.f39746i.getValue(this, f39740k[4]);
    }

    public final boolean getTextIsSelectable() {
        return this.f39741d.f27185e.isTextSelectable();
    }

    public final CharSequence getTitle() {
        return this.f39742e.getValue(this, f39740k[0]);
    }

    public final ColorStateList getTitleColorStateList() {
        return this.f39747j.getValue(this, f39740k[5]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C17779d.height_list_item_medium);
        if (getMultilineText()) {
            dimensionPixelSize = Math.max(dimensionPixelSize, getMeasuredHeight() + getResources().getDimensionPixelSize(C17779d.list_item_extra_padding));
        }
        setMeasuredDimension(getMeasuredWidth(), dimensionPixelSize);
    }

    public final void setMultilineText(boolean z) {
        this.f39745h.mo36104b(this, f39740k[3], z);
    }

    public final void setSemibold(boolean z) {
        this.f39744g.mo36109b(this, f39740k[2], z);
    }

    public final void setText(CharSequence charSequence) {
        this.f39743f.setValue(this, f39740k[1], charSequence);
    }

    public final void setTextColorInt(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C41536l.m120488h(valueOf, "valueOf(colorInt)");
        setTextColorStateList(valueOf);
    }

    public final void setTextColorRes(int i) {
        this.f39741d.f27185e.setTextColor(C0767a.m2894d(getContext(), i));
    }

    public final void setTextColorStateList(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "<set-?>");
        this.f39746i.setValue(this, f39740k[4], colorStateList);
    }

    public final void setTextIsSelectable(boolean z) {
        this.f39741d.f27185e.setTextIsSelectable(z);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39742e.setValue(this, f39740k[0], charSequence);
    }

    public final void setTitleColorInt(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C41536l.m120488h(valueOf, "valueOf(colorInt)");
        setTitleColorStateList(valueOf);
    }

    public final void setTitleColorRes(int i) {
        this.f39741d.f27186f.setTextColor(C0767a.m2894d(getContext(), i));
    }

    public final void setTitleColorStateList(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "<set-?>");
        this.f39747j.setValue(this, f39740k[5], colorStateList);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TwoLineTextItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwoLineTextItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9948k0 c = C9948k0.m36487c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39741d = c;
        AppCompatTextView appCompatTextView = c.f27186f;
        C41536l.m120488h(appCompatTextView, "binding.titleView");
        this.f39742e = new C18355e0(appCompatTextView, false, new C13363b(this), 2, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f27185e;
        C41536l.m120488h(appCompatTextView2, "binding.textView");
        this.f39743f = new C18355e0(appCompatTextView2, false, new C13362a(this), 2, (DefaultConstructorMarker) null);
        this.f39744g = new C13367d(false, 1, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView3 = c.f27185e;
        C41536l.m120488h(appCompatTextView3, "binding.textView");
        this.f39745h = new C13365b(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = c.f27185e;
        C41536l.m120488h(appCompatTextView4, "binding.textView");
        this.f39746i = new C18353d0(appCompatTextView4);
        AppCompatTextView appCompatTextView5 = c.f27186f;
        C41536l.m120488h(appCompatTextView5, "binding.titleView");
        this.f39747j = new C18353d0(appCompatTextView5);
        int[] iArr = C17787l.f50277ce;
        C41536l.m120488h(iArr, "TwoLineTextItem");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getText(C17787l.f50357he));
        setText(obtainStyledAttributes.getText(C17787l.f50325fe));
        setSemibold(obtainStyledAttributes.getBoolean(C17787l.f50309ee, false));
        setMultilineText(obtainStyledAttributes.getBoolean(C17787l.f50293de, false));
        setTextColorStateList(C17964e.m61893f(obtainStyledAttributes, C17787l.f50341ge, context, 0, (Color) null, 12, (Object) null));
        setTitleColorStateList(C17964e.m61894g(obtainStyledAttributes, C17787l.f50373ie, context2));
        obtainStyledAttributes.recycle();
    }
}
