package p342j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
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

/* renamed from: j$.util.concurrent.s */
final class C9406s extends C9389b implements C9383b {
    C9406s(ConcurrentHashMap concurrentHashMap) {
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
                    consumer.accept(b.f26013c);
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
        return this.f26001a.containsValue(obj);
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        mo24915a(C9459g.m34817a(consumer));
    }

    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f26001a;
        C9399l[] lVarArr = concurrentHashMap.f25986a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new C9395h(lVarArr, length, length, concurrentHashMap, 1);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25303m(Predicate predicate) {
        return C9381a.m34654n(this, predicate);
    }

    public final Stream parallelStream() {
        return C9595S2.m35238u(C9735w0.m35835v1(Collection$EL.m34570b(this), true));
    }

    public final boolean remove(Object obj) {
        C9388a aVar;
        if (obj == null) {
            return false;
        }
        Iterator it = iterator();
        do {
            aVar = (C9388a) it;
            if (!aVar.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C9395h) it).next()));
        aVar.remove();
        return true;
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
        return new C9397j(lVarArr, length, 0, length, j, 1);
    }

    public final Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) C9429H.m34786a(intFunction).apply(0));
    }
}
