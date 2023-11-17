package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p262t8.C8421a;

/* renamed from: androidx.concurrent.futures.c */
public abstract class C0612c {

    /* renamed from: androidx.concurrent.futures.c$a */
    public static final class C0613a {

        /* renamed from: a */
        Object f2476a;

        /* renamed from: b */
        C0616d f2477b;

        /* renamed from: c */
        private C0618d f2478c = C0618d.m2377x();

        /* renamed from: d */
        private boolean f2479d;

        C0613a() {
        }

        /* renamed from: c */
        private void m2368c() {
            this.f2476a = null;
            this.f2477b = null;
            this.f2478c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2830a() {
            this.f2476a = null;
            this.f2477b = null;
            this.f2478c.mo2818t((Object) null);
        }

        /* renamed from: b */
        public boolean mo2831b(Object obj) {
            boolean z = true;
            this.f2479d = true;
            C0616d dVar = this.f2477b;
            if (dVar == null || !dVar.mo2836a(obj)) {
                z = false;
            }
            if (z) {
                m2368c();
            }
            return z;
        }

        /* renamed from: d */
        public boolean mo2832d(Throwable th) {
            boolean z = true;
            this.f2479d = true;
            C0616d dVar = this.f2477b;
            if (dVar == null || !dVar.mo2837b(th)) {
                z = false;
            }
            if (z) {
                m2368c();
            }
            return z;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            C0618d dVar;
            C0616d dVar2 = this.f2477b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.mo2837b(new C0614b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2476a));
            }
            if (!this.f2479d && (dVar = this.f2478c) != null) {
                dVar.mo2818t((Object) null);
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.c$b */
    static final class C0614b extends Throwable {
        C0614b(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c */
    public interface C0615c {
        /* renamed from: a */
        Object mo2835a(C0613a aVar);
    }

    /* renamed from: androidx.concurrent.futures.c$d */
    private static final class C0616d implements C8421a {

        /* renamed from: d */
        final WeakReference f2480d;

        /* renamed from: e */
        private final C0601a f2481e = new C0617a();

        /* renamed from: androidx.concurrent.futures.c$d$a */
        class C0617a extends C0601a {
            C0617a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: q */
            public String mo2817q() {
                C0613a aVar = (C0613a) C0616d.this.f2480d.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f2476a + "]";
            }
        }

        C0616d(C0613a aVar) {
            this.f2480d = new WeakReference(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2836a(Object obj) {
            return this.f2481e.mo2818t(obj);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2837b(Throwable th) {
            return this.f2481e.mo2820u(th);
        }

        /* renamed from: c */
        public void mo2810c(Runnable runnable, Executor executor) {
            this.f2481e.mo2810c(runnable, executor);
        }

        public boolean cancel(boolean z) {
            C0613a aVar = (C0613a) this.f2480d.get();
            boolean cancel = this.f2481e.cancel(z);
            if (cancel && aVar != null) {
                aVar.mo2830a();
            }
            return cancel;
        }

        public Object get() {
            return this.f2481e.get();
        }

        public boolean isCancelled() {
            return this.f2481e.isCancelled();
        }

        public boolean isDone() {
            return this.f2481e.isDone();
        }

        public String toString() {
            return this.f2481e.toString();
        }

        public Object get(long j, TimeUnit timeUnit) {
            return this.f2481e.get(j, timeUnit);
        }
    }

    /* renamed from: a */
    public static C8421a m2367a(C0615c cVar) {
        C0613a aVar = new C0613a();
        C0616d dVar = new C0616d(aVar);
        aVar.f2477b = dVar;
        aVar.f2476a = cVar.getClass();
        try {
            Object a = cVar.mo2835a(aVar);
            if (a != null) {
                aVar.f2476a = a;
            }
        } catch (Exception e) {
            dVar.mo2837b(e);
        }
        return dVar;
    }
}
