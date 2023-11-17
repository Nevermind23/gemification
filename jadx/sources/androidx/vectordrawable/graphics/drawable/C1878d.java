package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;

/* renamed from: androidx.vectordrawable.graphics.drawable.d */
public class C1878d implements TypeEvaluator {

    /* renamed from: a */
    private static final C1878d f5660a = new C1878d();

    /* renamed from: a */
    public static C1878d m7330a() {
        return f5660a;
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((float) ((intValue >> 24) & C11051p3.f31759c)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & C11051p3.f31759c)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & C11051p3.f31759c)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & C11051p3.f31759c)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & C11051p3.f31759c)) / 255.0f), 2.2d);
        float pow5 = pow3 + (f * (((float) Math.pow((double) (((float) (intValue2 & C11051p3.f31759c)) / 255.0f), 2.2d)) - pow3));
        return Integer.valueOf((Math.round(((float) Math.pow((double) (pow + ((pow4 - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((intValue2 >> 24) & C11051p3.f31759c)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((((float) Math.pow((double) (((float) ((intValue2 >> 8) & C11051p3.f31759c)) / 255.0f), 2.2d)) - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) pow5, 0.45454545454545453d)) * 255.0f));
    }
}
