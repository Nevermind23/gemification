package p060e1;

import android.animation.TypeEvaluator;

/* renamed from: e1.o */
class C5972o implements TypeEvaluator {

    /* renamed from: a */
    private float[] f18674a;

    C5972o(float[] fArr) {
        this.f18674a = fArr;
    }

    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f18674a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
