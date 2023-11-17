package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.core.content.C0767a;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10330s;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.BorderedBogTextView */
public final class BorderedBogTextView extends BogTextView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final float DEFAULT_CORNER_RADIUS = 5.0f;
    public static final float DEFAULT_STROKE_WIDTH = 1.0f;
    private final C41217g bg$delegate;
    private int strokeColor;
    private int strokeWidth;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BorderedBogTextView$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.BorderedBogTextView$a */
    static final class C35726a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BorderedBogTextView f86351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35726a(BorderedBogTextView borderedBogTextView) {
            super(0);
            this.f86351d = borderedBogTextView;
        }

        /* renamed from: b */
        public final GradientDrawable invoke() {
            Drawable background = this.f86351d.getBackground();
            C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            return (GradientDrawable) background;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BorderedBogTextView(Context context) {
        this(context, (AttributeSet) null);
        C41536l.m120489i(context, "context");
    }

    private final GradientDrawable getBg() {
        return (GradientDrawable) this.bg$delegate.getValue();
    }

    private final int getColor(int i) {
        return C0767a.m2893c(getContext(), i);
    }

    private final void setColors(TypedArray typedArray) {
        setBackgroundFillColor(typedArray.getColor(C10330s.f29129P0, getColor(C10318g.f28650u2)));
    }

    private final void setRadii(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C10330s.f29119O0, C32343x.m95392H(5.0f));
        float dimensionPixelSize2 = (float) typedArray.getDimensionPixelSize(C10330s.f29159S0, dimensionPixelSize);
        float dimensionPixelSize3 = (float) typedArray.getDimensionPixelSize(C10330s.f29169T0, dimensionPixelSize);
        float dimensionPixelSize4 = (float) typedArray.getDimensionPixelSize(C10330s.f29099M0, dimensionPixelSize);
        float dimensionPixelSize5 = (float) typedArray.getDimensionPixelSize(C10330s.f29109N0, dimensionPixelSize);
        getBg().setCornerRadii(new float[]{dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize5});
    }

    private final void setupStroke(TypedArray typedArray) {
        setStrokeWidth(typedArray.getDimensionPixelSize(C10330s.f29149R0, C32343x.m95392H(1.0f)));
        setStrokeColor(typedArray.getColor(C10330s.f29139Q0, getColor(C10318g.f28648l)));
        getBg().setStroke(this.strokeWidth, this.strokeColor);
        setRadii(typedArray);
    }

    private final void setupViews(TypedArray typedArray) {
        setColors(typedArray);
        setupStroke(typedArray);
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeWidth() {
        return this.strokeWidth;
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(getContext().getDrawable(C10320i.bg_rect_border));
    }

    public final void setBackgroundFillColor(int i) {
        getBg().setColor(i);
    }

    public final void setBackgroundFillColorId(int i) {
        setBackgroundFillColor(getColor(i));
    }

    public final void setStrokeColor(int i) {
        this.strokeColor = i;
        getBg().setStroke(this.strokeWidth, i);
    }

    public final void setStrokeColorId(int i) {
        setStrokeColor(getColor(i));
    }

    public final void setStrokeWidth(int i) {
        this.strokeWidth = i;
        getBg().setStroke(i, this.strokeColor);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderedBogTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        this.bg$delegate = C41219i.m119470b(new C35726a(this));
        setBackground(context.getDrawable(C10320i.bg_rect_border));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29089L0);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…able.BorderedBogTextView)");
        setupViews(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
