package p342j$.util.concurrent;

import java.util.Comparator;
import p342j$.util.C9365J;
import p342j$.util.C9381a;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.A */
final class C9387A implements C9365J {

    /* renamed from: a */
    long f25971a;

    /* renamed from: b */
    final long f25972b;

    /* renamed from: c */
    final long f25973c;

    /* renamed from: d */
    final long f25974d;

    C9387A(long j, long j2, long j3, long j4) {
        this.f25971a = j;
        this.f25972b = j2;
        this.f25973c = j3;
        this.f25974d = j4;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34651i(this, consumer);
    }

    /* renamed from: b */
    public final C9387A trySplit() {
        long j = this.f25971a;
        long j2 = (this.f25972b + j) >>> 1;
        if (j2 <= j) {
            return null;
        }
        this.f25971a = j2;
        return new C9387A(j, j2, this.f25973c, this.f25974d);
    }

    public final int characteristics() {
        return 17728;
    }

    /* renamed from: d */
    public final void forEachRemaining(C9444X x) {
        x.getClass();
        long j = this.f25971a;
        long j2 = this.f25972b;
        if (j < j2) {
            this.f25971a = j2;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                x.accept(current.mo25339e(this.f25973c, this.f25974d));
                j++;
            } while (j < j2);
        }
    }

    public final long estimateSize() {
        return this.f25972b - this.f25971a;
    }

    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C9381a.m34652k(this);
    }

    /* renamed from: h */
    public final boolean tryAdvance(C9444X x) {
        x.getClass();
        long j = this.f25971a;
        if (j >= this.f25972b) {
            return false;
        }
        x.accept(ThreadLocalRandom.current().mo25339e(this.f25973c, this.f25974d));
        this.f25971a = j + 1;
        return true;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C9381a.m34653l(this, i);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34658r(this, consumer);
    }
}
