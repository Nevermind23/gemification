package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.github.mikephil.charting.utils.Utils;
import g91.C32355x0;
import p366bk.C10319h;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.RoundCornerFrameLayout */
public class RoundCornerFrameLayout extends FrameLayout {
    private float cornerRadius;
    private final Path stencilPath;

    public RoundCornerFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.stencilPath);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.stencilPath.reset();
        Path path = this.stencilPath;
        RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) i, (float) i2);
        float f = this.cornerRadius;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.stencilPath.close();
    }

    public RoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.stencilPath = new Path();
        if (!isInEditMode()) {
            this.cornerRadius = (float) C32355x0.m95516g(C10319h.product_card_corner_radius);
        }
    }
}
