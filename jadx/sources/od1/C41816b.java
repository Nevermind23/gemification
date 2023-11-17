package od1;

import ed1.C40734b;
import ed1.C40737d;
import ed1.C40739f;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicInteger;
import kd1.C41502g;

/* renamed from: od1.b */
public final class C41816b extends C40734b {

    /* renamed from: d */
    final C40739f[] f98155d;

    /* renamed from: od1.b$a */
    static final class C41817a extends AtomicInteger implements C40737d {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: d */
        final C40737d f98156d;

        /* renamed from: e */
        final C40739f[] f98157e;

        /* renamed from: f */
        int f98158f;

        /* renamed from: g */
        final C41502g f98159g = new C41502g();

        C41817a(C40737d dVar, C40739f[] fVarArr) {
            this.f98156d = dVar;
            this.f98157e = fVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo96634a() {
            if (!this.f98159g.isDisposed() && getAndIncrement() == 0) {
                C40739f[] fVarArr = this.f98157e;
                while (!this.f98159g.isDisposed()) {
                    int i = this.f98158f;
                    this.f98158f = i + 1;
                    if (i == fVarArr.length) {
                        this.f98156d.onComplete();
                        return;
                    }
                    fVarArr[i].mo94894a(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void onComplete() {
            mo96634a();
        }

        public void onError(Throwable th) {
            this.f98156d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            this.f98159g.mo96265a(bVar);
        }
    }

    public C41816b(C40739f[] fVarArr) {
        this.f98155d = fVarArr;
    }

    /* renamed from: H */
    public void mo94889H(C40737d dVar) {
        C41817a aVar = new C41817a(dVar, this.f98155d);
        dVar.onSubscribe(aVar.f98159g);
        aVar.mo96634a();
    }
}
