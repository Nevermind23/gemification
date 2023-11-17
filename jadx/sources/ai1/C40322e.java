package ai1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import p469io.reactivex.exceptions.CompositeException;
import zh1.C43510v;

/* renamed from: ai1.e */
final class C40322e extends C40749p {

    /* renamed from: d */
    private final C40749p f95781d;

    /* renamed from: ai1.e$a */
    private static class C40323a implements C40756v {

        /* renamed from: d */
        private final C40756v f95782d;

        C40323a(C40756v vVar) {
            this.f95782d = vVar;
        }

        /* renamed from: a */
        public void onNext(C43510v vVar) {
            this.f95782d.onNext(C40321d.m116755b(vVar));
        }

        public void onComplete() {
            this.f95782d.onComplete();
        }

        public void onError(Throwable th) {
            try {
                this.f95782d.onNext(C40321d.m116754a(th));
                this.f95782d.onComplete();
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                C40293a.m116722s(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(C41205b bVar) {
            this.f95782d.onSubscribe(bVar);
        }
    }

    C40322e(C40749p pVar) {
        this.f95781d = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f95781d.mo95016c(new C40323a(vVar));
    }
}
