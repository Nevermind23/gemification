package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.f1 */
abstract class C5660f1 {

    /* renamed from: a */
    private static final Unsafe f17866a = m22575D();

    /* renamed from: b */
    private static final Class f17867b = C5640d.m22492b();

    /* renamed from: c */
    private static final boolean f17868c = m22606o(Long.TYPE);

    /* renamed from: d */
    private static final boolean f17869d = m22606o(Integer.TYPE);

    /* renamed from: e */
    private static final C5665e f17870e = m22573B();

    /* renamed from: f */
    private static final boolean f17871f = m22591T();

    /* renamed from: g */
    private static final boolean f17872g = m22590S();

    /* renamed from: h */
    static final long f17873h;

    /* renamed from: i */
    private static final long f17874i;

    /* renamed from: j */
    private static final long f17875j;

    /* renamed from: k */
    private static final long f17876k;

    /* renamed from: l */
    private static final long f17877l;

    /* renamed from: m */
    private static final long f17878m;

    /* renamed from: n */
    private static final long f17879n;

    /* renamed from: o */
    private static final long f17880o;

    /* renamed from: p */
    private static final long f17881p;

    /* renamed from: q */
    private static final long f17882q;

    /* renamed from: r */
    private static final long f17883r;

    /* renamed from: s */
    private static final long f17884s;

    /* renamed from: t */
    private static final long f17885t;

    /* renamed from: u */
    private static final long f17886u = m22608q(m22605n());

    /* renamed from: v */
    private static final int f17887v;

    /* renamed from: w */
    static final boolean f17888w;

    /* renamed from: com.google.protobuf.f1$a */
    class C5661a implements PrivilegedExceptionAction {
        C5661a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.protobuf.f1$b */
    private static final class C5662b extends C5665e {
        C5662b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public boolean mo18637c(Object obj, long j) {
            if (C5660f1.f17888w) {
                return C5660f1.m22610s(obj, j);
            }
            return C5660f1.m22611t(obj, j);
        }

        /* renamed from: d */
        public byte mo18638d(Object obj, long j) {
            if (C5660f1.f17888w) {
                return C5660f1.m22613v(obj, j);
            }
            return C5660f1.m22614w(obj, j);
        }

        /* renamed from: e */
        public double mo18639e(Object obj, long j) {
            return Double.longBitsToDouble(mo18650h(obj, j));
        }

        /* renamed from: f */
        public float mo18640f(Object obj, long j) {
            return Float.intBitsToFloat(mo18649g(obj, j));
        }

        /* renamed from: k */
        public void mo18641k(Object obj, long j, boolean z) {
            if (C5660f1.f17888w) {
                C5660f1.m22580I(obj, j, z);
            } else {
                C5660f1.m22581J(obj, j, z);
            }
        }

        /* renamed from: l */
        public void mo18642l(Object obj, long j, byte b) {
            if (C5660f1.f17888w) {
                C5660f1.m22583L(obj, j, b);
            } else {
                C5660f1.m22584M(obj, j, b);
            }
        }

