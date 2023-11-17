package sd1;

import ed1.C40754t;
import ed1.C40756v;
import jd1.C41405l;
import ld1.C41692b;
import nd1.C41774a;

/* renamed from: sd1.k0 */
public final class C42469k0 extends C42399a {

    /* renamed from: e */
    final C41405l f99911e;

    /* renamed from: sd1.k0$a */
    static final class C42470a extends C41774a {

        /* renamed from: i */
        final C41405l f99912i;

        C42470a(C40756v vVar, C41405l lVar) {
            super(vVar);
            this.f99912i = lVar;
        }

        /* renamed from: c */
        public Object mo96258c() {
            Object c = this.f98081f.mo96258c();
            if (c != null) {
                return C41692b.m120934e(this.f99912i.apply(c), "The mapper function returned a null value.");
            }
            return null;
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return mo96600g(i);
        }

        public void onNext(Object obj) {
            if (!this.f98082g) {
                if (this.f98083h != 0) {
                    this.f98079d.onNext((Object) null);
                    return;
                }
                try {
                    this.f98079d.onNext(C41692b.m120934e(this.f99912i.apply(obj), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo96599d(th);
                }
            }
        }
    }

    public C42469k0(C40754t tVar, C41405l lVar) {
        super(tVar);
        this.f99911e = lVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42470a(vVar, this.f99911e));
    }
}
