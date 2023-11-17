package p341ge.bog.designsystem.components.list;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.C1314o;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C9916g0;
import p601sg.C17779d;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.list.SingleLineSmallTextItem */
public final class SingleLineSmallTextItem extends LinearLayout {

    /* renamed from: g */
    static final /* synthetic */ C40303i[] f39700g;

    /* renamed from: d */
    private final C9916g0 f39701d;

    /* renamed from: e */
    private final C18355e0 f39702e;

    /* renamed from: f */
    private final C18355e0 f39703f;

    static {
        Class<SingleLineSmallTextItem> cls = SingleLineSmallTextItem.class;
        f39700g = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "text", "getText()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SingleLineSmallTextItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C41536l.m120488h(drawableState, "drawableState");
        if (C41333m.m119793r(drawableState, 16842910)) {
            C1314o.m4575q(this.f39701d.f27016f, C17786k.TextBody2InvertComponents200Left);
            C1314o.m4575q(this.f39701d.f27015e, C17786k.TextSmallButtonInvertComponents500Left);
            return;
        }
        C1314o.m4575q(this.f39701d.f27016f, C17786k.TextBody2InvertComponents150Left);
        C1314o.m4575q(this.f39701d.f27015e, C17786k.TextSmallButtonInvertComponents150Left);
    }

    public final CharSequence getText() {
        return this.f39703f.getValue(this, f39700g[1]);
    }

    public final CharSequence getTitle() {
        return this.f39702e.getValue(this, f39700g[0]);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getResources().getDimensionPixelSize(C17779d.height_list_item_small)));
    }

    public final void setText(CharSequence charSequence) {
        this.f39703f.setValue(this, f39700g[1], charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f39702e.setValue(this, f39700g[0], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleLineSmallTextItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleLineSmallTextItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9916g0 c = C9916g0.m36374c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f39701d = c;
        AppCompatTextView appCompatTextView = c.f27016f;
        C41536l.m120488h(appCompatTextView, "binding.titleView");
        this.f39702e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f27015e;
        C41536l.m120488h(appCompatTextView2, "binding.textView");
        this.f39703f = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        int[] iArr = C17787l.f49926Fa;
        C41536l.m120488h(iArr, "SingleLineSmallTextItem");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getText(C17787l.f49956Ha));
        setText(obtainStyledAttributes.getText(C17787l.f49941Ga));
        obtainStyledAttributes.recycle();
        setOrientation(0);
    }
}
