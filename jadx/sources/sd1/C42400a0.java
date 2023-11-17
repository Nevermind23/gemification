package sd1;

import ed1.C40749p;
import ed1.C40756v;
import id1.C41300a;
import java.util.Iterator;
import kd1.C41499d;
import ld1.C41692b;
import nd1.C41776c;

/* renamed from: sd1.a0 */
public final class C42400a0 extends C40749p {

    /* renamed from: d */
    final Iterable f99679d;

    /* renamed from: sd1.a0$a */
    static final class C42401a extends C41776c {

        /* renamed from: d */
        final C40756v f99680d;

        /* renamed from: e */
        final Iterator f99681e;

        /* renamed from: f */
        volatile boolean f99682f;

        /* renamed from: g */
        boolean f99683g;

        /* renamed from: h */
        boolean f99684h;

        /* renamed from: i */
        boolean f99685i;

        C42401a(C40756v vVar, Iterator it) {
            this.f99680d = vVar;
            this.f99681e = it;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97870a() {
            while (!isDisposed()) {
                try {
                    this.f99680d.onNext(C41692b.m120934e(this.f99681e.next(), "The iterator returned a null value"));
                    if (!isDisposed()) {
                        try {
                            if (!this.f99681e.hasNext()) {
                                if (!isDisposed()) {
                                    this.f99680d.onComplete();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C41300a.m119661b(th);
                            this.f99680d.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C41300a.m119661b(th2);
                    this.f99680d.onError(th2);
                    return;
                }
            }
        }

        /* renamed from: c */
        public Object mo96258c() {
            if (this.f99684h) {
                return null;
            }
            if (!this.f99685i) {
                this.f99685i = true;
            } else if (!this.f99681e.hasNext()) {
                this.f99684h = true;
                return null;
            }
            return C41692b.m120934e(this.f99681e.next(), "The iterator returned a null value");
        }

        public void clear() {
            this.f99684h = true;
        }

        public void dispose() {
            this.f99682f = true;
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f99683g = true;
            return 1;
        }

        public boolean isDisposed() {
            return this.f99682f;
        }

        public boolean isEmpty() {
            return this.f99684h;
        }
    }

    public C42400a0(Iterable iterable) {
        this.f99679d = iterable;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        try {
            Iterator it = this.f99679d.iterator();
            try {
                if (!it.hasNext()) {
                    C41499d.m120381g(vVar);
                    return;
                }
                C42401a aVar = new C42401a(vVar, it);
                vVar.onSubscribe(aVar);
                if (!aVar.f99683g) {
                    aVar.mo97870a();
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C41499d.m120384n(th, vVar);
            }
        } catch (Throwable th2) {
            C41300a.m119661b(th2);
            C41499d.m120384n(th2, vVar);
        }
    }
}
