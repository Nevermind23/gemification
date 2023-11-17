package p026b8;

import android.animation.TypeEvaluator;

/* renamed from: b8.c */
public class C2172c implements TypeEvaluator {

    /* renamed from: a */
    private static final C2172c f6355a = new C2172c();

    /* renamed from: b */
    public static C2172c m8294b() {
        return f6355a;
    }

    /* renamed from: a */
    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((float) ((intValue >> 24) & C11051p3.f31759c)) / 255.0f;
        int intValue2 = num2.intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & C11051p3.f31759c)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & C11051p3.f31759c)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & C11051p3.f31759c)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & C11051p3.f31759c)) / 255.0f), 2.2d);
        float pow5 = pow3 + (f * (((float) Math.pow((double) (((float) (intValue2 & C11051p3.f31759c)) / 255.0f), 2.2d)) - pow3));
        return Integer.valueOf((Math.round(((float) Math.pow((double) (pow + ((pow4 - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((intValue2 >> 24) & C11051p3.f31759c)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((((float) Math.pow((double) (((float) ((intValue2 >> 8) & C11051p3.f31759c)) / 255.0f), 2.2d)) - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) pow5, 0.45454545454545453d)) * 255.0f));
    }
}
