package p342j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p342j$.util.C9371P;

/* renamed from: j$.util.stream.V */
final class C9604V extends CountedCompleter {

    /* renamed from: a */
    private C9371P f26294a;

    /* renamed from: b */
    private final C9657g2 f26295b;

    /* renamed from: c */
    private final C9735w0 f26296c;

    /* renamed from: d */
    private long f26297d;

    C9604V(C9604V v, C9371P p) {
        super(v);
        this.f26294a = p;
        this.f26295b = v.f26295b;
        this.f26297d = v.f26297d;
        this.f26296c = v.f26296c;
    }

    C9604V(C9735w0 w0Var, C9371P p, C9657g2 g2Var) {
        super((CountedCompleter) null);
        this.f26295b = g2Var;
        this.f26296c = w0Var;
        this.f26294a = p;
        this.f26297d = 0;
    }

    public final void compute() {
        C9371P trySplit;
        C9371P p = this.f26294a;
        long estimateSize = p.estimateSize();
        long j = this.f26297d;
        if (j == 0) {
            j = C9649f.m35495f(estimateSize);
            this.f26297d = j;
        }
        boolean f = C9607V2.SHORT_CIRCUIT.mo26013f(this.f26296c.mo26036g1());
        C9657g2 g2Var = this.f26295b;
        boolean z = false;
        C9604V v = this;
        while (true) {
            if (f && g2Var.mo25696r()) {
                break;
            } else if (estimateSize <= j || (trySplit = p.trySplit()) == null) {
                v.f26296c.mo26032V0(p, g2Var);
            } else {
                C9604V v2 = new C9604V(v, trySplit);
                v.addToPendingCount(1);
                if (z) {
                    p = trySplit;
                } else {
                    C9604V v3 = v;
                    v = v2;
                    v2 = v3;
                }
                z = !z;
                v.fork();
                v = v2;
                estimateSize = p.estimateSize();
            }
        }
        v.f26296c.mo26032V0(p, g2Var);
        v.f26294a = null;
        v.propagateCompletion();
    }
}
