package p342j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
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

/* renamed from: j$.util.concurrent.e */
final class C9392e extends C9389b implements Set, C9383b {
    C9392e(ConcurrentHashMap concurrentHashMap) {
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
                    consumer.accept(new C9398k(b.f26012b, b.f26013c, this.f26001a));
                } else {
                    return;
                }
            }
        }
    }

    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.f26001a.mo25319h(entry.getKey(), entry.getValue(), false) == null;
    }

    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f26001a.mo25319h(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r2.f26001a.get((r0 = r3.getKey()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r3 = (r3 = (java.util.Map.Entry) r3).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x0024
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x0024
            j$.util.concurrent.ConcurrentHashMap r1 = r2.f26001a
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x0024
            if (r3 == r0) goto L_0x0022
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0024
        L_0x0022:
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9392e.contains(java.lang.Object):boolean");
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
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9392e.equals(java.lang.Object):boolean");
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        mo24915a(C9459g.m34817a(consumer));
    }

    public final int hashCode() {
        C9399l[] lVarArr = this.f26001a.f25986a;
        int i = 0;
        if (lVarArr != null) {
            C9403p pVar = new C9403p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                C9399l b = pVar.mo25406b();
                if (b == null) {
                    break;
                }
                i += b.hashCode();
            }
        }
        return i;
    }

    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f26001a;
        C9399l[] lVarArr = concurrentHashMap.f25986a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new C9391d(lVarArr, length, length, concurrentHashMap);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25303m(Predicate predicate) {
        return C9381a.m34654n(this, predicate);
    }

    public final Stream parallelStream() {
        return C9595S2.m35238u(C9735w0.m35835v1(Collection$EL.m34570b(this), true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (java.util.Map.Entry) r3;
        r0 = r3.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = r3.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean remove(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L_0x001c
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r3 = r3.getValue()
            if (r3 == 0) goto L_0x001c
            j$.util.concurrent.ConcurrentHashMap r1 = r2.f26001a
            boolean r3 = r1.remove(r0, r3)
            if (r3 == 0) goto L_0x001c
            r3 = 1
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.concurrent.C9392e.remove(java.lang.Object):boolean");
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
        return new C9393f(lVarArr, length, 0, length, j, concurrentHashMap);
    }

    public final Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) C9429H.m34786a(intFunction).apply(0));
    }
}
