package p342j$.util.stream;

import java.util.Deque;
import p342j$.util.C9368M;
import p342j$.util.C9371P;

/* renamed from: j$.util.stream.h1 */
abstract class C9661h1 extends C9671j1 implements C9368M {
    C9661h1(C9534E0 e0) {
        super(e0);
    }

    /* renamed from: forEachRemaining */
    public final void mo26069e(Object obj) {
        if (this.f26397a != null) {
            if (this.f26400d == null) {
                C9371P p = this.f26399c;
                if (p == null) {
                    Deque f = mo26073f();
                    while (true) {
                        C9534E0 e0 = (C9534E0) C9671j1.m35555b(f);
                        if (e0 != null) {
                            e0.mo25750h(obj);
                        } else {
                            this.f26397a = null;
                            return;
                        }
                    }
                } else {
                    ((C9368M) p).forEachRemaining(obj);
                }
            } else {
                do {
                } while (mo26072j(obj));
            }
        }
    }

    /* renamed from: tryAdvance */
    public final boolean mo26072j(Object obj) {
        C9534E0 e0;
        if (!mo26074i()) {
            return false;
        }
        boolean tryAdvance = ((C9368M) this.f26400d).tryAdvance(obj);
        if (!tryAdvance) {
            if (this.f26399c != null || (e0 = (C9534E0) C9671j1.m35555b(this.f26401e)) == null) {
                this.f26397a = null;
            } else {
                C9368M spliterator = e0.spliterator();
                this.f26400d = spliterator;
                return spliterator.tryAdvance(obj);
            }
        }
        return tryAdvance;
    }
}
