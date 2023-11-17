package p342j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p342j$.util.function.C9426E;
import p342j$.util.function.C9459g;

/* renamed from: j$.util.t */
public final /* synthetic */ class C9754t implements PrimitiveIterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ C9755u f26536a;

    private /* synthetic */ C9754t(C9755u uVar) {
        this.f26536a = uVar;
    }

    /* renamed from: b */
    public static /* synthetic */ PrimitiveIterator.OfInt m35896b(C9755u uVar) {
        if (uVar == null) {
            return null;
        }
        return uVar instanceof C9512s ? ((C9512s) uVar).f26160a : new C9754t(uVar);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9755u uVar = this.f26536a;
        if (obj instanceof C9754t) {
            obj = ((C9754t) obj).f26536a;
        }
        return uVar.equals(obj);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26536a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f26536a.mo25279a(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f26536a.mo25281c(C9426E.m34778a(intConsumer));
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f26536a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26536a.hashCode();
    }

    public final /* synthetic */ int nextInt() {
        return this.f26536a.nextInt();
    }

    public final /* synthetic */ void remove() {
        this.f26536a.remove();
    }
}
