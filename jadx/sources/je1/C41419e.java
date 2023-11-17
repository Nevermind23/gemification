package je1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: je1.e */
public final class C41419e extends C41408a {

    /* renamed from: d */
    private final C41412d f97485d;

    public C41419e(C41412d dVar) {
        C41536l.m120489i(dVar, "backing");
        this.f97485d = dVar;
    }

    public boolean addAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo95902b() {
        return this.f97485d.size();
    }

    public void clear() {
        this.f97485d.clear();
    }

    public boolean containsAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        return this.f97485d.mo96101o(collection);
    }

    /* renamed from: i */
    public boolean mo96045i(Map.Entry entry) {
        C41536l.m120489i(entry, "element");
        return this.f97485d.mo96102p(entry);
    }

    public boolean isEmpty() {
        return this.f97485d.isEmpty();
    }

    public Iterator iterator() {
        return this.f97485d.mo96107t();
    }

    /* renamed from: l */
    public boolean mo96046l(Map.Entry entry) {
        C41536l.m120489i(entry, "element");
        return this.f97485d.mo96085K(entry);
    }

    /* renamed from: n */
    public boolean add(Map.Entry entry) {
        C41536l.m120489i(entry, "element");
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        this.f97485d.mo96100m();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        this.f97485d.mo96100m();
        return super.retainAll(collection);
    }
}
