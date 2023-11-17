package p342j$.util.stream;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p342j$.util.C9369N;
import p342j$.util.C9371P;
import p342j$.util.stream.IntStream;

/* renamed from: j$.util.stream.g */
public final /* synthetic */ class C9654g implements C9664i {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f26385a;

    private /* synthetic */ C9654g(BaseStream baseStream) {
        this.f26385a = baseStream;
    }

    /* renamed from: u */
    public static /* synthetic */ C9664i m35510u(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C9659h ? ((C9659h) baseStream).f26388a : baseStream instanceof DoubleStream ? C9533E.m34952u((DoubleStream) baseStream) : baseStream instanceof IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C9680l0.m35610u((LongStream) baseStream) : baseStream instanceof Stream ? C9591R2.m35206u((Stream) baseStream) : new C9654g(baseStream);
    }

    public final /* synthetic */ void close() {
        this.f26385a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f26385a;
        if (obj instanceof C9654g) {
            obj = ((C9654g) obj).f26385a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26385a.hashCode();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f26385a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f26385a.iterator();
    }

    public final /* synthetic */ C9664i onClose(Runnable runnable) {
        return m35510u(this.f26385a.onClose(runnable));
    }

    public final /* synthetic */ C9664i parallel() {
        return m35510u(this.f26385a.parallel());
    }

    public final /* synthetic */ C9664i sequential() {
        return m35510u(this.f26385a.sequential());
    }

    public final /* synthetic */ C9371P spliterator() {
        return C9369N.m34599b(this.f26385a.spliterator());
    }

    public final /* synthetic */ C9664i unordered() {
        return m35510u(this.f26385a.unordered());
    }
}
