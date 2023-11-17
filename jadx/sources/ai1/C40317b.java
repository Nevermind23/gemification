package ai1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import p469io.reactivex.exceptions.CompositeException;
import zh1.C43443b;
import zh1.C43446d;
import zh1.C43510v;

/* renamed from: ai1.b */
final class C40317b extends C40749p {

    /* renamed from: d */
    private final C43443b f95771d;

    /* renamed from: ai1.b$a */
    private static final class C40318a implements C41205b, C43446d {

        /* renamed from: d */
        private final C43443b f95772d;

        /* renamed from: e */
        private final C40756v f95773e;

        /* renamed from: f */
        private volatile boolean f95774f;

        /* renamed from: g */
        boolean f95775g = false;

        C40318a(C43443b bVar, C40756v vVar) {
            this.f95772d = bVar;
            this.f95773e = vVar;
        }

        public void dispose() {
            this.f95774f = true;
            this.f95772d.cancel();
        }

        public boolean isDisposed() {
            return this.f95774f;
        }

        public void onFailure(C43443b bVar, Throwable th) {
            if (!bVar.mo102161x()) {
                try {
                    this.f95773e.onError(th);
                } catch (Throwable th2) {
                    C41300a.m119661b(th2);
                    C40293a.m116722s(new CompositeException(th, th2));
                }
            }
        }

        public void onResponse(C43443b bVar, C43510v vVar) {
            if (!this.f95774f) {
                try {
                    this.f95773e.onNext(vVar);
                    if (!this.f95774f) {
                        this.f95775g = true;
                        this.f95773e.onComplete();
                    }
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    C40293a.m116722s(new CompositeException(th, th));
                }
            }
        }
    }

    C40317b(C43443b bVar) {
        this.f95771d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C43443b f1 = this.f95771d.mo102157f1();
        C40318a aVar = new C40318a(f1, vVar);
        vVar.onSubscribe(aVar);
        if (!aVar.isDisposed()) {
            f1.mo102158i(aVar);
        }
    }
}