        /* renamed from: m */
        public void mo18643m(Object obj, long j, double d) {
            mo18654p(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: n */
        public void mo18644n(Object obj, long j, float f) {
            mo18653o(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: s */
        public boolean mo18645s() {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.f1$c */
    private static final class C5663c extends C5665e {
        C5663c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public boolean mo18637c(Object obj, long j) {
            if (C5660f1.f17888w) {
                return C5660f1.m22610s(obj, j);
            }
            return C5660f1.m22611t(obj, j);
        }

        /* renamed from: d */
        public byte mo18638d(Object obj, long j) {
            if (C5660f1.f17888w) {
                return C5660f1.m22613v(obj, j);
            }
            return C5660f1.m22614w(obj, j);
        }

        /* renamed from: e */
        public double mo18639e(Object obj, long j) {
            return Double.longBitsToDouble(mo18650h(obj, j));
        }

        /* renamed from: f */
        public float mo18640f(Object obj, long j) {
            return Float.intBitsToFloat(mo18649g(obj, j));
        }

        /* renamed from: k */
        public void mo18641k(Object obj, long j, boolean z) {
            if (C5660f1.f17888w) {
                C5660f1.m22580I(obj, j, z);
            } else {
                C5660f1.m22581J(obj, j, z);
            }
        }

        /* renamed from: l */
        public void mo18642l(Object obj, long j, byte b) {
            if (C5660f1.f17888w) {
                C5660f1.m22583L(obj, j, b);
            } else {
                C5660f1.m22584M(obj, j, b);
            }
        }

        /* renamed from: m */
        public void mo18643m(Object obj, long j, double d) {
            mo18654p(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: n */
        public void mo18644n(Object obj, long j, float f) {
            mo18653o(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: s */
        public boolean mo18645s() {
            return false;
        }
    }

    /* renamed from: com.google.protobuf.f1$d */
    private static final class C5664d extends C5665e {
        C5664d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: c */
        public boolean mo18637c(Object obj, long j) {
            return this.f17889a.getBoolean(obj, j);
        }

        /* renamed from: d */
        public byte mo18638d(Object obj, long j) {
            return this.f17889a.getByte(obj, j);
        }

        /* renamed from: e */
        public double mo18639e(Object obj, long j) {
            return this.f17889a.getDouble(obj, j);
        }

        /* renamed from: f */
        public float mo18640f(Object obj, long j) {
            return this.f17889a.getFloat(obj, j);
        }

        /* renamed from: k */
        public void mo18641k(Object obj, long j, boolean z) {
            this.f17889a.putBoolean(obj, j, z);
        }

        /* renamed from: l */
        public void mo18642l(Object obj, long j, byte b) {
            this.f17889a.putByte(obj, j, b);
        }

        /* renamed from: m */
        public void mo18643m(Object obj, long j, double d) {
            this.f17889a.putDouble(obj, j, d);
        }

        /* renamed from: n */
        public void mo18644n(Object obj, long j, float f) {
            this.f17889a.putFloat(obj, j, f);
        }

        /* renamed from: r */
        public boolean mo18646r() {
            Class<Object> cls = Object.class;
            if (!super.mo18646r()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f17889a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                C5660f1.m22578G(th);
                return false;
            }
        }

        /* renamed from: s */
        public boolean mo18645s() {
            Class<Object> cls = Object.class;
            if (!super.mo18645s()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f17889a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls3});
                cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                cls2.getMethod("getInt", new Class[]{cls3});
                cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls3});
                cls2.getMethod("putLong", new Class[]{cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                return true;
            } catch (Throwable th) {
                C5660f1.m22578G(th);
                return false;
            }
        }
    }

    /* renamed from: com.google.protobuf.f1$e */
    private static abstract class C5665e {

        /* renamed from: a */
        Unsafe f17889a;

        C5665e(Unsafe unsafe) {
            this.f17889a = unsafe;
        }

        /* renamed from: a */
        public final int mo18647a(Class cls) {
            return this.f17889a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo18648b(Class cls) {
            return this.f17889a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo18637c(Object obj, long j);

        /* renamed from: d */
        public abstract byte mo18638d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo18639e(Object obj, long j);

        /* renamed from: f */
        public abstract float mo18640f(Object obj, long j);

        /* renamed from: g */
        public final int mo18649g(Object obj, long j) {
            return this.f17889a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long mo18650h(Object obj, long j) {
            return this.f17889a.getLong(obj, j);
        }

        /* renamed from: i */
        public final Object mo18651i(Object obj, long j) {
            return this.f17889a.getObject(obj, j);
        }

        /* renamed from: j */
        public final long mo18652j(Field field) {
            return this.f17889a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo18641k(Object obj, long j, boolean z);

        /* renamed from: l */
        public abstract void mo18642l(Object obj, long j, byte b);

        /* renamed from: m */
        public abstract void mo18643m(Object obj, long j, double d);

        /* renamed from: n */
        public abstract void mo18644n(Object obj, long j, float f);

        /* renamed from: o */
        public final void mo18653o(Object obj, long j, int i) {
            this.f17889a.putInt(obj, j, i);
        }

        /* renamed from: p */
        public final void mo18654p(Object obj, long j, long j2) {
            this.f17889a.putLong(obj, j, j2);
        }

        /* renamed from: q */
        public final void mo18655q(Object obj, long j, Object obj2) {
            this.f17889a.putObject(obj, j, obj2);
        }

        /* renamed from: r */
        public boolean mo18646r() {
            Class<Class> cls = Class.class;
            Class<Object> cls2 = Object.class;
            Unsafe unsafe = this.f17889a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls3 = unsafe.getClass();
                cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls3.getMethod("arrayBaseOffset", new Class[]{cls});
                cls3.getMethod("arrayIndexScale", new Class[]{cls});
                Class cls4 = Long.TYPE;
                cls3.getMethod("getInt", new Class[]{cls2, cls4});
                cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
                cls3.getMethod("getLong", new Class[]{cls2, cls4});
                cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
                cls3.getMethod("getObject", new Class[]{cls2, cls4});
                cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
                return true;
            } catch (Throwable th) {
                C5660f1.m22578G(th);
                return false;
            }
        }

        /* renamed from: s */
        public boolean mo18645s() {
            Unsafe unsafe = this.f17889a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                if (C5660f1.m22605n() == null) {
                    return false;
                }
                return true;
            } catch (Throwable th) {
                C5660f1.m22578G(th);
                return false;
            }
        }
    }

    static {
        boolean z;
        long l = (long) m22603l(byte[].class);
        f17873h = l;
        Class<boolean[]> cls = boolean[].class;
        f17874i = (long) m22603l(cls);
        f17875j = (long) m22604m(cls);
        Class<int[]> cls2 = int[].class;
        f17876k = (long) m22603l(cls2);
        f17877l = (long) m22604m(cls2);
        Class<long[]> cls3 = long[].class;
        f17878m = (long) m22603l(cls3);
        f17879n = (long) m22604m(cls3);
        Class<float[]> cls4 = float[].class;
        f17880o = (long) m22603l(cls4);
        f17881p = (long) m22604m(cls4);
        Class<double[]> cls5 = double[].class;
        f17882q = (long) m22603l(cls5);
        f17883r = (long) m22604m(cls5);
        Class<Object[]> cls6 = Object[].class;
        f17884s = (long) m22603l(cls6);
        f17885t = (long) m22604m(cls6);
        f17887v = (int) (l & 7);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z = true;
        } else {
            z = false;
        }
        f17888w = z;
    }

    /* renamed from: A */
    static long m22572A(Object obj, long j) {
        return f17870e.mo18650h(obj, j);
    }

    /* renamed from: B */
    private static C5665e m22573B() {
        Unsafe unsafe = f17866a;
        if (unsafe == null) {
            return null;
        }
        if (!C5640d.m22493c()) {
            return new C5664d(unsafe);
        }
        if (f17868c) {
            return new C5663c(unsafe);
        }
        if (f17869d) {
            return new C5662b(unsafe);
        }
        return null;
    }

    /* renamed from: C */
    static Object m22574C(Object obj, long j) {
        return f17870e.mo18651i(obj, j);
    }

    /* renamed from: D */
    static Unsafe m22575D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5661a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    static boolean m22576E() {
        return f17872g;
    }

    /* renamed from: F */
    static boolean m22577F() {
        return f17871f;
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static void m22578G(Throwable th) {
        Logger logger = Logger.getLogger(C5660f1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: H */
    static void m22579H(Object obj, long j, boolean z) {
        f17870e.mo18641k(obj, j, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static void m22580I(Object obj, long j, boolean z) {
        m22583L(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static void m22581J(Object obj, long j, boolean z) {
        m22584M(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: K */
    static void m22582K(byte[] bArr, long j, byte b) {
        f17870e.mo18642l(bArr, f17873h + j, b);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static void m22583L(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int z = m22617z(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m22587P(obj, j2, ((255 & b) << i) | (z & (~(C11051p3.f31759c << i))));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static void m22584M(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m22587P(obj, j2, ((255 & b) << i) | (m22617z(obj, j2) & (~(C11051p3.f31759c << i))));
    }

    /* renamed from: N */
    static void m22585N(Object obj, long j, double d) {
        f17870e.mo18643m(obj, j, d);
    }

    /* renamed from: O */
    static void m22586O(Object obj, long j, float f) {
        f17870e.mo18644n(obj, j, f);
    }

    /* renamed from: P */
    static void m22587P(Object obj, long j, int i) {
        f17870e.mo18653o(obj, j, i);
    }

    /* renamed from: Q */
    static void m22588Q(Object obj, long j, long j2) {
        f17870e.mo18654p(obj, j, j2);
    }

    /* renamed from: R */
    static void m22589R(Object obj, long j, Object obj2) {
        f17870e.mo18655q(obj, j, obj2);
    }

    /* renamed from: S */
    private static boolean m22590S() {
        C5665e eVar = f17870e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo18646r();
    }

    /* renamed from: T */
    private static boolean m22591T() {
        C5665e eVar = f17870e;
        if (eVar == null) {
            return false;
        }
        return eVar.mo18645s();
    }

    /* renamed from: k */
    static Object m22602k(Class cls) {
        try {
            return f17866a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: l */
    private static int m22603l(Class cls) {
        if (f17872g) {
            return f17870e.mo18647a(cls);
        }
        return -1;
    }

    /* renamed from: m */
    private static int m22604m(Class cls) {
        if (f17872g) {
            return f17870e.mo18648b(cls);
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static Field m22605n() {
        Field p;
        Class<Buffer> cls = Buffer.class;
        if (C5640d.m22493c() && (p = m22607p(cls, "effectiveDirectAddress")) != null) {
            return p;
        }
        Field p2 = m22607p(cls, "address");
        if (p2 == null || p2.getType() != Long.TYPE) {
            return null;
        }
        return p2;
    }

    /* renamed from: o */
    static boolean m22606o(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C5640d.m22493c()) {
            return false;
        }
        try {
            Class cls3 = f17867b;
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

    /* renamed from: p */
    private static Field m22607p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    private static long m22608q(Field field) {
        C5665e eVar;
        if (field == null || (eVar = f17870e) == null) {
            return -1;
        }
        return eVar.mo18652j(field);
    }

    /* renamed from: r */
    static boolean m22609r(Object obj, long j) {
        return f17870e.mo18637c(obj, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static boolean m22610s(Object obj, long j) {
        return m22613v(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m22611t(Object obj, long j) {
        return m22614w(obj, j) != 0;
    }

    /* renamed from: u */
    static byte m22612u(byte[] bArr, long j) {
        return f17870e.mo18638d(bArr, f17873h + j);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static byte m22613v(Object obj, long j) {
        return (byte) ((m22617z(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & C11051p3.f31759c);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static byte m22614w(Object obj, long j) {
        return (byte) ((m22617z(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & C11051p3.f31759c);
    }

    /* renamed from: x */
    static double m22615x(Object obj, long j) {
        return f17870e.mo18639e(obj, j);
    }

    /* renamed from: y */
    static float m22616y(Object obj, long j) {
        return f17870e.mo18640f(obj, j);
    }

    /* renamed from: z */
    static int m22617z(Object obj, long j) {
        return f17870e.mo18649g(obj, j);
    }
}
