package com.google.android.gms.internal.measurement;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.t7 */
public abstract class C4417t7 extends C4332o7 implements List, RandomAccess {

    /* renamed from: e */
    private static final C4112b8 f13697e = new C4366q7(C4484x7.f13803i, 0);

    /* renamed from: f */
    public static final /* synthetic */ int f13698f = 0;

    C4417t7() {
    }

    /* renamed from: l */
    static C4417t7 m16742l(Object[] objArr, int i) {
        if (i == 0) {
            return C4484x7.f13803i;
        }
        return new C4484x7(objArr, i);
    }

    /* renamed from: n */
    public static C4417t7 m16743n(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        C4468w7.m17094b(objArr, 2);
        return m16742l(objArr, 2);
    }

    /* renamed from: o */
    public static C4417t7 m16744o(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"auto", "app", "am"};
        C4468w7.m17094b(objArr, 3);
        return m16742l(objArr, 3);
    }

    /* renamed from: r */
    public static C4417t7 m16745r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        C4468w7.m17094b(objArr, 7);
        return m16742l(objArr, 7);
    }

    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo13419b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (C4515z6.m17304a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!C4515z6.m17304a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: k */
    public C4417t7 subList(int i, int i2) {
        C4111b7.m15558c(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return C4484x7.f13803i;
        }
        return new C4383r7(this, i, i3);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: v */
    public final C4112b8 listIterator(int i) {
        C4111b7.m15557b(i, size(), "index");
        if (isEmpty()) {
            return f13697e;
        }
        return new C4366q7(this, i);
    }
}
