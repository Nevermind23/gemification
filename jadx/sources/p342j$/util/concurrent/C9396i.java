package p342j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.C9383b;
import p342j$.util.Collection$EL;
import p342j$.util.function.C9429H;
import p342j$.util.function.C9459g;
import p342j$.util.function.C9486t0;
import p342j$.util.function.Consumer;
import p342j$.util.function.Predicate;
import p342j$.util.stream.C9595S2;
import p342j$.util.stream.C9735w0;

/* renamed from: j$.util.concurrent.i */
public final class C9396i extends C9389b implements Set, C9383b {
    C9396i(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    /* renamed from: a */
    public final void mo24915a(Consumer consumer) {
        consumer.getClass();
        C9399l[] lVarArr = this.f26001a.f25986a;
        if (lVarArr != null) {
            C9403p pVar = new C9403p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                C9399l b = pVar.mo25406b();
                if (b != null) {
                    consumer.accept(b.f26012b);
                } else {
                    return;
                }
            }
        }
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        return this.f26001a.containsKey(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (java.util.Set) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof java.util.Set
            if (r0 == 0) goto L_0x0016
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == r1) goto L_0x0014
            boolean r0 = r1.containsAll(r2)
            if (r0 == 0) goto L_0x0016
            boolean r2 = r2.containsAll(r1)
            if (r2 == 0) goto L_0x0016
        L_0x0014:
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9396i.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        mo24915a(C9459g.m34817a(consumer));
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (((C9388a) it).hasNext()) {
            i += ((C9395h) it).next().hashCode();
        }
        return i;
    }

    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f26001a;
        C9399l[] lVarArr = concurrentHashMap.f25986a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new C9395h(lVarArr, length, length, concurrentHashMap, 0);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25303m(Predicate predicate) {
        return C9381a.m34654n(this, predicate);
    }

    public final Stream parallelStream() {
        return C9595S2.m35238u(C9735w0.m35835v1(Collection$EL.m34570b(this), true));
    }

    public final boolean remove(Object obj) {
        return this.f26001a.remove(obj) != null;
    }

    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return C9381a.m34654n(this, C9486t0.m34841a(predicate));
    }

    public final C9371P spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f26001a;
        long l = concurrentHashMap.mo25324l();
        C9399l[] lVarArr = concurrentHashMap.f25986a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        long j = 0;
        if (l >= 0) {
            j = l;
        }
        return new C9397j(lVarArr, length, 0, length, j, 0);
    }

    public final Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) C9429H.m34786a(intFunction).apply(0));
    }
}
