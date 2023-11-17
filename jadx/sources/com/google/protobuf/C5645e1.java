package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.e1 */
public class C5645e1 extends AbstractList implements C5731x, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5731x f17850d;

    /* renamed from: com.google.protobuf.e1$a */
    class C5646a implements ListIterator {

        /* renamed from: d */
        ListIterator f17851d;

        /* renamed from: e */
        final /* synthetic */ int f17852e;

        C5646a(int i) {
            this.f17852e = i;
            this.f17851d = C5645e1.this.f17850d.listIterator(i);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public String next() {
            return (String) this.f17851d.next();
        }

        /* renamed from: e */
        public String previous() {
            return (String) this.f17851d.previous();
        }

        /* renamed from: f */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f17851d.hasNext();
        }

        public boolean hasPrevious() {
            return this.f17851d.hasPrevious();
        }

        public int nextIndex() {
            return this.f17851d.nextIndex();
        }

        public int previousIndex() {
            return this.f17851d.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.e1$b */
    class C5647b implements Iterator {

        /* renamed from: d */
        Iterator f17854d;

        C5647b() {
            this.f17854d = C5645e1.this.f17850d.iterator();
        }

        /* renamed from: b */
        public String next() {
            return (String) this.f17854d.next();
        }

        public boolean hasNext() {
            return this.f17854d.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C5645e1(C5731x xVar) {
        this.f17850d = xVar;
    }

    /* renamed from: a0 */
    public List mo18578a0() {
        return this.f17850d.mo18578a0();
    }

    /* renamed from: c */
    public String get(int i) {
        return (String) this.f17850d.get(i);
    }

    /* renamed from: f */
    public void mo18580f(C5648f fVar) {
        throw new UnsupportedOperationException();
    }

    public Iterator iterator() {
        return new C5647b();
    }

    public ListIterator listIterator(int i) {
        return new C5646a(i);
    }

    /* renamed from: q1 */
    public C5731x mo18584q1() {
        return this;
    }

    public int size() {
        return this.f17850d.size();
    }

    /* renamed from: z1 */
    public Object mo18586z1(int i) {
        return this.f17850d.mo18586z1(i);
    }
}
