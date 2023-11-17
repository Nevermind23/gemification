package sd1;

import ae1.C40293a;
import ed1.C40749p;
import ed1.C40751q;
import ed1.C40752r;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41398e;
import kd1.C41496a;
import kd1.C41498c;

/* renamed from: sd1.g */
public final class C42437g extends C40749p {

    /* renamed from: d */
    final C40752r f99815d;

    /* renamed from: sd1.g$a */
    static final class C42438a extends AtomicReference implements C40751q, C41205b {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: d */
        final C40756v f99816d;

        C42438a(C40756v vVar) {
            this.f99816d = vVar;
        }

        /* renamed from: a */
        public void mo95047a(C41205b bVar) {
            C41498c.m120375f(this, bVar);
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo95048b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f99816d.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        /* renamed from: c */
        public void mo95049c(C41398e eVar) {
            mo95047a(new C41496a(eVar));
        }

        public void dispose() {
            C41498c.m120371a(this);
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) get());
        }

        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.f99816d.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public void onError(Throwable th) {
            if (!mo95048b(th)) {
                C40293a.m116722s(th);
            }
        }

        public void onNext(Object obj) {
            if (obj == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!isDisposed()) {
                this.f99816d.onNext(obj);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C42438a.class.getSimpleName(), super.toString()});
        }
    }

    public C42437g(C40752r rVar) {
        this.f99815d = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42438a aVar = new C42438a(vVar);
        vVar.onSubscribe(aVar);
        try {
            this.f99815d.mo20502a(aVar);
        } catch (Throwable th) {
            C41300a.m119661b(th);
            aVar.onError(th);
        }
    }
}
