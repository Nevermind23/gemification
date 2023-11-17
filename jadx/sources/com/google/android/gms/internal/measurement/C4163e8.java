package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.e8 */
abstract class C4163e8 extends AbstractList implements C4453v9 {

    /* renamed from: d */
    private boolean f13210d;

    C4163e8(boolean z) {
        this.f13210d = z;
    }

    public boolean add(Object obj) {
        mo13060b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo13060b();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo13060b() {
        if (!this.f13210d) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo13060b();
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

    /* renamed from: q */
    public final void mo13064q() {
        if (this.f13210d) {
            this.f13210d = false;
        }
    }

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        mo13060b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo13060b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo13060b();
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public final boolean mo13068s() {
        return this.f13210d;
    }

    public boolean addAll(Collection collection) {
        mo13060b();
        return super.addAll(collection);
    }
}
