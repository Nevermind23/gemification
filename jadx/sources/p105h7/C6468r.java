package p105h7;

import java.util.Arrays;
import java.util.Set;

/* renamed from: h7.r */
public abstract class C6468r extends C6464n implements Set {

    /* renamed from: e */
    private transient C6467q f19780e;

    C6468r() {
    }

    /* renamed from: k */
    static int m25576k(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (((double) highestOneBit) * 0.7d < ((double) max));
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    /* renamed from: o */
    public static C6468r m25577o(Object obj, Object obj2) {
        return m25578v(2, obj, obj2);
    }

    /* renamed from: v */
    private static C6468r m25578v(int i, Object... objArr) {
        if (i == 0) {
            return C6471u.f19787l;
        }
        if (i != 1) {
            int k = m25576k(i);
            Object[] objArr2 = new Object[k];
            int i2 = k - 1;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                Object obj = objArr[i3];
                if (obj != null) {
                    int hashCode = obj.hashCode();
                    int a = C6463m.m25562a(hashCode);
                    while (true) {
                        int i6 = a & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 != null) {
                            if (obj2.equals(obj)) {
                                break;
                            }
                            a++;
                        } else {
                            objArr[i5] = obj;
                            objArr2[i6] = obj;
                            i4 += hashCode;
                            i5++;
                            break;
                        }
                    }
                    i3++;
                } else {
                    throw new NullPointerException("at index " + i3);
                }
            }
            Arrays.fill(objArr, i5, i, (Object) null);
            if (i5 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new C6472v(obj3);
            }
            if (m25576k(i5) < k / 2) {
                return m25578v(i5, objArr);
            }
            if (i5 <= 0) {
                objArr = Arrays.copyOf(objArr, i5);
            }
            return new C6471u(objArr, i4, objArr2, i2, i5);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new C6472v(obj4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C6468r) && mo20367r() && ((C6468r) obj).mo20367r() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();

    /* renamed from: l */
    public final C6467q mo20365l() {
        C6467q qVar = this.f19780e;
        if (qVar != null) {
            return qVar;
        }
        C6467q n = mo20366n();
        this.f19780e = n;
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C6467q mo20366n() {
        Object[] array = toArray();
        int i = C6467q.f19779f;
        return C6467q.m25572l(array, array.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo20367r() {
        return false;
    }
}
