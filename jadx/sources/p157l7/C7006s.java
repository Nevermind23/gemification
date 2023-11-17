package p157l7;

import java.util.Arrays;
import java.util.Set;

/* renamed from: l7.s */
public abstract class C7006s extends C7002o implements Set {

    /* renamed from: e */
    private transient C7005r f20882e;

    C7006s() {
    }

    /* renamed from: k */
    static int m27145k(int i) {
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
    public static C7006s m27146o(Object obj, Object obj2) {
        return m27147v(2, obj, obj2);
    }

    /* renamed from: v */
    private static C7006s m27147v(int i, Object... objArr) {
        if (i == 0) {
            return C7010w.f20889l;
        }
        if (i != 1) {
            int k = m27145k(i);
            Object[] objArr2 = new Object[k];
            int i2 = k - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArr[i5];
                C7008u.m27151a(obj, i5);
                int hashCode = obj.hashCode();
                int a = C7001n.m27129a(hashCode);
                while (true) {
                    int i6 = a & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArr[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        a++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                return new C7011x(obj3);
            } else if (m27145k(i4) < k / 2) {
                return m27147v(i4, objArr);
            } else {
                if (i4 <= 0) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new C7010w(objArr, i3, objArr2, i2, i4);
            }
        } else {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new C7011x(obj4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7006s) && mo21212r() && ((C7006s) obj).mo21212r() && hashCode() != obj.hashCode()) {
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
    public final C7005r mo21210l() {
        C7005r rVar = this.f20882e;
        if (rVar != null) {
            return rVar;
        }
        C7005r n = mo21211n();
        this.f20882e = n;
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C7005r mo21211n() {
        return C7005r.m27139l(toArray());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo21212r() {
        return false;
    }
}
