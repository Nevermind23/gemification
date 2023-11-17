package com.facetec.sdk;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.ne */
public class C3463ne {

    /* renamed from: b */
    public static final C3463ne f11315b = new C3463ne() {
        /* renamed from: b */
        public final C3463ne mo9912b(long j) {
            return this;
        }

        /* renamed from: f */
        public final void mo9918f() {
        }

        /* renamed from: b */
        public final C3463ne mo9913b(long j, TimeUnit timeUnit) {
            return this;
        }
    };

    /* renamed from: c */
    public static final int f11316c = 0;

    /* renamed from: i */
    private static byte[] f11317i;

    /* renamed from: a */
    private boolean f11318a;

    /* renamed from: d */
    private long f11319d;

    /* renamed from: e */
    private long f11320e;

    static {
        m13860i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13859h(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 12
            int r7 = 16 - r7
            int r9 = r9 * 7
            int r9 = 106 - r9
            int r8 = r8 * 3
            int r8 = r8 + 13
            byte[] r0 = f11317i
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r3 = r7
            r9 = r8
            r4 = r2
            goto L_0x002c
        L_0x0017:
            r3 = r2
        L_0x0018:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L_0x0027
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L_0x0027:
            byte r3 = r0[r7]
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x002c:
            int r7 = r7 + 1
            int r8 = r8 - r3
            int r8 = r8 + 2
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3463ne.m13859h(int, short, byte, java.lang.Object[]):void");
    }

    /* renamed from: i */
    static void m13860i() {
        f11317i = new byte[]{37, 99, -4, 93, -16, 5, 2, 15, -7, -4, 34, -18, -8, 15, 6, -1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -36, -18, -8, 15, 6, -1};
        f11316c = 222;
    }

    /* renamed from: a_ */
    public long mo9911a_() {
        return this.f11320e;
    }

    /* renamed from: b */
    public C3463ne mo9913b(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        } else if (timeUnit != null) {
            this.f11320e = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: b_ */
    public long mo9914b_() {
        if (this.f11318a) {
            return this.f11319d;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: c_ */
    public C3463ne mo9915c_() {
        this.f11320e = 0;
        return this;
    }

    /* renamed from: d_ */
    public C3463ne mo9916d_() {
        this.f11318a = false;
        return this;
    }

    /* renamed from: e_ */
    public boolean mo9917e_() {
        return this.f11318a;
    }

    /* renamed from: f */
    public void mo9918f() {
        if (Thread.interrupted()) {
            try {
                byte b = f11317i[15];
                byte b2 = (byte) (-b);
                Object[] objArr = new Object[1];
                m13859h((byte) (b + 1), b2, (byte) (b2 - 1), objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                byte b3 = f11317i[15];
                byte b4 = (byte) (-b3);
                Object[] objArr2 = new Object[1];
                m13859h(b4, (byte) (b4 - 1), (byte) (-b3), objArr2);
                ((Thread) cls.getMethod((String) objArr2[0], (Class[]) null).invoke((Object) null, (Object[]) null)).interrupt();
                throw new InterruptedIOException("interrupted");
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else if (this.f11318a && this.f11319d - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: b */
    public C3463ne mo9912b(long j) {
        this.f11318a = true;
        this.f11319d = j;
        return this;
    }
}
