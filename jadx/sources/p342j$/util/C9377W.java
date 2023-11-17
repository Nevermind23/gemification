package p342j$.util;

import java.util.Comparator;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.W */
final class C9377W implements C9359D {

    /* renamed from: a */
    private final double[] f25956a;

    /* renamed from: b */
    private int f25957b;

    /* renamed from: c */
    private final int f25958c;

    /* renamed from: d */
    private final int f25959d;

    public C9377W(double[] dArr, int i, int i2, int i3) {
        this.f25956a = dArr;
        this.f25957b = i;
        this.f25958c = i2;
        this.f25959d = i3 | 64 | 16384;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34649b(this, consumer);
    }

    public final int characteristics() {
        return this.f25959d;
    }

    /* renamed from: e */
    public final void forEachRemaining(C9475o oVar) {
        int i;
        oVar.getClass();
        double[] dArr = this.f25956a;
        int length = dArr.length;
        int i2 = this.f25958c;
        if (length >= i2 && (i = this.f25957b) >= 0) {
            this.f25957b = i2;
            if (i < i2) {
                do {
                    oVar.accept(dArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final long estimateSize() {
        return (long) (this.f25958c - this.f25957b);
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

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C9381a.m34653l(this, i);
    }

    /* renamed from: j */
    public final boolean tryAdvance(C9475o oVar) {
        oVar.getClass();
        int i = this.f25957b;
        if (i < 0 || i >= this.f25958c) {
            return false;
        }
        this.f25957b = i + 1;
        oVar.accept(this.f25956a[i]);
        return true;
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34656p(this, consumer);
    }

    public final C9359D trySplit() {
        int i = this.f25957b;
        int i2 = (this.f25958c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f25957b = i2;
        return new C9377W(this.f25956a, i, i2, this.f25959d);
    }
}
