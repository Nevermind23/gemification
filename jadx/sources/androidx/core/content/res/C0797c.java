package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p292w.C8720a;

/* renamed from: androidx.core.content.res.c */
public abstract class C0797c {

    /* renamed from: a */
    private static final ThreadLocal f3420a = new ThreadLocal();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m2979a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = m2980b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0797c.m2979a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: b */
    public static ColorStateList m2980b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m2983e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: c */
    private static TypedValue m2981c() {
        ThreadLocal threadLocal = f3420a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: d */
    public static ColorStateList m2982d(Resources resources, int i, Resources.Theme theme) {
        try {
            return m2979a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a8  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m2983e(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            int r3 = r18.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r8 = 0
        L_0x0013:
            int r9 = r18.next()
            if (r9 == r4) goto L_0x00ec
            int r10 = r18.getDepth()
            if (r10 >= r3) goto L_0x0022
            r11 = 3
            if (r9 == r11) goto L_0x00ec
        L_0x0022:
            r11 = 2
            if (r9 != r11) goto L_0x00e7
            if (r10 > r3) goto L_0x00e7
            java.lang.String r9 = r18.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0035
            goto L_0x00e7
        L_0x0035:
            int[] r9 = p266u.C8436d.f23964b
            android.content.res.TypedArray r9 = m2986h(r0, r2, r1, r9)
            int r10 = p266u.C8436d.f23965c
            r11 = -1
            int r12 = r9.getResourceId(r10, r11)
            r13 = -65281(0xffffffffffff00ff, float:NaN)
            if (r12 == r11) goto L_0x0061
            boolean r11 = m2984f(r0, r12)
            if (r11 != 0) goto L_0x0061
            android.content.res.XmlResourceParser r10 = r0.getXml(r12)     // Catch:{ Exception -> 0x005a }
            android.content.res.ColorStateList r10 = m2979a(r0, r10, r2)     // Catch:{ Exception -> 0x005a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x005a }
            goto L_0x0065
        L_0x005a:
            int r10 = p266u.C8436d.f23965c
            int r10 = r9.getColor(r10, r13)
            goto L_0x0065
        L_0x0061:
            int r10 = r9.getColor(r10, r13)
        L_0x0065:
            int r11 = p266u.C8436d.f23966d
            boolean r12 = r9.hasValue(r11)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x0074
            float r13 = r9.getFloat(r11, r13)
            goto L_0x0080
        L_0x0074:
            int r11 = p266u.C8436d.f23968f
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto L_0x0080
            float r13 = r9.getFloat(r11, r13)
        L_0x0080:
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 31
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 < r12) goto L_0x0095
            int r11 = p266u.C8436d.f23967e
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto L_0x0095
            float r11 = r9.getFloat(r11, r14)
            goto L_0x009b
        L_0x0095:
            int r11 = p266u.C8436d.f23969g
            float r11 = r9.getFloat(r11, r14)
        L_0x009b:
            r9.recycle()
            int r9 = r19.getAttributeCount()
            int[] r12 = new int[r9]
            r14 = 0
            r15 = 0
        L_0x00a6:
            if (r14 >= r9) goto L_0x00d2
            int r4 = r1.getAttributeNameResource(r14)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r4 == r7) goto L_0x00cc
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r4 == r7) goto L_0x00cc
            int r7 = p266u.C8433a.f23898a
            if (r4 == r7) goto L_0x00cc
            int r7 = p266u.C8433a.lStar
            if (r4 == r7) goto L_0x00cc
            int r7 = r15 + 1
            r0 = 0
            boolean r16 = r1.getAttributeBooleanValue(r14, r0)
            if (r16 == 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            int r4 = -r4
        L_0x00c9:
            r12[r15] = r4
            r15 = r7
        L_0x00cc:
            int r14 = r14 + 1
            r4 = 1
            r0 = r17
            goto L_0x00a6
        L_0x00d2:
            int[] r0 = android.util.StateSet.trimStateSet(r12, r15)
            int r4 = m2985g(r10, r13, r11)
            int[] r5 = androidx.core.content.res.C0807g.m3023a(r5, r8, r4)
            java.lang.Object[] r0 = androidx.core.content.res.C0807g.m3024b(r6, r8, r0)
            r6 = r0
            int[][] r6 = (int[][]) r6
            int r8 = r8 + 1
        L_0x00e7:
            r4 = 1
            r0 = r17
            goto L_0x0013
        L_0x00ec:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0797c.m2983e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: f */
    private static boolean m2984f(Resources resources, int i) {
        TypedValue c = m2981c();
        resources.getValue(i, c, true);
        int i2 = c.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static int m2985g(int i, float f, float f2) {
        boolean z;
        if (f2 < Utils.FLOAT_EPSILON || f2 > 100.0f) {
            z = false;
        } else {
            z = true;
        }
        if (f == 1.0f && !z) {
            return i;
        }
        int b = C8720a.m32478b((int) ((((float) Color.alpha(i)) * f) + 0.5f), 0, C11051p3.f31759c);
        if (z) {
            C0795a c = C0795a.m2956c(i);
            i = C0795a.m2960m(c.mo3257j(), c.mo3256i(), f2);
        }
        return (i & 16777215) | (b << 24);
    }

    /* renamed from: h */
    private static TypedArray m2986h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
