package p342j$.util.stream;

import java.util.Deque;
import p342j$.util.C9371P;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.i1 */
final class C9666i1 extends C9671j1 {
    C9666i1(C9539F0 f0) {
        super(f0);
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        if (this.f26397a != null) {
            if (this.f26400d == null) {
                C9371P p = this.f26399c;
                if (p == null) {
                    Deque f = mo26073f();
                    while (true) {
                        C9539F0 b = C9671j1.m35555b(f);
                        if (b != null) {
                            b.mo25794a(consumer);
                        } else {
                            this.f26397a = null;
                            return;
                        }
                    }
                } else {
                    p.mo25169a(consumer);
                }
            } else {
                do {
                } while (mo25179m(consumer));
            }
        }
    }

    /* renamed from: m */
    public final boolean mo25179m(Consumer consumer) {
        C9539F0 b;
        if (!mo26074i()) {
            return false;
        }
        boolean m = this.f26400d.mo25179m(consumer);
        if (!m) {
            if (this.f26399c != null || (b = C9671j1.m35555b(this.f26401e)) == null) {
                this.f26397a = null;
            } else {
                C9371P spliterator = b.spliterator();
                this.f26400d = spliterator;
                return spliterator.mo25179m(consumer);
            }
        }
        return m;
    }
}
