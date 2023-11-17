package p124j0;

import android.view.animation.Interpolator;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: j0.d */
abstract class C6635d implements Interpolator {

    /* renamed from: a */
    private final float[] f20142a;

    /* renamed from: b */
    private final float f20143b;

    protected C6635d(float[] fArr) {
        this.f20142a = fArr;
        this.f20143b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        float[] fArr = this.f20142a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f20143b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f20142a;
        float f4 = fArr2[min];
        return f4 + (f3 * (fArr2[min + 1] - f4));
    }
}
