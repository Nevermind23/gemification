package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.gson.e */
public final class C5491e extends C5494h implements Iterable {

    /* renamed from: d */
    private final ArrayList f17560d = new ArrayList();

    /* renamed from: x */
    private C5494h m21877x() {
        int size = this.f17560d.size();
        if (size == 1) {
            return (C5494h) this.f17560d.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    /* renamed from: b */
    public boolean mo18206b() {
        return m21877x().mo18206b();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C5491e) && ((C5491e) obj).f17560d.equals(this.f17560d));
    }

    public int hashCode() {
        return this.f17560d.hashCode();
    }

    public Iterator iterator() {
        return this.f17560d.iterator();
    }

    /* renamed from: j */
    public long mo18210j() {
        return m21877x().mo18210j();
    }

    /* renamed from: k */
    public String mo18211k() {
        return m21877x().mo18211k();
    }

    public int size() {
        return this.f17560d.size();
    }

    /* renamed from: v */
    public void mo18213v(C5494h hVar) {
        if (hVar == null) {
            hVar = C5495i.f17561d;
        }
        this.f17560d.add(hVar);
    }

    /* renamed from: w */
    public C5494h mo18214w(int i) {
        return (C5494h) this.f17560d.get(i);
    }
}
