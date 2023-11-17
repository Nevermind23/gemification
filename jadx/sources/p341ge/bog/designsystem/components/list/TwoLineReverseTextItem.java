package p341ge.bog.designsystem.components.list;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p352ak.C9940j0;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;
import p615tg.C17964e;
import p642vh.C18353d0;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.list.TwoLineReverseTextItem */
public final class TwoLineReverseTextItem extends FrameLayout {

    /* renamed from: m */
    static final /* synthetic */ C40303i[] f39728m;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9940j0 f39729d;

    /* renamed from: e */
    private final C18355e0 f39730e;

    /* renamed from: f */
    private final C18355e0 f39731f;

    /* renamed from: g */
    private final C13367d f39732g;

    /* renamed from: h */
    private final C13365b f39733h;

    /* renamed from: i */
    private final C13365b f39734i;

    /* renamed from: j */
    private int f39735j;

    /* renamed from: k */
    private final C18353d0 f39736k;

    /* renamed from: l */
    private final C18353d0 f39737l;

    /* renamed from: ge.bog.designsystem.components.list.TwoLineReverseTextItem$a */
    static final class C13360a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TwoLineReverseTextItem f39738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13360a(TwoLineReverseTextItem twoLineReverseTextItem) {
            super(0);
            this.f39738d = twoLineReverseTextItem;
        }

