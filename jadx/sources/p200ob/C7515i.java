package p200ob;

/* renamed from: ob.i */
public abstract class C7515i {

    /* renamed from: a */
    private static C7515i f21927a = new C7512f();

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0076  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m28580a(p200ob.C7508b r10, float[] r11) {
        /*
            int r0 = r10.mo21982l()
            int r10 = r10.mo21978h()
            int r1 = r11.length
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r5 = r2
            r4 = r3
        L_0x000e:
            r6 = 0
            r7 = -1
            if (r4 >= r1) goto L_0x0049
            if (r5 == 0) goto L_0x0049
            r5 = r11[r4]
            int r5 = (int) r5
            int r8 = r4 + 1
            r9 = r11[r8]
            int r9 = (int) r9
            if (r5 < r7) goto L_0x0044
            if (r5 > r0) goto L_0x0044
            if (r9 < r7) goto L_0x0044
            if (r9 > r10) goto L_0x0044
            if (r5 != r7) goto L_0x002a
            r11[r4] = r6
        L_0x0028:
            r5 = r2
            goto L_0x0033
        L_0x002a:
            if (r5 != r0) goto L_0x0032
            int r5 = r0 + -1
            float r5 = (float) r5
            r11[r4] = r5
            goto L_0x0028
        L_0x0032:
            r5 = r3
        L_0x0033:
            if (r9 != r7) goto L_0x0039
            r11[r8] = r6
        L_0x0037:
            r5 = r2
            goto L_0x0041
        L_0x0039:
            if (r9 != r10) goto L_0x0041
            int r5 = r10 + -1
            float r5 = (float) r5
            r11[r8] = r5
            goto L_0x0037
        L_0x0041:
            int r4 = r4 + 2
            goto L_0x000e
        L_0x0044:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x0049:
            int r1 = r11.length
            int r1 = r1 + -2
            r4 = r2
        L_0x004d:
            if (r1 < 0) goto L_0x0086
            if (r4 == 0) goto L_0x0086
            r4 = r11[r1]
            int r4 = (int) r4
            int r5 = r1 + 1
            r8 = r11[r5]
            int r8 = (int) r8
            if (r4 < r7) goto L_0x0081
            if (r4 > r0) goto L_0x0081
            if (r8 < r7) goto L_0x0081
            if (r8 > r10) goto L_0x0081
            if (r4 != r7) goto L_0x0067
            r11[r1] = r6
        L_0x0065:
            r4 = r2
            goto L_0x0070
        L_0x0067:
            if (r4 != r0) goto L_0x006f
            int r4 = r0 + -1
            float r4 = (float) r4
            r11[r1] = r4
            goto L_0x0065
        L_0x006f:
            r4 = r3
        L_0x0070:
            if (r8 != r7) goto L_0x0076
            r11[r5] = r6
        L_0x0074:
            r4 = r2
            goto L_0x007e
        L_0x0076:
            if (r8 != r10) goto L_0x007e
            int r4 = r10 + -1
            float r4 = (float) r4
            r11[r5] = r4
            goto L_0x0074
        L_0x007e:
            int r1 = r1 + -2
            goto L_0x004d
        L_0x0081:
            com.google.zxing.NotFoundException r10 = com.google.zxing.NotFoundException.m23155a()
            throw r10
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p200ob.C7515i.m28580a(ob.b, float[]):void");
    }

    /* renamed from: b */
    public static C7515i m28581b() {
        return f21927a;
    }

    /* renamed from: c */
    public abstract C7508b mo22007c(C7508b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    /* renamed from: d */
    public abstract C7508b mo22008d(C7508b bVar, int i, int i2, C7517k kVar);
}
