package p342j$.util.stream;

import java.util.Comparator;
import p342j$.util.C9368M;
import p342j$.util.C9371P;
import p342j$.util.C9381a;

/* renamed from: j$.util.stream.x3 */
abstract class C9743x3 extends C9517A3 implements C9368M {
    C9743x3(C9368M m, long j, long j2) {
        super(m, j, j2);
    }

    C9743x3(C9368M m, C9743x3 x3Var) {
        super(m, x3Var);
    }

    /* renamed from: forEachRemaining */
    public final void mo26179e(Object obj) {
        obj.getClass();
        C9633b3 b3Var = null;
        while (true) {
            C9753z3 v = mo25690v();
            if (v != C9753z3.NO_MORE) {
                C9753z3 z3Var = C9753z3.MAYBE_MORE;
                C9371P p = this.f26163a;
                if (v == z3Var) {
                    if (b3Var == null) {
                        b3Var = mo26175x();
                    } else {
                        b3Var.f26348b = 0;
                    }
                    long j = 0;
                    while (((C9368M) p).tryAdvance(b3Var)) {
                        j++;
                        if (j >= 128) {
                            break;
                        }
                    }
                    if (j != 0) {
                        b3Var.mo26020a(obj, mo25687t(j));
                    } else {
                        return;
                    }
                } else {
                    ((C9368M) p).forEachRemaining(obj);
                    return;
                }
            } else {
                return;
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
    public final boolean mo26182j(Object obj) {
        obj.getClass();
        while (mo25690v() != C9753z3.NO_MORE && ((C9368M) this.f26163a).tryAdvance(this)) {
            if (mo25687t(1) == 1) {
                mo26174w(obj);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo26174w(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract C9633b3 mo26175x();
}
