package p342j$.util.stream;

import java.util.Collection;
import p342j$.util.C9371P;
import p342j$.util.Collection$EL;
import p342j$.util.function.C9431J;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.J0 */
final class C9558J0 implements C9539F0 {

    /* renamed from: a */
    private final Collection f26230a;

    C9558J0(Collection collection) {
        this.f26230a = collection;
    }

    /* renamed from: a */
    public final void mo25794a(Consumer consumer) {
        Collection$EL.m34569a(this.f26230a, consumer);
    }

    /* renamed from: c */
    public final C9539F0 mo25746c(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long count() {
        return (long) this.f26230a.size();
    }

    /* renamed from: j */
    public final void mo25796j(Object[] objArr, int i) {
        for (Object obj : this.f26230a) {
            objArr[i] = obj;
            i++;
        }
    }

    public final C9371P spliterator() {
        return Collection$EL.stream(this.f26230a).spliterator();
    }

    /* renamed from: t */
    public final /* synthetic */ int mo25797t() {
        return 0;
    }

    public final String toString() {
        Collection collection = this.f26230a;
        return String.format("CollectionNode[%d][%s]", new Object[]{Integer.valueOf(collection.size()), collection});
    }

    /* renamed from: u */
    public final Object[] mo25798u(C9431J j) {
        Collection collection = this.f26230a;
        return collection.toArray((Object[]) j.apply(collection.size()));
    }

    /* renamed from: v */
    public final /* synthetic */ C9539F0 mo25799v(long j, long j2, C9431J j3) {
        return C9735w0.m35795I0(this, j, j2, j3);
    }
}
