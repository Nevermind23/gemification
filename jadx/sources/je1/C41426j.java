package je1;

import ie1.C41318f;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: je1.j */
public final class C41426j extends C41318f implements Serializable {

    /* renamed from: d */
    private final C41412d f97493d;

    public C41426j(C41412d dVar) {
        C41536l.m120489i(dVar, "backing");
        this.f97493d = dVar;
    }

    private final Object writeReplace() {
        if (this.f97493d.mo96083E()) {
            return new C41422h(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    public boolean add(Object obj) {
        return this.f97493d.mo96095h(obj) >= 0;
    }

    public boolean addAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        this.f97493d.mo96100m();
        return super.addAll(collection);
    }

    /* renamed from: b */
    public int mo95902b() {
        return this.f97493d.size();
    }

    /* renamed from: c */
    public final Set mo96165c() {
        this.f97493d.mo96099l();
        return this;
    }

    public void clear() {
        this.f97493d.clear();
    }

    public boolean contains(Object obj) {
        return this.f97493d.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f97493d.isEmpty();
    }

    public Iterator iterator() {
        return this.f97493d.mo96084F();
    }

    public boolean remove(Object obj) {
        return this.f97493d.mo96086M(obj) >= 0;
    }

    public boolean removeAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        this.f97493d.mo96100m();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        this.f97493d.mo96100m();
        return super.retainAll(collection);
    }

    public C41426j() {
        this(new C41412d());
    }

    public C41426j(int i) {
        this(new C41412d(i));
    }
}
