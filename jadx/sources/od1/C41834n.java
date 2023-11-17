package od1;

import ae1.C40293a;
import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import hd1.C41204a;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicInteger;
import yd1.C43357b;

/* renamed from: od1.n */
public final class C41834n extends C40734b {

    /* renamed from: d */
    final C40739f[] f98187d;

    /* renamed from: od1.n$a */
    static final class C41835a implements C40737d {

        /* renamed from: d */
        final C40737d f98188d;

        /* renamed from: e */
        final C41204a f98189e;

        /* renamed from: f */
        final C43357b f98190f;

        /* renamed from: g */
        final AtomicInteger f98191g;

        C41835a(C40737d dVar, C41204a aVar, C43357b bVar, AtomicInteger atomicInteger) {
            this.f98188d = dVar;
            this.f98189e = aVar;
            this.f98190f = bVar;
            this.f98191g = atomicInteger;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo96638a() {
            if (this.f98191g.decrementAndGet() == 0) {
                Throwable b = this.f98190f.mo102035b();
                if (b == null) {
                    this.f98188d.onComplete();
                } else {
                    this.f98188d.onError(b);
                }
            }
        }

        public void onComplete() {
            mo96638a();
        }

        public void onError(Throwable th) {
            if (this.f98190f.mo102034a(th)) {
                mo96638a();
            } else {
                C40293a.m116722s(th);
            }
        }

        public void onSubscribe(C41205b bVar) {
            this.f98189e.mo95660b(bVar);
        }
    }

    public C41834n(C40739f[] fVarArr) {
        this.f98187d = fVarArr;
    }

    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C41204a aVar = new C41204a();
        AtomicInteger atomicInteger = new AtomicInteger(this.f98187d.length + 1);
        C43357b bVar = new C43357b();
        dVar.onSubscribe(aVar);
        C40739f[] fVarArr = this.f98187d;
        int length = fVarArr.length;
        int i = 0;
        while (i < length) {
            C40739f fVar = fVarArr[i];
            if (!aVar.isDisposed()) {
                if (fVar == null) {
                    bVar.mo102034a(new NullPointerException("A completable source is null"));
                    atomicInteger.decrementAndGet();
                } else {
                    fVar.mo94894a(new C41835a(dVar, aVar, bVar, atomicInteger));
                }
                i++;
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable b = bVar.mo102035b();
            if (b == null) {
                dVar.onComplete();
            } else {
                dVar.onError(b);
            }
        }
    }
}
