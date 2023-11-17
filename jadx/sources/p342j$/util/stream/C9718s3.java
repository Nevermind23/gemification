package p342j$.util.stream;

import java.util.Comparator;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.s3 */
final class C9718s3 extends C9723t3 implements C9371P {
    C9718s3(C9371P p, long j, long j2) {
        super(p, j, j2, 0, Math.min(p.estimateSize(), j2));
    }

    private C9718s3(C9371P p, long j, long j2, long j3, long j4) {
        super(p, j, j2, j3, j4);
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        consumer.getClass();
        long j = this.f26488e;
        long j2 = this.f26484a;
        if (j2 < j) {
            long j3 = this.f26487d;
            if (j3 < j) {
                if (j3 < j2 || this.f26486c.estimateSize() + j3 > this.f26485b) {
                    while (j2 > this.f26487d) {
                        this.f26486c.mo25179m(new C9566L0(7));
                        this.f26487d++;
                    }
                    while (this.f26487d < this.f26488e) {
                        this.f26486c.mo25179m(consumer);
                        this.f26487d++;
                    }
                    return;
                }
                this.f26486c.mo25169a(consumer);
                this.f26487d = this.f26488e;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9371P mo26158b(C9371P p, long j, long j2, long j3, long j4) {
        return new C9718s3(p, j, j2, j3, j4);
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
    public final boolean mo25179m(Consumer consumer) {
        long j;
        consumer.getClass();
        long j2 = this.f26488e;
        long j3 = this.f26484a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f26487d;
            if (j3 <= j) {
                break;
            }
            this.f26486c.mo25179m(new C9566L0(8));
            this.f26487d++;
        }
        if (j >= this.f26488e) {
            return false;
        }
        this.f26487d = j + 1;
        return this.f26486c.mo25179m(consumer);
    }
}
