package bf1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;
import ue1.C43075l;
import ve1.C43151a;

/* renamed from: bf1.f */
final class C40340f implements C40342g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C43064a f95835a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C43075l f95836b;

    /* renamed from: bf1.f$a */
    public static final class C40341a implements Iterator, C43151a {

        /* renamed from: d */
        private Object f95837d;

        /* renamed from: e */
        private int f95838e = -2;

        /* renamed from: f */
        final /* synthetic */ C40340f f95839f;

        C40341a(C40340f fVar) {
            this.f95839f = fVar;
        }

        /* renamed from: b */
        private final void m116807b() {
            Object obj;
            int i;
            if (this.f95838e == -2) {
                obj = this.f95839f.f95835a.invoke();
            } else {
                C43075l d = this.f95839f.f95836b;
                Object obj2 = this.f95837d;
                C41536l.m120486f(obj2);
                obj = d.invoke(obj2);
            }
            this.f95837d = obj;
            if (obj == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.f95838e = i;
        }

        public boolean hasNext() {
            if (this.f95838e < 0) {
                m116807b();
            }
            if (this.f95838e == 1) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.f95838e < 0) {
                m116807b();
            }
            if (this.f95838e != 0) {
                Object obj = this.f95837d;
                C41536l.m120487g(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f95838e = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C40340f(C43064a aVar, C43075l lVar) {
        C41536l.m120489i(aVar, "getInitialValue");
        C41536l.m120489i(lVar, "getNextValue");
        this.f95835a = aVar;
        this.f95836b = lVar;
    }

    public Iterator iterator() {
        return new C40341a(this);
    }
}
