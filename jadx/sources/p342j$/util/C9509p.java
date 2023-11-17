package p342j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p342j$.util.function.C9459g;
import p342j$.util.function.C9471m;

/* renamed from: j$.util.p */
public final /* synthetic */ class C9509p implements PrimitiveIterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ C9510q f26158a;

    private /* synthetic */ C9509p(C9510q qVar) {
        this.f26158a = qVar;
    }

    /* renamed from: b */
    public static /* synthetic */ PrimitiveIterator.OfDouble m34880b(C9510q qVar) {
        if (qVar == null) {
            return null;
        }
        return qVar instanceof C9508o ? ((C9508o) qVar).f26157a : new C9509p(qVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9510q qVar = this.f26158a;
        if (obj instanceof C9509p) {
            obj = ((C9509p) obj).f26158a;
        }
        return qVar.equals(obj);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26158a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f26158a.mo25279a(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f26158a.mo25294e(C9471m.m34828a(doubleConsumer));
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f26158a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26158a.hashCode();
    }

    public final /* synthetic */ double nextDouble() {
        return this.f26158a.nextDouble();
    }

    public final /* synthetic */ void remove() {
        this.f26158a.remove();
    }
}
