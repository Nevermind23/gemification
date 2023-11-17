package p060e1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.core.content.res.C0820l;
import androidx.core.graphics.C0856f;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: e1.a0 */
public class C5886a0 extends C6011z {

    /* renamed from: a */
    private Path f18475a;

    /* renamed from: b */
    private final Path f18476b = new Path();

    /* renamed from: c */
    private final Matrix f18477c = new Matrix();

    public C5886a0(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5930h0.f18562k);
        try {
            String m = C0820l.m3070m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m != null) {
                mo19243c(C0856f.m3199e(m));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private static float m23681b(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: a */
    public Path mo19242a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b = m23681b(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.f18477c.setScale(b, b);
        this.f18477c.postRotate((float) Math.toDegrees(atan2));
        this.f18477c.postTranslate(f, f2);
        Path path = new Path();
        this.f18476b.transform(this.f18477c, path);
        return path;
    }

    /* renamed from: c */
    public void mo19243c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(Utils.FLOAT_EPSILON, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f18477c.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b = 1.0f / m23681b(f5, f6);
        this.f18477c.postScale(b, b);
        this.f18477c.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.f18477c, this.f18476b);
        this.f18475a = path;
    }
}
