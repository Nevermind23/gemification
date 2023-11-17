package p342j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import p342j$.util.C9371P;
import p342j$.util.C9381a;

/* renamed from: j$.util.stream.j1 */
abstract class C9671j1 implements C9371P {

    /* renamed from: a */
    C9539F0 f26397a;

    /* renamed from: b */
    int f26398b;

    /* renamed from: c */
    C9371P f26399c;

    /* renamed from: d */
    C9371P f26400d;

    /* renamed from: e */
    Deque f26401e;

    C9671j1(C9539F0 f0) {
        this.f26397a = f0;
    }

    /* renamed from: b */
    protected static C9539F0 m35555b(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            C9539F0 f0 = (C9539F0) arrayDeque.pollFirst();
            if (f0 != null) {
                if (f0.mo25797t() != 0) {
                    int t = f0.mo25797t();
                    while (true) {
                        t--;
                        if (t < 0) {
                            break;
                        }
                        arrayDeque.addFirst(f0.mo25746c(t));
                    }
                } else if (f0.count() > 0) {
                    return f0;
                }
            } else {
                return null;
            }
        }
    }

    public final int characteristics() {
        return 64;
    }

    public final long estimateSize() {
        long j = 0;
        if (this.f26397a == null) {
            return 0;
        }
        C9371P p = this.f26399c;
        if (p != null) {
            return p.estimateSize();
        }
        for (int i = this.f26398b; i < this.f26397a.mo25797t(); i++) {
            j += this.f26397a.mo25746c(i).count();
        }
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Deque mo26073f() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int t = this.f26397a.mo25797t();
        while (true) {
            t--;
            if (t < this.f26398b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f26397a.mo25746c(t));
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

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo26074i() {
        if (this.f26397a == null) {
            return false;
        }
        if (this.f26400d != null) {
            return true;
        }
        C9371P p = this.f26399c;
        if (p == null) {
            Deque f = mo26073f();
            this.f26401e = f;
            C9539F0 b = m35555b(f);
            if (b != null) {
                p = b.spliterator();
            } else {
                this.f26397a = null;
                return false;
            }
        }
        this.f26400d = p;
        return true;
    }

    public final C9371P trySplit() {
        C9539F0 f0 = this.f26397a;
        if (f0 == null || this.f26400d != null) {
            return null;
        }
        C9371P p = this.f26399c;
        if (p != null) {
            return p.trySplit();
        }
        if (this.f26398b < f0.mo25797t() - 1) {
            C9539F0 f02 = this.f26397a;
            int i = this.f26398b;
            this.f26398b = i + 1;
            return f02.mo25746c(i).spliterator();
        }
        C9539F0 c = this.f26397a.mo25746c(this.f26398b);
        this.f26397a = c;
        if (c.mo25797t() == 0) {
            C9371P spliterator = this.f26397a.spliterator();
            this.f26399c = spliterator;
            return spliterator.trySplit();
        }
        C9539F0 f03 = this.f26397a;
        this.f26398b = 0 + 1;
        return f03.mo25746c(0).spliterator();
    }
}
