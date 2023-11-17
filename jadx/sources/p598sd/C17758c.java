package p598sd;

import java.util.Iterator;
import java.util.concurrent.Callable;
import p337z7.C9215a;
import p337z7.C9219c;
import p337z7.C9231i;
import p337z7.Task;
import p598sd.C17749a;

/* renamed from: sd.c */
public class C17758c extends C17749a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C17757b f49550f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C17757b f49551g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f49552h = 0;

    /* renamed from: sd.c$a */
    class C17759a implements C9219c {

        /* renamed from: a */
        final /* synthetic */ int f49553a;

        C17759a(int i) {
            this.f49553a = i;
        }

        public void onComplete(Task task) {
            if (this.f49553a == C17758c.this.f49552h) {
                C17758c cVar = C17758c.this;
                C17757b unused = cVar.f49551g = cVar.f49550f;
            }
        }
    }

    /* renamed from: sd.c$b */
    class C17760b implements Callable {

        /* renamed from: d */
        final /* synthetic */ C17757b f49555d;

        /* renamed from: e */
        final /* synthetic */ String f49556e;

        /* renamed from: f */
        final /* synthetic */ C17757b f49557f;

        /* renamed from: g */
        final /* synthetic */ Callable f49558g;

        /* renamed from: h */
        final /* synthetic */ boolean f49559h;

        /* renamed from: sd.c$b$a */
        class C17761a implements C9215a {
            C17761a() {
            }

            /* renamed from: b */
            public Task mo17447a(Task task) {
                if (task.mo24873r() || C17760b.this.f49559h) {
                    C17760b bVar = C17760b.this;
                    C17757b unused = C17758c.this.f49550f = bVar.f49557f;
                }
                return task;
            }
        }

        C17760b(C17757b bVar, String str, C17757b bVar2, Callable callable, boolean z) {
            this.f49555d = bVar;
            this.f49556e = str;
            this.f49557f = bVar2;
            this.f49558g = callable;
            this.f49559h = z;
        }

        /* renamed from: a */
        public Task call() {
            if (C17758c.this.mo45342s() != this.f49555d) {
                C17749a.f49525e.mo42880h(this.f49556e.toUpperCase(), "- State mismatch, aborting. current:", C17758c.this.mo45342s(), "from:", this.f49555d, "to:", this.f49557f);
                return C9231i.m34111e();
            }
            return ((Task) this.f49558g.call()).mo24867l(C17758c.this.f49526a.mo43521a(this.f49556e).mo46319e(), new C17761a());
        }
    }

    /* renamed from: sd.c$c */
    class C17762c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C17757b f49562d;

        /* renamed from: e */
        final /* synthetic */ Runnable f49563e;

        C17762c(C17757b bVar, Runnable runnable) {
            this.f49562d = bVar;
            this.f49563e = runnable;
        }

        public void run() {
            if (C17758c.this.mo45342s().mo45341a(this.f49562d)) {
                this.f49563e.run();
            }
        }
    }

    /* renamed from: sd.c$d */
    class C17763d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C17757b f49565d;

        /* renamed from: e */
        final /* synthetic */ Runnable f49566e;

        C17763d(C17757b bVar, Runnable runnable) {
            this.f49565d = bVar;
            this.f49566e = runnable;
        }

        public void run() {
            if (C17758c.this.mo45342s().mo45341a(this.f49565d)) {
                this.f49566e.run();
            }
        }
    }

    public C17758c(C17749a.C17755e eVar) {
        super(eVar);
        C17757b bVar = C17757b.OFF;
        this.f49550f = bVar;
        this.f49551g = bVar;
    }

    /* renamed from: s */
    public C17757b mo45342s() {
        return this.f49550f;
    }

    /* renamed from: t */
    public C17757b mo45343t() {
        return this.f49551g;
    }

    /* renamed from: u */
    public boolean mo45344u() {
        synchronized (this.f49529d) {
            Iterator it = this.f49527b.iterator();
            while (it.hasNext()) {
                C17749a.C17756f fVar = (C17749a.C17756f) it.next();
                if ((fVar.f49539a.contains(" >> ") || fVar.f49539a.contains(" << ")) && !fVar.f49540b.mo24883a().mo24872q()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: v */
    public Task mo45345v(C17757b bVar, C17757b bVar2, boolean z, Callable callable) {
        String str;
        int i = this.f49552h + 1;
        this.f49552h = i;
        this.f49551g = bVar2;
        boolean z2 = !bVar2.mo45341a(bVar);
        if (z2) {
            str = bVar.name() + " << " + bVar2.name();
        } else {
            str = bVar.name() + " >> " + bVar2.name();
        }
        return mo45333j(str, z, new C17760b(bVar, str, bVar2, callable, z2)).mo24858c(new C17759a(i));
    }

    /* renamed from: w */
    public Task mo45346w(String str, C17757b bVar, Runnable runnable) {
        return mo45332i(str, true, new C17762c(bVar, runnable));
    }

    /* renamed from: x */
    public void mo45347x(String str, C17757b bVar, long j, Runnable runnable) {
        mo45334k(str, true, j, new C17763d(bVar, runnable));
    }
}
