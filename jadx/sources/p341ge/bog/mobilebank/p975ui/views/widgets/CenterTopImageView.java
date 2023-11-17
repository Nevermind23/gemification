package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.CenterTopImageView */
public class CenterTopImageView extends ImageView {
    public CenterTopImageView(Context context) {
        super(context);
        setup();
    }

    private void setup() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4 = (float) (i3 - i);
        float f5 = (float) (i4 - i2);
        if (getDrawable() == null) {
            f = 0.0f;
        } else {
            f = (float) getDrawable().getIntrinsicWidth();
        }
        if (getDrawable() == null) {
            f2 = 0.0f;
        } else {
            f2 = (float) getDrawable().getIntrinsicHeight();
        }
        if (f > f4 || f2 > f5) {
            f3 = Math.max(f4 / f, f5 / f2);
        } else {
            f3 = 1.0f;
        }
        Matrix imageMatrix = getImageMatrix();
        imageMatrix.setScale(f3, f3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        setImageMatrix(imageMatrix);
        return super.setFrame(i, i2, i3, i4);
    }

    public CenterTopImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setup();
    }

    public CenterTopImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setup();
    }
}
