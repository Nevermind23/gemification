package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ve1.C43151a;

/* renamed from: kotlin.jvm.internal.b */
final class C41521b implements Iterator, C43151a {

    /* renamed from: d */
    private final Object[] f97699d;

    /* renamed from: e */
    private int f97700e;

    public C41521b(Object[] objArr) {
        C41536l.m120489i(objArr, "array");
        this.f97699d = objArr;
    }

    public boolean hasNext() {
        return this.f97700e < this.f97699d.length;
    }

    public Object next() {
        try {
            Object[] objArr = this.f97699d;
            int i = this.f97700e;
            this.f97700e = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f97700e--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
