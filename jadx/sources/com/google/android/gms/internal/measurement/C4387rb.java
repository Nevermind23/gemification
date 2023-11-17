package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.rb */
abstract class C4387rb {

    /* renamed from: a */
    private static final Unsafe f13634a;

    /* renamed from: b */
    private static final Class f13635b = Memory.class;

    /* renamed from: c */
    private static final boolean f13636c;

    /* renamed from: d */
    private static final C4370qb f13637d;

    /* renamed from: e */
    private static final boolean f13638e;

    /* renamed from: f */
    private static final boolean f13639f;

    /* renamed from: g */
    static final long f13640g = ((long) m16573E(byte[].class));

    /* renamed from: h */
    static final boolean f13641h;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0130  */
    static {
        /*
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            sun.misc.Unsafe r1 = m16585l()
            f13634a = r1
            int r2 = com.google.android.gms.internal.measurement.C4180f8.f13235a
            java.lang.Class<libcore.io.Memory> r2 = libcore.io.Memory.class
            f13635b = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r3 = m16569A(r2)
            f13636c = r3
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = m16569A(r4)
            r5 = 0
            if (r1 != 0) goto L_0x0020
            goto L_0x002f
        L_0x0020:
            if (r3 == 0) goto L_0x0028
            com.google.android.gms.internal.measurement.pb r5 = new com.google.android.gms.internal.measurement.pb
            r5.<init>(r1)
            goto L_0x002f
        L_0x0028:
            if (r4 == 0) goto L_0x002f
            com.google.android.gms.internal.measurement.ob r5 = new com.google.android.gms.internal.measurement.ob
            r5.<init>(r1)
        L_0x002f:
            f13637d = r5
            java.lang.String r1 = "getLong"
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            java.lang.String r4 = "objectFieldOffset"
            r6 = 2
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r8 = 1
            r9 = 0
            if (r5 != 0) goto L_0x0040
        L_0x003e:
            r2 = r9
            goto L_0x0064
        L_0x0040:
            sun.misc.Unsafe r5 = r5.f13617a
            java.lang.Class r5 = r5.getClass()     // Catch:{ all -> 0x005f }
            java.lang.Class[] r10 = new java.lang.Class[r8]     // Catch:{ all -> 0x005f }
            r10[r9] = r3     // Catch:{ all -> 0x005f }
            r5.getMethod(r4, r10)     // Catch:{ all -> 0x005f }
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ all -> 0x005f }
            r10[r9] = r7     // Catch:{ all -> 0x005f }
            r10[r8] = r2     // Catch:{ all -> 0x005f }
            r5.getMethod(r1, r10)     // Catch:{ all -> 0x005f }
            java.lang.reflect.Field r2 = m16575b()     // Catch:{ all -> 0x005f }
            if (r2 != 0) goto L_0x005d
            goto L_0x003e
        L_0x005d:
            r2 = r8
            goto L_0x0064
        L_0x005f:
            r2 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C4387rb.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r2.toString()))
            goto L_0x003e
        L_0x0064:
            f13638e = r2
            com.google.android.gms.internal.measurement.qb r2 = f13637d
            if (r2 != 0) goto L_0x006c
        L_0x006a:
            r0 = r9
            goto L_0x00dd
        L_0x006c:
            sun.misc.Unsafe r2 = r2.f13617a
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r5[r9] = r3     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r4, r5)     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "arrayBaseOffset"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r4[r9] = r0     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r3, r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "arrayIndexScale"
            java.lang.Class[] r4 = new java.lang.Class[r8]     // Catch:{ all -> 0x00d8 }
            r4[r9] = r0     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r3, r4)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "getInt"
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r3[r9] = r7     // Catch:{ all -> 0x00d8 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x00d8 }
            r3[r8] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r3)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "putInt"
            r3 = 3
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d8 }
            r5[r9] = r7     // Catch:{ all -> 0x00d8 }
            r5[r8] = r4     // Catch:{ all -> 0x00d8 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00d8 }
            r5[r6] = r10     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r5)     // Catch:{ all -> 0x00d8 }
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r0[r9] = r7     // Catch:{ all -> 0x00d8 }
            r0[r8] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r1, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "putLong"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r4     // Catch:{ all -> 0x00d8 }
            r1[r6] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "getObject"
            java.lang.Class[] r1 = new java.lang.Class[r6]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r4     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r0 = "putObject"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ all -> 0x00d8 }
            r1[r9] = r7     // Catch:{ all -> 0x00d8 }
            r1[r8] = r4     // Catch:{ all -> 0x00d8 }
            r1[r6] = r7     // Catch:{ all -> 0x00d8 }
            r2.getMethod(r0, r1)     // Catch:{ all -> 0x00d8 }
            r0 = r8
            goto L_0x00dd
        L_0x00d8:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.google.android.gms.internal.measurement.C4387rb.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x006a
        L_0x00dd:
            f13639f = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m16573E(r0)
            long r0 = (long) r0
            f13640g = r0
            java.lang.Class<boolean[]> r0 = boolean[].class
            m16573E(r0)
            m16574a(r0)
            java.lang.Class<int[]> r0 = int[].class
            m16573E(r0)
            m16574a(r0)
            java.lang.Class<long[]> r0 = long[].class
            m16573E(r0)
            m16574a(r0)
            java.lang.Class<float[]> r0 = float[].class
            m16573E(r0)
            m16574a(r0)
            java.lang.Class<double[]> r0 = double[].class
            m16573E(r0)
            m16574a(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            m16573E(r0)
            m16574a(r0)
            java.lang.reflect.Field r0 = m16575b()
            if (r0 == 0) goto L_0x0127
            com.google.android.gms.internal.measurement.qb r1 = f13637d
            if (r1 == 0) goto L_0x0127
            sun.misc.Unsafe r1 = r1.f13617a
            r1.objectFieldOffset(r0)
        L_0x0127:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r8 = r9
        L_0x0131:
            f13641h = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4387rb.<clinit>():void");
    }

    /* renamed from: A */
    static boolean m16569A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = C4180f8.f13235a;
        try {
            Class cls3 = f13635b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: B */
    static boolean m16570B(Object obj, long j) {
        return f13637d.mo13436g(obj, j);
    }

    /* renamed from: C */
    static boolean m16571C() {
        return f13639f;
    }

    /* renamed from: D */
    static boolean m16572D() {
        return f13638e;
    }

    /* renamed from: E */
    private static int m16573E(Class cls) {
        if (f13639f) {
            return f13637d.f13617a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    private static int m16574a(Class cls) {
        if (f13639f) {
            return f13637d.f13617a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m16575b() {
        int i = C4180f8.f13235a;
        Class<Buffer> cls = Buffer.class;
        Field c = m16576c(cls, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m16576c(cls, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    private static Field m16576c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m16577d(Object obj, long j, byte b) {
        C4370qb qbVar = f13637d;
        long j2 = -4 & j;
        int i = qbVar.f13617a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        qbVar.f13617a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(C11051p3.f31759c << i2))));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m16578e(Object obj, long j, byte b) {
        C4370qb qbVar = f13637d;
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        qbVar.f13617a.putInt(obj, j2, ((255 & b) << i) | (qbVar.f13617a.getInt(obj, j2) & (~(C11051p3.f31759c << i))));
    }

    /* renamed from: f */
    static double m16579f(Object obj, long j) {
        return f13637d.mo13430a(obj, j);
    }

    /* renamed from: g */
    static float m16580g(Object obj, long j) {
        return f13637d.mo13431b(obj, j);
    }

    /* renamed from: h */
    static int m16581h(Object obj, long j) {
        return f13637d.f13617a.getInt(obj, j);
    }

    /* renamed from: i */
    static long m16582i(Object obj, long j) {
        return f13637d.f13617a.getLong(obj, j);
    }

    /* renamed from: j */
    static Object m16583j(Class cls) {
        try {
            return f13634a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    static Object m16584k(Object obj, long j) {
        return f13637d.f13617a.getObject(obj, j);
    }

    /* renamed from: l */
    static Unsafe m16585l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C4319nb());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    static void m16591r(Object obj, long j, boolean z) {
        f13637d.mo13432c(obj, j, z);
    }

    /* renamed from: s */
    static void m16592s(byte[] bArr, long j, byte b) {
        f13637d.mo13433d(bArr, f13640g + j, b);
    }

    /* renamed from: t */
    static void m16593t(Object obj, long j, double d) {
        f13637d.mo13434e(obj, j, d);
    }

    /* renamed from: u */
    static void m16594u(Object obj, long j, float f) {
        f13637d.mo13435f(obj, j, f);
    }

    /* renamed from: v */
    static void m16595v(Object obj, long j, int i) {
        f13637d.f13617a.putInt(obj, j, i);
    }

    /* renamed from: w */
    static void m16596w(Object obj, long j, long j2) {
        f13637d.f13617a.putLong(obj, j, j2);
    }

    /* renamed from: x */
    static void m16597x(Object obj, long j, Object obj2) {
        f13637d.f13617a.putObject(obj, j, obj2);
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ boolean m16598y(Object obj, long j) {
        return ((byte) ((f13637d.f13617a.getInt(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & C11051p3.f31759c)) != 0;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ boolean m16599z(Object obj, long j) {
        return ((byte) ((f13637d.f13617a.getInt(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & C11051p3.f31759c)) != 0;
    }
}
