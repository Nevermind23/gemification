package p342j$.util.stream;

import java.util.Comparator;
import p342j$.util.C9368M;
import p342j$.util.C9381a;

/* renamed from: j$.util.stream.r3 */
abstract class C9713r3 extends C9723t3 implements C9368M {
    C9713r3(C9368M m, long j, long j2) {
        super(m, j, j2, 0, Math.min(m.estimateSize(), j2));
    }

    C9713r3(C9368M m, long j, long j2, long j3, long j4) {
        super(m, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract Object mo26159f();

    /* renamed from: forEachRemaining */
    public final void mo26165e(Object obj) {
        obj.getClass();
        long j = this.f26488e;
        long j2 = this.f26484a;
        if (j2 < j) {
            long j3 = this.f26487d;
            if (j3 < j) {
                if (j3 < j2 || ((C9368M) this.f26486c).estimateSize() + j3 > this.f26485b) {
                    while (j2 > this.f26487d) {
                        ((C9368M) this.f26486c).tryAdvance(mo26159f());
                        this.f26487d++;
                    }
                    while (this.f26487d < this.f26488e) {
                        ((C9368M) this.f26486c).tryAdvance(obj);
                        this.f26487d++;
                    }
                    return;
                }
                ((C9368M) this.f26486c).forEachRemaining(obj);
                this.f26487d = this.f26488e;
            }
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

    /* renamed from: tryAdvance */
    public final boolean mo26168j(Object obj) {
        long j;
        obj.getClass();
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
            ((C9368M) this.f26486c).tryAdvance(mo26159f());
            this.f26487d++;
        }
        if (j >= this.f26488e) {
            return false;
        }
        this.f26487d = j + 1;
        return ((C9368M) this.f26486c).tryAdvance(obj);
    }
}
