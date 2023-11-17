package p598sd;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import p337z7.C9219c;
import p337z7.C9227g;
import p337z7.C9231i;
import p337z7.Task;
import p458id.C15600b;
import p651wd.C18516k;

/* renamed from: sd.a */
public abstract class C17749a {

    /* renamed from: e */
    protected static final C15600b f49525e = C15600b.m56349a(C17749a.class.getSimpleName());

    /* renamed from: a */
    protected final C17755e f49526a;

    /* renamed from: b */
    protected final ArrayDeque f49527b = new ArrayDeque();

    /* renamed from: c */
    protected boolean f49528c = false;

    /* renamed from: d */
    protected final Object f49529d = new Object();

    /* renamed from: sd.a$a */
    class C17750a implements Callable {

        /* renamed from: d */
        final /* synthetic */ Runnable f49530d;

        C17750a(Runnable runnable) {
            this.f49530d = runnable;
        }

        /* renamed from: a */
        public Task call() {
            this.f49530d.run();
            return C9231i.m34113g((Object) null);
        }
    }

    /* renamed from: sd.a$b */
    class C17751b implements Runnable {
        C17751b() {
        }

        public void run() {
            C17756f fVar;
            synchronized (C17749a.this.f49529d) {
                fVar = null;
                if (!C17749a.this.f49528c) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = C17749a.this.f49527b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C17756f fVar2 = (C17756f) it.next();
                        if (fVar2.f49543e <= currentTimeMillis) {
                            fVar = fVar2;
                            break;
                        }
                    }
                    if (fVar != null) {
                        C17749a.this.f49528c = true;
                    }
                }
            }
            if (fVar != null) {
                C17749a.this.m61415d(fVar);
            }
        }
    }

    /* renamed from: sd.a$c */
    class C17752c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C17756f f49533d;

        /* renamed from: e */
        final /* synthetic */ C18516k f49534e;

        /* renamed from: sd.a$c$a */
        class C17753a implements C9219c {
            C17753a() {
            }

            public void onComplete(Task task) {
                Exception m = task.mo24868m();
                if (m != null) {
                    C17749a.f49525e.mo42880h(C17752c.this.f49533d.f49539a.toUpperCase(), "- Finished with ERROR.", m);
                    C17752c cVar = C17752c.this;
                    C17756f fVar = cVar.f49533d;
                    if (fVar.f49542d) {
                        C17749a.this.f49526a.mo43522b(fVar.f49539a, m);
                    }
                    C17752c.this.f49533d.f49540b.mo24886d(m);
                } else if (task.mo24871p()) {
                    C17749a.f49525e.mo42878c(C17752c.this.f49533d.f49539a.toUpperCase(), "- Finished because ABORTED.");
                    C17752c.this.f49533d.f49540b.mo24886d(new CancellationException());
                } else {
                    C17749a.f49525e.mo42878c(C17752c.this.f49533d.f49539a.toUpperCase(), "- Finished.");
                    C17752c.this.f49533d.f49540b.mo24887e(task.mo24869n());
                }
                synchronized (C17749a.this.f49529d) {
                    C17752c cVar2 = C17752c.this;
                    C17749a.this.m61416e(cVar2.f49533d);
                }
            }
        }

        C17752c(C17756f fVar, C18516k kVar) {
            this.f49533d = fVar;
            this.f49534e = kVar;
        }

        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                r0 = 1
                r1 = 0
                r2 = 2
                id.b r3 = p598sd.C17749a.f49525e     // Catch:{ Exception -> 0x002d }
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x002d }
                sd.a$f r5 = r7.f49533d     // Catch:{ Exception -> 0x002d }
                java.lang.String r5 = r5.f49539a     // Catch:{ Exception -> 0x002d }
                java.lang.String r5 = r5.toUpperCase()     // Catch:{ Exception -> 0x002d }
                r4[r1] = r5     // Catch:{ Exception -> 0x002d }
                java.lang.String r5 = "- Executing."
                r4[r0] = r5     // Catch:{ Exception -> 0x002d }
                r3.mo42878c(r4)     // Catch:{ Exception -> 0x002d }
                sd.a$f r3 = r7.f49533d     // Catch:{ Exception -> 0x002d }
                java.util.concurrent.Callable r3 = r3.f49541c     // Catch:{ Exception -> 0x002d }
                java.lang.Object r3 = r3.call()     // Catch:{ Exception -> 0x002d }
                z7.Task r3 = (p337z7.Task) r3     // Catch:{ Exception -> 0x002d }
                wd.k r4 = r7.f49534e     // Catch:{ Exception -> 0x002d }
                sd.a$c$a r5 = new sd.a$c$a     // Catch:{ Exception -> 0x002d }
                r5.<init>()     // Catch:{ Exception -> 0x002d }
                p598sd.C17749a.m61417f(r3, r4, r5)     // Catch:{ Exception -> 0x002d }
                goto L_0x0069
            L_0x002d:
                r3 = move-exception
                id.b r4 = p598sd.C17749a.f49525e
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                sd.a$f r6 = r7.f49533d
                java.lang.String r6 = r6.f49539a
                java.lang.String r6 = r6.toUpperCase()
                r5[r1] = r6
                java.lang.String r1 = "- Finished with ERROR."
                r5[r0] = r1
                r5[r2] = r3
                r4.mo42878c(r5)
                sd.a$f r0 = r7.f49533d
                boolean r1 = r0.f49542d
                if (r1 == 0) goto L_0x0055
                sd.a r1 = p598sd.C17749a.this
                sd.a$e r1 = r1.f49526a
                java.lang.String r0 = r0.f49539a
                r1.mo43522b(r0, r3)
            L_0x0055:
                sd.a$f r0 = r7.f49533d
                z7.g r0 = r0.f49540b
                r0.mo24886d(r3)
                sd.a r0 = p598sd.C17749a.this
                java.lang.Object r0 = r0.f49529d
                monitor-enter(r0)
                sd.a r1 = p598sd.C17749a.this     // Catch:{ all -> 0x006a }
                sd.a$f r2 = r7.f49533d     // Catch:{ all -> 0x006a }
                r1.m61416e(r2)     // Catch:{ all -> 0x006a }
                monitor-exit(r0)     // Catch:{ all -> 0x006a }
            L_0x0069:
                return
            L_0x006a:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x006a }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p598sd.C17749a.C17752c.run():void");
        }
    }

    /* renamed from: sd.a$d */
    class C17754d implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C9219c f49537d;

        /* renamed from: e */
        final /* synthetic */ Task f49538e;

        C17754d(C9219c cVar, Task task) {
            this.f49537d = cVar;
            this.f49538e = task;
        }

        public void run() {
            this.f49537d.onComplete(this.f49538e);
        }
    }

    /* renamed from: sd.a$e */
    public interface C17755e {
        /* renamed from: a */
        C18516k mo43521a(String str);

        /* renamed from: b */
        void mo43522b(String str, Exception exc);
    }

    /* renamed from: sd.a$f */
    protected static class C17756f {

        /* renamed from: a */
        public final String f49539a;

        /* renamed from: b */
        public final C9227g f49540b;

        /* renamed from: c */
        public final Callable f49541c;

        /* renamed from: d */
        public final boolean f49542d;

        /* renamed from: e */
        public final long f49543e;

        /* synthetic */ C17756f(String str, Callable callable, boolean z, long j, C17750a aVar) {
            this(str, callable, z, j);
        }

        private C17756f(String str, Callable callable, boolean z, long j) {
            this.f49540b = new C9227g();
            this.f49539a = str;
            this.f49541c = callable;
            this.f49542d = z;
            this.f49543e = j;
        }
    }

    public C17749a(C17755e eVar) {
        this.f49526a = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m61415d(C17756f fVar) {
        C18516k a = this.f49526a.mo43521a(fVar.f49539a);
        a.mo46324j(new C17752c(fVar, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m61416e(C17756f fVar) {
        if (this.f49528c) {
            this.f49528c = false;
            this.f49527b.remove(fVar);
            m61419m(0);
            return;
        }
        throw new IllegalStateException("mJobRunning was not true after completing job=" + fVar.f49539a);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m61417f(Task task, C18516k kVar, C9219c cVar) {
        if (task.mo24872q()) {
            kVar.mo46324j(new C17754d(cVar, task));
        } else {
            task.mo24857b(kVar.mo46319e(), cVar);
        }
    }

    /* renamed from: l */
    private Task m61418l(String str, boolean z, long j, Callable callable) {
        long j2 = j;
        f49525e.mo42878c(str.toUpperCase(), "- Scheduling.");
        C17756f fVar = new C17756f(str, callable, z, System.currentTimeMillis() + j2, (C17750a) null);
        synchronized (this.f49529d) {
            this.f49527b.addLast(fVar);
            m61419m(j2);
        }
        return fVar.f49540b.mo24883a();
    }

    /* renamed from: m */
    private void m61419m(long j) {
        this.f49526a.mo43521a("_sync").mo46322h(j, new C17751b());
    }

    /* renamed from: g */
    public void mo45330g(String str) {
        mo45335n(str, 0);
    }

    /* renamed from: h */
    public void mo45331h() {
        synchronized (this.f49529d) {
            HashSet<String> hashSet = new HashSet<>();
            Iterator it = this.f49527b.iterator();
            while (it.hasNext()) {
                hashSet.add(((C17756f) it.next()).f49539a);
            }
            for (String g : hashSet) {
                mo45330g(g);
            }
        }
    }

    /* renamed from: i */
    public Task mo45332i(String str, boolean z, Runnable runnable) {
        return mo45334k(str, z, 0, runnable);
    }

    /* renamed from: j */
    public Task mo45333j(String str, boolean z, Callable callable) {
        return m61418l(str, z, 0, callable);
    }

    /* renamed from: k */
    public Task mo45334k(String str, boolean z, long j, Runnable runnable) {
        return m61418l(str, z, j, new C17750a(runnable));
    }

    /* renamed from: n */
    public void mo45335n(String str, int i) {
        synchronized (this.f49529d) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f49527b.iterator();
            while (it.hasNext()) {
                C17756f fVar = (C17756f) it.next();
                if (fVar.f49539a.equals(str)) {
                    arrayList.add(fVar);
                }
            }
            f49525e.mo42879g("trim: name=", str, "scheduled=", Integer.valueOf(arrayList.size()), "allowed=", Integer.valueOf(i));
            int max = Math.max(arrayList.size() - i, 0);
            if (max > 0) {
                Collections.reverse(arrayList);
                for (C17756f remove : arrayList.subList(0, max)) {
                    this.f49527b.remove(remove);
                }
            }
        }
    }
}
