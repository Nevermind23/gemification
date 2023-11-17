package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41394a;
import kd1.C41498c;
import md1.C41735d;
import nd1.C41775b;

/* renamed from: sd1.l */
public final class C42471l extends C42399a {

    /* renamed from: e */
    final C41394a f99913e;

    /* renamed from: sd1.l$a */
    static final class C42472a extends C41775b implements C40756v {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: d */
        final C40756v f99914d;

        /* renamed from: e */
        final C41394a f99915e;

        /* renamed from: f */
        C41205b f99916f;

        /* renamed from: g */
        C41735d f99917g;

        /* renamed from: h */
        boolean f99918h;

        C42472a(C40756v vVar, C41394a aVar) {
            this.f99914d = vVar;
            this.f99915e = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97917b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f99915e.run();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    C40293a.m116722s(th);
                }
            }
        }

        /* renamed from: c */
        public Object mo96258c() {
            Object c = this.f99917g.mo96258c();
            if (c == null && this.f99918h) {
                mo97917b();
            }
            return c;
        }

        public void clear() {
            this.f99917g.clear();
        }

        public void dispose() {
            this.f99916f.dispose();
            mo97917b();
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            C41735d dVar = this.f99917g;
            boolean z = false;
            if (dVar == null || (i & 4) != 0) {
                return 0;
            }
            int e = dVar.mo96260e(i);
            if (e != 0) {
                if (e == 1) {
                    z = true;
                }
                this.f99918h = z;
            }
            return e;
        }

        public boolean isDisposed() {
            return this.f99916f.isDisposed();
        }

        public boolean isEmpty() {
            return this.f99917g.isEmpty();
        }

        public void onComplete() {
            this.f99914d.onComplete();
            mo97917b();
        }

        public void onError(Throwable th) {
            this.f99914d.onError(th);
            mo97917b();
        }

        public void onNext(Object obj) {
            this.f99914d.onNext(obj);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99916f, bVar)) {
                this.f99916f = bVar;
                if (bVar instanceof C41735d) {
                    this.f99917g = (C41735d) bVar;
                }
                this.f99914d.onSubscribe(this);
            }
        }
    }

    public C42471l(C40754t tVar, C41394a aVar) {
        super(tVar);
        this.f99913e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42472a(vVar, this.f99913e));
    }
}
