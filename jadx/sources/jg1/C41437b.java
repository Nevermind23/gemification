package jg1;

import java.util.logging.Level;

/* renamed from: jg1.b */
final class C41437b implements Runnable, C41451k {

    /* renamed from: d */
    private final C41450j f97508d = new C41450j();

    /* renamed from: e */
    private final C41438c f97509e;

    /* renamed from: f */
    private volatile boolean f97510f;

    C41437b(C41438c cVar) {
        this.f97509e = cVar;
    }

    /* renamed from: a */
    public void mo96175a(C41457p pVar, Object obj) {
        C41449i a = C41449i.m120266a(pVar, obj);
        synchronized (this) {
            this.f97508d.mo96197a(a);
            if (!this.f97510f) {
                this.f97510f = true;
                this.f97509e.mo96178d().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                C41449i c = this.f97508d.mo96199c(1000);
                if (c == null) {
                    synchronized (this) {
                        c = this.f97508d.mo96198b();
                        if (c == null) {
                            this.f97510f = false;
                            this.f97510f = false;
                            return;
                        }
                    }
                }
                this.f97509e.mo96181h(c);
            } catch (InterruptedException e) {
                try {
                    C41444f e2 = this.f97509e.mo96179e();
                    Level level = Level.WARNING;
                    e2.mo96193a(level, Thread.currentThread().getName() + " was interruppted", e);
                    return;
                } finally {
                    this.f97510f = false;
                }
            }
        }
    }
}