        public final void invoke() {
            AppCompatTextView appCompatTextView = this.f39738d.f39729d.f27133g;
            C41536l.m120488h(appCompatTextView, "binding.titleView");
            C13369f.m50302c(appCompatTextView);
        }
    }

    /* renamed from: ge.bog.designsystem.components.list.TwoLineReverseTextItem$b */
    static final class C13361b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ TwoLineReverseTextItem f39739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13361b(TwoLineReverseTextItem twoLineReverseTextItem) {
            super(0);
            this.f39739d = twoLineReverseTextItem;
        }

        public final void invoke() {
            AppCompatTextView appCompatTextView = this.f39739d.f39729d.f27132f;
            C41536l.m120488h(appCompatTextView, "binding.textView");
            C13369f.m50302c(appCompatTextView);
        }
    }

    static {
        Class<TwoLineReverseTextItem> cls = TwoLineReverseTextItem.class;
        f39728m = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "semibold", "getSemibold()Z", 0)), C41520a0.m120439e(new C41539o(cls, "multilineText", "getMultilineText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "multilineBottomText", "getMultilineBottomText()Z", 0)), C41520a0.m120439e(new C41539o(cls, "textColorStateList", "getTextColorStateList()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "titleColorStateList", "getTitleColorStateList()Landroid/content/res/ColorStateList;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TwoLineReverseTextItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1314o.m4575q(this.f39729d.f27132f, C13369f.m50303d(C17786k.TextBody1, getSemibold()));
    }

    public final int getHorizontalGravity() {
        return this.f39735j;
    }

    public final boolean getMultilineBottomText() {
        return this.f39734i.getValue(this, f39728m[4]).booleanValue();
    }

    public final boolean getMultilineText() {
        return this.f39733h.getValue(this, f39728m[3]).booleanValue();
    }

    public final boolean getSemibold() {
        return this.f39732g.getValue(this, f39728m[2]).booleanValue();
    }

    public final CharSequence getText() {
        return this.f39731f.getValue(this, f39728m[1]);
    }

    public final ColorStateList getTextColorStateList() {
        return this.f39736k.getValue(this, f39728m[5]);
    }

    public final boolean getTextIsSelectable() {
        return this.f39729d.f27132f.isTextSelectable();
    }

    public final CharSequence getTitle() {
        return this.f39730e.getValue(this, f39728m[0]);
    }

    public final ColorStateList getTitleColorStateList() {
        return this.f39737l.getValue(this, f39728m[6]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C17779d.height_list_item_medium);
        if (getMultilineText() || getMultilineBottomText()) {
            dimensionPixelSize = Math.max(dimensionPixelSize, getMeasuredHeight() + getResources().getDimensionPixelSize(C17779d.list_item_extra_padding));
        }
        setMeasuredDimension(getMeasuredWidth(), dimensionPixelSize);
    }

    public final void setHorizontalGravity(int i) {
        if (i == 8388611 || i == 8388613) {
            this.f39735j = i;
            LinearLayout linearLayout = this.f39729d.f27131e;
            C41536l.m120488h(linearLayout, "binding.linearLayout");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = i | 16;
                linearLayout.setLayoutParams(layoutParams2);
                this.f39729d.f27133g.setGravity(i);
                this.f39729d.f27132f.setGravity(i);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    public final void setMultilineBottomText(boolean z) {
        this.f39734i.mo36104b(this, f39728m[4], z);
    }

    public final void setMultilineText(boolean z) {
        this.f39733h.mo36104b(this, f39728m[3], z);
    }

    public final void setSemibold(boolean z) {
        this.f39732g.mo36109b(this, f39728m[2], z);
    }

    public final void setText(CharSequence charSequence) {
        this.f39731f.setValue(this, f39728m[1], charSequence);
    }

    public final void setTextColorInt(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C41536l.m120488h(valueOf, "valueOf(colorInt)");
        setTextColorStateList(valueOf);
    }

    public final void setTextColorRes(int i) {
        this.f39729d.f27132f.setTextColor(C0767a.m2894d(getContext(), i));
    }

    public final void setTextColorStateList(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "<set-?>");
        this.f39736k.setValue(this, f39728m[5], colorStateList);
    }

    public final void setTextIsSelectable(boolean z) {
        this.f39729d.f27132f.setTextIsSelectable(z);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39730e.setValue(this, f39728m[0], charSequence);
    }

    public final void setTitleColorInt(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C41536l.m120488h(valueOf, "valueOf(colorInt)");
        setTitleColorStateList(valueOf);
    }

    public final void setTitleColorRes(int i) {
        this.f39729d.f27133g.setTextColor(C0767a.m2894d(getContext(), i));
    }

    public final void setTitleColorStateList(ColorStateList colorStateList) {
        C41536l.m120489i(colorStateList, "<set-?>");
        this.f39737l.setValue(this, f39728m[6], colorStateList);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TwoLineReverseTextItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwoLineReverseTextItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9940j0 c = C9940j0.m36459c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39729d = c;
        AppCompatTextView appCompatTextView = c.f27133g;
        C41536l.m120488h(appCompatTextView, "binding.titleView");
        this.f39730e = new C18355e0(appCompatTextView, false, new C13361b(this), 2, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f27132f;
        C41536l.m120488h(appCompatTextView2, "binding.textView");
        this.f39731f = new C18355e0(appCompatTextView2, false, new C13360a(this), 2, (DefaultConstructorMarker) null);
        this.f39732g = new C13367d(false, 1, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView3 = c.f27133g;
        C41536l.m120488h(appCompatTextView3, "binding.titleView");
        this.f39733h = new C13365b(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = c.f27132f;
        C41536l.m120488h(appCompatTextView4, "binding.textView");
        this.f39734i = new C13365b(appCompatTextView4);
        this.f39735j = 8388611;
        AppCompatTextView appCompatTextView5 = c.f27132f;
        C41536l.m120488h(appCompatTextView5, "binding.textView");
        this.f39736k = new C18353d0(appCompatTextView5);
        AppCompatTextView appCompatTextView6 = c.f27133g;
        C41536l.m120488h(appCompatTextView6, "binding.titleView");
        this.f39737l = new C18353d0(appCompatTextView6);
        int[] iArr = C17787l.f50154Ud;
        C41536l.m120488h(iArr, "TwoLineReverseTextItem");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getText(C17787l.f50245ae));
        setText(obtainStyledAttributes.getText(C17787l.f50214Yd));
        setSemibold(obtainStyledAttributes.getBoolean(C17787l.f50199Xd, false));
        setMultilineText(obtainStyledAttributes.getBoolean(C17787l.f50184Wd, false));
        setMultilineBottomText(obtainStyledAttributes.getBoolean(C17787l.f50169Vd, false));
        setTextColorStateList(C17964e.m61893f(obtainStyledAttributes, C17787l.f50229Zd, context, 0, (Color) null, 12, (Object) null));
        setTitleColorStateList(C17964e.m61894g(obtainStyledAttributes, C17787l.f50261be, context2));
        obtainStyledAttributes.recycle();
    }
}
