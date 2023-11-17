package p118i7;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: i7.v */
public abstract class C6611v extends AbstractCollection implements Serializable {

    /* renamed from: d */
    private static final Object[] f20105d = new Object[0];

    C6611v() {
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int mo20604b(Object[] objArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo20605c();

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract int mo20607g();

    /* renamed from: i */
    public abstract C6614y mo20608i();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract boolean mo20609k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract Object[] mo20610l();

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f20105d);
    }

    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] l = mo20610l();
            if (l != null) {
                return Arrays.copyOfRange(l, mo20607g(), mo20605c(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo20604b(objArr, 0);
        return objArr;
    }
}
