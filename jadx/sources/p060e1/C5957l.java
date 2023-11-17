package p060e1;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: e1.l */
public class C5957l extends C5987p1 {

    /* renamed from: b */
    private float f18648b = 3.0f;

    /* renamed from: h */
    private static float m23908h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: c */
    public long mo19261c(ViewGroup viewGroup, C5936i0 i0Var, C5989q0 q0Var, C5989q0 q0Var2) {
        int i;
        int i2;
        int i3;
        if (q0Var == null && q0Var2 == null) {
            return 0;
        }
        if (q0Var2 == null || mo19426e(q0Var) == 0) {
            i = -1;
        } else {
            q0Var = q0Var2;
            i = 1;
        }
        int f = mo19427f(q0Var);
        int g = mo19428g(q0Var);
        Rect H = i0Var.mo19318H();
        if (H != null) {
            i3 = H.centerX();
            i2 = H.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float h = m23908h((float) f, (float) g, (float) i3, (float) i2) / m23908h(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long G = i0Var.mo19317G();
        if (G < 0) {
            G = 300;
        }
        return (long) Math.round((((float) (G * ((long) i))) / this.f18648b) * h);
    }
}
