package p342j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: j$.util.concurrent.d */
final class C9391d extends C9388a implements Iterator {
    C9391d(C9399l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, i2, concurrentHashMap);
    }

    public final Object next() {
        C9399l lVar = this.f26020b;
        if (lVar != null) {
            Object obj = lVar.f26012b;
            Object obj2 = lVar.f26013c;
            this.f26000j = lVar;
            mo25406b();
            return new C9398k(obj, obj2, this.f25999i);
        }
        throw new NoSuchElementException();
    }
}
