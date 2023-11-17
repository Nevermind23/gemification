package com.facetec.sdk;

/* renamed from: com.facetec.sdk.kg */
public abstract class C3301kg implements Runnable {

    /* renamed from: d */
    private static byte[] f10833d = {46, 104, 59, 37, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};

    /* renamed from: e */
    public static final int f10834e = 115;

    /* renamed from: b */
    private String f10835b;

    public C3301kg(String str, Object... objArr) {
        this.f10835b = C3303ki.m13262d(str, objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13235f(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 12
            int r9 = 16 - r9
            int r8 = r8 * 3
            int r8 = 16 - r8
            byte[] r0 = f10833d
            int r7 = r7 * 7
            int r7 = r7 + 99
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r7 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L_0x0036
        L_0x001a:
            r3 = r2
            r6 = r9
            r9 = r7
        L_0x001d:
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L_0x002d
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L_0x002d:
            byte r3 = r0[r7]
            r6 = r10
            r10 = r7
            r7 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L_0x0036:
            int r9 = r9 + r8
            int r8 = r10 + 1
            int r9 = r9 + 2
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3301kg.m13235f(int, byte, byte, java.lang.Object[]):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo9571b();

    public final void run() {
        Throwable cause;
        try {
            byte b = (byte) f10833d[15];
            byte b2 = (byte) (b - 1);
            Object[] objArr = new Object[1];
            m13235f(b, b2, (byte) b2, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b3 = f10833d[15];
            byte b4 = (byte) b3;
            Object[] objArr2 = new Object[1];
            m13235f((byte) (b3 - 1), b4, (byte) b4, objArr2);
            String name = ((Thread) cls.getMethod((String) objArr2[0], (Class[]) null).invoke((Object) null, (Object[]) null)).getName();
            try {
                byte b5 = (byte) f10833d[15];
                byte b6 = (byte) (b5 - 1);
                Object[] objArr3 = new Object[1];
                m13235f(b5, b6, (byte) b6, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                byte b7 = f10833d[15];
                byte b8 = (byte) b7;
                Object[] objArr4 = new Object[1];
                m13235f((byte) (b7 - 1), b8, (byte) b8, objArr4);
                ((Thread) cls2.getMethod((String) objArr4[0], (Class[]) null).invoke((Object) null, (Object[]) null)).setName(this.f10835b);
                try {
                    mo9571b();
                    try {
                        byte b9 = (byte) f10833d[15];
                        byte b12 = (byte) (b9 - 1);
                        Object[] objArr5 = new Object[1];
                        m13235f(b9, b12, (byte) b12, objArr5);
                        Class<?> cls3 = Class.forName((String) objArr5[0]);
                        byte b13 = f10833d[15];
                        byte b14 = (byte) b13;
                        Object[] objArr6 = new Object[1];
                        m13235f((byte) (b13 - 1), b14, (byte) b14, objArr6);
                        ((Thread) cls3.getMethod((String) objArr6[0], (Class[]) null).invoke((Object) null, (Object[]) null)).setName(name);
                    } catch (Throwable th) {
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            } finally {
                cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
            }
        } finally {
            Throwable cause3 = th.getCause();
            if (cause3 != null) {
                throw cause3;
            }
        }
    }
}
