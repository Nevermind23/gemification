package p342j$.util.concurrent;

import java.util.Comparator;
import p342j$.util.C9362G;
import p342j$.util.C9381a;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.z */
final class C9413z implements C9362G {

    /* renamed from: a */
    long f26045a;

    /* renamed from: b */
    final long f26046b;

    /* renamed from: c */
    final int f26047c;

    /* renamed from: d */
    final int f26048d;

    C9413z(long j, long j2, int i, int i2) {
        this.f26045a = j;
        this.f26046b = j2;
        this.f26047c = i;
        this.f26048d = i2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34650f(this, consumer);
    }

    /* renamed from: b */
    public final C9413z trySplit() {
        long j = this.f26045a;
        long j2 = (this.f26046b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f26045a = j2;
        return new C9413z(j, j2, this.f26047c, this.f26048d);
    }

    /* renamed from: c */
    public final void forEachRemaining(C9428G g) {
        g.getClass();
        long j = this.f26045a;
        long j2 = this.f26046b;
        if (j < j2) {
            this.f26045a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                g.accept(current.mo25334d(this.f26047c, this.f26048d));
                j++;
            } while (j < j2);
        }
    }

    public final int characteristics() {
        return 17728;
    }

    public final long estimateSize() {
        return this.f26046b - this.f26045a;
    }

    /* renamed from: g */
    public final boolean tryAdvance(C9428G g) {
        g.getClass();
        long j = this.f26045a;
        if (j >= this.f26046b) {
            return false;
        }
        g.accept(ThreadLocalRandom.current().mo25334d(this.f26047c, this.f26048d));
        this.f26045a = j + 1;
        return true;
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

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34657q(this, consumer);
    }
}
