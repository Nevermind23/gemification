package p342j$.util.concurrent;

import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import p342j$.lang.C9284a;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.Function;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.ConcurrentHashMap */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, C9408u {

    /* renamed from: g */
    private static final int f25975g = ((1 << (32 - 16)) - 1);

    /* renamed from: h */
    private static final int f25976h = (32 - 16);

    /* renamed from: i */
    static final int f25977i = Runtime.getRuntime().availableProcessors();

    /* renamed from: j */
    private static final Unsafe f25978j;

    /* renamed from: k */
    private static final long f25979k;

    /* renamed from: l */
    private static final long f25980l;

    /* renamed from: m */
    private static final long f25981m;

    /* renamed from: n */
    private static final long f25982n;

    /* renamed from: o */
    private static final long f25983o;

    /* renamed from: p */
    private static final long f25984p;

    /* renamed from: q */
    private static final int f25985q;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a */
    volatile transient C9399l[] f25986a;

    /* renamed from: b */
    private volatile transient C9399l[] f25987b;
    private volatile transient long baseCount;

    /* renamed from: c */
    private volatile transient C9390c[] f25988c;
    private volatile transient int cellsBusy;

    /* renamed from: d */
    private transient C9396i f25989d;

    /* renamed from: e */
    private transient C9406s f25990e;

    /* renamed from: f */
    private transient C9392e f25991f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C9401n[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe c = C9409v.m34738c();
            f25978j = c;
            Class<ConcurrentHashMap> cls2 = ConcurrentHashMap.class;
            f25979k = c.objectFieldOffset(cls2.getDeclaredField("sizeCtl"));
            f25980l = c.objectFieldOffset(cls2.getDeclaredField("transferIndex"));
            f25981m = c.objectFieldOffset(cls2.getDeclaredField("baseCount"));
            f25982n = c.objectFieldOffset(cls2.getDeclaredField("cellsBusy"));
            f25983o = c.objectFieldOffset(C9390c.class.getDeclaredField(C11755a.C11756a.f34100b));
            Class<C9399l[]> cls3 = C9399l[].class;
            f25984p = (long) c.arrayBaseOffset(cls3);
            int arrayIndexScale = c.arrayIndexScale(cls3);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                f25985q = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                return;
            }
            throw new Error("data type scale not a power of two");
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i) {
        if (i >= 0) {
            this.sizeCtl = i >= 536870912 ? 1073741824 : m34690n(i + (i >>> 1) + 1);
            return;
        }
        throw new IllegalArgumentException();
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= Utils.FLOAT_EPSILON || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        long j = (long) (((double) (((float) ((long) (i < i2 ? i2 : i))) / f)) + 1.0d);
        this.sizeCtl = j >= 1073741824 ? 1073741824 : m34690n((int) j);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L_0x0014;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34681a(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.c[] r0 = r11.f25988c
            if (r0 != 0) goto L_0x0014
            sun.misc.Unsafe r1 = f25978j
            long r3 = f25981m
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L_0x003b
        L_0x0014:
            r1 = 1
            if (r0 == 0) goto L_0x0098
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x0098
            int r3 = p342j$.util.concurrent.ThreadLocalRandom.m34700b()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L_0x0098
            sun.misc.Unsafe r3 = f25978j
            long r5 = f25983o
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L_0x0034
            r1 = r0
            goto L_0x0098
        L_0x0034:
            if (r14 > r1) goto L_0x0037
            return
        L_0x0037:
            long r9 = r11.mo25324l()
        L_0x003b:
            if (r14 < 0) goto L_0x0097
        L_0x003d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x0097
            j$.util.concurrent.l[] r12 = r11.f25986a
            if (r12 == 0) goto L_0x0097
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L_0x0097
            int r13 = java.lang.Integer.numberOfLeadingZeros(r13)
            r14 = 32768(0x8000, float:4.5918E-41)
            r13 = r13 | r14
            int r14 = f25976h
            if (r4 >= 0) goto L_0x0080
            int r14 = r4 >>> r14
            if (r14 != r13) goto L_0x0097
            int r14 = r13 + 1
            if (r4 == r14) goto L_0x0097
            int r14 = f25975g
            int r13 = r13 + r14
            if (r4 == r13) goto L_0x0097
            j$.util.concurrent.l[] r13 = r11.f25987b
            if (r13 == 0) goto L_0x0097
            int r14 = r11.transferIndex
            if (r14 > 0) goto L_0x006f
            goto L_0x0097
        L_0x006f:
            sun.misc.Unsafe r0 = f25978j
            long r2 = f25979k
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L_0x0092
            r11.m34691o(r12, r13)
            goto L_0x0092
        L_0x0080:
            sun.misc.Unsafe r0 = f25978j
            long r2 = f25979k
            int r13 = r13 << r14
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L_0x0092
            r13 = 0
            r11.m34691o(r12, r13)
        L_0x0092:
            long r9 = r11.mo25324l()
            goto L_0x003d
        L_0x0097:
            return
        L_0x0098:
            r11.m34685e(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.ConcurrentHashMap.m34681a(long, int):void");
    }

    /* renamed from: b */
    static final boolean m34682b(C9399l[] lVarArr, int i, C9399l lVar) {
        return C9284a.m34180g(f25978j, lVarArr, (((long) i) << f25985q) + f25984p, lVar);
    }

    /* renamed from: c */
    static Class m34683c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    static int m34684d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009d, code lost:
        if (r9.f25988c != r7) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009f, code lost:
        r1 = new p342j$.util.concurrent.C9390c[(r8 << 1)];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a4, code lost:
        if (r2 >= r8) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ad, code lost:
        r9.f25988c = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0102 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x001b A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34685e(long r25, boolean r27) {
        /*
            r24 = this;
            r9 = r24
            r10 = r25
            int r0 = p342j$.util.concurrent.ThreadLocalRandom.m34700b()
            r12 = 1
            if (r0 != 0) goto L_0x0015
            p342j$.util.concurrent.ThreadLocalRandom.m34701f()
            int r0 = p342j$.util.concurrent.ThreadLocalRandom.m34700b()
            r1 = r0
            r0 = r12
            goto L_0x0018
        L_0x0015:
            r1 = r0
            r0 = r27
        L_0x0018:
            r13 = 0
            r14 = r1
        L_0x001a:
            r15 = r13
        L_0x001b:
            j$.util.concurrent.c[] r7 = r9.f25988c
            if (r7 == 0) goto L_0x00be
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00be
            int r1 = r8 + -1
            r1 = r1 & r14
            r1 = r7[r1]
            if (r1 != 0) goto L_0x0063
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x0061
            j$.util.concurrent.c r7 = new j$.util.concurrent.c
            r7.<init>(r10)
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x0061
            sun.misc.Unsafe r1 = f25978j
            long r3 = f25982n
            r5 = 0
            r6 = 1
            r2 = r24
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0061
            j$.util.concurrent.c[] r1 = r9.f25988c     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0056
            int r2 = r1.length     // Catch:{ all -> 0x005d }
            if (r2 <= 0) goto L_0x0056
            int r2 = r2 + -1
            r2 = r2 & r14
            r3 = r1[r2]     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x0056
            r1[r2] = r7     // Catch:{ all -> 0x005d }
            r1 = r12
            goto L_0x0057
        L_0x0056:
            r1 = r13
        L_0x0057:
            r9.cellsBusy = r13
            if (r1 == 0) goto L_0x001b
            goto L_0x0102
        L_0x005d:
            r0 = move-exception
            r9.cellsBusy = r13
            throw r0
        L_0x0061:
            r15 = r13
            goto L_0x00b7
        L_0x0063:
            if (r0 != 0) goto L_0x0067
            r0 = r12
            goto L_0x00b7
        L_0x0067:
            sun.misc.Unsafe r2 = f25978j
            long r18 = f25983o
            long r3 = r1.value
            long r22 = r3 + r10
            r16 = r2
            r17 = r1
            r20 = r3
            boolean r1 = r16.compareAndSwapLong(r17, r18, r20, r22)
            if (r1 == 0) goto L_0x007d
            goto L_0x0102
        L_0x007d:
            j$.util.concurrent.c[] r1 = r9.f25988c
            if (r1 != r7) goto L_0x0061
            int r1 = f25977i
            if (r8 < r1) goto L_0x0086
            goto L_0x0061
        L_0x0086:
            if (r15 != 0) goto L_0x008a
            r15 = r12
            goto L_0x00b7
        L_0x008a:
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x00b7
            long r3 = f25982n
            r5 = 0
            r6 = 1
            r1 = r2
            r2 = r24
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00b7
            j$.util.concurrent.c[] r1 = r9.f25988c     // Catch:{ all -> 0x00b3 }
            if (r1 != r7) goto L_0x00af
            int r1 = r8 << 1
            j$.util.concurrent.c[] r1 = new p342j$.util.concurrent.C9390c[r1]     // Catch:{ all -> 0x00b3 }
            r2 = r13
        L_0x00a4:
            if (r2 >= r8) goto L_0x00ad
            r3 = r7[r2]     // Catch:{ all -> 0x00b3 }
            r1[r2] = r3     // Catch:{ all -> 0x00b3 }
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x00ad:
            r9.f25988c = r1     // Catch:{ all -> 0x00b3 }
        L_0x00af:
            r9.cellsBusy = r13
            goto L_0x001a
        L_0x00b3:
            r0 = move-exception
            r9.cellsBusy = r13
            throw r0
        L_0x00b7:
            int r1 = p342j$.util.concurrent.ThreadLocalRandom.m34699a(r14)
            r14 = r1
            goto L_0x001b
        L_0x00be:
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x00f2
            j$.util.concurrent.c[] r1 = r9.f25988c
            if (r1 != r7) goto L_0x00f2
            sun.misc.Unsafe r1 = f25978j
            long r3 = f25982n
            r5 = 0
            r6 = 1
            r2 = r24
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00f2
            j$.util.concurrent.c[] r1 = r9.f25988c     // Catch:{ all -> 0x00ee }
            if (r1 != r7) goto L_0x00e8
            r1 = 2
            j$.util.concurrent.c[] r1 = new p342j$.util.concurrent.C9390c[r1]     // Catch:{ all -> 0x00ee }
            r2 = r14 & 1
            j$.util.concurrent.c r3 = new j$.util.concurrent.c     // Catch:{ all -> 0x00ee }
            r3.<init>(r10)     // Catch:{ all -> 0x00ee }
            r1[r2] = r3     // Catch:{ all -> 0x00ee }
            r9.f25988c = r1     // Catch:{ all -> 0x00ee }
            r1 = r12
            goto L_0x00e9
        L_0x00e8:
            r1 = r13
        L_0x00e9:
            r9.cellsBusy = r13
            if (r1 == 0) goto L_0x001b
            goto L_0x0102
        L_0x00ee:
            r0 = move-exception
            r9.cellsBusy = r13
            throw r0
        L_0x00f2:
            sun.misc.Unsafe r1 = f25978j
            long r3 = f25981m
            long r5 = r9.baseCount
            long r7 = r5 + r10
            r2 = r24
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 == 0) goto L_0x001b
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.ConcurrentHashMap.m34685e(long, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    private final C9399l[] m34686g() {
        while (true) {
            C9399l[] lVarArr = this.f25986a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else {
                if (f25978j.compareAndSwapInt(this, f25979k, i, -1)) {
                    try {
                        C9399l[] lVarArr2 = this.f25986a;
                        if (lVarArr2 == null || lVarArr2.length == 0) {
                            int i2 = i > 0 ? i : 16;
                            C9399l[] lVarArr3 = new C9399l[i2];
                            this.f25986a = lVarArr3;
                            i = i2 - (i2 >>> 2);
                            lVarArr2 = lVarArr3;
                        }
                        this.sizeCtl = i;
                        return lVarArr2;
                    } catch (Throwable th) {
                        this.sizeCtl = i;
                        throw th;
                    }
                }
            }
        }
    }

    /* renamed from: j */
    static final void m34687j(C9399l[] lVarArr, int i, C9399l lVar) {
        f25978j.putObjectVolatile(lVarArr, (((long) i) << f25985q) + f25984p, lVar);
    }

    /* renamed from: k */
    static final int m34688k(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    /* renamed from: m */
    static final C9399l m34689m(C9399l[] lVarArr, int i) {
        return (C9399l) f25978j.getObjectVolatile(lVarArr, (((long) i) << f25985q) + f25984p);
    }

    /* renamed from: n */
    private static final int m34690n(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 0) {
            return 1;
        }
        if (i7 >= 1073741824) {
            return 1073741824;
        }
        return 1 + i7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: j$.util.concurrent.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: j$.util.concurrent.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: j$.util.concurrent.r} */
    /* JADX WARNING: type inference failed for: r6v12, types: [j$.util.concurrent.l] */
    /* JADX WARNING: type inference failed for: r15v16, types: [j$.util.concurrent.l] */
    /* JADX WARNING: type inference failed for: r6v17, types: [j$.util.concurrent.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m34691o(p342j$.util.concurrent.C9399l[] r30, p342j$.util.concurrent.C9399l[] r31) {
        /*
            r29 = this;
            r7 = r29
            r0 = r30
            int r8 = r0.length
            int r1 = f25977i
            r9 = 1
            if (r1 <= r9) goto L_0x000e
            int r2 = r8 >>> 3
            int r2 = r2 / r1
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            r1 = 16
            if (r2 >= r1) goto L_0x0015
            r10 = r1
            goto L_0x0016
        L_0x0015:
            r10 = r2
        L_0x0016:
            if (r31 != 0) goto L_0x0028
            int r1 = r8 << 1
            j$.util.concurrent.l[] r1 = new p342j$.util.concurrent.C9399l[r1]     // Catch:{ all -> 0x0022 }
            r7.f25987b = r1
            r7.transferIndex = r8
            r11 = r1
            goto L_0x002a
        L_0x0022:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7.sizeCtl = r0
            return
        L_0x0028:
            r11 = r31
        L_0x002a:
            int r12 = r11.length
            j$.util.concurrent.g r13 = new j$.util.concurrent.g
            r13.<init>(r11)
            r4 = r0
            r3 = r7
            r15 = r9
            r5 = 0
            r6 = 0
            r16 = 0
        L_0x0037:
            r1 = -1
            if (r15 == 0) goto L_0x008a
            int r5 = r5 + -1
            if (r5 >= r6) goto L_0x007a
            if (r16 == 0) goto L_0x0041
            goto L_0x007a
        L_0x0041:
            int r2 = r3.transferIndex
            if (r2 > 0) goto L_0x004a
            r5 = r1
            r21 = r3
            r14 = r4
            goto L_0x0085
        L_0x004a:
            sun.misc.Unsafe r1 = f25978j
            long r17 = f25980l
            if (r2 <= r10) goto L_0x0053
            int r19 = r2 - r10
            goto L_0x0055
        L_0x0053:
            r19 = 0
        L_0x0055:
            r20 = r2
            r2 = r29
            r21 = r3
            r14 = r4
            r3 = r17
            r17 = r5
            r5 = r20
            r18 = r6
            r6 = r19
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0072
            int r2 = r20 + -1
            r5 = r2
            r6 = r19
            goto L_0x0085
        L_0x0072:
            r4 = r14
            r5 = r17
            r6 = r18
            r3 = r21
            goto L_0x0037
        L_0x007a:
            r21 = r3
            r14 = r4
            r17 = r5
            r18 = r6
            r5 = r17
            r6 = r18
        L_0x0085:
            r4 = r14
            r3 = r21
            r15 = 0
            goto L_0x0037
        L_0x008a:
            r21 = r3
            r14 = r4
            r18 = r6
            r2 = 0
            if (r5 < 0) goto L_0x01af
            if (r5 >= r8) goto L_0x01af
            int r3 = r5 + r8
            if (r3 < r12) goto L_0x009a
            goto L_0x01af
        L_0x009a:
            j$.util.concurrent.l r4 = m34689m(r14, r5)
            if (r4 != 0) goto L_0x00a5
            boolean r1 = m34682b(r14, r5, r13)
            goto L_0x00aa
        L_0x00a5:
            int r6 = r4.f26011a
            if (r6 != r1) goto L_0x00b7
            r1 = r9
        L_0x00aa:
            r15 = r1
            r19 = r10
            r20 = r12
            r4 = r14
            r3 = r21
            r10 = r9
            r9 = r7
            r7 = r13
            goto L_0x01f6
        L_0x00b7:
            monitor-enter(r4)
            j$.util.concurrent.l r1 = m34689m(r14, r5)     // Catch:{ all -> 0x01ac }
            if (r1 != r4) goto L_0x01a0
            if (r6 < 0) goto L_0x0113
            r1 = r6 & r8
            j$.util.concurrent.l r6 = r4.f26014d     // Catch:{ all -> 0x01ac }
            r15 = r4
        L_0x00c5:
            if (r6 == 0) goto L_0x00d2
            int r9 = r6.f26011a     // Catch:{ all -> 0x01ac }
            r9 = r9 & r8
            if (r9 == r1) goto L_0x00ce
            r15 = r6
            r1 = r9
        L_0x00ce:
            j$.util.concurrent.l r6 = r6.f26014d     // Catch:{ all -> 0x01ac }
            r9 = 1
            goto L_0x00c5
        L_0x00d2:
            if (r1 != 0) goto L_0x00d6
            r1 = r15
            goto L_0x00d8
        L_0x00d6:
            r1 = r2
            r2 = r15
        L_0x00d8:
            r6 = r4
        L_0x00d9:
            if (r6 == r15) goto L_0x0103
            int r9 = r6.f26011a     // Catch:{ all -> 0x01ac }
            r19 = r10
            java.lang.Object r10 = r6.f26012b     // Catch:{ all -> 0x01ac }
            r20 = r12
            java.lang.Object r12 = r6.f26013c     // Catch:{ all -> 0x01ac }
            r21 = r9 & r8
            if (r21 != 0) goto L_0x00f2
            r21 = r15
            j$.util.concurrent.l r15 = new j$.util.concurrent.l     // Catch:{ all -> 0x01ac }
            r15.<init>(r9, r10, r12, r1)     // Catch:{ all -> 0x01ac }
            r1 = r15
            goto L_0x00fa
        L_0x00f2:
            r21 = r15
            j$.util.concurrent.l r15 = new j$.util.concurrent.l     // Catch:{ all -> 0x01ac }
            r15.<init>(r9, r10, r12, r2)     // Catch:{ all -> 0x01ac }
            r2 = r15
        L_0x00fa:
            j$.util.concurrent.l r6 = r6.f26014d     // Catch:{ all -> 0x01ac }
            r10 = r19
            r12 = r20
            r15 = r21
            goto L_0x00d9
        L_0x0103:
            r19 = r10
            r20 = r12
            m34687j(r11, r5, r1)     // Catch:{ all -> 0x01ac }
            m34687j(r11, r3, r2)     // Catch:{ all -> 0x01ac }
            m34687j(r14, r5, r13)     // Catch:{ all -> 0x01ac }
            r7 = r13
            goto L_0x019e
        L_0x0113:
            r19 = r10
            r20 = r12
            boolean r1 = r4 instanceof p342j$.util.concurrent.C9404q     // Catch:{ all -> 0x01ac }
            if (r1 == 0) goto L_0x01a4
            r1 = r4
            j$.util.concurrent.q r1 = (p342j$.util.concurrent.C9404q) r1     // Catch:{ all -> 0x01ac }
            j$.util.concurrent.r r6 = r1.f26030f     // Catch:{ all -> 0x01ac }
            r9 = r2
            r10 = r9
            r12 = r6
            r14 = 0
            r15 = 0
            r6 = r10
        L_0x0126:
            if (r12 == 0) goto L_0x0169
            r27 = r1
            int r1 = r12.f26011a     // Catch:{ all -> 0x01ac }
            j$.util.concurrent.r r7 = new j$.util.concurrent.r     // Catch:{ all -> 0x01ac }
            java.lang.Object r0 = r12.f26012b     // Catch:{ all -> 0x01ac }
            r28 = r13
            java.lang.Object r13 = r12.f26013c     // Catch:{ all -> 0x01ac }
            r25 = 0
            r26 = 0
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r13
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01ac }
            r0 = r1 & r8
            if (r0 != 0) goto L_0x0153
            r7.f26035h = r10     // Catch:{ all -> 0x01ac }
            if (r10 != 0) goto L_0x014d
            r2 = r7
            goto L_0x014f
        L_0x014d:
            r10.f26014d = r7     // Catch:{ all -> 0x01ac }
        L_0x014f:
            int r14 = r14 + 1
            r10 = r7
            goto L_0x015e
        L_0x0153:
            r7.f26035h = r9     // Catch:{ all -> 0x01ac }
            if (r9 != 0) goto L_0x0159
            r6 = r7
            goto L_0x015b
        L_0x0159:
            r9.f26014d = r7     // Catch:{ all -> 0x01ac }
        L_0x015b:
            int r15 = r15 + 1
            r9 = r7
        L_0x015e:
            j$.util.concurrent.l r12 = r12.f26014d     // Catch:{ all -> 0x01ac }
            r7 = r29
            r0 = r30
            r1 = r27
            r13 = r28
            goto L_0x0126
        L_0x0169:
            r27 = r1
            r28 = r13
            r0 = 6
            if (r14 > r0) goto L_0x0175
            j$.util.concurrent.l r1 = m34694r(r2)     // Catch:{ all -> 0x01ac }
            goto L_0x017f
        L_0x0175:
            if (r15 == 0) goto L_0x017d
            j$.util.concurrent.q r1 = new j$.util.concurrent.q     // Catch:{ all -> 0x01ac }
            r1.<init>(r2)     // Catch:{ all -> 0x01ac }
            goto L_0x017f
        L_0x017d:
            r1 = r27
        L_0x017f:
            if (r15 > r0) goto L_0x0186
            j$.util.concurrent.l r0 = m34694r(r6)     // Catch:{ all -> 0x01ac }
            goto L_0x0190
        L_0x0186:
            if (r14 == 0) goto L_0x018e
            j$.util.concurrent.q r0 = new j$.util.concurrent.q     // Catch:{ all -> 0x01ac }
            r0.<init>(r6)     // Catch:{ all -> 0x01ac }
            goto L_0x0190
        L_0x018e:
            r0 = r27
        L_0x0190:
            m34687j(r11, r5, r1)     // Catch:{ all -> 0x01ac }
            m34687j(r11, r3, r0)     // Catch:{ all -> 0x01ac }
            r0 = r30
            r7 = r28
            m34687j(r0, r5, r7)     // Catch:{ all -> 0x01ac }
            r14 = r0
        L_0x019e:
            r15 = 1
            goto L_0x01a5
        L_0x01a0:
            r19 = r10
            r20 = r12
        L_0x01a4:
            r7 = r13
        L_0x01a5:
            monitor-exit(r4)     // Catch:{ all -> 0x01ac }
            r3 = r29
            r4 = r14
            r10 = 1
            r9 = r3
            goto L_0x01f6
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ac }
            throw r0
        L_0x01af:
            r19 = r10
            r20 = r12
            r7 = r13
            if (r16 == 0) goto L_0x01c5
            r9 = r29
            r9.f25987b = r2
            r9.f25986a = r11
            int r0 = r8 << 1
            r10 = 1
            int r1 = r8 >>> 1
            int r0 = r0 - r1
            r9.sizeCtl = r0
            return
        L_0x01c5:
            r10 = 1
            r9 = r29
            sun.misc.Unsafe r1 = f25978j
            long r3 = f25979k
            int r12 = r9.sizeCtl
            int r6 = r12 + -1
            r2 = r29
            r17 = r5
            r5 = r12
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x01f2
            int r12 = r12 + -2
            int r1 = java.lang.Integer.numberOfLeadingZeros(r8)
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            int r2 = f25976h
            int r1 = r1 << r2
            if (r12 == r1) goto L_0x01eb
            return
        L_0x01eb:
            r5 = r8
            r3 = r9
            r15 = r10
            r16 = r15
            r4 = r14
            goto L_0x01f6
        L_0x01f2:
            r3 = r9
            r4 = r14
            r5 = r17
        L_0x01f6:
            r13 = r7
            r7 = r9
            r9 = r10
            r6 = r18
            r10 = r19
            r12 = r20
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.ConcurrentHashMap.m34691o(j$.util.concurrent.l[], j$.util.concurrent.l[]):void");
    }

    /* renamed from: p */
    private final void m34692p(C9399l[] lVarArr, int i) {
        int length = lVarArr.length;
        if (length < 64) {
            m34693q(length << 1);
            return;
        }
        C9399l m = m34689m(lVarArr, i);
        if (m != null && m.f26011a >= 0) {
            synchronized (m) {
                if (m34689m(lVarArr, i) == m) {
                    C9405r rVar = null;
                    C9399l lVar = m;
                    C9405r rVar2 = null;
                    while (lVar != null) {
                        C9405r rVar3 = new C9405r(lVar.f26011a, lVar.f26012b, lVar.f26013c, (C9405r) null, (C9405r) null);
                        rVar3.f26035h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.f26014d = rVar3;
                        }
                        lVar = lVar.f26014d;
                        rVar2 = rVar3;
                    }
                    m34687j(lVarArr, i, new C9404q(rVar));
                }
            }
        }
    }

    /* renamed from: q */
    private final void m34693q(int i) {
        int length;
        C9399l[] lVarArr;
        int n = i >= 536870912 ? 1073741824 : m34690n(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 >= 0) {
                C9399l[] lVarArr2 = this.f25986a;
                if (lVarArr2 == null || (length = lVarArr2.length) == 0) {
                    int i3 = i2 > n ? i2 : n;
                    if (f25978j.compareAndSwapInt(this, f25979k, i2, -1)) {
                        try {
                            if (this.f25986a == lVarArr2) {
                                this.f25986a = new C9399l[i3];
                                i2 = i3 - (i3 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i2;
                        }
                    }
                } else if (n > i2 && length < 1073741824) {
                    if (lVarArr2 == this.f25986a) {
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                        int i4 = f25976h;
                        if (i2 >= 0) {
                            if (f25978j.compareAndSwapInt(this, f25979k, i2, (numberOfLeadingZeros << i4) + 2)) {
                                m34691o(lVarArr2, (C9399l[]) null);
                            }
                        } else if ((i2 >>> i4) == numberOfLeadingZeros && i2 != numberOfLeadingZeros + 1 && i2 != numberOfLeadingZeros + f25975g && (lVarArr = this.f25987b) != null && this.transferIndex > 0) {
                            if (f25978j.compareAndSwapInt(this, f25979k, i2, i2 + 1)) {
                                m34691o(lVarArr2, lVarArr);
                            }
                        } else {
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    static C9399l m34694r(C9405r rVar) {
        C9399l lVar = null;
        C9399l lVar2 = null;
        for (C9399l lVar3 = rVar; lVar3 != null; lVar3 = lVar3.f26014d) {
            C9399l lVar4 = new C9399l(lVar3.f26011a, lVar3.f26012b, lVar3.f26013c, (C9399l) null);
            if (lVar2 == null) {
                lVar = lVar4;
            } else {
                lVar2.f26014d = lVar4;
            }
            lVar2 = lVar4;
        }
        return lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j;
        int i;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        C9399l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j = 1;
            if (readObject != null && readObject2 != null) {
                j3++;
                lVar = new C9399l(m34688k(readObject.hashCode()), readObject, readObject2, lVar);
            }
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        boolean z2 = true;
        if (j3 >= 536870912) {
            i = 1073741824;
        } else {
            int i2 = (int) j3;
            i = m34690n(i2 + (i2 >>> 1) + 1);
        }
        C9399l[] lVarArr = new C9399l[i];
        int i3 = i - 1;
        while (lVar != null) {
            C9399l lVar2 = lVar.f26014d;
            int i4 = lVar.f26011a;
            int i5 = i4 & i3;
            C9399l m = m34689m(lVarArr, i5);
            if (m == null) {
                z = z2;
            } else {
                Object obj2 = lVar.f26012b;
                if (m.f26011a >= 0) {
                    C9399l lVar3 = m;
                    int i6 = 0;
                    while (true) {
                        if (lVar3 == null) {
                            z = true;
                            break;
                        } else if (lVar3.f26011a != i4 || ((obj = lVar3.f26012b) != obj2 && (obj == null || !obj2.equals(obj)))) {
                            i6++;
                            lVar3 = lVar3.f26014d;
                        }
                    }
                    z = false;
                    if (z && i6 >= 8) {
                        long j4 = j2 + 1;
                        lVar.f26014d = m;
                        C9399l lVar4 = lVar;
                        C9405r rVar = null;
                        C9405r rVar2 = null;
                        while (lVar4 != null) {
                            long j5 = j4;
                            C9405r rVar3 = new C9405r(lVar4.f26011a, lVar4.f26012b, lVar4.f26013c, (C9405r) null, (C9405r) null);
                            rVar3.f26035h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.f26014d = rVar3;
                            }
                            lVar4 = lVar4.f26014d;
                            rVar2 = rVar3;
                            j4 = j5;
                        }
                        m34687j(lVarArr, i5, new C9404q(rVar));
                        j2 = j4;
                    }
                } else if (((C9404q) m).mo25407f(i4, obj2, lVar.f26013c) == null) {
                    j2 += j;
                }
                z = false;
            }
            if (z) {
                j2++;
                lVar.f26014d = m;
                m34687j(lVarArr, i5, lVar);
            }
            j = 1;
            lVar = lVar2;
            z2 = true;
        }
        this.f25986a = lVarArr;
        this.sizeCtl = i - (i >>> 2);
        this.baseCount = j2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = 0;
        int i2 = 1;
        while (i2 < 16) {
            i++;
            i2 <<= 1;
        }
        int i3 = 32 - i;
        int i4 = i2 - 1;
        C9401n[] nVarArr = new C9401n[16];
        for (int i5 = 0; i5 < 16; i5++) {
            nVarArr[i5] = new C9401n();
        }
        objectOutputStream.putFields().put("segments", nVarArr);
        objectOutputStream.putFields().put("segmentShift", i3);
        objectOutputStream.putFields().put("segmentMask", i4);
        objectOutputStream.writeFields();
        C9399l[] lVarArr = this.f25986a;
        if (lVarArr != null) {
            C9403p pVar = new C9403p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                C9399l b = pVar.mo25406b();
                if (b == null) {
                    break;
                }
                objectOutputStream.writeObject(b.f26012b);
                objectOutputStream.writeObject(b.f26013c);
            }
        }
        objectOutputStream.writeObject((Object) null);
        objectOutputStream.writeObject((Object) null);
    }

    public void clear() {
        C9399l[] lVarArr = this.f25986a;
        long j = 0;
        loop0:
        while (true) {
            int i = 0;
            while (lVarArr != null && i < lVarArr.length) {
                C9399l m = m34689m(lVarArr, i);
                if (m == null) {
                    i++;
                } else {
                    int i2 = m.f26011a;
                    if (i2 == -1) {
                        lVarArr = mo25316f(lVarArr, m);
                    } else {
                        synchronized (m) {
                            if (m34689m(lVarArr, i) == m) {
                                for (C9399l lVar = i2 >= 0 ? m : m instanceof C9404q ? ((C9404q) m).f26030f : null; lVar != null; lVar = lVar.f26014d) {
                                    j--;
                                }
                                m34687j(lVarArr, i, (C9399l) null);
                                i++;
                            }
                        }
                    }
                }
            }
        }
        if (j != 0) {
            m34681a(j, -1);
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj2;
        Object obj3;
        int i;
        C9399l lVar;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int k = m34688k(obj.hashCode());
        C9399l[] lVarArr = this.f25986a;
        int i2 = 0;
        Object obj4 = null;
        int i3 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & k;
                    C9399l m = m34689m(lVarArr, i4);
                    if (m == null) {
                        C9400m mVar = new C9400m();
                        synchronized (mVar) {
                            if (m34682b(lVarArr, i4, mVar)) {
                                try {
                                    Object apply = biFunction.apply(obj, (Object) null);
                                    if (apply != null) {
                                        lVar = new C9399l(k, obj, apply, (C9399l) null);
                                        i = 1;
                                    } else {
                                        i = i2;
                                        lVar = null;
                                    }
                                    m34687j(lVarArr, i4, lVar);
                                    i2 = i;
                                    obj4 = apply;
                                    i3 = 1;
                                } catch (Throwable th) {
                                    m34687j(lVarArr, i4, (C9399l) null);
                                    throw th;
                                }
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    } else {
                        int i5 = m.f26011a;
                        if (i5 == -1) {
                            lVarArr = mo25316f(lVarArr, m);
                        } else {
                            synchronized (m) {
                                try {
                                    if (m34689m(lVarArr, i4) == m) {
                                        if (i5 >= 0) {
                                            C9399l lVar2 = null;
                                            C9399l lVar3 = m;
                                            int i6 = 1;
                                            while (true) {
                                                if (lVar3.f26011a != k || ((obj3 = lVar3.f26012b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                    C9399l lVar4 = lVar3.f26014d;
                                                    if (lVar4 == null) {
                                                        Object apply2 = biFunction.apply(obj, (Object) null);
                                                        if (apply2 != null) {
                                                            lVar3.f26014d = new C9399l(k, obj, apply2, (C9399l) null);
                                                            i2 = 1;
                                                        }
                                                        obj2 = apply2;
                                                    } else {
                                                        i6++;
                                                        C9399l lVar5 = lVar4;
                                                        lVar2 = lVar3;
                                                        lVar3 = lVar5;
                                                    }
                                                }
                                            }
                                            obj2 = biFunction.apply(obj, lVar3.f26013c);
                                            if (obj2 != null) {
                                                lVar3.f26013c = obj2;
                                            } else {
                                                C9399l lVar6 = lVar3.f26014d;
                                                if (lVar2 != null) {
                                                    lVar2.f26014d = lVar6;
                                                } else {
                                                    m34687j(lVarArr, i4, lVar6);
                                                }
                                                i2 = -1;
                                            }
                                            i3 = i6;
                                            obj4 = obj2;
                                        } else if (m instanceof C9404q) {
                                            C9404q qVar = (C9404q) m;
                                            C9405r rVar = qVar.f26029e;
                                            C9405r b = rVar != null ? rVar.mo25409b(k, obj, (Class) null) : null;
                                            Object apply3 = biFunction.apply(obj, b == null ? null : b.f26013c);
                                            if (apply3 != null) {
                                                if (b != null) {
                                                    b.f26013c = apply3;
                                                } else {
                                                    qVar.mo25407f(k, obj, apply3);
                                                    i2 = 1;
                                                }
                                            } else if (b != null) {
                                                if (qVar.mo25408g(b)) {
                                                    m34687j(lVarArr, i4, m34694r(qVar.f26030f));
                                                }
                                                i3 = 1;
                                                obj4 = apply3;
                                                i2 = -1;
                                            }
                                            i3 = 1;
                                            obj4 = apply3;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    while (true) {
                                        throw th2;
                                    }
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    m34692p(lVarArr, i4);
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = m34686g();
        }
        if (i2 != 0) {
            m34681a((long) i2, i3);
        }
        return obj4;
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c5, code lost:
        if (r5 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00c7, code lost:
        m34681a(1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00cc, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object computeIfAbsent(java.lang.Object r13, p342j$.util.function.Function r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L_0x00d6
            if (r14 == 0) goto L_0x00d6
            int r1 = r13.hashCode()
            int r1 = m34688k(r1)
            j$.util.concurrent.l[] r2 = r12.f25986a
            r3 = 0
            r5 = r0
            r4 = r3
        L_0x0012:
            if (r2 == 0) goto L_0x00d0
            int r6 = r2.length
            if (r6 != 0) goto L_0x0019
            goto L_0x00d0
        L_0x0019:
            int r6 = r6 + -1
            r6 = r6 & r1
            j$.util.concurrent.l r7 = m34689m(r2, r6)
            r8 = 1
            if (r7 != 0) goto L_0x004f
            j$.util.concurrent.m r9 = new j$.util.concurrent.m
            r9.<init>()
            monitor-enter(r9)
            boolean r7 = m34682b(r2, r6, r9)     // Catch:{ all -> 0x004c }
            if (r7 == 0) goto L_0x0047
            java.lang.Object r4 = r14.apply(r13)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x003b
            j$.util.concurrent.l r5 = new j$.util.concurrent.l     // Catch:{ all -> 0x0042 }
            r5.<init>(r1, r13, r4, r0)     // Catch:{ all -> 0x0042 }
            goto L_0x003c
        L_0x003b:
            r5 = r0
        L_0x003c:
            m34687j(r2, r6, r5)     // Catch:{ all -> 0x004c }
            r5 = r4
            r4 = r8
            goto L_0x0047
        L_0x0042:
            r13 = move-exception
            m34687j(r2, r6, r0)     // Catch:{ all -> 0x004c }
            throw r13     // Catch:{ all -> 0x004c }
        L_0x0047:
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0012
            goto L_0x00c5
        L_0x004c:
            r13 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            throw r13
        L_0x004f:
            int r9 = r7.f26011a
            r10 = -1
            if (r9 != r10) goto L_0x0059
            j$.util.concurrent.l[] r2 = r12.mo25316f(r2, r7)
            goto L_0x0012
        L_0x0059:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = m34689m(r2, r6)     // Catch:{ all -> 0x00cd }
            if (r10 != r7) goto L_0x00b7
            if (r9 < 0) goto L_0x0094
            r4 = r7
            r5 = r8
        L_0x0064:
            int r9 = r4.f26011a     // Catch:{ all -> 0x00cd }
            if (r9 != r1) goto L_0x0078
            java.lang.Object r9 = r4.f26012b     // Catch:{ all -> 0x00cd }
            if (r9 == r13) goto L_0x0074
            if (r9 == 0) goto L_0x0078
            boolean r9 = r13.equals(r9)     // Catch:{ all -> 0x00cd }
            if (r9 == 0) goto L_0x0078
        L_0x0074:
            java.lang.Object r4 = r4.f26013c     // Catch:{ all -> 0x00cd }
            r8 = r3
            goto L_0x008c
        L_0x0078:
            j$.util.concurrent.l r9 = r4.f26014d     // Catch:{ all -> 0x00cd }
            if (r9 != 0) goto L_0x0090
            java.lang.Object r9 = r14.apply(r13)     // Catch:{ all -> 0x00cd }
            if (r9 == 0) goto L_0x008a
            j$.util.concurrent.l r10 = new j$.util.concurrent.l     // Catch:{ all -> 0x00cd }
            r10.<init>(r1, r13, r9, r0)     // Catch:{ all -> 0x00cd }
            r4.f26014d = r10     // Catch:{ all -> 0x00cd }
            goto L_0x008b
        L_0x008a:
            r8 = r3
        L_0x008b:
            r4 = r9
        L_0x008c:
            r11 = r5
            r5 = r4
            r4 = r11
            goto L_0x00b8
        L_0x0090:
            int r5 = r5 + 1
            r4 = r9
            goto L_0x0064
        L_0x0094:
            boolean r9 = r7 instanceof p342j$.util.concurrent.C9404q     // Catch:{ all -> 0x00cd }
            if (r9 == 0) goto L_0x00b7
            r4 = r7
            j$.util.concurrent.q r4 = (p342j$.util.concurrent.C9404q) r4     // Catch:{ all -> 0x00cd }
            j$.util.concurrent.r r5 = r4.f26029e     // Catch:{ all -> 0x00cd }
            if (r5 == 0) goto L_0x00a9
            j$.util.concurrent.r r5 = r5.mo25409b(r1, r13, r0)     // Catch:{ all -> 0x00cd }
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r4 = r5.f26013c     // Catch:{ all -> 0x00cd }
            r8 = r3
            goto L_0x00b5
        L_0x00a9:
            java.lang.Object r5 = r14.apply(r13)     // Catch:{ all -> 0x00cd }
            if (r5 == 0) goto L_0x00b3
            r4.mo25407f(r1, r13, r5)     // Catch:{ all -> 0x00cd }
            goto L_0x00b4
        L_0x00b3:
            r8 = r3
        L_0x00b4:
            r4 = r5
        L_0x00b5:
            r5 = 2
            goto L_0x008c
        L_0x00b7:
            r8 = r3
        L_0x00b8:
            monitor-exit(r7)     // Catch:{ all -> 0x00cd }
            if (r4 == 0) goto L_0x0012
            r13 = 8
            if (r4 < r13) goto L_0x00c2
            r12.m34692p(r2, r6)
        L_0x00c2:
            if (r8 != 0) goto L_0x00c5
            return r5
        L_0x00c5:
            if (r5 == 0) goto L_0x00cc
            r13 = 1
            r12.m34681a(r13, r4)
        L_0x00cc:
            return r5
        L_0x00cd:
            r13 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00cd }
            throw r13
        L_0x00d0:
            j$.util.concurrent.l[] r2 = r12.m34686g()
            goto L_0x0012
        L_0x00d6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        C9405r b;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int k = m34688k(obj.hashCode());
        C9399l[] lVarArr = this.f25986a;
        int i = 0;
        Object obj3 = null;
        int i2 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i3 = (length - 1) & k;
                    C9399l m = m34689m(lVarArr, i3);
                    if (m == null) {
                        break;
                    }
                    int i4 = m.f26011a;
                    if (i4 == -1) {
                        lVarArr = mo25316f(lVarArr, m);
                    } else {
                        synchronized (m) {
                            try {
                                if (m34689m(lVarArr, i3) == m) {
                                    if (i4 >= 0) {
                                        i2 = 1;
                                        C9399l lVar = null;
                                        C9399l lVar2 = m;
                                        while (true) {
                                            if (lVar2.f26011a != k || ((obj2 = lVar2.f26012b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                                C9399l lVar3 = lVar2.f26014d;
                                                if (lVar3 == null) {
                                                    break;
                                                }
                                                i2++;
                                                C9399l lVar4 = lVar3;
                                                lVar = lVar2;
                                                lVar2 = lVar4;
                                            }
                                        }
                                        obj3 = biFunction.apply(obj, lVar2.f26013c);
                                        if (obj3 != null) {
                                            lVar2.f26013c = obj3;
                                        } else {
                                            C9399l lVar5 = lVar2.f26014d;
                                            if (lVar != null) {
                                                lVar.f26014d = lVar5;
                                            } else {
                                                m34687j(lVarArr, i3, lVar5);
                                            }
                                            i = -1;
                                        }
                                    } else if (m instanceof C9404q) {
                                        C9404q qVar = (C9404q) m;
                                        C9405r rVar = qVar.f26029e;
                                        if (!(rVar == null || (b = rVar.mo25409b(k, obj, (Class) null)) == null)) {
                                            obj3 = biFunction.apply(obj, b.f26013c);
                                            if (obj3 != null) {
                                                b.f26013c = obj3;
                                            } else {
                                                if (qVar.mo25408g(b)) {
                                                    m34687j(lVarArr, i3, m34694r(qVar.f26030f));
                                                }
                                                i = -1;
                                            }
                                        }
                                        i2 = 2;
                                    }
                                }
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
            lVarArr = m34686g();
        }
        if (i != 0) {
            m34681a((long) i, i2);
        }
        return obj3;
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        obj.getClass();
        C9399l[] lVarArr = this.f25986a;
        if (lVarArr != null) {
            C9403p pVar = new C9403p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                C9399l b = pVar.mo25406b();
                if (b == null) {
                    break;
                }
                Object obj2 = b.f26013c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Set entrySet() {
        C9392e eVar = this.f25991f;
        if (eVar != null) {
            return eVar;
        }
        C9392e eVar2 = new C9392e(this);
        this.f25991f = eVar2;
        return eVar2;
    }

    public final boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C9399l[] lVarArr = this.f25986a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        C9403p pVar = new C9403p(lVarArr, length, 0, length);
        while (true) {
            C9399l b = pVar.mo25406b();
            if (b != null) {
                Object obj3 = b.f26013c;
                Object obj4 = map.get(b.f26012b);
                if (obj4 == null || (obj4 != obj3 && !obj4.equals(obj3))) {
                    return false;
                }
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (obj2 = get(key)) == null || (value != obj2 && !value.equals(obj2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C9399l[] mo25316f(C9399l[] lVarArr, C9399l lVar) {
        C9399l[] lVarArr2;
        int i;
        if (!(lVar instanceof C9394g) || (lVarArr2 = ((C9394g) lVar).f26004e) == null) {
            return this.f25986a;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
        while (true) {
            if (lVarArr2 != this.f25987b || this.f25986a != lVarArr || (i = this.sizeCtl) >= 0 || (i >>> f25976h) != numberOfLeadingZeros || i == numberOfLeadingZeros + 1 || i == f25975g + numberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            }
            if (f25978j.compareAndSwapInt(this, f25979k, i, i + 1)) {
                m34691o(lVarArr, lVarArr2);
                break;
            }
        }
        return lVarArr2;
    }

    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C9399l[] lVarArr = this.f25986a;
        if (lVarArr != null) {
            C9403p pVar = new C9403p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                C9399l b = pVar.mo25406b();
                if (b != null) {
                    biConsumer.accept(b.f26012b, b.f26013c);
                } else {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return r1.f26013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = m34688k(r0)
            j$.util.concurrent.l[] r1 = r4.f25986a
            r2 = 0
            if (r1 == 0) goto L_0x004e
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004e
            int r3 = r3 + -1
            r3 = r3 & r0
            j$.util.concurrent.l r1 = m34689m(r1, r3)
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f26011a
            if (r3 != r0) goto L_0x002c
            java.lang.Object r3 = r1.f26012b
            if (r3 == r5) goto L_0x0029
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x0029:
            java.lang.Object r5 = r1.f26013c
            return r5
        L_0x002c:
            if (r3 >= 0) goto L_0x0037
            j$.util.concurrent.l r5 = r1.mo25382a(r5, r0)
            if (r5 == 0) goto L_0x0036
            java.lang.Object r2 = r5.f26013c
        L_0x0036:
            return r2
        L_0x0037:
            j$.util.concurrent.l r1 = r1.f26014d
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f26011a
            if (r3 != r0) goto L_0x0037
            java.lang.Object r3 = r1.f26012b
            if (r3 == r5) goto L_0x004b
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x004b:
            java.lang.Object r5 = r1.f26013c
            return r5
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r7 = r6.f26013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r11 != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        r6.f26013c = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008f, code lost:
        m34681a(1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0094, code lost:
        return null;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo25319h(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x009e
            if (r10 == 0) goto L_0x009e
            int r1 = r9.hashCode()
            int r1 = m34688k(r1)
            j$.util.concurrent.l[] r2 = r8.f25986a
            r3 = 0
        L_0x0010:
            if (r2 == 0) goto L_0x0098
            int r4 = r2.length
            if (r4 != 0) goto L_0x0017
            goto L_0x0098
        L_0x0017:
            int r4 = r4 + -1
            r4 = r4 & r1
            j$.util.concurrent.l r5 = m34689m(r2, r4)
            if (r5 != 0) goto L_0x002d
            j$.util.concurrent.l r5 = new j$.util.concurrent.l
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = m34682b(r2, r4, r5)
            if (r4 == 0) goto L_0x0010
            goto L_0x008f
        L_0x002d:
            int r6 = r5.f26011a
            r7 = -1
            if (r6 != r7) goto L_0x0037
            j$.util.concurrent.l[] r2 = r8.mo25316f(r2, r5)
            goto L_0x0010
        L_0x0037:
            monitor-enter(r5)
            j$.util.concurrent.l r7 = m34689m(r2, r4)     // Catch:{ all -> 0x0095 }
            if (r7 != r5) goto L_0x0081
            if (r6 < 0) goto L_0x0069
            r3 = 1
            r6 = r5
        L_0x0042:
            int r7 = r6.f26011a     // Catch:{ all -> 0x0095 }
            if (r7 != r1) goto L_0x0059
            java.lang.Object r7 = r6.f26012b     // Catch:{ all -> 0x0095 }
            if (r7 == r9) goto L_0x0052
            if (r7 == 0) goto L_0x0059
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x0095 }
            if (r7 == 0) goto L_0x0059
        L_0x0052:
            java.lang.Object r7 = r6.f26013c     // Catch:{ all -> 0x0095 }
            if (r11 != 0) goto L_0x0082
            r6.f26013c = r10     // Catch:{ all -> 0x0095 }
            goto L_0x0082
        L_0x0059:
            j$.util.concurrent.l r7 = r6.f26014d     // Catch:{ all -> 0x0095 }
            if (r7 != 0) goto L_0x0065
            j$.util.concurrent.l r7 = new j$.util.concurrent.l     // Catch:{ all -> 0x0095 }
            r7.<init>(r1, r9, r10, r0)     // Catch:{ all -> 0x0095 }
            r6.f26014d = r7     // Catch:{ all -> 0x0095 }
            goto L_0x0081
        L_0x0065:
            int r3 = r3 + 1
            r6 = r7
            goto L_0x0042
        L_0x0069:
            boolean r6 = r5 instanceof p342j$.util.concurrent.C9404q     // Catch:{ all -> 0x0095 }
            if (r6 == 0) goto L_0x0081
            r3 = r5
            j$.util.concurrent.q r3 = (p342j$.util.concurrent.C9404q) r3     // Catch:{ all -> 0x0095 }
            j$.util.concurrent.r r3 = r3.mo25407f(r1, r9, r10)     // Catch:{ all -> 0x0095 }
            if (r3 == 0) goto L_0x007e
            java.lang.Object r6 = r3.f26013c     // Catch:{ all -> 0x0095 }
            if (r11 != 0) goto L_0x007c
            r3.f26013c = r10     // Catch:{ all -> 0x0095 }
        L_0x007c:
            r7 = r6
            goto L_0x007f
        L_0x007e:
            r7 = r0
        L_0x007f:
            r3 = 2
            goto L_0x0082
        L_0x0081:
            r7 = r0
        L_0x0082:
            monitor-exit(r5)     // Catch:{ all -> 0x0095 }
            if (r3 == 0) goto L_0x0010
            r9 = 8
            if (r3 < r9) goto L_0x008c
            r8.m34692p(r2, r4)
        L_0x008c:
            if (r7 == 0) goto L_0x008f
            return r7
        L_0x008f:
            r9 = 1
            r8.m34681a(r9, r3)
            return r0
        L_0x0095:
            r9 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0095 }
            throw r9
        L_0x0098:
            j$.util.concurrent.l[] r2 = r8.m34686g()
            goto L_0x0010
        L_0x009e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.ConcurrentHashMap.mo25319h(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    public final int hashCode() {
        C9399l[] lVarArr = this.f25986a;
        int i = 0;
        if (lVarArr != null) {
            C9403p pVar = new C9403p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                C9399l b = pVar.mo25406b();
                if (b == null) {
                    break;
                }
                i += b.f26013c.hashCode() ^ b.f26012b.hashCode();
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object mo25321i(Object obj, Object obj2, Object obj3) {
        int length;
        int i;
        C9399l m;
        Object obj4;
        boolean z;
        C9399l lVar;
        C9405r b;
        Object obj5;
        int k = m34688k(obj.hashCode());
        C9399l[] lVarArr = this.f25986a;
        while (true) {
            if (lVarArr == null || (length = lVarArr.length) == 0 || (m = m34689m(lVarArr, i)) == null) {
                break;
            }
            int i2 = m.f26011a;
            if (i2 == -1) {
                lVarArr = mo25316f(lVarArr, m);
            } else {
                synchronized (m) {
                    try {
                        if (m34689m(lVarArr, (i = (length - 1) & k)) == m) {
                            z = true;
                            if (i2 >= 0) {
                                C9399l lVar2 = null;
                                C9399l lVar3 = m;
                                while (true) {
                                    if (lVar3.f26011a != k || ((obj5 = lVar3.f26012b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        C9399l lVar4 = lVar3.f26014d;
                                        if (lVar4 == null) {
                                            break;
                                        }
                                        C9399l lVar5 = lVar4;
                                        lVar2 = lVar3;
                                        lVar3 = lVar5;
                                    }
                                }
                                obj4 = lVar3.f26013c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        lVar3.f26013c = obj2;
                                    } else if (lVar2 != null) {
                                        lVar2.f26014d = lVar3.f26014d;
                                    } else {
                                        lVar = lVar3.f26014d;
                                    }
                                }
                                obj4 = null;
                            } else if (m instanceof C9404q) {
                                C9404q qVar = (C9404q) m;
                                C9405r rVar = qVar.f26029e;
                                if (rVar != null && (b = rVar.mo25409b(k, obj, (Class) null)) != null) {
                                    obj4 = b.f26013c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b.f26013c = obj2;
                                        } else if (qVar.mo25408g(b)) {
                                            lVar = m34694r(qVar.f26030f);
                                        }
                                    }
                                }
                                obj4 = null;
                            }
                            m34687j(lVarArr, i, lVar);
                        }
                        z = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (z) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            m34681a(-1, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return mo25324l() <= 0;
    }

    public Set<K> keySet() {
        C9396i iVar = this.f25989d;
        if (iVar != null) {
            return iVar;
        }
        C9396i iVar2 = new C9396i(this);
        this.f25989d = iVar2;
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final long mo25324l() {
        C9390c[] cVarArr = this.f25988c;
        long j = this.baseCount;
        if (cVarArr != null) {
            for (C9390c cVar : cVarArr) {
                if (cVar != null) {
                    j += cVar.value;
                }
            }
        }
        return j;
    }

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i;
        Object obj3;
        Object obj4;
        Object obj5 = obj;
        Object obj6 = obj2;
        BiFunction biFunction2 = biFunction;
        if (obj5 == null || obj6 == null || biFunction2 == null) {
            throw null;
        }
        int k = m34688k(obj.hashCode());
        C9399l[] lVarArr = this.f25986a;
        int i2 = 0;
        Object obj7 = null;
        int i3 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & k;
                    C9399l m = m34689m(lVarArr, i4);
                    i = 1;
                    if (m != null) {
                        int i5 = m.f26011a;
                        int i6 = -1;
                        if (i5 == -1) {
                            lVarArr = mo25316f(lVarArr, m);
                        } else {
                            synchronized (m) {
                                try {
                                    if (m34689m(lVarArr, i4) == m) {
                                        if (i5 >= 0) {
                                            C9399l lVar = null;
                                            C9399l lVar2 = m;
                                            int i7 = 1;
                                            while (true) {
                                                if (lVar2.f26011a != k || ((obj4 = lVar2.f26012b) != obj5 && (obj4 == null || !obj5.equals(obj4)))) {
                                                    C9399l lVar3 = lVar2.f26014d;
                                                    if (lVar3 == null) {
                                                        lVar2.f26014d = new C9399l(k, obj5, obj6, (C9399l) null);
                                                        i3 = 1;
                                                        obj3 = obj6;
                                                        break;
                                                    }
                                                    i7++;
                                                    C9399l lVar4 = lVar3;
                                                    lVar = lVar2;
                                                    lVar2 = lVar4;
                                                }
                                            }
                                            obj3 = biFunction2.apply(lVar2.f26013c, obj6);
                                            if (obj3 != null) {
                                                lVar2.f26013c = obj3;
                                            } else {
                                                C9399l lVar5 = lVar2.f26014d;
                                                if (lVar != null) {
                                                    lVar.f26014d = lVar5;
                                                } else {
                                                    m34687j(lVarArr, i4, lVar5);
                                                }
                                                i3 = -1;
                                            }
                                            i2 = i7;
                                            obj7 = obj3;
                                        } else if (m instanceof C9404q) {
                                            C9404q qVar = (C9404q) m;
                                            C9405r rVar = qVar.f26029e;
                                            C9405r b = rVar == null ? null : rVar.mo25409b(k, obj5, (Class) null);
                                            Object apply = b == null ? obj6 : biFunction2.apply(b.f26013c, obj6);
                                            if (apply != null) {
                                                if (b != null) {
                                                    b.f26013c = apply;
                                                } else {
                                                    qVar.mo25407f(k, obj5, apply);
                                                    i3 = 1;
                                                }
                                            } else if (b != null) {
                                                if (qVar.mo25408g(b)) {
                                                    m34687j(lVarArr, i4, m34694r(qVar.f26030f));
                                                }
                                                i2 = 2;
                                                obj7 = apply;
                                                i3 = i6;
                                            }
                                            i6 = i3;
                                            i2 = 2;
                                            obj7 = apply;
                                            i3 = i6;
                                        }
                                    }
                                } catch (Throwable th) {
                                    while (true) {
                                        throw th;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    m34692p(lVarArr, i4);
                                }
                                i = i3;
                                obj6 = obj7;
                            }
                        }
                    } else if (m34682b(lVarArr, i4, new C9399l(k, obj5, obj6, (C9399l) null))) {
                        break;
                    }
                }
            }
            lVarArr = m34686g();
        }
        if (i != 0) {
            m34681a((long) i, i2);
        }
        return obj6;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public V put(K k, V v) {
        return mo25319h(k, v, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m34693q(map.size());
        for (Map.Entry next : map.entrySet()) {
            mo25319h(next.getKey(), next.getValue(), false);
        }
    }

    public V putIfAbsent(K k, V v) {
        return mo25319h(k, v, true);
    }

    public V remove(Object obj) {
        return mo25321i(obj, (Object) null, (Object) null);
    }

    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || mo25321i(obj, (Object) null, obj2) == null) ? false : true;
    }

    public final Object replace(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return mo25321i(obj, obj2, (Object) null);
        }
        throw null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj != null && obj2 != null && obj3 != null) {
            return mo25321i(obj, obj3, obj2) != null;
        }
        throw null;
    }

    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C9399l[] lVarArr = this.f25986a;
        if (lVarArr != null) {
            C9403p pVar = new C9403p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                C9399l b = pVar.mo25406b();
                if (b != null) {
                    Object obj = b.f26013c;
                    Object obj2 = b.f26012b;
                    do {
                        Object apply = biFunction.apply(obj2, obj);
                        apply.getClass();
                        if (mo25321i(obj2, apply, obj) != null || (obj = get(obj2)) == null) {
                        }
                        Object apply2 = biFunction.apply(obj2, obj);
                        apply2.getClass();
                        break;
                    } while ((obj = get(obj2)) == null);
                } else {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final int size() {
        long l = mo25324l();
        if (l < 0) {
            return 0;
        }
        if (l > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) l;
    }

    public final String toString() {
        C9399l[] lVarArr = this.f25986a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        C9403p pVar = new C9403p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C9399l b = pVar.mo25406b();
        if (b != null) {
            while (true) {
                Object obj = b.f26012b;
                Object obj2 = b.f26013c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                b = pVar.mo25406b();
                if (b == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final Collection values() {
        C9406s sVar = this.f25990e;
        if (sVar != null) {
            return sVar;
        }
        C9406s sVar2 = new C9406s(this);
        this.f25990e = sVar2;
        return sVar2;
    }
}
