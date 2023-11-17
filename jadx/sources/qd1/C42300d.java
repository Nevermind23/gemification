package qd1;

import ed1.C40741h;
import ed1.C40746m;
import ed1.C40748o;
import hd1.C41205b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41502g;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43259d;
import yd1.C43358c;
import yd1.C43367k;

/* renamed from: qd1.d */
public final class C42300d extends C40741h {

    /* renamed from: e */
    final C40748o[] f99478e;

    /* renamed from: qd1.d$a */
    static final class C42301a extends AtomicInteger implements C40746m, C43108c {
        private static final long serialVersionUID = 3520831347801429610L;

        /* renamed from: d */
        final C43107b f99479d;

        /* renamed from: e */
        final AtomicLong f99480e = new AtomicLong();

        /* renamed from: f */
        final AtomicReference f99481f = new AtomicReference(C43367k.COMPLETE);

        /* renamed from: g */
        final C41502g f99482g = new C41502g();

        /* renamed from: h */
        final C40748o[] f99483h;

        /* renamed from: i */
        int f99484i;

        /* renamed from: j */
        long f99485j;

        C42301a(C43107b bVar, C40748o[] oVarArr) {
            this.f99479d = bVar;
            this.f99483h = oVarArr;
        }

        /* renamed from: a */
        public void mo94967a(Object obj) {
            this.f99481f.lazySet(obj);
            mo97774b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97774b() {
            if (getAndIncrement() == 0) {
                AtomicReference atomicReference = this.f99481f;
                C43107b bVar = this.f99479d;
                C41502g gVar = this.f99482g;
                while (!gVar.isDisposed()) {
                    Object obj = atomicReference.get();
                    if (obj != null) {
                        boolean z = true;
                        if (obj != C43367k.COMPLETE) {
                            long j = this.f99485j;
                            if (j != this.f99480e.get()) {
                                this.f99485j = j + 1;
                                atomicReference.lazySet((Object) null);
                                bVar.onNext(obj);
                            } else {
                                z = false;
                            }
                        } else {
                            atomicReference.lazySet((Object) null);
                        }
                        if (z && !gVar.isDisposed()) {
                            int i = this.f99484i;
                            C40748o[] oVarArr = this.f99483h;
                            if (i == oVarArr.length) {
                                bVar.onComplete();
                                return;
                            } else {
                                this.f99484i = i + 1;
                                oVarArr[i].mo94947c(this);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                atomicReference.lazySet((Object) null);
            }
        }

        public void cancel() {
            this.f99482g.dispose();
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (C43259d.m124223g(j)) {
                C43358c.m124395a(this.f99480e, j);
                mo97774b();
            }
        }

        public void onComplete() {
            this.f99481f.lazySet(C43367k.COMPLETE);
            mo97774b();
        }

        public void onError(Throwable th) {
            this.f99479d.onError(th);
        }

        public void onSubscribe(C41205b bVar) {
            this.f99482g.mo96265a(bVar);
        }
    }

    public C42300d(C40748o[] oVarArr) {
        this.f99478e = oVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        C42301a aVar = new C42301a(bVar, this.f99478e);
        bVar.mo27070b(aVar);
        aVar.mo97774b();
    }
}
