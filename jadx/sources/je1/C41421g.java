package je1;

import ie1.C41314d;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;

/* renamed from: je1.g */
public final class C41421g extends C41314d {

    /* renamed from: d */
    private final C41412d f97487d;

    public C41421g(C41412d dVar) {
        C41536l.m120489i(dVar, "backing");
        this.f97487d = dVar;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo95896b() {
        return this.f97487d.size();
    }

    public void clear() {
        this.f97487d.clear();
    }

    public boolean contains(Object obj) {
        return this.f97487d.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f97487d.isEmpty();
    }

    public Iterator iterator() {
        return this.f97487d.mo96088Q();
    }

    public boolean remove(Object obj) {
        return this.f97487d.mo96087O(obj);
    }

    public boolean removeAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        this.f97487d.mo96100m();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        this.f97487d.mo96100m();
        return super.retainAll(collection);
    }
}
