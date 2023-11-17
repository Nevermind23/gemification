package ie1;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ie1.h */
public final class C41322h extends C41316e {

    /* renamed from: g */
    public static final C41323a f97373g = new C41323a((DefaultConstructorMarker) null);

    /* renamed from: h */
    private static final Object[] f97374h = new Object[0];

    /* renamed from: d */
    private int f97375d;

    /* renamed from: e */
    private Object[] f97376e;

    /* renamed from: f */
    private int f97377f;

    /* renamed from: ie1.h$a */
    public static final class C41323a {
        private C41323a() {
        }

        public /* synthetic */ C41323a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo95942a(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            return i3 - 2147483639 > 0 ? i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i3;
        }
    }

    public C41322h(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f97374h;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.f97376e = objArr;
    }

    /* renamed from: A */
    private final int m119701A(int i) {
        if (i == C41333m.m119800y(this.f97376e)) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: D */
    private final int m119702D(int i) {
        return i < 0 ? i + this.f97376e.length : i;
    }

    /* renamed from: E */
    private final int m119703E(int i) {
        Object[] objArr = this.f97376e;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* renamed from: n */
    private final void m119704n(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f97376e.length;
        while (i < length && it.hasNext()) {
            this.f97376e[i] = it.next();
            i++;
        }
        int i2 = this.f97375d;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f97376e[i3] = it.next();
        }
        this.f97377f = size() + collection.size();
    }

    /* renamed from: o */
    private final void m119705o(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.f97376e;
        Object[] unused = C41331l.m119761e(objArr2, objArr, 0, this.f97375d, objArr2.length);
        Object[] objArr3 = this.f97376e;
        int length = objArr3.length;
        int i2 = this.f97375d;
        Object[] unused2 = C41331l.m119761e(objArr3, objArr, length - i2, 0, i2);
        this.f97375d = 0;
        this.f97376e = objArr;
    }

    /* renamed from: r */
    private final int m119706r(int i) {
        return i == 0 ? C41333m.m119800y(this.f97376e) : i - 1;
    }

    /* renamed from: v */
    private final void m119707v(int i) {
        if (i >= 0) {
            Object[] objArr = this.f97376e;
            if (i > objArr.length) {
                if (objArr == f97374h) {
                    this.f97376e = new Object[C43429k.m124585d(i, 10)];
                } else {
                    m119705o(f97373g.mo95942a(objArr.length, i));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    /* renamed from: B */
    public final Object mo95918B() {
        if (!isEmpty()) {
            return this.f97376e[m119703E(this.f97375d + C41341q.m119909l(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: C */
    public final Object mo95919C() {
        if (isEmpty()) {
            return null;
        }
        return this.f97376e[m119703E(this.f97375d + C41341q.m119909l(this))];
    }

    /* renamed from: F */
    public final Object mo95920F() {
        if (!isEmpty()) {
            Object[] objArr = this.f97376e;
            int i = this.f97375d;
            Object obj = objArr[i];
            objArr[i] = null;
            this.f97375d = m119701A(i);
            this.f97377f = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: G */
    public final Object mo95921G() {
        if (!isEmpty()) {
            int E = m119703E(this.f97375d + C41341q.m119909l(this));
            Object[] objArr = this.f97376e;
            Object obj = objArr[E];
            objArr[E] = null;
            this.f97377f = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public boolean add(Object obj) {
        mo95932l(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m119707v(size() + collection.size());
        m119704n(m119703E(this.f97375d + size()), collection);
        return true;
    }

    /* renamed from: b */
    public int mo95898b() {
        return this.f97377f;
    }

    /* renamed from: c */
    public Object mo95899c(int i) {
        C41308c.f97363d.mo95862b(i, size());
        if (i == C41341q.m119909l(this)) {
            return mo95921G();
        }
        if (i == 0) {
            return mo95920F();
        }
        int E = m119703E(this.f97375d + i);
        Object obj = this.f97376e[E];
        if (i < (size() >> 1)) {
            int i2 = this.f97375d;
            if (E >= i2) {
                Object[] objArr = this.f97376e;
                Object[] unused = C41331l.m119761e(objArr, objArr, i2 + 1, i2, E);
            } else {
                Object[] objArr2 = this.f97376e;
                Object[] unused2 = C41331l.m119761e(objArr2, objArr2, 1, 0, E);
                Object[] objArr3 = this.f97376e;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.f97375d;
                Object[] unused3 = C41331l.m119761e(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.f97376e;
            int i4 = this.f97375d;
            objArr4[i4] = null;
            this.f97375d = m119701A(i4);
        } else {
            int E2 = m119703E(this.f97375d + C41341q.m119909l(this));
            if (E <= E2) {
                Object[] objArr5 = this.f97376e;
                Object[] unused4 = C41331l.m119761e(objArr5, objArr5, E, E + 1, E2 + 1);
            } else {
                Object[] objArr6 = this.f97376e;
                Object[] unused5 = C41331l.m119761e(objArr6, objArr6, E, E + 1, objArr6.length);
                Object[] objArr7 = this.f97376e;
                objArr7[objArr7.length - 1] = objArr7[0];
                Object[] unused6 = C41331l.m119761e(objArr7, objArr7, 0, 1, E2 + 1);
            }
            this.f97376e[E2] = null;
        }
        this.f97377f = size() - 1;
        return obj;
    }

    public void clear() {
        int E = m119703E(this.f97375d + size());
        int i = this.f97375d;
        if (i < E) {
            C41331l.m119767k(this.f97376e, (Object) null, i, E);
        } else if (!isEmpty()) {
            Object[] objArr = this.f97376e;
            C41331l.m119767k(objArr, (Object) null, this.f97375d, objArr.length);
            C41331l.m119767k(this.f97376e, (Object) null, 0, E);
        }
        this.f97375d = 0;
        this.f97377f = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public Object get(int i) {
        C41308c.f97363d.mo95862b(i, size());
        return this.f97376e[m119703E(this.f97375d + i)];
    }

    /* renamed from: i */
    public final void mo95929i(Object obj) {
        m119707v(size() + 1);
        int r = m119706r(this.f97375d);
        this.f97375d = r;
        this.f97376e[r] = obj;
        this.f97377f = size() + 1;
    }

    public int indexOf(Object obj) {
        int i;
        int E = m119703E(this.f97375d + size());
        int i2 = this.f97375d;
        if (i2 < E) {
            while (i2 < E) {
                if (C41536l.m120484d(obj, this.f97376e[i2])) {
                    i = this.f97375d;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < E) {
            return -1;
        } else {
            int length = this.f97376e.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < E) {
                        if (C41536l.m120484d(obj, this.f97376e[i3])) {
                            i2 = i3 + this.f97376e.length;
                            i = this.f97375d;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (C41536l.m120484d(obj, this.f97376e[i2])) {
                    i = this.f97375d;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: l */
    public final void mo95932l(Object obj) {
        m119707v(size() + 1);
        this.f97376e[m119703E(this.f97375d + size())] = obj;
        this.f97377f = size() + 1;
    }

    public int lastIndexOf(Object obj) {
        int i;
        int i2;
        int E = m119703E(this.f97375d + size());
        int i3 = this.f97375d;
        if (i3 < E) {
            i = E - 1;
            if (i3 <= i) {
                while (!C41536l.m120484d(obj, this.f97376e[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.f97375d;
            }
            return -1;
        }
        if (i3 > E) {
            int i4 = E - 1;
            while (true) {
                if (-1 >= i4) {
                    int y = C41333m.m119800y(this.f97376e);
                    int i5 = this.f97375d;
                    if (i5 <= y) {
                        while (!C41536l.m120484d(obj, this.f97376e[i])) {
                            if (i != i5) {
                                y = i - 1;
                            }
                        }
                        i2 = this.f97375d;
                    }
                } else if (C41536l.m120484d(obj, this.f97376e[i4])) {
                    i = i4 + this.f97376e.length;
                    i2 = this.f97375d;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f97376e
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f97375d
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.m119703E(r0)
            int r3 = r11.f97375d
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f97376e
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f97376e
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f97376e
            ie1.C41331l.m119767k(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f97376e
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f97376e
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f97376e
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.m119703E(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f97376e
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f97376e
            r3[r5] = r6
            int r5 = r11.m119701A(r5)
            goto L_0x0087
        L_0x0086:
            r7 = r2
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f97375d
            int r5 = r5 - r12
            int r12 = r11.m119702D(r5)
            r11.f97377f = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ie1.C41322h.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f97376e
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f97375d
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.m119703E(r0)
            int r3 = r11.f97375d
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f97376e
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f97376e
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f97376e
            ie1.C41331l.m119767k(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f97376e
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f97376e
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f97376e
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.m119703E(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f97376e
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f97376e
            r3[r5] = r6
            int r5 = r11.m119701A(r5)
            goto L_0x0084
        L_0x0083:
            r7 = r2
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f97375d
            int r5 = r5 - r12
            int r12 = r11.m119702D(r5)
            r11.f97377f = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ie1.C41322h.retainAll(java.util.Collection):boolean");
    }

    public Object set(int i, Object obj) {
        C41308c.f97363d.mo95862b(i, size());
        int E = m119703E(this.f97375d + i);
        Object[] objArr = this.f97376e;
        Object obj2 = objArr[E];
        objArr[E] = obj;
        return obj2;
    }

    public Object[] toArray(Object[] objArr) {
        C41536l.m120489i(objArr, "array");
        if (objArr.length < size()) {
            objArr = C41327j.m119756a(objArr, size());
        }
        int E = m119703E(this.f97375d + size());
        int i = this.f97375d;
        if (i < E) {
            Object[] unused = C41331l.m119763g(this.f97376e, objArr, 0, i, E, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f97376e;
            Object[] unused2 = C41331l.m119761e(objArr2, objArr, 0, this.f97375d, objArr2.length);
            Object[] objArr3 = this.f97376e;
            Object[] unused3 = C41331l.m119761e(objArr3, objArr, objArr3.length - this.f97375d, 0, E);
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }

    /* renamed from: w */
    public final Object mo95940w() {
        if (!isEmpty()) {
            return this.f97376e[this.f97375d];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* renamed from: x */
    public final Object mo95941x() {
        if (isEmpty()) {
            return null;
        }
        return this.f97376e[this.f97375d];
    }

    public void add(int i, Object obj) {
        C41308c.f97363d.mo95863c(i, size());
        if (i == size()) {
            mo95932l(obj);
        } else if (i == 0) {
            mo95929i(obj);
        } else {
            m119707v(size() + 1);
            int E = m119703E(this.f97375d + i);
            if (i < ((size() + 1) >> 1)) {
                int r = m119706r(E);
                int r2 = m119706r(this.f97375d);
                int i2 = this.f97375d;
                if (r >= i2) {
                    Object[] objArr = this.f97376e;
                    objArr[r2] = objArr[i2];
                    Object[] unused = C41331l.m119761e(objArr, objArr, i2, i2 + 1, r + 1);
                } else {
                    Object[] objArr2 = this.f97376e;
                    Object[] unused2 = C41331l.m119761e(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                    Object[] objArr3 = this.f97376e;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    Object[] unused3 = C41331l.m119761e(objArr3, objArr3, 0, 1, r + 1);
                }
                this.f97376e[r] = obj;
                this.f97375d = r2;
            } else {
                int E2 = m119703E(this.f97375d + size());
                if (E < E2) {
                    Object[] objArr4 = this.f97376e;
                    Object[] unused4 = C41331l.m119761e(objArr4, objArr4, E + 1, E, E2);
                } else {
                    Object[] objArr5 = this.f97376e;
                    Object[] unused5 = C41331l.m119761e(objArr5, objArr5, 1, 0, E2);
                    Object[] objArr6 = this.f97376e;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    Object[] unused6 = C41331l.m119761e(objArr6, objArr6, E + 1, E, objArr6.length - 1);
                }
                this.f97376e[E] = obj;
            }
            this.f97377f = size() + 1;
        }
    }

    public boolean addAll(int i, Collection collection) {
        C41536l.m120489i(collection, "elements");
        C41308c.f97363d.mo95863c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        m119707v(size() + collection.size());
        int E = m119703E(this.f97375d + size());
        int E2 = m119703E(this.f97375d + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.f97375d;
            int i3 = i2 - size;
            if (E2 < i2) {
                Object[] objArr = this.f97376e;
                Object[] unused = C41331l.m119761e(objArr, objArr, i3, i2, objArr.length);
                if (size >= E2) {
                    Object[] objArr2 = this.f97376e;
                    Object[] unused2 = C41331l.m119761e(objArr2, objArr2, objArr2.length - size, 0, E2);
                } else {
                    Object[] objArr3 = this.f97376e;
                    Object[] unused3 = C41331l.m119761e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f97376e;
                    Object[] unused4 = C41331l.m119761e(objArr4, objArr4, 0, size, E2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.f97376e;
                Object[] unused5 = C41331l.m119761e(objArr5, objArr5, i3, i2, E2);
            } else {
                Object[] objArr6 = this.f97376e;
                i3 += objArr6.length;
                int i4 = E2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    Object[] unused6 = C41331l.m119761e(objArr6, objArr6, i3, i2, E2);
                } else {
                    Object[] unused7 = C41331l.m119761e(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.f97376e;
                    Object[] unused8 = C41331l.m119761e(objArr7, objArr7, 0, this.f97375d + length, E2);
                }
            }
            this.f97375d = i3;
            m119704n(m119702D(E2 - size), collection);
        } else {
            int i5 = E2 + size;
            if (E2 < E) {
                int i6 = size + E;
                Object[] objArr8 = this.f97376e;
                if (i6 <= objArr8.length) {
                    Object[] unused9 = C41331l.m119761e(objArr8, objArr8, i5, E2, E);
                } else if (i5 >= objArr8.length) {
                    Object[] unused10 = C41331l.m119761e(objArr8, objArr8, i5 - objArr8.length, E2, E);
                } else {
                    int length2 = E - (i6 - objArr8.length);
                    Object[] unused11 = C41331l.m119761e(objArr8, objArr8, 0, length2, E);
                    Object[] objArr9 = this.f97376e;
                    Object[] unused12 = C41331l.m119761e(objArr9, objArr9, i5, E2, length2);
                }
            } else {
                Object[] objArr10 = this.f97376e;
                Object[] unused13 = C41331l.m119761e(objArr10, objArr10, size, 0, E);
                Object[] objArr11 = this.f97376e;
                if (i5 >= objArr11.length) {
                    Object[] unused14 = C41331l.m119761e(objArr11, objArr11, i5 - objArr11.length, E2, objArr11.length);
                } else {
                    Object[] unused15 = C41331l.m119761e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f97376e;
                    Object[] unused16 = C41331l.m119761e(objArr12, objArr12, i5, E2, objArr12.length - size);
                }
            }
            m119704n(E2, collection);
        }
        return true;
    }

    public C41322h() {
        this.f97376e = f97374h;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
