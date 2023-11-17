package p342j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: j$.util.concurrent.h */
final class C9395h extends C9388a implements Iterator, Enumeration {

    /* renamed from: k */
    public final /* synthetic */ int f26005k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9395h(C9399l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(lVarArr, i, i2, concurrentHashMap);
        this.f26005k = i3;
    }

    public final Object next() {
        switch (this.f26005k) {
            case 0:
                C9399l lVar = this.f26020b;
                if (lVar != null) {
                    Object obj = lVar.f26012b;
                    this.f26000j = lVar;
                    mo25406b();
                    return obj;
                }
                throw new NoSuchElementException();
            default:
                C9399l lVar2 = this.f26020b;
                if (lVar2 != null) {
                    Object obj2 = lVar2.f26013c;
                    this.f26000j = lVar2;
                    mo25406b();
                    return obj2;
                }
                throw new NoSuchElementException();
        }
    }

    public final Object nextElement() {
        switch (this.f26005k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
