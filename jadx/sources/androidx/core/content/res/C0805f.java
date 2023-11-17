package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p266u.C8436d;

/* renamed from: androidx.core.content.res.f */
abstract class C0805f {
    /* renamed from: a */
    private static C0806a m3019a(C0806a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new C0806a(i, i3, i2);
        }
        return new C0806a(i, i2);
    }

    /* renamed from: b */
    static Shader m3020b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray s = C0820l.m3076s(resources, theme2, attributeSet, C8436d.f23947A);
            float j = C0820l.m3067j(s, xmlPullParser2, "startX", C8436d.f23956J, Utils.FLOAT_EPSILON);
            float j2 = C0820l.m3067j(s, xmlPullParser2, "startY", C8436d.f23957K, Utils.FLOAT_EPSILON);
            float j3 = C0820l.m3067j(s, xmlPullParser2, "endX", C8436d.f23958L, Utils.FLOAT_EPSILON);
            float j4 = C0820l.m3067j(s, xmlPullParser2, "endY", C8436d.f23959M, Utils.FLOAT_EPSILON);
            float j5 = C0820l.m3067j(s, xmlPullParser2, "centerX", C8436d.f23951E, Utils.FLOAT_EPSILON);
            float j6 = C0820l.m3067j(s, xmlPullParser2, "centerY", C8436d.f23952F, Utils.FLOAT_EPSILON);
            int k = C0820l.m3068k(s, xmlPullParser2, "type", C8436d.f23950D, 0);
            int f = C0820l.m3063f(s, xmlPullParser2, "startColor", C8436d.f23948B, 0);
            boolean r = C0820l.m3075r(xmlPullParser2, "centerColor");
            int f2 = C0820l.m3063f(s, xmlPullParser2, "centerColor", C8436d.f23955I, 0);
            int f3 = C0820l.m3063f(s, xmlPullParser2, "endColor", C8436d.f23949C, 0);
            int k2 = C0820l.m3068k(s, xmlPullParser2, "tileMode", C8436d.f23954H, 0);
            float f4 = j5;
            float j7 = C0820l.m3067j(s, xmlPullParser2, "gradientRadius", C8436d.f23953G, Utils.FLOAT_EPSILON);
            s.recycle();
            C0806a a = m3019a(m3021c(resources, xmlPullParser, attributeSet, theme), f, f3, r, f2);
            if (k == 1) {
                float f5 = f4;
                if (j7 > Utils.FLOAT_EPSILON) {
                    int[] iArr = a.f3435a;
                    return new RadialGradient(f5, j6, j7, iArr, a.f3436b, m3022d(k2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k != 2) {
                return new LinearGradient(j, j2, j3, j4, a.f3435a, a.f3436b, m3022d(k2));
            } else {
                return new SweepGradient(f4, j6, a.f3435a, a.f3436b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.C0805f.C0806a m3021c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r10.next()
            if (r3 == r1) goto L_0x0081
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0081
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = p266u.C8436d.f23960N
            android.content.res.TypedArray r3 = androidx.core.content.res.C0820l.m3076s(r9, r12, r11, r3)
            int r5 = p266u.C8436d.f23961O
            boolean r6 = r3.hasValue(r5)
            int r7 = p266u.C8436d.f23962P
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x0066:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L_0x0081:
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x008d
            androidx.core.content.res.f$a r9 = new androidx.core.content.res.f$a
            r9.<init>((java.util.List) r4, (java.util.List) r2)
            return r9
        L_0x008d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0805f.m3021c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f$a");
    }

    /* renamed from: d */
    private static Shader.TileMode m3022d(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: androidx.core.content.res.f$a */
    static final class C0806a {

        /* renamed from: a */
        final int[] f3435a;

        /* renamed from: b */
        final float[] f3436b;

        C0806a(List list, List list2) {
            int size = list.size();
            this.f3435a = new int[size];
            this.f3436b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f3435a[i] = ((Integer) list.get(i)).intValue();
                this.f3436b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        C0806a(int i, int i2) {
            this.f3435a = new int[]{i, i2};
            this.f3436b = new float[]{Utils.FLOAT_EPSILON, 1.0f};
        }

        C0806a(int i, int i2, int i3) {
            this.f3435a = new int[]{i, i2, i3};
            this.f3436b = new float[]{Utils.FLOAT_EPSILON, 0.5f, 1.0f};
        }
    }
}
