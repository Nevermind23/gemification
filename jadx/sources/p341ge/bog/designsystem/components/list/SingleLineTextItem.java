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
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p352ak.C9924h0;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17964e;
import p642vh.C18353d0;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.list.SingleLineTextItem */
public final class SingleLineTextItem extends FrameLayout {

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f39704i;

    /* renamed from: d */
    private final C9924h0 f39705d;

    /* renamed from: e */
    private final C18355e0 f39706e;

    /* renamed from: f */
    private final C13367d f39707f;

    /* renamed from: g */
    private final C13365b f39708g;

    /* renamed from: h */
    private final C18353d0 f39709h;

    static {
        Class<SingleLineTextItem> cls = SingleLineTextItem.class;
        f39704i = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "semibold", "getSemibold()Z", 0)), C41520a0.m120439e(new C41539o(cls, "multilineText", "getMultilineText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColorStateList", "getTextColorStateList()Landroid/content/res/ColorStateList;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SingleLineTextItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1314o.m4575q(this.f39705d.f27050e, C13369f.m50303d(C17786k.TextBody1, getSemibold()));
    }

    public final boolean getMultilineText() {
        return this.f39708g.getValue(this, f39704i[2]).booleanValue();
    }

    public final boolean getSemibold() {
        return this.f39707f.getValue(this, f39704i[1]).booleanValue();
    }

    public final CharSequence getText() {
        return this.f39706e.getValue(this, f39704i[0]);
    }

    public final ColorStateList getTextColorStateList() {
        return this.f39709h.getValue(this, f39704i[3]);
    }

    public final boolean getTextIsSelectable() {
        return this.f39705d.f27050e.isTextSelectable();
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
        this.f39708g.mo36104b(this, f39704i[2], z);
    }

    public final void setSemibold(boolean z) {
        this.f39707f.mo36109b(this, f39704i[1], z);
    }

    public final void setText(CharSequence charSequence) {
        this.f39706e.setValue(this, f39704i[0], charSequence);
    }

    public final void setTextColorInt(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C41536l.m120488h(valueOf, "valueOf(colorInt)");
        setTextColorStateList(valueOf);
    }

    public final void setTextColorRes(int i) {
        this.f39705d.f27050e.setTextColor(C0767a.m2894d(getContext(), i));
    }

    public final void setTextColorStateList(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "<set-?>");
        this.f39709h.setValue(this, f39704i[3], colorStateList);
    }

    public final void setTextIsSelectable(boolean z) {
        this.f39705d.f27050e.setTextIsSelectable(z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleLineTextItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleLineTextItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9924h0 c = C9924h0.m36403c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39705d = c;
        AppCompatTextView appCompatTextView = c.f27050e;
        C41536l.m120488h(appCompatTextView, "binding.textView");
        this.f39706e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f39707f = new C13367d(false, 1, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f27050e;
        C41536l.m120488h(appCompatTextView2, "binding.textView");
        this.f39708g = new C13365b(appCompatTextView2);
        AppCompatTextView appCompatTextView3 = c.f27050e;
        C41536l.m120488h(appCompatTextView3, "binding.textView");
        this.f39709h = new C18353d0(appCompatTextView3);
        int[] iArr = C17787l.f49971Ia;
        C41536l.m120488h(iArr, "SingleLineTextItem");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setText(obtainStyledAttributes.getText(C17787l.f50016La));
        setSemibold(obtainStyledAttributes.getBoolean(C17787l.f50001Ka, false));
        setMultilineText(obtainStyledAttributes.getBoolean(C17787l.f49986Ja, false));
        setTextColorStateList(C17964e.m61893f(obtainStyledAttributes, C17787l.f50031Ma, context, 0, (Color) null, 12, (Object) null));
        obtainStyledAttributes.recycle();
    }
}
