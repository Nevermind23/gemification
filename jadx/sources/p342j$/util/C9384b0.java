package p342j$.util;

import java.util.Comparator;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.b0 */
final class C9384b0 implements C9362G {

    /* renamed from: a */
    private final int[] f25960a;

    /* renamed from: b */
    private int f25961b;

    /* renamed from: c */
    private final int f25962c;

    /* renamed from: d */
    private final int f25963d;

    public C9384b0(int[] iArr, int i, int i2, int i3) {
        this.f25960a = iArr;
        this.f25961b = i;
        this.f25962c = i2;
        this.f25963d = i3 | 64 | 16384;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34650f(this, consumer);
    }

    /* renamed from: c */
    public final void forEachRemaining(C9428G g) {
        int i;
        g.getClass();
        int[] iArr = this.f25960a;
        int length = iArr.length;
        int i2 = this.f25962c;
        if (length >= i2 && (i = this.f25961b) >= 0) {
            this.f25961b = i2;
            if (i < i2) {
                do {
                    g.accept(iArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final int characteristics() {
        return this.f25963d;
    }

    public final long estimateSize() {
        return (long) (this.f25962c - this.f25961b);
    }

    /* renamed from: g */
    public final boolean tryAdvance(C9428G g) {
        g.getClass();
        int i = this.f25961b;
        if (i < 0 || i >= this.f25962c) {
            return false;
        }
        this.f25961b = i + 1;
        g.accept(this.f25960a[i]);
        return true;
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

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34657q(this, consumer);
    }

    public final C9362G trySplit() {
        int i = this.f25961b;
        int i2 = (this.f25962c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f25961b = i2;
        return new C9384b0(this.f25960a, i, i2, this.f25963d);
    }
}
