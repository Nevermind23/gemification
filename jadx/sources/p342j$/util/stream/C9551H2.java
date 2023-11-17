package p342j$.util.stream;

import java.util.Comparator;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.C9417e0;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.H2 */
final class C9551H2 implements C9371P {

    /* renamed from: a */
    int f26216a;

    /* renamed from: b */
    final int f26217b;

    /* renamed from: c */
    int f26218c;

    /* renamed from: d */
    final int f26219d;

    /* renamed from: e */
    Object[] f26220e;

    /* renamed from: f */
    final /* synthetic */ C9588Q2 f26221f;

    static {
        Class<C9588Q2> cls = C9588Q2.class;
    }

    C9551H2(C9588Q2 q2, int i, int i2, int i3, int i4) {
        this.f26221f = q2;
        this.f26216a = i;
        this.f26217b = i2;
        this.f26218c = i3;
        this.f26219d = i4;
        Object[][] objArr = q2.f26271f;
        this.f26220e = objArr == null ? q2.f26270e : objArr[i];
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        C9588Q2 q2;
        consumer.getClass();
        int i = this.f26216a;
        int i2 = this.f26219d;
        int i3 = this.f26217b;
        if (i < i3 || (i == i3 && this.f26218c < i2)) {
            int i4 = this.f26218c;
            while (true) {
                q2 = this.f26221f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = q2.f26271f[i];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.f26216a == i3 ? this.f26220e : q2.f26271f[i3];
            while (i4 < i2) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
            this.f26216a = i3;
            this.f26218c = i2;
        }
    }

    public final int characteristics() {
        return 16464;
    }

    public final long estimateSize() {
        int i = this.f26216a;
        int i2 = this.f26219d;
        int i3 = this.f26217b;
        if (i == i3) {
            return ((long) i2) - ((long) this.f26218c);
        }
        long[] jArr = this.f26221f.f26368d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.f26218c);
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
        consumer.getClass();
        int i = this.f26216a;
        int i2 = this.f26217b;
        if (i >= i2 && (i != i2 || this.f26218c >= this.f26219d)) {
            return false;
        }
        Object[] objArr = this.f26220e;
        int i3 = this.f26218c;
        this.f26218c = i3 + 1;
        consumer.accept(objArr[i3]);
        if (this.f26218c == this.f26220e.length) {
            this.f26218c = 0;
            int i4 = this.f26216a + 1;
            this.f26216a = i4;
            Object[][] objArr2 = this.f26221f.f26271f;
            if (objArr2 != null && i4 <= i2) {
                this.f26220e = objArr2[i4];
            }
        }
        return true;
    }

    public final C9371P trySplit() {
        int i = this.f26216a;
        int i2 = this.f26217b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.f26218c;
            C9588Q2 q2 = this.f26221f;
            C9551H2 h2 = new C9551H2(q2, i, i3, i4, q2.f26271f[i3].length);
            this.f26216a = i2;
            this.f26218c = 0;
            this.f26220e = q2.f26271f[i2];
            return h2;
        } else if (i != i2) {
            return null;
        } else {
            int i5 = this.f26218c;
            int i6 = (this.f26219d - i5) / 2;
            if (i6 == 0) {
                return null;
            }
            C9371P m = C9417e0.m34765m(this.f26220e, i5, i5 + i6);
            this.f26218c += i6;
            return m;
        }
    }
}
