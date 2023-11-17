package od1;

import ae1.C40293a;
import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import hd1.C41205b;
import id1.C41300a;
import jd1.C41394a;
import jd1.C41399f;
import kd1.C41498c;
import kd1.C41499d;
import p469io.reactivex.exceptions.CompositeException;

/* renamed from: od1.q */
public final class C41840q extends C40734b {

    /* renamed from: d */
    final C40739f f98201d;

    /* renamed from: e */
    final C41399f f98202e;

    /* renamed from: f */
    final C41399f f98203f;

    /* renamed from: g */
    final C41394a f98204g;

    /* renamed from: h */
    final C41394a f98205h;

    /* renamed from: i */
    final C41394a f98206i;

    /* renamed from: j */
    final C41394a f98207j;

    /* renamed from: od1.q$a */
    final class C41841a implements C40737d, C41205b {

        /* renamed from: d */
        final C40737d f98208d;

        /* renamed from: e */
        C41205b f98209e;

        C41841a(C40737d dVar) {
            this.f98208d = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo96640a() {
            try {
                C41840q.this.f98206i.run();
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
        }

        public void dispose() {
            try {
                C41840q.this.f98207j.run();
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C40293a.m116722s(th);
            }
            this.f98209e.dispose();
        }

        public boolean isDisposed() {
            return this.f98209e.isDisposed();
        }

        public void onComplete() {
            if (this.f98209e != C41498c.DISPOSED) {
                try {
                    C41840q.this.f98204g.run();
                    C41840q.this.f98205h.run();
                    this.f98208d.onComplete();
                    mo96640a();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    this.f98208d.onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f98209e == C41498c.DISPOSED) {
                C40293a.m116722s(th);
                return;
            }
            try {
                C41840q.this.f98203f.accept(th);
                C41840q.this.f98205h.run();
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                th = new CompositeException(th, th2);
            }
            this.f98208d.onError(th);
            mo96640a();
        }

        public void onSubscribe(C41205b bVar) {
            try {
                C41840q.this.f98202e.accept(bVar);
                if (C41498c.m120378l(this.f98209e, bVar)) {
                    this.f98209e = bVar;
                    this.f98208d.onSubscribe(this);
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                bVar.dispose();
                this.f98209e = C41498c.DISPOSED;
                C41499d.m120382h(th, this.f98208d);
            }
        }
    }

    public C41840q(C40739f fVar, C41399f fVar2, C41399f fVar3, C41394a aVar, C41394a aVar2, C41394a aVar3, C41394a aVar4) {
        this.f98201d = fVar;
        this.f98202e = fVar2;
        this.f98203f = fVar3;
        this.f98204g = aVar;
        this.f98205h = aVar2;
        this.f98206i = aVar3;
        this.f98207j = aVar4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        this.f98201d.mo94894a(new C41841a(dVar));
    }
}
