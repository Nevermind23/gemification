package p341ge.bog.designsystem.components.badgecontainer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.badgecontainer.BadgeContainer */
public final class BadgeContainer extends FlexboxLayout {

    /* renamed from: u */
    private int f38779u;

    /* renamed from: v */
    private int f38780v;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BadgeContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: B */
    private final ShapeDrawable m49568B(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i2);
        shapeDrawable.getPaint().setColor(0);
        return shapeDrawable;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BadgeContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BadgeContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        setFlexWrap(1);
        setJustifyContent(2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f50566v0);
            C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…styleable.BadgeContainer)");
            this.f38779u = obtainStyledAttributes.getDimensionPixelSize(C17787l.f50581w0, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C17787l.f50596x0, 0);
            this.f38780v = dimensionPixelSize;
            setDividerDrawable(m49568B(this.f38779u, dimensionPixelSize));
            setShowDivider(2);
            obtainStyledAttributes.recycle();
        }
    }
}
