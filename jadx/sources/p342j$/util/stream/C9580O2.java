package p342j$.util.stream;

import java.util.Comparator;
import p342j$.util.C9368M;
import p342j$.util.C9381a;

/* renamed from: j$.util.stream.O2 */
abstract class C9580O2 implements C9368M {

    /* renamed from: a */
    int f26259a;

    /* renamed from: b */
    final int f26260b;

    /* renamed from: c */
    int f26261c;

    /* renamed from: d */
    final int f26262d;

    /* renamed from: e */
    Object f26263e;

    /* renamed from: f */
    final /* synthetic */ C9584P2 f26264f;

    static {
        Class<C9588Q2> cls = C9588Q2.class;
    }

    C9580O2(C9584P2 p2, int i, int i2, int i3, int i4) {
        this.f26264f = p2;
        this.f26259a = i;
        this.f26260b = i2;
        this.f26261c = i3;
        this.f26262d = i4;
        Object[] objArr = p2.f26267f;
        this.f26263e = objArr == null ? p2.f26266e : objArr[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo25802b(int i, Object obj, Object obj2);

    public final int characteristics() {
        return 16464;
    }

    public final long estimateSize() {
        int i = this.f26259a;
        int i2 = this.f26262d;
        int i3 = this.f26260b;
        if (i == i3) {
            return ((long) i2) - ((long) this.f26261c);
        }
        long[] jArr = this.f26264f.f26368d;
        return ((jArr[i3] + ((long) i2)) - jArr[i]) - ((long) this.f26261c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract C9368M mo25803f(Object obj, int i, int i2);

    /* renamed from: forEachRemaining */
    public final void mo25908e(Object obj) {
        C9584P2 p2;
        obj.getClass();
        int i = this.f26259a;
        int i2 = this.f26262d;
        int i3 = this.f26260b;
        if (i < i3 || (i == i3 && this.f26261c < i2)) {
            int i4 = this.f26261c;
            while (true) {
                p2 = this.f26264f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = p2.f26267f[i];
                p2.mo25888w(obj2, i4, p2.mo25889x(obj2), obj);
                i++;
                i4 = 0;
            }
            p2.mo25888w(this.f26259a == i3 ? this.f26263e : p2.f26267f[i3], i4, i2, obj);
            this.f26259a = i3;
            this.f26261c = i2;
        }
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

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract C9368M mo25804i(int i, int i2, int i3, int i4);

    /* renamed from: tryAdvance */
    public final boolean mo25911j(Object obj) {
        obj.getClass();
        int i = this.f26259a;
        int i2 = this.f26260b;
        if (i >= i2 && (i != i2 || this.f26261c >= this.f26262d)) {
            return false;
        }
        Object obj2 = this.f26263e;
        int i3 = this.f26261c;
        this.f26261c = i3 + 1;
        mo25802b(i3, obj2, obj);
        int i4 = this.f26261c;
        Object obj3 = this.f26263e;
        C9584P2 p2 = this.f26264f;
        if (i4 == p2.mo25889x(obj3)) {
            this.f26261c = 0;
            int i5 = this.f26259a + 1;
            this.f26259a = i5;
            Object[] objArr = p2.f26267f;
            if (objArr != null && i5 <= i2) {
                this.f26263e = objArr[i5];
            }
        }
        return true;
    }

    public final C9368M trySplit() {
        int i = this.f26259a;
        int i2 = this.f26260b;
        if (i < i2) {
            int i3 = this.f26261c;
            C9584P2 p2 = this.f26264f;
            C9368M i4 = mo25804i(i, i2 - 1, i3, p2.mo25889x(p2.f26267f[i2 - 1]));
            this.f26259a = i2;
            this.f26261c = 0;
            this.f26263e = p2.f26267f[i2];
            return i4;
        } else if (i != i2) {
            return null;
        } else {
            int i5 = this.f26261c;
            int i6 = (this.f26262d - i5) / 2;
            if (i6 == 0) {
                return null;
            }
            C9368M f = mo25803f(this.f26263e, i5, i6);
            this.f26261c += i6;
            return f;
        }
    }
}
