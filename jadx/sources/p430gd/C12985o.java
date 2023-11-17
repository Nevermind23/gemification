package p430gd;

import android.graphics.Rect;
import com.github.mikephil.charting.utils.Utils;
import p416fd.C12861p;

/* renamed from: gd.o */
public class C12985o extends C12987q {
    /* renamed from: e */
    private static float m49003e(float f) {
        return f < 1.0f ? 1.0f / f : f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo33776c(C12861p pVar, C12861p pVar2) {
        int i = pVar.f38002d;
        if (i <= 0 || pVar.f38003e <= 0) {
            return Utils.FLOAT_EPSILON;
        }
        float e = (1.0f / m49003e((((float) i) * 1.0f) / ((float) pVar2.f38002d))) / m49003e((((float) pVar.f38003e) * 1.0f) / ((float) pVar2.f38003e));
        float e2 = m49003e(((((float) pVar.f38002d) * 1.0f) / ((float) pVar.f38003e)) / ((((float) pVar2.f38002d) * 1.0f) / ((float) pVar2.f38003e)));
        return e * (((1.0f / e2) / e2) / e2);
    }

    /* renamed from: d */
    public Rect mo33777d(C12861p pVar, C12861p pVar2) {
        return new Rect(0, 0, pVar2.f38002d, pVar2.f38003e);
    }
}
