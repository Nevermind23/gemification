package p342j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p342j$.util.function.C9442V;
import p342j$.util.function.C9459g;

/* renamed from: j$.util.x */
public final /* synthetic */ class C9758x implements PrimitiveIterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ C9759y f26539a;

    private /* synthetic */ C9758x(C9759y yVar) {
        this.f26539a = yVar;
    }

    /* renamed from: b */
    public static /* synthetic */ PrimitiveIterator.OfLong m35903b(C9759y yVar) {
        if (yVar == null) {
            return null;
        }
        return yVar instanceof C9757w ? ((C9757w) yVar).f26538a : new C9758x(yVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9759y yVar = this.f26539a;
        if (obj instanceof C9758x) {
            obj = ((C9758x) obj).f26539a;
        }
        return yVar.equals(obj);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26539a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f26539a.mo25279a(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f26539a.mo25288d(C9442V.m34797a(longConsumer));
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f26539a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26539a.hashCode();
    }

    public final /* synthetic */ long nextLong() {
        return this.f26539a.nextLong();
    }

    public final /* synthetic */ void remove() {
        this.f26539a.remove();
    }
}
