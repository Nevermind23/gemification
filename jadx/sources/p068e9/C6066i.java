package p068e9;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p337z7.C9215a;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: e9.i */
public class C6066i {

    /* renamed from: a */
    private final Executor f18866a;

    /* renamed from: b */
    private Task f18867b = C9231i.m34113g((Object) null);

    /* renamed from: c */
    private final Object f18868c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ThreadLocal f18869d = new ThreadLocal();

    /* renamed from: e9.i$a */
    class C6067a implements Runnable {
        C6067a() {
        }

        public void run() {
            C6066i.this.f18869d.set(Boolean.TRUE);
        }
    }

    /* renamed from: e9.i$b */
    class C6068b implements Callable {

        /* renamed from: d */
        final /* synthetic */ Runnable f18871d;

        C6068b(Runnable runnable) {
            this.f18871d = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f18871d.run();
            return null;
        }
    }

    /* renamed from: e9.i$c */
    class C6069c implements C9215a {

        /* renamed from: a */
        final /* synthetic */ Callable f18873a;

        C6069c(Callable callable) {
            this.f18873a = callable;
        }

        /* renamed from: a */
        public Object mo17447a(Task task) {
            return this.f18873a.call();
        }
    }

    /* renamed from: e9.i$d */
    class C6070d implements C9215a {
        C6070d() {
        }

        /* renamed from: b */
        public Void mo17447a(Task task) {
            return null;
        }
    }

    public C6066i(Executor executor) {
        this.f18866a = executor;
        executor.execute(new C6067a());
    }

    /* renamed from: d */
    private Task m24239d(Task task) {
        return task.mo24865j(this.f18866a, new C6070d());
    }

    /* renamed from: e */
    private boolean m24240e() {
        return Boolean.TRUE.equals(this.f18869d.get());
    }

    /* renamed from: f */
    private C9215a m24241f(Callable callable) {
        return new C6069c(callable);
    }

    /* renamed from: b */
    public void mo19555b() {
        if (!m24240e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    /* renamed from: c */
    public Executor mo19556c() {
        return this.f18866a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Task mo19557g(Runnable runnable) {
        return mo19558h(new C6068b(runnable));
    }

    /* renamed from: h */
    public Task mo19558h(Callable callable) {
        Task j;
        synchronized (this.f18868c) {
            j = this.f18867b.mo24865j(this.f18866a, m24241f(callable));
            this.f18867b = m24239d(j);
        }
        return j;
    }

    /* renamed from: i */
    public Task mo19559i(Callable callable) {
        Task l;
        synchronized (this.f18868c) {
            l = this.f18867b.mo24867l(this.f18866a, m24241f(callable));
            this.f18867b = m24239d(l);
        }
        return l;
    }
}
