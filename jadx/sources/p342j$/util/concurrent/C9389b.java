package p342j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: j$.util.concurrent.b */
abstract class C9389b implements Collection, Serializable {

    /* renamed from: a */
    final ConcurrentHashMap f26001a;

    C9389b(ConcurrentHashMap concurrentHashMap) {
        this.f26001a = concurrentHashMap;
    }

    public final void clear() {
        this.f26001a.clear();
    }

    public abstract boolean contains(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean containsAll(java.util.Collection r2) {
        /*
            r1 = this;
            if (r2 == r1) goto L_0x001a
            java.util.Iterator r2 = r2.iterator()
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r2.next()
            if (r0 == 0) goto L_0x0018
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0006
        L_0x0018:
            r2 = 0
            return r2
        L_0x001a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9389b.containsAll(java.util.Collection):boolean");
    }

    public final boolean isEmpty() {
        return this.f26001a.isEmpty();
    }

    public abstract Iterator iterator();

    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f26001a.size();
    }

    public final Object[] toArray() {
        long l = this.f26001a.mo25324l();
        if (l < 0) {
            l = 0;
        }
        if (l <= 2147483639) {
            int i = (int) l;
            Object[] objArr = new Object[i];
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == i) {
                    int i3 = 2147483639;
                    if (i < 2147483639) {
                        if (i < 1073741819) {
                            i3 = (i >>> 1) + 1 + i;
                        }
                        objArr = Arrays.copyOf(objArr, i3);
                        i = i3;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objArr[i2] = next;
                i2++;
            }
            return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final Object[] toArray(Object[] objArr) {
        long l = this.f26001a.mo25324l();
        if (l < 0) {
            l = 0;
        }
        if (l <= 2147483639) {
            int i = (int) l;
            Object[] objArr2 = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            int length = objArr2.length;
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == length) {
                    int i3 = 2147483639;
                    if (length < 2147483639) {
                        if (length < 1073741819) {
                            i3 = (length >>> 1) + 1 + length;
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                        length = i3;
                    } else {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                }
                objArr2[i2] = next;
                i2++;
            }
            if (objArr != objArr2 || i2 >= length) {
                return i2 == length ? objArr2 : Arrays.copyOf(objArr2, i2);
            }
            objArr2[i2] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
