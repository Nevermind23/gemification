package p342j$.util;

import java.util.Comparator;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.d0 */
final class C9415d0 implements C9365J {

    /* renamed from: a */
    private final long[] f26052a;

    /* renamed from: b */
    private int f26053b;

    /* renamed from: c */
    private final int f26054c;

    /* renamed from: d */
    private final int f26055d;

    public C9415d0(long[] jArr, int i, int i2, int i3) {
        this.f26052a = jArr;
        this.f26053b = i;
        this.f26054c = i2;
        this.f26055d = i3 | 64 | 16384;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34651i(this, consumer);
    }

    public final int characteristics() {
        return this.f26055d;
    }

    /* renamed from: d */
    public final void forEachRemaining(C9444X x) {
        int i;
        x.getClass();
        long[] jArr = this.f26052a;
        int length = jArr.length;
        int i2 = this.f26054c;
        if (length >= i2 && (i = this.f26053b) >= 0) {
            this.f26053b = i2;
            if (i < i2) {
                do {
                    x.accept(jArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final long estimateSize() {
        return (long) (this.f26054c - this.f26053b);
    }

    public final Comparator getComparator() {
        if (C9381a.m34653l(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C9381a.m34652k(this);
    }

    /* renamed from: h */
    public final boolean tryAdvance(C9444X x) {
        x.getClass();
        int i = this.f26053b;
        if (i < 0 || i >= this.f26054c) {
            return false;
        }
        this.f26053b = i + 1;
        x.accept(this.f26052a[i]);
        return true;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C9381a.m34653l(this, i);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34658r(this, consumer);
    }

    public final C9365J trySplit() {
        int i = this.f26053b;
        int i2 = (this.f26054c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f26053b = i2;
        return new C9415d0(this.f26052a, i, i2, this.f26055d);
    }
}
