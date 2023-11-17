package td1;

import ed1.C40735b0;
import ed1.C40757w;
import ed1.C40762x;
import ed1.C40764z;
import hd1.C41205b;
import java.util.concurrent.TimeUnit;
import kd1.C41502g;

/* renamed from: td1.c */
public final class C42942c extends C40762x {

    /* renamed from: d */
    final C40735b0 f100227d;

    /* renamed from: e */
    final long f100228e;

    /* renamed from: f */
    final TimeUnit f100229f;

    /* renamed from: g */
    final C40757w f100230g;

    /* renamed from: h */
    final boolean f100231h;

    /* renamed from: td1.c$a */
    final class C42943a implements C40764z {

        /* renamed from: d */
        private final C41502g f100232d;

        /* renamed from: e */
        final C40764z f100233e;

        /* renamed from: td1.c$a$a */
        final class C42944a implements Runnable {

            /* renamed from: d */
            private final Throwable f100235d;

            C42944a(Throwable th) {
                this.f100235d = th;
            }

            public void run() {
                C42943a.this.f100233e.onError(this.f100235d);
            }
        }

        /* renamed from: td1.c$a$b */
        final class C42945b implements Runnable {

            /* renamed from: d */
            private final Object f100237d;

            C42945b(Object obj) {
                this.f100237d = obj;
            }

            public void run() {
                C42943a.this.f100233e.mo95096a(this.f100237d);
            }
        }

        C42943a(C41502g gVar, C40764z zVar) {
            this.f100232d = gVar;
            this.f100233e = zVar;
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            C41502g gVar = this.f100232d;
            C40757w wVar = C42942c.this.f100230g;
            C42945b bVar = new C42945b(obj);
            C42942c cVar = C42942c.this;
            gVar.mo96265a(wVar.mo95053d(bVar, cVar.f100228e, cVar.f100229f));
        }

        public void onError(Throwable th) {
            C41502g gVar = this.f100232d;
            C40757w wVar = C42942c.this.f100230g;
            C42944a aVar = new C42944a(th);
            C42942c cVar = C42942c.this;
            gVar.mo96265a(wVar.mo95053d(aVar, cVar.f100231h ? cVar.f100228e : 0, cVar.f100229f));
        }

        public void onSubscribe(C41205b bVar) {
            this.f100232d.mo96265a(bVar);
        }
    }

    public C42942c(C40735b0 b0Var, long j, TimeUnit timeUnit, C40757w wVar, boolean z) {
        this.f100227d = b0Var;
        this.f100228e = j;
        this.f100229f = timeUnit;
        this.f100230g = wVar;
        this.f100231h = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo95071J(C40764z zVar) {
        C41502g gVar = new C41502g();
        zVar.onSubscribe(gVar);
        this.f100227d.mo94907c(new C42943a(gVar, zVar));
    }
}
