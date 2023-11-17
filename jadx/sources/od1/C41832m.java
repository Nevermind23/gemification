package od1;

import ae1.C40293a;
import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import hd1.C41204a;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: od1.m */
public final class C41832m extends C40734b {

    /* renamed from: d */
    final C40739f[] f98183d;

    /* renamed from: od1.m$a */
    static final class C41833a extends AtomicInteger implements C40737d {
        private static final long serialVersionUID = -8360547806504310570L;

        /* renamed from: d */
        final C40737d f98184d;

        /* renamed from: e */
        final AtomicBoolean f98185e;

        /* renamed from: f */
        final C41204a f98186f;

        C41833a(C40737d dVar, AtomicBoolean atomicBoolean, C41204a aVar, int i) {
            this.f98184d = dVar;
            this.f98185e = atomicBoolean;
            this.f98186f = aVar;
            lazySet(i);
        }

        public void onComplete() {
            if (decrementAndGet() == 0 && this.f98185e.compareAndSet(false, true)) {
                this.f98184d.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f98186f.dispose();
            if (this.f98185e.compareAndSet(false, true)) {
                this.f98184d.onError(th);
            } else {
                C40293a.m116722s(th);
            }
        }

        public void onSubscribe(C41205b bVar) {
            this.f98186f.mo95660b(bVar);
        }
    }

    public C41832m(C40739f[] fVarArr) {
        this.f98183d = fVarArr;
    }

    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C41204a aVar = new C41204a();
        C41833a aVar2 = new C41833a(dVar, new AtomicBoolean(), aVar, this.f98183d.length + 1);
        dVar.onSubscribe(aVar);
        C40739f[] fVarArr = this.f98183d;
        int length = fVarArr.length;
        int i = 0;
        while (i < length) {
            C40739f fVar = fVarArr[i];
            if (!aVar.isDisposed()) {
                if (fVar == null) {
                    aVar.dispose();
                    aVar2.onError(new NullPointerException("A completable source is null"));
                    return;
                }
                fVar.mo94894a(aVar2);
                i++;
            } else {
                return;
            }
        }
        aVar2.onComplete();
    }
}
