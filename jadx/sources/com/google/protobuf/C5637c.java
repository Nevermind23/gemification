package com.google.protobuf;

import com.google.protobuf.C5716s;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
abstract class C5637c extends AbstractList implements C5716s.C5721e {

    /* renamed from: d */
    private boolean f17838d = true;

    C5637c() {
    }

    /* renamed from: G0 */
    public boolean mo18543G0() {
        return this.f17838d;
    }

    public boolean add(Object obj) {
        mo18547b();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        mo18547b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18547b() {
        if (!this.f17838d) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo18547b();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract Object remove(int i);

    public boolean remove(Object obj) {
        mo18547b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        mo18547b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        mo18547b();
        return super.retainAll(collection);
    }

    /* renamed from: y */
    public final void mo18555y() {
        this.f17838d = false;
    }

    public boolean addAll(int i, Collection collection) {
        mo18547b();
        return super.addAll(i, collection);
    }
}
