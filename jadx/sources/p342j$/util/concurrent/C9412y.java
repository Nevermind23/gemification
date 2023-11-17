package p342j$.util.concurrent;

import java.util.Comparator;
import p342j$.util.C9359D;
import p342j$.util.C9381a;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.y */
final class C9412y implements C9359D {

    /* renamed from: a */
    long f26041a;

    /* renamed from: b */
    final long f26042b;

    /* renamed from: c */
    final double f26043c;

    /* renamed from: d */
    final double f26044d;

    C9412y(long j, long j2, double d, double d2) {
        this.f26041a = j;
        this.f26042b = j2;
        this.f26043c = d;
        this.f26044d = d2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34649b(this, consumer);
    }

    /* renamed from: b */
    public final C9412y trySplit() {
        long j = this.f26041a;
        long j2 = (this.f26042b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f26041a = j2;
        return new C9412y(j, j2, this.f26043c, this.f26044d);
    }

    public final int characteristics() {
        return 17728;
    }

    /* renamed from: e */
    public final void forEachRemaining(C9475o oVar) {
        oVar.getClass();
        long j = this.f26041a;
        long j2 = this.f26042b;
        if (j < j2) {
            this.f26041a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                oVar.accept(current.mo25333c(this.f26043c, this.f26044d));
                j++;
            } while (j < j2);
        }
    }

    public final long estimateSize() {
        return this.f26042b - this.f26041a;
    }

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C9381a.m34652k(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C9381a.m34653l(this, i);
    }

    /* renamed from: j */
    public final boolean tryAdvance(C9475o oVar) {
        oVar.getClass();
        long j = this.f26041a;
        if (j >= this.f26042b) {
            return false;
        }
        oVar.accept(ThreadLocalRandom.current().mo25333c(this.f26043c, this.f26044d));
        this.f26041a = j + 1;
        return true;
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34656p(this, consumer);
    }
}
