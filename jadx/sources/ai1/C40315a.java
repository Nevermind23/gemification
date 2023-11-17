package ai1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import p469io.reactivex.exceptions.CompositeException;
import retrofit2.adapter.rxjava2.HttpException;
import zh1.C43510v;

/* renamed from: ai1.a */
final class C40315a extends C40749p {

    /* renamed from: d */
    private final C40749p f95768d;

    /* renamed from: ai1.a$a */
    private static class C40316a implements C40756v {

        /* renamed from: d */
        private final C40756v f95769d;

        /* renamed from: e */
        private boolean f95770e;

        C40316a(C40756v vVar) {
            this.f95769d = vVar;
        }

        /* renamed from: a */
        public void onNext(C43510v vVar) {
            if (vVar.mo102216d()) {
                this.f95769d.onNext(vVar.mo102214a());
                return;
            }
            this.f95770e = true;
            HttpException httpException = new HttpException(vVar);
            try {
                this.f95769d.onError(httpException);
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(new CompositeException(httpException, th));
            }
        }

        public void onComplete() {
            if (!this.f95770e) {
                this.f95769d.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.f95770e) {
                this.f95769d.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C40293a.m116722s(assertionError);
        }

        public void onSubscribe(C41205b bVar) {
            this.f95769d.onSubscribe(bVar);
        }
    }

    C40315a(C40749p pVar) {
        this.f95768d = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f95768d.mo95016c(new C40316a(vVar));
    }
}
