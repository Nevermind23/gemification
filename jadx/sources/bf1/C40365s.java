package bf1;

import java.util.Iterator;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;
import ve1.C43151a;

/* renamed from: bf1.s */
public final class C40365s implements C40342g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C40342g f95869a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C43075l f95870b;

    /* renamed from: bf1.s$a */
    public static final class C40366a implements Iterator, C43151a {

        /* renamed from: d */
        private final Iterator f95871d;

        /* renamed from: e */
        final /* synthetic */ C40365s f95872e;

        C40366a(C40365s sVar) {
            this.f95872e = sVar;
            this.f95871d = sVar.f95869a.iterator();
        }

        public boolean hasNext() {
            return this.f95871d.hasNext();
        }

        public Object next() {
            return this.f95872e.f95870b.invoke(this.f95871d.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C40365s(C40342g gVar, C43075l lVar) {
        C41536l.m120489i(gVar, "sequence");
        C41536l.m120489i(lVar, "transformer");
        this.f95869a = gVar;
        this.f95870b = lVar;
    }

    public Iterator iterator() {
        return new C40366a(this);
    }
}
