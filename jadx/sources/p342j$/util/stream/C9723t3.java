package p342j$.util.stream;

import p342j$.util.C9371P;

/* renamed from: j$.util.stream.t3 */
abstract class C9723t3 {

    /* renamed from: a */
    final long f26484a;

    /* renamed from: b */
    final long f26485b;

    /* renamed from: c */
    C9371P f26486c;

    /* renamed from: d */
    long f26487d;

    /* renamed from: e */
    long f26488e;

    C9723t3(C9371P p, long j, long j2, long j3, long j4) {
        this.f26486c = p;
        this.f26484a = j;
        this.f26485b = j2;
        this.f26487d = j3;
        this.f26488e = j4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C9371P mo26158b(C9371P p, long j, long j2, long j3, long j4);

    public final int characteristics() {
        return this.f26486c.characteristics();
    }

    public final long estimateSize() {
        long j = this.f26488e;
        long j2 = this.f26484a;
        if (j2 < j) {
            return j - Math.max(j2, this.f26487d);
        }
        return 0;
    }

    public final C9371P trySplit() {
        long j = this.f26488e;
        if (this.f26484a >= j || this.f26487d >= j) {
            return null;
        }
        while (true) {
            C9371P trySplit = this.f26486c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.f26487d;
            long min = Math.min(estimateSize, this.f26485b);
            long j2 = this.f26484a;
            if (j2 >= min) {
                this.f26487d = min;
            } else {
                long j3 = this.f26485b;
                if (min >= j3) {
                    this.f26486c = trySplit;
                    this.f26488e = min;
                } else {
                    long j4 = this.f26487d;
                    if (j4 < j2 || estimateSize > j3) {
                        this.f26487d = min;
                        return mo26158b(trySplit, j2, j3, j4, min);
                    }
                    this.f26487d = min;
                    return trySplit;
                }
            }
        }
    }
}
