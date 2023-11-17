package od1;

import ed1.C40737d;
import ed1.C40739f;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import kd1.C41498c;
import nd1.C41776c;

/* renamed from: od1.t */
public final class C41846t extends C40749p {

    /* renamed from: d */
    final C40739f f98221d;

    /* renamed from: od1.t$a */
    static final class C41847a extends C41776c implements C40737d {

        /* renamed from: d */
        final C40756v f98222d;

        /* renamed from: e */
        C41205b f98223e;

        C41847a(C40756v vVar) {
            this.f98222d = vVar;
        }

        /* renamed from: a */
        public Void mo96258c() {
            return null;
        }

        public void clear() {
        }

        public void dispose() {
            this.f98223e.dispose();
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return i & 2;
        }

        public boolean isDisposed() {
            return this.f98223e.isDisposed();
        }

        public boolean isEmpty() {
            return true;
        }

        public void onComplete() {
            this.f98222d.onComplete();
        }

        public void onError(Throwable th) {
            this.f98222d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f98223e, bVar)) {
                this.f98223e = bVar;
                this.f98222d.onSubscribe(this);
            }
        }
    }

    public C41846t(C40739f fVar) {
        this.f98221d = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f98221d.mo94894a(new C41847a(vVar));
    }
}
