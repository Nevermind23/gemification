package p342j$.util;

import java.util.Comparator;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.V */
final class C9376V implements C9371P {

    /* renamed from: a */
    private final Object[] f25952a;

    /* renamed from: b */
    private int f25953b;

    /* renamed from: c */
    private final int f25954c;

    /* renamed from: d */
    private final int f25955d;

    public C9376V(Object[] objArr, int i, int i2, int i3) {
        this.f25952a = objArr;
        this.f25953b = i;
        this.f25954c = i2;
        this.f25955d = i3 | 64 | 16384;
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        int i;
        consumer.getClass();
        Object[] objArr = this.f25952a;
        int length = objArr.length;
        int i2 = this.f25954c;
        if (length >= i2 && (i = this.f25953b) >= 0) {
            this.f25953b = i2;
            if (i < i2) {
                do {
                    consumer.accept(objArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    public final int characteristics() {
        return this.f25955d;
    }

    public final long estimateSize() {
        return (long) (this.f25954c - this.f25953b);
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
    public final boolean mo25179m(Consumer consumer) {
        consumer.getClass();
        int i = this.f25953b;
        if (i < 0 || i >= this.f25954c) {
            return false;
        }
        this.f25953b = i + 1;
        consumer.accept(this.f25952a[i]);
        return true;
    }

    public final C9371P trySplit() {
        int i = this.f25953b;
        int i2 = (this.f25954c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.f25953b = i2;
        return new C9376V(this.f25952a, i, i2, this.f25955d);
    }
}
