package p342j$.util.stream;

import java.util.Comparator;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.concurrent.ConcurrentHashMap;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.e3 */
final class C9648e3 implements C9371P, Consumer {

    /* renamed from: d */
    private static final Object f26370d = new Object();

    /* renamed from: a */
    private final C9371P f26371a;

    /* renamed from: b */
    private final ConcurrentHashMap f26372b;

    /* renamed from: c */
    private Object f26373c;

    C9648e3(C9371P p) {
        this(p, new ConcurrentHashMap());
    }

    private C9648e3(C9371P p, ConcurrentHashMap concurrentHashMap) {
        this.f26371a = p;
        this.f26372b = concurrentHashMap;
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        this.f26371a.mo25169a(new C9694o(6, this, consumer));
    }

    public final void accept(Object obj) {
        this.f26373c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final int characteristics() {
        return (this.f26371a.characteristics() & -16469) | 1;
    }

    public final long estimateSize() {
        return this.f26371a.estimateSize();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo26049f(Consumer consumer, Object obj) {
        if (this.f26372b.putIfAbsent(obj != null ? obj : f26370d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    public final Comparator getComparator() {
        return this.f26371a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return C9381a.m34652k(this);
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C9381a.m34653l(this, i);
    }

    /* renamed from: m */
    public final boolean mo25179m(Consumer consumer) {
        while (this.f26371a.mo25179m(this)) {
            Object obj = this.f26373c;
            if (obj == null) {
                obj = f26370d;
            }
            if (this.f26372b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f26373c);
                this.f26373c = null;
                return true;
            }
        }
        return false;
    }

    public final C9371P trySplit() {
        C9371P trySplit = this.f26371a.trySplit();
        if (trySplit != null) {
            return new C9648e3(trySplit, this.f26372b);
        }
        return null;
    }
}
