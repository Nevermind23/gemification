package p430gd;

import android.graphics.Rect;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import p416fd.C12861p;

/* renamed from: gd.l */
public class C12982l extends C12987q {

    /* renamed from: b */
    private static final String f38293b = "l";

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public float mo33776c(C12861p pVar, C12861p pVar2) {
        if (pVar.f38002d <= 0 || pVar.f38003e <= 0) {
            return Utils.FLOAT_EPSILON;
        }
        C12861p c = pVar.mo33531c(pVar2);
        float f = (((float) c.f38002d) * 1.0f) / ((float) pVar.f38002d);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = ((((float) c.f38002d) * 1.0f) / ((float) pVar2.f38002d)) + ((((float) c.f38003e) * 1.0f) / ((float) pVar2.f38003e));
        return f * ((1.0f / f2) / f2);
    }

    /* renamed from: d */
    public Rect mo33777d(C12861p pVar, C12861p pVar2) {
        C12861p c = pVar.mo33531c(pVar2);
        String str = f38293b;
        Log.i(str, "Preview: " + pVar + "; Scaled: " + c + "; Want: " + pVar2);
        int i = (c.f38002d - pVar2.f38002d) / 2;
        int i2 = (c.f38003e - pVar2.f38003e) / 2;
        return new Rect(-i, -i2, c.f38002d - i, c.f38003e - i2);
    }
}
