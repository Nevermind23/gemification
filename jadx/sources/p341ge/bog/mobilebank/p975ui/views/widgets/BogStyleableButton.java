package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BogStyleableButton */
public final class BogStyleableButton extends AppCompatButton {
    private float radius;
    private int solidColour;
    private int strokeColour;
    private int strokeWidth;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BogStyleableButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final void arrangeViewBackground() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke(this.strokeWidth, this.strokeColour);
        gradientDrawable.setColor(this.solidColour);
        gradientDrawable.setCornerRadius(this.radius);
        setBackground(gradientDrawable);
    }

    private final void retrieveUiParametersFromAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29483y0, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…BogStyleableButton, 0, 0)");
        this.strokeColour = obtainStyledAttributes.getColor(C10330s.f28989B0, 0);
        this.solidColour = obtainStyledAttributes.getColor(C10330s.f28979A0, 0);
        this.radius = (float) C32343x.m95392H(obtainStyledAttributes.getDimension(C10330s.f29493z0, Utils.FLOAT_EPSILON));
        this.strokeWidth = C32343x.m95392H(obtainStyledAttributes.getDimension(C10330s.f28999C0, Utils.FLOAT_EPSILON));
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BogStyleableButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BogStyleableButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BogStyleableButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        retrieveUiParametersFromAttrs(attributeSet);
        arrangeViewBackground();
    }
}
