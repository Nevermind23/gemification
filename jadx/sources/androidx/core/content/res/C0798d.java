package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Shader;
import android.util.Log;

/* renamed from: androidx.core.content.res.d */
public final class C0798d {

    /* renamed from: a */
    private final Shader f3421a;

    /* renamed from: b */
    private final ColorStateList f3422b;

    /* renamed from: c */
    private int f3423c;

    private C0798d(Shader shader, ColorStateList colorStateList, int i) {
        this.f3421a = shader;
        this.f3422b = colorStateList;
        this.f3423c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.res.C0798d m2987a(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0008:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x0013
            r3 = 1
            if (r1 == r3) goto L_0x0013
            goto L_0x0008
        L_0x0013:
            if (r1 != r2) goto L_0x005c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0053
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0035
            android.content.res.ColorStateList r4 = androidx.core.content.res.C0797c.m2980b(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = m2989c(r4)
            return r4
        L_0x0035:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L_0x0053:
            android.graphics.Shader r4 = androidx.core.content.res.C0805f.m3020b(r4, r5, r0, r6)
            androidx.core.content.res.d r4 = m2990d(r4)
            return r4
        L_0x005c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0798d.m2987a(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.core.content.res.d");
    }

    /* renamed from: b */
    static C0798d m2988b(int i) {
        return new C0798d((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    static C0798d m2989c(ColorStateList colorStateList) {
        return new C0798d((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0798d m2990d(Shader shader) {
        return new C0798d(shader, (ColorStateList) null, 0);
    }

    /* renamed from: g */
    public static C0798d m2991g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m2987a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int mo3262e() {
        return this.f3423c;
    }

    /* renamed from: f */
    public Shader mo3263f() {
        return this.f3421a;
    }

    /* renamed from: h */
    public boolean mo3264h() {
        return this.f3421a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f3422b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3265i() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f3421a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f3422b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0798d.mo3265i():boolean");
    }

    /* renamed from: j */
    public boolean mo3266j(int[] iArr) {
        if (mo3265i()) {
            ColorStateList colorStateList = this.f3422b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3423c) {
                this.f3423c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo3267k(int i) {
        this.f3423c = i;
    }

    /* renamed from: l */
    public boolean mo3268l() {
        return mo3264h() || this.f3423c != 0;
    }
}
