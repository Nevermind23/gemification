package p068e9;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p027b9.C2175a;
import p027b9.C2184f;
import p159l9.C7026i;

/* renamed from: e9.q */
class C6101q implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final C6102a f18966a;

    /* renamed from: b */
    private final C7026i f18967b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f18968c;

    /* renamed from: d */
    private final C2175a f18969d;

    /* renamed from: e */
    private final AtomicBoolean f18970e = new AtomicBoolean(false);

    /* renamed from: e9.q$a */
    interface C6102a {
        /* renamed from: a */
        void mo19583a(C7026i iVar, Thread thread, Throwable th);
    }

    public C6101q(C6102a aVar, C7026i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C2175a aVar2) {
        this.f18966a = aVar;
        this.f18967b = iVar;
        this.f18968c = uncaughtExceptionHandler;
        this.f18969d = aVar2;
    }

    /* renamed from: b */
    private boolean m24400b(Thread thread, Throwable th) {
        if (thread == null) {
            C2184f.m8346f().mo7091d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            C2184f.m8346f().mo7091d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f18969d.mo7077b()) {
            return true;
        } else {
            C2184f.m8346f().mo7089b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo19634a() {
        return this.f18970e.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f18970e.set(true);
        try {
            if (m24400b(thread, th)) {
                this.f18966a.mo19583a(this.f18967b, thread, th);
            } else {
                C2184f.m8346f().mo7089b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e) {
            C2184f.m8346f().mo7092e("An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C2184f.m8346f().mo7089b("Completed exception processing. Invoking default exception handler.");
            this.f18968c.uncaughtException(thread, th);
            this.f18970e.set(false);
            throw th2;
        }
        C2184f.m8346f().mo7089b("Completed exception processing. Invoking default exception handler.");
        this.f18968c.uncaughtException(thread, th);
        this.f18970e.set(false);
    }
}
