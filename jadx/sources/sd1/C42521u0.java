package sd1;

import ed1.C40754t;
import ed1.C40756v;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kd1.C41498c;
import p469io.reactivex.observers.C41381b;

/* renamed from: sd1.u0 */
public final class C42521u0 extends C42399a {

    /* renamed from: e */
    final long f100078e;

    /* renamed from: f */
    final TimeUnit f100079f;

    /* renamed from: g */
    final C40757w f100080g;

    /* renamed from: h */
    final boolean f100081h;

    /* renamed from: sd1.u0$a */
    static final class C42522a extends C42524c {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: j */
        final AtomicInteger f100082j = new AtomicInteger(1);

        C42522a(C40756v vVar, long j, TimeUnit timeUnit, C40757w wVar) {
            super(vVar, j, timeUnit, wVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97967b() {
            mo97971c();
            if (this.f100082j.decrementAndGet() == 0) {
                this.f100083d.onComplete();
            }
        }

        public void run() {
            if (this.f100082j.incrementAndGet() == 2) {
                mo97971c();
                if (this.f100082j.decrementAndGet() == 0) {
                    this.f100083d.onComplete();
                }
            }
        }
    }

    /* renamed from: sd1.u0$b */
    static final class C42523b extends C42524c {
        private static final long serialVersionUID = -7139995637533111443L;

        C42523b(C40756v vVar, long j, TimeUnit timeUnit, C40757w wVar) {
            super(vVar, j, timeUnit, wVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97967b() {
            this.f100083d.onComplete();
        }

        public void run() {
            mo97971c();
        }
    }

    /* renamed from: sd1.u0$c */
    static abstract class C42524c extends AtomicReference implements C40756v, C41205b, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: d */
        final C40756v f100083d;

        /* renamed from: e */
        final long f100084e;

        /* renamed from: f */
        final TimeUnit f100085f;

        /* renamed from: g */
        final C40757w f100086g;

        /* renamed from: h */
        final AtomicReference f100087h = new AtomicReference();

        /* renamed from: i */
        C41205b f100088i;

        C42524c(C40756v vVar, long j, TimeUnit timeUnit, C40757w wVar) {
            this.f100083d = vVar;
            this.f100084e = j;
            this.f100085f = timeUnit;
            this.f100086g = wVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97970a() {
            C41498c.m120371a(this.f100087h);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo97967b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97971c() {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.f100083d.onNext(andSet);
            }
        }

        public void dispose() {
            mo97970a();
            this.f100088i.dispose();
        }

        public boolean isDisposed() {
            return this.f100088i.isDisposed();
        }

        public void onComplete() {
            mo97970a();
            mo97967b();
        }

        public void onError(Throwable th) {
            mo97970a();
            this.f100083d.onError(th);
        }

        public void onNext(Object obj) {
            lazySet(obj);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100088i, bVar)) {
                this.f100088i = bVar;
                this.f100083d.onSubscribe(this);
                C40757w wVar = this.f100086g;
                long j = this.f100084e;
                C41498c.m120373c(this.f100087h, wVar.mo95054e(this, j, j, this.f100085f));
            }
        }
    }

    public C42521u0(C40754t tVar, long j, TimeUnit timeUnit, C40757w wVar, boolean z) {
        super(tVar);
        this.f100078e = j;
        this.f100079f = timeUnit;
        this.f100080g = wVar;
        this.f100081h = z;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C41381b bVar = new C41381b(vVar);
        if (this.f100081h) {
            this.f99678d.mo95016c(new C42522a(bVar, this.f100078e, this.f100079f, this.f100080g));
        } else {
            this.f99678d.mo95016c(new C42523b(bVar, this.f100078e, this.f100079f, this.f100080g));
        }
    }
}
