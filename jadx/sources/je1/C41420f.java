package je1;

import ie1.C41318f;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C41536l;

/* renamed from: je1.f */
public final class C41420f extends C41318f {

    /* renamed from: d */
    private final C41412d f97486d;

    public C41420f(C41412d dVar) {
        C41536l.m120489i(dVar, "backing");
        this.f97486d = dVar;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo95902b() {
        return this.f97486d.size();
    }

    public void clear() {
        this.f97486d.clear();
    }

    public boolean contains(Object obj) {
        return this.f97486d.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f97486d.isEmpty();
    }

    public Iterator iterator() {
        return this.f97486d.mo96084F();
    }

    public boolean remove(Object obj) {
        return this.f97486d.mo96086M(obj) >= 0;
    }

    public boolean removeAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        this.f97486d.mo96100m();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        this.f97486d.mo96100m();
        return super.retainAll(collection);
    }
}
