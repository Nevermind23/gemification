package od1;

import ed1.C40737d;
import ed1.C40739f;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import id1.C41300a;
import java.util.concurrent.Callable;

/* renamed from: od1.u */
public final class C41848u extends C40762x {

    /* renamed from: d */
    final C40739f f98224d;

    /* renamed from: e */
    final Callable f98225e;

    /* renamed from: f */
    final Object f98226f;

    /* renamed from: od1.u$a */
    final class C41849a implements C40737d {

        /* renamed from: d */
        private final C40764z f98227d;

        C41849a(C40764z zVar) {
            this.f98227d = zVar;
        }

        public void onComplete() {
            Object obj;
            C41848u uVar = C41848u.this;
            Callable callable = uVar.f98225e;
            if (callable != null) {
                try {
                    obj = callable.call();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    this.f98227d.onError(th);
                    return;
                }
            } else {
                obj = uVar.f98226f;
            }
            if (obj == null) {
                this.f98227d.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f98227d.mo95096a(obj);
            }
        }

        public void onError(Throwable th) {
            this.f98227d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            this.f98227d.onSubscribe(bVar);
        }
    }

    public C41848u(C40739f fVar, Callable callable, Object obj) {
        this.f98224d = fVar;
        this.f98226f = obj;
        this.f98225e = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        this.f98224d.mo94894a(new C41849a(zVar));
    }
}
