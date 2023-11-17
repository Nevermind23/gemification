package p342j$.util.stream;

import java.util.Comparator;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.y3 */
final class C9748y3 extends C9517A3 implements C9371P, Consumer {

    /* renamed from: e */
    Object f26530e;

    C9748y3(C9371P p, long j, long j2) {
        super(p, j, j2);
    }

    C9748y3(C9371P p, C9748y3 y3Var) {
        super(p, y3Var);
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        consumer.getClass();
        C9638c3 c3Var = null;
        while (true) {
            C9753z3 v = mo25690v();
            if (v != C9753z3.NO_MORE) {
                C9753z3 z3Var = C9753z3.MAYBE_MORE;
                C9371P p = this.f26163a;
                if (v == z3Var) {
                    if (c3Var == null) {
                        c3Var = new C9638c3();
                    } else {
                        c3Var.f26364a = 0;
                    }
                    long j = 0;
                    while (p.mo25179m(c3Var)) {
                        j++;
                        if (j >= 128) {
                            break;
                        }
                    }
                    if (j != 0) {
                        long t = mo25687t(j);
                        for (int i = 0; ((long) i) < t; i++) {
                            consumer.accept(c3Var.f26361b[i]);
                        }
                    } else {
                        return;
                    }
                } else {
                    p.mo25169a(consumer);
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void accept(Object obj) {
        this.f26530e = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
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
        while (mo25690v() != C9753z3.NO_MORE && this.f26163a.mo25179m(this)) {
            if (mo25687t(1) == 1) {
                consumer.accept(this.f26530e);
                this.f26530e = null;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C9371P mo25689u(C9371P p) {
        return new C9748y3(p, this);
    }
}
