package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.u7 */
public abstract class C4434u7 extends C4332o7 implements Set {

    /* renamed from: e */
    private transient C4417t7 f13730e;

    C4434u7() {
    }

    /* renamed from: k */
    static int m16958k(int i) {
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
    public static C4434u7 m16959o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return m16960v(15, objArr2);
    }

    /* renamed from: v */
    private static C4434u7 m16960v(int i, Object... objArr) {
        if (i == 0) {
            return C4500y7.f13832l;
        }
        if (i != 1) {
            int k = m16958k(i);
            Object[] objArr2 = new Object[k];
            int i2 = k - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                C4468w7.m17093a(obj, i5);
                int hashCode = obj.hashCode();
                int a = C4281l7.m16224a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a++;
                    } else {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new C4516z7(obj3);
            }
            if (m16958k(i4) < k / 2) {
                return m16960v(i4, objArr);
            }
            if (i4 < 10) {
                objArr = Arrays.copyOf(objArr, i4);
            }
            return new C4500y7(objArr, i3, objArr2, i2, i4);
        }
        Object obj4 = objArr[0];
        obj4.getClass();
        return new C4516z7(obj4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C4434u7) && mo13754r() && ((C4434u7) obj).mo13754r() && hashCode() != obj.hashCode()) {
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
    public final C4417t7 mo13752l() {
        C4417t7 t7Var = this.f13730e;
        if (t7Var != null) {
            return t7Var;
        }
        C4417t7 n = mo13753n();
        this.f13730e = n;
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C4417t7 mo13753n() {
        Object[] array = toArray();
        int i = C4417t7.f13698f;
        return C4417t7.m16742l(array, array.length);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo13754r() {
        return false;
    }
}
