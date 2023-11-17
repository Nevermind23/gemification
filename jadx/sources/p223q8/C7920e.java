package p223q8;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: q8.e */
public class C7920e extends C7919d {

    /* renamed from: a */
    float f22872a = -1.0f;

    /* renamed from: a */
    public void mo22922a(C7937m mVar, float f, float f2, float f3) {
        mVar.mo23023o(Utils.FLOAT_EPSILON, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        mVar.mo23021m((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
