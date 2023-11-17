package p060e1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.core.content.res.C0820l;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: e1.b */
public class C5890b extends C6011z {

    /* renamed from: g */
    private static final float f18481g = ((float) Math.tan(Math.toRadians(35.0d)));

    /* renamed from: a */
    private float f18482a = Utils.FLOAT_EPSILON;

    /* renamed from: b */
    private float f18483b = Utils.FLOAT_EPSILON;

    /* renamed from: c */
    private float f18484c = 70.0f;

    /* renamed from: d */
    private float f18485d = Utils.FLOAT_EPSILON;

    /* renamed from: e */
    private float f18486e = Utils.FLOAT_EPSILON;

    /* renamed from: f */
    private float f18487f = f18481g;

    public C5890b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5930h0.f18561j);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        mo19254d(C0820l.m3067j(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, Utils.FLOAT_EPSILON));
        mo19253c(C0820l.m3067j(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, Utils.FLOAT_EPSILON));
        mo19252b(C0820l.m3067j(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: e */
    private static float m23699e(float f) {
        if (f >= Utils.FLOAT_EPSILON && f <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    /* renamed from: a */
    public Path mo19242a(float f, float f2, float f3, float f4) {
        boolean z;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        Path path = new Path();
        path.moveTo(f, f2);
        float f12 = f3 - f;
        float f13 = f4 - f2;
        float f14 = (f12 * f12) + (f13 * f13);
        float f15 = (f + f3) / 2.0f;
        float f16 = (f2 + f4) / 2.0f;
        float f17 = 0.25f * f14;
        if (f2 > f4) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f12) < Math.abs(f13)) {
            float abs = Math.abs(f14 / (f13 * 2.0f));
            if (z) {
                f7 = abs + f4;
                f6 = f3;
            } else {
                f7 = abs + f2;
                f6 = f;
            }
            f5 = this.f18486e;
        } else {
            float f18 = f14 / (f12 * 2.0f);
            if (z) {
                f9 = f2;
                f8 = f18 + f;
            } else {
                f8 = f3 - f18;
                f9 = f4;
            }
            f5 = this.f18485d;
        }
        float f19 = f17 * f5 * f5;
        float f22 = f15 - f6;
        float f23 = f16 - f7;
        float f24 = (f22 * f22) + (f23 * f23);
        float f25 = this.f18487f;
        float f26 = f17 * f25 * f25;
        if (f24 >= f19) {
            if (f24 > f26) {
                f19 = f26;
            } else {
                f19 = 0.0f;
            }
        }
        if (f19 != Utils.FLOAT_EPSILON) {
            float sqrt = (float) Math.sqrt((double) (f19 / f24));
            f6 = ((f6 - f15) * sqrt) + f15;
            f7 = f16 + (sqrt * (f7 - f16));
        }
        path.cubicTo((f + f6) / 2.0f, (f2 + f7) / 2.0f, (f6 + f3) / 2.0f, (f7 + f4) / 2.0f, f3, f4);
        return path;
    }

    /* renamed from: b */
    public void mo19252b(float f) {
        this.f18484c = f;
        this.f18487f = m23699e(f);
    }

    /* renamed from: c */
    public void mo19253c(float f) {
        this.f18482a = f;
        this.f18485d = m23699e(f);
    }

    /* renamed from: d */
    public void mo19254d(float f) {
        this.f18483b = f;
        this.f18486e = m23699e(f);
    }
}
