package com.facetec.sdk;

import com.facetec.sdk.C3358lk;
import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.facetec.sdk.lu */
public final class C3392lu implements Closeable {

    /* renamed from: a */
    private static final Logger f11187a = Logger.getLogger(C3388lr.class.getName());

    /* renamed from: b */
    private final C3434mp f11188b;

    /* renamed from: c */
    int f11189c = 16384;

    /* renamed from: d */
    private final C3431mm f11190d;

    /* renamed from: e */
    private final boolean f11191e;

    /* renamed from: g */
    private C3358lk.C3359c f11192g;

    /* renamed from: i */
    private boolean f11193i;

    C3392lu(C3434mp mpVar, boolean z) {
        this.f11188b = mpVar;
        this.f11191e = z;
        C3431mm mmVar = new C3431mm();
        this.f11190d = mmVar;
        this.f11192g = new C3358lk.C3359c(mmVar);
    }

    /* renamed from: a */
    public final synchronized void mo9767a() {
        if (this.f11193i) {
            throw new IOException("closed");
        } else if (this.f11191e) {
            Logger logger = f11187a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3303ki.m13262d(">> CONNECTION %s", C3388lr.f11174a.mo9894b()));
            }
            this.f11188b.mo9861e(C3388lr.f11174a.mo9909j());
            this.f11188b.flush();
        }
    }

    /* renamed from: b */
    public final synchronized void mo9770b(int i, C3361ll llVar) {
        if (this.f11193i) {
            throw new IOException("closed");
        } else if (llVar.f11050f != -1) {
            m13528e(i, 4, (byte) 3, (byte) 0);
            this.f11188b.mo9867f(llVar.f11050f);
            this.f11188b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo9772c(boolean r18, int r19, java.util.List<com.facetec.sdk.C3362lm> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            monitor-enter(r17)
            boolean r2 = r1.f11193i     // Catch:{ all -> 0x015b }
            if (r2 != 0) goto L_0x0153
            if (r2 != 0) goto L_0x014b
            com.facetec.sdk.lk$c r2 = r1.f11192g     // Catch:{ all -> 0x015b }
            boolean r3 = r2.f11022c     // Catch:{ all -> 0x015b }
            r4 = 0
            if (r3 == 0) goto L_0x002b
            int r3 = r2.f11023d     // Catch:{ all -> 0x015b }
            int r5 = r2.f11020a     // Catch:{ all -> 0x015b }
            r6 = 32
            r7 = 31
            if (r3 >= r5) goto L_0x001f
            r2.mo9714c(r3, r7, r6)     // Catch:{ all -> 0x015b }
        L_0x001f:
            r2.f11022c = r4     // Catch:{ all -> 0x015b }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.f11023d = r3     // Catch:{ all -> 0x015b }
            int r3 = r2.f11020a     // Catch:{ all -> 0x015b }
            r2.mo9714c(r3, r7, r6)     // Catch:{ all -> 0x015b }
        L_0x002b:
            int r3 = r20.size()     // Catch:{ all -> 0x015b }
            r5 = r4
        L_0x0030:
            r6 = 1
            if (r5 >= r3) goto L_0x00fc
            r7 = r20
            java.lang.Object r8 = r7.get(r5)     // Catch:{ all -> 0x015b }
            com.facetec.sdk.lm r8 = (com.facetec.sdk.C3362lm) r8     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mq r9 = r8.f11057f     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mq r9 = r9.mo9907h()     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mq r10 = r8.f11058i     // Catch:{ all -> 0x015b }
            java.util.Map<com.facetec.sdk.mq, java.lang.Integer> r11 = com.facetec.sdk.C3358lk.f11018b     // Catch:{ all -> 0x015b }
            java.lang.Object r11 = r11.get(r9)     // Catch:{ all -> 0x015b }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ all -> 0x015b }
            r12 = -1
            if (r11 == 0) goto L_0x007d
            int r11 = r11.intValue()     // Catch:{ all -> 0x015b }
            int r11 = r11 + r6
            if (r11 <= r6) goto L_0x007a
            r13 = 8
            if (r11 >= r13) goto L_0x007a
            com.facetec.sdk.lm[] r13 = com.facetec.sdk.C3358lk.f11019d     // Catch:{ all -> 0x015b }
            int r14 = r11 + -1
            r14 = r13[r14]     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mq r14 = r14.f11058i     // Catch:{ all -> 0x015b }
            boolean r14 = com.facetec.sdk.C3303ki.m13274e((java.lang.Object) r14, (java.lang.Object) r10)     // Catch:{ all -> 0x015b }
            if (r14 == 0) goto L_0x0068
            goto L_0x007e
        L_0x0068:
            r13 = r13[r11]     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mq r13 = r13.f11058i     // Catch:{ all -> 0x015b }
            boolean r13 = com.facetec.sdk.C3303ki.m13274e((java.lang.Object) r13, (java.lang.Object) r10)     // Catch:{ all -> 0x015b }
            if (r13 == 0) goto L_0x007a
            int r13 = r11 + 1
            r16 = r13
            r13 = r11
            r11 = r16
            goto L_0x007f
        L_0x007a:
            r13 = r11
            r11 = r12
            goto L_0x007f
        L_0x007d:
            r11 = r12
        L_0x007e:
            r13 = r11
        L_0x007f:
            if (r11 != r12) goto L_0x00b7
            int r14 = r2.f11029j     // Catch:{ all -> 0x015b }
            int r14 = r14 + r6
            com.facetec.sdk.lm[] r6 = r2.f11027h     // Catch:{ all -> 0x015b }
            int r6 = r6.length     // Catch:{ all -> 0x015b }
        L_0x0087:
            if (r14 >= r6) goto L_0x00b7
            com.facetec.sdk.lm[] r15 = r2.f11027h     // Catch:{ all -> 0x015b }
            r15 = r15[r14]     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mq r15 = r15.f11057f     // Catch:{ all -> 0x015b }
            boolean r15 = com.facetec.sdk.C3303ki.m13274e((java.lang.Object) r15, (java.lang.Object) r9)     // Catch:{ all -> 0x015b }
            if (r15 == 0) goto L_0x00b4
            com.facetec.sdk.lm[] r15 = r2.f11027h     // Catch:{ all -> 0x015b }
            r15 = r15[r14]     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mq r15 = r15.f11058i     // Catch:{ all -> 0x015b }
            boolean r15 = com.facetec.sdk.C3303ki.m13274e((java.lang.Object) r15, (java.lang.Object) r10)     // Catch:{ all -> 0x015b }
            if (r15 == 0) goto L_0x00aa
            int r6 = r2.f11029j     // Catch:{ all -> 0x015b }
            int r14 = r14 - r6
            com.facetec.sdk.lm[] r6 = com.facetec.sdk.C3358lk.f11019d     // Catch:{ all -> 0x015b }
            int r6 = r6.length     // Catch:{ all -> 0x015b }
            int r11 = r14 + r6
            goto L_0x00b7
        L_0x00aa:
            if (r13 != r12) goto L_0x00b4
            int r13 = r2.f11029j     // Catch:{ all -> 0x015b }
            int r13 = r14 - r13
            com.facetec.sdk.lm[] r15 = com.facetec.sdk.C3358lk.f11019d     // Catch:{ all -> 0x015b }
            int r15 = r15.length     // Catch:{ all -> 0x015b }
            int r13 = r13 + r15
        L_0x00b4:
            int r14 = r14 + 1
            goto L_0x0087
        L_0x00b7:
            if (r11 == r12) goto L_0x00c1
            r6 = 127(0x7f, float:1.78E-43)
            r8 = 128(0x80, float:1.794E-43)
            r2.mo9714c(r11, r6, r8)     // Catch:{ all -> 0x015b }
            goto L_0x00f8
        L_0x00c1:
            r6 = 64
            if (r13 != r12) goto L_0x00d4
            com.facetec.sdk.mm r11 = r2.f11024e     // Catch:{ all -> 0x015b }
            r11.mo9870g((int) r6)     // Catch:{ all -> 0x015b }
            r2.mo9711a(r9)     // Catch:{ all -> 0x015b }
            r2.mo9711a(r10)     // Catch:{ all -> 0x015b }
            r2.mo9715d(r8)     // Catch:{ all -> 0x015b }
            goto L_0x00f8
        L_0x00d4:
            com.facetec.sdk.mq r11 = com.facetec.sdk.C3362lm.f11051a     // Catch:{ all -> 0x015b }
            boolean r11 = r9.mo9896b((com.facetec.sdk.C3435mq) r11)     // Catch:{ all -> 0x015b }
            if (r11 == 0) goto L_0x00ed
            com.facetec.sdk.mq r11 = com.facetec.sdk.C3362lm.f11056g     // Catch:{ all -> 0x015b }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x015b }
            if (r9 != 0) goto L_0x00ed
            r6 = 15
            r2.mo9714c(r13, r6, r4)     // Catch:{ all -> 0x015b }
            r2.mo9711a(r10)     // Catch:{ all -> 0x015b }
            goto L_0x00f8
        L_0x00ed:
            r9 = 63
            r2.mo9714c(r13, r9, r6)     // Catch:{ all -> 0x015b }
            r2.mo9711a(r10)     // Catch:{ all -> 0x015b }
            r2.mo9715d(r8)     // Catch:{ all -> 0x015b }
        L_0x00f8:
            int r5 = r5 + 1
            goto L_0x0030
        L_0x00fc:
            com.facetec.sdk.mm r2 = r1.f11190d     // Catch:{ all -> 0x015b }
            long r2 = r2.mo9835a()     // Catch:{ all -> 0x015b }
            int r5 = r1.f11189c     // Catch:{ all -> 0x015b }
            long r7 = (long) r5     // Catch:{ all -> 0x015b }
            long r7 = java.lang.Math.min(r7, r2)     // Catch:{ all -> 0x015b }
            int r5 = (int) r7     // Catch:{ all -> 0x015b }
            long r7 = (long) r5     // Catch:{ all -> 0x015b }
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r10 = 4
            if (r9 != 0) goto L_0x0112
            r11 = r10
            goto L_0x0113
        L_0x0112:
            r11 = r4
        L_0x0113:
            if (r18 == 0) goto L_0x0118
            r11 = r11 | 1
            byte r11 = (byte) r11     // Catch:{ all -> 0x015b }
        L_0x0118:
            r1.m13528e(r0, r5, r6, r11)     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mp r5 = r1.f11188b     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mm r6 = r1.f11190d     // Catch:{ all -> 0x015b }
            r5.mo9671b(r6, r7)     // Catch:{ all -> 0x015b }
            if (r9 <= 0) goto L_0x0149
            long r2 = r2 - r7
        L_0x0125:
            r5 = 0
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0149
            int r7 = r1.f11189c     // Catch:{ all -> 0x015b }
            long r7 = (long) r7     // Catch:{ all -> 0x015b }
            long r7 = java.lang.Math.min(r7, r2)     // Catch:{ all -> 0x015b }
            int r7 = (int) r7     // Catch:{ all -> 0x015b }
            long r8 = (long) r7     // Catch:{ all -> 0x015b }
            long r2 = r2 - r8
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x013b
            r5 = r10
            goto L_0x013c
        L_0x013b:
            r5 = r4
        L_0x013c:
            r6 = 9
            r1.m13528e(r0, r7, r6, r5)     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mp r5 = r1.f11188b     // Catch:{ all -> 0x015b }
            com.facetec.sdk.mm r6 = r1.f11190d     // Catch:{ all -> 0x015b }
            r5.mo9671b(r6, r8)     // Catch:{ all -> 0x015b }
            goto L_0x0125
        L_0x0149:
            monitor-exit(r17)
            return
        L_0x014b:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x015b }
            java.lang.String r2 = "closed"
            r0.<init>(r2)     // Catch:{ all -> 0x015b }
            throw r0     // Catch:{ all -> 0x015b }
        L_0x0153:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x015b }
            java.lang.String r2 = "closed"
            r0.<init>(r2)     // Catch:{ all -> 0x015b }
            throw r0     // Catch:{ all -> 0x015b }
        L_0x015b:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3392lu.mo9772c(boolean, int, java.util.List):void");
    }

    public final synchronized void close() {
        this.f11193i = true;
        this.f11188b.close();
    }

    /* renamed from: d */
    public final synchronized void mo9775d(boolean z, int i, C3431mm mmVar, int i2) {
        if (!this.f11193i) {
            m13528e(i, i2, (byte) 0, z ? (byte) 1 : 0);
            if (i2 > 0) {
                this.f11188b.mo9671b(mmVar, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: e */
    public final synchronized void mo9777e(C3391lt ltVar) {
        if (!this.f11193i) {
            int i = this.f11189c;
            if ((ltVar.f11186e & 32) != 0) {
                i = ltVar.f11185b[5];
            }
            this.f11189c = i;
            if (ltVar.mo9765d() != -1) {
                C3358lk.C3359c cVar = this.f11192g;
                int d = ltVar.mo9765d();
                cVar.f11021b = d;
                int min = Math.min(d, 16384);
                int i2 = cVar.f11020a;
                if (i2 != min) {
                    if (min < i2) {
                        cVar.f11023d = Math.min(cVar.f11023d, min);
                    }
                    cVar.f11022c = true;
                    cVar.f11020a = min;
                    int i3 = cVar.f11025f;
                    if (min < i3) {
                        if (min == 0) {
                            cVar.mo9713c();
                        } else {
                            cVar.mo9712b(i3 - min);
                        }
                    }
                }
            }
            m13528e(0, 0, (byte) 4, (byte) 1);
            this.f11188b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: d */
    public final synchronized void mo9774d(boolean z, int i, int i2) {
        if (!this.f11193i) {
            m13528e(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f11188b.mo9867f(i);
            this.f11188b.mo9867f(i2);
            this.f11188b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo9769a(C3391lt ltVar) {
        if (!this.f11193i) {
            int i = 0;
            m13528e(0, Integer.bitCount(ltVar.f11186e) * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (ltVar.mo9764c(i)) {
                    this.f11188b.mo9876i(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f11188b.mo9867f(ltVar.mo9763b(i));
                }
                i++;
            }
            this.f11188b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: d */
    private static void m13527d(C3434mp mpVar, int i) {
        mpVar.mo9870g((i >>> 16) & C11051p3.f31759c);
        mpVar.mo9870g((i >>> 8) & C11051p3.f31759c);
        mpVar.mo9870g(i & C11051p3.f31759c);
    }

    /* renamed from: a */
    public final synchronized void mo9768a(int i, long j) {
        if (this.f11193i) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw C3388lr.m13517d("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            m13528e(i, 4, (byte) 8, (byte) 0);
            this.f11188b.mo9867f((int) j);
            this.f11188b.flush();
        }
    }

    /* renamed from: e */
    public final synchronized void mo9776e() {
        if (!this.f11193i) {
            this.f11188b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: e */
    private void m13528e(int i, int i2, byte b, byte b2) {
        Logger logger = f11187a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C3388lr.m13516c(false, i, i2, b, b2));
        }
        int i3 = this.f11189c;
        if (i2 > i3) {
            throw C3388lr.m13517d("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m13527d(this.f11188b, i2);
            this.f11188b.mo9870g(b & 255);
            this.f11188b.mo9870g(b2 & 255);
            this.f11188b.mo9867f(i & Integer.MAX_VALUE);
        } else {
            throw C3388lr.m13517d("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    public final synchronized void mo9771c(int i, C3361ll llVar, byte[] bArr) {
        if (this.f11193i) {
            throw new IOException("closed");
        } else if (llVar.f11050f != -1) {
            m13528e(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f11188b.mo9867f(i);
            this.f11188b.mo9867f(llVar.f11050f);
            if (bArr.length > 0) {
                this.f11188b.mo9861e(bArr);
            }
            this.f11188b.flush();
        } else {
            throw C3388lr.m13517d("errorCode.httpCode == -1", new Object[0]);
        }
    }
}
