package sd1;

import ed1.C40754t;
import ed1.C40756v;
import ed1.C40757w;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import kd1.C41498c;
import p469io.reactivex.observers.C41381b;

/* renamed from: sd1.j */
public final class C42458j extends C42399a {

    /* renamed from: e */
    final long f99873e;

    /* renamed from: f */
    final TimeUnit f99874f;

    /* renamed from: g */
    final C40757w f99875g;

    /* renamed from: h */
    final boolean f99876h;

    /* renamed from: sd1.j$a */
    static final class C42459a implements C40756v, C41205b {

        /* renamed from: d */
        final C40756v f99877d;

        /* renamed from: e */
        final long f99878e;

        /* renamed from: f */
        final TimeUnit f99879f;

        /* renamed from: g */
        final C40757w.C40760c f99880g;

        /* renamed from: h */
        final boolean f99881h;

        /* renamed from: i */
        C41205b f99882i;

        /* renamed from: sd1.j$a$a */
        final class C42460a implements Runnable {
            C42460a() {
            }

            public void run() {
                try {
                    C42459a.this.f99877d.onComplete();
                } finally {
                    C42459a.this.f99880g.dispose();
                }
            }
        }

        /* renamed from: sd1.j$a$b */
        final class C42461b implements Runnable {

            /* renamed from: d */
            private final Throwable f99884d;

            C42461b(Throwable th) {
                this.f99884d = th;
            }

            public void run() {
                try {
                    C42459a.this.f99877d.onError(this.f99884d);
                } finally {
                    C42459a.this.f99880g.dispose();
                }
            }
        }

        /* renamed from: sd1.j$a$c */
        final class C42462c implements Runnable {

            /* renamed from: d */
            private final Object f99886d;

            C42462c(Object obj) {
                this.f99886d = obj;
            }

            public void run() {
                C42459a.this.f99877d.onNext(this.f99886d);
            }
        }

        C42459a(C40756v vVar, long j, TimeUnit timeUnit, C40757w.C40760c cVar, boolean z) {
            this.f99877d = vVar;
            this.f99878e = j;
            this.f99879f = timeUnit;
            this.f99880g = cVar;
            this.f99881h = z;
        }

        public void dispose() {
            this.f99882i.dispose();
            this.f99880g.dispose();
        }

        public boolean isDisposed() {
            return this.f99880g.isDisposed();
        }

        public void onComplete() {
            this.f99880g.mo95059c(new C42460a(), this.f99878e, this.f99879f);
        }

        public void onError(Throwable th) {
            this.f99880g.mo95059c(new C42461b(th), this.f99881h ? this.f99878e : 0, this.f99879f);
        }

        public void onNext(Object obj) {
            this.f99880g.mo95059c(new C42462c(obj), this.f99878e, this.f99879f);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99882i, bVar)) {
                this.f99882i = bVar;
                this.f99877d.onSubscribe(this);
            }
        }
    }

    public C42458j(C40754t tVar, long j, TimeUnit timeUnit, C40757w wVar, boolean z) {
        super(tVar);
        this.f99873e = j;
        this.f99874f = timeUnit;
        this.f99875g = wVar;
        this.f99876h = z;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C41381b bVar;
        if (this.f99876h) {
            bVar = vVar;
        } else {
            bVar = new C41381b(vVar);
        }
        this.f99678d.mo95016c(new C42459a(bVar, this.f99873e, this.f99874f, this.f99875g.mo95051b(), this.f99876h));
    }
}
