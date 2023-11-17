package p342j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.Q */
final class C9372Q implements Iterator, Consumer {

    /* renamed from: a */
    boolean f25940a = false;

    /* renamed from: b */
    Object f25941b;

    /* renamed from: c */
    final /* synthetic */ C9371P f25942c;

    C9372Q(C9371P p) {
        this.f25942c = p;
    }

    public final void accept(Object obj) {
        this.f25940a = true;
        this.f25941b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final boolean hasNext() {
        if (!this.f25940a) {
            this.f25942c.mo25179m(this);
        }
        return this.f25940a;
    }

    public final Object next() {
        if (this.f25940a || hasNext()) {
            this.f25940a = false;
            return this.f25941b;
        }
        throw new NoSuchElementException();
    }
}
