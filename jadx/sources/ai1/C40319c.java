package ai1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import p469io.reactivex.exceptions.CompositeException;
import zh1.C43443b;
import zh1.C43510v;

/* renamed from: ai1.c */
final class C40319c extends C40749p {

    /* renamed from: d */
    private final C43443b f95776d;

    /* renamed from: ai1.c$a */
    private static final class C40320a implements C41205b {

        /* renamed from: d */
        private final C43443b f95777d;

        /* renamed from: e */
        private volatile boolean f95778e;

        C40320a(C43443b bVar) {
            this.f95777d = bVar;
        }

        public void dispose() {
            this.f95778e = true;
            this.f95777d.cancel();
        }

        public boolean isDisposed() {
            return this.f95778e;
        }
    }

    C40319c(C43443b bVar) {
        this.f95776d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        boolean z;
        C43443b f1 = this.f95776d.mo102157f1();
        C40320a aVar = new C40320a(f1);
        vVar.onSubscribe(aVar);
        if (!aVar.isDisposed()) {
            try {
                C43510v v = f1.mo102159v();
                if (!aVar.isDisposed()) {
                    vVar.onNext(v);
                }
                if (!aVar.isDisposed()) {
                    try {
                        vVar.onComplete();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
                C41300a.m119661b(th);
                if (z) {
                    C40293a.m116722s(th);
                } else if (!aVar.isDisposed()) {
                    try {
                        vVar.onError(th);
                    } catch (Throwable th3) {
                        C41300a.m119661b(th3);
                        C40293a.m116722s(new CompositeException(th, th3));
                    }
                }
            }
        }
    }
}
