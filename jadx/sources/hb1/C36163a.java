package hb1;

import ed1.C40753s;
import ed1.C40756v;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C41536l;
import p217q2.C7843j;
import p469io.reactivex.observers.C41380a;

/* renamed from: hb1.a */
public final class C36163a implements C40753s {

    /* renamed from: hb1.a$a */
    public static final class C36164a extends C41380a {

        /* renamed from: d */
        private final AtomicBoolean f87352d = new AtomicBoolean(false);

        /* renamed from: e */
        final /* synthetic */ C40756v f87353e;

        C36164a(C40756v vVar) {
            this.f87353e = vVar;
        }

        /* renamed from: a */
        public void onNext(C7843j jVar) {
            C41536l.m120489i(jVar, "response");
            if (!isDisposed()) {
                try {
                    C36165b.m107567c(jVar);
                    this.f87353e.onNext(jVar);
                    this.f87353e.onComplete();
                } catch (Throwable th) {
                    this.f87352d.set(true);
                    this.f87353e.onError(th);
                }
            }
        }

        public void onComplete() {
            if (!isDisposed() && !this.f87352d.getAndSet(false)) {
                this.f87353e.onComplete();
            }
        }

        public void onError(Throwable th) {
            C41536l.m120489i(th, "e");
            C41300a.m119661b(th);
            if (!isDisposed()) {
                try {
                    C36165b.m107568d(th);
                } catch (Throwable th2) {
                    this.f87353e.onError(th2);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onStart() {
            if (!isDisposed()) {
                this.f87353e.onSubscribe(this);
            }
        }
    }

    /* renamed from: a */
    public C40756v mo88919a(C40756v vVar) {
        C41536l.m120489i(vVar, "subscriber");
        return new C36164a(vVar);
    }
}
