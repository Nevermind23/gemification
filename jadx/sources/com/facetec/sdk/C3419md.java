package com.facetec.sdk;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facetec.sdk.md */
public final class C3419md {

    /* renamed from: a */
    private static final String[] f11234a = new String[0];

    /* renamed from: b */
    private static final C3419md f11235b = new C3419md();

    /* renamed from: c */
    private static final String[] f11236c = {"*"};

    /* renamed from: d */
    private static final byte[] f11237d = {42};

    /* renamed from: e */
    public static final int f11238e = 0;

    /* renamed from: g */
    private static byte[] f11239g;

    /* renamed from: f */
    private final CountDownLatch f11240f = new CountDownLatch(1);

    /* renamed from: h */
    private byte[] f11241h;

    /* renamed from: i */
    private final AtomicBoolean f11242i = new AtomicBoolean(false);

    /* renamed from: j */
    private byte[] f11243j;

    static {
        m13604b();
    }

    /* renamed from: b */
    static void m13604b() {
        f11239g = new byte[]{88, -65, -96, -107, 16, -5, -2, -15, 7, 4, -34, 18, 8, -15, -6, 1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 36, 18, 8, -15, -6, 1};
        f11238e = 98;
    }

    /* renamed from: d */
    public static C3419md m13605d() {
        return f11235b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13607k(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 12
            int r9 = r9 + 4
            int r8 = r8 * 7
            int r8 = r8 + 99
            int r7 = r7 * 3
            int r7 = r7 + 13
            byte[] r0 = f11239g
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r8 = r7
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L_0x0036
        L_0x001a:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x001e:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L_0x002d
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L_0x002d:
            byte r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L_0x0036:
            int r9 = r9 + r7
            int r7 = r10 + 1
            int r9 = r9 + 2
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3419md.m13607k(short, short, int, java.lang.Object[]):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final java.lang.String[] mo9818d(java.lang.String[] r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f11242i
            boolean r0 = r0.get()
            r1 = 15
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L_0x0122
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f11242i
            boolean r0 = r0.compareAndSet(r2, r4)
            if (r0 == 0) goto L_0x0122
            r0 = r2
        L_0x0016:
            java.lang.Class<com.facetec.sdk.md> r5 = com.facetec.sdk.C3419md.class
            java.lang.String r6 = "publicsuffixes.gz"
            java.io.InputStream r5 = r5.getResourceAsStream(r6)     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            if (r5 == 0) goto L_0x0056
            com.facetec.sdk.mv r6 = new com.facetec.sdk.mv     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            com.facetec.sdk.nf r5 = com.facetec.sdk.C3442mx.m13808c((java.io.InputStream) r5)     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            r6.<init>(r5)     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            com.facetec.sdk.mn r5 = com.facetec.sdk.C3442mx.m13804a((com.facetec.sdk.C3465nf) r6)     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            int r6 = r5.mo9879j()     // Catch:{ all -> 0x0051 }
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x0051 }
            r5.mo9856d((byte[]) r6)     // Catch:{ all -> 0x0051 }
            int r7 = r5.mo9879j()     // Catch:{ all -> 0x0051 }
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0051 }
            r5.mo9856d((byte[]) r7)     // Catch:{ all -> 0x0051 }
            com.facetec.sdk.C3303ki.m13255b((java.io.Closeable) r5)     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            monitor-enter(r9)     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            r9.f11241h = r6     // Catch:{ all -> 0x004e }
            r9.f11243j = r7     // Catch:{ all -> 0x004e }
            monitor-exit(r9)     // Catch:{ all -> 0x004e }
            java.util.concurrent.CountDownLatch r5 = r9.f11240f     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            r5.countDown()     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            goto L_0x0056
        L_0x004e:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            throw r5     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
        L_0x0051:
            r6 = move-exception
            com.facetec.sdk.C3303ki.m13255b((java.io.Closeable) r5)     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
            throw r6     // Catch:{ InterruptedIOException -> 0x00dd, IOException -> 0x0097 }
        L_0x0056:
            if (r0 == 0) goto L_0x015a
            byte[] r0 = f11239g     // Catch:{ all -> 0x008c }
            byte r0 = r0[r1]     // Catch:{ all -> 0x008c }
            byte r0 = (byte) r0     // Catch:{ all -> 0x008c }
            byte r5 = (byte) r0     // Catch:{ all -> 0x008c }
            byte r6 = (byte) r5     // Catch:{ all -> 0x008c }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x008c }
            m13607k(r0, r5, r6, r7)     // Catch:{ all -> 0x008c }
            r0 = r7[r2]     // Catch:{ all -> 0x008c }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x008c }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x008c }
            byte[] r5 = f11239g     // Catch:{ all -> 0x008c }
            byte r1 = r5[r1]     // Catch:{ all -> 0x008c }
            int r1 = r1 - r4
            byte r1 = (byte) r1     // Catch:{ all -> 0x008c }
            byte r5 = (byte) r1     // Catch:{ all -> 0x008c }
            byte r6 = (byte) r5     // Catch:{ all -> 0x008c }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x008c }
            m13607k(r1, r5, r6, r7)     // Catch:{ all -> 0x008c }
            r1 = r7[r2]     // Catch:{ all -> 0x008c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x008c }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.invoke(r3, r3)     // Catch:{ all -> 0x008c }
            java.lang.Thread r0 = (java.lang.Thread) r0     // Catch:{ all -> 0x008c }
        L_0x0087:
            r0.interrupt()
            goto L_0x015a
        L_0x008c:
            r10 = move-exception
            java.lang.Throwable r0 = r10.getCause()
            if (r0 == 0) goto L_0x0094
            throw r0
        L_0x0094:
            throw r10
        L_0x0095:
            r10 = move-exception
            goto L_0x00e3
        L_0x0097:
            r5 = move-exception
            com.facetec.sdk.mg r6 = com.facetec.sdk.C3422mg.m13612c()     // Catch:{ all -> 0x0095 }
            java.lang.String r7 = "Failed to read public suffix list"
            r8 = 5
            r6.mo9804d((int) r8, (java.lang.String) r7, (java.lang.Throwable) r5)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x015a
            byte[] r0 = f11239g     // Catch:{ all -> 0x00d4 }
            byte r0 = r0[r1]     // Catch:{ all -> 0x00d4 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x00d4 }
            byte r5 = (byte) r0     // Catch:{ all -> 0x00d4 }
            byte r6 = (byte) r5     // Catch:{ all -> 0x00d4 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x00d4 }
            m13607k(r0, r5, r6, r7)     // Catch:{ all -> 0x00d4 }
            r0 = r7[r2]     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00d4 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x00d4 }
            byte[] r5 = f11239g     // Catch:{ all -> 0x00d4 }
            byte r1 = r5[r1]     // Catch:{ all -> 0x00d4 }
            int r1 = r1 - r4
            byte r1 = (byte) r1     // Catch:{ all -> 0x00d4 }
            byte r5 = (byte) r1     // Catch:{ all -> 0x00d4 }
            byte r6 = (byte) r5     // Catch:{ all -> 0x00d4 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x00d4 }
            m13607k(r1, r5, r6, r7)     // Catch:{ all -> 0x00d4 }
            r1 = r7[r2]     // Catch:{ all -> 0x00d4 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00d4 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = r0.invoke(r3, r3)     // Catch:{ all -> 0x00d4 }
            java.lang.Thread r0 = (java.lang.Thread) r0     // Catch:{ all -> 0x00d4 }
            goto L_0x0087
        L_0x00d4:
            r10 = move-exception
            java.lang.Throwable r0 = r10.getCause()
            if (r0 == 0) goto L_0x00dc
            throw r0
        L_0x00dc:
            throw r10
        L_0x00dd:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0095 }
            r0 = r4
            goto L_0x0016
        L_0x00e3:
            if (r0 == 0) goto L_0x0121
            byte[] r0 = f11239g     // Catch:{ all -> 0x0118 }
            byte r0 = r0[r1]     // Catch:{ all -> 0x0118 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x0118 }
            byte r5 = (byte) r0     // Catch:{ all -> 0x0118 }
            byte r6 = (byte) r5     // Catch:{ all -> 0x0118 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0118 }
            m13607k(r0, r5, r6, r7)     // Catch:{ all -> 0x0118 }
            r0 = r7[r2]     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0118 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0118 }
            byte[] r5 = f11239g     // Catch:{ all -> 0x0118 }
            byte r1 = r5[r1]     // Catch:{ all -> 0x0118 }
            int r1 = r1 - r4
            byte r1 = (byte) r1     // Catch:{ all -> 0x0118 }
            byte r5 = (byte) r1     // Catch:{ all -> 0x0118 }
            byte r6 = (byte) r5     // Catch:{ all -> 0x0118 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0118 }
            m13607k(r1, r5, r6, r4)     // Catch:{ all -> 0x0118 }
            r1 = r4[r2]     // Catch:{ all -> 0x0118 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0118 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ all -> 0x0118 }
            java.lang.Object r0 = r0.invoke(r3, r3)     // Catch:{ all -> 0x0118 }
            java.lang.Thread r0 = (java.lang.Thread) r0     // Catch:{ all -> 0x0118 }
            r0.interrupt()
            goto L_0x0121
        L_0x0118:
            r10 = move-exception
            java.lang.Throwable r0 = r10.getCause()
            if (r0 == 0) goto L_0x0120
            throw r0
        L_0x0120:
            throw r10
        L_0x0121:
            throw r10
        L_0x0122:
            java.util.concurrent.CountDownLatch r0 = r9.f11240f     // Catch:{ InterruptedException -> 0x0128 }
            r0.await()     // Catch:{ InterruptedException -> 0x0128 }
            goto L_0x015a
        L_0x0128:
            byte[] r0 = f11239g     // Catch:{ all -> 0x01f2 }
            byte r0 = r0[r1]     // Catch:{ all -> 0x01f2 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x01f2 }
            byte r5 = (byte) r0     // Catch:{ all -> 0x01f2 }
            byte r6 = (byte) r5     // Catch:{ all -> 0x01f2 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x01f2 }
            m13607k(r0, r5, r6, r7)     // Catch:{ all -> 0x01f2 }
            r0 = r7[r2]     // Catch:{ all -> 0x01f2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x01f2 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x01f2 }
            byte[] r5 = f11239g     // Catch:{ all -> 0x01f2 }
            byte r1 = r5[r1]     // Catch:{ all -> 0x01f2 }
            int r1 = r1 - r4
            byte r1 = (byte) r1     // Catch:{ all -> 0x01f2 }
            byte r5 = (byte) r1     // Catch:{ all -> 0x01f2 }
            byte r6 = (byte) r5     // Catch:{ all -> 0x01f2 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x01f2 }
            m13607k(r1, r5, r6, r7)     // Catch:{ all -> 0x01f2 }
            r1 = r7[r2]     // Catch:{ all -> 0x01f2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01f2 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ all -> 0x01f2 }
            java.lang.Object r0 = r0.invoke(r3, r3)     // Catch:{ all -> 0x01f2 }
            java.lang.Thread r0 = (java.lang.Thread) r0     // Catch:{ all -> 0x01f2 }
            r0.interrupt()
        L_0x015a:
            monitor-enter(r9)
            byte[] r0 = r9.f11241h     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x01e7
            monitor-exit(r9)     // Catch:{ all -> 0x01ef }
            int r0 = r10.length
            byte[][] r1 = new byte[r0][]
            r5 = r2
        L_0x0164:
            int r6 = r10.length
            if (r5 >= r6) goto L_0x0174
            r6 = r10[r5]
            java.nio.charset.Charset r7 = com.facetec.sdk.C3303ki.f10843e
            byte[] r6 = r6.getBytes(r7)
            r1[r5] = r6
            int r5 = r5 + 1
            goto L_0x0164
        L_0x0174:
            r10 = r2
        L_0x0175:
            if (r10 >= r0) goto L_0x0183
            byte[] r5 = r9.f11241h
            java.lang.String r5 = m13606d(r5, r1, r10)
            if (r5 == 0) goto L_0x0180
            goto L_0x0184
        L_0x0180:
            int r10 = r10 + 1
            goto L_0x0175
        L_0x0183:
            r5 = r3
        L_0x0184:
            if (r0 <= r4) goto L_0x01a1
            java.lang.Object r10 = r1.clone()
            byte[][] r10 = (byte[][]) r10
            r6 = r2
        L_0x018d:
            int r7 = r10.length
            int r7 = r7 - r4
            if (r6 >= r7) goto L_0x01a1
            byte[] r7 = f11237d
            r10[r6] = r7
            byte[] r7 = r9.f11241h
            java.lang.String r7 = m13606d(r7, r10, r6)
            if (r7 == 0) goto L_0x019e
            goto L_0x01a2
        L_0x019e:
            int r6 = r6 + 1
            goto L_0x018d
        L_0x01a1:
            r7 = r3
        L_0x01a2:
            if (r7 == 0) goto L_0x01b5
        L_0x01a4:
            int r10 = r0 + -1
            if (r2 >= r10) goto L_0x01b5
            byte[] r10 = r9.f11243j
            java.lang.String r10 = m13606d(r10, r1, r2)
            if (r10 == 0) goto L_0x01b2
            r3 = r10
            goto L_0x01b5
        L_0x01b2:
            int r2 = r2 + 1
            goto L_0x01a4
        L_0x01b5:
            if (r3 == 0) goto L_0x01c4
            java.lang.String r10 = "!"
            java.lang.String r10 = r10.concat(r3)
            java.lang.String r0 = "\\."
            java.lang.String[] r10 = r10.split(r0)
            return r10
        L_0x01c4:
            if (r5 != 0) goto L_0x01cb
            if (r7 != 0) goto L_0x01cb
            java.lang.String[] r10 = f11236c
            return r10
        L_0x01cb:
            if (r5 == 0) goto L_0x01d4
            java.lang.String r10 = "\\."
            java.lang.String[] r10 = r5.split(r10)
            goto L_0x01d6
        L_0x01d4:
            java.lang.String[] r10 = f11234a
        L_0x01d6:
            if (r7 == 0) goto L_0x01df
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r7.split(r0)
            goto L_0x01e1
        L_0x01df:
            java.lang.String[] r0 = f11234a
        L_0x01e1:
            int r1 = r10.length
            int r2 = r0.length
            if (r1 <= r2) goto L_0x01e6
            return r10
        L_0x01e6:
            return r0
        L_0x01e7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01ef }
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r10.<init>(r0)     // Catch:{ all -> 0x01ef }
            throw r10     // Catch:{ all -> 0x01ef }
        L_0x01ef:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x01f2:
            r10 = move-exception
            java.lang.Throwable r0 = r10.getCause()
            if (r0 == 0) goto L_0x01fa
            throw r0
        L_0x01fa:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3419md.mo9818d(java.lang.String[]):java.lang.String[]");
    }

    /* renamed from: d */
    private static String m13606d(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        byte b;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 >= 0 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    b = 46;
                    z = false;
                } else {
                    z = z2;
                    b = bArr4[i9][i12] & 255;
                }
                i3 = b - (bArr3[i6 + i13] & 255);
                if (i3 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i8) {
                    break;
                } else if (bArr4[i9].length == i12) {
                    if (i9 == bArr4.length - 1) {
                        break;
                    }
                    i9++;
                    i12 = -1;
                    z2 = true;
                } else {
                    z2 = z;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i14 = i8 - i13;
                    int length2 = bArr4[i9].length - i12;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr3, i6, i8, C3303ki.f10843e);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }
}
